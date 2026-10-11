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
public final class b21 extends DispatchQueue {
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
    public boolean f24855a;
    public final AtomicBoolean f24856b;
    public final SurfaceTexture f24857c;
    public x11 d;
    public int f24858e;
    public int f24859f;
    public EGL10 h;
    public EGLDisplay f24860n;
    public EGLConfig f24861r;
    public EGLSurface f24862s;
    public EGLContext v;
    public int f24863w;
    public int f24864x;
    public int f24865y;

    public b21(SurfaceTexture surfaceTexture, x11 x11Var, x11 x11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f24856b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f24857c = surfaceTexture;
        this.d = x11Var2;
        this.f24858e = i10;
        this.f24859f = i11;
        start();
    }

    public final void b(a21 a21Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, a21Var.A, 0);
        GLES20.glBindTexture(3553, a21Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, a21Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        a21Var.C.recycle();
        a21Var.C = null;
        if (a21Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a21) obj).a();
            }
            this.T.clear();
        }
        this.T.add(a21Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f24856b.get()) {
            AndroidUtilities.runOnUIThread(new z11(runnable, runnable2, 0));
            d21.b(this.d);
            this.d = null;
            return;
        }
        a21 a21Var = new a21(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new y11(this, a21Var, 1));
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (!this.f24856b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            x11 x11Var = this.d;
            if (x11Var != null) {
                AndroidUtilities.runOnUIThread(x11Var);
                this.d = null;
                return;
            }
            return;
        }
        a21 a21Var = new a21(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new y11(this, a21Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f24856b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            x11 x11Var = this.d;
            if (x11Var != null) {
                AndroidUtilities.runOnUIThread(x11Var);
                this.d = null;
                return;
            }
            return;
        }
        a21 a21Var = new a21(this, arrayList, runnable);
        this.S = true;
        postRunnable(new y11(this, a21Var, 0));
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
        if (this.f24856b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                a21 a21Var = (a21) this.T.get(i16);
                if (a21Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = i15;
                    int i18 = i17;
                    while (i17 < arrayList.size()) {
                        i18 += ((a21) arrayList.get(i17)).f24471u;
                        i17++;
                    }
                    float f13 = a21Var.f24471u;
                    float f14 = f13 / i18;
                    int[] iArr = a21Var.B;
                    int i19 = a21Var.f24470t;
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
                    if (!a21Var.E.f24855a) {
                        i20 = i11;
                    }
                    if (a21Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    a21Var.f24469s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    a21Var.f24472w = round;
                    a21Var.v = Math.round(a21Var.f24469s / round);
                    while (true) {
                        i12 = a21Var.v;
                        i13 = a21Var.f24472w;
                        i14 = i12 * i13;
                        if (i14 >= a21Var.f24469s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            a21Var.v = i12 + 1;
                        } else {
                            a21Var.f24472w = i13 + 1;
                        }
                    }
                    a21Var.f24469s = i14;
                    a21Var.f24473x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = i15; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, a21Var.f24469s * 28, null, 35048);
                    }
                    if (a21Var.f24456e != null) {
                        this.U.add(a21Var);
                    }
                }
                this.V = true;
                int[] iArr2 = a21Var.B;
                boolean z10 = a21Var.D;
                float f17 = a21Var.f24463m;
                int i22 = a21Var.f24471u;
                int i23 = a21Var.f24470t;
                Matrix matrix = a21Var.f24468r;
                b21 b21Var = a21Var.E;
                long nanoTime = System.nanoTime();
                if (a21Var.f24454b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j3) / 1.0E9d;
                }
                a21Var.f24454b = nanoTime;
                if (a21Var.f24464n && !a21Var.f24465o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(a21Var.f24459i, a21Var.f24460j);
                    a21Var.c();
                }
                a21Var.f24455c = (float) ((f17 * d) + a21Var.f24455c);
                GLES20.glUniformMatrix3fv(b21Var.f24864x, 1, false, a21Var.f24466p, 0);
                int i24 = b21Var.f24865y;
                if (a21Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i24, f7);
                GLES20.glUniform1f(b21Var.E, a21Var.f24455c);
                GLES20.glUniform1f(b21Var.F, ((float) d) * f17);
                GLES20.glUniform1f(b21Var.G, a21Var.f24469s);
                GLES20.glUniform3f(b21Var.I, a21Var.v, a21Var.f24472w, a21Var.f24473x);
                GLES20.glUniform2f(b21Var.P, a21Var.f24458g, a21Var.h);
                int i25 = b21Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = b21Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(b21Var.J, i23, i22);
                GLES20.glUniform1f(b21Var.K, a21Var.f24474y);
                GLES20.glUniform2f(b21Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(b21Var.N, a21Var.f24461k);
                GLES20.glUniform1f(b21Var.O, a21Var.f24462l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, a21Var.A[0]);
                GLES20.glUniform1i(b21Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[a21Var.f24475z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - a21Var.f24475z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, a21Var.f24469s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                a21Var.d = false;
                a21Var.f24475z = 1 - a21Var.f24475z;
                float f18 = a21Var.f24455c;
                float f19 = a21Var.f24462l;
                if (a21Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    a21Var.a();
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
                            AndroidUtilities.runOnUIThread(((a21) this.U.get(i28)).f24456e);
                        }
                        this.U.clear();
                        for (int i29 = i27; i29 < this.T.size(); i29++) {
                            ((a21) this.T.get(i29)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new vh(12));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f24860n, this.f24862s);
            for (int i30 = i27; i30 < this.U.size(); i30++) {
                AndroidUtilities.runOnUIThread(((a21) this.U.get(i30)).f24456e);
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
        this.f24860n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f24860n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f24861r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f24860n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f24860n, this.f24861r, this.f24857c, null);
            this.f24862s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f24860n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f24863w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f24863w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f24863w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f24863w);
                    GLES20.glGetProgramiv(this.f24863w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f24863w));
                        j();
                        return;
                    }
                    this.f24864x = GLES20.glGetUniformLocation(this.f24863w, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f24863w, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f24863w, "rectPos");
                    this.f24865y = GLES20.glGetUniformLocation(this.f24863w, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f24863w, "time");
                    this.F = GLES20.glGetUniformLocation(this.f24863w, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f24863w, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f24863w, "size");
                    this.I = GLES20.glGetUniformLocation(this.f24863w, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f24863w, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f24863w, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f24863w, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f24863w, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f24863w, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f24863w, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f24863w, "uvOffset");
                    GLES20.glViewport(0, 0, this.f24858e, this.f24859f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f24863w);
                    GLES20.glUniform2f(this.H, this.f24858e, this.f24859f);
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
                                    a21 a21Var = (a21) arrayList.get(i11);
                                    if (a21Var.f24453a.contains(view)) {
                                        a21Var.a();
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
                            a21 a21Var2 = (a21) arrayList.get(i11);
                            a21Var2.f24458g += message.arg1;
                            a21Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((a21) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f24856b.get()) {
                this.f24858e = i12;
                this.f24859f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f24856b.get()) {
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
        AtomicBoolean atomicBoolean = this.f24856b;
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
            ((a21) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f24857c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        d21.b(this.d);
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
                    b((a21) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e7) {
            FileLog.e(e7);
            while (i10 < arrayList.size()) {
                a21 a21Var = (a21) arrayList.get(i10);
                Runnable runnable = a21Var.f24456e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                a21Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new vh(11));
            j();
        }
    }
}
