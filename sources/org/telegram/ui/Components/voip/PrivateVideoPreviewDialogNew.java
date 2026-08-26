package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
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
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.firebase.messaging.GmsRpc;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda79;
import org.telegram.ui.PhotoViewer$6$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer$73$$ExternalSyntheticLambda0;
import org.telegram.ui.VoIPFragment;
import org.webrtc.RendererCommon;

public abstract class PrivateVideoPreviewDialogNew extends FrameLayout implements VoIPService.StateListener {
    public final ActionBar actionBar;
    public final MotionBackgroundDrawable bgBlueViolet;
    public final GmsRpc bgBlueVioletShaderTools;
    public final MotionBackgroundDrawable bgGreen;
    public final GmsRpc bgGreenShaderTools;
    public final Camera camera;
    public boolean cameraReady;
    public final Path clipPath;
    public float closeProgress;
    public boolean isDismissed;
    public final Matrix matrixLeft;
    public final Matrix matrixRight;
    public float openProgress1;
    public float openProgress2;
    public float openTranslationX;
    public float openTranslationY;
    public float pageOffset;
    public final AnonymousClass4 positiveButton;
    public final boolean positiveButtonDrawText;
    public int previousPage;
    public int realCurrentPage;
    public ValueAnimator scrollAnimator;
    public final GestureDetector scrollGestureDetector;
    public final float startLocationX;
    public final float startLocationY;
    public int strangeCurrentPage;
    public final VoIPTextureView textureView;
    public final VoIpBitmapTextView[] titles;
    public final PhotoViewer.AnonymousClass35 titlesLayout;
    public final LoginActivity.AnonymousClass4 viewPager;
    public int visibleCameraPage;

    public final class AnonymousClass1 extends GestureDetector.SimpleOnGestureListener {
        public boolean lockDragging;
        public boolean startDragging;
        public final VoIPFragment.AnonymousClass24 this$0;

        public AnonymousClass1(VoIPFragment.AnonymousClass24 anonymousClass24) {
            this.this$0 = anonymousClass24;
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
                PhotoViewer$6$$ExternalSyntheticLambda0 photoViewer$6$$ExternalSyntheticLambda0 = new PhotoViewer$6$$ExternalSyntheticLambda0(this, x, 3);
                VoIPFragment.AnonymousClass24 anonymousClass24 = this.this$0;
                ValueAnimator valueAnimator = anonymousClass24.scrollAnimator;
                if (valueAnimator != null) {
                    this.lockDragging = true;
                    AndroidUtilities.runOnUIThread(photoViewer$6$$ExternalSyntheticLambda0, (valueAnimator.getDuration() - anonymousClass24.scrollAnimator.getCurrentPlayTime()) + 50);
                } else {
                    photoViewer$6$$ExternalSyntheticLambda0.run();
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
        this.bgGreenShaderTools = new GmsRpc(80, 80);
        this.bgBlueVioletShaderTools = new GmsRpc(80, 80);
        this.bgGreen = new MotionBackgroundDrawable(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.bgBlueViolet = new MotionBackgroundDrawable(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.startLocationX = f;
        this.startLocationY = f2;
        this.titles = new VoIpBitmapTextView[3];
        VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) this;
        this.scrollGestureDetector = new GestureDetector(context, new AnonymousClass1(anonymousClass24));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(anonymousClass24, context, 1);
        this.viewPager = anonymousClass4;
        anonymousClass4.setClickable(true);
        addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
        VoIPTextureView voIPTextureView = new VoIPTextureView(context, false, false, true, false);
        this.textureView = voIPTextureView;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        VoIPTextureView.AnonymousClass1 anonymousClass1 = voIPTextureView.renderer;
        anonymousClass1.setScalingType(scalingType);
        voIPTextureView.scaleType = 1;
        voIPTextureView.clipToTexture = true;
        anonymousClass1.setAlpha(0.0f);
        anonymousClass1.setRotateTextureWithScreen(true);
        anonymousClass1.setUseCameraRotation(true);
        addView(voIPTextureView, LayoutHelper.createFrame(-1.0f, -1));
        ActionBar actionBar = new ActionBar(context, null);
        this.actionBar = actionBar;
        actionBar.setBackButtonDrawable(new BackDrawable(false));
        actionBar.setBackgroundColor(0);
        actionBar.setItemsColor(Theme.getColor(null, Theme.key_voipgroup_actionBarItems, false), false);
        actionBar.setOccupyStatusBar(true);
        int i = 9;
        actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(anonymousClass24, i));
        addView(actionBar);
        ?? r1 = new TextView(getContext()) {
            public final Paint[] gradientPaint;
            public final Paint whitePaint;

            {
                super(context);
                Paint paint = new Paint();
                this.whitePaint = paint;
                this.gradientPaint = new Paint[this.this$0.titles.length];
                MotionBackgroundDrawable motionBackgroundDrawable = this.this$0.bgGreen;
                motionBackgroundDrawable.setBounds(0, 0, 80, 80);
                MotionBackgroundDrawable motionBackgroundDrawable2 = this.this$0.bgBlueViolet;
                motionBackgroundDrawable2.setBounds(0, 0, 80, 80);
                GmsRpc gmsRpc = this.this$0.bgGreenShaderTools;
                gmsRpc.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
                GmsRpc gmsRpc2 = this.this$0.bgBlueVioletShaderTools;
                gmsRpc2.setBounds(0.0f, 0.0f, 80.0f, 80.0f);
                motionBackgroundDrawable.setAlpha(255);
                motionBackgroundDrawable2.setAlpha(255);
                Canvas canvas = (Canvas) gmsRpc.metadata;
                PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
                canvas.drawColor(0, mode);
                Canvas canvas2 = (Canvas) gmsRpc2.metadata;
                canvas2.drawColor(0, mode);
                motionBackgroundDrawable.draw(canvas);
                motionBackgroundDrawable2.draw(canvas2);
                paint.setColor(-1);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                int i2;
                VoIPFragment.AnonymousClass24 anonymousClass25 = this.this$0;
                anonymousClass25.bgGreenShaderTools.setBounds(-getX(), -getY(), anonymousClass25.getWidth() - getX(), anonymousClass25.getHeight() - getY());
                anonymousClass25.bgBlueVioletShaderTools.setBounds(-getX(), -getY(), anonymousClass25.getWidth() - getX(), anonymousClass25.getHeight() - getY());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                int i3 = anonymousClass25.strangeCurrentPage;
                Paint[] paintArr = this.gradientPaint;
                paintArr[i3].setAlpha(255);
                float fDp = AndroidUtilities.dp(8.0f) + ((int) ((1.0f - anonymousClass25.openProgress1) * (AndroidUtilities.dp(26.0f) - AndroidUtilities.dp(8.0f))));
                canvas.drawRoundRect(rectF, fDp, fDp, paintArr[anonymousClass25.strangeCurrentPage]);
                float f3 = anonymousClass25.pageOffset;
                if (f3 > 0.0f && (i2 = anonymousClass25.strangeCurrentPage + 1) < paintArr.length) {
                    paintArr[i2].setAlpha((int) (f3 * 255.0f));
                    canvas.drawRoundRect(rectF, fDp, fDp, paintArr[anonymousClass25.strangeCurrentPage + 1]);
                }
                float f4 = anonymousClass25.openProgress1;
                if (f4 < 1.0f) {
                    Paint paint = this.whitePaint;
                    paint.setAlpha((int) ((1.0f - f4) * 255.0f));
                    canvas.drawRoundRect(rectF, fDp, fDp, paint);
                }
                super.onDraw(canvas);
                if (anonymousClass25.positiveButtonDrawText) {
                    int width = getWidth() / 2;
                    float height = getHeight() / 2;
                    AnonymousClass4 anonymousClass5 = anonymousClass25.positiveButton;
                    canvas.drawText(LocaleController.getString(R.string.VoipShareVideo), width, (int) (height - ((anonymousClass5.getPaint().ascent() + anonymousClass5.getPaint().descent()) / 2.0f)), anonymousClass5.getPaint());
                }
            }

            @Override
            public final void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                int i6 = 0;
                while (true) {
                    Paint[] paintArr = this.gradientPaint;
                    if (i6 >= paintArr.length) {
                        return;
                    }
                    VoIPFragment.AnonymousClass24 anonymousClass25 = this.this$0;
                    if (i6 == 0) {
                        paintArr[i6] = (Paint) anonymousClass25.bgGreenShaderTools.app;
                    } else if (i6 == 1) {
                        paintArr[i6] = (Paint) anonymousClass25.bgBlueVioletShaderTools.app;
                    } else {
                        paintArr[i6] = (Paint) anonymousClass25.bgGreenShaderTools.app;
                    }
                    i6++;
                }
            }
        };
        this.positiveButton = r1;
        r1.setMaxLines(1);
        r1.setEllipsize(null);
        r1.setMinWidth(AndroidUtilities.dp(64.0f));
        r1.setTag(-1);
        r1.setTextSize(1, 14.0f);
        int i2 = Theme.key_voipgroup_nameText;
        r1.setTextColor(Theme.getColor(null, i2, false));
        r1.setGravity(17);
        r1.setTypeface(AndroidUtilities.bold());
        r1.getPaint().setTextAlign(Paint.Align.CENTER);
        r1.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(8.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i2, false), 76);
            r1.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        r1.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        VoIPFragment.AnonymousClass24 anonymousClass25 = (VoIPFragment.AnonymousClass24) this;
        r1.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(anonymousClass25, 12));
        addView((View) r1, LayoutHelper.createFrame(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(anonymousClass24, context, i);
        this.titlesLayout = anonymousClass35;
        anonymousClass35.setClipChildren(false);
        addView(anonymousClass35, LayoutHelper.createFrame(-1, 64, 80));
        int i3 = 0;
        while (i3 < this.titles.length) {
            String string = i3 == 0 ? LocaleController.getString(R.string.VoipPhoneScreen) : i3 == 1 ? LocaleController.getString(R.string.VoipFrontCamera) : LocaleController.getString(R.string.VoipBackCamera);
            this.titles[i3] = new VoIpBitmapTextView(context, string);
            this.titles[i3].setContentDescription(string);
            this.titles[i3].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.titlesLayout.addView(this.titles[i3], LayoutHelper.createLinear(-2, -1));
            this.titles[i3].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(anonymousClass25, i3, 13));
            i3++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.textureView.renderer.setMirror(sharedInstance.isFrontFaceCamera());
            this.textureView.renderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new AnonymousClass6());
            sharedInstance.setLocalSink(this.textureView.renderer, false);
        }
        LoginActivity.AnonymousClass4 anonymousClass5 = this.viewPager;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true, 0, false));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, LayoutHelper.createFrame(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, -1, 1, textView);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        anonymousClass5.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        anonymousClass5.addView(imageView2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda79(anonymousClass25, f, f2, 3));
        valueAnimatorOfFloat.addListener(new Tooltip.AnonymousClass1(anonymousClass24, 26));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(anonymousClass25, 6));
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
        setTranslationY(AndroidUtilities.dp(53.0f));
        setTranslationX((f - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        animate().translationY(0.0f).translationX(0.0f).setDuration(j).start();
        this.positiveButtonDrawText = true;
        setCurrentPage(1, false);
    }

    public final void dismiss(boolean z, boolean z2) {
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        if (this.isDismissed || this.openProgress1 != 1.0f) {
            return;
        }
        VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) this;
        VoIPFragment.this.gradientLayout.lockDrawing = false;
        VoIPFragment.this.gradientLayout.invalidate();
        this.isDismissed = true;
        saveLastCameraBitmap$3();
        VoIPFragment.this.previewDialog = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        VoIPFragment.this.windowView.setLockOnScreen(false);
        if (z2) {
            VoIPFragment.this.currentUserIsVideo = true;
            if (sharedInstance != null && !z) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                VoIPFragment voIPFragment = VoIPFragment.this;
                voIPFragment.setVideoAction(voIPFragment.bottomVideoBtn, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        VoIPFragment voIPFragment2 = VoIPFragment.this;
        voIPFragment2.previousState = voIPFragment2.currentState;
        voIPFragment2.updateViewState$1();
        if (VoIPFragment.this.callingUserIsVideo && z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5(this, 0));
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setStartDelay(60L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter(this) {
                public final PrivateVideoPreviewDialogNew this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 0:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.this$0;
                            if (privateVideoPreviewDialogNew.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew.getParent()).removeView(privateVideoPreviewDialogNew);
                            }
                            break;
                        case 1:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew2 = this.this$0;
                            if (privateVideoPreviewDialogNew2.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew2.getParent()).removeView(privateVideoPreviewDialogNew2);
                            }
                            break;
                        default:
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew3 = this.this$0;
                            if (privateVideoPreviewDialogNew3.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew3.getParent()).removeView(privateVideoPreviewDialogNew3);
                            }
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.start();
            animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.actionBar.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.titlesLayout.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z2) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnimatorListenerAdapter(this) {
                public final PrivateVideoPreviewDialogNew this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.this$0;
                            if (privateVideoPreviewDialogNew.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew.getParent()).removeView(privateVideoPreviewDialogNew);
                            }
                            break;
                        case 1:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew2 = this.this$0;
                            if (privateVideoPreviewDialogNew2.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew2.getParent()).removeView(privateVideoPreviewDialogNew2);
                            }
                            break;
                        default:
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew3 = this.this$0;
                            if (privateVideoPreviewDialogNew3.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew3.getParent()).removeView(privateVideoPreviewDialogNew3);
                            }
                            break;
                    }
                }
            });
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5(this, 1));
            valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter(this) {
                public final PrivateVideoPreviewDialogNew this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i3) {
                        case 0:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = this.this$0;
                            if (privateVideoPreviewDialogNew.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew.getParent()).removeView(privateVideoPreviewDialogNew);
                            }
                            break;
                        case 1:
                            super.onAnimationEnd(animator);
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew2 = this.this$0;
                            if (privateVideoPreviewDialogNew2.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew2.getParent()).removeView(privateVideoPreviewDialogNew2);
                            }
                            break;
                        default:
                            PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew3 = this.this$0;
                            if (privateVideoPreviewDialogNew3.getParent() != null) {
                                ((ViewGroup) privateVideoPreviewDialogNew3.getParent()).removeView(privateVideoPreviewDialogNew3);
                            }
                            break;
                    }
                }
            });
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5(this, 2));
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
            animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.startLocationX - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration((long) (0.6f * f)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f)).setStartDelay((long) (f * 0.75f)).start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f = this.openProgress1;
        Path path = this.clipPath;
        if (f < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            int i2 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float fDp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.openProgress1);
            path.reset();
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
            path.addRoundRect(fDp5, fDp6, iLerp + fDp5, fDp6 + iLerp2, fDp, fDp, direction);
            canvas.clipPath(path);
        }
        if (this.closeProgress > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f2 = this.closeProgress;
            int i3 = (int) (floatingViewLocation[0] * f2);
            int i4 = (int) (floatingViewLocation[1] * f2);
            int i5 = floatingViewLocation[2];
            int i6 = AndroidUtilities.displaySize.x;
            float fM = DiffUtil.m(1.0f, f2, i6 - i5, i5) / i6;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * fM, getHeight() * fM, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i3, i4);
            canvas.clipPath(path);
            canvas.scale(fM, fM);
        }
        super.dispatchDraw(canvas);
    }

    public int[] getFloatingViewLocation() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
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
    public final void onCameraFirstFrameAvailable() {
        if (this.cameraReady) {
            return;
        }
        this.cameraReady = true;
        if (this.realCurrentPage != 0) {
            this.textureView.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.textureView.renderer.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateTitlesLayout$1();
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void saveLastCameraBitmap$3() {
        VoIPTextureView voIPTextureView = this.textureView;
        if (this.cameraReady) {
            try {
                Bitmap bitmap = voIPTextureView.renderer.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), voIPTextureView.renderer.getMatrix(), true);
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
        ((FrameLayout.LayoutParams) getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i;
        ((FrameLayout.LayoutParams) this.titlesLayout.getLayoutParams()).bottomMargin = i;
    }

    public final void setCurrentPage(int i, boolean z) {
        int i2;
        if (this.strangeCurrentPage == i || (i2 = this.realCurrentPage) == i) {
            return;
        }
        VoIPTextureView voIPTextureView = this.textureView;
        if (!z) {
            this.realCurrentPage = i;
            this.strangeCurrentPage = i;
            this.pageOffset = 0.0f;
            updateTitlesLayout$1();
            voIPTextureView.setVisibility(0);
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
                voIPTextureView.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i == 0) {
            this.viewPager.findViewWithTag("screencast_stub").setVisibility(0);
            saveLastCameraBitmap$3();
            showStub(false, false);
            voIPTextureView.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            saveLastCameraBitmap$3();
            this.visibleCameraPage = i;
            this.cameraReady = false;
            showStub(true, false);
            voIPTextureView.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i3 = this.realCurrentPage;
        if (i > i3) {
            this.previousPage = i3;
            this.realCurrentPage = i3 + 1;
            this.scrollAnimator = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.previousPage = i3;
            this.realCurrentPage = i3 - 1;
            this.strangeCurrentPage = i;
            this.scrollAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.scrollAnimator.addUpdateListener(new PrivateVideoPreviewDialogNew$$ExternalSyntheticLambda5(this, 3));
        this.scrollAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i, 9));
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

    public final void updateTitlesLayout$1() {
        int i = this.strangeCurrentPage;
        VoIpBitmapTextView[] voIpBitmapTextViewArr = this.titles;
        VoIpBitmapTextView voIpBitmapTextView = voIpBitmapTextViewArr[i];
        VoIpBitmapTextView voIpBitmapTextView2 = i < voIpBitmapTextViewArr.length - 1 ? voIpBitmapTextViewArr[i + 1] : null;
        float measuredWidth = (voIpBitmapTextView.getMeasuredWidth() / 2) + voIpBitmapTextView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (voIpBitmapTextView2 != null) {
            measuredWidth2 -= (((voIpBitmapTextView2.getMeasuredWidth() / 2) + voIpBitmapTextView2.getLeft()) - measuredWidth) * this.pageOffset;
        }
        int i2 = 0;
        while (true) {
            float f = 0.7f;
            if (i2 >= voIpBitmapTextViewArr.length) {
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
            voIpBitmapTextViewArr[i2].setAlpha(f);
            voIpBitmapTextViewArr[i2].setScaleX(f2);
            voIpBitmapTextViewArr[i2].setScaleY(f2);
            voIpBitmapTextViewArr[i2].setTranslationX(measuredWidth2);
            i2++;
        }
        invalidate();
        if (this.realCurrentPage == 0) {
            voIpBitmapTextViewArr[2].setAlpha(this.pageOffset * 0.7f);
        }
        if (this.realCurrentPage == 2) {
            float f5 = this.pageOffset;
            if (f5 > 0.0f) {
                voIpBitmapTextViewArr[0].setAlpha((1.0f - f5) * 0.7f);
            } else {
                voIpBitmapTextViewArr[0].setAlpha(0.0f);
            }
        }
        if (this.realCurrentPage == 1) {
            if (this.previousPage == 0) {
                voIpBitmapTextViewArr[2].setAlpha(this.pageOffset * 0.7f);
            }
            if (this.previousPage == 2) {
                voIpBitmapTextViewArr[0].setAlpha((1.0f - this.pageOffset) * 0.7f);
            }
        }
    }
}
