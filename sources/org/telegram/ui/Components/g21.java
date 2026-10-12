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
public final class g21 extends DispatchQueue {
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
    public boolean f26229a;
    public final AtomicBoolean f26230b;
    public final SurfaceTexture f26231c;
    public c21 d;
    public int f26232e;
    public int f26233f;
    public EGL10 h;
    public EGLDisplay f26234n;
    public EGLConfig f26235r;
    public EGLSurface f26236s;
    public EGLContext v;
    public int f26237w;
    public int f26238x;
    public int f26239y;

    public g21(SurfaceTexture surfaceTexture, c21 c21Var, c21 c21Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f26230b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f26231c = surfaceTexture;
        this.d = c21Var2;
        this.f26232e = i10;
        this.f26233f = i11;
        start();
    }

    public final void b(f21 f21Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, f21Var.A, 0);
        GLES20.glBindTexture(3553, f21Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, f21Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        f21Var.C.recycle();
        f21Var.C = null;
        if (f21Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f21) obj).a();
            }
            this.T.clear();
        }
        this.T.add(f21Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f26230b.get()) {
            AndroidUtilities.runOnUIThread(new e21(runnable, runnable2, 0));
            i21.b(this.d);
            this.d = null;
            return;
        }
        f21 f21Var = new f21(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new d21(this, f21Var, 1));
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (!this.f26230b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            c21 c21Var = this.d;
            if (c21Var != null) {
                AndroidUtilities.runOnUIThread(c21Var);
                this.d = null;
                return;
            }
            return;
        }
        f21 f21Var = new f21(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new d21(this, f21Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f26230b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            c21 c21Var = this.d;
            if (c21Var != null) {
                AndroidUtilities.runOnUIThread(c21Var);
                this.d = null;
                return;
            }
            return;
        }
        f21 f21Var = new f21(this, arrayList, runnable);
        this.S = true;
        postRunnable(new d21(this, f21Var, 0));
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
        if (this.f26230b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                f21 f21Var = (f21) this.T.get(i16);
                if (f21Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = i15;
                    int i18 = i17;
                    while (i17 < arrayList.size()) {
                        i18 += ((f21) arrayList.get(i17)).f25866u;
                        i17++;
                    }
                    float f13 = f21Var.f25866u;
                    float f14 = f13 / i18;
                    int[] iArr = f21Var.B;
                    int i19 = f21Var.f25865t;
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
                    if (!f21Var.E.f26229a) {
                        i20 = i11;
                    }
                    if (f21Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    f21Var.f25864s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    f21Var.f25867w = round;
                    f21Var.v = Math.round(f21Var.f25864s / round);
                    while (true) {
                        i12 = f21Var.v;
                        i13 = f21Var.f25867w;
                        i14 = i12 * i13;
                        if (i14 >= f21Var.f25864s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            f21Var.v = i12 + 1;
                        } else {
                            f21Var.f25867w = i13 + 1;
                        }
                    }
                    f21Var.f25864s = i14;
                    f21Var.f25868x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = i15; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, f21Var.f25864s * 28, null, 35048);
                    }
                    if (f21Var.f25851e != null) {
                        this.U.add(f21Var);
                    }
                }
                this.V = true;
                int[] iArr2 = f21Var.B;
                boolean z10 = f21Var.D;
                float f17 = f21Var.f25858m;
                int i22 = f21Var.f25866u;
                int i23 = f21Var.f25865t;
                Matrix matrix = f21Var.f25863r;
                g21 g21Var = f21Var.E;
                long nanoTime = System.nanoTime();
                if (f21Var.f25849b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                f21Var.f25849b = nanoTime;
                if (f21Var.f25859n && !f21Var.f25860o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(f21Var.f25854i, f21Var.f25855j);
                    f21Var.c();
                }
                f21Var.f25850c = (float) ((f17 * d) + f21Var.f25850c);
                GLES20.glUniformMatrix3fv(g21Var.f26238x, 1, false, f21Var.f25861p, 0);
                int i24 = g21Var.f26239y;
                if (f21Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i24, f7);
                GLES20.glUniform1f(g21Var.E, f21Var.f25850c);
                GLES20.glUniform1f(g21Var.F, ((float) d) * f17);
                GLES20.glUniform1f(g21Var.G, f21Var.f25864s);
                GLES20.glUniform3f(g21Var.I, f21Var.v, f21Var.f25867w, f21Var.f25868x);
                GLES20.glUniform2f(g21Var.P, f21Var.f25853g, f21Var.h);
                int i25 = g21Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = g21Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(g21Var.J, i23, i22);
                GLES20.glUniform1f(g21Var.K, f21Var.f25869y);
                GLES20.glUniform2f(g21Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(g21Var.N, f21Var.f25856k);
                GLES20.glUniform1f(g21Var.O, f21Var.f25857l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, f21Var.A[0]);
                GLES20.glUniform1i(g21Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[f21Var.f25870z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - f21Var.f25870z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, f21Var.f25864s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                f21Var.d = false;
                f21Var.f25870z = 1 - f21Var.f25870z;
                float f18 = f21Var.f25850c;
                float f19 = f21Var.f25857l;
                if (f21Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    f21Var.a();
                    this.T.remove(i16);
                    this.S = !this.T.isEmpty();
                    i16--;
                }
                i16++;
                i15 = 0;
            }
            int i27 = i15;
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    FileLog.e("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        for (int i28 = i27; i28 < this.U.size(); i28++) {
                            AndroidUtilities.runOnUIThread(((f21) this.U.get(i28)).f25851e);
                        }
                        this.U.clear();
                        for (int i29 = i27; i29 < this.T.size(); i29++) {
                            ((f21) this.T.get(i29)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new xh(12));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f26234n, this.f26236s);
            for (int i30 = i27; i30 < this.U.size(); i30++) {
                AndroidUtilities.runOnUIThread(((f21) this.U.get(i30)).f25851e);
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
        this.f26234n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f26234n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f26235r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f26234n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f26234n, this.f26235r, this.f26231c, null);
            this.f26236s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f26234n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f26237w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f26237w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f26237w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f26237w);
                    GLES20.glGetProgramiv(this.f26237w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f26237w));
                        j();
                        return;
                    }
                    this.f26238x = GLES20.glGetUniformLocation(this.f26237w, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f26237w, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f26237w, "rectPos");
                    this.f26239y = GLES20.glGetUniformLocation(this.f26237w, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f26237w, "time");
                    this.F = GLES20.glGetUniformLocation(this.f26237w, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f26237w, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f26237w, "size");
                    this.I = GLES20.glGetUniformLocation(this.f26237w, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f26237w, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f26237w, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f26237w, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f26237w, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f26237w, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f26237w, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f26237w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f26232e, this.f26233f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f26237w);
                    GLES20.glUniform2f(this.H, this.f26232e, this.f26233f);
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
                                    f21 f21Var = (f21) arrayList.get(i11);
                                    if (f21Var.f25848a.contains(view)) {
                                        f21Var.a();
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
                            f21 f21Var2 = (f21) arrayList.get(i11);
                            f21Var2.f25853g += message.arg1;
                            f21Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((f21) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f26230b.get()) {
                this.f26232e = i12;
                this.f26233f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f26230b.get()) {
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
        AtomicBoolean atomicBoolean = this.f26230b;
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
            ((f21) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f26231c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        i21.b(this.d);
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
                    b((f21) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e7) {
            FileLog.e(e7);
            while (i10 < arrayList.size()) {
                f21 f21Var = (f21) arrayList.get(i10);
                Runnable runnable = f21Var.f25851e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                f21Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new xh(11));
            j();
        }
    }
}
