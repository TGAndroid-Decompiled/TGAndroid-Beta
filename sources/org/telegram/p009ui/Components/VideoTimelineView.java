package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLog;
import org.telegram.p009ui.ActionBar.Theme;

public class VideoTimelineView extends View {
    private static final Object sync = new Object();
    private AsyncTask<Integer, Integer, Bitmap> currentTask;
    private VideoTimelineViewDelegate delegate;
    private int frameHeight;
    private long frameTimeOffset;
    private int frameWidth;
    private boolean framesLoaded;
    private int framesToLoad;
    private boolean isRoundFrames;
    private MediaMetadataRetriever mediaMetadataRetriever;
    private Paint paint;
    private Paint paint2;
    private float pressDx;
    private boolean pressedLeft;
    private boolean pressedRight;
    private float progressLeft;
    private Rect rect1;
    private Rect rect2;
    private Bitmap roundCornerBitmap;
    private int roundCornersSize;
    private TimeHintView timeHintView;
    private long videoLength;
    private float progressRight = 1.0f;
    private ArrayList<Bitmap> frames = new ArrayList<>();
    private float maxProgressDiff = 1.0f;
    private float minProgressDiff = 0.0f;
    private ArrayList<Bitmap> keyframes = new ArrayList<>();
    Paint thumbPaint = new Paint(1);
    Paint thumbRipplePaint = new Paint(1);
    private Paint backgroundGrayPaint = new Paint();

    public interface VideoTimelineViewDelegate {
        void didStartDragging();

        void didStopDragging();

        void onLeftProgressChanged(float f);

        void onRightProgressChanged(float f);
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        this.keyframes.clear();
        this.keyframes.addAll(arrayList);
    }

    public VideoTimelineView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-1);
        Paint paint2 = new Paint();
        this.paint2 = paint2;
        paint2.setColor(2130706432);
        this.thumbPaint.setColor(-1);
        this.thumbPaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        this.thumbPaint.setStyle(Paint.Style.STROKE);
        this.thumbPaint.setStrokeCap(Paint.Cap.ROUND);
        updateColors();
    }

    public void updateColors() {
        this.backgroundGrayPaint.setColor(Theme.getColor("windowBackgroundGray"));
        this.thumbRipplePaint.setColor(Theme.getColor("key_chat_recordedVoiceHighlight"));
        this.roundCornersSize = 0;
        TimeHintView timeHintView = this.timeHintView;
        if (timeHintView != null) {
            timeHintView.updateColors();
        }
    }

    public float getLeftProgress() {
        return this.progressLeft;
    }

    public float getRightProgress() {
        return this.progressRight;
    }

    public void setMinProgressDiff(float f) {
        this.minProgressDiff = f;
    }

    public void setMaxProgressDiff(float f) {
        this.maxProgressDiff = f;
        float f2 = this.progressRight;
        float f3 = this.progressLeft;
        if (f2 - f3 > f) {
            this.progressRight = f3 + f;
            invalidate();
        }
    }

    public void setRoundFrames(boolean z) {
        this.isRoundFrames = z;
        if (z) {
            this.rect1 = new Rect(AndroidUtilities.m34dp(14.0f), AndroidUtilities.m34dp(14.0f), AndroidUtilities.m34dp(42.0f), AndroidUtilities.m34dp(42.0f));
            this.rect2 = new Rect();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.m34dp(24.0f);
        float f = measuredWidth;
        int dp = ((int) (this.progressLeft * f)) + AndroidUtilities.m34dp(12.0f);
        int dp2 = ((int) (this.progressRight * f)) + AndroidUtilities.m34dp(12.0f);
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.mediaMetadataRetriever == null) {
                return false;
            }
            int dp3 = AndroidUtilities.m34dp(24.0f);
            if (dp - dp3 <= x && x <= dp + dp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                VideoTimelineViewDelegate videoTimelineViewDelegate = this.delegate;
                if (videoTimelineViewDelegate != null) {
                    videoTimelineViewDelegate.didStartDragging();
                }
                this.pressedLeft = true;
                this.pressDx = (int) (x - dp);
                this.timeHintView.setTime((int) ((((float) this.videoLength) / 1000.0f) * this.progressLeft));
                this.timeHintView.setCx(dp + getLeft() + AndroidUtilities.m34dp(4.0f));
                this.timeHintView.show(true);
                invalidate();
                return true;
            } else if (dp2 - dp3 > x || x > dp3 + dp2 || y < 0.0f || y > getMeasuredHeight()) {
                this.timeHintView.show(false);
            } else {
                VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
                if (videoTimelineViewDelegate2 != null) {
                    videoTimelineViewDelegate2.didStartDragging();
                }
                this.pressedRight = true;
                this.pressDx = (int) (x - dp2);
                this.timeHintView.setTime((int) ((((float) this.videoLength) / 1000.0f) * this.progressRight));
                this.timeHintView.setCx((dp2 + getLeft()) - AndroidUtilities.m34dp(4.0f));
                this.timeHintView.show(true);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.pressedLeft) {
                VideoTimelineViewDelegate videoTimelineViewDelegate3 = this.delegate;
                if (videoTimelineViewDelegate3 != null) {
                    videoTimelineViewDelegate3.didStopDragging();
                }
                this.pressedLeft = false;
                invalidate();
                this.timeHintView.show(false);
                return true;
            } else if (this.pressedRight) {
                VideoTimelineViewDelegate videoTimelineViewDelegate4 = this.delegate;
                if (videoTimelineViewDelegate4 != null) {
                    videoTimelineViewDelegate4.didStopDragging();
                }
                this.pressedRight = false;
                invalidate();
                this.timeHintView.show(false);
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.pressedLeft) {
                int i = (int) (x - this.pressDx);
                if (i < AndroidUtilities.m34dp(16.0f)) {
                    dp2 = AndroidUtilities.m34dp(16.0f);
                } else if (i <= dp2) {
                    dp2 = i;
                }
                float dp4 = (dp2 - AndroidUtilities.m34dp(16.0f)) / f;
                this.progressLeft = dp4;
                float f2 = this.progressRight;
                float f3 = this.maxProgressDiff;
                if (f2 - dp4 > f3) {
                    this.progressRight = dp4 + f3;
                } else {
                    float f4 = this.minProgressDiff;
                    if (f4 != 0.0f && f2 - dp4 < f4) {
                        float f5 = f2 - f4;
                        this.progressLeft = f5;
                        if (f5 < 0.0f) {
                            this.progressLeft = 0.0f;
                        }
                    }
                }
                this.timeHintView.setCx((((f * this.progressLeft) + AndroidUtilities.dpf2(12.0f)) + getLeft()) - AndroidUtilities.m34dp(4.0f));
                this.timeHintView.setTime((int) ((((float) this.videoLength) / 1000.0f) * this.progressLeft));
                this.timeHintView.show(true);
                VideoTimelineViewDelegate videoTimelineViewDelegate5 = this.delegate;
                if (videoTimelineViewDelegate5 != null) {
                    videoTimelineViewDelegate5.onLeftProgressChanged(this.progressLeft);
                }
                invalidate();
                return true;
            } else if (this.pressedRight) {
                int i2 = (int) (x - this.pressDx);
                if (i2 >= dp) {
                    dp = i2 > AndroidUtilities.m34dp(16.0f) + measuredWidth ? measuredWidth + AndroidUtilities.m34dp(16.0f) : i2;
                }
                float dp5 = (dp - AndroidUtilities.m34dp(16.0f)) / f;
                this.progressRight = dp5;
                float f6 = this.progressLeft;
                float f7 = this.maxProgressDiff;
                if (dp5 - f6 > f7) {
                    this.progressLeft = dp5 - f7;
                } else {
                    float f8 = this.minProgressDiff;
                    if (f8 != 0.0f && dp5 - f6 < f8) {
                        float f9 = f6 + f8;
                        this.progressRight = f9;
                        if (f9 > 1.0f) {
                            this.progressRight = 1.0f;
                        }
                    }
                }
                this.timeHintView.setCx((f * this.progressRight) + AndroidUtilities.dpf2(12.0f) + getLeft() + AndroidUtilities.m34dp(4.0f));
                this.timeHintView.show(true);
                this.timeHintView.setTime((int) ((((float) this.videoLength) / 1000.0f) * this.progressRight));
                VideoTimelineViewDelegate videoTimelineViewDelegate6 = this.delegate;
                if (videoTimelineViewDelegate6 != null) {
                    videoTimelineViewDelegate6.onRightProgressChanged(this.progressRight);
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setColor(int i) {
        this.paint.setColor(i);
        invalidate();
    }

    public void setVideoPath(String str) {
        destroy();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.progressLeft = 0.0f;
        this.progressRight = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.videoLength = Long.parseLong(this.mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        invalidate();
    }

    public void setDelegate(VideoTimelineViewDelegate videoTimelineViewDelegate) {
        this.delegate = videoTimelineViewDelegate;
    }

    public void reloadFrames(int i) {
        if (this.mediaMetadataRetriever != null) {
            if (i == 0) {
                if (this.isRoundFrames) {
                    int dp = AndroidUtilities.m34dp(56.0f);
                    this.frameWidth = dp;
                    this.frameHeight = dp;
                    this.framesToLoad = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.m34dp(16.0f)) / (this.frameHeight / 2.0f)));
                } else {
                    this.frameHeight = AndroidUtilities.m34dp(40.0f);
                    this.framesToLoad = Math.max(1, (getMeasuredWidth() - AndroidUtilities.m34dp(16.0f)) / this.frameHeight);
                    this.frameWidth = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.m34dp(16.0f)) / this.framesToLoad);
                }
                this.frameTimeOffset = this.videoLength / this.framesToLoad;
                if (!this.keyframes.isEmpty()) {
                    float size = this.keyframes.size() / this.framesToLoad;
                    float f = 0.0f;
                    for (int i2 = 0; i2 < this.framesToLoad; i2++) {
                        this.frames.add(this.keyframes.get((int) f));
                        f += size;
                    }
                    return;
                }
            }
            this.framesLoaded = false;
            AsyncTask<Integer, Integer, Bitmap> asyncTask = new AsyncTask<Integer, Integer, Bitmap>() {
                private int frameNum = 0;

                public Bitmap doInBackground(Integer... numArr) {
                    Exception e;
                    Bitmap frameAtTime;
                    this.frameNum = numArr[0].intValue();
                    Bitmap bitmap = null;
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        frameAtTime = VideoTimelineView.this.mediaMetadataRetriever.getFrameAtTime(VideoTimelineView.this.frameTimeOffset * this.frameNum * 1000, 2);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        if (isCancelled()) {
                            return null;
                        }
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(VideoTimelineView.this.frameWidth, VideoTimelineView.this.frameHeight, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(VideoTimelineView.this.frameWidth / frameAtTime.getWidth(), VideoTimelineView.this.frameHeight / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((VideoTimelineView.this.frameWidth - width) / 2, (VideoTimelineView.this.frameHeight - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    } catch (Exception e3) {
                        e = e3;
                        bitmap = frameAtTime;
                        FileLog.m30e(e);
                        return bitmap;
                    }
                }

                public void onPostExecute(Bitmap bitmap) {
                    if (!isCancelled()) {
                        VideoTimelineView.this.frames.add(bitmap);
                        VideoTimelineView.this.invalidate();
                        if (this.frameNum < VideoTimelineView.this.framesToLoad) {
                            VideoTimelineView.this.reloadFrames(this.frameNum + 1);
                        } else {
                            VideoTimelineView.this.framesLoaded = true;
                        }
                    }
                }
            };
            this.currentTask = asyncTask;
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
        }
    }

    public void destroy() {
        synchronized (sync) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.mediaMetadataRetriever;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.mediaMetadataRetriever = null;
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
        int i = 0;
        if (!this.keyframes.isEmpty()) {
            while (i < this.keyframes.size()) {
                Bitmap bitmap = this.keyframes.get(i);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i++;
            }
        } else {
            while (i < this.frames.size()) {
                Bitmap bitmap2 = this.frames.get(i);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                i++;
            }
        }
        this.keyframes.clear();
        this.frames.clear();
        AsyncTask<Integer, Integer, Bitmap> asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
    }

    public void clearFrames() {
        if (this.keyframes.isEmpty()) {
            for (int i = 0; i < this.frames.size(); i++) {
                Bitmap bitmap = this.frames.get(i);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        this.frames.clear();
        AsyncTask<Integer, Integer, Bitmap> asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.m34dp(24.0f);
        int dp = ((int) (this.progressLeft * measuredWidth)) + AndroidUtilities.m34dp(12.0f);
        int dp2 = ((int) (measuredWidth * this.progressRight)) + AndroidUtilities.m34dp(12.0f);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.m34dp(32.0f)) >> 1;
        if (this.frames.isEmpty() && this.currentTask == null) {
            reloadFrames(0);
        }
        if (!this.frames.isEmpty()) {
            if (!this.framesLoaded) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.backgroundGrayPaint);
            }
            int i = 0;
            for (int i2 = 0; i2 < this.frames.size(); i2++) {
                Bitmap bitmap = this.frames.get(i2);
                if (bitmap != null) {
                    boolean z = this.isRoundFrames;
                    int i3 = this.frameWidth;
                    if (z) {
                        i3 /= 2;
                    }
                    int i4 = i3 * i;
                    if (z) {
                        this.rect2.set(i4, measuredHeight, AndroidUtilities.m34dp(28.0f) + i4, AndroidUtilities.m34dp(32.0f) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.rect1, this.rect2, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i4, measuredHeight, (Paint) null);
                    }
                }
                i++;
            }
            float f = measuredHeight;
            canvas.drawRect(0.0f, f, dp, getMeasuredHeight() - measuredHeight, this.paint2);
            canvas.drawRect(dp2, f, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.paint2);
            canvas.drawLine(dp - AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(10.0f) + measuredHeight, dp - AndroidUtilities.m34dp(4.0f), (getMeasuredHeight() - AndroidUtilities.m34dp(10.0f)) - measuredHeight, this.thumbPaint);
            canvas.drawLine(AndroidUtilities.m34dp(4.0f) + dp2, AndroidUtilities.m34dp(10.0f) + measuredHeight, dp2 + AndroidUtilities.m34dp(4.0f), (getMeasuredHeight() - AndroidUtilities.m34dp(10.0f)) - measuredHeight, this.thumbPaint);
            drawCorners(canvas, getMeasuredHeight() - (measuredHeight * 2), getMeasuredWidth(), 0, measuredHeight);
        }
    }

    private void drawCorners(Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (AndroidUtilities.m34dp(6.0f) != this.roundCornersSize) {
            this.roundCornersSize = AndroidUtilities.m34dp(6.0f);
            this.roundCornerBitmap = Bitmap.createBitmap(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.roundCornerBitmap);
            Paint paint = new Paint(1);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawColor(Theme.getColor("chat_messagePanelBackground"));
            int i7 = this.roundCornersSize;
            canvas2.drawCircle(i7, i7, i7, paint);
        }
        int i8 = this.roundCornersSize >> 1;
        canvas.save();
        float f = i3;
        float f2 = i4;
        canvas.drawBitmap(this.roundCornerBitmap, f, f2, (Paint) null);
        float f3 = (i + i4) - i8;
        canvas.rotate(-90.0f, i3 + i8, f3);
        canvas.drawBitmap(this.roundCornerBitmap, f, i5 - this.roundCornersSize, (Paint) null);
        canvas.restore();
        canvas.save();
        float f4 = (i3 + i2) - i8;
        canvas.rotate(180.0f, f4, f3);
        Bitmap bitmap = this.roundCornerBitmap;
        int i9 = this.roundCornersSize;
        canvas.drawBitmap(bitmap, i6 - i9, i5 - i9, (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, f4, i4 + i8);
        canvas.drawBitmap(this.roundCornerBitmap, i6 - this.roundCornersSize, f2, (Paint) null);
        canvas.restore();
    }

    public void setTimeHintView(TimeHintView timeHintView) {
        this.timeHintView = timeHintView;
    }

    public static class TimeHintView extends View {
        private float f1102cx;
        private float scale;
        private boolean show;
        private Drawable tooltipBackgroundArrow;
        private StaticLayout tooltipLayout;
        private TextPaint tooltipPaint;
        private long lastTime = -1;
        private Drawable tooltipBackground = Theme.createRoundRectDrawable(AndroidUtilities.m34dp(5.0f), Theme.getColor("chat_gifSaveHintBackground"));

        public TimeHintView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.tooltipPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.m34dp(14.0f));
            this.tooltipBackgroundArrow = ContextCompat.getDrawable(context, C0952R.C0953drawable.tooltip_arrow);
            updateColors();
            setTime(0);
        }

        public void setTime(int i) {
            long j = i;
            if (j != this.lastTime) {
                this.lastTime = j;
                String formatShortDuration = AndroidUtilities.formatShortDuration(i);
                TextPaint textPaint = this.tooltipPaint;
                this.tooltipLayout = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.tooltipLayout.getHeight() + AndroidUtilities.m34dp(4.0f) + this.tooltipBackgroundArrow.getIntrinsicHeight(), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.tooltipLayout != null) {
                if (this.show) {
                    float f = this.scale;
                    if (f != 1.0f) {
                        float f2 = f + 0.12f;
                        this.scale = f2;
                        if (f2 > 1.0f) {
                            this.scale = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f3 = this.scale;
                    if (f3 != 0.0f) {
                        float f4 = f3 - 0.12f;
                        this.scale = f4;
                        if (f4 < 0.0f) {
                            this.scale = 0.0f;
                        }
                        invalidate();
                    }
                    if (this.scale == 0.0f) {
                        return;
                    }
                }
                float f5 = this.scale;
                int i = (int) ((f5 > 0.5f ? 1.0f : f5 / 0.5f) * 255.0f);
                canvas.save();
                float f6 = this.scale;
                canvas.scale(f6, f6, this.f1102cx, getMeasuredHeight());
                canvas.translate(this.f1102cx - (this.tooltipLayout.getWidth() / 2.0f), 0.0f);
                this.tooltipBackground.setBounds(-AndroidUtilities.m34dp(8.0f), 0, this.tooltipLayout.getWidth() + AndroidUtilities.m34dp(8.0f), (int) (this.tooltipLayout.getHeight() + AndroidUtilities.dpf2(4.0f)));
                this.tooltipBackgroundArrow.setBounds((this.tooltipLayout.getWidth() / 2) - (this.tooltipBackgroundArrow.getIntrinsicWidth() / 2), (int) (this.tooltipLayout.getHeight() + AndroidUtilities.dpf2(4.0f)), (this.tooltipLayout.getWidth() / 2) + (this.tooltipBackgroundArrow.getIntrinsicWidth() / 2), ((int) (this.tooltipLayout.getHeight() + AndroidUtilities.dpf2(4.0f))) + this.tooltipBackgroundArrow.getIntrinsicHeight());
                this.tooltipBackgroundArrow.setAlpha(i);
                this.tooltipBackground.setAlpha(i);
                this.tooltipPaint.setAlpha(i);
                this.tooltipBackgroundArrow.draw(canvas);
                this.tooltipBackground.draw(canvas);
                canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
                this.tooltipLayout.draw(canvas);
                canvas.restore();
            }
        }

        public void updateColors() {
            this.tooltipPaint.setColor(Theme.getColor("chat_gifSaveHintText"));
            this.tooltipBackground = Theme.createRoundRectDrawable(AndroidUtilities.m34dp(5.0f), Theme.getColor("chat_gifSaveHintBackground"));
            this.tooltipBackgroundArrow.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_gifSaveHintBackground"), PorterDuff.Mode.MULTIPLY));
        }

        public void setCx(float f) {
            this.f1102cx = f;
            invalidate();
        }

        public void show(boolean z) {
            this.show = z;
            invalidate();
        }
    }
}
