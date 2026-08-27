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

public final class d01 extends DispatchQueue {
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

    public boolean f27593a;

    public final AtomicBoolean f27594b;

    public final SurfaceTexture f27595c;
    public a01 d;

    public int f27596e;

    public int f27597f;
    public EGL10 h;

    public EGLDisplay f27598n;

    public EGLConfig f27599r;

    public EGLSurface f27600s;
    public EGLContext v;

    public int f27601w;

    public int f27602x;

    public int f27603y;

    public d01(SurfaceTexture surfaceTexture, a01 a01Var, a01 a01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f27594b = new AtomicBoolean(true);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = false;
        this.S = new ArrayList();
        this.f27595c = surfaceTexture;
        this.d = a01Var2;
        this.f27596e = i10;
        this.f27597f = i11;
        start();
    }

    public final void b(c01 c01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, c01Var.A, 0);
        GLES20.glBindTexture(3553, c01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, c01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        c01Var.C.recycle();
        c01Var.C = null;
        if (c01Var.D) {
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((c01) obj).a();
            }
            this.P.clear();
        }
        this.P.add(c01Var);
        this.O = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f27594b.get()) {
            AndroidUtilities.runOnUIThread(new hh.n8(runnable, runnable2, 1));
            f01.b(this.d);
            this.d = null;
        } else {
            c01 c01Var = new c01(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.O = true;
            postRunnable(new b01(this, c01Var, 1));
        }
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (this.f27594b.get()) {
            c01 c01Var = new c01(this, view, f10, runnable);
            getHandler();
            this.O = true;
            postRunnable(new b01(this, c01Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        a01 a01Var = this.d;
        if (a01Var != null) {
            AndroidUtilities.runOnUIThread(a01Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.f27594b.get()) {
            c01 c01Var = new c01(this, arrayList, runnable);
            this.O = true;
            postRunnable(new b01(this, c01Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        a01 a01Var = this.d;
        if (a01Var != null) {
            AndroidUtilities.runOnUIThread(a01Var);
            this.d = null;
        }
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        if (this.f27594b.get()) {
            GLES20.glClear(16384);
            int i13 = 0;
            int i14 = 0;
            while (i14 < this.P.size()) {
                c01 c01Var = (c01) this.P.get(i14);
                if (c01Var.d) {
                    ArrayList arrayList = this.P;
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        i15 += ((c01) arrayList.get(i16)).f27268u;
                    }
                    int i17 = c01Var.f27268u;
                    float f10 = i17;
                    float f11 = f10 / i15;
                    int[] iArr = c01Var.B;
                    int i18 = c01Var.f27267t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i19 = c01Var.E.f27593a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (c01Var.D) {
                        i19 /= 2;
                    }
                    float fMax = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    int iClamp = Utilities.clamp((int) ((i17 * i18) / (fMax * fMax)), (int) (i19 * f11), 10);
                    c01Var.f27266s = iClamp;
                    float f12 = i18;
                    float f13 = f12 / f10;
                    int iRound = (int) Math.round(Math.sqrt(iClamp / f13));
                    c01Var.f27269w = iRound;
                    c01Var.v = Math.round(c01Var.f27266s / iRound);
                    while (true) {
                        i10 = c01Var.v;
                        i11 = c01Var.f27269w;
                        i12 = i10 * i11;
                        if (i12 >= c01Var.f27266s) {
                            break;
                        } else if (i10 / i11 < f13) {
                            c01Var.v = i10 + 1;
                        } else {
                            c01Var.f27269w = i11 + 1;
                        }
                    }
                    c01Var.f27266s = i12;
                    c01Var.f27270x = Math.max(f12 / i10, f10 / i11);
                    GLES20.glGenBuffers(2, iArr, i13);
                    for (int i20 = 0; i20 < 2; i20++) {
                        GLES20.glBindBuffer(34962, iArr[i20]);
                        GLES20.glBufferData(34962, c01Var.f27266s * 28, null, 35048);
                    }
                    if (c01Var.f27253e != null) {
                        this.Q.add(c01Var);
                    }
                }
                this.R = true;
                int[] iArr2 = c01Var.B;
                boolean z10 = c01Var.D;
                float f14 = c01Var.f27260m;
                int i21 = c01Var.f27268u;
                int i22 = c01Var.f27267t;
                Matrix matrix = c01Var.f27265r;
                d01 d01Var = c01Var.E;
                long jNanoTime = System.nanoTime();
                long j10 = c01Var.f27251b;
                double d = j10 < 0 ? 0.0d : (jNanoTime - j10) / 1.0E9d;
                c01Var.f27251b = jNanoTime;
                if (c01Var.f27261n && !c01Var.f27262o) {
                    matrix.reset();
                    matrix.postScale(i22, i21);
                    matrix.postTranslate(c01Var.f27256i, c01Var.f27257j);
                    c01Var.c();
                }
                c01Var.f27252c = (float) ((((double) f14) * d) + ((double) c01Var.f27252c));
                GLES20.glUniformMatrix3fv(d01Var.f27602x, 1, false, c01Var.f27263p, 0);
                GLES20.glUniform1f(d01Var.f27603y, c01Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(d01Var.A, c01Var.f27252c);
                GLES20.glUniform1f(d01Var.B, ((float) d) * f14);
                GLES20.glUniform1f(d01Var.C, c01Var.f27266s);
                GLES20.glUniform3f(d01Var.E, c01Var.v, c01Var.f27269w, c01Var.f27270x);
                GLES20.glUniform2f(d01Var.L, c01Var.f27255g, c01Var.h);
                GLES20.glUniform1f(d01Var.M, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(d01Var.N, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(d01Var.F, i22, i21);
                GLES20.glUniform1f(d01Var.G, c01Var.f27271y);
                GLES20.glUniform2f(d01Var.H, 0.0f, 0.0f);
                GLES20.glUniform1f(d01Var.J, c01Var.f27258k);
                GLES20.glUniform1f(d01Var.K, c01Var.f27259l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, c01Var.A[0]);
                GLES20.glUniform1i(d01Var.I, 0);
                GLES20.glBindBuffer(34962, iArr2[c01Var.f27272z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - c01Var.f27272z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, c01Var.f27266s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                c01Var.d = false;
                c01Var.f27272z = 1 - c01Var.f27272z;
                if (c01Var.f27252c > c01Var.f27259l + (c01Var.D ? 2.0f : 0.9f)) {
                    c01Var.a();
                    this.P.remove(i14);
                    this.O = !this.P.isEmpty();
                    i14--;
                }
                i14++;
                i13 = 0;
            }
            while (true) {
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError == 0) {
                    try {
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        for (int i23 = 0; i23 < this.Q.size(); i23++) {
                            AndroidUtilities.runOnUIThread(((c01) this.Q.get(i23)).f27253e);
                        }
                        this.Q.clear();
                        for (int i24 = 0; i24 < this.P.size(); i24++) {
                            ((c01) this.P.get(i24)).a();
                        }
                        this.P.clear();
                        AndroidUtilities.runOnUIThread(new gc(14));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + iGlGetError);
            }
            this.h.eglSwapBuffers(this.f27598n, this.f27600s);
            for (int i25 = 0; i25 < this.Q.size(); i25++) {
                AndroidUtilities.runOnUIThread(((c01) this.Q.get(i25)).f27253e);
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
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
        this.f27598n = eGLDisplayEglGetDisplay;
        EGL10 egl11 = this.h;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
            return;
        }
        if (!egl11.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.h.eglChooseConfig(this.f27598n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            FileLog.e("ThanosEffect: failed eglChooseConfig");
            i();
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f27599r = eGLConfig;
        EGLContext eGLContextEglCreateContext = this.h.eglCreateContext(this.f27598n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        this.v = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == null) {
            FileLog.e("ThanosEffect: eglContext == null");
            j();
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f27598n, this.f27599r, this.f27595c, null);
        this.f27600s = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null) {
            FileLog.e("ThanosEffect: eglSurface == null");
            j();
            return;
        }
        if (!this.h.eglMakeCurrent(this.f27598n, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.v)) {
            FileLog.e("ThanosEffect: failed eglMakeCurrent");
            j();
            return;
        }
        int iGlCreateShader = GLES20.glCreateShader(35633);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        if (iGlCreateShader == 0 || iGlCreateShader2 == 0) {
            FileLog.e("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
            j();
            return;
        }
        GLES20.glShaderSource(iGlCreateShader, AndroidUtilities.readRes(R.raw.thanos_vertex));
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
            GLES20.glDeleteShader(iGlCreateShader);
            j();
            return;
        }
        GLES20.glShaderSource(iGlCreateShader2, AndroidUtilities.readRes(R.raw.thanos_fragment));
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(iGlCreateShader2));
            GLES20.glDeleteShader(iGlCreateShader2);
            j();
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f27601w = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            FileLog.e("ThanosEffect: drawProgram == 0");
            j();
            return;
        }
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(this.f27601w, iGlCreateShader2);
        GLES30.glTransformFeedbackVaryings(this.f27601w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
        GLES20.glLinkProgram(this.f27601w);
        GLES20.glGetProgramiv(this.f27601w, 35714, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f27601w));
            j();
            return;
        }
        this.f27602x = GLES20.glGetUniformLocation(this.f27601w, "matrix");
        this.F = GLES20.glGetUniformLocation(this.f27601w, "rectSize");
        this.H = GLES20.glGetUniformLocation(this.f27601w, "rectPos");
        this.f27603y = GLES20.glGetUniformLocation(this.f27601w, "reset");
        this.A = GLES20.glGetUniformLocation(this.f27601w, "time");
        this.B = GLES20.glGetUniformLocation(this.f27601w, "deltaTime");
        this.C = GLES20.glGetUniformLocation(this.f27601w, "particlesCount");
        this.D = GLES20.glGetUniformLocation(this.f27601w, "size");
        this.E = GLES20.glGetUniformLocation(this.f27601w, "gridSize");
        this.I = GLES20.glGetUniformLocation(this.f27601w, "tex");
        this.G = GLES20.glGetUniformLocation(this.f27601w, "seed");
        this.J = GLES20.glGetUniformLocation(this.f27601w, "dp");
        this.K = GLES20.glGetUniformLocation(this.f27601w, "longevity");
        this.L = GLES20.glGetUniformLocation(this.f27601w, "offset");
        this.M = GLES20.glGetUniformLocation(this.f27601w, "scale");
        this.N = GLES20.glGetUniformLocation(this.f27601w, "uvOffset");
        GLES20.glViewport(0, 0, this.f27596e, this.f27597f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.f27601w);
        GLES20.glUniform2f(this.D, this.f27596e, this.f27597f);
    }

    @Override
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            g();
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f27594b.get()) {
                this.f27596e = i12;
                this.f27597f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.D, i12, i13);
            }
            g();
            return;
        }
        if (i10 == 2) {
            j();
            return;
        }
        if (i10 == 3) {
            b((c01) message.obj);
            return;
        }
        ArrayList arrayList = this.P;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                c01 c01Var = (c01) arrayList.get(i11);
                c01Var.f27255g += message.arg1;
                c01Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            c01 c01Var2 = (c01) arrayList.get(i11);
            if (c01Var2.f27250a.contains(view)) {
                c01Var2.a();
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void i() {
        if (!this.f27594b.get()) {
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
        AtomicBoolean atomicBoolean = this.f27594b;
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
            ((c01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f27595c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        f01.b(this.d);
        this.d = null;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
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
                    b((c01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e9) {
            FileLog.e(e9);
            while (i10 < arrayList.size()) {
                c01 c01Var = (c01) arrayList.get(i10);
                Runnable runnable = c01Var.f27253e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                c01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new gc(13));
            j();
        }
    }
}
