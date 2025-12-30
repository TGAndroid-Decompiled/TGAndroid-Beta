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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Premium.StarParticlesView;

public class GLIconTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    ArrayList animationIndexes;
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

    public void onLongPress() {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public GLIconTextureView(Context context, int i) {
        this(context, i, 0);
    }

    public GLIconTextureView(Context context, int i, int i2) {
        super(context);
        this.isRunning = false;
        this.paused = true;
        this.rendererChanged = false;
        this.dialogIsVisible = false;
        this.animationIndexes = new ArrayList();
        this.animatorSet = new AnimatorSet();
        this.idleAnimation = new Runnable() {
            @Override
            public void run() {
                ValueAnimator valueAnimator;
                AnimatorSet animatorSet = GLIconTextureView.this.animatorSet;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = GLIconTextureView.this.backAnimation) != null && valueAnimator.isRunning())) {
                    GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                    gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                } else {
                    GLIconTextureView.this.startIdleAnimation();
                }
            }
        };
        this.xUpdater2 = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$new$1(valueAnimator);
            }
        };
        this.xUpdater = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$new$2(valueAnimator);
            }
        };
        this.yUpdater = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$new$3(valueAnimator);
            }
        };
        this.type = i2;
        this.animationsCount = (i2 == 1 || i2 == 4 || i2 == 3) ? 1 : 5;
        this.idleDelay = i2 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new GLIconRenderer(context, i, i2));
        initialize(context);
        GestureDetector gestureDetector = new GestureDetector(context, new AnonymousClass1());
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        for (int i3 = 0; i3 < this.animationsCount; i3++) {
            this.animationIndexes.add(Integer.valueOf(i3));
        }
        Collections.shuffle(this.animationIndexes);
    }

    class AnonymousClass1 implements GestureDetector.OnGestureListener {
        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
        }

        AnonymousClass1() {
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            ValueAnimator valueAnimator = GLIconTextureView.this.backAnimation;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                GLIconTextureView.this.backAnimation.cancel();
                GLIconTextureView.this.backAnimation = null;
            }
            AnimatorSet animatorSet = GLIconTextureView.this.animatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                GLIconTextureView.this.animatorSet.cancel();
                GLIconTextureView.this.animatorSet = null;
            }
            AndroidUtilities.cancelRunOnUIThread(GLIconTextureView.this.idleAnimation);
            GLIconTextureView.this.touched = true;
            return true;
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            float measuredWidth = GLIconTextureView.this.getMeasuredWidth() / 2.0f;
            final float fNextInt = ((Utilities.random.nextInt(30) + 40) * (measuredWidth - motionEvent.getX())) / measuredWidth;
            final float fNextInt2 = ((Utilities.random.nextInt(30) + 40) * (measuredWidth - motionEvent.getY())) / measuredWidth;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSingleTapUp$0(fNextInt, fNextInt2);
                }
            }, 16L);
            return true;
        }

        public void lambda$onSingleTapUp$0(float f, float f2) {
            ValueAnimator valueAnimator = GLIconTextureView.this.backAnimation;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                GLIconTextureView.this.backAnimation.cancel();
                GLIconTextureView.this.backAnimation = null;
            }
            AnimatorSet animatorSet = GLIconTextureView.this.animatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                GLIconTextureView.this.animatorSet.cancel();
                GLIconTextureView.this.animatorSet = null;
            }
            if (Math.abs(GLIconTextureView.this.mRenderer.angleX) > 10.0f) {
                GLIconTextureView.this.startBackAnimation();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(GLIconTextureView.this.idleAnimation);
            GLIconTextureView.this.animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(GLIconTextureView.this.mRenderer.angleX, f);
            valueAnimatorOfFloat.addUpdateListener(GLIconTextureView.this.xUpdater);
            long j = 220;
            valueAnimatorOfFloat.setDuration(j);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(GLIconTextureView.this.xUpdater);
            valueAnimatorOfFloat2.setStartDelay(j);
            valueAnimatorOfFloat2.setDuration(600L);
            valueAnimatorOfFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(GLIconTextureView.this.mRenderer.angleY, f2);
            valueAnimatorOfFloat3.addUpdateListener(GLIconTextureView.this.yUpdater);
            valueAnimatorOfFloat3.setDuration(j);
            valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f2, 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(GLIconTextureView.this.yUpdater);
            valueAnimatorOfFloat4.setStartDelay(j);
            valueAnimatorOfFloat4.setDuration(600L);
            valueAnimatorOfFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
            GLIconTextureView.this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
            GLIconTextureView.this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                    gLIconTextureView.mRenderer.angleX = 0.0f;
                    gLIconTextureView.animatorSet = null;
                    gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                }
            });
            GLIconTextureView.this.animatorSet.start();
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GLIconRenderer gLIconRenderer = GLIconTextureView.this.mRenderer;
            gLIconRenderer.angleX += f * 0.5f;
            gLIconRenderer.angleY += f2 * 0.05f;
            return true;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            GLIconTextureView.this.onLongPress();
        }
    }

    public synchronized void setRenderer(GLIconRenderer gLIconRenderer) {
        this.mRenderer = gLIconRenderer;
        this.rendererChanged = true;
    }

    private void initialize(Context context) {
        this.targetFps = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        startThread(surfaceTexture, i, i2);
    }

    public void startThread(SurfaceTexture surfaceTexture, int i, int i2) {
        this.thread = new RenderThread(this, null);
        this.mSurface = surfaceTexture;
        setDimensions(i, i2);
        this.targetFrameDurationMillis = Math.max(0, ((int) ((1.0f / this.targetFps) * 1000.0f)) - 1);
        this.thread.start();
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        setDimensions(i, i2);
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.onSurfaceChanged(this.mGl, i, i2);
        }
    }

    public synchronized void setPaused(boolean z) {
        this.paused = z;
    }

    public synchronized boolean isPaused() {
        return this.paused;
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.ready = false;
        stopThread();
        return false;
    }

    public void stopThread() {
        if (this.thread != null) {
            this.isRunning = false;
            this.thread = null;
        }
    }

    public boolean shouldSleep() {
        return isPaused() || this.mRenderer == null;
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        this.mRenderer.setBackground(bitmap);
    }

    public void whenReady(Runnable runnable) {
        if (this.ready) {
            runnable.run();
        } else {
            this.readyListener = runnable;
        }
    }

    private class RenderThread extends Thread {
        private RenderThread() {
        }

        RenderThread(GLIconTextureView gLIconTextureView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public void run() throws InterruptedException {
            GLIconTextureView gLIconTextureView;
            GLIconTextureView gLIconTextureView2 = GLIconTextureView.this;
            gLIconTextureView2.isRunning = true;
            try {
                gLIconTextureView2.initGL();
                GLIconTextureView.this.checkGlError();
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (GLIconTextureView.this.isRunning) {
                    while (true) {
                        gLIconTextureView = GLIconTextureView.this;
                        if (gLIconTextureView.mRenderer != null) {
                            break;
                        } else {
                            try {
                                Thread.sleep(100L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                    if (gLIconTextureView.rendererChanged) {
                        GLIconTextureView gLIconTextureView3 = GLIconTextureView.this;
                        gLIconTextureView3.initializeRenderer(gLIconTextureView3.mRenderer);
                        GLIconTextureView.this.rendererChanged = false;
                    }
                    try {
                        if (!GLIconTextureView.this.shouldSleep()) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            GLIconTextureView.this.drawSingleFrame((jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f);
                            if (!GLIconTextureView.this.ready) {
                                GLIconTextureView.this.ready = true;
                                AndroidUtilities.runOnUIThread(GLIconTextureView.this.readyListener);
                                GLIconTextureView.this.readyListener = null;
                            }
                            jCurrentTimeMillis = jCurrentTimeMillis2;
                        }
                        try {
                            if (GLIconTextureView.this.shouldSleep()) {
                                Thread.sleep(100L);
                            } else {
                                for (long jCurrentTimeMillis3 = System.currentTimeMillis(); jCurrentTimeMillis3 - jCurrentTimeMillis < GLIconTextureView.this.targetFrameDurationMillis; jCurrentTimeMillis3 = System.currentTimeMillis()) {
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
                GLIconTextureView.this.isRunning = false;
            }
        }
    }

    public synchronized void initializeRenderer(GLIconRenderer gLIconRenderer) {
        if (gLIconRenderer != null) {
            if (this.isRunning) {
                gLIconRenderer.onSurfaceCreated(this.mGl, this.eglConfig);
                gLIconRenderer.onSurfaceChanged(this.mGl, this.surfaceWidth, this.surfaceHeight);
            }
        }
    }

    public synchronized void drawSingleFrame(float f) {
        try {
            checkCurrent();
            GLIconRenderer gLIconRenderer = this.mRenderer;
            if (gLIconRenderer != null) {
                gLIconRenderer.setDeltaTime(f);
                this.mRenderer.onDrawFrame(this.mGl);
            }
            checkGlError();
            this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setDimensions(int i, int i2) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
    }

    private void checkCurrent() {
        if (this.mEglContext.equals(this.mEgl.eglGetCurrentContext()) && this.mEglSurface.equals(this.mEgl.eglGetCurrentSurface(12377))) {
            return;
        }
        checkEglError();
        EGL10 egl10 = this.mEgl;
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLSurface eGLSurface = this.mEglSurface;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        checkEglError();
    }

    private void checkEglError() {
        if (this.mEgl.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public void checkGlError() {
        int iGlGetError = this.mGl.glGetError();
        if (iGlGetError != 0) {
            FileLog.e("GL error = 0x" + Integer.toHexString(iGlGetError));
        }
    }

    public void initGL() {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEgl = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        if (!this.mEgl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EmuDetector.with(getContext()).detect()) {
            iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};
        } else {
            iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
        }
        int[] iArr3 = iArr;
        this.eglConfig = null;
        if (!this.mEgl.eglChooseConfig(this.mEglDisplay, iArr3, eGLConfigArr, 1, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        if (iArr2[0] > 0) {
            this.eglConfig = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = this.eglConfig;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        this.mEglContext = this.mEgl.eglCreateContext(this.mEglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        checkEglError();
        this.mEglSurface = this.mEgl.eglCreateWindowSurface(this.mEglDisplay, this.eglConfig, this.mSurface, null);
        checkEglError();
        EGLSurface eGLSurface = this.mEglSurface;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int iEglGetError = this.mEgl.eglGetError();
            if (iEglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            }
            throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(iEglGetError));
        }
        if (!this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        checkEglError();
        this.mGl = (GL10) this.mEglContext.getGL();
        checkEglError();
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

    public void startBackAnimation() {
        cancelAnimatons();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        final float f = gLIconRenderer.angleX;
        final float f2 = gLIconRenderer.angleY;
        final float f3 = gLIconRenderer.angleX2;
        float f4 = f + f2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.backAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startBackAnimation$0(f, f3, f2, valueAnimator);
            }
        });
        this.backAnimation.setDuration(600L);
        this.backAnimation.setInterpolator(new OvershootInterpolator());
        this.backAnimation.start();
        StarParticlesView starParticlesView = this.starParticlesView;
        if (starParticlesView != null) {
            starParticlesView.flingParticles(Math.abs(f4));
        }
        scheduleIdleAnimation(this.idleDelay);
    }

    public void lambda$startBackAnimation$0(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        gLIconRenderer.angleX = f * fFloatValue;
        gLIconRenderer.angleX2 = f2 * fFloatValue;
        gLIconRenderer.angleY = fFloatValue * f3;
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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        this.rendererChanged = true;
        scheduleIdleAnimation(this.idleDelay);
    }

    @Override
    protected void onDetachedFromWindow() {
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

    public void lambda$new$1(ValueAnimator valueAnimator) {
        this.mRenderer.angleX2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$new$2(ValueAnimator valueAnimator) {
        this.mRenderer.angleX = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$new$3(ValueAnimator valueAnimator) {
        this.mRenderer.angleY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void scheduleIdleAnimation(long j) {
        AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
        if (this.dialogIsVisible) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.idleAnimation, j);
    }

    public void cancelIdleAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
    }

    protected void startIdleAnimation() {
        if (this.attached) {
            int iIntValue = ((Integer) this.animationIndexes.get(this.animationPointer)).intValue();
            int i = this.animationPointer + 1;
            this.animationPointer = i;
            if (i >= this.animationIndexes.size()) {
                Collections.shuffle(this.animationIndexes);
                this.animationPointer = 0;
            }
            if (iIntValue == 0) {
                pullAnimation();
                return;
            }
            if (iIntValue == 1) {
                slowFlipAnimation();
            } else if (iIntValue == 2) {
                sleepAnimation();
            } else {
                flipAnimation();
            }
        }
    }

    private void slowFlipAnimation() {
        this.animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 360.0f);
        valueAnimatorOfFloat.addUpdateListener(this.xUpdater);
        valueAnimatorOfFloat.setDuration(8000L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animatorSet.playTogether(valueAnimatorOfFloat);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                gLIconTextureView.mRenderer.angleX = 0.0f;
                gLIconTextureView.animatorSet = null;
                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
            }
        });
        this.animatorSet.start();
    }

    private void pullAnimation() {
        int iAbs = Math.abs(Utilities.random.nextInt() % 4);
        this.animatorSet = new AnimatorSet();
        int i = this.type;
        if (i == 4) {
            float f = this.mRenderer.angleX;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 360.0f + f);
            valueAnimatorOfFloat.addUpdateListener(this.xUpdater);
            valueAnimatorOfFloat.setDuration(12000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            this.animatorSet.playTogether(valueAnimatorOfFloat);
        } else if (iAbs == 0 && i != 1 && i != 3) {
            float f2 = 48;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.mRenderer.angleY, f2);
            valueAnimatorOfFloat2.addUpdateListener(this.yUpdater);
            valueAnimatorOfFloat2.setDuration(2300L);
            valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f2, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(this.yUpdater);
            valueAnimatorOfFloat3.setDuration(500L);
            valueAnimatorOfFloat3.setStartDelay(2300L);
            valueAnimatorOfFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
            this.animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        } else {
            int i2 = (i == 1 || i == 3) ? 360 : 485;
            if (iAbs == 2) {
                i2 = -i2;
            }
            float f3 = i2;
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.mRenderer.angleY, f3);
            valueAnimatorOfFloat4.addUpdateListener(this.xUpdater);
            valueAnimatorOfFloat4.setDuration(3000L);
            valueAnimatorOfFloat4.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f3, 0.0f);
            valueAnimatorOfFloat5.addUpdateListener(this.xUpdater);
            valueAnimatorOfFloat5.setDuration(1000L);
            valueAnimatorOfFloat5.setStartDelay(3000L);
            valueAnimatorOfFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
            this.animatorSet.playTogether(valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        }
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                gLIconTextureView.mRenderer.angleX = 0.0f;
                gLIconTextureView.animatorSet = null;
                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
            }
        });
        this.animatorSet.start();
    }

    private void flipAnimation() {
        this.animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 180.0f);
        valueAnimatorOfFloat.addUpdateListener(this.xUpdater);
        valueAnimatorOfFloat.setDuration(600L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(180.0f, 360.0f);
        valueAnimatorOfFloat2.addUpdateListener(this.xUpdater);
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setStartDelay(2000L);
        valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
        this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                gLIconTextureView.mRenderer.angleX = 0.0f;
                gLIconTextureView.animatorSet = null;
                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
            }
        });
        this.animatorSet.start();
    }

    private void sleepAnimation() {
        this.animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 184.0f);
        valueAnimatorOfFloat.addUpdateListener(this.xUpdater);
        valueAnimatorOfFloat.setDuration(600L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
        valueAnimatorOfFloat.setInterpolator(cubicBezierInterpolator);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.mRenderer.angleY, 50.0f);
        valueAnimatorOfFloat2.addUpdateListener(this.yUpdater);
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(180.0f, 0.0f);
        valueAnimatorOfFloat3.addUpdateListener(this.xUpdater);
        valueAnimatorOfFloat3.setDuration(800L);
        valueAnimatorOfFloat3.setStartDelay(10000L);
        valueAnimatorOfFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(60.0f, 0.0f);
        valueAnimatorOfFloat4.addUpdateListener(this.yUpdater);
        valueAnimatorOfFloat4.setDuration(800L);
        valueAnimatorOfFloat4.setStartDelay(10000L);
        valueAnimatorOfFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
        valueAnimatorOfFloat5.addUpdateListener(this.xUpdater2);
        valueAnimatorOfFloat5.setDuration(10000L);
        valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        this.animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GLIconTextureView gLIconTextureView = GLIconTextureView.this;
                gLIconTextureView.mRenderer.angleX = 0.0f;
                gLIconTextureView.animatorSet = null;
                gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
            }
        });
        this.animatorSet.start();
    }

    public void setStarParticlesView(StarParticlesView starParticlesView) {
        this.starParticlesView = starParticlesView;
    }

    public void startEnterAnimation(int i, long j) {
        GLIconRenderer gLIconRenderer = this.mRenderer;
        if (gLIconRenderer != null) {
            gLIconRenderer.angleX = -180.0f;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    GLIconTextureView.this.startBackAnimation();
                }
            }, j);
        }
    }

    public void setDialogVisible(boolean z) {
        this.dialogIsVisible = z;
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.idleAnimation);
            startBackAnimation();
        } else {
            scheduleIdleAnimation(this.idleDelay);
        }
    }
}
