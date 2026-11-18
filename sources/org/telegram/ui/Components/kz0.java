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
public final class kz0 extends org.telegram.messenger.r5 {
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
    public boolean f36921a;
    public final AtomicBoolean f36922b;
    public final SurfaceTexture f36923c;
    public hz0 d;
    public int f36924e;
    public int f36925f;
    public EGL10 h;
    public EGLDisplay f36926n;
    public EGLConfig f36927r;
    public EGLSurface f36928s;
    public EGLContext f36929w;
    public int f36930x;
    public int f36931y;

    public kz0(SurfaceTexture surfaceTexture, hz0 hz0Var, hz0 hz0Var2, int i7, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f36922b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.f36923c = surfaceTexture;
        this.d = hz0Var2;
        this.f36924e = i7;
        this.f36925f = i10;
        start();
    }

    public final void a(jz0 jz0Var) {
        int i7 = 0;
        GLES20.glGenTextures(1, jz0Var.A, 0);
        GLES20.glBindTexture(3553, jz0Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, jz0Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        jz0Var.C.recycle();
        jz0Var.C = null;
        if (jz0Var.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((jz0) obj).a();
            }
            this.U.clear();
        }
        this.U.add(jz0Var);
        this.T = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (!this.f36922b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.g3(runnable);
            }
            hz0 hz0Var = this.d;
            if (hz0Var != null) {
                org.telegram.messenger.g0.g3(hz0Var);
                this.d = null;
                return;
            }
            return;
        }
        jz0 jz0Var = new jz0(this, view, f10, runnable);
        getHandler();
        this.T = true;
        postRunnable(new iz0(this, jz0Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f36922b.get()) {
            org.telegram.messenger.g0.g3(new di.ea(runnable, runnable2, 1));
            mz0.b(this.d);
            this.d = null;
            return;
        }
        jz0 jz0Var = new jz0(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.T = true;
        postRunnable(new iz0(this, jz0Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f36922b.get()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.g3(runnable);
            }
            hz0 hz0Var = this.d;
            if (hz0Var != null) {
                org.telegram.messenger.g0.g3(hz0Var);
                this.d = null;
                return;
            }
            return;
        }
        jz0 jz0Var = new jz0(this, arrayList, runnable);
        this.T = true;
        postRunnable(new iz0(this, jz0Var, 0));
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
        if (this.f36922b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.U.size()) {
                jz0 jz0Var = (jz0) this.U.get(i16);
                if (jz0Var.d) {
                    ArrayList arrayList = this.U;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((jz0) arrayList.get(i18)).f36580u;
                    }
                    float f14 = jz0Var.f36580u;
                    float f15 = f14 / i17;
                    int[] iArr = jz0Var.B;
                    int i19 = jz0Var.f36579t;
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
                    if (!jz0Var.E.f36921a) {
                        i20 = i11;
                    }
                    if (jz0Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    jz0Var.f36578s = Utilities.j((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(j10 / f17));
                    jz0Var.f36581w = round;
                    jz0Var.v = Math.round(jz0Var.f36578s / round);
                    while (true) {
                        i12 = jz0Var.v;
                        i13 = jz0Var.f36581w;
                        i14 = i12 * i13;
                        if (i14 >= jz0Var.f36578s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            jz0Var.v = i12 + 1;
                        } else {
                            jz0Var.f36581w = i13 + 1;
                        }
                    }
                    jz0Var.f36578s = i14;
                    jz0Var.f36582x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, jz0Var.f36578s * 28, null, 35048);
                    }
                    if (jz0Var.f36565e != null) {
                        this.V.add(jz0Var);
                    }
                }
                this.W = true;
                int[] iArr2 = jz0Var.B;
                boolean z10 = jz0Var.D;
                float f18 = jz0Var.f36572m;
                int i22 = jz0Var.f36580u;
                int i23 = jz0Var.f36579t;
                Matrix matrix = jz0Var.f36577r;
                kz0 kz0Var = jz0Var.E;
                long nanoTime = System.nanoTime();
                if (jz0Var.f36563b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                jz0Var.f36563b = nanoTime;
                if (jz0Var.f36573n && !jz0Var.f36574o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(jz0Var.f36568i, jz0Var.f36569j);
                    jz0Var.c();
                }
                jz0Var.f36564c = (float) ((f18 * d) + jz0Var.f36564c);
                GLES20.glUniformMatrix3fv(kz0Var.f36931y, 1, false, jz0Var.f36575p, 0);
                int i24 = kz0Var.E;
                if (jz0Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(kz0Var.F, jz0Var.f36564c);
                GLES20.glUniform1f(kz0Var.G, ((float) d) * f18);
                GLES20.glUniform1f(kz0Var.H, jz0Var.f36578s);
                GLES20.glUniform3f(kz0Var.J, jz0Var.v, jz0Var.f36581w, jz0Var.f36582x);
                GLES20.glUniform2f(kz0Var.Q, jz0Var.f36567g, jz0Var.h);
                int i25 = kz0Var.R;
                if (z10) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = kz0Var.S;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(kz0Var.K, i23, i22);
                GLES20.glUniform1f(kz0Var.L, jz0Var.f36583y);
                GLES20.glUniform2f(kz0Var.M, 0.0f, 0.0f);
                GLES20.glUniform1f(kz0Var.O, jz0Var.f36570k);
                GLES20.glUniform1f(kz0Var.P, jz0Var.f36571l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, jz0Var.A[0]);
                GLES20.glUniform1i(kz0Var.N, 0);
                GLES20.glBindBuffer(34962, iArr2[jz0Var.f36584z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - jz0Var.f36584z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, jz0Var.f36578s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                jz0Var.d = false;
                jz0Var.f36584z = 1 - jz0Var.f36584z;
                float f19 = jz0Var.f36564c;
                float f20 = jz0Var.f36571l;
                if (jz0Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    jz0Var.a();
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
                            org.telegram.messenger.g0.g3(((jz0) this.V.get(i27)).f36565e);
                        }
                        this.V.clear();
                        while (i15 < this.U.size()) {
                            ((jz0) this.U.get(i15)).a();
                            i15++;
                        }
                        this.U.clear();
                        org.telegram.messenger.g0.g3(new me(14));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f36926n, this.f36928s);
            while (i15 < this.V.size()) {
                org.telegram.messenger.g0.g3(((jz0) this.V.get(i15)).f36565e);
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
        this.f36926n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f36926n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f36927r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f36926n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f36929w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f36926n, this.f36927r, this.f36923c, null);
            this.f36928s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f36926n, eglCreateWindowSurface, eglCreateWindowSurface, this.f36929w)) {
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
                    this.f36930x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f36930x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f36930x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f36930x);
                    GLES20.glGetProgramiv(this.f36930x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f36930x));
                        i();
                        return;
                    }
                    this.f36931y = GLES20.glGetUniformLocation(this.f36930x, "matrix");
                    this.K = GLES20.glGetUniformLocation(this.f36930x, "rectSize");
                    this.M = GLES20.glGetUniformLocation(this.f36930x, "rectPos");
                    this.E = GLES20.glGetUniformLocation(this.f36930x, "reset");
                    this.F = GLES20.glGetUniformLocation(this.f36930x, "time");
                    this.G = GLES20.glGetUniformLocation(this.f36930x, "deltaTime");
                    this.H = GLES20.glGetUniformLocation(this.f36930x, "particlesCount");
                    this.I = GLES20.glGetUniformLocation(this.f36930x, "size");
                    this.J = GLES20.glGetUniformLocation(this.f36930x, "gridSize");
                    this.N = GLES20.glGetUniformLocation(this.f36930x, "tex");
                    this.L = GLES20.glGetUniformLocation(this.f36930x, "seed");
                    this.O = GLES20.glGetUniformLocation(this.f36930x, "dp");
                    this.P = GLES20.glGetUniformLocation(this.f36930x, "longevity");
                    this.Q = GLES20.glGetUniformLocation(this.f36930x, "offset");
                    this.R = GLES20.glGetUniformLocation(this.f36930x, "scale");
                    this.S = GLES20.glGetUniformLocation(this.f36930x, "uvOffset");
                    GLES20.glViewport(0, 0, this.f36924e, this.f36925f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f36930x);
                    GLES20.glUniform2f(this.I, this.f36924e, this.f36925f);
                    return;
                }
                org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f36922b.get()) {
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
                                    jz0 jz0Var = (jz0) arrayList.get(i10);
                                    if (jz0Var.f36562a.contains(view)) {
                                        jz0Var.a();
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
                            jz0 jz0Var2 = (jz0) arrayList.get(i10);
                            jz0Var2.f36567g += message.arg1;
                            jz0Var2.h += message.arg2;
                            i10++;
                        }
                        return;
                    }
                    a((jz0) message.obj);
                    return;
                }
                i();
                return;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.f36922b.get()) {
                this.f36924e = i11;
                this.f36925f = i12;
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
        AtomicBoolean atomicBoolean = this.f36922b;
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
            ((jz0) arrayList.get(i7)).a();
            i7++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f36923c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        mz0.b(this.d);
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
                    a((jz0) arrayList.get(i7));
                    i7++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i7 < arrayList.size()) {
                jz0 jz0Var = (jz0) arrayList.get(i7);
                Runnable runnable = jz0Var.f36565e;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                }
                jz0Var.a();
                i7++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.g3(new me(13));
            i();
        }
    }
}
