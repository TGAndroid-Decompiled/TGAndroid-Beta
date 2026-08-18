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
import java.io.File;
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
    private Rect exclustionRect;
    private ParcelFileDescriptor fd;
    private int frameHeight;
    private long frameTimeOffset;
    private int frameWidth;
    private ArrayList frames;
    private int framesToLoad;
    private final Paint handlePaint;
    private boolean hasBlur;
    private boolean isLivePhoto;
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
    private float progressPreview;
    private float progressRight;
    private RectF rect3;
    private final Paint shadowPaint;
    private int videoHeight;
    private long videoLength;
    private int videoWidth;
    private final Paint whitePaint;
    private final Paint yellowPaint;

    public interface VideoTimelineViewDelegate {
        void didStartDragging(int i);

        void didStopDragging(int i);

        void onLeftProgressChanged(float f);

        void onPlayProgressChanged(float f);

        void onRightProgressChanged(float f);
    }

    protected abstract boolean customBlur();

    protected abstract void drawBlur(Canvas canvas, RectF rectF);

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
        this.exclustionRect = new Rect();
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
        this.exclusionRects.add(this.exclustionRect);
    }

    public float getProgress() {
        return this.playProgress;
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

    public void setMode(int i) {
        if (this.currentMode == i) {
            return;
        }
        this.currentMode = i;
        invalidate();
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

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.exclustionRect.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
        float f = measuredWidth;
        int iDp = ((int) (this.progressLeft * f)) + AndroidUtilities.dp(22.0f);
        int iDp2 = ((int) (this.playProgress * f)) + AndroidUtilities.dp(22.0f);
        int iDp3 = ((int) (this.progressRight * f)) + AndroidUtilities.dp(22.0f);
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.mediaMetadataRetriever == null) {
                return false;
            }
            int iDp4 = AndroidUtilities.dp(16.0f);
            int iDp5 = AndroidUtilities.dp(8.0f);
            if (iDp3 != iDp && iDp2 - iDp5 <= x && x <= iDp5 + iDp2 && y >= 0.0f && y <= getMeasuredHeight()) {
                VideoTimelineViewDelegate videoTimelineViewDelegate = this.delegate;
                if (videoTimelineViewDelegate != null) {
                    videoTimelineViewDelegate.didStartDragging(TYPE_PROGRESS);
                }
                this.pressedPlay = true;
                this.pressDx = (int) (x - iDp2);
                invalidate();
                return true;
            }
            if (iDp - iDp4 <= x && x <= Math.min(iDp + iDp4, iDp3) && y >= 0.0f && y <= getMeasuredHeight()) {
                VideoTimelineViewDelegate videoTimelineViewDelegate2 = this.delegate;
                if (videoTimelineViewDelegate2 != null) {
                    videoTimelineViewDelegate2.didStartDragging(TYPE_LEFT);
                }
                this.pressedLeft = true;
                this.pressDx = (int) (x - iDp);
                invalidate();
                return true;
            }
            if (iDp3 - iDp4 <= x && x <= iDp4 + iDp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                VideoTimelineViewDelegate videoTimelineViewDelegate3 = this.delegate;
                if (videoTimelineViewDelegate3 != null) {
                    videoTimelineViewDelegate3.didStartDragging(TYPE_RIGHT);
                }
                this.pressedRight = true;
                this.pressDx = (int) (x - iDp3);
                invalidate();
                return true;
            }
            if (iDp <= x && x <= iDp3 && y >= 0.0f && y <= getMeasuredHeight()) {
                VideoTimelineViewDelegate videoTimelineViewDelegate4 = this.delegate;
                if (videoTimelineViewDelegate4 != null) {
                    videoTimelineViewDelegate4.didStartDragging(TYPE_PROGRESS);
                }
                this.pressedPlay = true;
                float fDp = (x - AndroidUtilities.dp(16.0f)) / f;
                this.playProgress = fDp;
                VideoTimelineViewDelegate videoTimelineViewDelegate5 = this.delegate;
                if (videoTimelineViewDelegate5 != null) {
                    videoTimelineViewDelegate5.onPlayProgressChanged(fDp);
                }
                this.pressDx = 0.0f;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.pressedLeft) {
                VideoTimelineViewDelegate videoTimelineViewDelegate6 = this.delegate;
                if (videoTimelineViewDelegate6 != null) {
                    videoTimelineViewDelegate6.didStopDragging(TYPE_LEFT);
                }
                this.pressedLeft = false;
                return true;
            }
            if (this.pressedRight) {
                VideoTimelineViewDelegate videoTimelineViewDelegate7 = this.delegate;
                if (videoTimelineViewDelegate7 != null) {
                    videoTimelineViewDelegate7.didStopDragging(TYPE_RIGHT);
                }
                this.pressedRight = false;
                return true;
            }
            if (this.pressedPlay) {
                VideoTimelineViewDelegate videoTimelineViewDelegate8 = this.delegate;
                if (videoTimelineViewDelegate8 != null) {
                    videoTimelineViewDelegate8.didStopDragging(TYPE_PROGRESS);
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
                VideoTimelineViewDelegate videoTimelineViewDelegate9 = this.delegate;
                if (videoTimelineViewDelegate9 != null) {
                    videoTimelineViewDelegate9.onPlayProgressChanged(this.playProgress);
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
                float f4 = this.progressRight;
                float f5 = f4 - fDp3;
                float f6 = this.maxProgressDiff;
                if (f5 > f6) {
                    this.progressRight = fDp3 + f6;
                } else {
                    float f7 = this.minProgressDiff;
                    if (f7 != 0.0f && f5 < f7) {
                        float f8 = f4 - f7;
                        this.progressLeft = f8;
                        if (f8 < 0.0f) {
                            this.progressLeft = 0.0f;
                        }
                    }
                }
                float f9 = this.progressLeft;
                float f10 = this.playProgress;
                if (f9 > f10) {
                    this.playProgress = f9;
                } else {
                    float f11 = this.progressRight;
                    if (f11 < f10) {
                        this.playProgress = f11;
                    }
                }
                VideoTimelineViewDelegate videoTimelineViewDelegate10 = this.delegate;
                if (videoTimelineViewDelegate10 != null) {
                    videoTimelineViewDelegate10.onLeftProgressChanged(f9);
                }
                invalidate();
                return true;
            }
            if (this.pressedRight) {
                int i2 = (int) (x - this.pressDx);
                if (i2 >= iDp) {
                    iDp = i2 > AndroidUtilities.dp(16.0f) + measuredWidth ? measuredWidth + AndroidUtilities.dp(16.0f) : i2;
                }
                float fDp4 = (iDp - AndroidUtilities.dp(16.0f)) / f;
                this.progressRight = fDp4;
                float f12 = this.progressLeft;
                float f13 = fDp4 - f12;
                float f14 = this.maxProgressDiff;
                if (f13 > f14) {
                    this.progressLeft = fDp4 - f14;
                } else {
                    float f15 = this.minProgressDiff;
                    if (f15 != 0.0f && f13 < f15) {
                        float f16 = f12 + f15;
                        this.progressRight = f16;
                        if (f16 > 1.0f) {
                            this.progressRight = 1.0f;
                        }
                    }
                }
                float f17 = this.progressLeft;
                float f18 = this.playProgress;
                if (f17 > f18) {
                    this.playProgress = f17;
                } else {
                    float f19 = this.progressRight;
                    if (f19 < f18) {
                        this.playProgress = f19;
                    }
                }
                VideoTimelineViewDelegate videoTimelineViewDelegate11 = this.delegate;
                if (videoTimelineViewDelegate11 != null) {
                    videoTimelineViewDelegate11.onRightProgressChanged(this.progressRight);
                }
                invalidate();
                return true;
            }
        }
        return true;
    }

    public void setVideoPath(String str, long j, float f, float f2, long j2) {
        int i;
        destroy();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.isLivePhoto = j > 0;
        this.progressLeft = f;
        this.progressRight = f2;
        float f3 = this.playProgress;
        if (f3 < f) {
            this.playProgress = f;
        } else if (f3 > f2) {
            this.playProgress = f2;
        }
        try {
            if (j > 0) {
                File file = new File(str);
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                this.fd = parcelFileDescriptorOpen;
                this.mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpen.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String strExtractMetadata = this.mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata != null) {
                this.videoLength = Long.parseLong(strExtractMetadata);
            }
            String strExtractMetadata2 = this.mediaMetadataRetriever.extractMetadata(18);
            if (strExtractMetadata2 != null) {
                this.videoWidth = Integer.parseInt(strExtractMetadata2);
            }
            String strExtractMetadata3 = this.mediaMetadataRetriever.extractMetadata(19);
            if (strExtractMetadata3 != null) {
                this.videoHeight = Integer.parseInt(strExtractMetadata3);
            }
            String strExtractMetadata4 = this.mediaMetadataRetriever.extractMetadata(24);
            if (strExtractMetadata4 != null && ((i = Integer.parseInt(strExtractMetadata4)) == 90 || i == 270)) {
                int i2 = this.videoWidth;
                this.videoWidth = this.videoHeight;
                this.videoHeight = i2;
            }
            if (this.isLivePhoto) {
                this.progressPreview = (float) ((j2 / 1000.0d) / this.videoLength);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }

    public long getLength() {
        return Math.max(1L, this.videoLength);
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

    public void setDelegate(VideoTimelineViewDelegate videoTimelineViewDelegate) {
        this.delegate = videoTimelineViewDelegate;
    }

    public void reloadFrames(int i) {
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
        AsyncTask asyncTask = new AsyncTask() {
            private int frameNum = 0;
            private final Paint paint = new Paint(3);

            @Override
            public Bitmap doInBackground(Integer... numArr) {
                this.frameNum = numArr[0].intValue();
                Bitmap bitmapCreateBitmap = null;
                if (isCancelled()) {
                    return null;
                }
                try {
                    Bitmap frameAtTime = VideoTimelinePlayView.this.mediaMetadataRetriever.getFrameAtTime(VideoTimelinePlayView.this.frameTimeOffset * ((long) this.frameNum) * 1000, 2);
                    try {
                        if (isCancelled()) {
                            return null;
                        }
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(VideoTimelinePlayView.this.frameWidth, VideoTimelinePlayView.this.frameHeight, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        float fMax = Math.max(VideoTimelinePlayView.this.frameWidth / frameAtTime.getWidth(), VideoTimelinePlayView.this.frameHeight / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * fMax);
                        int height = (int) (frameAtTime.getHeight() * fMax);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((VideoTimelinePlayView.this.frameWidth - width) / 2, (VideoTimelinePlayView.this.frameHeight - height) / 2, (VideoTimelinePlayView.this.frameWidth + width) / 2, (VideoTimelinePlayView.this.frameHeight + height) / 2), this.paint);
                        frameAtTime.recycle();
                    } catch (Exception e) {
                        e = e;
                        bitmapCreateBitmap = frameAtTime;
                        FileLog.e(e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                return bitmapCreateBitmap;
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

    public void destroy() {
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
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
    }

    public boolean isDragging() {
        return this.pressedPlay;
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
    protected void onDraw(Canvas canvas) {
        float f;
        int i;
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (fDpf2 * 2.0f);
        float fDp = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.progressLeft));
        float fDp2 = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.progressRight));
        float fDp3 = AndroidUtilities.dp(6.0f);
        float fDp4 = fDp3 + AndroidUtilities.dp(38.0f);
        if (this.frames.isEmpty() && this.currentTask == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDpf2, fDp3, measuredWidth + fDpf2, fDp4);
            if (customBlur()) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                drawBlur(canvas, rectF);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.dimPaint);
            }
            reloadFrames(0);
        } else {
            canvas.save();
            this.clipPath.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f2 = fDpf2 + measuredWidth;
            rectF2.set(fDpf2, fDp3, f2, fDp4);
            this.clipPath.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            boolean z = this.frames.size() < this.framesToLoad;
            this.hasBlur = z;
            if (!z) {
                for (int i2 = 0; i2 < this.frames.size(); i2++) {
                    if (((BitmapFrame) this.frames.get(i2)).bitmap == null) {
                        this.hasBlur = true;
                        break;
                    }
                }
            }
            if (!this.hasBlur) {
                f = 1.0f;
                i = 0;
            } else if (customBlur()) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(fDpf2, fDp3, AndroidUtilities.dp(4.0f) + f2, fDp4);
                drawBlur(canvas, rectF3);
                f = 1.0f;
                i = 0;
            } else {
                i = 0;
                f = 1.0f;
                canvas.drawRect(fDp, fDp3, fDp2, fDp4, this.dimPaint);
            }
            int i3 = 0;
            while (i3 < this.frames.size()) {
                BitmapFrame bitmapFrame = (BitmapFrame) this.frames.get(i3);
                if (bitmapFrame.bitmap != null) {
                    float f3 = (this.frameWidth * i) + fDpf2;
                    float fDp5 = AndroidUtilities.dp(6.0f);
                    float f4 = bitmapFrame.alpha;
                    if (f4 != f) {
                        float f5 = f4 + 0.045714285f;
                        bitmapFrame.alpha = f5;
                        if (f5 > f) {
                            bitmapFrame.alpha = f;
                        } else {
                            invalidate();
                        }
                        this.bitmapPaint.setAlpha((int) (CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(bitmapFrame.alpha) * 255.0f));
                        canvas.drawBitmap(bitmapFrame.bitmap, f3, fDp5, this.bitmapPaint);
                    } else {
                        canvas.drawBitmap(bitmapFrame.bitmap, f3, fDp5, (Paint) null);
                    }
                }
                i++;
                i3++;
                f = 1.0f;
            }
            canvas.drawRect(fDpf2, fDp3, fDp, AndroidUtilities.dp(46.0f), this.dimPaint);
            canvas.drawRect(fDp2, fDp3, f2, fDp4, this.dimPaint);
            canvas.restore();
        }
        if (!this.isLivePhoto) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            this.rect3.set(fDp - AndroidUtilities.dpf2(10.0f), fDp3, AndroidUtilities.dpf2(10.0f) + fDp2, fDp4);
            this.whitePaint.setAlpha(255);
            canvas.drawRoundRect(this.rect3, AndroidUtilities.dpf2(6.0f), AndroidUtilities.dpf2(6.0f), this.whitePaint);
            this.rect3.set(fDp, AndroidUtilities.dpf2(2.0f) + fDp3, fDp2, fDp4 - AndroidUtilities.dpf2(2.0f));
            canvas.drawRect(this.rect3, this.cutPaint);
            canvas.restore();
            float fDp6 = AndroidUtilities.dp(2.0f);
            float fDp7 = AndroidUtilities.dp(10.0f);
            float fDpf3 = fDp - ((AndroidUtilities.dpf2(10.0f) - fDp6) / 2.0f);
            float f6 = fDp3 + (((fDp4 - fDp3) - fDp7) / 2.0f);
            float f7 = fDp7 + f6;
            this.rect3.set(fDpf3, f6, fDpf3 - fDp6, f7);
            canvas.drawRoundRect(this.rect3, AndroidUtilities.dpf2(6.0f), AndroidUtilities.dpf2(6.0f), this.handlePaint);
            float fDpf4 = fDp2 + ((AndroidUtilities.dpf2(10.0f) - fDp6) / 2.0f);
            this.rect3.set(fDpf4, f6, fDp6 + fDpf4, f7);
            canvas.drawRoundRect(this.rect3, AndroidUtilities.dpf2(6.0f), AndroidUtilities.dpf2(6.0f), this.handlePaint);
        }
        float f8 = this.loopProgress.set(0.0f);
        if (f8 > 0.0f) {
            drawProgress(canvas, this.progressRight, f8, this.whitePaint);
        }
        drawProgress(canvas, this.playProgress, 1.0f - f8, this.whitePaint);
        if (this.isLivePhoto) {
            drawProgress(canvas, this.progressPreview, 1.0f, this.yellowPaint);
        }
    }

    private void drawProgress(Canvas canvas, float f, float f2, Paint paint) {
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = (getMeasuredWidth() - (fDpf2 * 2.0f)) - AndroidUtilities.dp(20.0f);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(46.0f) + fDp;
        float f3 = ((fDp2 - fDp) / 2.0f) * (1.0f - f2);
        float f4 = fDp + f3;
        float f5 = fDp2 - f3;
        this.shadowPaint.setAlpha((int) (38.0f * f2));
        paint.setAlpha((int) (f2 * 255.0f));
        float fDp3 = fDpf2 + AndroidUtilities.dp(10.0f) + (measuredWidth * f);
        this.rect3.set(fDp3 - AndroidUtilities.dpf2(1.5f), f4, AndroidUtilities.dpf2(1.5f) + fDp3, f5);
        this.rect3.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.shadowPaint);
        this.rect3.set(fDp3 - AndroidUtilities.dpf2(1.5f), f4, fDp3 + AndroidUtilities.dpf2(1.5f), f5);
        canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    private static class BitmapFrame {
        float alpha;
        Bitmap bitmap;

        public BitmapFrame(Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }

    public void invalidateBlur() {
        if (customBlur() && this.hasBlur) {
            invalidate();
        }
    }
}
