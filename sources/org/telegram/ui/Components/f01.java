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
public final class f01 extends org.telegram.messenger.s5 {
    public int D;
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
    public boolean f25915a;
    public final AtomicBoolean f25916b;
    public final SurfaceTexture f25917c;
    public b01 d;
    public int e;
    public int f25918f;
    public EGL10 h;
    public EGLDisplay f25919n;
    public EGLConfig f25920r;
    public EGLSurface f25921s;
    public EGLContext f25922w;
    public int f25923x;
    public int f25924y;

    public f01(SurfaceTexture surfaceTexture, b01 b01Var, b01 b01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f25916b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f25917c = surfaceTexture;
        this.d = b01Var2;
        this.e = i10;
        this.f25918f = i11;
        start();
    }

    public final void a(e01 e01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, e01Var.A, 0);
        GLES20.glBindTexture(3553, e01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, e01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        e01Var.C.recycle();
        e01Var.C = null;
        if (e01Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((e01) obj).a();
            }
            this.T.clear();
        }
        this.T.add(e01Var);
        this.S = true;
    }

    public final void b(float f7, View view, Runnable runnable) {
        if (!this.f25916b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.i0.g3(runnable);
            }
            b01 b01Var = this.d;
            if (b01Var != null) {
                org.telegram.messenger.i0.g3(b01Var);
                this.d = null;
                return;
            }
            return;
        }
        e01 e01Var = new e01(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new c01(this, e01Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f25916b.get()) {
            org.telegram.messenger.i0.g3(new d01(runnable, runnable2, 0));
            h01.b(this.d);
            this.d = null;
            return;
        }
        e01 e01Var = new e01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new c01(this, e01Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f25916b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.i0.g3(runnable);
            }
            b01 b01Var = this.d;
            if (b01Var != null) {
                org.telegram.messenger.i0.g3(b01Var);
                this.d = null;
                return;
            }
            return;
        }
        e01 e01Var = new e01(this, arrayList, runnable);
        this.S = true;
        postRunnable(new c01(this, e01Var, 0));
    }

    public final void f() {
        long j10;
        double d;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        int i12;
        int j11;
        int i13;
        int i14;
        int i15;
        if (this.f25916b.get()) {
            GLES20.glClear(16384);
            int i16 = 0;
            int i17 = 0;
            while (i17 < this.T.size()) {
                e01 e01Var = (e01) this.T.get(i17);
                if (e01Var.d) {
                    ArrayList arrayList = this.T;
                    int i18 = 0;
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        i18 += ((e01) arrayList.get(i19)).f25600u;
                    }
                    float f13 = e01Var.f25600u;
                    float f14 = f13 / i18;
                    int[] iArr = e01Var.B;
                    int i20 = e01Var.f25599t;
                    int o10 = org.telegram.messenger.tz.o();
                    int i21 = 120000;
                    if (o10 != 1) {
                        if (o10 != 2) {
                            i12 = 30000;
                        } else {
                            i12 = 120000;
                        }
                    } else {
                        i12 = 60000;
                    }
                    if (!e01Var.E.f25915a) {
                        i21 = i12;
                    }
                    if (e01Var.D) {
                        i21 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.i0.N(0.4f), 1.0f);
                    e01Var.f25598s = Utilities.j((int) ((i11 * i20) / (max * max)), (int) (i21 * f14), 10);
                    float f15 = i20;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(j11 / f16));
                    e01Var.f25601w = round;
                    e01Var.v = Math.round(e01Var.f25598s / round);
                    while (true) {
                        i13 = e01Var.v;
                        i14 = e01Var.f25601w;
                        i15 = i13 * i14;
                        if (i15 >= e01Var.f25598s) {
                            break;
                        } else if (i13 / i14 < f16) {
                            e01Var.v = i13 + 1;
                        } else {
                            e01Var.f25601w = i14 + 1;
                        }
                    }
                    e01Var.f25598s = i15;
                    e01Var.f25602x = Math.max(f15 / i13, f13 / i14);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i22 = 0; i22 < 2; i22++) {
                        GLES20.glBindBuffer(34962, iArr[i22]);
                        GLES20.glBufferData(34962, e01Var.f25598s * 28, null, 35048);
                    }
                    if (e01Var.e != null) {
                        this.U.add(e01Var);
                    }
                }
                this.V = true;
                int[] iArr2 = e01Var.B;
                boolean z10 = e01Var.D;
                float f17 = e01Var.f25592m;
                int i23 = e01Var.f25600u;
                int i24 = e01Var.f25599t;
                Matrix matrix = e01Var.f25597r;
                f01 f01Var = e01Var.E;
                long nanoTime = System.nanoTime();
                if (e01Var.f25584b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                e01Var.f25584b = nanoTime;
                if (e01Var.f25593n && !e01Var.f25594o) {
                    matrix.reset();
                    matrix.postScale(i24, i23);
                    matrix.postTranslate(e01Var.f25588i, e01Var.f25589j);
                    e01Var.c();
                }
                e01Var.f25585c = (float) ((f17 * d) + e01Var.f25585c);
                GLES20.glUniformMatrix3fv(f01Var.f25924y, 1, false, e01Var.f25595p, 0);
                int i25 = f01Var.D;
                if (e01Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i25, f7);
                GLES20.glUniform1f(f01Var.E, e01Var.f25585c);
                GLES20.glUniform1f(f01Var.F, ((float) d) * f17);
                GLES20.glUniform1f(f01Var.G, e01Var.f25598s);
                GLES20.glUniform3f(f01Var.I, e01Var.v, e01Var.f25601w, e01Var.f25602x);
                GLES20.glUniform2f(f01Var.P, e01Var.f25587g, e01Var.h);
                int i26 = f01Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i26, f10);
                int i27 = f01Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i27, f11);
                GLES20.glUniform2f(f01Var.J, i24, i23);
                GLES20.glUniform1f(f01Var.K, e01Var.f25603y);
                GLES20.glUniform2f(f01Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(f01Var.N, e01Var.f25590k);
                GLES20.glUniform1f(f01Var.O, e01Var.f25591l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, e01Var.A[0]);
                GLES20.glUniform1i(f01Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[e01Var.f25604z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - e01Var.f25604z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, e01Var.f25598s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                e01Var.d = false;
                e01Var.f25604z = 1 - e01Var.f25604z;
                float f18 = e01Var.f25585c;
                float f19 = e01Var.f25591l;
                if (e01Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    e01Var.a();
                    this.T.remove(i17);
                    i10 = 1;
                    this.S = !this.T.isEmpty();
                    i17--;
                } else {
                    i10 = 1;
                }
                i17 += i10;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    org.telegram.messenger.f8.d("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        for (int i28 = 0; i28 < this.U.size(); i28++) {
                            org.telegram.messenger.i0.g3(((e01) this.U.get(i28)).e);
                        }
                        this.U.clear();
                        while (i16 < this.T.size()) {
                            ((e01) this.T.get(i16)).a();
                            i16++;
                        }
                        this.T.clear();
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(27));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f25919n, this.f25921s);
            while (i16 < this.U.size()) {
                org.telegram.messenger.i0.g3(((e01) this.U.get(i16)).e);
                i16++;
            }
            this.U.clear();
            if (this.T.isEmpty() && this.V) {
                i();
            }
        }
    }

    public final void g() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f25919n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.f8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.f8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f25919n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.f8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f25920r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f25919n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f25922w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.f8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f25919n, this.f25920r, this.f25917c, null);
            this.f25921s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.f8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f25919n, eglCreateWindowSurface, eglCreateWindowSurface, this.f25922w)) {
                org.telegram.messenger.f8.d("ThanosEffect: failed eglMakeCurrent");
                i();
            } else {
                int glCreateShader = GLES20.glCreateShader(35633);
                int glCreateShader2 = GLES20.glCreateShader(35632);
                if (glCreateShader != 0 && glCreateShader2 != 0) {
                    GLES20.glShaderSource(glCreateShader, org.telegram.messenger.i0.y2(null, 2131624286));
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = new int[1];
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.f8.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                        i();
                        return;
                    }
                    GLES20.glShaderSource(glCreateShader2, org.telegram.messenger.i0.y2(null, 2131624285));
                    GLES20.glCompileShader(glCreateShader2);
                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.f8.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                        GLES20.glDeleteShader(glCreateShader2);
                        i();
                        return;
                    }
                    int glCreateProgram = GLES20.glCreateProgram();
                    this.f25923x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.f8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f25923x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f25923x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f25923x);
                    GLES20.glGetProgramiv(this.f25923x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.f8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f25923x));
                        i();
                        return;
                    }
                    this.f25924y = GLES20.glGetUniformLocation(this.f25923x, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f25923x, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f25923x, "rectPos");
                    this.D = GLES20.glGetUniformLocation(this.f25923x, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f25923x, "time");
                    this.F = GLES20.glGetUniformLocation(this.f25923x, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f25923x, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f25923x, "size");
                    this.I = GLES20.glGetUniformLocation(this.f25923x, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f25923x, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f25923x, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f25923x, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f25923x, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f25923x, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f25923x, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f25923x, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f25918f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f25923x);
                    GLES20.glUniform2f(this.H, this.e, this.f25918f);
                    return;
                }
                org.telegram.messenger.f8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f25916b.get()) {
            org.telegram.messenger.f8.b("ThanosEffect: kill failed, already dead");
            return;
        }
        org.telegram.messenger.f8.b("ThanosEffect: kill");
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
                                    e01 e01Var = (e01) arrayList.get(i11);
                                    if (e01Var.f25583a.contains(view)) {
                                        e01Var.a();
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
                            e01 e01Var2 = (e01) arrayList.get(i11);
                            e01Var2.f25587g += message.arg1;
                            e01Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    a((e01) message.obj);
                    return;
                }
                i();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f25916b.get()) {
                this.e = i12;
                this.f25918f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            f();
            return;
        }
        f();
    }

    public final void i() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.f25916b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.f8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.f8.b("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.T;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((e01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f25917c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        h01.b(this.d);
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
            g();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    a((e01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            while (i10 < arrayList.size()) {
                e01 e01Var = (e01) arrayList.get(i10);
                Runnable runnable = e01Var.e;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                }
                e01Var.a();
                i10++;
            }
            arrayList.clear();
            org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(26));
            i();
        }
    }
}
