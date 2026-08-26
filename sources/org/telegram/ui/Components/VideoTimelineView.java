package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.Theme;

public final class VideoTimelineView extends View {
    public static final Object sync = new Object();
    public final Paint backgroundGrayPaint;
    public AnonymousClass1 currentTask;
    public VideoTimelineViewDelegate delegate;
    public int frameHeight;
    public long frameTimeOffset;
    public int frameWidth;
    public final ArrayList frames;
    public boolean framesLoaded;
    public int framesToLoad;
    public boolean isRoundFrames;
    public final ArrayList keyframes;
    public float maxProgressDiff;
    public MediaMetadataRetriever mediaMetadataRetriever;
    public float minProgressDiff;
    public final Paint paint2;
    public Path path;
    public float pressDx;
    public boolean pressedLeft;
    public boolean pressedRight;
    public float progressLeft;
    public float progressRight;
    public Rect rect1;
    public Rect rect2;
    public Bitmap roundCornerBitmap;
    public int roundCornersSize;
    public final Paint thumbPaint;
    public TimeHintView timeHintView;
    public boolean useClip;
    public long videoLength;

    public final class TimeHintView extends View {
        public float cx;
        public long lastTime;
        public float scale;
        public boolean show;
        public ShapeDrawable tooltipBackground;
        public final Drawable tooltipBackgroundArrow;
        public StaticLayout tooltipLayout;
        public final TextPaint tooltipPaint;

        public TimeHintView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.tooltipPaint = textPaint;
            this.lastTime = -1L;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.tooltipBackgroundArrow = context.getDrawable(R.drawable.tooltip_arrow);
            this.tooltipBackground = Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), Theme.getColor(null, Theme.key_chat_gifSaveHintBackground, false));
            updateColors();
            setTime(0);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.tooltipLayout == null) {
                return;
            }
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
            canvas.scale(f6, f6, this.cx, getMeasuredHeight());
            canvas.translate(this.cx - (this.tooltipLayout.getWidth() / 2.0f), 0.0f);
            this.tooltipBackground.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.tooltipLayout.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.tooltipLayout.getHeight()));
            int width = this.tooltipLayout.getWidth() / 2;
            Drawable drawable = this.tooltipBackgroundArrow;
            drawable.setBounds(zzle.m(width, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.tooltipLayout.getHeight()), (drawable.getIntrinsicWidth() / 2) + (this.tooltipLayout.getWidth() / 2), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.tooltipLayout.getHeight())));
            drawable.setAlpha(i);
            this.tooltipBackground.setAlpha(i);
            this.tooltipPaint.setAlpha(i);
            drawable.draw(canvas);
            this.tooltipBackground.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.tooltipLayout.draw(canvas);
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.tooltipBackgroundArrow.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.tooltipLayout.getHeight(), 1073741824));
        }

        public void setCx(float f) {
            this.cx = f;
            invalidate();
        }

        public void setTime(int i) {
            long j = i;
            if (j != this.lastTime) {
                this.lastTime = j;
                String shortDuration = AndroidUtilities.formatShortDuration(i);
                TextPaint textPaint = this.tooltipPaint;
                this.tooltipLayout = new StaticLayout(shortDuration, textPaint, (int) textPaint.measureText(shortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }

        public final void updateColors() {
            this.tooltipPaint.setColor(Theme.getColor(null, Theme.key_chat_gifSaveHintText, false));
            int iDp = AndroidUtilities.dp(5.0f);
            int i = Theme.key_chat_gifSaveHintBackground;
            this.tooltipBackground = Theme.createRoundRectDrawable(iDp, Theme.getColor(null, i, false));
            this.tooltipBackgroundArrow.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        }
    }

    public interface VideoTimelineViewDelegate {
    }

    public VideoTimelineView(Context context) {
        super(context);
        this.progressRight = 1.0f;
        Paint paint = new Paint();
        this.paint2 = paint;
        Paint paint2 = new Paint();
        this.backgroundGrayPaint = paint2;
        this.frames = new ArrayList();
        this.maxProgressDiff = 1.0f;
        this.minProgressDiff = 0.0f;
        this.keyframes = new ArrayList();
        Paint paint3 = new Paint(1);
        this.thumbPaint = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.roundCornersSize = 0;
        TimeHintView timeHintView = this.timeHintView;
        if (timeHintView != null) {
            timeHintView.updateColors();
        }
    }

    public final void destroy(boolean z) {
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
        if (z) {
            int i = 0;
            if (this.keyframes.isEmpty()) {
                while (i < this.frames.size()) {
                    Bitmap bitmap = (Bitmap) this.frames.get(i);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i++;
                }
            } else {
                while (i < this.keyframes.size()) {
                    Bitmap bitmap2 = (Bitmap) this.keyframes.get(i);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i++;
                }
            }
        }
        this.keyframes.clear();
        this.frames.clear();
        AnonymousClass1 anonymousClass1 = this.currentTask;
        if (anonymousClass1 != null) {
            anonymousClass1.cancel(true);
            this.currentTask = null;
        }
    }

    public float getLeftProgress() {
        return this.progressLeft;
    }

    public float getRightProgress() {
        return this.progressRight;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.useClip) {
            canvas.save();
            Path path = this.path;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int iDp = AndroidUtilities.dp(12.0f) + ((int) (this.progressLeft * measuredWidth));
        int iDp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.progressRight));
        float f = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.frames;
        if (arrayList.isEmpty() && this.currentTask == null) {
            reloadFrames(0);
        }
        if (arrayList.isEmpty()) {
            if (this.useClip) {
                canvas.restore();
                return;
            }
            return;
        }
        if (!this.framesLoaded) {
            canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.backgroundGrayPaint);
        }
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bitmap bitmap = (Bitmap) arrayList.get(i);
            if (bitmap != null && !bitmap.isRecycled()) {
                boolean z = this.isRoundFrames;
                int i3 = this.frameWidth;
                if (z) {
                    i3 /= 2;
                }
                int i4 = i3 * i2;
                if (z) {
                    this.rect2.set(i4, measuredHeight, AndroidUtilities.dp(28.0f) + i4, AndroidUtilities.dp(f) + measuredHeight);
                    canvas.drawBitmap(bitmap, this.rect1, this.rect2, (Paint) null);
                } else {
                    canvas.drawBitmap(bitmap, i4, measuredHeight, (Paint) null);
                }
            }
            i2++;
            i++;
            f = 32.0f;
        }
        float f2 = measuredHeight;
        float measuredHeight2 = getMeasuredHeight() - measuredHeight;
        Paint paint = this.paint2;
        canvas.drawRect(0.0f, f2, iDp, measuredHeight2, paint);
        canvas.drawRect(iDp2, f2, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
        float fDp = iDp - AndroidUtilities.dp(4.0f);
        float fDp2 = AndroidUtilities.dp(10.0f) + measuredHeight;
        float fDp3 = iDp - AndroidUtilities.dp(4.0f);
        float fM = RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredHeight(), 10.0f, measuredHeight);
        Paint paint2 = this.thumbPaint;
        canvas.drawLine(fDp, fDp2, fDp3, fM, paint2);
        canvas.drawLine(AndroidUtilities.dp(4.0f) + iDp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + iDp2, RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredHeight(), 10.0f, measuredHeight), paint2);
        if (this.useClip) {
            canvas.restore();
            return;
        }
        int measuredHeight3 = getMeasuredHeight() - (measuredHeight * 2);
        int measuredWidth2 = getMeasuredWidth();
        if (AndroidUtilities.dp(6.0f) != this.roundCornersSize) {
            this.roundCornersSize = AndroidUtilities.dp(6.0f);
            this.roundCornerBitmap = Bitmap.createBitmap(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.roundCornerBitmap);
            Paint paint3 = new Paint(1);
            paint3.setColor(0);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawColor(Theme.getColor(null, Theme.key_chat_messagePanelBackground, false));
            float f3 = this.roundCornersSize;
            canvas2.drawCircle(f3, f3, f3, paint3);
        }
        int i5 = this.roundCornersSize >> 1;
        canvas.save();
        float f4 = 0;
        canvas.drawBitmap(this.roundCornerBitmap, f4, f2, (Paint) null);
        int i6 = measuredHeight3 + measuredHeight;
        float f5 = i6 - i5;
        canvas.rotate(-90.0f, i5, f5);
        canvas.drawBitmap(this.roundCornerBitmap, f4, i6 - this.roundCornersSize, (Paint) null);
        canvas.restore();
        canvas.save();
        float f6 = measuredWidth2 - i5;
        canvas.rotate(180.0f, f6, f5);
        Bitmap bitmap2 = this.roundCornerBitmap;
        int i7 = this.roundCornersSize;
        canvas.drawBitmap(bitmap2, measuredWidth2 - i7, i6 - i7, (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, f6, measuredHeight + i5);
        canvas.drawBitmap(this.roundCornerBitmap, measuredWidth2 - this.roundCornersSize, f2, (Paint) null);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.useClip) {
            if (this.path == null) {
                this.path = new Path();
            }
            this.path.rewind();
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.path.addRoundRect(rectF, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f = measuredWidth;
            int iDp = AndroidUtilities.dp(12.0f) + ((int) (this.progressLeft * f));
            int iDp2 = AndroidUtilities.dp(12.0f) + ((int) (this.progressRight * f));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.mediaMetadataRetriever != null) {
                    int iDp3 = AndroidUtilities.dp(24.0f);
                    if (iDp - iDp3 <= x && x <= iDp + iDp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        VideoTimelineViewDelegate videoTimelineViewDelegate = this.delegate;
                        if (videoTimelineViewDelegate != null) {
                            ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(0.0f, 1);
                        }
                        this.pressedLeft = true;
                        this.pressDx = (int) (x - iDp);
                        this.timeHintView.setTime((int) ((this.videoLength / 1000.0f) * this.progressLeft));
                        this.timeHintView.setCx(AndroidUtilities.dp(4.0f) + getLeft() + iDp);
                        TimeHintView timeHintView = this.timeHintView;
                        timeHintView.show = true;
                        timeHintView.invalidate();
                        invalidate();
                        return true;
                    }
                    if (iDp2 - iDp3 > x || x > iDp3 + iDp2 || y < 0.0f || y > getMeasuredHeight()) {
                        TimeHintView timeHintView2 = this.timeHintView;
                        timeHintView2.show = false;
                        timeHintView2.invalidate();
                        return false;
                    }
                    VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
                    if (videoTimelineViewDelegate2 != null) {
                        ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(0.0f, 1);
                    }
                    this.pressedRight = true;
                    this.pressDx = (int) (x - iDp2);
                    this.timeHintView.setTime((int) ((this.videoLength / 1000.0f) * this.progressRight));
                    this.timeHintView.setCx((getLeft() + iDp2) - AndroidUtilities.dp(4.0f));
                    TimeHintView timeHintView3 = this.timeHintView;
                    timeHintView3.show = true;
                    timeHintView3.invalidate();
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.pressedLeft) {
                    VideoTimelineViewDelegate videoTimelineViewDelegate3 = this.delegate;
                    if (videoTimelineViewDelegate3 != null) {
                        ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(0.0f, 0);
                    }
                    this.pressedLeft = false;
                    invalidate();
                    TimeHintView timeHintView4 = this.timeHintView;
                    timeHintView4.show = false;
                    timeHintView4.invalidate();
                    return true;
                }
                if (this.pressedRight) {
                    VideoTimelineViewDelegate videoTimelineViewDelegate4 = this.delegate;
                    if (videoTimelineViewDelegate4 != null) {
                        ChatActivityEnterView.this.delegate.needChangeVideoPreviewState(0.0f, 0);
                    }
                    this.pressedRight = false;
                    invalidate();
                    TimeHintView timeHintView5 = this.timeHintView;
                    timeHintView5.show = false;
                    timeHintView5.invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.pressedLeft) {
                    int i = (int) (x - this.pressDx);
                    if (i < AndroidUtilities.dp(16.0f)) {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    } else if (i <= iDp2) {
                        iDp2 = i;
                    }
                    float fDp = (iDp2 - AndroidUtilities.dp(16.0f)) / f;
                    this.progressLeft = fDp;
                    float f2 = this.progressRight;
                    float f3 = f2 - fDp;
                    float f4 = this.maxProgressDiff;
                    if (f3 > f4) {
                        this.progressRight = fDp + f4;
                    } else {
                        float f5 = this.minProgressDiff;
                        if (f5 != 0.0f && f3 < f5) {
                            float f6 = f2 - f5;
                            this.progressLeft = f6;
                            if (f6 < 0.0f) {
                                this.progressLeft = 0.0f;
                            }
                        }
                    }
                    this.timeHintView.setCx(((AndroidUtilities.dpf2(12.0f) + (f * this.progressLeft)) + getLeft()) - AndroidUtilities.dp(4.0f));
                    this.timeHintView.setTime((int) ((this.videoLength / 1000.0f) * this.progressLeft));
                    TimeHintView timeHintView6 = this.timeHintView;
                    timeHintView6.show = true;
                    timeHintView6.invalidate();
                    VideoTimelineViewDelegate videoTimelineViewDelegate5 = this.delegate;
                    if (videoTimelineViewDelegate5 != null) {
                        float f7 = this.progressLeft;
                        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                        VideoEditedInfo videoEditedInfo = chatActivityEnterView.videoToSendMessageObject;
                        if (videoEditedInfo != null) {
                            videoEditedInfo.startTime = (long) (videoEditedInfo.estimatedDuration * f7);
                            chatActivityEnterView.delegate.needChangeVideoPreviewState(f7, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.pressedRight) {
                    int i2 = (int) (x - this.pressDx);
                    if (i2 >= iDp) {
                        iDp = i2 > AndroidUtilities.dp(16.0f) + measuredWidth ? AndroidUtilities.dp(16.0f) + measuredWidth : i2;
                    }
                    float fDp2 = (iDp - AndroidUtilities.dp(16.0f)) / f;
                    this.progressRight = fDp2;
                    float f8 = this.progressLeft;
                    float f9 = fDp2 - f8;
                    float f10 = this.maxProgressDiff;
                    if (f9 > f10) {
                        this.progressLeft = fDp2 - f10;
                    } else {
                        float f11 = this.minProgressDiff;
                        if (f11 != 0.0f && f9 < f11) {
                            float f12 = f8 + f11;
                            this.progressRight = f12;
                            if (f12 > 1.0f) {
                                this.progressRight = 1.0f;
                            }
                        }
                    }
                    this.timeHintView.setCx(AndroidUtilities.dpf2(12.0f) + (f * this.progressRight) + getLeft() + AndroidUtilities.dp(4.0f));
                    TimeHintView timeHintView7 = this.timeHintView;
                    timeHintView7.show = true;
                    timeHintView7.invalidate();
                    this.timeHintView.setTime((int) ((this.videoLength / 1000.0f) * this.progressRight));
                    VideoTimelineViewDelegate videoTimelineViewDelegate6 = this.delegate;
                    if (videoTimelineViewDelegate6 != null) {
                        float f13 = this.progressRight;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.videoToSendMessageObject;
                        if (videoEditedInfo2 != null) {
                            videoEditedInfo2.endTime = (long) (videoEditedInfo2.estimatedDuration * f13);
                            chatActivityEnterView2.delegate.needChangeVideoPreviewState(f13, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public final void reloadFrames(int i) {
        if (this.mediaMetadataRetriever == null) {
            return;
        }
        if (i == 0) {
            if (this.isRoundFrames) {
                int iDp = AndroidUtilities.dp(56.0f);
                this.frameWidth = iDp;
                this.frameHeight = iDp;
                this.framesToLoad = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.frameHeight / 2.0f)));
            } else {
                this.frameHeight = AndroidUtilities.dp(40.0f);
                this.framesToLoad = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.frameHeight);
                this.frameWidth = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.framesToLoad);
            }
            this.frameTimeOffset = this.videoLength / ((long) this.framesToLoad);
            ArrayList arrayList = this.keyframes;
            if (!arrayList.isEmpty()) {
                float size = arrayList.size() / this.framesToLoad;
                float f = 0.0f;
                for (int i2 = 0; i2 < this.framesToLoad; i2++) {
                    this.frames.add((Bitmap) arrayList.get((int) f));
                    f += size;
                }
                return;
            }
        }
        this.framesLoaded = false;
        ?? r3 = new AsyncTask() {
            public int frameNum = 0;

            @Override
            public final Object doInBackground(Object[] objArr) {
                VideoTimelineView videoTimelineView = VideoTimelineView.this;
                this.frameNum = ((Integer[]) objArr)[0].intValue();
                Bitmap bitmap = null;
                if (isCancelled()) {
                    return null;
                }
                try {
                    Bitmap frameAtTime = videoTimelineView.mediaMetadataRetriever.getFrameAtTime(videoTimelineView.frameTimeOffset * ((long) this.frameNum) * 1000, 2);
                    try {
                        if (isCancelled()) {
                            return null;
                        }
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(videoTimelineView.frameWidth, videoTimelineView.frameHeight, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(videoTimelineView.frameWidth / frameAtTime.getWidth(), videoTimelineView.frameHeight / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * fMax);
                        int height = (int) (frameAtTime.getHeight() * fMax);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((videoTimelineView.frameWidth - width) / 2, (videoTimelineView.frameHeight - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return bitmapCreateBitmap;
                    } catch (Exception e) {
                        e = e;
                        bitmap = frameAtTime;
                        FileLog.e(e);
                        return bitmap;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }

            @Override
            public final void onPostExecute(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (isCancelled()) {
                    return;
                }
                VideoTimelineView videoTimelineView = VideoTimelineView.this;
                videoTimelineView.frames.add(bitmap);
                videoTimelineView.invalidate();
                int i3 = this.frameNum;
                if (i3 < videoTimelineView.framesToLoad) {
                    videoTimelineView.reloadFrames(i3 + 1);
                } else {
                    videoTimelineView.framesLoaded = true;
                }
            }
        };
        this.currentTask = r3;
        r3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
    }

    public void setDelegate(VideoTimelineViewDelegate videoTimelineViewDelegate) {
        this.delegate = videoTimelineViewDelegate;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.keyframes;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
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

    public void setRoundFrames(boolean z) {
        this.isRoundFrames = z;
        if (z) {
            this.rect1 = new Rect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            this.rect2 = new Rect();
        }
    }

    public void setTimeHintView(TimeHintView timeHintView) {
        this.timeHintView = timeHintView;
    }

    public void setVideoPath(String str) {
        destroy(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.progressLeft = 0.0f;
        this.progressRight = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.videoLength = Long.parseLong(this.mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }
}
