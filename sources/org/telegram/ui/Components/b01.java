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
public final class b01 extends DispatchQueue {
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
    public boolean f26954a;
    public final AtomicBoolean f26955b;
    public final SurfaceTexture f26956c;
    public yz0 d;
    public int f26957e;
    public int f26958f;
    public EGL10 h;
    public EGLDisplay f26959n;
    public EGLConfig f26960r;
    public EGLSurface f26961s;
    public EGLContext v;
    public int f26962w;
    public int f26963x;
    public int f26964y;

    public b01(SurfaceTexture surfaceTexture, yz0 yz0Var, yz0 yz0Var2, int i9, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.f26955b = new AtomicBoolean(true);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = false;
        this.S = new ArrayList();
        this.f26956c = surfaceTexture;
        this.d = yz0Var2;
        this.f26957e = i9;
        this.f26958f = i10;
        start();
    }

    public final void b(a01 a01Var) {
        int i9 = 0;
        GLES20.glGenTextures(1, a01Var.A, 0);
        GLES20.glBindTexture(3553, a01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, a01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        a01Var.C.recycle();
        a01Var.C = null;
        if (a01Var.D) {
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((a01) obj).a();
            }
            this.P.clear();
        }
        this.P.add(a01Var);
        this.O = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f26955b.get()) {
            AndroidUtilities.runOnUIThread(new gh.o8(runnable, runnable2, 1));
            d01.b(this.d);
            this.d = null;
            return;
        }
        a01 a01Var = new a01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.O = true;
        postRunnable(new zz0(this, a01Var, 1));
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (!this.f26955b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            yz0 yz0Var = this.d;
            if (yz0Var != null) {
                AndroidUtilities.runOnUIThread(yz0Var);
                this.d = null;
                return;
            }
            return;
        }
        a01 a01Var = new a01(this, view, f10, runnable);
        getHandler();
        this.O = true;
        postRunnable(new zz0(this, a01Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f26955b.get()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((View) arrayList.get(i9)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            yz0 yz0Var = this.d;
            if (yz0Var != null) {
                AndroidUtilities.runOnUIThread(yz0Var);
                this.d = null;
                return;
            }
            return;
        }
        a01 a01Var = new a01(this, arrayList, runnable);
        this.O = true;
        postRunnable(new zz0(this, a01Var, 0));
    }

    public final void g() {
        long j10;
        double d;
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        int i10;
        int clamp;
        int i11;
        int i12;
        int i13;
        if (this.f26955b.get()) {
            GLES20.glClear(16384);
            int i14 = 0;
            int i15 = 0;
            while (i15 < this.P.size()) {
                a01 a01Var = (a01) this.P.get(i15);
                if (a01Var.d) {
                    ArrayList arrayList = this.P;
                    int i16 = 0;
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        i16 += ((a01) arrayList.get(i17)).f26611u;
                    }
                    float f14 = a01Var.f26611u;
                    float f15 = f14 / i16;
                    int[] iArr = a01Var.B;
                    int i18 = a01Var.f26610t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i19 = 120000;
                    if (devicePerformanceClass != 1) {
                        if (devicePerformanceClass != 2) {
                            i10 = 30000;
                        } else {
                            i10 = 120000;
                        }
                    } else {
                        i10 = 60000;
                    }
                    if (!a01Var.E.f26954a) {
                        i19 = i10;
                    }
                    if (a01Var.D) {
                        i19 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    a01Var.f26609s = Utilities.clamp((int) ((i9 * i18) / (max * max)), (int) (i19 * f15), 10);
                    float f16 = i18;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(clamp / f17));
                    a01Var.f26612w = round;
                    a01Var.v = Math.round(a01Var.f26609s / round);
                    while (true) {
                        i11 = a01Var.v;
                        i12 = a01Var.f26612w;
                        i13 = i11 * i12;
                        if (i13 >= a01Var.f26609s) {
                            break;
                        } else if (i11 / i12 < f17) {
                            a01Var.v = i11 + 1;
                        } else {
                            a01Var.f26612w = i12 + 1;
                        }
                    }
                    a01Var.f26609s = i13;
                    a01Var.f26613x = Math.max(f16 / i11, f14 / i12);
                    GLES20.glGenBuffers(2, iArr, i14);
                    for (int i20 = 0; i20 < 2; i20++) {
                        GLES20.glBindBuffer(34962, iArr[i20]);
                        GLES20.glBufferData(34962, a01Var.f26609s * 28, null, 35048);
                    }
                    if (a01Var.f26596e != null) {
                        this.Q.add(a01Var);
                    }
                }
                this.R = true;
                int[] iArr2 = a01Var.B;
                boolean z10 = a01Var.D;
                float f18 = a01Var.f26603m;
                int i21 = a01Var.f26611u;
                int i22 = a01Var.f26610t;
                Matrix matrix = a01Var.f26608r;
                b01 b01Var = a01Var.E;
                long nanoTime = System.nanoTime();
                if (a01Var.f26594b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                a01Var.f26594b = nanoTime;
                if (a01Var.f26604n && !a01Var.f26605o) {
                    matrix.reset();
                    matrix.postScale(i22, i21);
                    matrix.postTranslate(a01Var.f26599i, a01Var.f26600j);
                    a01Var.c();
                }
                a01Var.f26595c = (float) ((f18 * d) + a01Var.f26595c);
                GLES20.glUniformMatrix3fv(b01Var.f26963x, 1, false, a01Var.f26606p, 0);
                int i23 = b01Var.f26964y;
                if (a01Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i23, f10);
                GLES20.glUniform1f(b01Var.A, a01Var.f26595c);
                GLES20.glUniform1f(b01Var.B, ((float) d) * f18);
                GLES20.glUniform1f(b01Var.C, a01Var.f26609s);
                GLES20.glUniform3f(b01Var.E, a01Var.v, a01Var.f26612w, a01Var.f26613x);
                GLES20.glUniform2f(b01Var.L, a01Var.f26598g, a01Var.h);
                int i24 = b01Var.M;
                if (z10) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i24, f11);
                int i25 = b01Var.N;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i25, f12);
                GLES20.glUniform2f(b01Var.F, i22, i21);
                GLES20.glUniform1f(b01Var.G, a01Var.f26614y);
                GLES20.glUniform2f(b01Var.H, 0.0f, 0.0f);
                GLES20.glUniform1f(b01Var.J, a01Var.f26601k);
                GLES20.glUniform1f(b01Var.K, a01Var.f26602l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, a01Var.A[0]);
                GLES20.glUniform1i(b01Var.I, 0);
                GLES20.glBindBuffer(34962, iArr2[a01Var.f26615z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - a01Var.f26615z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, a01Var.f26609s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                a01Var.d = false;
                a01Var.f26615z = 1 - a01Var.f26615z;
                float f19 = a01Var.f26595c;
                float f20 = a01Var.f26602l;
                if (a01Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    a01Var.a();
                    this.P.remove(i15);
                    this.O = !this.P.isEmpty();
                    i15--;
                }
                i15++;
                i14 = 0;
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
                        for (int i26 = 0; i26 < this.Q.size(); i26++) {
                            AndroidUtilities.runOnUIThread(((a01) this.Q.get(i26)).f26596e);
                        }
                        this.Q.clear();
                        for (int i27 = 0; i27 < this.P.size(); i27++) {
                            ((a01) this.P.get(i27)).a();
                        }
                        this.P.clear();
                        AndroidUtilities.runOnUIThread(new hc(15));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f26959n, this.f26961s);
            for (int i28 = 0; i28 < this.Q.size(); i28++) {
                AndroidUtilities.runOnUIThread(((a01) this.Q.get(i28)).f26596e);
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
        this.f26959n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f26959n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f26960r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f26959n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f26959n, this.f26960r, this.f26956c, null);
            this.f26961s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f26959n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f26962w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f26962w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f26962w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f26962w);
                    GLES20.glGetProgramiv(this.f26962w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f26962w));
                        j();
                        return;
                    }
                    this.f26963x = GLES20.glGetUniformLocation(this.f26962w, "matrix");
                    this.F = GLES20.glGetUniformLocation(this.f26962w, "rectSize");
                    this.H = GLES20.glGetUniformLocation(this.f26962w, "rectPos");
                    this.f26964y = GLES20.glGetUniformLocation(this.f26962w, "reset");
                    this.A = GLES20.glGetUniformLocation(this.f26962w, "time");
                    this.B = GLES20.glGetUniformLocation(this.f26962w, "deltaTime");
                    this.C = GLES20.glGetUniformLocation(this.f26962w, "particlesCount");
                    this.D = GLES20.glGetUniformLocation(this.f26962w, "size");
                    this.E = GLES20.glGetUniformLocation(this.f26962w, "gridSize");
                    this.I = GLES20.glGetUniformLocation(this.f26962w, "tex");
                    this.G = GLES20.glGetUniformLocation(this.f26962w, "seed");
                    this.J = GLES20.glGetUniformLocation(this.f26962w, "dp");
                    this.K = GLES20.glGetUniformLocation(this.f26962w, "longevity");
                    this.L = GLES20.glGetUniformLocation(this.f26962w, "offset");
                    this.M = GLES20.glGetUniformLocation(this.f26962w, "scale");
                    this.N = GLES20.glGetUniformLocation(this.f26962w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f26957e, this.f26958f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f26962w);
                    GLES20.glUniform2f(this.D, this.f26957e, this.f26958f);
                    return;
                }
                FileLog.e("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
                j();
            }
        }
    }

    @Override
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            int i10 = 0;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        ArrayList arrayList = this.P;
                        if (i9 != 4) {
                            if (i9 == 5) {
                                View view = (View) message.obj;
                                while (i10 < arrayList.size()) {
                                    a01 a01Var = (a01) arrayList.get(i10);
                                    if (a01Var.f26593a.contains(view)) {
                                        a01Var.a();
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
                            a01 a01Var2 = (a01) arrayList.get(i10);
                            a01Var2.f26598g += message.arg1;
                            a01Var2.h += message.arg2;
                            i10++;
                        }
                        return;
                    }
                    b((a01) message.obj);
                    return;
                }
                j();
                return;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.f26955b.get()) {
                this.f26957e = i11;
                this.f26958f = i12;
                GLES20.glViewport(0, 0, i11, i12);
                GLES20.glUniform2f(this.D, i11, i12);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f26955b.get()) {
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
        AtomicBoolean atomicBoolean = this.f26955b;
        if (!atomicBoolean.get()) {
            FileLog.d("ThanosEffect: killInternal failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: killInternal");
        int i9 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.P;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((a01) arrayList.get(i9)).a();
            i9++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f26956c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        d01.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.S;
        int i9 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i9 < arrayList.size()) {
                    b((a01) arrayList.get(i9));
                    i9++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            FileLog.e(e10);
            while (i9 < arrayList.size()) {
                a01 a01Var = (a01) arrayList.get(i9);
                Runnable runnable = a01Var.f26596e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                a01Var.a();
                i9++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new hc(14));
            j();
        }
    }
}
