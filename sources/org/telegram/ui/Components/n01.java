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
public final class n01 extends DispatchQueue {
    public int A;
    public int B;
    public int C;
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
    public volatile boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public boolean R;
    public final ArrayList S;
    public boolean f30800a;
    public final AtomicBoolean f30801b;
    public final SurfaceTexture f30802c;
    public k01 d;
    public int f30803e;
    public int f30804f;
    public EGL10 h;
    public EGLDisplay f30805n;
    public EGLConfig f30806r;
    public EGLSurface f30807s;
    public EGLContext v;
    public int f30808w;
    public int f30809x;
    public int f30810y;

    public n01(SurfaceTexture surfaceTexture, k01 k01Var, k01 k01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f30801b = new AtomicBoolean(true);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = false;
        this.S = new ArrayList();
        this.f30802c = surfaceTexture;
        this.d = k01Var2;
        this.f30803e = i10;
        this.f30804f = i11;
        start();
    }

    public final void b(m01 m01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, m01Var.A, 0);
        GLES20.glBindTexture(3553, m01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, m01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        m01Var.C.recycle();
        m01Var.C = null;
        if (m01Var.D) {
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((m01) obj).a();
            }
            this.P.clear();
        }
        this.P.add(m01Var);
        this.O = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f30801b.get()) {
            AndroidUtilities.runOnUIThread(new jh.k8(runnable, runnable2, 1));
            p01.b(this.d);
            this.d = null;
            return;
        }
        m01 m01Var = new m01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.O = true;
        postRunnable(new l01(this, m01Var, 1));
    }

    public final void e(View view, float f9, Runnable runnable) {
        if (!this.f30801b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            k01 k01Var = this.d;
            if (k01Var != null) {
                AndroidUtilities.runOnUIThread(k01Var);
                this.d = null;
                return;
            }
            return;
        }
        m01 m01Var = new m01(this, view, f9, runnable);
        getHandler();
        this.O = true;
        postRunnable(new l01(this, m01Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f30801b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            k01 k01Var = this.d;
            if (k01Var != null) {
                AndroidUtilities.runOnUIThread(k01Var);
                this.d = null;
                return;
            }
            return;
        }
        m01 m01Var = new m01(this, arrayList, runnable);
        this.O = true;
        postRunnable(new l01(this, m01Var, 0));
    }

    public final void g() {
        long j10;
        double d;
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        int clamp;
        int i12;
        int i13;
        int i14;
        if (this.f30801b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.P.size()) {
                m01 m01Var = (m01) this.P.get(i16);
                if (m01Var.d) {
                    ArrayList arrayList = this.P;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((m01) arrayList.get(i18)).f30516u;
                    }
                    float f13 = m01Var.f30516u;
                    float f14 = f13 / i17;
                    int[] iArr = m01Var.B;
                    int i19 = m01Var.f30515t;
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
                    if (!m01Var.E.f30800a) {
                        i20 = i11;
                    }
                    if (m01Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    m01Var.f30514s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    m01Var.f30517w = round;
                    m01Var.v = Math.round(m01Var.f30514s / round);
                    while (true) {
                        i12 = m01Var.v;
                        i13 = m01Var.f30517w;
                        i14 = i12 * i13;
                        if (i14 >= m01Var.f30514s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            m01Var.v = i12 + 1;
                        } else {
                            m01Var.f30517w = i13 + 1;
                        }
                    }
                    m01Var.f30514s = i14;
                    m01Var.f30518x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, m01Var.f30514s * 28, null, 35048);
                    }
                    if (m01Var.f30501e != null) {
                        this.Q.add(m01Var);
                    }
                }
                this.R = true;
                int[] iArr2 = m01Var.B;
                boolean z10 = m01Var.D;
                float f17 = m01Var.f30508m;
                int i22 = m01Var.f30516u;
                int i23 = m01Var.f30515t;
                Matrix matrix = m01Var.f30513r;
                n01 n01Var = m01Var.E;
                long nanoTime = System.nanoTime();
                if (m01Var.f30499b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                m01Var.f30499b = nanoTime;
                if (m01Var.f30509n && !m01Var.f30510o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(m01Var.f30504i, m01Var.f30505j);
                    m01Var.c();
                }
                m01Var.f30500c = (float) ((f17 * d) + m01Var.f30500c);
                GLES20.glUniformMatrix3fv(n01Var.f30809x, 1, false, m01Var.f30511p, 0);
                int i24 = n01Var.f30810y;
                if (m01Var.d) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                GLES20.glUniform1f(i24, f9);
                GLES20.glUniform1f(n01Var.A, m01Var.f30500c);
                GLES20.glUniform1f(n01Var.B, ((float) d) * f17);
                GLES20.glUniform1f(n01Var.C, m01Var.f30514s);
                GLES20.glUniform3f(n01Var.E, m01Var.v, m01Var.f30517w, m01Var.f30518x);
                GLES20.glUniform2f(n01Var.L, m01Var.f30503g, m01Var.h);
                int i25 = n01Var.M;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = n01Var.N;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(n01Var.F, i23, i22);
                GLES20.glUniform1f(n01Var.G, m01Var.f30519y);
                GLES20.glUniform2f(n01Var.H, 0.0f, 0.0f);
                GLES20.glUniform1f(n01Var.J, m01Var.f30506k);
                GLES20.glUniform1f(n01Var.K, m01Var.f30507l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, m01Var.A[0]);
                GLES20.glUniform1i(n01Var.I, 0);
                GLES20.glBindBuffer(34962, iArr2[m01Var.f30520z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - m01Var.f30520z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, m01Var.f30514s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                m01Var.d = false;
                m01Var.f30520z = 1 - m01Var.f30520z;
                float f18 = m01Var.f30500c;
                float f19 = m01Var.f30507l;
                if (m01Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    m01Var.a();
                    this.P.remove(i16);
                    this.O = !this.P.isEmpty();
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        for (int i27 = 0; i27 < this.Q.size(); i27++) {
                            AndroidUtilities.runOnUIThread(((m01) this.Q.get(i27)).f30501e);
                        }
                        this.Q.clear();
                        for (int i28 = 0; i28 < this.P.size(); i28++) {
                            ((m01) this.P.get(i28)).a();
                        }
                        this.P.clear();
                        AndroidUtilities.runOnUIThread(new g5(17));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f30805n, this.f30807s);
            for (int i29 = 0; i29 < this.Q.size(); i29++) {
                AndroidUtilities.runOnUIThread(((m01) this.Q.get(i29)).f30501e);
            }
            this.Q.clear();
            if (this.P.isEmpty() && this.R) {
                j();
            }
        }
    }

    public final void h() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f30805n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f30805n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f30806r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f30805n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f30805n, this.f30806r, this.f30802c, null);
            this.f30807s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f30805n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f30808w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f30808w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f30808w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f30808w);
                    GLES20.glGetProgramiv(this.f30808w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f30808w));
                        j();
                        return;
                    }
                    this.f30809x = GLES20.glGetUniformLocation(this.f30808w, "matrix");
                    this.F = GLES20.glGetUniformLocation(this.f30808w, "rectSize");
                    this.H = GLES20.glGetUniformLocation(this.f30808w, "rectPos");
                    this.f30810y = GLES20.glGetUniformLocation(this.f30808w, "reset");
                    this.A = GLES20.glGetUniformLocation(this.f30808w, "time");
                    this.B = GLES20.glGetUniformLocation(this.f30808w, "deltaTime");
                    this.C = GLES20.glGetUniformLocation(this.f30808w, "particlesCount");
                    this.D = GLES20.glGetUniformLocation(this.f30808w, "size");
                    this.E = GLES20.glGetUniformLocation(this.f30808w, "gridSize");
                    this.I = GLES20.glGetUniformLocation(this.f30808w, "tex");
                    this.G = GLES20.glGetUniformLocation(this.f30808w, "seed");
                    this.J = GLES20.glGetUniformLocation(this.f30808w, "dp");
                    this.K = GLES20.glGetUniformLocation(this.f30808w, "longevity");
                    this.L = GLES20.glGetUniformLocation(this.f30808w, "offset");
                    this.M = GLES20.glGetUniformLocation(this.f30808w, "scale");
                    this.N = GLES20.glGetUniformLocation(this.f30808w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f30803e, this.f30804f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f30808w);
                    GLES20.glUniform2f(this.D, this.f30803e, this.f30804f);
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
                        ArrayList arrayList = this.P;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                View view = (View) message.obj;
                                while (i11 < arrayList.size()) {
                                    m01 m01Var = (m01) arrayList.get(i11);
                                    if (m01Var.f30498a.contains(view)) {
                                        m01Var.a();
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
                            m01 m01Var2 = (m01) arrayList.get(i11);
                            m01Var2.f30503g += message.arg1;
                            m01Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((m01) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f30801b.get()) {
                this.f30803e = i12;
                this.f30804f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.D, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f30801b.get()) {
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
        AtomicBoolean atomicBoolean = this.f30801b;
        if (!atomicBoolean.get()) {
            FileLog.d("ThanosEffect: killInternal failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.P;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f30802c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        p01.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.S;
        int i10 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    b((m01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            FileLog.e(e10);
            while (i10 < arrayList.size()) {
                m01 m01Var = (m01) arrayList.get(i10);
                Runnable runnable = m01Var.f30501e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                m01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new g5(16));
            j();
        }
    }
}
