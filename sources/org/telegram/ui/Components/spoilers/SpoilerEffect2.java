package org.telegram.ui.Components.spoilers;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES31;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieDrawable;
public class SpoilerEffect2 {
    private static SpoilerEffect2 instance;
    public final int MAX_FPS;
    private final double MIN_DELTA;
    public boolean destroyed;
    private int height;
    private final TextureView textureView;
    private final ViewGroup textureViewContainer;
    private SpoilerThread thread;
    private int width;
    private final ArrayList<View> holders = new ArrayList<>();
    private final HashMap<View, Integer> holdersToIndex = new HashMap<>();
    private int holdersIndex = 0;
    private final Runnable checkDestroy = new Runnable() {
        @Override
        public final void run() {
            SpoilerEffect2.this.lambda$new$0();
        }
    };

    public static boolean supports() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static SpoilerEffect2 getInstance(View view) {
        if (view == null || !supports()) {
            return null;
        }
        if (instance == null) {
            int size = getSize();
            ViewGroup rootView = getRootView(view);
            if (rootView == null) {
                return null;
            }
            instance = new SpoilerEffect2(makeTextureViewContainer(rootView), size, size);
        }
        instance.attach(view);
        return instance;
    }

    private static ViewGroup getRootView(View view) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return null;
        }
        View rootView = findActivity.findViewById(16908290).getRootView();
        if (rootView instanceof ViewGroup) {
            return (ViewGroup) rootView;
        }
        return null;
    }

    public static void pause(boolean z) {
        SpoilerThread spoilerThread;
        SpoilerEffect2 spoilerEffect2 = instance;
        if (spoilerEffect2 == null || (spoilerThread = spoilerEffect2.thread) == null) {
            return;
        }
        spoilerThread.pause(z);
    }

    private static int getSize() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            Point point = AndroidUtilities.displaySize;
            return Math.min((int) LiteMode.FLAG_CALLS_ANIMATIONS, (int) (Math.min(point.x, point.y) * 0.6f));
        } else if (devicePerformanceClass == 2) {
            Point point2 = AndroidUtilities.displaySize;
            return Math.min(900, (int) (Math.min(point2.x, point2.y) * 0.9f));
        } else {
            Point point3 = AndroidUtilities.displaySize;
            return Math.min(400, (int) (Math.min(point3.x, point3.y) * 0.5f));
        }
    }

    private static FrameLayout makeTextureViewContainer(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext()) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                return false;
            }
        };
        viewGroup.addView(frameLayout);
        return frameLayout;
    }

    public void attach(View view) {
        if (this.destroyed || this.holders.contains(view)) {
            return;
        }
        this.holders.add(view);
        HashMap<View, Integer> hashMap = this.holdersToIndex;
        int i = this.holdersIndex;
        this.holdersIndex = i + 1;
        hashMap.put(view, Integer.valueOf(i));
    }

    public void reassignAttach(View view, int i) {
        this.holdersToIndex.put(view, Integer.valueOf(i));
    }

    public int getAttachIndex(View view) {
        Integer num = this.holdersToIndex.get(view);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public void detach(View view) {
        this.holders.remove(view);
        this.holdersToIndex.remove(view);
        if (this.destroyed) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.checkDestroy);
        AndroidUtilities.runOnUIThread(this.checkDestroy, 30L);
    }

    public void invalidate() {
        for (int i = 0; i < this.holders.size(); i++) {
            this.holders.get(i).invalidate();
        }
    }

    public void lambda$new$0() {
        if (this.holders.isEmpty()) {
            destroy();
        }
    }

    public void draw(Canvas canvas, View view, int i, int i2) {
        draw(canvas, view, i, i2, 1.0f);
    }

    public void draw(Canvas canvas, View view, int i, int i2, float f) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        int i3 = this.width;
        int i4 = this.height;
        Integer num = this.holdersToIndex.get(view);
        if (num == null) {
            num = 0;
        }
        if (i > i3 || i2 > i4) {
            float max = Math.max(i / i3, i2 / i4);
            canvas.scale(max, max);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i3 / 2.0f, i4 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i3 / 2.0f, i4 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i3 / 2.0f, i4 / 2.0f);
        }
        this.textureView.setAlpha(f);
        this.textureView.draw(canvas);
        canvas.restore();
    }

    private void destroy() {
        this.destroyed = true;
        instance = null;
        SpoilerThread spoilerThread = this.thread;
        if (spoilerThread != null) {
            spoilerThread.halt();
            this.thread = null;
        }
        this.textureViewContainer.removeView(this.textureView);
        if (this.textureViewContainer.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.textureViewContainer.getParent()).removeView(this.textureViewContainer);
        }
    }

    private SpoilerEffect2(ViewGroup viewGroup, int i, int i2) {
        int i3 = (int) AndroidUtilities.screenRefreshRate;
        this.MAX_FPS = i3;
        double d = i3;
        Double.isNaN(d);
        this.MIN_DELTA = 1.0d / d;
        this.width = i;
        this.height = i2;
        this.textureViewContainer = viewGroup;
        TextureView textureView = new TextureView(viewGroup.getContext()) {
            @Override
            protected void onMeasure(int i4, int i5) {
                setMeasuredDimension(SpoilerEffect2.this.width, SpoilerEffect2.this.height);
            }
        };
        this.textureView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
                if (SpoilerEffect2.this.thread == null) {
                    SpoilerEffect2 spoilerEffect2 = SpoilerEffect2.this;
                    final SpoilerEffect2 spoilerEffect22 = SpoilerEffect2.this;
                    spoilerEffect2.thread = new SpoilerThread(surfaceTexture, i4, i5, new Runnable() {
                        @Override
                        public final void run() {
                            SpoilerEffect2.this.invalidate();
                        }
                    });
                    SpoilerEffect2.this.thread.start();
                }
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
                if (SpoilerEffect2.this.thread != null) {
                    SpoilerEffect2.this.thread.updateSize(i4, i5);
                }
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (SpoilerEffect2.this.thread != null) {
                    SpoilerEffect2.this.thread.halt();
                    SpoilerEffect2.this.thread = null;
                    return true;
                }
                return true;
            }
        });
        textureView.setOpaque(false);
        viewGroup.addView(textureView);
    }

    public class SpoilerThread extends Thread {
        private int deltaTimeHandle;
        private int drawProgram;
        private EGL10 egl;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private int height;
        private final Runnable invalidate;
        private int[] particlesData;
        private int radiusHandle;
        private int resetHandle;
        private boolean resize;
        private int seedHandle;
        private int sizeHandle;
        private final SurfaceTexture surfaceTexture;
        private float t;
        private int timeHandle;
        private int width;
        private volatile boolean running = true;
        private volatile boolean paused = false;
        private final Object resizeLock = new Object();
        private float radius = AndroidUtilities.dpf2(1.15f);
        private boolean reset = true;
        private int currentBuffer = 0;
        private int particlesCount = particlesCount();

        public SpoilerThread(SurfaceTexture surfaceTexture, int i, int i2, Runnable runnable) {
            this.invalidate = runnable;
            this.surfaceTexture = surfaceTexture;
            this.width = i;
            this.height = i2;
        }

        private int particlesCount() {
            return (int) Utilities.clamp(((this.width * this.height) / 250000.0f) * 1200.0f, 10000.0f, 500.0f);
        }

        public void updateSize(int i, int i2) {
            synchronized (this.resizeLock) {
                this.resize = true;
                this.width = i;
                this.height = i2;
            }
        }

        public void halt() {
            this.running = false;
        }

        public void pause(boolean z) {
            this.paused = z;
        }

        @Override
        public void run() {
            init();
            long nanoTime = System.nanoTime();
            while (this.running) {
                long nanoTime2 = System.nanoTime();
                double d = nanoTime2 - nanoTime;
                Double.isNaN(d);
                double d2 = d / 1.0E9d;
                if (d2 < SpoilerEffect2.this.MIN_DELTA) {
                    double d3 = SpoilerEffect2.this.MIN_DELTA - d2;
                    long j = (long) (d3 * 1000.0d);
                    double d4 = j;
                    Double.isNaN(d4);
                    try {
                        Thread.sleep(j, (int) ((d3 - (d4 / 1000.0d)) * 1.0E9d));
                    } catch (Exception unused) {
                    }
                    d2 = SpoilerEffect2.this.MIN_DELTA;
                }
                while (this.paused) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused2) {
                    }
                }
                checkResize();
                drawFrame((float) d2);
                AndroidUtilities.cancelRunOnUIThread(this.invalidate);
                AndroidUtilities.runOnUIThread(this.invalidate);
                nanoTime = nanoTime2;
            }
            die();
        }

        private void init() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
            this.eglDisplay = eglGetDisplay;
            EGL10 egl102 = this.egl;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                this.running = false;
            } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
                this.running = false;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.egl.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.running = false;
                    return;
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.eglConfig = eGLConfig;
                EGLContext eglCreateContext = this.egl.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                this.eglContext = eglCreateContext;
                if (eglCreateContext == null) {
                    this.running = false;
                    return;
                }
                EGLSurface eglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surfaceTexture, null);
                this.eglSurface = eglCreateWindowSurface;
                if (eglCreateWindowSurface == null) {
                    this.running = false;
                } else if (!this.egl.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                    this.running = false;
                } else {
                    genParticlesData();
                    int glCreateShader = GLES31.glCreateShader(35633);
                    int glCreateShader2 = GLES31.glCreateShader(35632);
                    if (glCreateShader == 0 || glCreateShader2 == 0) {
                        this.running = false;
                        return;
                    }
                    GLES31.glShaderSource(glCreateShader, RLottieDrawable.readRes(null, R.raw.spoiler_vertex) + "\n// " + Math.random());
                    GLES31.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES31.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] == 0) {
                        FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES31.glGetShaderInfoLog(glCreateShader));
                        GLES31.glDeleteShader(glCreateShader);
                        this.running = false;
                        return;
                    }
                    GLES31.glShaderSource(glCreateShader2, RLottieDrawable.readRes(null, R.raw.spoiler_fragment) + "\n// " + Math.random());
                    GLES31.glCompileShader(glCreateShader2);
                    GLES31.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] == 0) {
                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES31.glGetShaderInfoLog(glCreateShader2));
                        GLES31.glDeleteShader(glCreateShader2);
                        this.running = false;
                        return;
                    }
                    int glCreateProgram = GLES31.glCreateProgram();
                    this.drawProgram = glCreateProgram;
                    if (glCreateProgram == 0) {
                        this.running = false;
                        return;
                    }
                    GLES31.glAttachShader(glCreateProgram, glCreateShader);
                    GLES31.glAttachShader(this.drawProgram, glCreateShader2);
                    GLES31.glTransformFeedbackVaryings(this.drawProgram, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                    GLES31.glLinkProgram(this.drawProgram);
                    GLES31.glGetProgramiv(this.drawProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        FileLog.e("SpoilerEffect2, link draw program error: " + GLES31.glGetProgramInfoLog(this.drawProgram));
                        this.running = false;
                        return;
                    }
                    this.resetHandle = GLES31.glGetUniformLocation(this.drawProgram, "reset");
                    this.timeHandle = GLES31.glGetUniformLocation(this.drawProgram, "time");
                    this.deltaTimeHandle = GLES31.glGetUniformLocation(this.drawProgram, "deltaTime");
                    this.sizeHandle = GLES31.glGetUniformLocation(this.drawProgram, "size");
                    this.radiusHandle = GLES31.glGetUniformLocation(this.drawProgram, "r");
                    this.seedHandle = GLES31.glGetUniformLocation(this.drawProgram, "seed");
                    GLES31.glViewport(0, 0, this.width, this.height);
                    GLES31.glEnable(3042);
                    GLES31.glBlendFunc(770, 771);
                    GLES31.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES31.glUseProgram(this.drawProgram);
                    GLES31.glUniform2f(this.sizeHandle, this.width, this.height);
                    GLES31.glUniform1f(this.resetHandle, this.reset ? 1.0f : 0.0f);
                    GLES31.glUniform1f(this.radiusHandle, this.radius);
                    GLES31.glUniform1f(this.seedHandle, Utilities.fastRandom.nextInt(LiteMode.FLAG_CHAT_BLUR) / 256.0f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "noiseScale"), 6.0f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "noiseSpeed"), 0.6f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "noiseMovement"), 4.0f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "longevity"), 1.4f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "dampingMult"), 0.9999f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "maxVelocity"), 6.0f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "velocityMult"), 1.0f);
                    GLES31.glUniform1f(GLES31.glGetUniformLocation(this.drawProgram, "forceMult"), 0.6f);
                }
            }
        }

        private void drawFrame(float f) {
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = this.eglSurface;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                this.running = false;
                return;
            }
            float f2 = 0.65f * f;
            float f3 = this.t + f2;
            this.t = f3;
            if (f3 > 1000.0f) {
                this.t = 0.0f;
            }
            GLES31.glClear(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
            GLES31.glBindBuffer(34962, this.particlesData[this.currentBuffer]);
            GLES31.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
            GLES31.glEnableVertexAttribArray(0);
            GLES31.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
            GLES31.glEnableVertexAttribArray(1);
            GLES31.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
            GLES31.glEnableVertexAttribArray(2);
            GLES31.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
            GLES31.glEnableVertexAttribArray(3);
            GLES31.glBindBufferBase(35982, 0, this.particlesData[1 - this.currentBuffer]);
            GLES31.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
            GLES31.glEnableVertexAttribArray(0);
            GLES31.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
            GLES31.glEnableVertexAttribArray(1);
            GLES31.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
            GLES31.glEnableVertexAttribArray(2);
            GLES31.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
            GLES31.glEnableVertexAttribArray(3);
            GLES31.glUniform1f(this.timeHandle, this.t);
            GLES31.glUniform1f(this.deltaTimeHandle, f2);
            GLES31.glBeginTransformFeedback(0);
            GLES31.glDrawArrays(0, 0, this.particlesCount);
            GLES31.glEndTransformFeedback();
            if (this.reset) {
                this.reset = false;
                GLES31.glUniform1f(this.resetHandle, 0.0f);
            }
            this.currentBuffer = 1 - this.currentBuffer;
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            checkGlErrors();
        }

        private void die() {
            try {
                int[] iArr = this.particlesData;
                if (iArr != null) {
                    GLES31.glDeleteBuffers(2, iArr, 0);
                    this.particlesData = null;
                }
                int i = this.drawProgram;
                if (i != 0) {
                    GLES31.glDeleteProgram(i);
                    this.drawProgram = 0;
                }
                EGL10 egl10 = this.egl;
                if (egl10 != null) {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
                    this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.surfaceTexture.release();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            checkGlErrors();
        }

        private void checkResize() {
            synchronized (this.resizeLock) {
                if (this.resize) {
                    GLES31.glUniform2f(this.sizeHandle, this.width, this.height);
                    GLES31.glViewport(0, 0, this.width, this.height);
                    int particlesCount = particlesCount();
                    if (particlesCount > this.particlesCount) {
                        this.reset = true;
                        genParticlesData();
                    }
                    this.particlesCount = particlesCount;
                    this.resize = false;
                }
            }
        }

        private void genParticlesData() {
            int[] iArr = this.particlesData;
            if (iArr != null) {
                GLES31.glDeleteBuffers(2, iArr, 0);
            }
            int[] iArr2 = new int[2];
            this.particlesData = iArr2;
            GLES31.glGenBuffers(2, iArr2, 0);
            for (int i = 0; i < 2; i++) {
                GLES31.glBindBuffer(34962, this.particlesData[i]);
                GLES31.glBufferData(34962, this.particlesCount * 6 * 4, null, 35048);
            }
            checkGlErrors();
        }

        private void checkGlErrors() {
            while (true) {
                int glGetError = GLES31.glGetError();
                if (glGetError == 0) {
                    return;
                }
                FileLog.e("spoiler gles error " + glGetError);
            }
        }
    }
}
