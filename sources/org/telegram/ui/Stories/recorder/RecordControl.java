package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Stories.recorder.FlashViews;
public class RecordControl extends View implements FlashViews.Invertable {
    public float amplitude;
    public final AnimatedFloat animatedAmplitude;
    private final Paint buttonPaint;
    private final Paint buttonPaintWhite;
    private Path circlePath;
    private float cx;
    private float cy;
    private Delegate delegate;
    private boolean discardParentTouch;
    private boolean dual;
    private final AnimatedFloat dualT;
    private final ButtonBounce flipButton;
    private boolean flipButtonWasPressed;
    private final Drawable flipDrawableBlack;
    private float flipDrawableRotate;
    private final AnimatedFloat flipDrawableRotateT;
    private final Drawable flipDrawableWhite;
    private final ImageReceiver galleryImage;
    private final Point h1;
    private final Point h2;
    private final Point h3;
    private final Point h4;
    private final Paint hintLinePaintBlack;
    private final Paint hintLinePaintWhite;
    private long lastDuration;
    private float leftCx;
    private float[] loadingSegments;
    private final ButtonBounce lockButton;
    private final Drawable lockDrawable;
    private final AnimatedFloat lockedT;
    private boolean longpressRecording;
    private final Paint mainPaint;
    private Path metaballsPath;
    private final CombinedDrawable noGalleryDrawable;
    private final Runnable onFlipLongPressRunnable;
    private final Runnable onRecordLongPressRunnable;
    private final Paint outlineFilledPaint;
    private final Paint outlinePaint;
    private float overrideStartModeIsVideoT;
    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;
    private final Drawable pauseDrawable;
    private final ButtonBounce recordButton;
    private final AnimatedFloat recordCx;
    private boolean recording;
    private boolean recordingLoading;
    private long recordingLoadingStart;
    private final AnimatedFloat recordingLoadingT;
    private final AnimatedFloat recordingLongT;
    private long recordingStart;
    private final AnimatedFloat recordingT;
    private RadialGradient redGradient;
    private final Matrix redMatrix;
    private final Paint redPaint;
    private float rightCx;
    private boolean showLock;
    private boolean startModeIsVideo;
    private final AnimatedFloat startModeIsVideoT;
    private boolean touch;
    private final AnimatedFloat touchIsButtonT;
    private final AnimatedFloat touchIsCenter2T;
    private final AnimatedFloat touchIsCenterT;
    private final AnimatedFloat touchT;
    private float touchX;
    private final Drawable unlockDrawable;

    public interface Delegate {
        boolean canRecordAudio();

        void onFlipClick();

        void onFlipLongClick();

        void onGalleryClick();

        void onPhotoShoot();

        void onVideoDuration(long j);

        void onVideoRecordEnd(boolean z);

        void onVideoRecordLocked();

        void onVideoRecordStart(boolean z, Runnable runnable);

        void onZoom(float f);
    }

    public void startAsVideo(boolean z) {
        this.overrideStartModeIsVideoT = -1.0f;
        this.startModeIsVideo = z;
        invalidate();
    }

    public void startAsVideoT(float f) {
        this.overrideStartModeIsVideoT = f;
        invalidate();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public RecordControl(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.galleryImage = imageReceiver;
        this.mainPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.outlinePaint = paint;
        Paint paint2 = new Paint(1);
        this.outlineFilledPaint = paint2;
        Paint paint3 = new Paint(1);
        this.buttonPaint = paint3;
        Paint paint4 = new Paint(1);
        this.buttonPaintWhite = paint4;
        Paint paint5 = new Paint(1);
        this.redPaint = paint5;
        Paint paint6 = new Paint(1);
        this.hintLinePaintWhite = paint6;
        Paint paint7 = new Paint(1);
        this.hintLinePaintBlack = paint7;
        Matrix matrix = new Matrix();
        this.redMatrix = matrix;
        this.recordButton = new ButtonBounce(this);
        this.flipButton = new ButtonBounce(this);
        this.lockButton = new ButtonBounce(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.flipDrawableRotateT = new AnimatedFloat(this, 0L, 310L, cubicBezierInterpolator);
        this.dualT = new AnimatedFloat(this, 0L, 330L, cubicBezierInterpolator);
        this.animatedAmplitude = new AnimatedFloat(this, 0L, 200L, CubicBezierInterpolator.DEFAULT);
        this.startModeIsVideoT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.overrideStartModeIsVideoT = -1.0f;
        this.startModeIsVideo = true;
        this.recordingT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.recordingLongT = new AnimatedFloat(this, 0L, 850L, cubicBezierInterpolator);
        this.loadingSegments = new float[2];
        this.recordingLoadingT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.touchT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.touchIsCenterT = new AnimatedFloat(this, 0L, 650L, cubicBezierInterpolator);
        this.touchIsCenter2T = new AnimatedFloat(this, 0L, 160L, CubicBezierInterpolator.EASE_IN);
        this.recordCx = new AnimatedFloat(this, 0L, 750L, cubicBezierInterpolator);
        this.touchIsButtonT = new AnimatedFloat(this, 0L, 650L, cubicBezierInterpolator);
        this.lockedT = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.onRecordLongPressRunnable = new Runnable() {
            @Override
            public final void run() {
                RecordControl.this.lambda$new$1();
            }
        };
        this.onFlipLongPressRunnable = new Runnable() {
            @Override
            public final void run() {
                RecordControl.this.lambda$new$2();
            }
        };
        this.metaballsPath = new Path();
        this.circlePath = new Path();
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        this.p4 = new Point();
        this.h1 = new Point();
        this.h2 = new Point();
        this.h3 = new Point();
        this.h4 = new Point();
        setWillNotDraw(false);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.redGradient = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(this.redGradient);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-577231);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        paint7.setStyle(Paint.Style.STROKE);
        paint7.setStrokeCap(Paint.Cap.ROUND);
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.noGalleryDrawable = combinedDrawable;
        combinedDrawable.setFullsize(false);
        combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        Resources resources = context.getResources();
        int i = R.drawable.msg_photo_switch2;
        Drawable mutate2 = resources.getDrawable(i).mutate();
        this.flipDrawableWhite = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        Drawable mutate3 = context.getResources().getDrawable(i).mutate();
        this.flipDrawableBlack = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        Drawable mutate4 = context.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.unlockDrawable = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        Drawable mutate5 = context.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.lockDrawable = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        Drawable mutate6 = context.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.pauseDrawable = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        updateGalleryImage();
    }

    public void updateGalleryImage() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        ArrayList<StoryEntry> arrayList2 = MessagesController.getInstance(this.galleryImage.getCurrentAccount()).getStoriesController().getDraftsController().drafts;
        this.galleryImage.setOrientation(0, 0, true);
        if (arrayList2 != null && !arrayList2.isEmpty() && arrayList2.get(0).draftThumbFile != null) {
            this.galleryImage.setImage(ImageLocation.getForPath(arrayList2.get(0).draftThumbFile.getAbsolutePath()), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
            return;
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        MediaController.PhotoEntry photoEntry = null;
        if (albumEntry != null && (arrayList = albumEntry.photos) != null && !arrayList.isEmpty()) {
            photoEntry = albumEntry.photos.get(0);
        }
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.galleryImage.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = this.galleryImage;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
                return;
            }
            this.galleryImage.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            ImageReceiver imageReceiver2 = this.galleryImage;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
        } else {
            this.galleryImage.setImageBitmap(this.noGalleryDrawable);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.galleryImage.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        this.galleryImage.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public void setInvert(float f) {
        this.outlinePaint.setColor(ColorUtils.blendARGB(-1, -16777216, f));
        this.buttonPaint.setColor(ColorUtils.blendARGB(1677721600, 369098752, f));
        this.hintLinePaintWhite.setColor(ColorUtils.blendARGB(1493172223, 285212671, f));
        this.hintLinePaintBlack.setColor(ColorUtils.blendARGB(402653184, 805306368, f));
        this.flipDrawableWhite.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, f), PorterDuff.Mode.MULTIPLY));
        this.unlockDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, f), PorterDuff.Mode.MULTIPLY));
    }

    public void setAmplitude(float f, boolean z) {
        this.amplitude = f;
        if (z) {
            return;
        }
        this.animatedAmplitude.set(f, true);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int dp = AndroidUtilities.dp(100.0f);
        float f = size;
        this.cx = f / 2.0f;
        this.cy = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f * 0.35f);
        float f2 = this.cx;
        this.leftCx = f2 - min;
        float f3 = f2 + min;
        this.rightCx = f3;
        setDrawableBounds(this.flipDrawableWhite, f3, this.cy, AndroidUtilities.dp(14.0f));
        setDrawableBounds(this.flipDrawableBlack, this.rightCx, this.cy, AndroidUtilities.dp(14.0f));
        setDrawableBounds(this.unlockDrawable, this.leftCx, this.cy);
        setDrawableBounds(this.lockDrawable, this.leftCx, this.cy);
        setDrawableBounds(this.pauseDrawable, this.leftCx, this.cy);
        this.galleryImage.setImageCoords(this.leftCx - AndroidUtilities.dp(20.0f), this.cy - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.redMatrix.reset();
        this.redMatrix.postTranslate(this.cx, this.cy);
        this.redGradient.setLocalMatrix(this.redMatrix);
        setMeasuredDimension(size, dp);
    }

    private static void setDrawableBounds(Drawable drawable, float f, float f2) {
        setDrawableBounds(drawable, f, f2, Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f);
    }

    private static void setDrawableBounds(Drawable drawable, float f, float f2, float f3) {
        drawable.setBounds((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }

    public void lambda$new$1() {
        if (this.recording) {
            return;
        }
        if (!this.delegate.canRecordAudio()) {
            this.touch = false;
            this.recordButton.setPressed(false);
            this.flipButton.setPressed(false);
            this.lockButton.setPressed(false);
            return;
        }
        this.longpressRecording = true;
        this.showLock = true;
        this.delegate.onVideoRecordStart(true, new Runnable() {
            @Override
            public final void run() {
                RecordControl.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        this.recordingStart = System.currentTimeMillis();
        this.recording = true;
        Delegate delegate = this.delegate;
        this.lastDuration = 0L;
        delegate.onVideoDuration(0L);
    }

    public void lambda$new$2() {
        if (this.recording) {
            return;
        }
        this.delegate.onFlipLongClick();
        rotateFlip(360.0f);
        this.touch = false;
        this.recordButton.setPressed(false);
        this.flipButton.setPressed(false);
        this.lockButton.setPressed(false);
    }

    @Override
    protected void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.RecordControl.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$3() {
        this.recording = false;
        this.longpressRecording = false;
        this.recordingLoadingStart = SystemClock.elapsedRealtime();
        this.recordingLoading = true;
        this.touch = false;
        this.recordButton.setPressed(false);
        this.flipButton.setPressed(false);
        this.lockButton.setPressed(false);
        this.delegate.onVideoRecordEnd(true);
    }

    private void getVector(float f, float f2, double d, float f3, Point point) {
        double d2 = f;
        double cos = Math.cos(d);
        double d3 = f3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        point.x = (float) (d2 + (cos * d3));
        double d4 = f2;
        double sin = Math.sin(d);
        Double.isNaN(d3);
        Double.isNaN(d4);
        point.y = (float) (d4 + (sin * d3));
    }

    private float dist(Point point, Point point2) {
        return MathUtils.distance(point.x, point.y, point2.x, point2.y);
    }

    public void rotateFlip(float f) {
        this.flipDrawableRotateT.setDuration(f > 180.0f ? 620L : 310L);
        this.flipDrawableRotate += f;
        invalidate();
    }

    private boolean isPressed(float f, float f2, float f3, float f4, float f5, boolean z) {
        return this.recording ? (!z || f4 - f2 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f3 - f) <= f5 : MathUtils.distance(f, f2, f3, f4) <= f5;
    }

    public boolean isTouch() {
        return this.discardParentTouch;
    }

    public void setDual(boolean z) {
        if (z != this.dual) {
            this.dual = z;
            invalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.rightCx, this.leftCx);
        float y = motionEvent.getY() + 0.0f;
        boolean isPressed = isPressed(clamp, y, this.rightCx, this.cy, AndroidUtilities.dp(7.0f), true);
        boolean z = false;
        if (this.recordingLoading) {
            this.recordButton.setPressed(false);
            this.flipButton.setPressed(false);
            this.lockButton.setPressed(false);
        } else if (action == 0 || this.touch) {
            this.recordButton.setPressed(isPressed(clamp, y, this.cx, this.cy, AndroidUtilities.dp(60.0f), false));
            this.flipButton.setPressed(isPressed(clamp, y, this.rightCx, this.cy, AndroidUtilities.dp(30.0f), true));
            this.lockButton.setPressed(isPressed(clamp, y, this.leftCx, this.cy, AndroidUtilities.dp(30.0f), false));
        }
        if (action == 0) {
            this.touch = true;
            this.discardParentTouch = (this.recordButton.isPressed() || this.flipButton.isPressed()) ? true : true;
            System.currentTimeMillis();
            this.touchX = clamp;
            if (Math.abs(clamp - this.cx) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(this.onRecordLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            }
            if (this.flipButton.isPressed()) {
                AndroidUtilities.runOnUIThread(this.onFlipLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (!this.touch) {
                return false;
            }
            this.touchX = Utilities.clamp(clamp, this.rightCx, this.leftCx);
            invalidate();
            if (this.recording && !this.flipButtonWasPressed && isPressed) {
                rotateFlip(180.0f);
                this.delegate.onFlipClick();
            }
            if (this.recording && this.longpressRecording) {
                this.delegate.onZoom(Utilities.clamp(((this.cy - AndroidUtilities.dp(48.0f)) - y) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f));
            }
        } else {
            if (action == 1 || action == 3) {
                if (!this.touch) {
                    return false;
                }
                this.touch = false;
                this.discardParentTouch = false;
                AndroidUtilities.cancelRunOnUIThread(this.onRecordLongPressRunnable);
                AndroidUtilities.cancelRunOnUIThread(this.onFlipLongPressRunnable);
                if (!this.recording && this.lockButton.isPressed()) {
                    this.delegate.onGalleryClick();
                } else if (this.recording && this.longpressRecording) {
                    if (this.lockButton.isPressed()) {
                        this.longpressRecording = false;
                        this.lockedT.set(1.0f, true);
                        this.delegate.onVideoRecordLocked();
                    } else {
                        this.recording = false;
                        this.recordingLoadingStart = SystemClock.elapsedRealtime();
                        this.recordingLoading = true;
                        this.delegate.onVideoRecordEnd(false);
                    }
                } else if (this.recordButton.isPressed()) {
                    if (!this.startModeIsVideo && !this.recording && !this.longpressRecording) {
                        this.delegate.onPhotoShoot();
                    } else if (!this.recording) {
                        if (this.delegate.canRecordAudio()) {
                            this.lastDuration = 0L;
                            this.recordingStart = System.currentTimeMillis();
                            this.showLock = false;
                            this.delegate.onVideoRecordStart(false, new Runnable() {
                                @Override
                                public final void run() {
                                    RecordControl.this.lambda$onTouchEvent$4();
                                }
                            });
                        }
                    } else {
                        this.recording = false;
                        this.recordingLoadingStart = SystemClock.elapsedRealtime();
                        this.recordingLoading = true;
                        this.delegate.onVideoRecordEnd(false);
                    }
                }
                this.longpressRecording = false;
                if (this.flipButton.isPressed()) {
                    rotateFlip(180.0f);
                    this.delegate.onFlipClick();
                }
                this.recordButton.setPressed(false);
                this.flipButton.setPressed(false);
                this.lockButton.setPressed(false);
                invalidate();
            }
            this.flipButtonWasPressed = isPressed;
            return z;
        }
        z = true;
        this.flipButtonWasPressed = isPressed;
        return z;
    }

    public void lambda$onTouchEvent$4() {
        this.recordingStart = System.currentTimeMillis();
        this.lastDuration = 0L;
        this.recording = true;
        this.delegate.onVideoDuration(0L);
    }

    public void stopRecording() {
        if (this.recording) {
            this.recording = false;
            this.recordingLoadingStart = SystemClock.elapsedRealtime();
            this.recordingLoading = true;
            this.delegate.onVideoRecordEnd(false);
            this.recordButton.setPressed(false);
            this.flipButton.setPressed(false);
            this.lockButton.setPressed(false);
            invalidate();
        }
    }

    public void stopRecordingLoading(boolean z) {
        this.recordingLoading = false;
        if (!z) {
            this.recordingLoadingT.set(false, true);
        }
        invalidate();
    }
}
