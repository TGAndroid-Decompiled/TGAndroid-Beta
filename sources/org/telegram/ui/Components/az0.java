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
    public boolean f31955a;
    public final AtomicBoolean f31956b;
    public final SurfaceTexture f31957c;
    public xy0 d;
    public int f31958e;
    public int f31959f;
    public EGL10 h;
    public EGLDisplay f31960n;
    public EGLConfig f31961r;
    public EGLSurface f31962s;
    public EGLContext f31963w;
    public int f31964x;
    public int f31965y;

    public az0(SurfaceTexture surfaceTexture, xy0 xy0Var, xy0 xy0Var2, int i7, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f31956b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f31957c = surfaceTexture;
        this.d = xy0Var2;
        this.f31958e = i7;
        this.f31959f = i10;
        start();
    }

    public final void a(zy0 zy0Var) {
        int i7 = 0;
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
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((zy0) obj).a();
            }
            this.T.clear();
        }
        this.T.add(zy0Var);
        this.S = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (!this.f31956b.get()) {
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
        this.S = true;
        postRunnable(new yy0(this, zy0Var, 2));
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f31956b.get()) {
            org.telegram.messenger.g0.h3(new bi.pb(runnable, runnable2, 1));
            cz0.b(this.d);
            this.d = null;
            return;
        }
        zy0 zy0Var = new zy0(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new yy0(this, zy0Var, 1));
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (!this.f31956b.get()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((View) arrayList.get(i7)).setVisibility(8);
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
        this.S = true;
        postRunnable(new yy0(this, zy0Var, 0));
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
        if (this.f31956b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                zy0 zy0Var = (zy0) this.T.get(i16);
                if (zy0Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((zy0) arrayList.get(i18)).f41155u;
                    }
                    float f14 = zy0Var.f41155u;
                    float f15 = f14 / i17;
                    int[] iArr = zy0Var.B;
                    int i19 = zy0Var.f41154t;
                    int o4 = org.telegram.messenger.iz.o();
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
                    if (!zy0Var.E.f31955a) {
                        i20 = i11;
                    }
                    if (zy0Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    zy0Var.f41153s = Utilities.j((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(j10 / f17));
                    zy0Var.f41156w = round;
                    zy0Var.v = Math.round(zy0Var.f41153s / round);
                    while (true) {
                        i12 = zy0Var.v;
                        i13 = zy0Var.f41156w;
                        i14 = i12 * i13;
                        if (i14 >= zy0Var.f41153s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            zy0Var.v = i12 + 1;
                        } else {
                            zy0Var.f41156w = i13 + 1;
                        }
                    }
                    zy0Var.f41153s = i14;
                    zy0Var.f41157x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, zy0Var.f41153s * 28, null, 35048);
                    }
                    if (zy0Var.f41140e != null) {
                        this.U.add(zy0Var);
                    }
                }
                this.V = true;
                int[] iArr2 = zy0Var.B;
                boolean z9 = zy0Var.D;
                float f18 = zy0Var.f41147m;
                int i22 = zy0Var.f41155u;
                int i23 = zy0Var.f41154t;
                Matrix matrix = zy0Var.f41152r;
                az0 az0Var = zy0Var.E;
                long nanoTime = System.nanoTime();
                if (zy0Var.f41138b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                zy0Var.f41138b = nanoTime;
                if (zy0Var.f41148n && !zy0Var.f41149o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(zy0Var.f41143i, zy0Var.f41144j);
                    zy0Var.c();
                }
                zy0Var.f41139c = (float) ((f18 * d) + zy0Var.f41139c);
                GLES20.glUniformMatrix3fv(az0Var.f31965y, 1, false, zy0Var.f41150p, 0);
                int i24 = az0Var.D;
                if (zy0Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(az0Var.E, zy0Var.f41139c);
                GLES20.glUniform1f(az0Var.F, ((float) d) * f18);
                GLES20.glUniform1f(az0Var.G, zy0Var.f41153s);
                GLES20.glUniform3f(az0Var.I, zy0Var.v, zy0Var.f41156w, zy0Var.f41157x);
                GLES20.glUniform2f(az0Var.P, zy0Var.f41142g, zy0Var.h);
                int i25 = az0Var.Q;
                if (z9) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = az0Var.R;
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(az0Var.J, i23, i22);
                GLES20.glUniform1f(az0Var.K, zy0Var.f41158y);
                GLES20.glUniform2f(az0Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(az0Var.N, zy0Var.f41145k);
                GLES20.glUniform1f(az0Var.O, zy0Var.f41146l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, zy0Var.A[0]);
                GLES20.glUniform1i(az0Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[zy0Var.f41159z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - zy0Var.f41159z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, zy0Var.f41153s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                zy0Var.d = false;
                zy0Var.f41159z = 1 - zy0Var.f41159z;
                float f19 = zy0Var.f41139c;
                float f20 = zy0Var.f41146l;
                if (zy0Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    zy0Var.a();
                    this.T.remove(i16);
                    i7 = 1;
                    this.S = !this.T.isEmpty();
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
                        for (int i27 = 0; i27 < this.U.size(); i27++) {
                            org.telegram.messenger.g0.h3(((zy0) this.U.get(i27)).f41140e);
                        }
                        this.U.clear();
                        while (i15 < this.T.size()) {
                            ((zy0) this.T.get(i15)).a();
                            i15++;
                        }
                        this.T.clear();
                        org.telegram.messenger.g0.h3(new l10(6));
                        i();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f31960n, this.f31962s);
            while (i15 < this.U.size()) {
                org.telegram.messenger.g0.h3(((zy0) this.U.get(i15)).f41140e);
                i15++;
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
        this.f31960n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f31960n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
                h();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f31961r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f31960n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.f31963w = eglCreateContext;
            if (eglCreateContext == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
                i();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f31960n, this.f31961r, this.f31957c, null);
            this.f31962s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
                i();
            } else if (!this.h.eglMakeCurrent(this.f31960n, eglCreateWindowSurface, eglCreateWindowSurface, this.f31963w)) {
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
                    this.f31964x = glCreateProgram;
                    if (glCreateProgram == 0) {
                        org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
                        i();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f31964x, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f31964x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f31964x);
                    GLES20.glGetProgramiv(this.f31964x, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f31964x));
                        i();
                        return;
                    }
                    this.f31965y = GLES20.glGetUniformLocation(this.f31964x, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f31964x, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f31964x, "rectPos");
                    this.D = GLES20.glGetUniformLocation(this.f31964x, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f31964x, "time");
                    this.F = GLES20.glGetUniformLocation(this.f31964x, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f31964x, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f31964x, "size");
                    this.I = GLES20.glGetUniformLocation(this.f31964x, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f31964x, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f31964x, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f31964x, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f31964x, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f31964x, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f31964x, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f31964x, "uvOffset");
                    GLES20.glViewport(0, 0, this.f31958e, this.f31959f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f31964x);
                    GLES20.glUniform2f(this.H, this.f31958e, this.f31959f);
                    return;
                }
                org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                i();
            }
        }
    }

    public final void h() {
        if (!this.f31956b.get()) {
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
                        ArrayList arrayList = this.T;
                        if (i7 != 4) {
                            if (i7 == 5) {
                                View view = (View) message.obj;
                                while (i10 < arrayList.size()) {
                                    zy0 zy0Var = (zy0) arrayList.get(i10);
                                    if (zy0Var.f41137a.contains(view)) {
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
                            zy0Var2.f41142g += message.arg1;
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
            if (this.f31956b.get()) {
                this.f31958e = i11;
                this.f31959f = i12;
                GLES20.glViewport(0, 0, i11, i12);
                GLES20.glUniform2f(this.H, i11, i12);
            }
            f();
            return;
        }
        f();
    }

    public final void i() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.f31956b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: killInternal");
        int i7 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.T;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((zy0) arrayList.get(i7)).a();
            i7++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f31957c;
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
        ArrayList arrayList = this.W;
        int i7 = 0;
        try {
            g();
            if (!arrayList.isEmpty()) {
                while (i7 < arrayList.size()) {
                    a((zy0) arrayList.get(i7));
                    i7++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i7 < arrayList.size()) {
                zy0 zy0Var = (zy0) arrayList.get(i7);
                Runnable runnable = zy0Var.f41140e;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                }
                zy0Var.a();
                i7++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.h3(new l10(5));
            i();
        }
    }
}
