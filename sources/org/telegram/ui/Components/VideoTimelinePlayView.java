package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public abstract class VideoTimelinePlayView extends View {
    public static int TYPE_LEFT = 0;
    public static int TYPE_PROGRESS = 2;
    public static int TYPE_RIGHT = 1;
    private static final Object sync = new Object();
    Paint bitmapPaint;
    private Path clipPath;
    private int currentMode;
    private AsyncTask currentTask;
    private final Paint cutPaint;
    private VideoTimelineViewDelegate delegate;
    private final Paint dimPaint;
    private ArrayList exclusionRects;
    private android.graphics.Rect exclustionRect;
    private int frameHeight;
    private long frameTimeOffset;
    private int frameWidth;
    private ArrayList frames;
    private int framesToLoad;
    private final Paint handlePaint;
    private boolean hasBlur;
    private int lastWidth;
    private final AnimatedFloat loopProgress;
    private float maxProgressDiff;
    private MediaMetadataRetriever mediaMetadataRetriever;
    private float minProgressDiff;
    private float playProgress;
    private float pressDx;
    private boolean pressedLeft;
    private boolean pressedPlay;
    private boolean pressedRight;
    private float progressLeft;
    private float progressRight;
    private RectF rect3;
    private final Paint shadowPaint;
    private int videoHeight;
    private long videoLength;
    private int videoWidth;
    private final Paint whitePaint;

    public static class BitmapFrame {
        float alpha;
        Bitmap bitmap;

        public BitmapFrame(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }

    public interface VideoTimelineViewDelegate {
        void didStartDragging(int i);

        void didStopDragging(int i);

        void onLeftProgressChanged(float f);

        void onPlayProgressChanged(float f);

        void onRightProgressChanged(float f);
    }

    public VideoTimelinePlayView(Context context) {
        super(context);
        this.progressRight = 1.0f;
        this.playProgress = 0.5f;
        this.frames = new ArrayList();
        this.maxProgressDiff = 1.0f;
        this.minProgressDiff = 0.0f;
        this.rect3 = new RectF();
        this.currentMode = 0;
        this.bitmapPaint = new Paint(3);
        this.exclusionRects = new ArrayList();
        this.exclustionRect = new android.graphics.Rect();
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.shadowPaint = paint2;
        Paint paint3 = new Paint(1);
        this.dimPaint = paint3;
        Paint paint4 = new Paint(1);
        this.cutPaint = paint4;
        Paint paint5 = new Paint(1);
        this.handlePaint = paint5;
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 200L, CubicBezierInterpolator.EASE_BOTH);
        this.clipPath = new Path();
        paint.setColor(-1);
        paint2.setColor(637534208);
        paint3.setColor(1291845632);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint5.setColor(-16777216);
        this.exclusionRects.add(this.exclustionRect);
    }

    private void drawProgress(Canvas canvas, float f, float f2) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(46.0f) + dp;
        float f3 = ((dp2 - dp) / 2.0f) * (1.0f - f2);
        float f4 = dp + f3;
        float f5 = dp2 - f3;
        this.shadowPaint.setAlpha((int) (38.0f * f2));
        this.whitePaint.setAlpha((int) (f2 * 255.0f));
        float dp3 = dpf2 + AndroidUtilities.dp(10.0f) + (((getMeasuredWidth() - (dpf2 * 2.0f)) - AndroidUtilities.dp(20.0f)) * f);
        this.rect3.set(dp3 - AndroidUtilities.dpf2(1.5f), f4, AndroidUtilities.dpf2(1.5f) + dp3, f5);
        this.rect3.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.shadowPaint);
        this.rect3.set(dp3 - AndroidUtilities.dpf2(1.5f), f4, dp3 + AndroidUtilities.dpf2(1.5f), f5);
        canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.whitePaint);
    }

    public void reloadFrames(int i) {
        int i2;
        if (this.mediaMetadataRetriever == null) {
            return;
        }
        if (i == 0) {
            this.frameHeight = AndroidUtilities.dp(38.0f);
            this.framesToLoad = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.frameHeight * Utilities.clamp((this.videoWidth == 0 || (i2 = this.videoHeight) == 0) ? 1.0f : r2 / i2, 1.3333334f, 0.5625f))));
            this.frameWidth = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.framesToLoad);
            this.frameTimeOffset = this.videoLength / this.framesToLoad;
        }
        AsyncTask asyncTask = new AsyncTask() {
            private int frameNum = 0;
            private final Paint paint = new Paint(3);

            @Override
            public Bitmap doInBackground(Integer... numArr) {
                Bitmap frameAtTime;
                this.frameNum = numArr[0].intValue();
                Bitmap bitmap = null;
                if (isCancelled()) {
                    return null;
                }
                try {
                    frameAtTime = VideoTimelinePlayView.this.mediaMetadataRetriever.getFrameAtTime(VideoTimelinePlayView.this.frameTimeOffset * this.frameNum * 1000, 2);
                } catch (Exception e) {
                    e = e;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    bitmap = frameAtTime;
                    FileLog.e(e);
                    return bitmap;
                }
                if (isCancelled()) {
                    return null;
                }
                if (frameAtTime == null) {
                    return frameAtTime;
                }
                bitmap = Bitmap.createBitmap(VideoTimelinePlayView.this.frameWidth, VideoTimelinePlayView.this.frameHeight, frameAtTime.getConfig());
                Canvas canvas = new Canvas(bitmap);
                float max = Math.max(VideoTimelinePlayView.this.frameWidth / frameAtTime.getWidth(), VideoTimelinePlayView.this.frameHeight / frameAtTime.getHeight());
                int width = (int) (frameAtTime.getWidth() * max);
                int height = (int) (frameAtTime.getHeight() * max);
                canvas.drawBitmap(frameAtTime, new android.graphics.Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new android.graphics.Rect((VideoTimelinePlayView.this.frameWidth - width) / 2, (VideoTimelinePlayView.this.frameHeight - height) / 2, (VideoTimelinePlayView.this.frameWidth + width) / 2, (VideoTimelinePlayView.this.frameHeight + height) / 2), this.paint);
                frameAtTime.recycle();
                return bitmap;
            }

            @Override
            public void onPostExecute(Bitmap bitmap) {
                if (isCancelled()) {
                    return;
                }
                VideoTimelinePlayView.this.frames.add(new BitmapFrame(bitmap));
                VideoTimelinePlayView.this.invalidate();
                if (this.frameNum < VideoTimelinePlayView.this.framesToLoad) {
                    VideoTimelinePlayView.this.reloadFrames(this.frameNum + 1);
                }
            }
        };
        this.currentTask = asyncTask;
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
    }

    public void clearFrames() {
        Bitmap bitmap;
        for (int i = 0; i < this.frames.size(); i++) {
            BitmapFrame bitmapFrame = (BitmapFrame) this.frames.get(i);
            if (bitmapFrame != null && (bitmap = bitmapFrame.bitmap) != null) {
                bitmap.recycle();
            }
        }
        this.frames.clear();
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
        invalidate();
    }

    protected abstract boolean customBlur();

    public void destroy() {
        Bitmap bitmap;
        synchronized (sync) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.mediaMetadataRetriever;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.mediaMetadataRetriever = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i = 0; i < this.frames.size(); i++) {
            BitmapFrame bitmapFrame = (BitmapFrame) this.frames.get(i);
            if (bitmapFrame != null && (bitmap = bitmapFrame.bitmap) != null) {
                bitmap.recycle();
            }
        }
        this.frames.clear();
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
    }

    protected abstract void drawBlur(Canvas canvas, RectF rectF);

    public float getLeftProgress() {
        return this.progressLeft;
    }

    public long getLength() {
        return Math.max(1L, this.videoLength);
    }

    public float getProgress() {
        return this.playProgress;
    }

    public float getRightProgress() {
        return this.progressRight;
    }

    public void invalidateBlur() {
        if (customBlur() && this.hasBlur) {
            invalidate();
        }
    }

    public boolean isDragging() {
        return this.pressedPlay;
    }

    @Override
    protected void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.VideoTimelinePlayView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.exclustionRect.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.lastWidth != size) {
            clearFrames();
            this.lastWidth = size;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.VideoTimelinePlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(VideoTimelineViewDelegate videoTimelineViewDelegate) {
        this.delegate = videoTimelineViewDelegate;
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

    public void setMinProgressDiff(float f) {
        this.minProgressDiff = f;
    }

    public void setMode(int i) {
        if (this.currentMode == i) {
            return;
        }
        this.currentMode = i;
        invalidate();
    }

    public void setProgress(float f) {
        long j = this.videoLength;
        float f2 = j == 0 ? 0.0f : 240.0f / ((float) j);
        float f3 = this.playProgress;
        if (f < f3 && f <= this.progressLeft + f2 && f3 + f2 >= this.progressRight) {
            this.loopProgress.set(1.0f, true);
        }
        this.playProgress = f;
        invalidate();
    }

    public void setRightProgress(float f) {
        this.progressRight = f;
        VideoTimelineViewDelegate videoTimelineViewDelegate = this.delegate;
        if (videoTimelineViewDelegate != null) {
            videoTimelineViewDelegate.didStartDragging(TYPE_RIGHT);
        }
        VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
        if (videoTimelineViewDelegate2 != null) {
            videoTimelineViewDelegate2.onRightProgressChanged(this.progressRight);
        }
        VideoTimelineViewDelegate videoTimelineViewDelegate3 = this.delegate;
        if (videoTimelineViewDelegate3 != null) {
            videoTimelineViewDelegate3.didStopDragging(TYPE_RIGHT);
        }
        invalidate();
    }

    public void setVideoPath(String str, float f, float f2) {
        int parseInt;
        destroy();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.progressLeft = f;
        this.progressRight = f2;
        float f3 = this.playProgress;
        if (f3 < f) {
            this.playProgress = f;
        } else if (f3 > f2) {
            this.playProgress = f2;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = this.mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                this.videoLength = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = this.mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata2 != null) {
                this.videoWidth = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = this.mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata3 != null) {
                this.videoHeight = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = this.mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i = this.videoWidth;
                this.videoWidth = this.videoHeight;
                this.videoHeight = i;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }
}
