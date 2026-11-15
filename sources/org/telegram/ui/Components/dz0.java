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
public final class dz0 extends org.telegram.messenger.q5 {
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
    public boolean f34109a;
    public final AtomicBoolean f34110b;
    public final SurfaceTexture f34111c;
    public az0 d;
    public int f34112e;
    public int f34113f;
    public EGL10 h;
    public EGLDisplay f34114n;
    public EGLConfig f34115r;
    public EGLSurface f34116s;
    public EGLContext f34117w;
    public int f34118x;
    public int f34119y;

    public dz0(SurfaceTexture surfaceTexture, az0 az0Var, az0 az0Var2, int i7, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f34110b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.f34111c = surfaceTexture;
        this.d = az0Var2;
        this.f34112e = i7;
        this.f34113f = i10;
        start();
    }

    public final void a(cz0 cz0Var) {
        int i7 = 0;
        GLES20.glGenTextures(1, cz0Var.A, 0);
        GLES20.glBindTexture(3553, cz0Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, cz0Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        cz0Var.C.recycle();
        cz0Var.C = null;
        if (cz0Var.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((cz0) obj).a();
            }
            this.U.clear();
        }
        this.U.add(cz0Var);
        this.T = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (!this.f34110b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
            }
            az0 az0Var = this.d;
            if (az0Var != null) {
                org.telegram.messenger.g0.h3(az0Var);
                this.d = null;
                return;
            }
            return;
        }
        cz0 cz0Var = new cz0(this, view, f10, runnable);
        getHandler();
        this.T = true;
        postRunnable(new bz0(this, cz0Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f34110b.get()) {
            org.telegram.messenger.g0.h3(new di.ca(runnable, runnable2, 1));
            fz0.b(this.d);
            this.d = null;
            return;
        }
        cz0 cz0Var = new cz0(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.T = true;
        postRunnable(new bz0(this, cz0Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f34110b.get()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
            }
            az0 az0Var = this.d;
            if (az0Var != null) {
                org.telegram.messenger.g0.h3(az0Var);
                this.d = null;
                return;
            }
            return;
        }
        cz0 cz0Var = new cz0(this, arrayList, runnable);
        this.T = true;
        postRunnable(new bz0(this, cz0Var, 0));
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
        if (this.f34110b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.U.size()) {
                cz0 cz0Var = (cz0) this.U.get(i16);
                if (cz0Var.d) {
                    ArrayList arrayList = this.U;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((cz0) arrayList.get(i18)).f33740u;
                    }
                    float f14 = cz0Var.f33740u;
                    float f15 = f14 / i17;
                    int[] iArr = cz0Var.B;
                    int i19 = cz0Var.f33739t;
                    int o4 = org.telegram.messenger.gz.o();
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
                    if (!cz0Var.E.f34109a) {
                        i20 = i11;
                    }
                    if (cz0Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    cz0Var.f33738s = Utilities.j((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(j10 / f17));
                    cz0Var.f33741w = round;
                    cz0Var.v = Math.round(cz0Var.f33738s / round);
                    while (true) {
                        i12 = cz0Var.v;
                        i13 = cz0Var.f33741w;
                        i14 = i12 * i13;
                        if (i14 >= cz0Var.f33738s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            cz0Var.v = i12 + 1;
                        } else {
                            cz0Var.f33741w = i13 + 1;
                        }
                    }
                    cz0Var.f33738s = i14;
                    cz0Var.f33742x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, cz0Var.f33738s * 28, null, 35048);
                    }
                    if (cz0Var.f33725e != null) {
                        this.V.add(cz0Var);
                    }
                }
                this.W = true;
                int[] iArr2 = cz0Var.B;
                boolean z10 = cz0Var.D;
                float f18 = cz0Var.f33732m;
                int i22 = cz0Var.f33740u;
                int i23 = cz0Var.f33739t;
                Matrix matrix = cz0Var.f33737r;
                dz0 dz0Var = cz0Var.E;
                long nanoTime = System.nanoTime();
                if (cz0Var.f33723b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                cz0Var.f33723b = nanoTime;
                if (cz0Var.f33733n && !cz0Var.f33734o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(cz0Var.f33728i, cz0Var.f33729j);
                    cz0Var.c();
                }
                cz0Var.f33724c = (float) ((f18 * d) + cz0Var.f33724c);
                GLES20.glUniformMatrix3fv(dz0Var.f34119y, 1, false, cz0Var.f33735p, 0);
                int i24 = dz0Var.E;
                if (cz0Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(dz0Var.F, cz0Var.f33724c);
                GLES20.glUniform1f(dz0Var.G, ((float) d) * f18);
                GLES20.glUniform1f(dz0Var.H, cz0Var.f33738s);
                GLES20.glUniform3f(dz0Var.J, cz0Var.v, cz0Var.f33741w, cz0Var.f33742x);
                GLES20.glUniform2f(dz0Var.Q, cz0Var.f33727g, cz0Var.h);
                int i25 = dz0Var.R;
                if (z10) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = dz0Var.S;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(dz0Var.K, i23, i22);
                GLES20.glUniform1f(dz0Var.L, cz0Var.f33743y);
                GLES20.glUniform2f(dz0Var.M, 0.0f, 0.0f);
                GLES20.glUniform1f(dz0Var.O, cz0Var.f33730k);
                GLES20.glUniform1f(dz0Var.P, cz0Var.f33731l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, cz0Var.A[0]);
                GLES20.glUniform1i(dz0Var.N, 0);
                GLES20.glBindBuffer(34962, iArr2[cz0Var.f33744z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - cz0Var.f33744z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, cz0Var.f33738s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                cz0Var.d = false;
                cz0Var.f33744z = 1 - cz0Var.f33744z;
                float f19 = cz0Var.f33724c;
                float f20 = cz0Var.f33731l;
                if (cz0Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    cz0Var.a();
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
                            org.telegram.messenger.g0.h3(((cz0) this.V.get(i27)).f33725e);
                        }
                        this.V.clear();
                        while (i15 < this.U.size()) {
                            ((cz0) this.U.get(i15)).a();
                            i15++;
                        }
                        this.U.clear();
                        org.telegram.messenger.g0.h3(new ih(12));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f34114n, this.f34116s);
            while (i15 < this.V.size()) {
                org.telegram.messenger.g0.h3(((cz0) this.V.get(i15)).f33725e);
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
        this.f34114n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f34114n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f34115r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f34114n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f34117w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f34114n, this.f34115r, this.f34111c, null);
            this.f34116s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f34114n, eglCreateWindowSurface, eglCreateWindowSurface, this.f34117w)) {
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
                    this.f34118x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f34118x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f34118x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f34118x);
                    GLES20.glGetProgramiv(this.f34118x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f34118x));
                        i();
                        return;
                    }
                    this.f34119y = GLES20.glGetUniformLocation(this.f34118x, "matrix");
                    this.K = GLES20.glGetUniformLocation(this.f34118x, "rectSize");
                    this.M = GLES20.glGetUniformLocation(this.f34118x, "rectPos");
                    this.E = GLES20.glGetUniformLocation(this.f34118x, "reset");
                    this.F = GLES20.glGetUniformLocation(this.f34118x, "time");
                    this.G = GLES20.glGetUniformLocation(this.f34118x, "deltaTime");
                    this.H = GLES20.glGetUniformLocation(this.f34118x, "particlesCount");
                    this.I = GLES20.glGetUniformLocation(this.f34118x, "size");
                    this.J = GLES20.glGetUniformLocation(this.f34118x, "gridSize");
                    this.N = GLES20.glGetUniformLocation(this.f34118x, "tex");
                    this.L = GLES20.glGetUniformLocation(this.f34118x, "seed");
                    this.O = GLES20.glGetUniformLocation(this.f34118x, "dp");
                    this.P = GLES20.glGetUniformLocation(this.f34118x, "longevity");
                    this.Q = GLES20.glGetUniformLocation(this.f34118x, "offset");
                    this.R = GLES20.glGetUniformLocation(this.f34118x, "scale");
                    this.S = GLES20.glGetUniformLocation(this.f34118x, "uvOffset");
                    GLES20.glViewport(0, 0, this.f34112e, this.f34113f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f34118x);
                    GLES20.glUniform2f(this.I, this.f34112e, this.f34113f);
                    return;
                }
                org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f34110b.get()) {
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
                                    cz0 cz0Var = (cz0) arrayList.get(i10);
                                    if (cz0Var.f33722a.contains(view)) {
                                        cz0Var.a();
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
                            cz0 cz0Var2 = (cz0) arrayList.get(i10);
                            cz0Var2.f33727g += message.arg1;
                            cz0Var2.h += message.arg2;
                            i10++;
                        }
                        return;
                    }
                    a((cz0) message.obj);
                    return;
                }
                i();
                return;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.f34110b.get()) {
                this.f34112e = i11;
                this.f34113f = i12;
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
        AtomicBoolean atomicBoolean = this.f34110b;
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
            ((cz0) arrayList.get(i7)).a();
            i7++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f34111c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        fz0.b(this.d);
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
                    a((cz0) arrayList.get(i7));
                    i7++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i7 < arrayList.size()) {
                cz0 cz0Var = (cz0) arrayList.get(i7);
                Runnable runnable = cz0Var.f33725e;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                }
                cz0Var.a();
                i7++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.h3(new ih(11));
            i();
        }
    }
}
