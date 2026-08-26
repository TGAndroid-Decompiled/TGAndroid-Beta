package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BitmapShaderTools;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda6;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda0;
import org.webrtc.RendererCommon;

public abstract class PrivateVideoPreviewDialogNew extends FrameLayout implements VoIPService.StateListener {
    private ActionBar actionBar;
    private final MotionBackgroundDrawable bgBlueViolet;
    private final BitmapShaderTools bgBlueVioletShaderTools;
    private final MotionBackgroundDrawable bgGreen;
    private final BitmapShaderTools bgGreenShaderTools;
    private final Camera camera;
    private boolean cameraReady;
    private final Path clipPath;
    private float closeProgress;
    private boolean isDismissed;
    private final Matrix matrixLeft;
    private final Matrix matrixRight;
    private float openProgress1;
    private float openProgress2;
    private float openTranslationX;
    private float openTranslationY;
    private float pageOffset;
    private TextView positiveButton;
    private boolean positiveButtonDrawText;
    private int previousPage;
    private int realCurrentPage;
    private ValueAnimator scrollAnimator;
    private final GestureDetector scrollGestureDetector;
    private final float startLocationX;
    private final float startLocationY;
    private int strangeCurrentPage;
    private VoIPTextureView textureView;
    private VoIpBitmapTextView[] titles;
    private LinearLayout titlesLayout;
    private FrameLayout viewPager;
    private int visibleCameraPage;

    public final class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        public boolean lockDragging;
        public boolean startDragging;

        public AnonymousClass1() {
        }

        @Override
        public final boolean onDown(MotionEvent motionEvent) {
            this.startDragging = true;
            return super.onDown(motionEvent);
        }

        @Override
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            if (Math.abs(x) > AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(x) / 3.0f > y && this.startDragging && !this.lockDragging) {
                this.startDragging = false;
                HttpGetFileTask$$ExternalSyntheticLambda0 httpGetFileTask$$ExternalSyntheticLambda0 = new HttpGetFileTask$$ExternalSyntheticLambda0(this, x, 1);
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = PrivateVideoPreviewDialogNew.this;
                if (privateVideoPreviewDialogNew.scrollAnimator != null) {
                    this.lockDragging = true;
                    AndroidUtilities.runOnUIThread(httpGetFileTask$$ExternalSyntheticLambda0, (privateVideoPreviewDialogNew.scrollAnimator.getDuration() - privateVideoPreviewDialogNew.scrollAnimator.getCurrentPlayTime()) + 50);
                } else {
                    httpGetFileTask$$ExternalSyntheticLambda0.run();
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    public final class AnonymousClass6 implements RendererCommon.RendererEvents {
        @Override
        public final void onFirstFrameRendered() {
        }

        @Override
        public final void onFrameResolutionChanged(int i, int i2, int i3) {
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PrivateVideoPreviewDialogNew this$0;

        public AnonymousClass7(PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew, int i) {
            this.$r8$classId = i;
            this.this$0 = privateVideoPreviewDialogNew;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.this$0;
                    if (!privateVideoPreviewDialogNew.isDismissed) {
                        privateVideoPreviewDialogNew.afterOpened();
                    }
                    break;
                case 1:
                    super.onAnimationEnd(animator);
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew2 = this.this$0;
                    if (privateVideoPreviewDialogNew2.getParent() != null) {
                        ((ViewGroup) privateVideoPreviewDialogNew2.getParent()).removeView(privateVideoPreviewDialogNew2);
                    }
                    break;
                case 2:
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew3 = this.this$0;
                    if (privateVideoPreviewDialogNew3.getParent() != null) {
                        ((ViewGroup) privateVideoPreviewDialogNew3.getParent()).removeView(privateVideoPreviewDialogNew3);
                    }
                    break;
                default:
                    super.onAnimationEnd(animator);
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew4 = this.this$0;
                    if (privateVideoPreviewDialogNew4.getParent() != null) {
                        ((ViewGroup) privateVideoPreviewDialogNew4.getParent()).removeView(privateVideoPreviewDialogNew4);
                    }
                    break;
            }
        }
    }

    public PrivateVideoPreviewDialogNew(Context context, float f, float f2) {
        super(context);
        this.visibleCameraPage = 1;
        this.previousPage = -1;
        this.openProgress1 = 0.0f;
        this.openProgress2 = 0.0f;
        this.closeProgress = 0.0f;
        this.clipPath = new Path();
        this.camera = new Camera();
        this.matrixRight = new Matrix();
        this.matrixLeft = new Matrix();
        this.bgGreenShaderTools = new BitmapShaderTools(80, 80);
        this.bgBlueVioletShaderTools = new BitmapShaderTools(80, 80);
        this.bgGreen = new MotionBackgroundDrawable(-10497967, -16730994, -5649306, -10833593, 0, false, true);
        this.bgBlueViolet = new MotionBackgroundDrawable(-16735258, -14061833, -15151390, -12602625, 0, false, true);
        this.startLocationX = f;
        this.startLocationY = f2;
        int i = 3;
        this.titles = new VoIpBitmapTextView[3];
        this.scrollGestureDetector = new GestureDetector(context, new AnonymousClass1());
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context, 9);
        this.viewPager = anonymousClass2;
        anonymousClass2.setClickable(true);
        addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f));
        int i2 = 0;
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, false, true, false);
        this.textureView = voIPTextureView;
        voIPTextureView.renderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        VoIPTextureView voIPTextureView2 = this.textureView;
        voIPTextureView2.scaleType = 1;
        voIPTextureView2.clipToTexture = true;
        voIPTextureView2.renderer.setAlpha(0.0f);
        this.textureView.renderer.setRotateTextureWithScreen(true);
        this.textureView.renderer.setUseCameraRotation(true);
        addView(this.textureView, LayoutHelper.createFrame(-1, -1.0f));
        ActionBar actionBar = new ActionBar(context, null);
        this.actionBar = actionBar;
        zzki.m(actionBar);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false), false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 12));
        addView(this.actionBar);
        TextView textView = new TextView(getContext()) {
            public final Paint[] gradientPaint;
            public final Paint whitePaint;

            {
                Paint paint = new Paint();
                this.whitePaint = paint;
                this.gradientPaint = new Paint[PrivateVideoPreviewDialogNew.this.titles.length];
                PrivateVideoPreviewDialogNew.this.bgGreen.setBounds(0, 0, 80, 80);
                PrivateVideoPreviewDialogNew.this.bgBlueViolet.setBounds(0, 0, 80, 80);
                PrivateVideoPreviewDialogNew.this.bgGreenShaderTools.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
                PrivateVideoPreviewDialogNew.this.bgBlueVioletShaderTools.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
                PrivateVideoPreviewDialogNew.this.bgGreen.setAlpha(255);
                PrivateVideoPreviewDialogNew.this.bgBlueViolet.setAlpha(255);
                Canvas canvas = PrivateVideoPreviewDialogNew.this.bgGreenShaderTools.getCanvas();
                PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
                canvas.drawColor(0, mode);
                PrivateVideoPreviewDialogNew.this.bgBlueVioletShaderTools.getCanvas().drawColor(0, mode);
                PrivateVideoPreviewDialogNew.this.bgGreen.draw(PrivateVideoPreviewDialogNew.this.bgGreenShaderTools.getCanvas());
                PrivateVideoPreviewDialogNew.this.bgBlueViolet.draw(PrivateVideoPreviewDialogNew.this.bgBlueVioletShaderTools.getCanvas());
                paint.setColor(-1);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = PrivateVideoPreviewDialogNew.this;
                privateVideoPreviewDialogNew.bgGreenShaderTools.setBounds(-getX(), -getY(), privateVideoPreviewDialogNew.getWidth() - getX(), privateVideoPreviewDialogNew.getHeight() - getY());
                privateVideoPreviewDialogNew.bgBlueVioletShaderTools.setBounds(-getX(), -getY(), privateVideoPreviewDialogNew.getWidth() - getX(), privateVideoPreviewDialogNew.getHeight() - getY());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                int i3 = privateVideoPreviewDialogNew.strangeCurrentPage;
                Paint[] paintArr = this.gradientPaint;
                paintArr[i3].setAlpha(255);
                float fDp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - privateVideoPreviewDialogNew.openProgress1) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
                canvas.drawRoundRect(rectF, fDp, fDp, paintArr[privateVideoPreviewDialogNew.strangeCurrentPage]);
                if (privateVideoPreviewDialogNew.pageOffset > 0.0f && privateVideoPreviewDialogNew.strangeCurrentPage + 1 < paintArr.length) {
                    paintArr[privateVideoPreviewDialogNew.strangeCurrentPage + 1].setAlpha((int) (privateVideoPreviewDialogNew.pageOffset * 255.0f));
                    canvas.drawRoundRect(rectF, fDp, fDp, paintArr[privateVideoPreviewDialogNew.strangeCurrentPage + 1]);
                }
                if (privateVideoPreviewDialogNew.openProgress1 < 1.0f) {
                    Paint paint = this.whitePaint;
                    paint.setAlpha((int) ((1.0f - privateVideoPreviewDialogNew.openProgress1) * 255.0f));
                    canvas.drawRoundRect(rectF, fDp, fDp, paint);
                }
                super.onDraw(canvas);
                if (privateVideoPreviewDialogNew.positiveButtonDrawText) {
                    canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), getWidth() / 2, (int) ((getHeight() / 2) - ((privateVideoPreviewDialogNew.positiveButton.getPaint().ascent() + privateVideoPreviewDialogNew.positiveButton.getPaint().descent()) / 2.0f)), privateVideoPreviewDialogNew.positiveButton.getPaint());
                }
            }

            @Override
            public final void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
                int i7 = 0;
                while (true) {
                    Paint[] paintArr = this.gradientPaint;
                    if (i7 >= paintArr.length) {
                        return;
                    }
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = PrivateVideoPreviewDialogNew.this;
                    if (i7 == 0) {
                        paintArr[i7] = privateVideoPreviewDialogNew.bgGreenShaderTools.paint;
                    } else if (i7 == 1) {
                        paintArr[i7] = privateVideoPreviewDialogNew.bgBlueVioletShaderTools.paint;
                    } else {
                        paintArr[i7] = privateVideoPreviewDialogNew.bgGreenShaderTools.paint;
                    }
                    i7++;
                }
            }
        };
        this.positiveButton = textView;
        textView.setMaxLines(1);
        this.positiveButton.setEllipsize(null);
        this.positiveButton.setMinWidth(AndroidUtilities.dp(64.0f));
        this.positiveButton.setTag(-1);
        this.positiveButton.setTextSize(1, 14.0f);
        TextView textView2 = this.positiveButton;
        int i3 = Theme.key_voipgroup_nameText;
        textView2.setTextColor(Theme.getColor(null, i3, false));
        this.positiveButton.setGravity(17);
        this.positiveButton.setTypeface(AndroidUtilities.bold());
        this.positiveButton.getPaint().setTextAlign(Paint.Align.CENTER);
        this.positiveButton.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView3 = this.positiveButton;
            int iDp = AndroidUtilities.dp(8.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i3, false), 76);
            textView3.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        this.positiveButton.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        this.positiveButton.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 28));
        addView(this.positiveButton, LayoutHelper.createFrame(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        RichEditor.AnonymousClass6 anonymousClass6 = new RichEditor.AnonymousClass6(this, context, i);
        this.titlesLayout = anonymousClass6;
        anonymousClass6.setClipChildren(false);
        addView(this.titlesLayout, LayoutHelper.createFrame(-1, 64, 80));
        int i4 = 0;
        while (i4 < this.titles.length) {
            String string = i4 == 0 ? LocaleController.getString(R.string.VoipPhoneScreen) : i4 == 1 ? LocaleController.getString(R.string.VoipFrontCamera) : LocaleController.getString(R.string.VoipBackCamera);
            this.titles[i4] = new VoIpBitmapTextView(context, string);
            this.titles[i4].setContentDescription(string);
            this.titles[i4].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.titlesLayout.addView(this.titles[i4], LayoutHelper.createLinear(-2, -1));
            this.titles[i4].setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i4, 4));
            i4++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.textureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass6());
            sharedInstance.setLocalSink(this.textureView.renderer, false);
        }
        FrameLayout frameLayout = this.viewPager;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setBackground(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView4 = new TextView(getContext());
        textView4.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView4.setGravity(17);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView4, -1, 1, 15.0f);
        frameLayout2.addView(textView4, LayoutHelper.createFrame(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout2.setTag("screencast_stub");
        frameLayout2.setVisibility(8);
        frameLayout.addView(frameLayout2);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(imageView2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda6(this, f, f2, 2));
        valueAnimatorOfFloat.addListener(new AnonymousClass7(this, i2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(this, 1));
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
        long j = 320;
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat2.setDuration(j);
        valueAnimatorOfFloat2.setStartDelay(32);
        valueAnimatorOfFloat2.start();
        this.titlesLayout.setAlpha(0.0f);
        this.titlesLayout.setScaleY(0.8f);
        this.titlesLayout.setScaleX(0.8f);
        this.titlesLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.positiveButton.setTranslationY(AndroidUtilities.dp(53.0f));
        this.positiveButton.setTranslationX((f - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.positiveButton.animate().translationY(0.0f).translationX(0.0f).setDuration(j).start();
        this.positiveButtonDrawText = true;
        setCurrentPage(1, false);
    }

    public abstract void afterOpened();

    public abstract void beforeClosed();

    public void dismiss(boolean z, boolean z2) {
        int i = 3;
        int i2 = 1;
        int i3 = 2;
        if (this.isDismissed || this.openProgress1 != 1.0f) {
            return;
        }
        beforeClosed();
        this.isDismissed = true;
        saveLastCameraBitmap$1();
        onDismiss(z, z2);
        if (isHasVideoOnMainScreen() && z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(this, 2));
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setStartDelay(60L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.addListener(new AnonymousClass7(this, i));
            valueAnimatorOfFloat.start();
            this.positiveButton.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.actionBar.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.titlesLayout.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z2) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnonymousClass7(this, i2));
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(this, 3));
            valueAnimatorOfFloat2.addListener(new AnonymousClass7(this, i3));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(this, 4));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
            long j = 320;
            valueAnimatorOfFloat2.setDuration(j);
            valueAnimatorOfFloat2.start();
            valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
            valueAnimatorOfFloat3.setDuration(j);
            valueAnimatorOfFloat3.start();
            this.titlesLayout.setAlpha(1.0f);
            this.titlesLayout.setScaleY(1.0f);
            this.titlesLayout.setScaleX(1.0f);
            this.titlesLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            float f = 320;
            this.positiveButton.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.startLocationX - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration((long) (0.6f * f)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f)).setStartDelay((long) (f * 0.75f)).start();
        }
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.openProgress1 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            int i2 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float fDp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.openProgress1);
            this.clipPath.reset();
            Path path = this.clipPath;
            float fDp2 = this.startLocationX + AndroidUtilities.dp(33.5f);
            float fDp3 = this.startLocationY + AndroidUtilities.dp(26.6f);
            float fDp4 = AndroidUtilities.dp(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(fDp2, fDp3, fDp4, direction);
            int iDp = AndroidUtilities.dp(52.0f);
            int iDp2 = AndroidUtilities.dp(52.0f);
            int iLerp = AndroidUtilities.lerp(iDp, i, this.openProgress1);
            int iLerp2 = AndroidUtilities.lerp(iDp2, i2, this.openProgress1);
            float fDp5 = this.openTranslationX - ((1.0f - this.openProgress1) * AndroidUtilities.dp(20.0f));
            float fDp6 = this.openTranslationY - ((1.0f - this.openProgress1) * AndroidUtilities.dp(51.0f));
            this.clipPath.addRoundRect(fDp5, fDp6, fDp5 + iLerp, fDp6 + iLerp2, fDp, fDp, direction);
            canvas.clipPath(this.clipPath);
        }
        if (this.closeProgress > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f = this.closeProgress;
            int i3 = (int) (floatingViewLocation[0] * f);
            int i4 = (int) (floatingViewLocation[1] * f);
            int i5 = floatingViewLocation[2];
            int i6 = AndroidUtilities.displaySize.x;
            float fM = DiffUtil.m(1.0f, f, i6 - i5, i5) / i6;
            this.clipPath.reset();
            this.clipPath.addRoundRect(0.0f, 0.0f, getWidth() * fM, getHeight() * fM, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i3, i4);
            canvas.clipPath(this.clipPath);
            canvas.scale(fM, fM);
        }
        super.dispatchDraw(canvas);
    }

    public int[] getFloatingViewLocation() {
        return null;
    }

    public abstract boolean isHasVideoOnMainScreen();

    public final void lambda$dismiss$5(ValueAnimator valueAnimator) {
        this.closeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$dismiss$6(ValueAnimator valueAnimator) {
        this.openProgress1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fDp = this.startLocationX + AndroidUtilities.dp(28.0f);
        float fDp2 = this.startLocationY + AndroidUtilities.dp(52.0f);
        float f = this.openProgress1;
        this.openTranslationX = fDp - (fDp * f);
        this.openTranslationY = fDp2 - (f * fDp2);
        invalidate();
    }

    public final void lambda$dismiss$7(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.positiveButton.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (((AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f)) * this.openProgress2));
        this.positiveButton.requestLayout();
    }

    public final void lambda$new$0$13(View view) {
        if (this.isDismissed) {
            return;
        }
        if (this.realCurrentPage != 0) {
            dismiss(false, true);
        } else {
            ((Activity) getContext()).startActivityForResult(((MediaProjectionManager) getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
        }
    }

    public final void lambda$new$1$1(int i, View view) {
        if (this.scrollAnimator != null || view.getAlpha() == 0.0f) {
            return;
        }
        setCurrentPage(i, true);
    }

    public final void lambda$new$2(float f, float f2, ValueAnimator valueAnimator) {
        this.openProgress1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fDp = f + AndroidUtilities.dp(28.0f);
        float fDp2 = f2 + AndroidUtilities.dp(52.0f);
        float f3 = this.openProgress1;
        this.openTranslationX = fDp - (fDp * f3);
        this.openTranslationY = fDp2 - (f3 * fDp2);
        invalidate();
    }

    public final void lambda$new$3(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.positiveButton.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (((AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f)) * this.openProgress2));
        this.positiveButton.requestLayout();
    }

    public final void lambda$setCurrentPage$4(ValueAnimator valueAnimator) {
        this.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateTitlesLayout$1();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        VoIPService.StateListener.CC.$default$onAudioSettingsChanged(this);
    }

    @Override
    public void onCameraFirstFrameAvailable() {
        if (this.cameraReady) {
            return;
        }
        this.cameraReady = true;
        if (this.realCurrentPage != 0) {
            this.textureView.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override
    public void onCameraSwitch(boolean z) {
        update();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    public abstract void onDismiss(boolean z, boolean z2);

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTitlesLayout$1();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildWithMargins(this.titlesLayout, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        VoIPService.StateListener.CC.$default$onStateChanged(this, i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void saveLastCameraBitmap$1() {
        if (this.cameraReady) {
            try {
                Bitmap bitmap = this.textureView.renderer.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.textureView.renderer.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                    if (bitmapCreateScaledBitmap != null) {
                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                            bitmapCreateBitmap.recycle();
                        }
                        Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.visibleCameraPage + ".jpg"));
                        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View viewFindViewWithTag = this.viewPager.findViewWithTag("image_stab");
                        if (viewFindViewWithTag instanceof ImageView) {
                            ((ImageView) viewFindViewWithTag).setImageBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setBottomPadding(int i) {
        ((FrameLayout.LayoutParams) this.positiveButton.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i;
        ((FrameLayout.LayoutParams) this.titlesLayout.getLayoutParams()).bottomMargin = i;
    }

    public final void setCurrentPage(int i, boolean z) {
        int i2;
        int i3 = 2;
        if (this.strangeCurrentPage == i || (i2 = this.realCurrentPage) == i) {
            return;
        }
        if (!z) {
            this.realCurrentPage = i;
            this.strangeCurrentPage = i;
            this.pageOffset = 0.0f;
            updateTitlesLayout$1();
            this.textureView.setVisibility(0);
            this.cameraReady = false;
            this.visibleCameraPage = 1;
            showStub(true, false);
            return;
        }
        if (i2 == 0) {
            if (this.visibleCameraPage != i) {
                this.visibleCameraPage = i;
                this.cameraReady = false;
                showStub(true, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().switchCamera();
                }
            } else {
                showStub(false, false);
                this.textureView.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i == 0) {
            this.viewPager.findViewWithTag("screencast_stub").setVisibility(0);
            saveLastCameraBitmap$1();
            showStub(false, false);
            this.textureView.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            saveLastCameraBitmap$1();
            this.visibleCameraPage = i;
            this.cameraReady = false;
            showStub(true, false);
            this.textureView.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i4 = this.realCurrentPage;
        if (i > i4) {
            this.previousPage = i4;
            this.realCurrentPage = i4 + 1;
            this.scrollAnimator = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.previousPage = i4;
            this.realCurrentPage = i4 - 1;
            this.strangeCurrentPage = i;
            this.scrollAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.scrollAnimator.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda0(this, 0));
        this.scrollAnimator.addListener(new RichMediaCell.AnonymousClass3(this, i, i3));
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.scrollAnimator.setDuration(350L);
        this.scrollAnimator.start();
    }

    public final void showStub(boolean z, boolean z2) {
        Bitmap bitmapDecodeFile;
        ImageView imageView = (ImageView) this.viewPager.findViewWithTag("image_stab");
        if (!z) {
            imageView.setVisibility(8);
            return;
        }
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.visibleCameraPage + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null || bitmapDecodeFile.getPixel(0, 0) == 0) {
            imageView.setImageResource(R.drawable.icplaceholder);
        } else {
            imageView.setImageBitmap(bitmapDecodeFile);
        }
        if (!z2) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    public void update() {
        if (VoIPService.getSharedInstance() != null) {
            this.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    public final void updateTitlesLayout$1() {
        VoIpBitmapTextView[] voIpBitmapTextViewArr = this.titles;
        int i = this.strangeCurrentPage;
        VoIpBitmapTextView voIpBitmapTextView = voIpBitmapTextViewArr[i];
        VoIpBitmapTextView voIpBitmapTextView2 = i < voIpBitmapTextViewArr.length - 1 ? voIpBitmapTextViewArr[i + 1] : null;
        float measuredWidth = (voIpBitmapTextView.getMeasuredWidth() / 2) + voIpBitmapTextView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (voIpBitmapTextView2 != null) {
            measuredWidth2 -= (((voIpBitmapTextView2.getMeasuredWidth() / 2) + voIpBitmapTextView2.getLeft()) - measuredWidth) * this.pageOffset;
        }
        int i2 = 0;
        while (true) {
            VoIpBitmapTextView[] voIpBitmapTextViewArr2 = this.titles;
            float f = 0.7f;
            if (i2 >= voIpBitmapTextViewArr2.length) {
                break;
            }
            int i3 = this.strangeCurrentPage;
            float f2 = 0.9f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                if (i2 == i3) {
                    float f3 = this.pageOffset;
                    f = 1.0f - (0.3f * f3);
                    f2 = 1.0f - (f3 * 0.1f);
                } else {
                    float f4 = this.pageOffset;
                    f = 0.7f + (0.3f * f4);
                    f2 = 0.9f + (f4 * 0.1f);
                }
            }
            voIpBitmapTextViewArr2[i2].setAlpha(f);
            this.titles[i2].setScaleX(f2);
            this.titles[i2].setScaleY(f2);
            this.titles[i2].setTranslationX(measuredWidth2);
            i2++;
        }
        this.positiveButton.invalidate();
        if (this.realCurrentPage == 0) {
            this.titles[2].setAlpha(this.pageOffset * 0.7f);
        }
        if (this.realCurrentPage == 2) {
            float f5 = this.pageOffset;
            if (f5 > 0.0f) {
                this.titles[0].setAlpha((1.0f - f5) * 0.7f);
            } else {
                this.titles[0].setAlpha(0.0f);
            }
        }
        if (this.realCurrentPage == 1) {
            if (this.previousPage == 0) {
                this.titles[2].setAlpha(this.pageOffset * 0.7f);
            }
            if (this.previousPage == 2) {
                this.titles[0].setAlpha((1.0f - this.pageOffset) * 0.7f);
            }
        }
    }
}
