package org.telegram.ui.Components.spoilers;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class SpoilerEffect2 {
    private static HashMap instance;
    private final double MAX_DELTA;
    public final int MAX_FPS;
    private final double MIN_DELTA;
    public boolean destroyed;
    private int height;
    private final TextureView textureView;
    private final ViewGroup textureViewContainer;
    private SpoilerThread thread;
    public final int type;
    private int width;
    private final ArrayList holders = new ArrayList();
    private final HashMap holdersToIndex = new HashMap();
    private int holdersIndex = 0;
    private final Runnable checkDestroy = new Runnable() {
        @Override
        public final void run() {
            SpoilerEffect2.this.lambda$new$0();
        }
    };

    public static boolean supports() {
        return true;
    }

    public static SpoilerEffect2 getInstance(View view) {
        return getInstance(0, view);
    }

    public static SpoilerEffect2 getInstance(int i, View view) {
        return getInstance(i, view, getRootView(view));
    }

    public static SpoilerEffect2 getInstance(int i, View view, ViewGroup viewGroup) {
        if (view == null || !supports()) {
            return null;
        }
        if (instance == null) {
            instance = new HashMap();
        }
        SpoilerEffect2 spoilerEffect2 = (SpoilerEffect2) instance.get(Integer.valueOf(i));
        if (spoilerEffect2 == null) {
            int size = getSize();
            if (viewGroup == null) {
                return null;
            }
            HashMap hashMap = instance;
            Integer valueOf = Integer.valueOf(i);
            SpoilerEffect2 spoilerEffect22 = new SpoilerEffect2(i, makeTextureViewContainer(viewGroup), size, size);
            hashMap.put(valueOf, spoilerEffect22);
            spoilerEffect2 = spoilerEffect22;
        }
        spoilerEffect2.attach(view);
        return spoilerEffect2;
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
        HashMap hashMap = instance;
        if (hashMap == null) {
            return;
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            SpoilerThread spoilerThread = ((SpoilerEffect2) it.next()).thread;
            if (spoilerThread != null) {
                spoilerThread.pause(z);
            }
        }
    }

    public static void pause(int i, boolean z) {
        SpoilerThread spoilerThread;
        HashMap hashMap = instance;
        if (hashMap == null) {
            return;
        }
        for (SpoilerEffect2 spoilerEffect2 : hashMap.values()) {
            if (spoilerEffect2.type == i && (spoilerThread = spoilerEffect2.thread) != null) {
                spoilerThread.pause(z);
            }
        }
    }

    private static int getSize() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            Point point = AndroidUtilities.displaySize;
            return Math.min(900, (int) (((point.x + point.y) / 2.0f) * 0.8f));
        }
        if (devicePerformanceClass == 2) {
            Point point2 = AndroidUtilities.displaySize;
            return Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
        }
        Point point3 = AndroidUtilities.displaySize;
        return Math.min(720, (int) (((point3.x + point3.y) / 2.0f) * 0.7f));
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
        HashMap hashMap = this.holdersToIndex;
        int i = this.holdersIndex;
        this.holdersIndex = i + 1;
        hashMap.put(view, Integer.valueOf(i));
    }

    public void reassignAttach(View view, int i) {
        this.holdersToIndex.put(view, Integer.valueOf(i));
    }

    public int getAttachIndex(View view) {
        Integer num = (Integer) this.holdersToIndex.get(view);
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
            ((View) this.holders.get(i)).invalidate();
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
        draw(canvas, view, i, i2, f, false);
    }

    public void draw(Canvas canvas, View view, int i, int i2, float f, boolean z) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        int i3 = this.width;
        int i4 = this.height;
        Integer num = (Integer) this.holdersToIndex.get(view);
        if (num == null) {
            num = 0;
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
        if (i > i3 || i2 > i4) {
            float max = Math.max(i / i3, i2 / i4);
            canvas.scale(max, max);
        }
        if (z) {
            Bitmap bitmap = this.textureView.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            this.textureView.setAlpha(f);
            this.textureView.draw(canvas);
        }
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

    private SpoilerEffect2(int i, ViewGroup viewGroup, int i2, int i3) {
        int i4 = (int) AndroidUtilities.screenRefreshRate;
        this.MAX_FPS = i4;
        double d = 1.0d / i4;
        this.MIN_DELTA = d;
        this.MAX_DELTA = d * 4.0d;
        this.type = i;
        this.width = i2;
        this.height = i3;
        this.textureViewContainer = viewGroup;
        TextureView textureView = new TextureView(viewGroup.getContext()) {
            @Override
            protected void onMeasure(int i5, int i6) {
                setMeasuredDimension(SpoilerEffect2.this.width, SpoilerEffect2.this.height);
            }
        };
        this.textureView = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i6) {
                if (SpoilerEffect2.this.thread == null) {
                    SpoilerEffect2 spoilerEffect2 = SpoilerEffect2.this;
                    final SpoilerEffect2 spoilerEffect22 = SpoilerEffect2.this;
                    spoilerEffect2.thread = new SpoilerThread(surfaceTexture, i5, i6, new Runnable() {
                        @Override
                        public final void run() {
                            SpoilerEffect2.this.invalidate();
                        }
                    });
                    SpoilerEffect2.this.thread.start();
                }
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i6) {
                if (SpoilerEffect2.this.thread != null) {
                    SpoilerEffect2.this.thread.updateSize(i5, i6);
                }
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (SpoilerEffect2.this.thread == null) {
                    return true;
                }
                SpoilerEffect2.this.thread.halt();
                SpoilerEffect2.this.thread = null;
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
        private float radius = AndroidUtilities.dpf2(1.2f);
        private boolean reset = true;
        private int currentBuffer = 0;
        private final float timeScale = 0.65f;
        private int particlesCount = particlesCount();

        public SpoilerThread(SurfaceTexture surfaceTexture, int i, int i2, Runnable runnable) {
            this.invalidate = runnable;
            this.surfaceTexture = surfaceTexture;
            this.width = i;
            this.height = i2;
        }

        private int particlesCount() {
            return (int) Utilities.clamp(((this.width * this.height) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
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
                double d = (nanoTime2 - nanoTime) / 1.0E9d;
                if (d < SpoilerEffect2.this.MIN_DELTA) {
                    double d2 = SpoilerEffect2.this.MIN_DELTA - d;
                    long j = (long) (d2 * 1000.0d);
                    try {
                        Thread.sleep(j, (int) ((d2 - (j / 1000.0d)) * 1.0E9d));
                    } catch (Exception unused) {
                    }
                    d = SpoilerEffect2.this.MIN_DELTA;
                } else if (d > SpoilerEffect2.this.MAX_DELTA) {
                    d = SpoilerEffect2.this.MAX_DELTA;
                }
                while (this.paused) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused2) {
                    }
                }
                checkResize();
                drawFrame((float) d);
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
                return;
            }
            if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
                this.running = false;
                return;
            }
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
                return;
            }
            if (!this.egl.eglMakeCurrent(this.eglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.eglContext)) {
                this.running = false;
                return;
            }
            genParticlesData();
            int glCreateShader = GLES20.glCreateShader(35633);
            int glCreateShader2 = GLES20.glCreateShader(35632);
            if (glCreateShader == 0 || glCreateShader2 == 0) {
                this.running = false;
                return;
            }
            GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex) + "\n// " + Math.random());
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                this.running = false;
                return;
            }
            GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment) + "\n// " + Math.random());
            GLES20.glCompileShader(glCreateShader2);
            GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
            if (iArr[0] == 0) {
                FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                GLES20.glDeleteShader(glCreateShader2);
                this.running = false;
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            this.drawProgram = glCreateProgram;
            if (glCreateProgram == 0) {
                this.running = false;
                return;
            }
            GLES20.glAttachShader(glCreateProgram, glCreateShader);
            GLES20.glAttachShader(this.drawProgram, glCreateShader2);
            GLES30.glTransformFeedbackVaryings(this.drawProgram, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
            GLES20.glLinkProgram(this.drawProgram);
            GLES20.glGetProgramiv(this.drawProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.drawProgram));
                this.running = false;
                return;
            }
            this.resetHandle = GLES20.glGetUniformLocation(this.drawProgram, "reset");
            this.timeHandle = GLES20.glGetUniformLocation(this.drawProgram, "time");
            this.deltaTimeHandle = GLES20.glGetUniformLocation(this.drawProgram, "deltaTime");
            this.sizeHandle = GLES20.glGetUniformLocation(this.drawProgram, "size");
            this.radiusHandle = GLES20.glGetUniformLocation(this.drawProgram, "r");
            this.seedHandle = GLES20.glGetUniformLocation(this.drawProgram, "seed");
            GLES20.glViewport(0, 0, this.width, this.height);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glUseProgram(this.drawProgram);
            GLES20.glUniform2f(this.sizeHandle, this.width, this.height);
            GLES20.glUniform1f(this.resetHandle, this.reset ? 1.0f : 0.0f);
            GLES20.glUniform1f(this.radiusHandle, this.radius);
            GLES20.glUniform1f(this.seedHandle, Utilities.fastRandom.nextInt(256) / 256.0f);
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
            GLES20.glClear(16384);
            GLES20.glBindBuffer(34962, this.particlesData[this.currentBuffer]);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
            GLES20.glEnableVertexAttribArray(3);
            GLES30.glBindBufferBase(35982, 0, this.particlesData[1 - this.currentBuffer]);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
            GLES20.glEnableVertexAttribArray(3);
            GLES20.glUniform1f(this.timeHandle, this.t);
            GLES20.glUniform1f(this.deltaTimeHandle, f2);
            GLES30.glBeginTransformFeedback(0);
            GLES20.glDrawArrays(0, 0, this.particlesCount);
            GLES30.glEndTransformFeedback();
            if (this.reset) {
                this.reset = false;
                GLES20.glUniform1f(this.resetHandle, 0.0f);
            }
            this.currentBuffer = 1 - this.currentBuffer;
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            checkGlErrors();
        }

        private void die() {
            int[] iArr = this.particlesData;
            if (iArr != null) {
                try {
                    GLES20.glDeleteBuffers(2, iArr, 0);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.particlesData = null;
            }
            int i = this.drawProgram;
            if (i != 0) {
                try {
                    GLES20.glDeleteProgram(i);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                this.drawProgram = 0;
            }
            EGL10 egl10 = this.egl;
            if (egl10 != null) {
                try {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                try {
                    this.egl.eglDestroySurface(this.eglDisplay, this.eglSurface);
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                try {
                    this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
            }
            try {
                this.surfaceTexture.release();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            checkGlErrors();
        }

        private void checkResize() {
            synchronized (this.resizeLock) {
                try {
                    if (this.resize) {
                        GLES20.glUniform2f(this.sizeHandle, this.width, this.height);
                        GLES20.glViewport(0, 0, this.width, this.height);
                        int particlesCount = particlesCount();
                        if (particlesCount > this.particlesCount) {
                            this.reset = true;
                            genParticlesData();
                        }
                        this.particlesCount = particlesCount;
                        this.resize = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void genParticlesData() {
            int[] iArr = this.particlesData;
            if (iArr != null) {
                GLES20.glDeleteBuffers(2, iArr, 0);
            }
            int[] iArr2 = new int[2];
            this.particlesData = iArr2;
            GLES20.glGenBuffers(2, iArr2, 0);
            for (int i = 0; i < 2; i++) {
                GLES20.glBindBuffer(34962, this.particlesData[i]);
                GLES20.glBufferData(34962, this.particlesCount * 24, null, 35048);
            }
            checkGlErrors();
        }

        private void checkGlErrors() {
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    return;
                }
                FileLog.e("spoiler gles error " + glGetError);
            }
        }
    }
}
