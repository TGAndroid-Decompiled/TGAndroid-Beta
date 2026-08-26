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
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;

public class GLIconTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    ArrayList<Integer> animationIndexes;
    int animationPointer;
    private final int animationsCount;
    AnimatorSet animatorSet;
    boolean attached;
    ValueAnimator backAnimation;
    private boolean dialogIsVisible;
    private EGLConfig eglConfig;
    GestureDetector gestureDetector;
    Runnable idleAnimation;
    private long idleDelay;
    public boolean isRunning;
    private EGL10 mEgl;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface;
    private GL10 mGl;
    public GLIconRenderer mRenderer;
    private SurfaceTexture mSurface;
    private boolean paused;
    private volatile boolean ready;
    private volatile Runnable readyListener;
    private boolean rendererChanged;
    StarParticlesView starParticlesView;
    private int surfaceHeight;
    private int surfaceWidth;
    private int targetFps;
    private int targetFrameDurationMillis;
    private RenderThread thread;
    public boolean touched;
    int type;
    ValueAnimator.AnimatorUpdateListener xUpdater;
    ValueAnimator.AnimatorUpdateListener xUpdater2;
    ValueAnimator.AnimatorUpdateListener yUpdater;

    public final class AnonymousClass1 implements GestureDetector.OnGestureListener {
        public AnonymousClass1() {
        }

        @Override
        public final boolean onDown(MotionEvent motionEvent) {
            GLIconTextureView gLIconTextureView = GLIconTextureView.this;
            ValueAnimator valueAnimator = gLIconTextureView.backAnimation;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                gLIconTextureView.backAnimation.cancel();
                gLIconTextureView.backAnimation = null;
            }
            AnimatorSet animatorSet = gLIconTextureView.animatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                gLIconTextureView.animatorSet.cancel();
                gLIconTextureView.animatorSet = null;
            }
            AndroidUtilities.cancelRunOnUIThread(gLIconTextureView.idleAnimation);
            gLIconTextureView.touched = true;
            return true;
        }

        @Override
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override
        public final void onLongPress(MotionEvent motionEvent) {
            GLIconTextureView.this.onLongPress();
        }

        @Override
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GLIconRenderer gLIconRenderer = GLIconTextureView.this.mRenderer;
            gLIconRenderer.angleX = (f * 0.5f) + gLIconRenderer.angleX;
            gLIconRenderer.angleY = (f2 * 0.05f) + gLIconRenderer.angleY;
            return true;
        }

        @Override
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            float measuredWidth = GLIconTextureView.this.getMeasuredWidth() / 2.0f;
            final float x = ((measuredWidth - motionEvent.getX()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth;
            final float y = ((measuredWidth - motionEvent.getY()) * (Utilities.random.nextInt(30) + 40)) / measuredWidth;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    int i = 4;
                    GLIconTextureView.AnonymousClass1 anonymousClass1 = this.f$0;
                    GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                    ValueAnimator valueAnimator = gLIconTextureView.backAnimation;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gLIconTextureView.backAnimation.cancel();
                        gLIconTextureView.backAnimation = null;
                    }
                    AnimatorSet animatorSet = gLIconTextureView.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        gLIconTextureView.animatorSet.cancel();
                        gLIconTextureView.animatorSet = null;
                    }
                    if (Math.abs(gLIconTextureView.mRenderer.angleX) > 10.0f) {
                        gLIconTextureView.startBackAnimation();
                        return;
                    }
                    AndroidUtilities.cancelRunOnUIThread(gLIconTextureView.idleAnimation);
                    gLIconTextureView.animatorSet = new AnimatorSet();
                    float f = gLIconTextureView.mRenderer.angleX;
                    float f2 = x;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                    valueAnimatorOfFloat.addUpdateListener(gLIconTextureView.xUpdater);
                    long j = 220;
                    valueAnimatorOfFloat.setDuration(j);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(gLIconTextureView.xUpdater);
                    valueAnimatorOfFloat2.setStartDelay(j);
                    valueAnimatorOfFloat2.setDuration(600L);
                    valueAnimatorOfFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    float f3 = gLIconTextureView.mRenderer.angleY;
                    float f4 = y;
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f3, f4);
                    valueAnimatorOfFloat3.addUpdateListener(gLIconTextureView.yUpdater);
                    valueAnimatorOfFloat3.setDuration(j);
                    valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f4, 0.0f);
                    valueAnimatorOfFloat4.addUpdateListener(gLIconTextureView.yUpdater);
                    valueAnimatorOfFloat4.setStartDelay(j);
                    valueAnimatorOfFloat4.setDuration(600L);
                    valueAnimatorOfFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    gLIconTextureView.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                    gLIconTextureView.animatorSet.addListener(new GLIconTextureView.AnonymousClass3(anonymousClass1, i));
                    gLIconTextureView.animatorSet.start();
                }
            }, 16L);
            return true;
        }
    }

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

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView = (GLIconTextureView) this.this$0;
                    gLIconTextureView.mRenderer.angleX = 0.0f;
                    gLIconTextureView.animatorSet = null;
                    gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                    break;
                case 1:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView2 = (GLIconTextureView) this.this$0;
                    gLIconTextureView2.mRenderer.angleX = 0.0f;
                    gLIconTextureView2.animatorSet = null;
                    gLIconTextureView2.scheduleIdleAnimation(gLIconTextureView2.idleDelay);
                    break;
                case 2:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView3 = (GLIconTextureView) this.this$0;
                    gLIconTextureView3.mRenderer.angleX = 0.0f;
                    gLIconTextureView3.animatorSet = null;
                    gLIconTextureView3.scheduleIdleAnimation(gLIconTextureView3.idleDelay);
                    break;
                case 3:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView4 = (GLIconTextureView) this.this$0;
                    gLIconTextureView4.mRenderer.angleX = 0.0f;
                    gLIconTextureView4.animatorSet = null;
                    gLIconTextureView4.scheduleIdleAnimation(gLIconTextureView4.idleDelay);
                    break;
                default:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView5 = GLIconTextureView.this;
                    gLIconTextureView5.mRenderer.angleX = 0.0f;
                    gLIconTextureView5.animatorSet = null;
                    gLIconTextureView5.scheduleIdleAnimation(gLIconTextureView5.idleDelay);
                    break;
            }
        }
    }

    public final class RenderThread extends Thread {
        public RenderThread() {
        }

        @Override
        public final void run() {
            GLIconTextureView gLIconTextureView = GLIconTextureView.this;
            gLIconTextureView.isRunning = true;
            try {
                GLIconTextureView.access$200(gLIconTextureView);
                GLIconTextureView.access$300(gLIconTextureView);
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (gLIconTextureView.isRunning) {
                    while (gLIconTextureView.mRenderer == null) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (gLIconTextureView.rendererChanged) {
                        GLIconTextureView.access$500(gLIconTextureView, gLIconTextureView.mRenderer);
                        gLIconTextureView.rendererChanged = false;
                    }
                    try {
                        if (!GLIconTextureView.access$600(gLIconTextureView)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            GLIconTextureView.access$700(gLIconTextureView, (jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f);
                            if (!gLIconTextureView.ready) {
                                gLIconTextureView.ready = true;
                                AndroidUtilities.runOnUIThread(gLIconTextureView.readyListener);
                                gLIconTextureView.readyListener = null;
                            }
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                        }
                        try {
                            if (GLIconTextureView.access$600(gLIconTextureView)) {
                                Thread.sleep(100L);
                            } else {
                                for (long jCurrentTimeMillis3 = System.currentTimeMillis(); jCurrentTimeMillis3 - jCurrentTimeMillis < gLIconTextureView.targetFrameDurationMillis; jCurrentTimeMillis3 = System.currentTimeMillis()) {
                                }
                            }
                        } catch (InterruptedException unused2) {
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
                gLIconTextureView.isRunning = false;
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
        this.animationIndexes = new ArrayList<>();
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
                        this.f$0.lambda$new$1(valueAnimator);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(valueAnimator);
                        break;
                    default:
                        this.f$0.lambda$new$3(valueAnimator);
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
                        this.f$0.lambda$new$1(valueAnimator);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(valueAnimator);
                        break;
                    default:
                        this.f$0.lambda$new$3(valueAnimator);
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
                        this.f$0.lambda$new$1(valueAnimator);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(valueAnimator);
                        break;
                    default:
                        this.f$0.lambda$new$3(valueAnimator);
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
        GestureDetector gestureDetector = new GestureDetector(context, new AnonymousClass1());
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (iM < this.animationsCount) {
            iM = LocationController$$ExternalSyntheticOutline0.m(iM, iM, 1, this.animationIndexes);
        }
        Collections.shuffle(this.animationIndexes);
    }

    public static void access$200(GLIconTextureView gLIconTextureView) {
        gLIconTextureView.getClass();
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

    public static void access$300(GLIconTextureView gLIconTextureView) {
        int iGlGetError = gLIconTextureView.mGl.glGetError();
        if (iGlGetError != 0) {
            FileLog.e("GL error = 0x" + Integer.toHexString(iGlGetError));
        }
    }

    public static void access$500(GLIconTextureView gLIconTextureView, GLIconRenderer gLIconRenderer) {
        synchronized (gLIconTextureView) {
            if (gLIconRenderer != null) {
                if (gLIconTextureView.isRunning) {
                    gLIconRenderer.onSurfaceCreated(gLIconTextureView.mGl, gLIconTextureView.eglConfig);
                    gLIconRenderer.onSurfaceChanged(gLIconTextureView.mGl, gLIconTextureView.surfaceWidth, gLIconTextureView.surfaceHeight);
                }
            }
        }
    }

    public static boolean access$600(GLIconTextureView gLIconTextureView) {
        return gLIconTextureView.isPaused() || gLIconTextureView.mRenderer == null;
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

    public void cancelAnimatons() {
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

    public void cancelIdleAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
    }

    public final void checkEglError() {
        if (this.mEgl.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public synchronized boolean isPaused() {
        return this.paused;
    }

    public final void lambda$new$1(ValueAnimator valueAnimator) {
        this.mRenderer.angleX2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public final void lambda$new$2(ValueAnimator valueAnimator) {
        this.mRenderer.angleX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public final void lambda$new$3(ValueAnimator valueAnimator) {
        this.mRenderer.angleY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public final void lambda$startBackAnimation$0(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        gLIconRenderer.angleX = f * fFloatValue;
        gLIconRenderer.angleX2 = f2 * fFloatValue;
        gLIconRenderer.angleY = fFloatValue * f3;
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
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        startThread(surfaceTexture, i, i2);
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.ready = false;
        stopThread();
        return false;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        setDimensions(i, i2);
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.onSurfaceChanged(this.mGl, i, i2);
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.touched = false;
            startBackAnimation();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    public void scheduleIdleAnimation(long j) {
        AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
        if (this.dialogIsVisible) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.idleAnimation, j);
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

    public void setDimensions(int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
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

    public void startBackAnimation() {
        cancelAnimatons();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        float f = gLIconRenderer.angleX;
        float f2 = gLIconRenderer.angleY;
        float f3 = gLIconRenderer.angleX2;
        float f4 = f + f2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.backAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda31(this, f, f3, f2, 1));
        this.backAnimation.setDuration(600L);
        this.backAnimation.setInterpolator(new OvershootInterpolator());
        this.backAnimation.start();
        StarParticlesView starParticlesView = this.starParticlesView;
        if (starParticlesView != null) {
            starParticlesView.flingParticles(Math.abs(f4));
        }
        scheduleIdleAnimation(this.idleDelay);
    }

    public void startEnterAnimation(int i, long j) {
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.angleX = -180.0f;
            AndroidUtilities.runOnUIThread(new AnonymousClass2(this, 1), j);
        }
    }

    public void startIdleAnimation() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        int i4 = 2;
        if (this.attached) {
            int iIntValue = this.animationIndexes.get(this.animationPointer).intValue();
            int i5 = this.animationPointer + 1;
            this.animationPointer = i5;
            if (i5 >= this.animationIndexes.size()) {
                Collections.shuffle(this.animationIndexes);
                this.animationPointer = 0;
            }
            if (iIntValue == 0) {
                int iAbs = Math.abs(Utilities.random.nextInt() % 4);
                this.animatorSet = new AnimatorSet();
                int i6 = this.type;
                if (i6 == 4) {
                    float f = this.mRenderer.angleX;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 360.0f + f);
                    valueAnimatorOfFloat.addUpdateListener(this.xUpdater);
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
                    valueAnimatorOfFloat2.addUpdateListener(this.xUpdater);
                    valueAnimatorOfFloat2.setDuration(3000L);
                    valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f2, 0.0f);
                    valueAnimatorOfFloat3.addUpdateListener(this.xUpdater);
                    valueAnimatorOfFloat3.setDuration(1000L);
                    valueAnimatorOfFloat3.setStartDelay(3000L);
                    valueAnimatorOfFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
                } else {
                    float f3 = 48;
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.mRenderer.angleY, f3);
                    valueAnimatorOfFloat4.addUpdateListener(this.yUpdater);
                    valueAnimatorOfFloat4.setDuration(2300L);
                    valueAnimatorOfFloat4.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f3, 0.0f);
                    valueAnimatorOfFloat5.addUpdateListener(this.yUpdater);
                    valueAnimatorOfFloat5.setDuration(500L);
                    valueAnimatorOfFloat5.setStartDelay(2300L);
                    valueAnimatorOfFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.animatorSet.playTogether(valueAnimatorOfFloat4, valueAnimatorOfFloat5);
                }
                this.animatorSet.addListener(new AnonymousClass3(this, i3));
                this.animatorSet.start();
                return;
            }
            if (iIntValue == 1) {
                this.animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.mRenderer.angleX, 360.0f);
                valueAnimatorOfFloat6.addUpdateListener(this.xUpdater);
                valueAnimatorOfFloat6.setDuration(8000L);
                valueAnimatorOfFloat6.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animatorSet.playTogether(valueAnimatorOfFloat6);
                this.animatorSet.addListener(new AnonymousClass3(this, i2));
                this.animatorSet.start();
                return;
            }
            if (iIntValue != 2) {
                this.animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(this.mRenderer.angleX, 180.0f);
                valueAnimatorOfFloat7.addUpdateListener(this.xUpdater);
                valueAnimatorOfFloat7.setDuration(600L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                valueAnimatorOfFloat7.setInterpolator(cubicBezierInterpolator);
                ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                valueAnimatorOfFloat8.addUpdateListener(this.xUpdater);
                valueAnimatorOfFloat8.setDuration(600L);
                valueAnimatorOfFloat8.setStartDelay(2000L);
                valueAnimatorOfFloat8.setInterpolator(cubicBezierInterpolator);
                this.animatorSet.playTogether(valueAnimatorOfFloat7, valueAnimatorOfFloat8);
                this.animatorSet.addListener(new AnonymousClass3(this, i4));
                this.animatorSet.start();
                return;
            }
            this.animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(this.mRenderer.angleX, 184.0f);
            valueAnimatorOfFloat9.addUpdateListener(this.xUpdater);
            valueAnimatorOfFloat9.setDuration(600L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT;
            valueAnimatorOfFloat9.setInterpolator(cubicBezierInterpolator2);
            ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(this.mRenderer.angleY, 50.0f);
            valueAnimatorOfFloat10.addUpdateListener(this.yUpdater);
            valueAnimatorOfFloat10.setDuration(600L);
            valueAnimatorOfFloat10.setInterpolator(cubicBezierInterpolator2);
            ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            valueAnimatorOfFloat11.addUpdateListener(this.xUpdater);
            valueAnimatorOfFloat11.setDuration(800L);
            valueAnimatorOfFloat11.setStartDelay(10000L);
            valueAnimatorOfFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            valueAnimatorOfFloat12.addUpdateListener(this.yUpdater);
            valueAnimatorOfFloat12.setDuration(800L);
            valueAnimatorOfFloat12.setStartDelay(10000L);
            valueAnimatorOfFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            valueAnimatorOfFloat13.addUpdateListener(this.xUpdater2);
            valueAnimatorOfFloat13.setDuration(10000L);
            valueAnimatorOfFloat13.setInterpolator(new LinearInterpolator());
            this.animatorSet.playTogether(valueAnimatorOfFloat9, valueAnimatorOfFloat10, valueAnimatorOfFloat11, valueAnimatorOfFloat12, valueAnimatorOfFloat13);
            this.animatorSet.addListener(new AnonymousClass3(this, i));
            this.animatorSet.start();
        }
    }

    public void startThread(SurfaceTexture surfaceTexture, int i, int i2) {
        this.thread = new RenderThread();
        this.mSurface = surfaceTexture;
        setDimensions(i, i2);
        this.targetFrameDurationMillis = Math.max(0, ((int) ((1.0f / this.targetFps) * 1000.0f)) - 1);
        this.thread.start();
    }

    public void stopThread() {
        if (this.thread != null) {
            this.isRunning = false;
            this.thread = null;
        }
    }

    public void whenReady(Runnable runnable) {
        if (this.ready) {
            runnable.run();
        } else {
            this.readyListener = runnable;
        }
    }
}
