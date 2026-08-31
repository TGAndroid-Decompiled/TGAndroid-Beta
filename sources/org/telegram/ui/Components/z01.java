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
public final class z01 extends DispatchQueue {
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
    public int O;
    public volatile boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public final ArrayList T;
    public boolean f33677a;
    public final AtomicBoolean f33678b;
    public final SurfaceTexture f33679c;
    public w01 d;
    public int f33680e;
    public int f33681f;
    public EGL10 h;
    public EGLDisplay f33682n;
    public EGLConfig f33683r;
    public EGLSurface f33684s;
    public EGLContext v;
    public int f33685w;
    public int f33686x;
    public int f33687y;

    public z01(SurfaceTexture surfaceTexture, w01 w01Var, w01 w01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f33678b = new AtomicBoolean(true);
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = false;
        this.T = new ArrayList();
        this.f33679c = surfaceTexture;
        this.d = w01Var2;
        this.f33680e = i10;
        this.f33681f = i11;
        start();
    }

    public final void b(y01 y01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, y01Var.A, 0);
        GLES20.glBindTexture(3553, y01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, y01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        y01Var.C.recycle();
        y01Var.C = null;
        if (y01Var.D) {
            ArrayList arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((y01) obj).a();
            }
            this.Q.clear();
        }
        this.Q.add(y01Var);
        this.P = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f33678b.get()) {
            AndroidUtilities.runOnUIThread(new mh.l8(runnable, runnable2, 1));
            b11.b(this.d);
            this.d = null;
            return;
        }
        y01 y01Var = new y01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.P = true;
        postRunnable(new x01(this, y01Var, 1));
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (!this.f33678b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            w01 w01Var = this.d;
            if (w01Var != null) {
                AndroidUtilities.runOnUIThread(w01Var);
                this.d = null;
                return;
            }
            return;
        }
        y01 y01Var = new y01(this, view, f10, runnable);
        getHandler();
        this.P = true;
        postRunnable(new x01(this, y01Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f33678b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            w01 w01Var = this.d;
            if (w01Var != null) {
                AndroidUtilities.runOnUIThread(w01Var);
                this.d = null;
                return;
            }
            return;
        }
        y01 y01Var = new y01(this, arrayList, runnable);
        this.P = true;
        postRunnable(new x01(this, y01Var, 0));
    }

    public final void g() {
        long j10;
        double d;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        int clamp;
        int i12;
        int i13;
        int i14;
        if (this.f33678b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.Q.size()) {
                y01 y01Var = (y01) this.Q.get(i16);
                if (y01Var.d) {
                    ArrayList arrayList = this.Q;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((y01) arrayList.get(i18)).f33254u;
                    }
                    float f14 = y01Var.f33254u;
                    float f15 = f14 / i17;
                    int[] iArr = y01Var.B;
                    int i19 = y01Var.f33253t;
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
                    if (!y01Var.E.f33677a) {
                        i20 = i11;
                    }
                    if (y01Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    y01Var.f33252s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(clamp / f17));
                    y01Var.f33255w = round;
                    y01Var.v = Math.round(y01Var.f33252s / round);
                    while (true) {
                        i12 = y01Var.v;
                        i13 = y01Var.f33255w;
                        i14 = i12 * i13;
                        if (i14 >= y01Var.f33252s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            y01Var.v = i12 + 1;
                        } else {
                            y01Var.f33255w = i13 + 1;
                        }
                    }
                    y01Var.f33252s = i14;
                    y01Var.f33256x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, y01Var.f33252s * 28, null, 35048);
                    }
                    if (y01Var.f33239e != null) {
                        this.R.add(y01Var);
                    }
                }
                this.S = true;
                int[] iArr2 = y01Var.B;
                boolean z4 = y01Var.D;
                float f18 = y01Var.f33246m;
                int i22 = y01Var.f33254u;
                int i23 = y01Var.f33253t;
                Matrix matrix = y01Var.f33251r;
                z01 z01Var = y01Var.E;
                long nanoTime = System.nanoTime();
                if (y01Var.f33237b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                y01Var.f33237b = nanoTime;
                if (y01Var.f33247n && !y01Var.f33248o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(y01Var.f33242i, y01Var.f33243j);
                    y01Var.c();
                }
                y01Var.f33238c = (float) ((f18 * d) + y01Var.f33238c);
                GLES20.glUniformMatrix3fv(z01Var.f33686x, 1, false, y01Var.f33249p, 0);
                int i24 = z01Var.f33687y;
                if (y01Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(z01Var.B, y01Var.f33238c);
                GLES20.glUniform1f(z01Var.C, ((float) d) * f18);
                GLES20.glUniform1f(z01Var.D, y01Var.f33252s);
                GLES20.glUniform3f(z01Var.F, y01Var.v, y01Var.f33255w, y01Var.f33256x);
                GLES20.glUniform2f(z01Var.M, y01Var.f33241g, y01Var.h);
                int i25 = z01Var.N;
                if (z4) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = z01Var.O;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(z01Var.G, i23, i22);
                GLES20.glUniform1f(z01Var.H, y01Var.f33257y);
                GLES20.glUniform2f(z01Var.I, 0.0f, 0.0f);
                GLES20.glUniform1f(z01Var.K, y01Var.f33244k);
                GLES20.glUniform1f(z01Var.L, y01Var.f33245l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, y01Var.A[0]);
                GLES20.glUniform1i(z01Var.J, 0);
                GLES20.glBindBuffer(34962, iArr2[y01Var.f33258z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - y01Var.f33258z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, y01Var.f33252s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                y01Var.d = false;
                y01Var.f33258z = 1 - y01Var.f33258z;
                float f19 = y01Var.f33238c;
                float f20 = y01Var.f33245l;
                if (y01Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    y01Var.a();
                    this.Q.remove(i16);
                    this.P = !this.Q.isEmpty();
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        for (int i27 = 0; i27 < this.R.size(); i27++) {
                            AndroidUtilities.runOnUIThread(((y01) this.R.get(i27)).f33239e);
                        }
                        this.R.clear();
                        for (int i28 = 0; i28 < this.Q.size(); i28++) {
                            ((y01) this.Q.get(i28)).a();
                        }
                        this.Q.clear();
                        AndroidUtilities.runOnUIThread(new jc(15));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f33682n, this.f33684s);
            for (int i29 = 0; i29 < this.R.size(); i29++) {
                AndroidUtilities.runOnUIThread(((y01) this.R.get(i29)).f33239e);
            }
            this.R.clear();
            if (this.Q.isEmpty() && this.S) {
                j();
            }
        }
    }

    public final void h() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.f33682n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f33682n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f33683r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f33682n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f33682n, this.f33683r, this.f33679c, null);
            this.f33684s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f33682n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f33685w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f33685w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f33685w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f33685w);
                    GLES20.glGetProgramiv(this.f33685w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f33685w));
                        j();
                        return;
                    }
                    this.f33686x = GLES20.glGetUniformLocation(this.f33685w, "matrix");
                    this.G = GLES20.glGetUniformLocation(this.f33685w, "rectSize");
                    this.I = GLES20.glGetUniformLocation(this.f33685w, "rectPos");
                    this.f33687y = GLES20.glGetUniformLocation(this.f33685w, "reset");
                    this.B = GLES20.glGetUniformLocation(this.f33685w, "time");
                    this.C = GLES20.glGetUniformLocation(this.f33685w, "deltaTime");
                    this.D = GLES20.glGetUniformLocation(this.f33685w, "particlesCount");
                    this.E = GLES20.glGetUniformLocation(this.f33685w, "size");
                    this.F = GLES20.glGetUniformLocation(this.f33685w, "gridSize");
                    this.J = GLES20.glGetUniformLocation(this.f33685w, "tex");
                    this.H = GLES20.glGetUniformLocation(this.f33685w, "seed");
                    this.K = GLES20.glGetUniformLocation(this.f33685w, "dp");
                    this.L = GLES20.glGetUniformLocation(this.f33685w, "longevity");
                    this.M = GLES20.glGetUniformLocation(this.f33685w, "offset");
                    this.N = GLES20.glGetUniformLocation(this.f33685w, "scale");
                    this.O = GLES20.glGetUniformLocation(this.f33685w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f33680e, this.f33681f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f33685w);
                    GLES20.glUniform2f(this.E, this.f33680e, this.f33681f);
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
                        ArrayList arrayList = this.Q;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                View view = (View) message.obj;
                                while (i11 < arrayList.size()) {
                                    y01 y01Var = (y01) arrayList.get(i11);
                                    if (y01Var.f33236a.contains(view)) {
                                        y01Var.a();
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
                            y01 y01Var2 = (y01) arrayList.get(i11);
                            y01Var2.f33241g += message.arg1;
                            y01Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((y01) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f33678b.get()) {
                this.f33680e = i12;
                this.f33681f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.E, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f33678b.get()) {
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
        AtomicBoolean atomicBoolean = this.f33678b;
        if (!atomicBoolean.get()) {
            FileLog.d("ThanosEffect: killInternal failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.Q;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((y01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f33679c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        b11.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.T;
        int i10 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    b((y01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e6) {
            FileLog.e(e6);
            while (i10 < arrayList.size()) {
                y01 y01Var = (y01) arrayList.get(i10);
                Runnable runnable = y01Var.f33239e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                y01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new jc(14));
            j();
        }
    }
}
