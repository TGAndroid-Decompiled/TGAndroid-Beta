package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

public abstract class VideoTimelinePlayView extends View {
    public static final Object sync = new Object();
    public final Paint bitmapPaint;
    public final Path clipPath;
    public int currentMode;
    public AnonymousClass1 currentTask;
    public final Paint cutPaint;
    public VideoTimelineViewDelegate delegate;
    public final Paint dimPaint;
    public final ArrayList exclusionRects;
    public final Rect exclustionRect;
    public ParcelFileDescriptor fd;
    public int frameHeight;
    public long frameTimeOffset;
    public int frameWidth;
    public final ArrayList frames;
    public int framesToLoad;
    public final Paint handlePaint;
    public boolean hasBlur;
    public boolean isLivePhoto;
    public int lastWidth;
    public final AnimatedFloat loopProgress;
    public float maxProgressDiff;
    public MediaMetadataRetriever mediaMetadataRetriever;
    public float minProgressDiff;
    public float playProgress;
    public float pressDx;
    public boolean pressedLeft;
    public boolean pressedPlay;
    public boolean pressedRight;
    public float progressLeft;
    public float progressPreview;
    public float progressRight;
    public final RectF rect3;
    public final Paint shadowPaint;
    public int videoHeight;
    public long videoLength;
    public int videoWidth;
    public final Paint whitePaint;
    public final Paint yellowPaint;

    public final class BitmapFrame {
        public float alpha;
        public final Bitmap bitmap;

        public BitmapFrame(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }

    public interface VideoTimelineViewDelegate {
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
        ArrayList arrayList = new ArrayList();
        this.exclusionRects = arrayList;
        Rect rect = new Rect();
        this.exclustionRect = rect;
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.yellowPaint = paint2;
        Paint paint3 = new Paint(1);
        this.shadowPaint = paint3;
        Paint paint4 = new Paint(1);
        this.dimPaint = paint4;
        Paint paint5 = new Paint(1);
        this.cutPaint = paint5;
        Paint paint6 = new Paint(1);
        this.handlePaint = paint6;
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 200L, CubicBezierInterpolator.EASE_BOTH);
        this.clipPath = new Path();
        paint.setColor(-1);
        paint2.setColor(-256);
        paint3.setColor(637534208);
        paint4.setColor(1291845632);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setColor(-16777216);
        arrayList.add(rect);
    }

    public final void destroy() {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever;
        synchronized (sync) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.fd;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.fd = null;
                    try {
                        mediaMetadataRetriever = this.mediaMetadataRetriever;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                            this.mediaMetadataRetriever = null;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    mediaMetadataRetriever = this.mediaMetadataRetriever;
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                        this.mediaMetadataRetriever = null;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            throw th;
        }
        for (int i = 0; i < this.frames.size(); i++) {
            BitmapFrame bitmapFrame = (BitmapFrame) this.frames.get(i);
            if (bitmapFrame != null && (bitmap = bitmapFrame.bitmap) != null) {
                bitmap.recycle();
            }
        }
        this.frames.clear();
        AnonymousClass1 anonymousClass1 = this.currentTask;
        if (anonymousClass1 != null) {
            anonymousClass1.cancel(true);
            this.currentTask = null;
        }
    }

    public abstract void drawBlur(Canvas canvas, RectF rectF);

    public final void drawProgress(float f, float f2, Canvas canvas, Paint paint) {
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = (getMeasuredWidth() - (fDpf2 * 2.0f)) - AndroidUtilities.dp(20.0f);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(46.0f) + fDp;
        float f3 = (1.0f - f2) * ((fDp2 - fDp) / 2.0f);
        float f4 = fDp + f3;
        float f5 = fDp2 - f3;
        Paint paint2 = this.shadowPaint;
        paint2.setAlpha((int) (38.0f * f2));
        paint.setAlpha((int) (f2 * 255.0f));
        float fDp3 = (measuredWidth * f) + fDpf2 + AndroidUtilities.dp(10.0f);
        RectF rectF = this.rect3;
        rectF.set(fDp3 - AndroidUtilities.dpf2(1.5f), f4, AndroidUtilities.dpf2(1.5f) + fDp3, f5);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(fDp3 - AndroidUtilities.dpf2(1.5f), f4, AndroidUtilities.dpf2(1.5f) + fDp3, f5);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

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

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (fDpf2 * 2.0f);
        float fDp = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.progressLeft));
        float fDp2 = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.progressRight));
        float fDp3 = AndroidUtilities.dp(6.0f);
        float fDp4 = fDp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.frames;
        boolean zIsEmpty = arrayList.isEmpty();
        Path path = this.clipPath;
        if (zIsEmpty && this.currentTask == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDpf2, fDp3, measuredWidth + fDpf2, fDp4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            drawBlur(canvas, rectF);
            canvas.restore();
            reloadFrames(0);
            f5 = fDp3;
            f4 = fDp2;
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f6 = measuredWidth + fDpf2;
            rectF2.set(fDpf2, fDp3, f6, fDp4);
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            boolean z = arrayList.size() < this.framesToLoad;
            this.hasBlur = z;
            if (!z) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((BitmapFrame) arrayList.get(i)).bitmap == null) {
                        this.hasBlur = true;
                        break;
                    }
                }
            }
            if (this.hasBlur) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(fDpf2, fDp3, AndroidUtilities.dp(4.0f) + f6, fDp4);
                drawBlur(canvas, rectF3);
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < arrayList.size()) {
                BitmapFrame bitmapFrame = (BitmapFrame) arrayList.get(i2);
                if (bitmapFrame.bitmap != null) {
                    float f7 = (this.frameWidth * i3) + fDpf2;
                    float fDp5 = AndroidUtilities.dp(6.0f);
                    float f8 = bitmapFrame.alpha;
                    Bitmap bitmap = bitmapFrame.bitmap;
                    if (f8 != 1.0f) {
                        float f9 = f8 + 0.045714285f;
                        bitmapFrame.alpha = f9;
                        if (f9 > 1.0f) {
                            bitmapFrame.alpha = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.bitmapPaint;
                        paint.setAlpha((int) (CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(bitmapFrame.alpha) * 255.0f));
                        canvas.drawBitmap(bitmap, f7, fDp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f7, fDp5, (Paint) null);
                    }
                }
                i3++;
                i2++;
                fDpf2 = fDpf2;
            }
            float f10 = fDpf2;
            float fDp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.dimPaint;
            canvas.drawRect(f10, fDp3, fDp, fDp6, paint2);
            canvas.drawRect(fDp2, fDp3, f6, fDp4, paint2);
            f4 = fDp2;
            f5 = fDp3;
            canvas.restore();
        }
        boolean z2 = this.isLivePhoto;
        Paint paint3 = this.whitePaint;
        if (z2) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.rect3;
            rectF4.set(fDp - AndroidUtilities.dpf2(f2), f5, AndroidUtilities.dpf2(f2) + f4, fDp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f3), AndroidUtilities.dpf2(f3), paint3);
            rectF4.set(fDp, AndroidUtilities.dpf2(f) + f5, f4, fDp4 - AndroidUtilities.dpf2(f));
            canvas2.drawRect(rectF4, this.cutPaint);
            canvas2.restore();
            float fDp7 = AndroidUtilities.dp(f);
            float fDp8 = AndroidUtilities.dp(f2);
            float fDpf3 = fDp - ((AndroidUtilities.dpf2(f2) - fDp7) / f);
            float f11 = (((fDp4 - f5) - fDp8) / f) + f5;
            float f12 = fDp8 + f11;
            rectF4.set(fDpf3, f11, fDpf3 - fDp7, f12);
            float fDpf4 = AndroidUtilities.dpf2(f3);
            float fDpf5 = AndroidUtilities.dpf2(f3);
            Paint paint4 = this.handlePaint;
            canvas2.drawRoundRect(rectF4, fDpf4, fDpf5, paint4);
            float fDpf6 = ((AndroidUtilities.dpf2(f2) - fDp7) / f) + f4;
            rectF4.set(fDpf6, f11, fDp7 + fDpf6, f12);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f3), AndroidUtilities.dpf2(f3), paint4);
        }
        float f13 = this.loopProgress.set(0.0f, false);
        if (f13 > 0.0f) {
            drawProgress(this.progressRight, f13, canvas2, paint3);
        }
        drawProgress(this.playProgress, 1.0f - f13, canvas2, paint3);
        if (this.isLivePhoto) {
            drawProgress(this.progressPreview, 1.0f, canvas2, this.yellowPaint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.exclustionRect.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.lastWidth != size) {
            int i3 = 0;
            while (true) {
                arrayList = this.frames;
                if (i3 >= arrayList.size()) {
                    break;
                }
                BitmapFrame bitmapFrame = (BitmapFrame) arrayList.get(i3);
                if (bitmapFrame != null && (bitmap = bitmapFrame.bitmap) != null) {
                    bitmap.recycle();
                }
                i3++;
            }
            arrayList.clear();
            AnonymousClass1 anonymousClass1 = this.currentTask;
            if (anonymousClass1 != null) {
                anonymousClass1.cancel(true);
                this.currentTask = null;
            }
            invalidate();
            this.lastWidth = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer.AnonymousClass27 anonymousClass27;
        PhotoViewer photoViewer;
        VideoPlayer videoPlayer;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f = measuredWidth;
            int iDp = AndroidUtilities.dp(22.0f) + ((int) (this.progressLeft * f));
            int iDp2 = AndroidUtilities.dp(22.0f) + ((int) (this.playProgress * f));
            int iDp3 = AndroidUtilities.dp(22.0f) + ((int) (this.progressRight * f));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.mediaMetadataRetriever != null) {
                    int iDp4 = AndroidUtilities.dp(16.0f);
                    int iDp5 = AndroidUtilities.dp(8.0f);
                    if (iDp3 != iDp && iDp2 - iDp5 <= x && x <= iDp5 + iDp2 && y >= 0.0f && y <= getMeasuredHeight()) {
                        VideoTimelineViewDelegate videoTimelineViewDelegate = this.delegate;
                        if (videoTimelineViewDelegate != null) {
                            ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate).didStartDragging();
                        }
                        this.pressedPlay = true;
                        this.pressDx = (int) (x - iDp2);
                        invalidate();
                        return true;
                    }
                    if (iDp - iDp4 <= x && x <= Math.min(iDp + iDp4, iDp3) && y >= 0.0f && y <= getMeasuredHeight()) {
                        this.pressedLeft = true;
                        this.pressDx = (int) (x - iDp);
                        invalidate();
                        return true;
                    }
                    if (iDp3 - iDp4 <= x && x <= iDp4 + iDp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        this.pressedRight = true;
                        this.pressDx = (int) (x - iDp3);
                        invalidate();
                        return true;
                    }
                    if (iDp <= x && x <= iDp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                        VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
                        if (videoTimelineViewDelegate2 != null) {
                            ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate2).didStartDragging();
                        }
                        this.pressedPlay = true;
                        float fDp = (x - AndroidUtilities.dp(16.0f)) / f;
                        this.playProgress = fDp;
                        VideoTimelineViewDelegate videoTimelineViewDelegate3 = this.delegate;
                        if (videoTimelineViewDelegate3 != null) {
                            PhotoViewer.AnonymousClass27 anonymousClass28 = (PhotoViewer.AnonymousClass27) videoTimelineViewDelegate3;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            if (photoViewer2.videoPlayer != null) {
                                if (photoViewer2.sendPhotoType == 1) {
                                    anonymousClass28.updateAvatarStartTime(0);
                                }
                                anonymousClass28.seekTo(fDp);
                            }
                        }
                        this.pressDx = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.pressedLeft) {
                    VideoTimelineViewDelegate videoTimelineViewDelegate4 = this.delegate;
                    if (videoTimelineViewDelegate4 != null) {
                        ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate4).didStopDragging(0);
                    }
                    this.pressedLeft = false;
                    return true;
                }
                if (this.pressedRight) {
                    VideoTimelineViewDelegate videoTimelineViewDelegate5 = this.delegate;
                    if (videoTimelineViewDelegate5 != null) {
                        ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate5).didStopDragging(1);
                    }
                    this.pressedRight = false;
                    return true;
                }
                if (this.pressedPlay) {
                    VideoTimelineViewDelegate videoTimelineViewDelegate6 = this.delegate;
                    if (videoTimelineViewDelegate6 != null) {
                        ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate6).didStopDragging(2);
                    }
                    this.pressedPlay = false;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.pressedPlay) {
                    float fDp2 = (((int) (x - this.pressDx)) - AndroidUtilities.dp(16.0f)) / f;
                    this.playProgress = fDp2;
                    float f2 = this.progressLeft;
                    if (fDp2 < f2) {
                        this.playProgress = f2;
                    } else {
                        float f3 = this.progressRight;
                        if (fDp2 > f3) {
                            this.playProgress = f3;
                        }
                    }
                    VideoTimelineViewDelegate videoTimelineViewDelegate7 = this.delegate;
                    if (videoTimelineViewDelegate7 != null) {
                        float f4 = this.playProgress;
                        PhotoViewer.AnonymousClass27 anonymousClass29 = (PhotoViewer.AnonymousClass27) videoTimelineViewDelegate7;
                        PhotoViewer photoViewer3 = PhotoViewer.this;
                        if (photoViewer3.videoPlayer != null) {
                            if (photoViewer3.sendPhotoType == 1) {
                                anonymousClass29.updateAvatarStartTime(0);
                            }
                            anonymousClass29.seekTo(f4);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.pressedLeft) {
                    int i = (int) (x - this.pressDx);
                    if (i < AndroidUtilities.dp(16.0f)) {
                        iDp3 = AndroidUtilities.dp(16.0f);
                    } else if (i <= iDp3) {
                        iDp3 = i;
                    }
                    float fDp3 = (iDp3 - AndroidUtilities.dp(16.0f)) / f;
                    this.progressLeft = fDp3;
                    float f5 = this.progressRight;
                    float f6 = f5 - fDp3;
                    float f7 = this.maxProgressDiff;
                    if (f6 > f7) {
                        this.progressRight = fDp3 + f7;
                    } else {
                        float f8 = this.minProgressDiff;
                        if (f8 != 0.0f && f6 < f8) {
                            float f9 = f5 - f8;
                            this.progressLeft = f9;
                            if (f9 < 0.0f) {
                                this.progressLeft = 0.0f;
                            }
                        }
                    }
                    float f10 = this.progressLeft;
                    float f11 = this.playProgress;
                    if (f10 > f11) {
                        this.playProgress = f10;
                    } else {
                        float f12 = this.progressRight;
                        if (f12 < f11) {
                            this.playProgress = f12;
                        }
                    }
                    VideoTimelineViewDelegate videoTimelineViewDelegate8 = this.delegate;
                    if (videoTimelineViewDelegate8 != null && (videoPlayer = (photoViewer = PhotoViewer.this).videoPlayer) != null) {
                        if (videoPlayer.isPlaying()) {
                            photoViewer.manuallyPaused = false;
                            photoViewer.videoPlayer.pause();
                            photoViewer.containerView.invalidate();
                        }
                        anonymousClass27.updateAvatarStartTime(1);
                        anonymousClass27.seekTo(f10);
                        photoViewer.videoPlayerSeekbar.setProgress(0.0f, false);
                        photoViewer.videoTimelineView.setProgress(f10);
                        photoViewer.updateVideoInfo();
                    }
                    invalidate();
                    return true;
                }
                if (this.pressedRight) {
                    int i2 = (int) (x - this.pressDx);
                    if (i2 >= iDp) {
                        iDp = i2 > AndroidUtilities.dp(16.0f) + measuredWidth ? AndroidUtilities.dp(16.0f) + measuredWidth : i2;
                    }
                    float fDp4 = (iDp - AndroidUtilities.dp(16.0f)) / f;
                    this.progressRight = fDp4;
                    float f13 = this.progressLeft;
                    float f14 = fDp4 - f13;
                    float f15 = this.maxProgressDiff;
                    if (f14 > f15) {
                        this.progressLeft = fDp4 - f15;
                    } else {
                        float f16 = this.minProgressDiff;
                        if (f16 != 0.0f && f14 < f16) {
                            float f17 = f13 + f16;
                            this.progressRight = f17;
                            if (f17 > 1.0f) {
                                this.progressRight = 1.0f;
                            }
                        }
                    }
                    float f18 = this.progressLeft;
                    float f19 = this.playProgress;
                    if (f18 > f19) {
                        this.playProgress = f18;
                    } else {
                        float f20 = this.progressRight;
                        if (f20 < f19) {
                            this.playProgress = f20;
                        }
                    }
                    VideoTimelineViewDelegate videoTimelineViewDelegate9 = this.delegate;
                    if (videoTimelineViewDelegate9 != null) {
                        ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate9).onRightProgressChanged(this.progressRight);
                    }
                    invalidate();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void reloadFrames(int i) {
        int i2;
        if (this.mediaMetadataRetriever == null) {
            return;
        }
        if (i == 0) {
            this.frameHeight = AndroidUtilities.dp(38.0f);
            int i3 = this.videoWidth;
            this.framesToLoad = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.frameHeight * Utilities.clamp((i3 == 0 || (i2 = this.videoHeight) == 0) ? 1.0f : i3 / i2, 1.3333334f, 0.5625f))));
            this.frameWidth = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.framesToLoad);
            this.frameTimeOffset = this.videoLength / ((long) this.framesToLoad);
        }
        ?? r2 = new AsyncTask() {
            public int frameNum = 0;
            public final Paint paint = new Paint(3);

            @Override
            public final Object doInBackground(Object[] objArr) {
                VideoTimelinePlayView videoTimelinePlayView = VideoTimelinePlayView.this;
                this.frameNum = ((Integer[]) objArr)[0].intValue();
                Bitmap bitmap = null;
                if (isCancelled()) {
                    return null;
                }
                try {
                    Bitmap frameAtTime = videoTimelinePlayView.mediaMetadataRetriever.getFrameAtTime(videoTimelinePlayView.frameTimeOffset * ((long) this.frameNum) * 1000, 2);
                    try {
                        if (isCancelled()) {
                            return null;
                        }
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(videoTimelinePlayView.frameWidth, videoTimelinePlayView.frameHeight, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(videoTimelinePlayView.frameWidth / frameAtTime.getWidth(), videoTimelinePlayView.frameHeight / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * fMax);
                        int height = (int) (frameAtTime.getHeight() * fMax);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i4 = videoTimelinePlayView.frameWidth;
                        int i5 = videoTimelinePlayView.frameHeight;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i4 - width) / 2, (i5 - height) / 2, (i4 + width) / 2, (i5 + height) / 2), this.paint);
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
                VideoTimelinePlayView videoTimelinePlayView = VideoTimelinePlayView.this;
                videoTimelinePlayView.frames.add(new BitmapFrame(bitmap));
                videoTimelinePlayView.invalidate();
                int i4 = this.frameNum;
                if (i4 < videoTimelinePlayView.framesToLoad) {
                    videoTimelinePlayView.reloadFrames(i4 + 1);
                }
            }
        };
        this.currentTask = r2;
        r2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
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
        if (this.isLivePhoto && (f <= 0.0f || f >= 1.0f)) {
            f = this.progressPreview;
        }
        long j = this.videoLength;
        float f2 = j != 0 ? 240.0f / j : 0.0f;
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
        }
        if (videoTimelineViewDelegate != null) {
            ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate).onRightProgressChanged(f);
        }
        VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
        if (videoTimelineViewDelegate2 != null) {
            ((PhotoViewer.AnonymousClass27) videoTimelineViewDelegate2).didStopDragging(1);
        }
        invalidate();
    }
}
