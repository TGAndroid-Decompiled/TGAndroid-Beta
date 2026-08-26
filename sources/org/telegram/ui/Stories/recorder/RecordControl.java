package org.telegram.ui.Stories.recorder;

import android.app.Activity;
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
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public final class RecordControl extends View implements FlashViews.Invertable {
    public boolean a11yPrevCheck;
    public boolean a11yPrevDual;
    public boolean a11yPrevLoading;
    public boolean a11yPrevRecording;
    public boolean a11yPrevShowLock;
    public boolean a11yPrevStartIsVideo;
    public final RecordControlAccessibilityHelper accessibilityHelper;
    public float amplitude;
    public final AnimatedFloat animatedAmplitude;
    public final Paint buttonPaint;
    public final Paint buttonPaintWhite;
    public final PointF check1;
    public final PointF check2;
    public final PointF check3;
    public final AnimatedFloat checkAnimated;
    public final Paint checkPaint;
    public final Path checkPath;
    public final Path circlePath;
    public final AnimatedFloat collage;
    public float collageProgress;
    public final AnimatedFloat collageProgressAnimated;
    public float cx;
    public float cy;
    public Delegate delegate;
    public boolean discardParentTouch;
    public boolean dual;
    public final AnimatedFloat dualT;
    public final ButtonBounce flipButton;
    public boolean flipButtonWasPressed;
    public final Drawable flipDrawableBlack;
    public float flipDrawableRotate;
    public final AnimatedFloat flipDrawableRotateT;
    public final Drawable flipDrawableWhite;
    public final ImageReceiver galleryImage;
    public final PointF h1;
    public final PointF h2;
    public final PointF h3;
    public final PointF h4;
    public final Paint hintLinePaintBlack;
    public final Paint hintLinePaintWhite;
    public long lastDuration;
    public float leftCx;
    public final float[] loadingSegments;
    public final ButtonBounce lockButton;
    public final Drawable lockDrawable;
    public final AnimatedFloat lockedT;
    public boolean longpressRecording;
    public final Paint mainPaint;
    public final Path metaballsPath;
    public final CombinedDrawable noGalleryDrawable;
    public final RecordControl$$ExternalSyntheticLambda2 onFlipLongPressRunnable;
    public final RecordControl$$ExternalSyntheticLambda2 onRecordLongPressRunnable;
    public final Paint outlineFilledPaint;
    public final Paint outlinePaint;
    public float overrideStartModeIsVideoT;
    public final PointF p1;
    public final PointF p2;
    public final PointF p3;
    public final PointF p4;
    public final Drawable pauseDrawable;
    public final ButtonBounce recordButton;
    public final AnimatedFloat recordCx;
    public boolean recording;
    public boolean recordingLoading;
    public long recordingLoadingStart;
    public final AnimatedFloat recordingLoadingT;
    public final AnimatedFloat recordingLongT;
    public long recordingStart;
    public final AnimatedFloat recordingT;
    public final RadialGradient redGradient;
    public final Matrix redMatrix;
    public final Paint redPaint;
    public float rightCx;
    public boolean showLock;
    public boolean startModeIsVideo;
    public final AnimatedFloat startModeIsVideoT;
    public boolean touch;
    public final AnimatedFloat touchIsButtonT;
    public final AnimatedFloat touchIsCenter2T;
    public final AnimatedFloat touchIsCenterT;
    public final AnimatedFloat touchT;
    public float touchX;
    public final Drawable unlockDrawable;

    public interface Delegate {
    }

    public final class RecordControlAccessibilityHelper extends ExploreByTouchHelper {
        public final Rect tmpRect;

        public RecordControlAccessibilityHelper(RecordControl recordControl) {
            super(recordControl);
            this.tmpRect = new Rect();
        }

        @Override
        public final int getVirtualViewAt(float f, float f2) {
            RecordControl recordControl = RecordControl.this;
            if (Math.abs(f - recordControl.leftCx) <= AndroidUtilities.dp(30.0f) && Math.abs(f2 - recordControl.cy) <= AndroidUtilities.dp(30.0f) && !recordControl.hasCheck() && !recordControl.recordingLoading) {
                return 0;
            }
            if (Math.abs(f - recordControl.rightCx) > AndroidUtilities.dp(30.0f) || Math.abs(f2 - recordControl.cy) > AndroidUtilities.dp(30.0f) || recordControl.hasCheck() || recordControl.recordingLoading) {
                return (Math.abs(f - recordControl.cx) > ((float) AndroidUtilities.dp(60.0f)) || Math.abs(f2 - recordControl.cy) > ((float) AndroidUtilities.dp(60.0f))) ? Integer.MIN_VALUE : 1;
            }
            return 2;
        }

        @Override
        public final void getVisibleVirtualViews(ArrayList arrayList) {
            RecordControl recordControl = RecordControl.this;
            if (!recordControl.hasCheck() && !recordControl.recordingLoading) {
                arrayList.add(0);
            }
            arrayList.add(1);
            if (recordControl.hasCheck() || recordControl.recordingLoading) {
                return;
            }
            arrayList.add(2);
        }

        @Override
        public final boolean onPerformActionForVirtualView(int i, int i2) {
            RecordControl recordControl = RecordControl.this;
            if (recordControl.delegate != null && !recordControl.recordingLoading && i2 == 16) {
                if (i != 0) {
                    if (i == 1) {
                        if (recordControl.hasCheck()) {
                            ((StoryRecorder.AnonymousClass13) recordControl.delegate).onCheckClick();
                            return true;
                        }
                        if (recordControl.recording) {
                            recordControl.recording = false;
                            recordControl.longpressRecording = false;
                            recordControl.recordingLoadingStart = SystemClock.elapsedRealtime();
                            recordControl.recordingLoading = true;
                            ((StoryRecorder.AnonymousClass13) recordControl.delegate).onVideoRecordEnd(false);
                            recordControl.invalidate();
                            return true;
                        }
                        if (!recordControl.startModeIsVideo) {
                            ((StoryRecorder.AnonymousClass13) recordControl.delegate).onPhotoShoot();
                            return true;
                        }
                        if (StoryRecorder.access$9600(StoryRecorder.this)) {
                            recordControl.lastDuration = 0L;
                            recordControl.recordingStart = System.currentTimeMillis();
                            recordControl.showLock = false;
                            ((StoryRecorder.AnonymousClass13) recordControl.delegate).onVideoRecordStart(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 14), false);
                            return true;
                        }
                        return true;
                    }
                    if (i == 2 && !recordControl.hasCheck()) {
                        recordControl.rotateFlip(180.0f);
                        ((StoryRecorder.AnonymousClass13) recordControl.delegate).onFlipClick();
                        return true;
                    }
                } else if (!recordControl.hasCheck()) {
                    if (recordControl.recording && recordControl.showLock) {
                        recordControl.longpressRecording = false;
                        recordControl.lockedT.set(1.0f, true);
                        HintTextView hintTextView = StoryRecorder.this.hintTextView;
                        hintTextView.textDrawable.setText(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        hintTextView.invalidate();
                        recordControl.invalidate();
                        return true;
                    }
                    StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) recordControl.delegate;
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    if (storyRecorder.currentPage == 0 && !storyRecorder.takingPhoto && !storyRecorder.takingVideo && StoryRecorder.access$12000(storyRecorder)) {
                        StoryRecorder.this.animateGalleryListView(true);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
            boolean z = false;
            Rect rect = this.tmpRect;
            RecordControl recordControl = RecordControl.this;
            if (i == 0) {
                int iDp = AndroidUtilities.dp(22.0f);
                float f = recordControl.leftCx;
                float f2 = iDp;
                float f3 = recordControl.cy;
                rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setContentDescription((recordControl.recording && recordControl.showLock) ? LocaleController.getString(R.string.AccDescrLockRecording) : LocaleController.getString(R.string.AccDescrCameraGallery));
                if (!recordControl.recordingLoading && !recordControl.hasCheck()) {
                    z = true;
                }
                accessibilityNodeInfo.setEnabled(z);
                if (z) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    return;
                }
                return;
            }
            if (i == 1) {
                int iDp2 = AndroidUtilities.dp(40.0f);
                float f4 = recordControl.cx;
                float f5 = iDp2;
                float f6 = recordControl.cy;
                rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                if (recordControl.hasCheck()) {
                    string = LocaleController.getString(R.string.Send);
                } else if (recordControl.recording) {
                    string = LocaleController.getString(R.string.AccDescrStopRecording);
                } else {
                    string = recordControl.startModeIsVideo ? LocaleController.getString(R.string.AccDescrStartRecording) : LocaleController.getString(R.string.AccDescrTakePhoto);
                }
                accessibilityNodeInfoCompat.setContentDescription(string);
                accessibilityNodeInfo.setEnabled(!recordControl.recordingLoading);
                if (recordControl.recordingLoading) {
                    return;
                }
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                return;
            }
            if (i != 2) {
                rect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                accessibilityNodeInfoCompat.setContentDescription("");
                return;
            }
            int iDp3 = AndroidUtilities.dp(22.0f);
            float f7 = recordControl.rightCx;
            float f8 = iDp3;
            float f9 = recordControl.cy;
            rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
            if (!recordControl.recordingLoading && !recordControl.hasCheck()) {
                z = true;
            }
            accessibilityNodeInfo.setEnabled(z);
            if (z) {
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }
        }
    }

    public RecordControl(Activity activity) {
        super(activity);
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
        this.recordButton = new ButtonBounce(this, 1.0f, 5.0f);
        this.flipButton = new ButtonBounce(this, 1.0f, 5.0f);
        this.lockButton = new ButtonBounce(this, 1.0f, 5.0f);
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
        this.onRecordLongPressRunnable = new RecordControl$$ExternalSyntheticLambda2(this, 2);
        this.onFlipLongPressRunnable = new RecordControl$$ExternalSyntheticLambda2(this, 3);
        this.metaballsPath = new Path();
        this.circlePath = new Path();
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
        paint5.setShader(radialGradient);
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
            BlendMode unused = BlendMode.CLEAR;
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), -13750737), drawableMutate);
        this.noGalleryDrawable = combinedDrawable;
        combinedDrawable.fullSize = false;
        int iDp = AndroidUtilities.dp(24.0f);
        int iDp2 = AndroidUtilities.dp(24.0f);
        combinedDrawable.iconWidth = iDp;
        combinedDrawable.iconHeight = iDp2;
        Resources resources = activity.getResources();
        int i = R.drawable.msg_photo_switch2;
        Drawable drawableMutate2 = resources.getDrawable(i).mutate();
        this.flipDrawableWhite = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate3 = activity.getResources().getDrawable(i).mutate();
        this.flipDrawableBlack = drawableMutate3;
        drawableMutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.unlockDrawable = drawableMutate4;
        drawableMutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.lockDrawable = drawableMutate5;
        drawableMutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.pauseDrawable = drawableMutate6;
        drawableMutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        updateGalleryImage();
    }

    public static void getVector(float f, float f2, double d, float f3, PointF pointF) {
        double d2 = f3;
        pointF.x = (float) ((Math.cos(d) * d2) + ((double) f));
        pointF.y = (float) ((Math.sin(d) * d2) + ((double) f2));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        RecordControlAccessibilityHelper recordControlAccessibilityHelper = this.accessibilityHelper;
        if (recordControlAccessibilityHelper == null || !recordControlAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final boolean hasCheck() {
        return this.collageProgress >= 1.0f;
    }

    public final boolean isPressed(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.recording) {
            return (!z || f4 - f2 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f3 - f) <= f5;
        }
        return MathUtils.distance(f, f2, f3, f4) <= f5;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.galleryImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.galleryImage.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        char c;
        float f5;
        float f6;
        Canvas canvas2;
        float f7;
        RectF rectF;
        Paint paint;
        float f8;
        RectF rectF2;
        Canvas canvas3;
        float f9;
        float fLerp;
        float f10;
        float f11;
        float scale;
        Path path;
        boolean zHasCheck;
        boolean z;
        boolean z2;
        double d;
        double dAcos;
        float f12 = this.recordingT.set(this.recording ? 1.0f : 0.0f, false);
        float f13 = this.recordingLongT.set(this.recording ? 1.0f : 0.0f, false);
        float f14 = this.overrideStartModeIsVideoT;
        if (f14 < 0.0f) {
            f14 = this.startModeIsVideoT.set(this.startModeIsVideo ? 1.0f : 0.0f, false);
        }
        float fMax = Math.max(f12, f14);
        float f15 = this.touchT.set(this.touch ? 1.0f : 0.0f, false);
        float fAbs = Math.abs(this.touchX - this.cx);
        float fDp = AndroidUtilities.dp(64.0f);
        ButtonBounce buttonBounce = this.recordButton;
        float f16 = this.touchIsCenterT.set((fAbs >= fDp || !(this.recording || buttonBounce.isPressed)) ? 0.0f : 1.0f, false) * f15;
        float f17 = this.touchIsCenter2T.set(Math.abs(this.touchX - this.cx) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * f15;
        float fClamp = Utilities.clamp((this.touchX - this.cx) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float fClamp2 = Utilities.clamp((this.touchX - this.cx) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float f18 = this.touchIsButtonT.set(Math.min(Math.abs(this.touchX - this.rightCx), Math.abs(this.touchX - this.leftCx)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * f15;
        float f19 = 1.0f - f12;
        float f20 = this.collage.set(this.collageProgress > 0.0f) * f19;
        float f21 = this.collageProgressAnimated.set(this.collageProgress, false);
        float f22 = this.checkAnimated.set(hasCheck());
        float f23 = this.longpressRecording ? f12 * fMax * f15 : 0.0f;
        if (f23 > 0.0f) {
            f5 = 1.0f;
            float fDp2 = this.cx - AndroidUtilities.dp(50.0f);
            f6 = 0.0f;
            float fDp3 = this.cx + AndroidUtilities.dp(50.0f);
            Paint paint2 = this.hintLinePaintWhite;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = this.hintLinePaintBlack;
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            float f24 = f23;
            f2 = f20;
            f4 = f13;
            f = f17;
            c = 1;
            f3 = f22;
            canvas.drawLine(fDp3, this.cy, AndroidUtilities.lerp(fDp3, this.rightCx - AndroidUtilities.dp(30.0f), f23), this.cy, paint3);
            canvas.drawLine(fDp3, this.cy, AndroidUtilities.lerp(fDp3, this.rightCx - AndroidUtilities.dp(30.0f), f24), this.cy, paint2);
            canvas.drawLine(fDp2, this.cy, AndroidUtilities.lerp(fDp2, this.leftCx + AndroidUtilities.dp(30.0f), f24), this.cy, paint3);
            canvas2 = canvas;
            canvas2.drawLine(fDp2, this.cy, AndroidUtilities.lerp(fDp2, this.leftCx + AndroidUtilities.dp(30.0f), f24), this.cy, paint2);
        } else {
            f = f17;
            f2 = f20;
            f3 = f22;
            f4 = f13;
            c = 1;
            f5 = 1.0f;
            f6 = 0.0f;
            canvas2 = canvas;
        }
        float f25 = this.cx;
        float fLerp2 = AndroidUtilities.lerp(f25, this.recordCx.set((AndroidUtilities.dp(4.0f) * fClamp) + f25, false), f16);
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), f12), AndroidUtilities.dp(32.0f) - (Math.abs(fClamp2) * AndroidUtilities.dp(4.0f)), f16);
        float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), f12), AndroidUtilities.dp(32.0f), f16);
        float fLerp5 = AndroidUtilities.lerp(buttonBounce.getScale(this.startModeIsVideo ? 0.0f : 0.2f), (this.animatedAmplitude.set(this.amplitude, false) * 0.2f) + f5, f12);
        RectF rectF3 = AndroidUtilities.rectTmp;
        float f26 = fLerp2 - fLerp3;
        float f27 = this.cy;
        float f28 = fLerp2 + fLerp3;
        rectF3.set(f26, f27 - fLerp3, f28, f27 + fLerp3);
        Paint paint4 = this.mainPaint;
        float f29 = f5 - f3;
        paint4.setColor(ColorUtils.blendARGB(fMax * f29, -1, -577231));
        if (f3 > f6) {
            canvas2.save();
            canvas2.scale(fLerp5, fLerp5, this.cx, this.cy);
            paint4.setAlpha((int) (f29 * 255.0f));
            canvas2.drawRoundRect(rectF3, fLerp4, fLerp4, paint4);
            canvas2.restore();
            f7 = fLerp5;
            rectF = rectF3;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f7 = fLerp5;
            rectF = rectF3;
            paint = paint4;
            canvas2.save();
        }
        canvas2.scale(f7, f7, this.cx, this.cy);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, fLerp4, fLerp4, paint);
        if (f3 > f6) {
            Paint paint5 = this.checkPaint;
            paint5.setStrokeWidth(AndroidUtilities.dp(4.0f));
            Path path2 = this.checkPath;
            path2.rewind();
            PointF pointF = this.check1;
            f8 = 0.7f;
            path2.moveTo(pointF.x, pointF.y);
            float f30 = pointF.x;
            PointF pointF2 = this.check2;
            float f31 = f3 / 0.3f;
            path2.lineTo(AndroidUtilities.lerp(f30, pointF2.x, Utilities.clamp(f31, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f31, 1.0f, 0.0f)));
            if (f3 > 0.3f) {
                float f32 = pointF2.x;
                PointF pointF3 = this.check3;
                float f33 = (f3 - 0.3f) / 0.7f;
                path2.lineTo(AndroidUtilities.lerp(f32, pointF3.x, Utilities.clamp(f33, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f33, 1.0f, 0.0f)));
            }
            canvas2.translate(this.cx, this.cy);
            canvas2.drawPath(path2, paint5);
        } else {
            f8 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float fMax2 = Math.max(f7, 1.0f);
        canvas2.scale(fMax2, fMax2, this.cx, this.cy);
        float fMax3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - f16) * AndroidUtilities.dp(5.0f) * f2) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), f16) + fLerp3);
        float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f2);
        float fLerp7 = AndroidUtilities.lerp(fMax3, (fLerp3 - fLerp6) - AndroidUtilities.dp(4.0f), f3);
        float f34 = this.cx;
        float f35 = this.cy;
        RectF rectF4 = rectF;
        rectF4.set(f34 - fLerp7, f35 - fLerp7, f34 + fLerp7, f35 + fLerp7);
        Paint paint6 = this.outlinePaint;
        paint6.setStrokeWidth(fLerp6);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f2) * 255.0f * r29));
        canvas2.drawCircle(this.cx, this.cy, fLerp7, paint6);
        if ((f21 > 0.0f) && ((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF2 = rectF4;
            canvas2.drawArc(rectF2, -90.0f, f21 * 360.0f, false, paint6);
        } else {
            rectF2 = rectF4;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.recordingStart;
        float f36 = this.recording ? 0.0f : 1.0f - f4;
        long j = this.delegate != null ? 177000L : 60000L;
        float fMin = Math.min((jCurrentTimeMillis / 60000) * 360.0f, 360.0f);
        float f37 = this.recordingLoadingT.set(this.recordingLoading);
        Paint paint7 = this.outlineFilledPaint;
        paint7.setStrokeWidth(fLerp6);
        paint7.setAlpha((int) (Math.max(f37 * f8, 1.0f - f36) * 255.0f));
        if (f37 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF2, -90.0f, fMin, false, paint7);
        } else {
            CircularProgressDrawable.getSegments(this.loadingSegments, (SystemClock.elapsedRealtime() - this.recordingLoadingStart) % 5400);
            invalidate();
            float[] fArr = this.loadingSegments;
            float f38 = fArr[0];
            float f39 = fArr[c];
            float fLerp8 = (f38 + f39) / 2.0f;
            float fAbs2 = Math.abs(f39 - f38) / 2.0f;
            if (this.recordingLoading) {
                float f40 = fMin / 2.0f;
                fLerp8 = AndroidUtilities.lerp((-90.0f) + f40, fLerp8, f37);
                fAbs2 = AndroidUtilities.lerp(f40, fAbs2, f37);
            }
            float f41 = fLerp8 - fAbs2;
            float f42 = fAbs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF2, f41, f42, false, paint7);
        }
        if (this.recording) {
            invalidate();
            long j2 = jCurrentTimeMillis / 1000;
            if (j2 != this.lastDuration / 1000) {
                StoryRecorder.this.videoTimerView.setDuration(j2, true);
            }
            if (j > 0 && jCurrentTimeMillis >= j) {
                post(new RecordControl$$ExternalSyntheticLambda2(this, 0));
            }
            this.lastDuration = jCurrentTimeMillis;
        }
        canvas3.restore();
        boolean z3 = this.showLock;
        ButtonBounce buttonBounce2 = this.lockButton;
        if (z3) {
            float scale2 = buttonBounce2.getScale(0.2f) * f12;
            if (scale2 > 0.0f) {
                canvas3.save();
                canvas3.scale(scale2, scale2, this.leftCx, this.cy);
                canvas3.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaint);
                canvas3.rotate(-getRotation(), this.leftCx, this.cy);
                this.unlockDrawable.draw(canvas3);
                canvas3.restore();
            }
        }
        float scale3 = buttonBounce2.getScale(0.2f) * f19 * r29;
        if (scale3 > 0.0f) {
            canvas3.save();
            canvas3.scale(scale3, scale3, this.leftCx, this.cy);
            canvas3.rotate(-getRotation(), this.leftCx, this.cy);
            this.galleryImage.draw(canvas3);
            canvas3.restore();
        }
        float f43 = this.dualT.set(this.dual ? 1.0f : 0.0f, false);
        Paint paint8 = this.buttonPaintWhite;
        AnimatedFloat animatedFloat = this.flipDrawableRotateT;
        ButtonBounce buttonBounce3 = this.flipButton;
        if (f43 > 0.0f) {
            canvas3.save();
            float scale4 = buttonBounce3.getScale(0.2f) * f43 * f29;
            canvas3.scale(scale4, scale4, this.rightCx, this.cy);
            canvas3.rotate(animatedFloat.set(this.flipDrawableRotate, false) - getRotation(), this.rightCx, this.cy);
            canvas3.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(22.0f), paint8);
            this.flipDrawableBlack.draw(canvas3);
            canvas3.restore();
        }
        if (f43 < 1.0f) {
            canvas3.save();
            f9 = r29;
            float fM = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, f43, buttonBounce3.getScale(0.2f), f9);
            canvas3.scale(fM, fM, this.rightCx, this.cy);
            canvas3.rotate(animatedFloat.set(this.flipDrawableRotate, false) - getRotation(), this.rightCx, this.cy);
            canvas3.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(22.0f), this.buttonPaint);
            this.flipDrawableWhite.draw(canvas3);
            canvas3.restore();
        } else {
            f9 = r29;
        }
        if (!this.longpressRecording || hasCheck()) {
            fLerp = 0.0f;
        } else {
            fLerp = f15 * fMax * f12 * AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(fClamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f18), Math.max(f18, f16));
        }
        this.lockedT.set((this.longpressRecording || !this.recording) ? 0.0f : 1.0f, false);
        if (fLerp > 0.0f) {
            Paint paint9 = this.redPaint;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.touchX, this.cy, fLerp, paint9);
            float f44 = this.touchX;
            f10 = 22.0f;
            float fClamp3 = Utilities.clamp(1.0f - ((Math.abs(fClamp2) * f15) / 1.3f), 1.0f, 0.0f);
            float fAbs3 = Math.abs(fLerp2 - f44);
            float f45 = fLerp * 2.0f;
            if (fAbs3 < fLerp3 + f45 && fClamp3 < 0.6f) {
                float f46 = fLerp3 + fLerp;
                if (fAbs3 < f46) {
                    float f47 = fLerp3 * fLerp3;
                    float f48 = fAbs3 * fAbs3;
                    float f49 = fLerp * fLerp;
                    double dAcos2 = Math.acos(((f47 + f48) - f49) / ((fLerp3 * 2.0f) * fAbs3));
                    dAcos = Math.acos(((f49 + f48) - f47) / (f45 * fAbs3));
                    d = dAcos2;
                } else {
                    d = 0.0d;
                    dAcos = 0.0d;
                }
                double d2 = f44 > fLerp2 ? 0.0d : 3.141592653589793d;
                double d3 = d;
                double dAcos3 = (float) Math.acos((fLerp3 - fLerp) / fAbs3);
                double d4 = dAcos3 - d3;
                double d5 = fClamp3;
                double d6 = d4 * d5;
                double d7 = d2 + d3 + d6;
                double d8 = (d2 - d3) - d6;
                double d9 = ((3.141592653589793d - dAcos) - dAcos3) * d5;
                double d10 = ((d2 + 3.141592653589793d) - dAcos) - d9;
                double d11 = (d2 - 3.141592653589793d) + dAcos + d9;
                float f50 = this.cy;
                PointF pointF4 = this.p1;
                getVector(fLerp2, f50, d7, fLerp3, pointF4);
                float f51 = this.cy;
                PointF pointF5 = this.p2;
                getVector(fLerp2, f51, d8, fLerp3, pointF5);
                float f52 = this.cy;
                PointF pointF6 = this.p3;
                getVector(f44, f52, d10, fLerp, pointF6);
                float f53 = this.cy;
                PointF pointF7 = this.p4;
                getVector(f44, f53, d11, fLerp, pointF7);
                f11 = fLerp;
                f9 = f9;
                animatedFloat = animatedFloat;
                buttonBounce3 = buttonBounce3;
                float fMin2 = Math.min(1.0f, (fAbs3 * 2.0f) / f46) * Math.min(fClamp3 * 2.4f, MathUtils.distance(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f46);
                float f54 = fLerp3 * fMin2;
                float f55 = f11 * fMin2;
                getVector(pointF4.x, pointF4.y, d7 - 1.5707963705062866d, f54, this.h1);
                getVector(pointF5.x, pointF5.y, d8 + 1.5707963705062866d, f54, this.h2);
                getVector(pointF6.x, pointF6.y, d10 + 1.5707963705062866d, f55, this.h3);
                getVector(pointF7.x, pointF7.y, d11 - 1.5707963705062866d, f55, this.h4);
                float fM2 = MediaController$$ExternalSyntheticOutline0.m(f15, fMax, f12, f);
                if (fM2 > 0.0f) {
                    Path path3 = this.metaballsPath;
                    path3.rewind();
                    path3.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.h1;
                    float f56 = pointF8.x;
                    float f57 = pointF8.y;
                    f12 = f12;
                    PointF pointF9 = this.h3;
                    path3.cubicTo(f56, f57, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path3.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.h4;
                    float f58 = pointF10.x;
                    float f59 = pointF10.y;
                    PointF pointF11 = this.h2;
                    path3.cubicTo(f58, f59, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path3.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (fM2 * 255.0f));
                    canvas3.drawPath(path3, paint9);
                    float f60 = this.cy;
                    rectF2.set(f26, f60 - fLerp3, f28, f60 + fLerp3);
                    canvas3.drawRoundRect(rectF2, fLerp4, fLerp4, paint9);
                } else {
                    f12 = f12;
                }
            }
            if (r10 <= 0 || r9 > 0.0f) {
                scale = buttonBounce2.getScale(0.2f) * f12 * f9;
                canvas3.save();
                path = this.circlePath;
                path.rewind();
                if (r10 > 0) {
                    path.addCircle(this.touchX, this.cy, f11, Path.Direction.CW);
                }
                if (r9 > 0.0f && this.showLock) {
                    path.addCircle(this.leftCx, this.cy, r9 * AndroidUtilities.dp(f10) * scale, Path.Direction.CW);
                }
                canvas3.clipPath(path);
                if (this.showLock) {
                    canvas3.save();
                    canvas3.scale(scale, scale, this.leftCx, this.cy);
                    canvas3.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(f10), paint8);
                    canvas3.rotate(-getRotation(), this.leftCx, this.cy);
                    this.lockDrawable.draw(canvas3);
                    canvas3.restore();
                }
                float scale5 = buttonBounce3.getScale(0.2f) * f9;
                canvas3.save();
                canvas3.scale(scale5, scale5, this.rightCx, this.cy);
                canvas3.rotate(animatedFloat.set(this.flipDrawableRotate, false) - getRotation(), this.rightCx, this.cy);
                canvas3.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(f10), paint8);
                this.flipDrawableBlack.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
            }
            if (this.accessibilityHelper == null) {
                return;
            }
            zHasCheck = hasCheck();
            z = this.a11yPrevRecording;
            z2 = this.recording;
            if (z != z2 && this.a11yPrevCheck == zHasCheck && this.a11yPrevDual == this.dual && this.a11yPrevStartIsVideo == this.startModeIsVideo && this.a11yPrevLoading == this.recordingLoading && this.a11yPrevShowLock == this.showLock) {
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
        f10 = 22.0f;
        f11 = fLerp;
        if (r10 <= 0) {
            scale = buttonBounce2.getScale(0.2f) * f12 * f9;
            canvas3.save();
            path = this.circlePath;
            path.rewind();
            if (r10 > 0) {
                path.addCircle(this.touchX, this.cy, f11, Path.Direction.CW);
            }
            if (r9 > 0.0f) {
                path.addCircle(this.leftCx, this.cy, r9 * AndroidUtilities.dp(f10) * scale, Path.Direction.CW);
            }
            canvas3.clipPath(path);
            if (this.showLock) {
                canvas3.save();
                canvas3.scale(scale, scale, this.leftCx, this.cy);
                canvas3.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(f10), paint8);
                canvas3.rotate(-getRotation(), this.leftCx, this.cy);
                this.lockDrawable.draw(canvas3);
                canvas3.restore();
            }
            float scale6 = buttonBounce3.getScale(0.2f) * f9;
            canvas3.save();
            canvas3.scale(scale6, scale6, this.rightCx, this.cy);
            canvas3.rotate(animatedFloat.set(this.flipDrawableRotate, false) - getRotation(), this.rightCx, this.cy);
            canvas3.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(f10), paint8);
            this.flipDrawableBlack.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        } else {
            scale = buttonBounce2.getScale(0.2f) * f12 * f9;
            canvas3.save();
            path = this.circlePath;
            path.rewind();
            if (r10 > 0) {
                path.addCircle(this.touchX, this.cy, f11, Path.Direction.CW);
            }
            if (r9 > 0.0f) {
                path.addCircle(this.leftCx, this.cy, r9 * AndroidUtilities.dp(f10) * scale, Path.Direction.CW);
            }
            canvas3.clipPath(path);
            if (this.showLock) {
                canvas3.save();
                canvas3.scale(scale, scale, this.leftCx, this.cy);
                canvas3.drawCircle(this.leftCx, this.cy, AndroidUtilities.dp(f10), paint8);
                canvas3.rotate(-getRotation(), this.leftCx, this.cy);
                this.lockDrawable.draw(canvas3);
                canvas3.restore();
            }
            float scale7 = buttonBounce3.getScale(0.2f) * f9;
            canvas3.save();
            canvas3.scale(scale7, scale7, this.rightCx, this.cy);
            canvas3.rotate(animatedFloat.set(this.flipDrawableRotate, false) - getRotation(), this.rightCx, this.cy);
            canvas3.drawCircle(this.rightCx, this.cy, AndroidUtilities.dp(f10), paint8);
            this.flipDrawableBlack.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        if (this.accessibilityHelper == null) {
            return;
        }
        zHasCheck = hasCheck();
        z = this.a11yPrevRecording;
        z2 = this.recording;
        if (z != z2) {
        }
        this.a11yPrevRecording = z2;
        this.a11yPrevCheck = zHasCheck;
        this.a11yPrevDual = this.dual;
        this.a11yPrevStartIsVideo = this.startModeIsVideo;
        this.a11yPrevLoading = this.recordingLoading;
        this.a11yPrevShowLock = this.showLock;
        this.accessibilityHelper.invalidateRoot();
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
        float f4 = this.cy;
        float fDp = AndroidUtilities.dp(14.0f);
        this.flipDrawableWhite.setBounds((int) (f3 - fDp), (int) (f4 - fDp), (int) (f3 + fDp), (int) (f4 + fDp));
        float f5 = this.rightCx;
        float f6 = this.cy;
        float fDp2 = AndroidUtilities.dp(14.0f);
        this.flipDrawableBlack.setBounds((int) (f5 - fDp2), (int) (f6 - fDp2), (int) (f5 + fDp2), (int) (f6 + fDp2));
        float f7 = this.leftCx;
        float f8 = this.cy;
        Drawable drawable = this.unlockDrawable;
        float fMax = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f7 - fMax), (int) (f8 - fMax), (int) (f7 + fMax), (int) (f8 + fMax));
        float f9 = this.leftCx;
        float f10 = this.cy;
        Drawable drawable2 = this.lockDrawable;
        float fMax2 = Math.max(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight()) / 2.0f;
        drawable2.setBounds((int) (f9 - fMax2), (int) (f10 - fMax2), (int) (f9 + fMax2), (int) (f10 + fMax2));
        float f11 = this.leftCx;
        float f12 = this.cy;
        Drawable drawable3 = this.pauseDrawable;
        float fMax3 = Math.max(drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight()) / 2.0f;
        drawable3.setBounds((int) (f11 - fMax3), (int) (f12 - fMax3), (int) (f11 + fMax3), (int) (f12 + fMax3));
        this.galleryImage.setImageCoords(this.leftCx - AndroidUtilities.dp(20.0f), this.cy - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.redMatrix;
        matrix.reset();
        matrix.postTranslate(this.cx, this.cy);
        this.redGradient.setLocalMatrix(matrix);
        setMeasuredDimension(size, iDp);
        RecordControlAccessibilityHelper recordControlAccessibilityHelper = this.accessibilityHelper;
        if (recordControlAccessibilityHelper != null) {
            recordControlAccessibilityHelper.invalidateRoot();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float fClamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.rightCx, this.leftCx);
        float y = motionEvent.getY() + 0.0f;
        boolean zIsPressed = isPressed(fClamp, y, this.rightCx, this.cy, AndroidUtilities.dp(7.0f), true);
        boolean z = this.recordingLoading;
        ButtonBounce buttonBounce = this.lockButton;
        ButtonBounce buttonBounce2 = this.recordButton;
        ButtonBounce buttonBounce3 = this.flipButton;
        boolean z2 = true;
        if (z) {
            buttonBounce2.setPressed(false);
            buttonBounce3.setPressed(false);
            buttonBounce.setPressed(false);
        } else if (action == 0 || this.touch) {
            buttonBounce2.setPressed(isPressed(fClamp, y, this.cx, this.cy, AndroidUtilities.dp(60.0f), false));
            buttonBounce3.setPressed(isPressed(fClamp, y, this.rightCx, this.cy, (float) AndroidUtilities.dp(30.0f), true) && !hasCheck());
            buttonBounce.setPressed(isPressed(fClamp, y, this.leftCx, this.cy, (float) AndroidUtilities.dp(30.0f), false) && !hasCheck());
        }
        RecordControl$$ExternalSyntheticLambda2 recordControl$$ExternalSyntheticLambda2 = this.onFlipLongPressRunnable;
        RecordControl$$ExternalSyntheticLambda2 recordControl$$ExternalSyntheticLambda3 = this.onRecordLongPressRunnable;
        if (action == 0) {
            this.touch = true;
            this.discardParentTouch = buttonBounce2.isPressed || buttonBounce3.isPressed;
            System.currentTimeMillis();
            this.touchX = fClamp;
            if (Math.abs(fClamp - this.cx) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(recordControl$$ExternalSyntheticLambda3, ViewConfiguration.getLongPressTimeout());
            }
            if (buttonBounce3.isPressed) {
                AndroidUtilities.runOnUIThread(recordControl$$ExternalSyntheticLambda2, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.touch) {
                    this.touchX = Utilities.clamp(fClamp, this.rightCx, this.leftCx);
                    invalidate();
                    if (this.recording && !this.flipButtonWasPressed && zIsPressed) {
                        rotateFlip(180.0f);
                        ((StoryRecorder.AnonymousClass13) this.delegate).onFlipClick();
                    }
                    if (this.recording && this.longpressRecording) {
                        float fClamp2 = Utilities.clamp(((this.cy - AndroidUtilities.dp(48.0f)) - y) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) this.delegate;
                        StoryRecorder.this.zoomControlView.setZoom(fClamp2, true);
                        StoryRecorder.this.showZoomControls$1(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.touch) {
                    this.touch = false;
                    this.discardParentTouch = false;
                    AndroidUtilities.cancelRunOnUIThread(recordControl$$ExternalSyntheticLambda3);
                    AndroidUtilities.cancelRunOnUIThread(recordControl$$ExternalSyntheticLambda2);
                    boolean z3 = this.recording;
                    if (!z3 && buttonBounce.isPressed) {
                        StoryRecorder.AnonymousClass13 anonymousClass14 = (StoryRecorder.AnonymousClass13) this.delegate;
                        StoryRecorder storyRecorder = StoryRecorder.this;
                        if (storyRecorder.currentPage == 0 && !storyRecorder.takingPhoto && !storyRecorder.takingVideo && StoryRecorder.access$12000(storyRecorder)) {
                            StoryRecorder.this.animateGalleryListView(true);
                        }
                    } else if (z3 && this.longpressRecording) {
                        if (buttonBounce.isPressed) {
                            this.longpressRecording = false;
                            this.lockedT.set(1.0f, true);
                            HintTextView hintTextView = StoryRecorder.this.hintTextView;
                            hintTextView.textDrawable.setText(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            hintTextView.invalidate();
                        } else {
                            this.recording = false;
                            this.recordingLoadingStart = SystemClock.elapsedRealtime();
                            this.recordingLoading = true;
                            ((StoryRecorder.AnonymousClass13) this.delegate).onVideoRecordEnd(false);
                        }
                    } else if (buttonBounce2.isPressed) {
                        if (hasCheck()) {
                            ((StoryRecorder.AnonymousClass13) this.delegate).onCheckClick();
                        } else if (!this.startModeIsVideo && !this.recording && !this.longpressRecording) {
                            ((StoryRecorder.AnonymousClass13) this.delegate).onPhotoShoot();
                        } else if (this.recording) {
                            this.recording = false;
                            this.recordingLoadingStart = SystemClock.elapsedRealtime();
                            this.recordingLoading = true;
                            ((StoryRecorder.AnonymousClass13) this.delegate).onVideoRecordEnd(false);
                        } else if (StoryRecorder.access$9600(StoryRecorder.this)) {
                            this.lastDuration = 0L;
                            this.recordingStart = System.currentTimeMillis();
                            this.showLock = false;
                            ((StoryRecorder.AnonymousClass13) this.delegate).onVideoRecordStart(new RecordControl$$ExternalSyntheticLambda2(this, 1), false);
                        }
                    }
                    this.longpressRecording = false;
                    if (buttonBounce3.isPressed) {
                        rotateFlip(180.0f);
                        ((StoryRecorder.AnonymousClass13) this.delegate).onFlipClick();
                    }
                    buttonBounce2.setPressed(false);
                    buttonBounce3.setPressed(false);
                    buttonBounce.setPressed(false);
                    invalidate();
                }
                return false;
            }
            z2 = false;
        }
        this.flipButtonWasPressed = zIsPressed;
        return z2;
    }

    public final void rotateFlip(float f) {
        this.flipDrawableRotateT.transitionDuration = f > 180.0f ? 620L : 310L;
        this.flipDrawableRotate += f;
        invalidate();
    }

    public final void setCollageProgress(float f, boolean z) {
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

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setDual(boolean z) {
        if (z != this.dual) {
            this.dual = z;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f) {
        this.outlinePaint.setColor(ColorUtils.blendARGB(f, -1, -16777216));
        this.buttonPaint.setColor(ColorUtils.blendARGB(f, 1677721600, 369098752));
        this.hintLinePaintWhite.setColor(ColorUtils.blendARGB(f, 1493172223, 285212671));
        this.hintLinePaintBlack.setColor(ColorUtils.blendARGB(f, 402653184, 805306368));
        int iBlendARGB = ColorUtils.blendARGB(f, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.flipDrawableWhite.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
        this.unlockDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(f, -1, -16777216), mode));
    }

    public final void stopRecordingLoading(boolean z) {
        this.recordingLoading = false;
        if (!z) {
            AnimatedFloat animatedFloat = this.recordingLoadingT;
            animatedFloat.getClass();
            animatedFloat.set(0.0f, true);
        }
        invalidate();
    }

    public final void updateGalleryImage() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        Delegate delegate = this.delegate;
        ImageReceiver imageReceiver = this.galleryImage;
        if (delegate != null) {
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().draftsController.drafts;
            imageReceiver.setOrientation(0, 0, true);
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
        if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(this.noGalleryDrawable);
            return;
        }
        if (photoEntry.isVideo) {
            this.galleryImage.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
            return;
        }
        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        this.galleryImage.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.noGalleryDrawable, 0L, null, null, 0);
    }
}
