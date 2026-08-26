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
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.PhotoViewer;

public final class SpoilerEffect2 {
    public static HashMap instance;
    public final double MAX_DELTA;
    public final double MIN_DELTA;
    public boolean destroyed;
    public final int height;
    public final AnonymousClass2 textureView;
    public final PhotoViewer.AnonymousClass19 textureViewContainer;
    public SpoilerThread thread;
    public final int type;
    public final int width;
    public final ArrayList holders = new ArrayList();
    public final HashMap holdersToIndex = new HashMap();
    public int holdersIndex = 0;
    public final SpoilerEffect2$$ExternalSyntheticLambda0 checkDestroy = new SpoilerEffect2$$ExternalSyntheticLambda0(this, 0);

    public final class SpoilerThread extends Thread {
        public int deltaTimeHandle;
        public int drawProgram;
        public EGL10 egl;
        public EGLConfig eglConfig;
        public EGLContext eglContext;
        public EGLDisplay eglDisplay;
        public EGLSurface eglSurface;
        public int height;
        public final SpoilerEffect2$$ExternalSyntheticLambda0 invalidate;
        public int particlesCount;
        public int[] particlesData;
        public int radiusHandle;
        public int resetHandle;
        public boolean resize;
        public int seedHandle;
        public int sizeHandle;
        public final SurfaceTexture surfaceTexture;
        public float t;
        public int timeHandle;
        public int width;
        public volatile boolean running = true;
        public volatile boolean paused = false;
        public final Object resizeLock = new Object();
        public final float radius = AndroidUtilities.dpf2(1.2f);
        public boolean reset = true;
        public int currentBuffer = 0;

        public SpoilerThread(SurfaceTexture surfaceTexture, int i, int i2, SpoilerEffect2$$ExternalSyntheticLambda0 spoilerEffect2$$ExternalSyntheticLambda0) {
            this.invalidate = spoilerEffect2$$ExternalSyntheticLambda0;
            this.surfaceTexture = surfaceTexture;
            this.width = i;
            this.height = i2;
            this.particlesCount = (int) Utilities.clamp(((i * i2) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
        }

        public final void genParticlesData() {
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
            while (true) {
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError == 0) {
                    return;
                }
                FileLog.e("spoiler gles error " + iGlGetError);
            }
        }

        @Override
        public final void run() {
            int i;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                this.running = false;
            } else {
                if (this.egl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (this.egl.eglChooseConfig(this.eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        this.eglConfig = eGLConfig;
                        EGLContext eGLContextEglCreateContext = this.egl.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                        this.eglContext = eGLContextEglCreateContext;
                        if (eGLContextEglCreateContext == null) {
                            this.running = false;
                        } else {
                            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, this.surfaceTexture, null);
                            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
                            if (eGLSurfaceEglCreateWindowSurface != null && this.egl.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                                genParticlesData();
                                int iGlCreateShader = GLES20.glCreateShader(35633);
                                int iGlCreateShader2 = GLES20.glCreateShader(35632);
                                if (iGlCreateShader == 0 || iGlCreateShader2 == 0) {
                                    this.running = false;
                                } else {
                                    GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex));
                                    GLES20.glCompileShader(iGlCreateShader);
                                    int[] iArr = new int[1];
                                    GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                                        GLES20.glDeleteShader(iGlCreateShader);
                                        this.running = false;
                                    } else {
                                        GLES20.glShaderSource(iGlCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                        GLES20.glCompileShader(iGlCreateShader2);
                                        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
                                        if (iArr[0] == 0) {
                                            FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
                                            GLES20.glDeleteShader(iGlCreateShader2);
                                            this.running = false;
                                        } else {
                                            int iGlCreateProgram = GLES20.glCreateProgram();
                                            this.drawProgram = iGlCreateProgram;
                                            if (iGlCreateProgram == 0) {
                                                this.running = false;
                                            } else {
                                                GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                                                GLES20.glAttachShader(this.drawProgram, iGlCreateShader2);
                                                GLES30.glTransformFeedbackVaryings(this.drawProgram, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                                GLES20.glLinkProgram(this.drawProgram);
                                                GLES20.glGetProgramiv(this.drawProgram, 35714, iArr, 0);
                                                if (iArr[0] == 0) {
                                                    FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.drawProgram));
                                                    this.running = false;
                                                } else {
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
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.running = false;
                            }
                        }
                    } else {
                        this.running = false;
                    }
                } else {
                    this.running = false;
                }
            }
            long jNanoTime = System.nanoTime();
            while (this.running) {
                long jNanoTime2 = System.nanoTime();
                double d = (jNanoTime2 - jNanoTime) / 1.0E9d;
                SpoilerEffect2 spoilerEffect2 = SpoilerEffect2.this;
                double d2 = spoilerEffect2.MIN_DELTA;
                if (d < d2) {
                    double d3 = d2 - d;
                    long j = (long) (d3 * 1000.0d);
                    i = 3;
                    try {
                        Thread.sleep(j, (int) ((d3 - (j / 1000.0d)) * 1.0E9d));
                    } catch (Exception unused) {
                    }
                    d = SpoilerEffect2.this.MIN_DELTA;
                } else {
                    i = 3;
                    double d4 = spoilerEffect2.MAX_DELTA;
                    if (d > d4) {
                        d = d4;
                    }
                }
                while (this.paused) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused2) {
                    }
                }
                synchronized (this.resizeLock) {
                    try {
                        if (this.resize) {
                            GLES20.glUniform2f(this.sizeHandle, this.width, this.height);
                            GLES20.glViewport(0, 0, this.width, this.height);
                            int iClamp = (int) Utilities.clamp(((this.width * this.height) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                            if (iClamp > this.particlesCount) {
                                this.reset = true;
                                genParticlesData();
                            }
                            this.particlesCount = iClamp;
                            this.resize = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                float f = (float) d;
                EGL10 egl11 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    float f2 = f * 0.65f;
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
                    GLES20.glEnableVertexAttribArray(i);
                    GLES30.glBindBufferBase(35982, 0, this.particlesData[1 - this.currentBuffer]);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                    GLES20.glEnableVertexAttribArray(2);
                    GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                    GLES20.glEnableVertexAttribArray(i);
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
                    while (true) {
                        int iGlGetError = GLES20.glGetError();
                        if (iGlGetError != 0) {
                            FileLog.e("spoiler gles error " + iGlGetError);
                        }
                    }
                } else {
                    this.running = false;
                }
                AndroidUtilities.cancelRunOnUIThread(this.invalidate);
                AndroidUtilities.runOnUIThread(this.invalidate);
                jNanoTime = jNanoTime2;
            }
            int[] iArr2 = this.particlesData;
            if (iArr2 != null) {
                try {
                    GLES20.glDeleteBuffers(2, iArr2, 0);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.particlesData = null;
            }
            int i2 = this.drawProgram;
            if (i2 != 0) {
                try {
                    GLES20.glDeleteProgram(i2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                this.drawProgram = 0;
            }
            EGL10 egl12 = this.egl;
            if (egl12 != null) {
                try {
                    EGLDisplay eGLDisplay2 = this.eglDisplay;
                    EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                    egl12.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
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
                while (true) {
                    int iGlGetError2 = GLES20.glGetError();
                    if (iGlGetError2 == 0) {
                        return;
                    }
                    FileLog.e("spoiler gles error " + iGlGetError2);
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public SpoilerEffect2(int i, PhotoViewer.AnonymousClass19 anonymousClass19, int i2, int i3) {
        double d = 1.0d / ((double) ((int) AndroidUtilities.screenRefreshRate));
        this.MIN_DELTA = d;
        this.MAX_DELTA = d * 4.0d;
        this.type = i;
        this.width = i2;
        this.height = i3;
        this.textureViewContainer = anonymousClass19;
        ?? r6 = new TextureView(anonymousClass19.getContext()) {
            @Override
            public final void onMeasure(int i4, int i5) {
                SpoilerEffect2 spoilerEffect2 = SpoilerEffect2.this;
                setMeasuredDimension(spoilerEffect2.width, spoilerEffect2.height);
            }
        };
        this.textureView = r6;
        r6.setSurfaceTextureListener(new PhotoViewer.AnonymousClass8(this, 5));
        r6.setOpaque(false);
        anonymousClass19.addView(r6);
    }

    public static SpoilerEffect2 getInstance(int i, View view, ViewGroup viewGroup) {
        int iMin;
        if (view == null) {
            return null;
        }
        if (instance == null) {
            instance = new HashMap();
        }
        SpoilerEffect2 spoilerEffect2 = (SpoilerEffect2) instance.get(Integer.valueOf(i));
        if (spoilerEffect2 == null) {
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 1) {
                Point point = AndroidUtilities.displaySize;
                iMin = Math.min(900, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (devicePerformanceClass != 2) {
                Point point2 = AndroidUtilities.displaySize;
                iMin = Math.min(720, (int) (((point2.x + point2.y) / 2.0f) * 0.7f));
            } else {
                Point point3 = AndroidUtilities.displaySize;
                iMin = Math.min(1280, (int) (((point3.x + point3.y) / 2.0f) * 1.0f));
            }
            if (viewGroup == null) {
                return null;
            }
            HashMap map = instance;
            Integer numValueOf = Integer.valueOf(i);
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(viewGroup.getContext(), 24);
            viewGroup.addView(anonymousClass19);
            SpoilerEffect2 spoilerEffect3 = new SpoilerEffect2(i, anonymousClass19, iMin, iMin);
            map.put(numValueOf, spoilerEffect3);
            spoilerEffect2 = spoilerEffect3;
        }
        spoilerEffect2.attach(view);
        return spoilerEffect2;
    }

    public static void pause$1(boolean z) {
        SpoilerThread spoilerThread;
        HashMap map = instance;
        if (map == null) {
            return;
        }
        for (SpoilerEffect2 spoilerEffect2 : map.values()) {
            if (spoilerEffect2.type == 0 && (spoilerThread = spoilerEffect2.thread) != null) {
                spoilerThread.paused = z;
            }
        }
    }

    public final void attach(View view) {
        if (this.destroyed) {
            return;
        }
        ArrayList arrayList = this.holders;
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
        HashMap map = this.holdersToIndex;
        int i = this.holdersIndex;
        this.holdersIndex = i + 1;
        map.put(view, Integer.valueOf(i));
    }

    public final void detach(View view) {
        this.holders.remove(view);
        this.holdersToIndex.remove(view);
        if (this.destroyed) {
            return;
        }
        SpoilerEffect2$$ExternalSyntheticLambda0 spoilerEffect2$$ExternalSyntheticLambda0 = this.checkDestroy;
        AndroidUtilities.cancelRunOnUIThread(spoilerEffect2$$ExternalSyntheticLambda0);
        AndroidUtilities.runOnUIThread(spoilerEffect2$$ExternalSyntheticLambda0, 30L);
    }

    public final void draw(Canvas canvas, View view, int i, int i2, float f, boolean z) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.holdersToIndex.get(view);
        if (num == null) {
            num = 0;
        }
        int i3 = this.width;
        int i4 = this.height;
        if (i > i3 || i2 > i4) {
            float fMax = Math.max(i / i3, i2 / i4);
            canvas.scale(fMax, fMax);
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
        AnonymousClass2 anonymousClass2 = this.textureView;
        if (z) {
            Bitmap bitmap = anonymousClass2.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            anonymousClass2.setAlpha(f);
            anonymousClass2.draw(canvas);
        }
        canvas.restore();
    }

    public final void reassignAttach(int i, ChatMessageCell chatMessageCell) {
        this.holdersToIndex.put(chatMessageCell, Integer.valueOf(i));
    }

    public static SpoilerEffect2 getInstance(View view) {
        ViewGroup viewGroup;
        Activity activityFindActivity = AndroidUtilities.findActivity(view.getContext());
        if (activityFindActivity == null) {
            viewGroup = null;
        } else {
            View rootView = activityFindActivity.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            } else {
                viewGroup = null;
            }
        }
        return getInstance(0, view, viewGroup);
    }
}
