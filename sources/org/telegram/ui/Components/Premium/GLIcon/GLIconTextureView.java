package org.telegram.ui.Components.Premium.GLIcon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Stars.StarsReactionsSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.Stories.SelfStoriesPreviewView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda35;

public class GLIconTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public final ArrayList animationIndexes;
    public int animationPointer;
    public final int animationsCount;
    public AnimatorSet animatorSet;
    public boolean attached;
    public ValueAnimator backAnimation;
    public boolean dialogIsVisible;
    public EGLConfig eglConfig;
    public final GestureDetector gestureDetector;
    public final AnonymousClass2 idleAnimation;
    public final long idleDelay;
    public boolean isRunning;
    public EGL10 mEgl;
    public EGLContext mEglContext;
    public EGLDisplay mEglDisplay;
    public EGLSurface mEglSurface;
    public GL10 mGl;
    public GLIconRenderer mRenderer;
    public SurfaceTexture mSurface;
    public boolean paused;
    public volatile boolean ready;
    public volatile StarsReactionsSheet$$ExternalSyntheticLambda11 readyListener;
    public boolean rendererChanged;
    public StarParticlesView starParticlesView;
    public int surfaceHeight;
    public int surfaceWidth;
    public final int targetFps;
    public int targetFrameDurationMillis;
    public SimpleDecoder.AnonymousClass1 thread;
    public boolean touched;
    public final int type;
    public final GLIconTextureView$$ExternalSyntheticLambda0 xUpdater;
    public final GLIconTextureView$$ExternalSyntheticLambda0 xUpdater2;
    public final GLIconTextureView$$ExternalSyntheticLambda0 yUpdater;

    public final class AnonymousClass2 implements Runnable {
        public final int $r8$classId;
        public final GLIconTextureView this$0;

        public AnonymousClass2(GLIconTextureView gLIconTextureView, int i) {
            this.$r8$classId = i;
            this.this$0 = gLIconTextureView;
        }

        @Override
        public final void run() {
            ValueAnimator valueAnimator;
            switch (this.$r8$classId) {
                case 0:
                    GLIconTextureView gLIconTextureView = this.this$0;
                    AnimatorSet animatorSet = gLIconTextureView.animatorSet;
                    if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = gLIconTextureView.backAnimation) != null && valueAnimator.isRunning())) {
                        gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                    } else {
                        gLIconTextureView.startIdleAnimation();
                    }
                    break;
                default:
                    this.this$0.startBackAnimation();
                    break;
            }
        }
    }

    public GLIconTextureView(Context context, int i, int i2) {
        super(context);
        int iM = 0;
        this.isRunning = false;
        this.paused = true;
        this.rendererChanged = false;
        this.dialogIsVisible = false;
        this.animationIndexes = new ArrayList();
        this.animatorSet = new AnimatorSet();
        final int i3 = 0;
        this.idleAnimation = new AnonymousClass2(this, i3);
        this.xUpdater2 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final GLIconTextureView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        this.f$0.mRenderer.angleX2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f$0.mRenderer.angleX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f$0.mRenderer.angleY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.xUpdater = new ValueAnimator.AnimatorUpdateListener(this) {
            public final GLIconTextureView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        this.f$0.mRenderer.angleX2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f$0.mRenderer.angleX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f$0.mRenderer.angleY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i5 = 2;
        this.yUpdater = new ValueAnimator.AnimatorUpdateListener(this) {
            public final GLIconTextureView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        this.f$0.mRenderer.angleX2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f$0.mRenderer.angleX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f$0.mRenderer.angleY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.type = i2;
        this.animationsCount = (i2 == 1 || i2 == 4 || i2 == 3) ? 1 : 5;
        this.idleDelay = i2 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new GLIconRenderer(context, i, i2));
        this.targetFps = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new SelfStoriesPreviewView.AnonymousClass1(1, this));
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (iM < this.animationsCount) {
            iM = LocationController$$ExternalSyntheticOutline0.m(iM, iM, 1, this.animationIndexes);
        }
        Collections.shuffle(this.animationIndexes);
    }

    public static void access$200(GLIconTextureView gLIconTextureView) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        gLIconTextureView.mEgl = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        gLIconTextureView.mEglDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(gLIconTextureView.mEgl.eglGetError()));
        }
        if (!gLIconTextureView.mEgl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(gLIconTextureView.mEgl.eglGetError()));
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = EmuDetector.with(gLIconTextureView.getContext()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
        gLIconTextureView.eglConfig = null;
        if (!gLIconTextureView.mEgl.eglChooseConfig(gLIconTextureView.mEglDisplay, iArr2, eGLConfigArr, 1, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(gLIconTextureView.mEgl.eglGetError()));
        }
        if (iArr[0] > 0) {
            gLIconTextureView.eglConfig = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = gLIconTextureView.eglConfig;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        gLIconTextureView.mEglContext = gLIconTextureView.mEgl.eglCreateContext(gLIconTextureView.mEglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        gLIconTextureView.checkEglError();
        gLIconTextureView.mEglSurface = gLIconTextureView.mEgl.eglCreateWindowSurface(gLIconTextureView.mEglDisplay, gLIconTextureView.eglConfig, gLIconTextureView.mSurface, null);
        gLIconTextureView.checkEglError();
        EGLSurface eGLSurface = gLIconTextureView.mEglSurface;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int iEglGetError = gLIconTextureView.mEgl.eglGetError();
            if (iEglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            } else {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(iEglGetError));
            }
        }
        if (!gLIconTextureView.mEgl.eglMakeCurrent(gLIconTextureView.mEglDisplay, eGLSurface, eGLSurface, gLIconTextureView.mEglContext)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(gLIconTextureView.mEgl.eglGetError()));
        }
        gLIconTextureView.checkEglError();
        gLIconTextureView.mGl = (GL10) gLIconTextureView.mEglContext.getGL();
        gLIconTextureView.checkEglError();
    }

    public static boolean access$600(GLIconTextureView gLIconTextureView) {
        boolean z;
        synchronized (gLIconTextureView) {
            z = gLIconTextureView.paused;
        }
        return z || gLIconTextureView.mRenderer == null;
    }

    public static void access$700(GLIconTextureView gLIconTextureView, float f) {
        synchronized (gLIconTextureView) {
            try {
                if (!gLIconTextureView.mEglContext.equals(gLIconTextureView.mEgl.eglGetCurrentContext()) || !gLIconTextureView.mEglSurface.equals(gLIconTextureView.mEgl.eglGetCurrentSurface(12377))) {
                    gLIconTextureView.checkEglError();
                    EGL10 egl10 = gLIconTextureView.mEgl;
                    EGLDisplay eGLDisplay = gLIconTextureView.mEglDisplay;
                    EGLSurface eGLSurface = gLIconTextureView.mEglSurface;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, gLIconTextureView.mEglContext)) {
                        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(gLIconTextureView.mEgl.eglGetError()));
                    }
                    gLIconTextureView.checkEglError();
                }
                GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
                if (gLIconRenderer != null) {
                    gLIconRenderer.dt = f;
                    gLIconRenderer.onDrawFrame(gLIconTextureView.mGl);
                }
                int iGlGetError = gLIconTextureView.mGl.glGetError();
                if (iGlGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(iGlGetError));
                }
                gLIconTextureView.mEgl.eglSwapBuffers(gLIconTextureView.mEglDisplay, gLIconTextureView.mEglSurface);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cancelAnimatons() {
        ValueAnimator valueAnimator = this.backAnimation;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.backAnimation.cancel();
            this.backAnimation = null;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.animatorSet.cancel();
            this.animatorSet = null;
        }
    }

    public final void checkEglError() {
        if (this.mEgl.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.rendererChanged = true;
        scheduleIdleAnimation(this.idleDelay);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimatons();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.angleX = 0.0f;
            gLIconRenderer.angleY = 0.0f;
            gLIconRenderer.angleX2 = 0.0f;
        }
        this.attached = false;
    }

    public void onLongPress() {
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.thread = new SimpleDecoder.AnonymousClass1(this);
        this.mSurface = surfaceTexture;
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.targetFrameDurationMillis = Math.max(0, ((int) ((1.0f / this.targetFps) * 1000.0f)) - 1);
        this.thread.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.ready = false;
        if (this.thread != null) {
            this.isRunning = false;
            this.thread = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.onSurfaceChanged(this.mGl, i, i2);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.touched = false;
            startBackAnimation();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public final void scheduleIdleAnimation(long j) {
        AnonymousClass2 anonymousClass2 = this.idleAnimation;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
        if (this.dialogIsVisible) {
            return;
        }
        AndroidUtilities.runOnUIThread(anonymousClass2, j);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        GLIconRenderer gLIconRenderer = this.mRenderer;
        Icon3D icon3D = gLIconRenderer.model;
        if (icon3D != null) {
            icon3D.backgroundBitmap = bitmap;
        }
        gLIconRenderer.backgroundBitmap = bitmap;
    }

    public void setDialogVisible(boolean z) {
        this.dialogIsVisible = z;
        if (!z) {
            scheduleIdleAnimation(this.idleDelay);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
            startBackAnimation();
        }
    }

    public synchronized void setPaused(boolean z) {
        this.paused = z;
    }

    public synchronized void setRenderer(GLIconRenderer gLIconRenderer) {
        this.mRenderer = gLIconRenderer;
        this.rendererChanged = true;
    }

    public void setStarParticlesView(StarParticlesView starParticlesView) {
        this.starParticlesView = starParticlesView;
    }

    public final void startBackAnimation() {
        float f;
        cancelAnimatons();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        float f2 = gLIconRenderer.angleX;
        float f3 = gLIconRenderer.angleY;
        float f4 = gLIconRenderer.angleX2;
        float f5 = f2 + f3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.backAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda35(this, f2, f4, f3, 1));
        this.backAnimation.setDuration(600L);
        this.backAnimation.setInterpolator(new OvershootInterpolator());
        this.backAnimation.start();
        StarParticlesView starParticlesView = this.starParticlesView;
        if (starParticlesView != null) {
            float fAbs = Math.abs(f5);
            if (fAbs < 60.0f) {
                f = 5.0f;
            } else {
                f = fAbs < 180.0f ? 9.0f : 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ItemOptions$$ExternalSyntheticLambda4 itemOptions$$ExternalSyntheticLambda4 = new ItemOptions$$ExternalSyntheticLambda4(starParticlesView, 29);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, f);
            valueAnimatorOfFloat2.addUpdateListener(itemOptions$$ExternalSyntheticLambda4);
            valueAnimatorOfFloat2.setDuration(600L);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f, 1.0f);
            valueAnimatorOfFloat3.addUpdateListener(itemOptions$$ExternalSyntheticLambda4);
            valueAnimatorOfFloat3.setDuration(2000L);
            animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
            animatorSet.start();
        }
        scheduleIdleAnimation(this.idleDelay);
    }

    public void startIdleAnimation() {
        final int i = 3;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 2;
        if (this.attached) {
            ArrayList arrayList = this.animationIndexes;
            int iIntValue = ((Integer) arrayList.get(this.animationPointer)).intValue();
            int i5 = this.animationPointer + 1;
            this.animationPointer = i5;
            if (i5 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.animationPointer = 0;
            }
            GLIconTextureView$$ExternalSyntheticLambda0 gLIconTextureView$$ExternalSyntheticLambda0 = this.yUpdater;
            GLIconTextureView$$ExternalSyntheticLambda0 gLIconTextureView$$ExternalSyntheticLambda1 = this.xUpdater;
            if (iIntValue == 0) {
                int iAbs = Math.abs(Utilities.random.nextInt() % 4);
                this.animatorSet = new AnimatorSet();
                int i6 = this.type;
                if (i6 == 4) {
                    float f = this.mRenderer.angleX;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 360.0f + f);
                    valueAnimatorOfFloat.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                    valueAnimatorOfFloat.setDuration(12000L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    this.animatorSet.playTogether(valueAnimatorOfFloat);
                } else if (iAbs != 0 || i6 == 1 || i6 == 3) {
                    int i7 = (i6 == 1 || i6 == 3) ? 360 : 485;
                    if (iAbs == 2) {
                        i7 = -i7;
                    }
                    float f2 = i7;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.mRenderer.angleY, f2);
                    valueAnimatorOfFloat2.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                    valueAnimatorOfFloat2.setDuration(3000L);
                    valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f2, 0.0f);
                    valueAnimatorOfFloat3.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                    valueAnimatorOfFloat3.setDuration(1000L);
                    valueAnimatorOfFloat3.setStartDelay(3000L);
                    valueAnimatorOfFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
                } else {
                    float f3 = 48;
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.mRenderer.angleY, f3);
                    valueAnimatorOfFloat4.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
                    valueAnimatorOfFloat4.setDuration(2300L);
                    valueAnimatorOfFloat4.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f3, 0.0f);
                    valueAnimatorOfFloat5.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
                    valueAnimatorOfFloat5.setDuration(500L);
                    valueAnimatorOfFloat5.setStartDelay(2300L);
                    valueAnimatorOfFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.animatorSet.playTogether(valueAnimatorOfFloat4, valueAnimatorOfFloat5);
                }
                this.animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    public final GLIconTextureView this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i3) {
                            case 0:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView = this.this$0;
                                gLIconTextureView.mRenderer.angleX = 0.0f;
                                gLIconTextureView.animatorSet = null;
                                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                                break;
                            case 1:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView2 = this.this$0;
                                gLIconTextureView2.mRenderer.angleX = 0.0f;
                                gLIconTextureView2.animatorSet = null;
                                gLIconTextureView2.scheduleIdleAnimation(gLIconTextureView2.idleDelay);
                                break;
                            case 2:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView3 = this.this$0;
                                gLIconTextureView3.mRenderer.angleX = 0.0f;
                                gLIconTextureView3.animatorSet = null;
                                gLIconTextureView3.scheduleIdleAnimation(gLIconTextureView3.idleDelay);
                                break;
                            default:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView4 = this.this$0;
                                gLIconTextureView4.mRenderer.angleX = 0.0f;
                                gLIconTextureView4.animatorSet = null;
                                gLIconTextureView4.scheduleIdleAnimation(gLIconTextureView4.idleDelay);
                                break;
                        }
                    }
                });
                this.animatorSet.start();
                return;
            }
            if (iIntValue == 1) {
                this.animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.mRenderer.angleX, 360.0f);
                valueAnimatorOfFloat6.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                valueAnimatorOfFloat6.setDuration(8000L);
                valueAnimatorOfFloat6.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.playTogether(valueAnimatorOfFloat6);
                this.animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    public final GLIconTextureView this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView = this.this$0;
                                gLIconTextureView.mRenderer.angleX = 0.0f;
                                gLIconTextureView.animatorSet = null;
                                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                                break;
                            case 1:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView2 = this.this$0;
                                gLIconTextureView2.mRenderer.angleX = 0.0f;
                                gLIconTextureView2.animatorSet = null;
                                gLIconTextureView2.scheduleIdleAnimation(gLIconTextureView2.idleDelay);
                                break;
                            case 2:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView3 = this.this$0;
                                gLIconTextureView3.mRenderer.angleX = 0.0f;
                                gLIconTextureView3.animatorSet = null;
                                gLIconTextureView3.scheduleIdleAnimation(gLIconTextureView3.idleDelay);
                                break;
                            default:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView4 = this.this$0;
                                gLIconTextureView4.mRenderer.angleX = 0.0f;
                                gLIconTextureView4.animatorSet = null;
                                gLIconTextureView4.scheduleIdleAnimation(gLIconTextureView4.idleDelay);
                                break;
                        }
                    }
                });
                this.animatorSet.start();
                return;
            }
            if (iIntValue != 2) {
                this.animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(this.mRenderer.angleX, 180.0f);
                valueAnimatorOfFloat7.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                valueAnimatorOfFloat7.setDuration(600L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                valueAnimatorOfFloat7.setInterpolator(cubicBezierInterpolator);
                ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                valueAnimatorOfFloat8.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
                valueAnimatorOfFloat8.setDuration(600L);
                valueAnimatorOfFloat8.setStartDelay(2000L);
                valueAnimatorOfFloat8.setInterpolator(cubicBezierInterpolator);
                this.animatorSet.playTogether(valueAnimatorOfFloat7, valueAnimatorOfFloat8);
                this.animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    public final GLIconTextureView this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i4) {
                            case 0:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView = this.this$0;
                                gLIconTextureView.mRenderer.angleX = 0.0f;
                                gLIconTextureView.animatorSet = null;
                                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                                break;
                            case 1:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView2 = this.this$0;
                                gLIconTextureView2.mRenderer.angleX = 0.0f;
                                gLIconTextureView2.animatorSet = null;
                                gLIconTextureView2.scheduleIdleAnimation(gLIconTextureView2.idleDelay);
                                break;
                            case 2:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView3 = this.this$0;
                                gLIconTextureView3.mRenderer.angleX = 0.0f;
                                gLIconTextureView3.animatorSet = null;
                                gLIconTextureView3.scheduleIdleAnimation(gLIconTextureView3.idleDelay);
                                break;
                            default:
                                super.onAnimationEnd(animator);
                                GLIconTextureView gLIconTextureView4 = this.this$0;
                                gLIconTextureView4.mRenderer.angleX = 0.0f;
                                gLIconTextureView4.animatorSet = null;
                                gLIconTextureView4.scheduleIdleAnimation(gLIconTextureView4.idleDelay);
                                break;
                        }
                    }
                });
                this.animatorSet.start();
                return;
            }
            this.animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(this.mRenderer.angleX, 184.0f);
            valueAnimatorOfFloat9.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
            valueAnimatorOfFloat9.setDuration(600L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT;
            valueAnimatorOfFloat9.setInterpolator(cubicBezierInterpolator2);
            ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(this.mRenderer.angleY, 50.0f);
            valueAnimatorOfFloat10.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
            valueAnimatorOfFloat10.setDuration(600L);
            valueAnimatorOfFloat10.setInterpolator(cubicBezierInterpolator2);
            ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            valueAnimatorOfFloat11.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda1);
            valueAnimatorOfFloat11.setDuration(800L);
            valueAnimatorOfFloat11.setStartDelay(10000L);
            valueAnimatorOfFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            valueAnimatorOfFloat12.addUpdateListener(gLIconTextureView$$ExternalSyntheticLambda0);
            valueAnimatorOfFloat12.setDuration(800L);
            valueAnimatorOfFloat12.setStartDelay(10000L);
            valueAnimatorOfFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            valueAnimatorOfFloat13.addUpdateListener(this.xUpdater2);
            valueAnimatorOfFloat13.setDuration(10000L);
            valueAnimatorOfFloat13.setInterpolator(new LinearInterpolator());
            this.animatorSet.playTogether(valueAnimatorOfFloat9, valueAnimatorOfFloat10, valueAnimatorOfFloat11, valueAnimatorOfFloat12, valueAnimatorOfFloat13);
            this.animatorSet.addListener(new AnimatorListenerAdapter(this) {
                public final GLIconTextureView this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            super.onAnimationEnd(animator);
                            GLIconTextureView gLIconTextureView = this.this$0;
                            gLIconTextureView.mRenderer.angleX = 0.0f;
                            gLIconTextureView.animatorSet = null;
                            gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                            break;
                        case 1:
                            super.onAnimationEnd(animator);
                            GLIconTextureView gLIconTextureView2 = this.this$0;
                            gLIconTextureView2.mRenderer.angleX = 0.0f;
                            gLIconTextureView2.animatorSet = null;
                            gLIconTextureView2.scheduleIdleAnimation(gLIconTextureView2.idleDelay);
                            break;
                        case 2:
                            super.onAnimationEnd(animator);
                            GLIconTextureView gLIconTextureView3 = this.this$0;
                            gLIconTextureView3.mRenderer.angleX = 0.0f;
                            gLIconTextureView3.animatorSet = null;
                            gLIconTextureView3.scheduleIdleAnimation(gLIconTextureView3.idleDelay);
                            break;
                        default:
                            super.onAnimationEnd(animator);
                            GLIconTextureView gLIconTextureView4 = this.this$0;
                            gLIconTextureView4.mRenderer.angleX = 0.0f;
                            gLIconTextureView4.animatorSet = null;
                            gLIconTextureView4.scheduleIdleAnimation(gLIconTextureView4.idleDelay);
                            break;
                    }
                }
            });
            this.animatorSet.start();
        }
    }
}
