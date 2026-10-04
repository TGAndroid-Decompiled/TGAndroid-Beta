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
public final class t11 extends DispatchQueue {
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
    public boolean f30921a;
    public final AtomicBoolean f30922b;
    public final SurfaceTexture f30923c;
    public p11 d;
    public int f30924e;
    public int f30925f;
    public EGL10 h;
    public EGLDisplay f30926n;
    public EGLConfig f30927r;
    public EGLSurface f30928s;
    public EGLContext v;
    public int f30929w;
    public int f30930x;
    public int f30931y;

    public t11(SurfaceTexture surfaceTexture, p11 p11Var, p11 p11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f30922b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f30923c = surfaceTexture;
        this.d = p11Var2;
        this.f30924e = i10;
        this.f30925f = i11;
        start();
    }

    public final void b(s11 s11Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, s11Var.A, 0);
        GLES20.glBindTexture(3553, s11Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, s11Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        s11Var.C.recycle();
        s11Var.C = null;
        if (s11Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((s11) obj).a();
            }
            this.T.clear();
        }
        this.T.add(s11Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f30922b.get()) {
            AndroidUtilities.runOnUIThread(new r11(runnable, runnable2, 0));
            v11.b(this.d);
            this.d = null;
            return;
        }
        s11 s11Var = new s11(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new q11(this, s11Var, 1));
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (!this.f30922b.get()) {
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
        s11 s11Var = new s11(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new q11(this, s11Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f30922b.get()) {
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
        s11 s11Var = new s11(this, arrayList, runnable);
        this.S = true;
        postRunnable(new q11(this, s11Var, 0));
    }

    public final void g() {
        long j3;
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
        if (this.f30922b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                s11 s11Var = (s11) this.T.get(i16);
                if (s11Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((s11) arrayList.get(i18)).f30577u;
                    }
                    float f13 = s11Var.f30577u;
                    float f14 = f13 / i17;
                    int[] iArr = s11Var.B;
                    int i19 = s11Var.f30576t;
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
                    if (!s11Var.E.f30921a) {
                        i20 = i11;
                    }
                    if (s11Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    s11Var.f30575s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    s11Var.f30578w = round;
                    s11Var.v = Math.round(s11Var.f30575s / round);
                    while (true) {
                        i12 = s11Var.v;
                        i13 = s11Var.f30578w;
                        i14 = i12 * i13;
                        if (i14 >= s11Var.f30575s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            s11Var.v = i12 + 1;
                        } else {
                            s11Var.f30578w = i13 + 1;
                        }
                    }
                    s11Var.f30575s = i14;
                    s11Var.f30579x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, s11Var.f30575s * 28, null, 35048);
                    }
                    if (s11Var.f30562e != null) {
                        this.U.add(s11Var);
                    }
                }
                this.V = true;
                int[] iArr2 = s11Var.B;
                boolean z10 = s11Var.D;
                float f17 = s11Var.f30569m;
                int i22 = s11Var.f30577u;
                int i23 = s11Var.f30576t;
                Matrix matrix = s11Var.f30574r;
                t11 t11Var = s11Var.E;
                long nanoTime = System.nanoTime();
                if (s11Var.f30560b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                s11Var.f30560b = nanoTime;
                if (s11Var.f30570n && !s11Var.f30571o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(s11Var.f30565i, s11Var.f30566j);
                    s11Var.c();
                }
                s11Var.f30561c = (float) ((f17 * d) + s11Var.f30561c);
                GLES20.glUniformMatrix3fv(t11Var.f30930x, 1, false, s11Var.f30572p, 0);
                int i24 = t11Var.f30931y;
                if (s11Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i24, f7);
                GLES20.glUniform1f(t11Var.E, s11Var.f30561c);
                GLES20.glUniform1f(t11Var.F, ((float) d) * f17);
                GLES20.glUniform1f(t11Var.G, s11Var.f30575s);
                GLES20.glUniform3f(t11Var.I, s11Var.v, s11Var.f30578w, s11Var.f30579x);
                GLES20.glUniform2f(t11Var.P, s11Var.f30564g, s11Var.h);
                int i25 = t11Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = t11Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(t11Var.J, i23, i22);
                GLES20.glUniform1f(t11Var.K, s11Var.f30580y);
                GLES20.glUniform2f(t11Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(t11Var.N, s11Var.f30567k);
                GLES20.glUniform1f(t11Var.O, s11Var.f30568l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, s11Var.A[0]);
                GLES20.glUniform1i(t11Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[s11Var.f30581z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - s11Var.f30581z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, s11Var.f30575s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                s11Var.d = false;
                s11Var.f30581z = 1 - s11Var.f30581z;
                float f18 = s11Var.f30561c;
                float f19 = s11Var.f30568l;
                if (s11Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    s11Var.a();
                    this.T.remove(i16);
                    this.S = !this.T.isEmpty();
                    i16--;
                }
                i16++;
                i15 = 0;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    FileLog.e("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        for (int i27 = 0; i27 < this.U.size(); i27++) {
                            AndroidUtilities.runOnUIThread(((s11) this.U.get(i27)).f30562e);
                        }
                        this.U.clear();
                        for (int i28 = 0; i28 < this.T.size(); i28++) {
                            ((s11) this.T.get(i28)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new uh(12));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f30926n, this.f30928s);
            for (int i29 = 0; i29 < this.U.size(); i29++) {
                AndroidUtilities.runOnUIThread(((s11) this.U.get(i29)).f30562e);
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
        this.f30926n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f30926n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f30927r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f30926n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f30926n, this.f30927r, this.f30923c, null);
            this.f30928s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f30926n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f30929w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f30929w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f30929w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f30929w);
                    GLES20.glGetProgramiv(this.f30929w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f30929w));
                        j();
                        return;
                    }
                    this.f30930x = GLES20.glGetUniformLocation(this.f30929w, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f30929w, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f30929w, "rectPos");
                    this.f30931y = GLES20.glGetUniformLocation(this.f30929w, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f30929w, "time");
                    this.F = GLES20.glGetUniformLocation(this.f30929w, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f30929w, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f30929w, "size");
                    this.I = GLES20.glGetUniformLocation(this.f30929w, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f30929w, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f30929w, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f30929w, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f30929w, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f30929w, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f30929w, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f30929w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f30924e, this.f30925f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f30929w);
                    GLES20.glUniform2f(this.H, this.f30924e, this.f30925f);
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
                                    s11 s11Var = (s11) arrayList.get(i11);
                                    if (s11Var.f30559a.contains(view)) {
                                        s11Var.a();
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
                            s11 s11Var2 = (s11) arrayList.get(i11);
                            s11Var2.f30564g += message.arg1;
                            s11Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((s11) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f30922b.get()) {
                this.f30924e = i12;
                this.f30925f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f30922b.get()) {
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
        AtomicBoolean atomicBoolean = this.f30922b;
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
            ((s11) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f30923c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        v11.b(this.d);
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
                    b((s11) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e7) {
            FileLog.e(e7);
            while (i10 < arrayList.size()) {
                s11 s11Var = (s11) arrayList.get(i10);
                Runnable runnable = s11Var.f30562e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                s11Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new uh(11));
            j();
        }
    }
}
