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
public final class g01 extends org.telegram.messenger.s5 {
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
    public boolean f26267a;
    public final AtomicBoolean f26268b;
    public final SurfaceTexture f26269c;
    public c01 d;
    public int e;
    public int f26270f;
    public EGL10 h;
    public EGLDisplay f26271n;
    public EGLConfig f26272r;
    public EGLSurface f26273s;
    public EGLContext f26274w;
    public int f26275x;
    public int f26276y;

    public g01(SurfaceTexture surfaceTexture, c01 c01Var, c01 c01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f26268b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f26269c = surfaceTexture;
        this.d = c01Var2;
        this.e = i10;
        this.f26270f = i11;
        start();
    }

    public final void a(f01 f01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, f01Var.A, 0);
        GLES20.glBindTexture(3553, f01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, f01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        f01Var.C.recycle();
        f01Var.C = null;
        if (f01Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f01) obj).a();
            }
            this.T.clear();
        }
        this.T.add(f01Var);
        this.S = true;
    }

    public final void b(float f7, View view, Runnable runnable) {
        if (!this.f26268b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.i0.g3(runnable);
            }
            c01 c01Var = this.d;
            if (c01Var != null) {
                org.telegram.messenger.i0.g3(c01Var);
                this.d = null;
                return;
            }
            return;
        }
        f01 f01Var = new f01(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new d01(this, f01Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f26268b.get()) {
            org.telegram.messenger.i0.g3(new e01(runnable, runnable2, 0));
            i01.b(this.d);
            this.d = null;
            return;
        }
        f01 f01Var = new f01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new d01(this, f01Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f26268b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                org.telegram.messenger.i0.g3(runnable);
            }
            c01 c01Var = this.d;
            if (c01Var != null) {
                org.telegram.messenger.i0.g3(c01Var);
                this.d = null;
                return;
            }
            return;
        }
        f01 f01Var = new f01(this, arrayList, runnable);
        this.S = true;
        postRunnable(new d01(this, f01Var, 0));
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
        if (this.f26268b.get()) {
            GLES20.glClear(16384);
            int i16 = 0;
            int i17 = 0;
            while (i17 < this.T.size()) {
                f01 f01Var = (f01) this.T.get(i17);
                if (f01Var.d) {
                    ArrayList arrayList = this.T;
                    int i18 = 0;
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        i18 += ((f01) arrayList.get(i19)).f26013u;
                    }
                    float f13 = f01Var.f26013u;
                    float f14 = f13 / i18;
                    int[] iArr = f01Var.B;
                    int i20 = f01Var.f26012t;
                    int o10 = org.telegram.messenger.uz.o();
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
                    if (!f01Var.E.f26267a) {
                        i21 = i12;
                    }
                    if (f01Var.D) {
                        i21 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.i0.N(0.4f), 1.0f);
                    f01Var.f26011s = Utilities.j((int) ((i11 * i20) / (max * max)), (int) (i21 * f14), 10);
                    float f15 = i20;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(j11 / f16));
                    f01Var.f26014w = round;
                    f01Var.v = Math.round(f01Var.f26011s / round);
                    while (true) {
                        i13 = f01Var.v;
                        i14 = f01Var.f26014w;
                        i15 = i13 * i14;
                        if (i15 >= f01Var.f26011s) {
                            break;
                        } else if (i13 / i14 < f16) {
                            f01Var.v = i13 + 1;
                        } else {
                            f01Var.f26014w = i14 + 1;
                        }
                    }
                    f01Var.f26011s = i15;
                    f01Var.f26015x = Math.max(f15 / i13, f13 / i14);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i22 = 0; i22 < 2; i22++) {
                        GLES20.glBindBuffer(34962, iArr[i22]);
                        GLES20.glBufferData(34962, f01Var.f26011s * 28, null, 35048);
                    }
                    if (f01Var.e != null) {
                        this.U.add(f01Var);
                    }
                }
                this.V = true;
                int[] iArr2 = f01Var.B;
                boolean z10 = f01Var.D;
                float f17 = f01Var.f26005m;
                int i23 = f01Var.f26013u;
                int i24 = f01Var.f26012t;
                Matrix matrix = f01Var.f26010r;
                g01 g01Var = f01Var.E;
                long nanoTime = System.nanoTime();
                if (f01Var.f25997b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                f01Var.f25997b = nanoTime;
                if (f01Var.f26006n && !f01Var.f26007o) {
                    matrix.reset();
                    matrix.postScale(i24, i23);
                    matrix.postTranslate(f01Var.f26001i, f01Var.f26002j);
                    f01Var.c();
                }
                f01Var.f25998c = (float) ((f17 * d) + f01Var.f25998c);
                GLES20.glUniformMatrix3fv(g01Var.f26276y, 1, false, f01Var.f26008p, 0);
                int i25 = g01Var.D;
                if (f01Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i25, f7);
                GLES20.glUniform1f(g01Var.E, f01Var.f25998c);
                GLES20.glUniform1f(g01Var.F, ((float) d) * f17);
                GLES20.glUniform1f(g01Var.G, f01Var.f26011s);
                GLES20.glUniform3f(g01Var.I, f01Var.v, f01Var.f26014w, f01Var.f26015x);
                GLES20.glUniform2f(g01Var.P, f01Var.f26000g, f01Var.h);
                int i26 = g01Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i26, f10);
                int i27 = g01Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i27, f11);
                GLES20.glUniform2f(g01Var.J, i24, i23);
                GLES20.glUniform1f(g01Var.K, f01Var.f26016y);
                GLES20.glUniform2f(g01Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(g01Var.N, f01Var.f26003k);
                GLES20.glUniform1f(g01Var.O, f01Var.f26004l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, f01Var.A[0]);
                GLES20.glUniform1i(g01Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[f01Var.f26017z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - f01Var.f26017z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, f01Var.f26011s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                f01Var.d = false;
                f01Var.f26017z = 1 - f01Var.f26017z;
                float f18 = f01Var.f25998c;
                float f19 = f01Var.f26004l;
                if (f01Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    f01Var.a();
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
                            org.telegram.messenger.i0.g3(((f01) this.U.get(i28)).e);
                        }
                        this.U.clear();
                        while (i16 < this.T.size()) {
                            ((f01) this.T.get(i16)).a();
                            i16++;
                        }
                        this.T.clear();
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.sz(27));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f26271n, this.f26273s);
            while (i16 < this.U.size()) {
                org.telegram.messenger.i0.g3(((f01) this.U.get(i16)).e);
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
        this.f26271n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.f8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.f8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f26271n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.f8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f26272r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f26271n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f26274w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.f8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f26271n, this.f26272r, this.f26269c, null);
            this.f26273s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.f8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f26271n, eglCreateWindowSurface, eglCreateWindowSurface, this.f26274w)) {
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
                    this.f26275x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.f8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f26275x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f26275x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f26275x);
                    GLES20.glGetProgramiv(this.f26275x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.f8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f26275x));
                        i();
                        return;
                    }
                    this.f26276y = GLES20.glGetUniformLocation(this.f26275x, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f26275x, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f26275x, "rectPos");
                    this.D = GLES20.glGetUniformLocation(this.f26275x, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f26275x, "time");
                    this.F = GLES20.glGetUniformLocation(this.f26275x, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f26275x, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f26275x, "size");
                    this.I = GLES20.glGetUniformLocation(this.f26275x, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f26275x, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f26275x, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f26275x, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f26275x, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f26275x, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f26275x, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f26275x, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f26270f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f26275x);
                    GLES20.glUniform2f(this.H, this.e, this.f26270f);
                    return;
                }
                org.telegram.messenger.f8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f26268b.get()) {
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
                                    f01 f01Var = (f01) arrayList.get(i11);
                                    if (f01Var.f25996a.contains(view)) {
                                        f01Var.a();
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
                            f01 f01Var2 = (f01) arrayList.get(i11);
                            f01Var2.f26000g += message.arg1;
                            f01Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    a((f01) message.obj);
                    return;
                }
                i();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f26268b.get()) {
                this.e = i12;
                this.f26270f = i13;
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
        AtomicBoolean atomicBoolean = this.f26268b;
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
            ((f01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f26269c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        i01.b(this.d);
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
                    a((f01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            while (i10 < arrayList.size()) {
                f01 f01Var = (f01) arrayList.get(i10);
                Runnable runnable = f01Var.e;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                }
                f01Var.a();
                i10++;
            }
            arrayList.clear();
            org.telegram.messenger.i0.g3(new org.telegram.messenger.sz(26));
            i();
        }
    }
}
