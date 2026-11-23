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
import org.telegram.messenger.Utilities;
public final class lz0 extends org.telegram.messenger.r5 {
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
    public int S;
    public volatile boolean T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final ArrayList X;
    public boolean f37267a;
    public final AtomicBoolean f37268b;
    public final SurfaceTexture f37269c;
    public iz0 d;
    public int f37270e;
    public int f37271f;
    public EGL10 h;
    public EGLDisplay f37272n;
    public EGLConfig f37273r;
    public EGLSurface f37274s;
    public EGLContext f37275w;
    public int f37276x;
    public int f37277y;

    public lz0(SurfaceTexture surfaceTexture, iz0 iz0Var, iz0 iz0Var2, int i7, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f37268b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.f37269c = surfaceTexture;
        this.d = iz0Var2;
        this.f37270e = i7;
        this.f37271f = i10;
        start();
    }

    public final void a(kz0 kz0Var) {
        int i7 = 0;
        GLES20.glGenTextures(1, kz0Var.A, 0);
        GLES20.glBindTexture(3553, kz0Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, kz0Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        kz0Var.C.recycle();
        kz0Var.C = null;
        if (kz0Var.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((kz0) obj).a();
            }
            this.U.clear();
        }
        this.U.add(kz0Var);
        this.T = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (!this.f37268b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.g3(runnable);
            }
            iz0 iz0Var = this.d;
            if (iz0Var != null) {
                org.telegram.messenger.g0.g3(iz0Var);
                this.d = null;
                return;
            }
            return;
        }
        kz0 kz0Var = new kz0(this, view, f10, runnable);
        getHandler();
        this.T = true;
        postRunnable(new jz0(this, kz0Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f37268b.get()) {
            org.telegram.messenger.g0.g3(new di.fa(runnable, runnable2, 1));
            nz0.b(this.d);
            this.d = null;
            return;
        }
        kz0 kz0Var = new kz0(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.T = true;
        postRunnable(new jz0(this, kz0Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f37268b.get()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.g3(runnable);
            }
            iz0 iz0Var = this.d;
            if (iz0Var != null) {
                org.telegram.messenger.g0.g3(iz0Var);
                this.d = null;
                return;
            }
            return;
        }
        kz0 kz0Var = new kz0(this, arrayList, runnable);
        this.T = true;
        postRunnable(new jz0(this, kz0Var, 0));
    }

    public final void f() {
        long j3;
        double d;
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        int i10;
        int i11;
        int j10;
        int i12;
        int i13;
        int i14;
        if (this.f37268b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.U.size()) {
                kz0 kz0Var = (kz0) this.U.get(i16);
                if (kz0Var.d) {
                    ArrayList arrayList = this.U;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((kz0) arrayList.get(i18)).f36948u;
                    }
                    float f14 = kz0Var.f36948u;
                    float f15 = f14 / i17;
                    int[] iArr = kz0Var.B;
                    int i19 = kz0Var.f36947t;
                    int o4 = org.telegram.messenger.bz.o();
                    int i20 = 120000;
                    if (o4 != 1) {
                        if (o4 != 2) {
                            i11 = 30000;
                        } else {
                            i11 = 120000;
                        }
                    } else {
                        i11 = 60000;
                    }
                    if (!kz0Var.E.f37267a) {
                        i20 = i11;
                    }
                    if (kz0Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    kz0Var.f36946s = Utilities.j((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(j10 / f17));
                    kz0Var.f36949w = round;
                    kz0Var.v = Math.round(kz0Var.f36946s / round);
                    while (true) {
                        i12 = kz0Var.v;
                        i13 = kz0Var.f36949w;
                        i14 = i12 * i13;
                        if (i14 >= kz0Var.f36946s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            kz0Var.v = i12 + 1;
                        } else {
                            kz0Var.f36949w = i13 + 1;
                        }
                    }
                    kz0Var.f36946s = i14;
                    kz0Var.f36950x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, kz0Var.f36946s * 28, null, 35048);
                    }
                    if (kz0Var.f36933e != null) {
                        this.V.add(kz0Var);
                    }
                }
                this.W = true;
                int[] iArr2 = kz0Var.B;
                boolean z10 = kz0Var.D;
                float f18 = kz0Var.f36940m;
                int i22 = kz0Var.f36948u;
                int i23 = kz0Var.f36947t;
                Matrix matrix = kz0Var.f36945r;
                lz0 lz0Var = kz0Var.E;
                long nanoTime = System.nanoTime();
                if (kz0Var.f36931b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                kz0Var.f36931b = nanoTime;
                if (kz0Var.f36941n && !kz0Var.f36942o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(kz0Var.f36936i, kz0Var.f36937j);
                    kz0Var.c();
                }
                kz0Var.f36932c = (float) ((f18 * d) + kz0Var.f36932c);
                GLES20.glUniformMatrix3fv(lz0Var.f37277y, 1, false, kz0Var.f36943p, 0);
                int i24 = lz0Var.E;
                if (kz0Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(lz0Var.F, kz0Var.f36932c);
                GLES20.glUniform1f(lz0Var.G, ((float) d) * f18);
                GLES20.glUniform1f(lz0Var.H, kz0Var.f36946s);
                GLES20.glUniform3f(lz0Var.J, kz0Var.v, kz0Var.f36949w, kz0Var.f36950x);
                GLES20.glUniform2f(lz0Var.Q, kz0Var.f36935g, kz0Var.h);
                int i25 = lz0Var.R;
                if (z10) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = lz0Var.S;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(lz0Var.K, i23, i22);
                GLES20.glUniform1f(lz0Var.L, kz0Var.f36951y);
                GLES20.glUniform2f(lz0Var.M, 0.0f, 0.0f);
                GLES20.glUniform1f(lz0Var.O, kz0Var.f36938k);
                GLES20.glUniform1f(lz0Var.P, kz0Var.f36939l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, kz0Var.A[0]);
                GLES20.glUniform1i(lz0Var.N, 0);
                GLES20.glBindBuffer(34962, iArr2[kz0Var.f36952z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - kz0Var.f36952z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, kz0Var.f36946s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                kz0Var.d = false;
                kz0Var.f36952z = 1 - kz0Var.f36952z;
                float f19 = kz0Var.f36932c;
                float f20 = kz0Var.f36939l;
                if (kz0Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    kz0Var.a();
                    this.U.remove(i16);
                    i7 = 1;
                    this.T = !this.U.isEmpty();
                    i16--;
                } else {
                    i7 = 1;
                }
                i16 += i7;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    org.telegram.messenger.a8.d("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        for (int i27 = 0; i27 < this.V.size(); i27++) {
                            org.telegram.messenger.g0.g3(((kz0) this.V.get(i27)).f36933e);
                        }
                        this.V.clear();
                        while (i15 < this.U.size()) {
                            ((kz0) this.U.get(i15)).a();
                            i15++;
                        }
                        this.U.clear();
                        org.telegram.messenger.g0.g3(new ne(14));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f37272n, this.f37274s);
            while (i15 < this.V.size()) {
                org.telegram.messenger.g0.g3(((kz0) this.V.get(i15)).f36933e);
                i15++;
            }
            this.V.clear();
            if (this.U.isEmpty() && this.W) {
                i();
            }
        }
    }

    public final void g() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f37272n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f37272n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f37273r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f37272n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f37275w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f37272n, this.f37273r, this.f37269c, null);
            this.f37274s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f37272n, eglCreateWindowSurface, eglCreateWindowSurface, this.f37275w)) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglMakeCurrent");
                i();
            } else {
                int glCreateShader = GLES20.glCreateShader(35633);
                int glCreateShader2 = GLES20.glCreateShader(35632);
                if (glCreateShader != 0 && glCreateShader2 != 0) {
                    GLES20.glShaderSource(glCreateShader, org.telegram.messenger.g0.y2(null, 2131624289));
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                        i();
                        return;
                    }
                    GLES20.glShaderSource(glCreateShader2, org.telegram.messenger.g0.y2(null, 2131624288));
                    GLES20.glCompileShader(glCreateShader2);
                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                        GLES20.glDeleteShader(glCreateShader2);
                        i();
                        return;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.f37276x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f37276x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f37276x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f37276x);
                    GLES20.glGetProgramiv(this.f37276x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f37276x));
                        i();
                        return;
                    }
                    this.f37277y = GLES20.glGetUniformLocation(this.f37276x, "matrix");
                    this.K = GLES20.glGetUniformLocation(this.f37276x, "rectSize");
                    this.M = GLES20.glGetUniformLocation(this.f37276x, "rectPos");
                    this.E = GLES20.glGetUniformLocation(this.f37276x, "reset");
                    this.F = GLES20.glGetUniformLocation(this.f37276x, "time");
                    this.G = GLES20.glGetUniformLocation(this.f37276x, "deltaTime");
                    this.H = GLES20.glGetUniformLocation(this.f37276x, "particlesCount");
                    this.I = GLES20.glGetUniformLocation(this.f37276x, "size");
                    this.J = GLES20.glGetUniformLocation(this.f37276x, "gridSize");
                    this.N = GLES20.glGetUniformLocation(this.f37276x, "tex");
                    this.L = GLES20.glGetUniformLocation(this.f37276x, "seed");
                    this.O = GLES20.glGetUniformLocation(this.f37276x, "dp");
                    this.P = GLES20.glGetUniformLocation(this.f37276x, "longevity");
                    this.Q = GLES20.glGetUniformLocation(this.f37276x, "offset");
                    this.R = GLES20.glGetUniformLocation(this.f37276x, "scale");
                    this.S = GLES20.glGetUniformLocation(this.f37276x, "uvOffset");
                    GLES20.glViewport(0, 0, this.f37270e, this.f37271f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f37276x);
                    GLES20.glUniform2f(this.I, this.f37270e, this.f37271f);
                    return;
                }
                org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f37268b.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: kill failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            int i10 = 0;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        ArrayList arrayList = this.U;
                        if (i7 != 4) {
                            if (i7 == 5) {
                                View view = (View) message.obj;
                                while (i10 < arrayList.size()) {
                                    kz0 kz0Var = (kz0) arrayList.get(i10);
                                    if (kz0Var.f36930a.contains(view)) {
                                        kz0Var.a();
                                        arrayList.remove(i10);
                                        i10--;
                                    }
                                    i10++;
                                }
                                return;
                            }
                            return;
                        }
                        while (i10 < arrayList.size()) {
                            kz0 kz0Var2 = (kz0) arrayList.get(i10);
                            kz0Var2.f36935g += message.arg1;
                            kz0Var2.h += message.arg2;
                            i10++;
                        }
                        return;
                    }
                    a((kz0) message.obj);
                    return;
                }
                i();
                return;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.f37268b.get()) {
                this.f37270e = i11;
                this.f37271f = i12;
                GLES20.glViewport(0, 0, i11, i12);
                GLES20.glUniform2f(this.I, i11, i12);
            }
            f();
            return;
        }
        f();
    }

    public final void i() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.f37268b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: killInternal");
        int i7 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.U;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((kz0) arrayList.get(i7)).a();
            i7++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f37269c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        nz0.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.X;
        int i7 = 0;
        try {
            g();
            if (!arrayList.isEmpty()) {
                while (i7 < arrayList.size()) {
                    a((kz0) arrayList.get(i7));
                    i7++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i7 < arrayList.size()) {
                kz0 kz0Var = (kz0) arrayList.get(i7);
                Runnable runnable = kz0Var.f36933e;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                }
                kz0Var.a();
                i7++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.g3(new ne(13));
            i();
        }
    }
}
