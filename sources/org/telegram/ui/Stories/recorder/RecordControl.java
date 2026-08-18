package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class RecordControl extends View implements FlashViews.Invertable {
    private final float HALF_PI;
    private boolean a11yPrevCheck;
    private boolean a11yPrevDual;
    private boolean a11yPrevLoading;
    private boolean a11yPrevRecording;
    private boolean a11yPrevShowLock;
    private boolean a11yPrevStartIsVideo;
    private RecordControlAccessibilityHelper accessibilityHelper;
    public float amplitude;
    public final AnimatedFloat animatedAmplitude;
    private final Paint buttonPaint;
    private final Paint buttonPaintWhite;
    private final PointF check1;
    private final PointF check2;
    private final PointF check3;
    private final AnimatedFloat checkAnimated;
    private final Paint checkPaint;
    private final Path checkPath;
    private final Path circlePath;
    private final AnimatedFloat collage;
    private float collageProgress;
    private final AnimatedFloat collageProgressAnimated;
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
    private final PointF h1;
    private final PointF h2;
    private final PointF h3;
    private final PointF h4;
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
    private final Path metaballsPath;
    private final CombinedDrawable noGalleryDrawable;
    private final Runnable onFlipLongPressRunnable;
    private final Runnable onRecordLongPressRunnable;
    private final Paint outlineFilledPaint;
    private final Paint outlinePaint;
    private float overrideStartModeIsVideoT;
    private final PointF p1;
    private final PointF p2;
    private final PointF p3;
    private final PointF p4;
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
    private long touchStart;
    private final AnimatedFloat touchT;
    private float touchX;
    private float touchY;
    private final Drawable unlockDrawable;

    public interface Delegate {

        public abstract class CC {
            public static long $default$getMaxVisibleVideoDuration(Delegate delegate) {
                return 60000L;
            }

            public static boolean $default$showStoriesDrafts(Delegate delegate) {
                return true;
            }
        }

        boolean canRecordAudio();

        long getMaxVideoDuration();

        long getMaxVisibleVideoDuration();

        void onCheckClick();

        void onFlipClick();

        void onFlipLongClick();

        void onGalleryClick();

        void onPhotoShoot();

        void onVideoDuration(long j);

        void onVideoRecordEnd(boolean z);

        void onVideoRecordLocked();

        void onVideoRecordStart(boolean z, Runnable runnable);

        void onZoom(float f);

        boolean showStoriesDrafts();
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
        Paint paint8 = new Paint(1);
        this.checkPaint = paint8;
        Matrix matrix = new Matrix();
        this.redMatrix = matrix;
        this.recordButton = new ButtonBounce(this);
        this.flipButton = new ButtonBounce(this);
        this.lockButton = new ButtonBounce(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.flipDrawableRotateT = new AnimatedFloat(this, 0L, 310L, cubicBezierInterpolator);
        this.dualT = new AnimatedFloat(this, 0L, 330L, cubicBezierInterpolator);
        this.checkPath = new Path();
        this.check1 = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.check2 = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.check3 = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
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
        this.collage = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.collageProgressAnimated = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.checkAnimated = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.onRecordLongPressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1();
            }
        };
        this.onFlipLongPressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$2();
            }
        };
        this.metaballsPath = new Path();
        this.circlePath = new Path();
        this.HALF_PI = 1.5707964f;
        this.p1 = new PointF();
        this.p2 = new PointF();
        this.p3 = new PointF();
        this.p4 = new PointF();
        this.h1 = new PointF();
        this.h2 = new PointF();
        this.h3 = new PointF();
        this.h4 = new PointF();
        setWillNotDraw(false);
        RecordControlAccessibilityHelper recordControlAccessibilityHelper = new RecordControlAccessibilityHelper(this);
        this.accessibilityHelper = recordControlAccessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, recordControlAccessibilityHelper);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.redGradient = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(this.redGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), -13750737), drawableMutate);
        this.noGalleryDrawable = combinedDrawable;
        combinedDrawable.setFullsize(false);
        combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        Resources resources = context.getResources();
        int i = R.drawable.msg_photo_switch2;
        Drawable drawableMutate2 = resources.getDrawable(i).mutate();
        this.flipDrawableWhite = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate3 = context.getResources().getDrawable(i).mutate();
        this.flipDrawableBlack = drawableMutate3;
        drawableMutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate4 = context.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.unlockDrawable = drawableMutate4;
        drawableMutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate5 = context.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.lockDrawable = drawableMutate5;
        drawableMutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate6 = context.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.pauseDrawable = drawableMutate6;
        drawableMutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        updateGalleryImage();
    }

    public void updateGalleryImage() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        Delegate delegate = this.delegate;
        if (delegate != null && delegate.showStoriesDrafts()) {
            ArrayList arrayList2 = MessagesController.getInstance(this.galleryImage.getCurrentAccount()).getStoriesController().getDraftsController().drafts;
            this.galleryImage.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((StoryEntry) arrayList2.get(0)).draftThumbFile != null) {
                this.galleryImage.setImage(ImageLocation.getForPath(((StoryEntry) arrayList2.get(0)).draftThumbFile.getAbsolutePath()), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        MediaController.PhotoEntry photoEntry = (albumEntry == null || (arrayList = albumEntry.photos) == null || arrayList.isEmpty()) ? null : albumEntry.photos.get(0);
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.galleryImage.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
            return;
        }
        if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.galleryImage.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
                return;
            }
            this.galleryImage.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.galleryImage.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
            return;
        }
        this.galleryImage.setImageBitmap(this.noGalleryDrawable);
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
        Drawable drawable = this.flipDrawableWhite;
        int iBlendARGB = ColorUtils.blendARGB(-1, -16777216, f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
        this.unlockDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, f), mode));
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
        int iDp = AndroidUtilities.dp(100.0f);
        float f = size;
        this.cx = f / 2.0f;
        this.cy = iDp / 2.0f;
        float fMin = Math.min(AndroidUtilities.dp(135.0f), f * 0.35f);
        float f2 = this.cx;
        this.leftCx = f2 - fMin;
        float f3 = f2 + fMin;
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
        setMeasuredDimension(size, iDp);
        RecordControlAccessibilityHelper recordControlAccessibilityHelper = this.accessibilityHelper;
        if (recordControlAccessibilityHelper != null) {
            recordControlAccessibilityHelper.invalidateRoot();
        }
    }

    private static void setDrawableBounds(Drawable drawable, float f, float f2) {
        setDrawableBounds(drawable, f, f2, Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f);
    }

    private static void setDrawableBounds(Drawable drawable, float f, float f2, float f3) {
        drawable.setBounds((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }

    public void setCollageProgress(float f, boolean z) {
        if (Math.abs(f - this.collageProgress) < 0.01f) {
            return;
        }
        this.collageProgress = f;
        if (!z) {
            this.collage.set(f > 0.0f && !this.recording, true);
            this.collageProgressAnimated.set(f, true);
        }
        invalidate();
    }

    public void lambda$new$1() {
        if (this.recording || hasCheck()) {
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
                this.f$0.lambda$new$0();
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
        if (this.recording || hasCheck()) {
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
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float fLerp;
        float f5;
        double dAcos;
        double dAcos2;
        float f6 = this.recordingT.set(this.recording ? 1.0f : 0.0f);
        float f7 = this.recordingLongT.set(this.recording ? 1.0f : 0.0f);
        float f8 = this.overrideStartModeIsVideoT;
        if (f8 < 0.0f) {
            f8 = this.startModeIsVideoT.set(this.startModeIsVideo ? 1.0f : 0.0f);
        }
        float fMax = Math.max(f6, f8);
        float f9 = this.touchT.set(this.touch ? 1.0f : 0.0f);
        float f10 = f9 * this.touchIsCenterT.set((Math.abs(this.touchX - this.cx) >= ((float) AndroidUtilities.dp(64.0f)) || !(this.recording || this.recordButton.isPressed())) ? 0.0f : 1.0f);
        float f11 = f9 * this.touchIsCenter2T.set(Math.abs(this.touchX - this.cx) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f);
        float fClamp = Utilities.clamp((this.touchX - this.cx) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float fClamp2 = Utilities.clamp((this.touchX - this.cx) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float f12 = f9 * this.touchIsButtonT.set(Math.min(Math.abs(this.touchX - this.rightCx), Math.abs(this.touchX - this.leftCx)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f);
        float f13 = 1.0f - f6;
        float f14 = this.collage.set(this.collageProgress > 0.0f) * f13;
        float f15 = this.collageProgressAnimated.set(this.collageProgress);
        float f16 = this.checkAnimated.set(hasCheck());
        float f17 = this.longpressRecording ? f6 * fMax * f9 : 0.0f;
        if (f17 > 0.0f) {
            float fDp = this.cx - AndroidUtilities.dp(50.0f);
            float fDp2 = AndroidUtilities.dp(50.0f) + this.cx;
            this.hintLinePaintWhite.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.hintLinePaintBlack.setStrokeWidth(AndroidUtilities.dp(2.0f));
            float f18 = f17;
            f = f16;
            f2 = f12;
            canvas.drawLine(fDp2, this.cy, AndroidUtilities.lerp(fDp2, this.rightCx - AndroidUtilities.dp(30.0f), f17), this.cy, this.hintLinePaintBlack);
            canvas.drawLine(fDp2, this.cy, AndroidUtilities.lerp(fDp2, this.rightCx - AndroidUtilities.dp(30.0f), f18), this.cy, this.hintLinePaintWhite);
            canvas.drawLine(fDp, this.cy, AndroidUtilities.lerp(fDp, this.leftCx + AndroidUtilities.dp(30.0f), f18), this.cy, this.hintLinePaintBlack);
            canvas.drawLine(fDp, this.cy, AndroidUtilities.lerp(fDp, this.leftCx + AndroidUtilities.dp(30.0f), f18), this.cy, this.hintLinePaintWhite);
        } else {
            f = f16;
            f2 = f12;
        }
        float f19 = this.cx;
        float fLerp2 = AndroidUtilities.lerp(f19, this.recordCx.set((AndroidUtilities.dp(4.0f) * fClamp) + f19), f10);
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), f6), AndroidUtilities.dp(32.0f) - (AndroidUtilities.dp(4.0f) * Math.abs(fClamp2)), f10);
        float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), f6), AndroidUtilities.dp(32.0f), f10);
        float fLerp5 = AndroidUtilities.lerp(this.recordButton.getScale(this.startModeIsVideo ? 0.0f : 0.2f), (this.animatedAmplitude.set(this.amplitude) * 0.2f) + 1.0f, f6);
        RectF rectF = AndroidUtilities.rectTmp;
        float f20 = fLerp2 - fLerp3;
        float f21 = this.cy;
        float f22 = fLerp2 + fLerp3;
        rectF.set(f20, f21 - fLerp3, f22, f21 + fLerp3);
        float f23 = 1.0f - f;
        this.mainPaint.setColor(ColorUtils.blendARGB(-1, -577231, fMax * f23));
        if (f > 0.0f) {
            canvas.save();
            canvas.scale(fLerp5, fLerp5, this.cx, this.cy);
            this.mainPaint.setAlpha((int) (f23 * 255.0f));
            canvas.drawRoundRect(rectF, fLerp4, fLerp4, this.mainPaint);
            canvas.restore();
            f3 = fLerp5;
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f3 = fLerp5;
            canvas.save();
        }
        float f24 = f3;
        canvas.scale(f24, f24, this.cx, this.cy);
        this.mainPaint.setAlpha(255);
        canvas.drawRoundRect(rectF, fLerp4, fLerp4, this.mainPaint);
        if (f > 0.0f) {
            this.checkPaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
            this.checkPath.rewind();
            Path path = this.checkPath;
            PointF pointF = this.check1;
            path.moveTo(pointF.x, pointF.y);
            float f25 = f / 0.3f;
            this.checkPath.lineTo(AndroidUtilities.lerp(this.check1.x, this.check2.x, Utilities.clamp(f25, 1.0f, 0.0f)), AndroidUtilities.lerp(this.check1.y, this.check2.y, Utilities.clamp(f25, 1.0f, 0.0f)));
            if (f > 0.3f) {
                float f26 = (f - 0.3f) / 0.7f;
                this.checkPath.lineTo(AndroidUtilities.lerp(this.check2.x, this.check3.x, Utilities.clamp(f26, 1.0f, 0.0f)), AndroidUtilities.lerp(this.check2.y, this.check3.y, Utilities.clamp(f26, 1.0f, 0.0f)));
            }
            canvas.translate(this.cx, this.cy);
            canvas.drawPath(this.checkPath, this.checkPaint);
        }
        canvas.restore();
        canvas.save();
        float fMax2 = Math.max(f24, 1.0f);
        canvas.scale(fMax2, fMax2, this.cx, this.cy);
        float fMax3 = Math.max(AndroidUtilities.dpf2(33.5f), fLerp3 + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), f10) + (AndroidUtilities.dp(5.0f) * f14 * (1.0f - f10)));
        float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f14);
        float fLerp7 = AndroidUtilities.lerp(fMax3, (fLerp3 - fLerp6) - AndroidUtilities.dp(4.0f), f);
        float f27 = this.cx;
        float f28 = this.cy;
        rectF.set(f27 - fLerp7, f28 - fLerp7, f27 + fLerp7, f28 + fLerp7);
        this.outlinePaint.setStrokeWidth(fLerp6);
        this.outlinePaint.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f14) * 255.0f * f23));
        canvas.drawCircle(this.cx, this.cy, fLerp7, this.outlinePaint);
        if ((f15 > 0.0f) & (f14 > 0.0f)) {
            this.outlinePaint.setAlpha(255);
            canvas.drawArc(rectF, -90.0f, f15 * 360.0f, false, this.outlinePaint);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.recordingStart;
        float f29 = this.recording ? 0.0f : 1.0f - f7;
        Delegate delegate = this.delegate;
        long maxVideoDuration = delegate != null ? delegate.getMaxVideoDuration() : 60000L;
        Delegate delegate2 = this.delegate;
        long maxVisibleVideoDuration = delegate2 != null ? delegate2.getMaxVisibleVideoDuration() : 60000L;
        float fMin = Math.min((jCurrentTimeMillis / (maxVisibleVideoDuration >= 0 ? maxVisibleVideoDuration : 60000L)) * 360.0f, 360.0f);
        float f30 = this.recordingLoadingT.set(this.recordingLoading);
        this.outlineFilledPaint.setStrokeWidth(fLerp6);
        this.outlineFilledPaint.setAlpha((int) (Math.max(f30 * 0.7f, 1.0f - f29) * 255.0f));
        if (f30 <= 0.0f) {
            canvas.drawArc(rectF, -90.0f, fMin, false, this.outlineFilledPaint);
        } else {
            CircularProgressDrawable.getSegments((SystemClock.elapsedRealtime() - this.recordingLoadingStart) % 5400, this.loadingSegments);
            invalidate();
            float[] fArr = this.loadingSegments;
            float f31 = fArr[0];
            float f32 = fArr[1];
            float fLerp8 = (f31 + f32) / 2.0f;
            float fAbs = Math.abs(f32 - f31) / 2.0f;
            if (this.recordingLoading) {
                float f33 = fMin / 2.0f;
                fLerp8 = AndroidUtilities.lerp((-90.0f) + f33, fLerp8, f30);
                fAbs = AndroidUtilities.lerp(f33, fAbs, f30);
            }
            canvas.drawArc(r5, fLerp8 - fAbs, fAbs * 2.0f, false, this.outlineFilledPaint);
        }
        if (this.recording) {
            invalidate();
            long j = jCurrentTimeMillis / 1000;
            if (j != this.lastDuration / 1000) {
                this.delegate.onVideoDuration(j);
            }
            if (maxVideoDuration > 0 && jCurrentTimeMillis >= maxVideoDuration) {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onDraw$3();
                    }
                });
            }
            this.lastDuration = jCurrentTimeMillis;
        }
        canvas.restore();
        if (this.showLock) {
            f4 = 0.2f;
            float scale = this.lockButton.getScale(0.2f) * f6;
            if (scale > 0.0f) {
                canvas.save();
                canvas.scale(scale, scale, this.leftCx, this.cy);
                canvas.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaint);
                canvas.rotate(-getRotation(), this.leftCx, this.cy);
                this.unlockDrawable.draw(canvas);
                canvas.restore();
            }
        } else {
            f4 = 0.2f;
        }
        float scale2 = this.lockButton.getScale(f4) * f13 * f23;
        if (scale2 > 0.0f) {
            canvas.save();
            canvas.scale(scale2, scale2, this.leftCx, this.cy);
            canvas.rotate(-getRotation(), this.leftCx, this.cy);
            this.galleryImage.draw(canvas);
            canvas.restore();
        }
        float f34 = this.dualT.set(this.dual ? 1.0f : 0.0f);
        if (f34 > 0.0f) {
            canvas.save();
            float scale3 = this.flipButton.getScale(f4) * f34 * f23;
            canvas.scale(scale3, scale3, this.rightCx, this.cy);
            canvas.rotate(this.flipDrawableRotateT.set(this.flipDrawableRotate) - getRotation(), this.rightCx, this.cy);
            canvas.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaintWhite);
            this.flipDrawableBlack.draw(canvas);
            canvas.restore();
        }
        if (f34 < 1.0f) {
            canvas.save();
            float scale4 = this.flipButton.getScale(f4) * (1.0f - f34) * f23;
            canvas.scale(scale4, scale4, this.rightCx, this.cy);
            canvas.rotate(this.flipDrawableRotateT.set(this.flipDrawableRotate) - getRotation(), this.rightCx, this.cy);
            canvas.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaint);
            this.flipDrawableWhite.draw(canvas);
            canvas.restore();
        }
        if (!this.longpressRecording || hasCheck()) {
            fLerp = 0.0f;
        } else {
            float f35 = f2;
            fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(8.0f) * Math.abs(fClamp2)), AndroidUtilities.dp(22.0f), f35), Math.max(f35, f10)) * f9 * fMax * f6;
        }
        float f36 = this.lockedT.set((this.longpressRecording || !this.recording) ? 0.0f : 1.0f);
        if (fLerp > 0.0f) {
            this.redPaint.setAlpha(255);
            canvas.drawCircle(this.touchX, this.cy, fLerp, this.redPaint);
            float f37 = this.touchX;
            float fClamp3 = Utilities.clamp(1.0f - ((Math.abs(fClamp2) * f9) / 1.3f), 1.0f, 0.0f);
            float fAbs2 = Math.abs(fLerp2 - f37);
            float f38 = fLerp * 2.0f;
            if (fAbs2 >= fLerp3 + f38 || fClamp3 >= 0.6f) {
                f5 = f6;
            } else {
                float f39 = fLerp3 + fLerp;
                if (fAbs2 < f39) {
                    float f40 = fLerp3 * fLerp3;
                    float f41 = fAbs2 * fAbs2;
                    float f42 = fLerp * fLerp;
                    dAcos = Math.acos(((f40 + f41) - f42) / ((fLerp3 * 2.0f) * fAbs2));
                    dAcos2 = Math.acos(((f42 + f41) - f40) / (f38 * fAbs2));
                } else {
                    dAcos = 0.0d;
                    dAcos2 = 0.0d;
                }
                double d = f37 > fLerp2 ? 0.0d : 3.141592653589793d;
                double dAcos3 = (float) Math.acos((fLerp3 - fLerp) / fAbs2);
                f5 = f6;
                double d2 = fClamp3;
                double d3 = (dAcos3 - dAcos) * d2;
                double d4 = d + dAcos + d3;
                double d5 = (d - dAcos) - d3;
                double d6 = ((3.141592653589793d - dAcos2) - dAcos3) * d2;
                double d7 = ((d + 3.141592653589793d) - dAcos2) - d6;
                double d8 = (d - 3.141592653589793d) + dAcos2 + d6;
                getVector(fLerp2, this.cy, d4, fLerp3, this.p1);
                getVector(fLerp2, this.cy, d5, fLerp3, this.p2);
                float f43 = fLerp;
                getVector(f37, this.cy, d7, f43, this.p3);
                getVector(f37, this.cy, d8, f43, this.p4);
                float fMin2 = Math.min(fClamp3 * 2.4f, dist(this.p1, this.p3) / f39) * Math.min(1.0f, (fAbs2 * 2.0f) / f39);
                float f44 = fLerp3 * fMin2;
                float f45 = fLerp * fMin2;
                PointF pointF2 = this.p1;
                getVector(pointF2.x, pointF2.y, d4 - 1.5707963705062866d, f44, this.h1);
                PointF pointF3 = this.p2;
                getVector(pointF3.x, pointF3.y, d5 + 1.5707963705062866d, f44, this.h2);
                PointF pointF4 = this.p3;
                getVector(pointF4.x, pointF4.y, d7 + 1.5707963705062866d, f45, this.h3);
                PointF pointF5 = this.p4;
                getVector(pointF5.x, pointF5.y, d8 - 1.5707963705062866d, f45, this.h4);
                float f46 = f9 * fMax * f5 * f11;
                if (f46 > 0.0f) {
                    this.metaballsPath.rewind();
                    Path path2 = this.metaballsPath;
                    PointF pointF6 = this.p1;
                    path2.moveTo(pointF6.x, pointF6.y);
                    Path path3 = this.metaballsPath;
                    PointF pointF7 = this.h1;
                    float f47 = pointF7.x;
                    float f48 = pointF7.y;
                    PointF pointF8 = this.h3;
                    float f49 = pointF8.x;
                    float f50 = pointF8.y;
                    PointF pointF9 = this.p3;
                    path3.cubicTo(f47, f48, f49, f50, pointF9.x, pointF9.y);
                    Path path4 = this.metaballsPath;
                    PointF pointF10 = this.p4;
                    path4.lineTo(pointF10.x, pointF10.y);
                    Path path5 = this.metaballsPath;
                    PointF pointF11 = this.h4;
                    float f51 = pointF11.x;
                    float f52 = pointF11.y;
                    PointF pointF12 = this.h2;
                    float f53 = pointF12.x;
                    float f54 = pointF12.y;
                    PointF pointF13 = this.p2;
                    path5.cubicTo(f51, f52, f53, f54, pointF13.x, pointF13.y);
                    Path path6 = this.metaballsPath;
                    PointF pointF14 = this.p1;
                    path6.lineTo(pointF14.x, pointF14.y);
                    this.redPaint.setAlpha((int) (f46 * 255.0f));
                    canvas.drawPath(this.metaballsPath, this.redPaint);
                    float f55 = this.cy;
                    r5.set(f20, f55 - fLerp3, f22, f55 + fLerp3);
                    canvas.drawRoundRect(r5, fLerp4, fLerp4, this.redPaint);
                }
            }
        } else {
            f5 = f6;
        }
        if (fLerp > 0.0f || f36 > 0.0f) {
            float scale5 = this.lockButton.getScale(0.2f) * f5 * f23;
            canvas.save();
            this.circlePath.rewind();
            if (fLerp > 0.0f) {
                this.circlePath.addCircle(this.touchX, this.cy, fLerp, Path.Direction.CW);
            }
            if (f36 > 0.0f && this.showLock) {
                this.circlePath.addCircle(this.leftCx, this.cy, f36 * AndroidUtilities.dp(22.0f) * scale5, Path.Direction.CW);
            }
            canvas.clipPath(this.circlePath);
            if (this.showLock) {
                canvas.save();
                canvas.scale(scale5, scale5, this.leftCx, this.cy);
                canvas.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaintWhite);
                canvas.rotate(-getRotation(), this.leftCx, this.cy);
                this.lockDrawable.draw(canvas);
                canvas.restore();
            }
            float scale6 = this.flipButton.getScale(0.2f) * f23;
            canvas.save();
            canvas.scale(scale6, scale6, this.rightCx, this.cy);
            canvas.rotate(this.flipDrawableRotateT.set(this.flipDrawableRotate) - getRotation(), this.rightCx, this.cy);
            canvas.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaintWhite);
            this.flipDrawableBlack.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        notifyAccessibilityIfChanged();
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

    public boolean hasCheck() {
        return this.collageProgress >= 1.0f;
    }

    private void getVector(float f, float f2, double d, float f3, PointF pointF) {
        double d2 = f3;
        pointF.x = (float) (((double) f) + (Math.cos(d) * d2));
        pointF.y = (float) (((double) f2) + (Math.sin(d) * d2));
    }

    private float dist(PointF pointF, PointF pointF2) {
        return MathUtils.distance(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    public void rotateFlip(float f) {
        this.flipDrawableRotateT.setDuration(f > 180.0f ? 620L : 310L);
        this.flipDrawableRotate += f;
        invalidate();
    }

    private boolean isPressed(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.recording) {
            return (!z || f4 - f2 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f3 - f) <= f5;
        }
        return MathUtils.distance(f, f2, f3, f4) <= f5;
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
        float fClamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.rightCx, this.leftCx);
        float y = motionEvent.getY() + 0.0f;
        boolean zIsPressed = isPressed(fClamp, y, this.rightCx, this.cy, AndroidUtilities.dp(7.0f), true);
        boolean z = true;
        if (this.recordingLoading) {
            this.recordButton.setPressed(false);
            this.flipButton.setPressed(false);
            this.lockButton.setPressed(false);
        } else if (action == 0 || this.touch) {
            this.recordButton.setPressed(isPressed(fClamp, y, this.cx, this.cy, AndroidUtilities.dp(60.0f), false));
            this.flipButton.setPressed(isPressed(fClamp, y, this.rightCx, this.cy, (float) AndroidUtilities.dp(30.0f), true) && !hasCheck());
            this.lockButton.setPressed(isPressed(fClamp, y, this.leftCx, this.cy, (float) AndroidUtilities.dp(30.0f), false) && !hasCheck());
        }
        if (action == 0) {
            this.touch = true;
            this.discardParentTouch = this.recordButton.isPressed() || this.flipButton.isPressed();
            this.touchStart = System.currentTimeMillis();
            this.touchX = fClamp;
            this.touchY = y;
            if (Math.abs(fClamp - this.cx) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(this.onRecordLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            }
            if (this.flipButton.isPressed()) {
                AndroidUtilities.runOnUIThread(this.onFlipLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (!this.touch) {
                return false;
            }
            this.touchX = Utilities.clamp(fClamp, this.rightCx, this.leftCx);
            this.touchY = y;
            invalidate();
            if (this.recording && !this.flipButtonWasPressed && zIsPressed) {
                rotateFlip(180.0f);
                this.delegate.onFlipClick();
            }
            if (this.recording && this.longpressRecording) {
                this.delegate.onZoom(Utilities.clamp(((this.cy - AndroidUtilities.dp(48.0f)) - y) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f));
            }
        } else if (action != 1 && action != 3) {
            z = false;
        } else {
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
                if (hasCheck()) {
                    this.delegate.onCheckClick();
                } else if (!this.startModeIsVideo && !this.recording && !this.longpressRecording) {
                    this.delegate.onPhotoShoot();
                } else if (!this.recording) {
                    if (this.delegate.canRecordAudio()) {
                        this.lastDuration = 0L;
                        this.recordingStart = System.currentTimeMillis();
                        this.showLock = false;
                        this.delegate.onVideoRecordStart(false, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onTouchEvent$4();
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
        this.flipButtonWasPressed = zIsPressed;
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

    @Override
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        RecordControlAccessibilityHelper recordControlAccessibilityHelper = this.accessibilityHelper;
        if (recordControlAccessibilityHelper == null || !recordControlAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    private void notifyAccessibilityIfChanged() {
        if (this.accessibilityHelper == null) {
            return;
        }
        boolean zHasCheck = hasCheck();
        boolean z = this.a11yPrevRecording;
        boolean z2 = this.recording;
        if (z == z2 && this.a11yPrevCheck == zHasCheck && this.a11yPrevDual == this.dual && this.a11yPrevStartIsVideo == this.startModeIsVideo && this.a11yPrevLoading == this.recordingLoading && this.a11yPrevShowLock == this.showLock) {
            return;
        }
        this.a11yPrevRecording = z2;
        this.a11yPrevCheck = zHasCheck;
        this.a11yPrevDual = this.dual;
        this.a11yPrevStartIsVideo = this.startModeIsVideo;
        this.a11yPrevLoading = this.recordingLoading;
        this.a11yPrevShowLock = this.showLock;
        this.accessibilityHelper.invalidateRoot();
    }

    class RecordControlAccessibilityHelper extends ExploreByTouchHelper {
        private final Rect tmpRect;

        RecordControlAccessibilityHelper(View view) {
            super(view);
            this.tmpRect = new Rect();
        }

        @Override
        protected int getVirtualViewAt(float f, float f2) {
            if (Math.abs(f - RecordControl.this.leftCx) <= AndroidUtilities.dp(30.0f) && Math.abs(f2 - RecordControl.this.cy) <= AndroidUtilities.dp(30.0f) && !RecordControl.this.hasCheck() && !RecordControl.this.recordingLoading) {
                return 0;
            }
            if (Math.abs(f - RecordControl.this.rightCx) > AndroidUtilities.dp(30.0f) || Math.abs(f2 - RecordControl.this.cy) > AndroidUtilities.dp(30.0f) || RecordControl.this.hasCheck() || RecordControl.this.recordingLoading) {
                return (Math.abs(f - RecordControl.this.cx) > ((float) AndroidUtilities.dp(60.0f)) || Math.abs(f2 - RecordControl.this.cy) > ((float) AndroidUtilities.dp(60.0f))) ? Integer.MIN_VALUE : 1;
            }
            return 2;
        }

        @Override
        protected void getVisibleVirtualViews(List list) {
            if (!RecordControl.this.hasCheck() && !RecordControl.this.recordingLoading) {
                list.add(0);
            }
            list.add(1);
            if (RecordControl.this.hasCheck() || RecordControl.this.recordingLoading) {
                return;
            }
            list.add(2);
        }

        @Override
        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            String string2;
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            boolean z = false;
            if (i == 0) {
                float fDp = AndroidUtilities.dp(22.0f);
                this.tmpRect.set((int) (RecordControl.this.leftCx - fDp), (int) (RecordControl.this.cy - fDp), (int) (RecordControl.this.leftCx + fDp), (int) (RecordControl.this.cy + fDp));
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                if (RecordControl.this.recording && RecordControl.this.showLock) {
                    string = LocaleController.getString(R.string.AccDescrLockRecording);
                } else {
                    string = LocaleController.getString(R.string.AccDescrCameraGallery);
                }
                accessibilityNodeInfoCompat.setContentDescription(string);
                if (!RecordControl.this.recordingLoading && !RecordControl.this.hasCheck()) {
                    z = true;
                }
                accessibilityNodeInfoCompat.setEnabled(z);
                if (z) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    return;
                }
                return;
            }
            if (i == 1) {
                float fDp2 = AndroidUtilities.dp(40.0f);
                this.tmpRect.set((int) (RecordControl.this.cx - fDp2), (int) (RecordControl.this.cy - fDp2), (int) (RecordControl.this.cx + fDp2), (int) (RecordControl.this.cy + fDp2));
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                if (!RecordControl.this.hasCheck()) {
                    if (!RecordControl.this.recording) {
                        if (RecordControl.this.startModeIsVideo) {
                            string2 = LocaleController.getString(R.string.AccDescrStartRecording);
                        } else {
                            string2 = LocaleController.getString(R.string.AccDescrTakePhoto);
                        }
                    } else {
                        string2 = LocaleController.getString(R.string.AccDescrStopRecording);
                    }
                } else {
                    string2 = LocaleController.getString(R.string.Send);
                }
                accessibilityNodeInfoCompat.setContentDescription(string2);
                accessibilityNodeInfoCompat.setEnabled(!RecordControl.this.recordingLoading);
                if (RecordControl.this.recordingLoading) {
                    return;
                }
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                return;
            }
            if (i == 2) {
                float fDp3 = AndroidUtilities.dp(22.0f);
                this.tmpRect.set((int) (RecordControl.this.rightCx - fDp3), (int) (RecordControl.this.cy - fDp3), (int) (RecordControl.this.rightCx + fDp3), (int) (RecordControl.this.cy + fDp3));
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                accessibilityNodeInfoCompat.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
                if (!RecordControl.this.recordingLoading && !RecordControl.this.hasCheck()) {
                    z = true;
                }
                accessibilityNodeInfoCompat.setEnabled(z);
                if (z) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    return;
                }
                return;
            }
            this.tmpRect.set(0, 0, 1, 1);
            accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
            accessibilityNodeInfoCompat.setVisibleToUser(false);
            accessibilityNodeInfoCompat.setContentDescription("");
        }

        @Override
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (RecordControl.this.delegate == null || RecordControl.this.recordingLoading || i2 != 16) {
                return false;
            }
            if (i == 0) {
                if (RecordControl.this.hasCheck()) {
                    return false;
                }
                if (!RecordControl.this.recording || !RecordControl.this.showLock) {
                    RecordControl.this.delegate.onGalleryClick();
                } else {
                    RecordControl.this.longpressRecording = false;
                    RecordControl.this.lockedT.set(1.0f, true);
                    RecordControl.this.delegate.onVideoRecordLocked();
                    RecordControl.this.invalidate();
                }
                return true;
            }
            if (i == 1) {
                if (RecordControl.this.hasCheck()) {
                    RecordControl.this.delegate.onCheckClick();
                } else if (RecordControl.this.recording) {
                    RecordControl.this.recording = false;
                    RecordControl.this.longpressRecording = false;
                    RecordControl.this.recordingLoadingStart = SystemClock.elapsedRealtime();
                    RecordControl.this.recordingLoading = true;
                    RecordControl.this.delegate.onVideoRecordEnd(false);
                    RecordControl.this.invalidate();
                } else if (RecordControl.this.startModeIsVideo) {
                    if (RecordControl.this.delegate.canRecordAudio()) {
                        RecordControl.this.lastDuration = 0L;
                        RecordControl.this.recordingStart = System.currentTimeMillis();
                        RecordControl.this.showLock = false;
                        RecordControl.this.delegate.onVideoRecordStart(false, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onPerformActionForVirtualView$0();
                            }
                        });
                    }
                } else {
                    RecordControl.this.delegate.onPhotoShoot();
                }
                return true;
            }
            if (i != 2 || RecordControl.this.hasCheck()) {
                return false;
            }
            RecordControl.this.rotateFlip(180.0f);
            RecordControl.this.delegate.onFlipClick();
            return true;
        }

        public void lambda$onPerformActionForVirtualView$0() {
            RecordControl.this.recordingStart = System.currentTimeMillis();
            RecordControl.this.lastDuration = 0L;
            RecordControl.this.recording = true;
            RecordControl.this.delegate.onVideoDuration(RecordControl.this.lastDuration);
            RecordControl.this.invalidate();
        }
    }
}
