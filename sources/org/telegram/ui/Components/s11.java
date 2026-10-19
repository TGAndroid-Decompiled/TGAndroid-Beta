package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class s11 extends DispatchQueue {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public volatile boolean S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public final ArrayList W;
    public boolean f30118a;
    public final AtomicBoolean f30119b;
    public final SurfaceTexture f30120c;
    public p11 d;
    public int e;
    public int f30121f;
    public EGL10 h;
    public EGLDisplay f30122n;
    public EGLConfig f30123r;
    public EGLSurface f30124s;
    public EGLContext v;
    public int f30125w;
    public int f30126x;
    public int f30127y;

    public s11(SurfaceTexture surfaceTexture, p11 p11Var, p11 p11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f30119b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f30120c = surfaceTexture;
        this.d = p11Var2;
        this.e = i10;
        this.f30121f = i11;
        start();
    }

    public final void b(r11 r11Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, r11Var.A, 0);
        GLES20.glBindTexture(3553, r11Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, r11Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        r11Var.C.recycle();
        r11Var.C = null;
        if (r11Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((r11) obj).a();
            }
            this.T.clear();
        }
        this.T.add(r11Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f30119b.get()) {
            AndroidUtilities.runOnUIThread(new ai.fb(runnable, runnable2, 1));
            u11.b(this.d);
            this.d = null;
            return;
        }
        r11 r11Var = new r11(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new q11(this, r11Var, 1));
    }

    public final void d(View view, float f7, Runnable runnable) {
        if (!this.f30119b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            p11 p11Var = this.d;
            if (p11Var != null) {
                AndroidUtilities.runOnUIThread(p11Var);
                this.d = null;
                return;
            }
            return;
        }
        r11 r11Var = new r11(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new q11(this, r11Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f30119b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            p11 p11Var = this.d;
            if (p11Var != null) {
                AndroidUtilities.runOnUIThread(p11Var);
                this.d = null;
                return;
            }
            return;
        }
        r11 r11Var = new r11(this, arrayList, runnable);
        this.S = true;
        postRunnable(new q11(this, r11Var, 0));
    }

    public final void g() {
        long j10;
        double d;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        int clamp;
        int i12;
        int i13;
        int i14;
        if (this.f30119b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                r11 r11Var = (r11) this.T.get(i16);
                if (r11Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = i15;
                    int i18 = i17;
                    while (i17 < arrayList.size()) {
                        i18 += ((r11) arrayList.get(i17)).f29789u;
                        i17++;
                    }
                    float f13 = r11Var.f29789u;
                    float f14 = f13 / i18;
                    int[] iArr = r11Var.B;
                    int i19 = r11Var.f29788t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i20 = 120000;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i11 = 30000;
                        } else {
                            i11 = 120000;
                        }
                    } else {
                        i11 = 60000;
                    }
                    if (!r11Var.E.f30118a) {
                        i20 = i11;
                    }
                    if (r11Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    r11Var.f29787s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    r11Var.f29790w = round;
                    r11Var.v = Math.round(r11Var.f29787s / round);
                    while (true) {
                        i12 = r11Var.v;
                        i13 = r11Var.f29790w;
                        i14 = i12 * i13;
                        if (i14 >= r11Var.f29787s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            r11Var.v = i12 + 1;
                        } else {
                            r11Var.f29790w = i13 + 1;
                        }
                    }
                    r11Var.f29787s = i14;
                    r11Var.f29791x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = i15; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, r11Var.f29787s * 28, null, 35048);
                    }
                    if (r11Var.e != null) {
                        this.U.add(r11Var);
                    }
                }
                this.V = true;
                int[] iArr2 = r11Var.B;
                boolean z10 = r11Var.D;
                float f17 = r11Var.f29781m;
                int i22 = r11Var.f29789u;
                int i23 = r11Var.f29788t;
                Matrix matrix = r11Var.f29786r;
                s11 s11Var = r11Var.E;
                long nanoTime = System.nanoTime();
                if (r11Var.f29773b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                r11Var.f29773b = nanoTime;
                if (r11Var.f29782n && !r11Var.f29783o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(r11Var.f29777i, r11Var.f29778j);
                    r11Var.c();
                }
                r11Var.f29774c = (float) ((f17 * d) + r11Var.f29774c);
                GLES20.glUniformMatrix3fv(s11Var.f30126x, 1, false, r11Var.f29784p, 0);
                int i24 = s11Var.f30127y;
                if (r11Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i24, f7);
                GLES20.glUniform1f(s11Var.E, r11Var.f29774c);
                GLES20.glUniform1f(s11Var.F, ((float) d) * f17);
                GLES20.glUniform1f(s11Var.G, r11Var.f29787s);
                GLES20.glUniform3f(s11Var.I, r11Var.v, r11Var.f29790w, r11Var.f29791x);
                GLES20.glUniform2f(s11Var.P, r11Var.f29776g, r11Var.h);
                int i25 = s11Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = s11Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(s11Var.J, i23, i22);
                GLES20.glUniform1f(s11Var.K, r11Var.f29792y);
                GLES20.glUniform2f(s11Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(s11Var.N, r11Var.f29779k);
                GLES20.glUniform1f(s11Var.O, r11Var.f29780l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, r11Var.A[0]);
                GLES20.glUniform1i(s11Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[r11Var.f29793z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - r11Var.f29793z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, r11Var.f29787s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                r11Var.d = false;
                r11Var.f29793z = 1 - r11Var.f29793z;
                float f18 = r11Var.f29774c;
                float f19 = r11Var.f29780l;
                if (r11Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    r11Var.a();
                    this.T.remove(i16);
                    this.S = !this.T.isEmpty();
                    i16--;
                }
                i16++;
                i15 = 0;
            }
            int i27 = i15;
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    FileLog.e("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        for (int i28 = i27; i28 < this.U.size(); i28++) {
                            AndroidUtilities.runOnUIThread(((r11) this.U.get(i28)).e);
                        }
                        this.U.clear();
                        for (int i29 = i27; i29 < this.T.size(); i29++) {
                            ((r11) this.T.get(i29)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new rc(17));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f30122n, this.f30124s);
            for (int i30 = i27; i30 < this.U.size(); i30++) {
                AndroidUtilities.runOnUIThread(((r11) this.U.get(i30)).e);
            }
            this.U.clear();
            if (this.T.isEmpty() && this.V) {
                j();
            }
        }
    }

    public final void h() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f30122n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f30122n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f30123r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f30122n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f30122n, this.f30123r, this.f30120c, null);
            this.f30124s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f30122n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
                FileLog.e("ThanosEffect: failed eglMakeCurrent");
                j();
            } else {
                int glCreateShader = GLES20.glCreateShader(35633);
                int glCreateShader2 = GLES20.glCreateShader(35632);
                if (glCreateShader != 0 && glCreateShader2 != 0) {
                    GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.thanos_vertex));
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                        j();
                        return;
                    }
                    GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.thanos_fragment));
                    GLES20.glCompileShader(glCreateShader2);
                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                        GLES20.glDeleteShader(glCreateShader2);
                        j();
                        return;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.f30125w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f30125w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f30125w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f30125w);
                    GLES20.glGetProgramiv(this.f30125w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f30125w));
                        j();
                        return;
                    }
                    this.f30126x = GLES20.glGetUniformLocation(this.f30125w, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f30125w, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f30125w, "rectPos");
                    this.f30127y = GLES20.glGetUniformLocation(this.f30125w, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f30125w, "time");
                    this.F = GLES20.glGetUniformLocation(this.f30125w, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f30125w, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f30125w, "size");
                    this.I = GLES20.glGetUniformLocation(this.f30125w, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f30125w, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f30125w, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f30125w, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f30125w, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f30125w, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f30125w, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f30125w, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f30121f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f30125w);
                    GLES20.glUniform2f(this.H, this.e, this.f30121f);
                    return;
                }
                FileLog.e("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                j();
            }
        }
    }

    @Override
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            int i11 = 0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        ArrayList arrayList = this.T;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                View view = (View) message.obj;
                                while (i11 < arrayList.size()) {
                                    r11 r11Var = (r11) arrayList.get(i11);
                                    if (r11Var.f29772a.contains(view)) {
                                        r11Var.a();
                                        arrayList.remove(i11);
                                        i11--;
                                    }
                                    i11++;
                                }
                                return;
                            }
                            return;
                        }
                        while (i11 < arrayList.size()) {
                            r11 r11Var2 = (r11) arrayList.get(i11);
                            r11Var2.f29776g += message.arg1;
                            r11Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((r11) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f30119b.get()) {
                this.e = i12;
                this.f30121f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f30119b.get()) {
            FileLog.d("ThanosEffect: kill failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    public final void j() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.f30119b;
        if (!atomicBoolean.get()) {
            FileLog.d("ThanosEffect: killInternal failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.T;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((r11) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f30120c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        u11.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.W;
        int i10 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    b((r11) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            FileLog.e(e);
            while (i10 < arrayList.size()) {
                r11 r11Var = (r11) arrayList.get(i10);
                Runnable runnable = r11Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                r11Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new rc(16));
            j();
        }
    }
}
