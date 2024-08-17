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
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;

public class GLIconTextureView extends TextureView implements TextureView.SurfaceTextureListener {
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
        this.idleDelay = 2000L;
        this.animationIndexes = new ArrayList<>();
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
                GLIconTextureView.this.lambda$new$1(valueAnimator);
            }
        };
        this.xUpdater = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GLIconTextureView.this.lambda$new$2(valueAnimator);
            }
        };
        this.yUpdater = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GLIconTextureView.this.lambda$new$3(valueAnimator);
            }
        };
        this.type = i2;
        this.animationsCount = i2 == 1 ? 1 : 5;
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

    public class AnonymousClass1 implements GestureDetector.OnGestureListener {
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
            final float nextInt = ((Utilities.random.nextInt(30) + 40) * (measuredWidth - motionEvent.getX())) / measuredWidth;
            final float nextInt2 = ((Utilities.random.nextInt(30) + 40) * (measuredWidth - motionEvent.getY())) / measuredWidth;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GLIconTextureView.AnonymousClass1.this.lambda$onSingleTapUp$0(nextInt, nextInt2);
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(GLIconTextureView.this.mRenderer.angleX, f);
            ofFloat.addUpdateListener(GLIconTextureView.this.xUpdater);
            long j = 220;
            ofFloat.setDuration(j);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            ofFloat.setInterpolator(cubicBezierInterpolator);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat2.addUpdateListener(GLIconTextureView.this.xUpdater);
            ofFloat2.setStartDelay(j);
            ofFloat2.setDuration(600L);
            ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(GLIconTextureView.this.mRenderer.angleY, f2);
            ofFloat3.addUpdateListener(GLIconTextureView.this.yUpdater);
            ofFloat3.setDuration(j);
            ofFloat3.setInterpolator(cubicBezierInterpolator);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f2, 0.0f);
            ofFloat4.addUpdateListener(GLIconTextureView.this.yUpdater);
            ofFloat4.setStartDelay(j);
            ofFloat4.setDuration(600L);
            ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
            GLIconTextureView.this.animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
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

    public class RenderThread extends Thread {
        private RenderThread() {
        }

        RenderThread(GLIconTextureView gLIconTextureView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public void run() {
            GLIconTextureView gLIconTextureView;
            GLIconTextureView gLIconTextureView2 = GLIconTextureView.this;
            gLIconTextureView2.isRunning = true;
            gLIconTextureView2.initGL();
            GLIconTextureView.this.checkGlError();
            long currentTimeMillis = System.currentTimeMillis();
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
                if (!GLIconTextureView.this.shouldSleep()) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    GLIconTextureView.this.drawSingleFrame(((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                    if (!GLIconTextureView.this.ready) {
                        GLIconTextureView.this.ready = true;
                        AndroidUtilities.runOnUIThread(GLIconTextureView.this.readyListener);
                        GLIconTextureView.this.readyListener = null;
                    }
                    currentTimeMillis = currentTimeMillis2;
                }
                try {
                    if (GLIconTextureView.this.shouldSleep()) {
                        Thread.sleep(100L);
                    } else {
                        for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < GLIconTextureView.this.targetFrameDurationMillis; currentTimeMillis3 = System.currentTimeMillis()) {
                        }
                    }
                } catch (InterruptedException unused2) {
                }
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
        int glGetError = this.mGl.glGetError();
        if (glGetError != 0) {
            FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
        }
    }

    public void initGL() {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEgl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
        }
        if (!this.mEgl.eglInitialize(eglGetDisplay, new int[2])) {
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
            int eglGetError = this.mEgl.eglGetError();
            if (eglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            }
            throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.backAnimation = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GLIconTextureView.this.lambda$startBackAnimation$0(f, f3, f2, valueAnimator);
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
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        GLIconRenderer gLIconRenderer = this.mRenderer;
        gLIconRenderer.angleX = f * floatValue;
        gLIconRenderer.angleX2 = f2 * floatValue;
        gLIconRenderer.angleY = floatValue * f3;
    }

    private void cancelAnimatons() {
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

    protected void startIdleAnimation() {
        if (this.attached) {
            int intValue = this.animationIndexes.get(this.animationPointer).intValue();
            int i = this.animationPointer + 1;
            this.animationPointer = i;
            if (i >= this.animationIndexes.size()) {
                Collections.shuffle(this.animationIndexes);
                this.animationPointer = 0;
            }
            if (intValue == 0) {
                pullAnimation();
                return;
            }
            if (intValue == 1) {
                slowFlipAnimation();
            } else if (intValue == 2) {
                sleepAnimation();
            } else {
                flipAnimation();
            }
        }
    }

    private void slowFlipAnimation() {
        this.animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 360.0f);
        ofFloat.addUpdateListener(this.xUpdater);
        ofFloat.setDuration(8000L);
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animatorSet.playTogether(ofFloat);
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
        int abs = Math.abs(Utilities.random.nextInt() % 4);
        this.animatorSet = new AnimatorSet();
        if (abs == 0 && this.type != 1) {
            float f = 48;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mRenderer.angleY, f);
            ofFloat.addUpdateListener(this.yUpdater);
            ofFloat.setDuration(2300L);
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat2.addUpdateListener(this.yUpdater);
            ofFloat2.setDuration(500L);
            ofFloat2.setStartDelay(2300L);
            ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
            this.animatorSet.playTogether(ofFloat, ofFloat2);
        } else {
            int i = this.type == 1 ? 360 : 485;
            if (abs == 2) {
                i = -i;
            }
            float f2 = i;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.mRenderer.angleY, f2);
            ofFloat3.addUpdateListener(this.xUpdater);
            ofFloat3.setDuration(3000L);
            ofFloat3.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f2, 0.0f);
            ofFloat4.addUpdateListener(this.xUpdater);
            ofFloat4.setDuration(1000L);
            ofFloat4.setStartDelay(3000L);
            ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
            this.animatorSet.playTogether(ofFloat3, ofFloat4);
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 180.0f);
        ofFloat.addUpdateListener(this.xUpdater);
        ofFloat.setDuration(600L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        ofFloat.setInterpolator(cubicBezierInterpolator);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(180.0f, 360.0f);
        ofFloat2.addUpdateListener(this.xUpdater);
        ofFloat2.setDuration(600L);
        ofFloat2.setStartDelay(2000L);
        ofFloat2.setInterpolator(cubicBezierInterpolator);
        this.animatorSet.playTogether(ofFloat, ofFloat2);
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mRenderer.angleX, 184.0f);
        ofFloat.addUpdateListener(this.xUpdater);
        ofFloat.setDuration(600L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
        ofFloat.setInterpolator(cubicBezierInterpolator);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.mRenderer.angleY, 50.0f);
        ofFloat2.addUpdateListener(this.yUpdater);
        ofFloat2.setDuration(600L);
        ofFloat2.setInterpolator(cubicBezierInterpolator);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(180.0f, 0.0f);
        ofFloat3.addUpdateListener(this.xUpdater);
        ofFloat3.setDuration(800L);
        ofFloat3.setStartDelay(10000L);
        ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(60.0f, 0.0f);
        ofFloat4.addUpdateListener(this.yUpdater);
        ofFloat4.setDuration(800L);
        ofFloat4.setStartDelay(10000L);
        ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
        ofFloat5.addUpdateListener(this.xUpdater2);
        ofFloat5.setDuration(10000L);
        ofFloat5.setInterpolator(new LinearInterpolator());
        this.animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
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
