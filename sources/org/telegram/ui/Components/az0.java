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
public final class az0 extends org.telegram.messenger.q5 {
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
    public boolean f32007a;
    public final AtomicBoolean f32008b;
    public final SurfaceTexture f32009c;
    public xy0 d;
    public int f32010e;
    public int f32011f;
    public EGL10 h;
    public EGLDisplay f32012n;
    public EGLConfig f32013r;
    public EGLSurface f32014s;
    public EGLContext f32015w;
    public int f32016x;
    public int f32017y;

    public az0(SurfaceTexture surfaceTexture, xy0 xy0Var, xy0 xy0Var2, int i3, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f32008b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.f32009c = surfaceTexture;
        this.d = xy0Var2;
        this.f32010e = i3;
        this.f32011f = i10;
        start();
    }

    public final void a(zy0 zy0Var) {
        int i3 = 0;
        GLES20.glGenTextures(1, zy0Var.A, 0);
        GLES20.glBindTexture(3553, zy0Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, zy0Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        zy0Var.C.recycle();
        zy0Var.C = null;
        if (zy0Var.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((zy0) obj).a();
            }
            this.U.clear();
        }
        this.U.add(zy0Var);
        this.T = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (!this.f32008b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
            }
            xy0 xy0Var = this.d;
            if (xy0Var != null) {
                org.telegram.messenger.g0.h3(xy0Var);
                this.d = null;
                return;
            }
            return;
        }
        zy0 zy0Var = new zy0(this, view, f10, runnable);
        getHandler();
        this.T = true;
        postRunnable(new yy0(this, zy0Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f32008b.get()) {
            org.telegram.messenger.g0.h3(new ci.ma(runnable, runnable2, 1));
            cz0.b(this.d);
            this.d = null;
            return;
        }
        zy0 zy0Var = new zy0(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.T = true;
        postRunnable(new yy0(this, zy0Var, 1));
    }

    public final void e(ArrayList arrayList, Runnable runnable) {
        if (!this.f32008b.get()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((View) arrayList.get(i3)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
            }
            xy0 xy0Var = this.d;
            if (xy0Var != null) {
                org.telegram.messenger.g0.h3(xy0Var);
                this.d = null;
                return;
            }
            return;
        }
        zy0 zy0Var = new zy0(this, arrayList, runnable);
        this.T = true;
        postRunnable(new yy0(this, zy0Var, 0));
    }

    public final void f() {
        long j10;
        double d;
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        int i10;
        int i11;
        int j11;
        int i12;
        int i13;
        int i14;
        if (this.f32008b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.U.size()) {
                zy0 zy0Var = (zy0) this.U.get(i16);
                if (zy0Var.d) {
                    ArrayList arrayList = this.U;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((zy0) arrayList.get(i18)).f41188u;
                    }
                    float f14 = zy0Var.f41188u;
                    float f15 = f14 / i17;
                    int[] iArr = zy0Var.B;
                    int i19 = zy0Var.f41187t;
                    int o10 = org.telegram.messenger.az.o();
                    int i20 = 120000;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i11 = 30000;
                        } else {
                            i11 = 120000;
                        }
                    } else {
                        i11 = 60000;
                    }
                    if (!zy0Var.E.f32007a) {
                        i20 = i11;
                    }
                    if (zy0Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    zy0Var.f41186s = Utilities.j((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(j11 / f17));
                    zy0Var.f41189w = round;
                    zy0Var.v = Math.round(zy0Var.f41186s / round);
                    while (true) {
                        i12 = zy0Var.v;
                        i13 = zy0Var.f41189w;
                        i14 = i12 * i13;
                        if (i14 >= zy0Var.f41186s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            zy0Var.v = i12 + 1;
                        } else {
                            zy0Var.f41189w = i13 + 1;
                        }
                    }
                    zy0Var.f41186s = i14;
                    zy0Var.f41190x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, zy0Var.f41186s * 28, null, 35048);
                    }
                    if (zy0Var.f41173e != null) {
                        this.V.add(zy0Var);
                    }
                }
                this.W = true;
                int[] iArr2 = zy0Var.B;
                boolean z10 = zy0Var.D;
                float f18 = zy0Var.f41180m;
                int i22 = zy0Var.f41188u;
                int i23 = zy0Var.f41187t;
                Matrix matrix = zy0Var.f41185r;
                az0 az0Var = zy0Var.E;
                long nanoTime = System.nanoTime();
                if (zy0Var.f41171b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                zy0Var.f41171b = nanoTime;
                if (zy0Var.f41181n && !zy0Var.f41182o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(zy0Var.f41176i, zy0Var.f41177j);
                    zy0Var.c();
                }
                zy0Var.f41172c = (float) ((f18 * d) + zy0Var.f41172c);
                GLES20.glUniformMatrix3fv(az0Var.f32017y, 1, false, zy0Var.f41183p, 0);
                int i24 = az0Var.E;
                if (zy0Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(az0Var.F, zy0Var.f41172c);
                GLES20.glUniform1f(az0Var.G, ((float) d) * f18);
                GLES20.glUniform1f(az0Var.H, zy0Var.f41186s);
                GLES20.glUniform3f(az0Var.J, zy0Var.v, zy0Var.f41189w, zy0Var.f41190x);
                GLES20.glUniform2f(az0Var.Q, zy0Var.f41175g, zy0Var.h);
                int i25 = az0Var.R;
                if (z10) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = az0Var.S;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(az0Var.K, i23, i22);
                GLES20.glUniform1f(az0Var.L, zy0Var.f41191y);
                GLES20.glUniform2f(az0Var.M, 0.0f, 0.0f);
                GLES20.glUniform1f(az0Var.O, zy0Var.f41178k);
                GLES20.glUniform1f(az0Var.P, zy0Var.f41179l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, zy0Var.A[0]);
                GLES20.glUniform1i(az0Var.N, 0);
                GLES20.glBindBuffer(34962, iArr2[zy0Var.f41192z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - zy0Var.f41192z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, zy0Var.f41186s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                zy0Var.d = false;
                zy0Var.f41192z = 1 - zy0Var.f41192z;
                float f19 = zy0Var.f41172c;
                float f20 = zy0Var.f41179l;
                if (zy0Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    zy0Var.a();
                    this.U.remove(i16);
                    i3 = 1;
                    this.T = !this.U.isEmpty();
                    i16--;
                } else {
                    i3 = 1;
                }
                i16 += i3;
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
                            org.telegram.messenger.g0.h3(((zy0) this.V.get(i27)).f41173e);
                        }
                        this.V.clear();
                        while (i15 < this.U.size()) {
                            ((zy0) this.U.get(i15)).a();
                            i15++;
                        }
                        this.U.clear();
                        org.telegram.messenger.g0.h3(new go(10));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f32012n, this.f32014s);
            while (i15 < this.V.size()) {
                org.telegram.messenger.g0.h3(((zy0) this.V.get(i15)).f41173e);
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
        this.f32012n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f32012n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f32013r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f32012n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f32015w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f32012n, this.f32013r, this.f32009c, null);
            this.f32014s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f32012n, eglCreateWindowSurface, eglCreateWindowSurface, this.f32015w)) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglMakeCurrent");
                i();
            } else {
                int glCreateShader = GLES20.glCreateShader(35633);
                int glCreateShader2 = GLES20.glCreateShader(35632);
                if (glCreateShader != 0 && glCreateShader2 != 0) {
                    GLES20.glShaderSource(glCreateShader, org.telegram.messenger.g0.y2(null, 2131624288));
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                        i();
                        return;
                    }
                    GLES20.glShaderSource(glCreateShader2, org.telegram.messenger.g0.y2(null, 2131624287));
                    GLES20.glCompileShader(glCreateShader2);
                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                        GLES20.glDeleteShader(glCreateShader2);
                        i();
                        return;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.f32016x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f32016x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f32016x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f32016x);
                    GLES20.glGetProgramiv(this.f32016x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f32016x));
                        i();
                        return;
                    }
                    this.f32017y = GLES20.glGetUniformLocation(this.f32016x, "matrix");
                    this.K = GLES20.glGetUniformLocation(this.f32016x, "rectSize");
                    this.M = GLES20.glGetUniformLocation(this.f32016x, "rectPos");
                    this.E = GLES20.glGetUniformLocation(this.f32016x, "reset");
                    this.F = GLES20.glGetUniformLocation(this.f32016x, "time");
                    this.G = GLES20.glGetUniformLocation(this.f32016x, "deltaTime");
                    this.H = GLES20.glGetUniformLocation(this.f32016x, "particlesCount");
                    this.I = GLES20.glGetUniformLocation(this.f32016x, "size");
                    this.J = GLES20.glGetUniformLocation(this.f32016x, "gridSize");
                    this.N = GLES20.glGetUniformLocation(this.f32016x, "tex");
                    this.L = GLES20.glGetUniformLocation(this.f32016x, "seed");
                    this.O = GLES20.glGetUniformLocation(this.f32016x, "dp");
                    this.P = GLES20.glGetUniformLocation(this.f32016x, "longevity");
                    this.Q = GLES20.glGetUniformLocation(this.f32016x, "offset");
                    this.R = GLES20.glGetUniformLocation(this.f32016x, "scale");
                    this.S = GLES20.glGetUniformLocation(this.f32016x, "uvOffset");
                    GLES20.glViewport(0, 0, this.f32010e, this.f32011f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f32016x);
                    GLES20.glUniform2f(this.I, this.f32010e, this.f32011f);
                    return;
                }
                org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f32008b.get()) {
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
        int i3 = message.what;
        if (i3 != 0) {
            int i10 = 0;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        ArrayList arrayList = this.U;
                        if (i3 != 4) {
                            if (i3 == 5) {
                                View view = (View) message.obj;
                                while (i10 < arrayList.size()) {
                                    zy0 zy0Var = (zy0) arrayList.get(i10);
                                    if (zy0Var.f41170a.contains(view)) {
                                        zy0Var.a();
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
                            zy0 zy0Var2 = (zy0) arrayList.get(i10);
                            zy0Var2.f41175g += message.arg1;
                            zy0Var2.h += message.arg2;
                            i10++;
                        }
                        return;
                    }
                    a((zy0) message.obj);
                    return;
                }
                i();
                return;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.f32008b.get()) {
                this.f32010e = i11;
                this.f32011f = i12;
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
        AtomicBoolean atomicBoolean = this.f32008b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: killInternal");
        int i3 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.U;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((zy0) arrayList.get(i3)).a();
            i3++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f32009c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        cz0.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.X;
        int i3 = 0;
        try {
            g();
            if (!arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    a((zy0) arrayList.get(i3));
                    i3++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i3 < arrayList.size()) {
                zy0 zy0Var = (zy0) arrayList.get(i3);
                Runnable runnable = zy0Var.f41173e;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                }
                zy0Var.a();
                i3++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.h3(new go(9));
            i();
        }
    }
}
