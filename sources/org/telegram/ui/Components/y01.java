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
public final class y01 extends DispatchQueue {
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
    public boolean f30810a;
    public final AtomicBoolean f30811b;
    public final SurfaceTexture f30812c;
    public v01 d;
    public int e;
    public int f30813f;
    public EGL10 h;
    public EGLDisplay f30814n;
    public EGLConfig f30815r;
    public EGLSurface f30816s;
    public EGLContext v;
    public int f30817w;
    public int f30818x;
    public int f30819y;

    public y01(SurfaceTexture surfaceTexture, v01 v01Var, v01 v01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f30811b = new AtomicBoolean(true);
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = false;
        this.T = new ArrayList();
        this.f30812c = surfaceTexture;
        this.d = v01Var2;
        this.e = i10;
        this.f30813f = i11;
        start();
    }

    public final void b(x01 x01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, x01Var.A, 0);
        GLES20.glBindTexture(3553, x01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, x01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        x01Var.C.recycle();
        x01Var.C = null;
        if (x01Var.D) {
            ArrayList arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((x01) obj).a();
            }
            this.Q.clear();
        }
        this.Q.add(x01Var);
        this.P = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f30811b.get()) {
            AndroidUtilities.runOnUIThread(new lh.l8(runnable, runnable2, 1));
            a11.b(this.d);
            this.d = null;
            return;
        }
        x01 x01Var = new x01(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.P = true;
        postRunnable(new w01(this, x01Var, 1));
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (!this.f30811b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            v01 v01Var = this.d;
            if (v01Var != null) {
                AndroidUtilities.runOnUIThread(v01Var);
                this.d = null;
                return;
            }
            return;
        }
        x01 x01Var = new x01(this, view, f10, runnable);
        getHandler();
        this.P = true;
        postRunnable(new w01(this, x01Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f30811b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            v01 v01Var = this.d;
            if (v01Var != null) {
                AndroidUtilities.runOnUIThread(v01Var);
                this.d = null;
                return;
            }
            return;
        }
        x01 x01Var = new x01(this, arrayList, runnable);
        this.P = true;
        postRunnable(new w01(this, x01Var, 0));
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
        if (this.f30811b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.Q.size()) {
                x01 x01Var = (x01) this.Q.get(i16);
                if (x01Var.d) {
                    ArrayList arrayList = this.Q;
                    int i17 = 0;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        i17 += ((x01) arrayList.get(i18)).f30485u;
                    }
                    float f14 = x01Var.f30485u;
                    float f15 = f14 / i17;
                    int[] iArr = x01Var.B;
                    int i19 = x01Var.f30484t;
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
                    if (!x01Var.E.f30810a) {
                        i20 = i11;
                    }
                    if (x01Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    x01Var.f30483s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f15), 10);
                    float f16 = i19;
                    float f17 = f16 / f14;
                    int round = (int) Math.round(Math.sqrt(clamp / f17));
                    x01Var.f30486w = round;
                    x01Var.v = Math.round(x01Var.f30483s / round);
                    while (true) {
                        i12 = x01Var.v;
                        i13 = x01Var.f30486w;
                        i14 = i12 * i13;
                        if (i14 >= x01Var.f30483s) {
                            break;
                        } else if (i12 / i13 < f17) {
                            x01Var.v = i12 + 1;
                        } else {
                            x01Var.f30486w = i13 + 1;
                        }
                    }
                    x01Var.f30483s = i14;
                    x01Var.f30487x = Math.max(f16 / i12, f14 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = 0; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, x01Var.f30483s * 28, null, 35048);
                    }
                    if (x01Var.e != null) {
                        this.R.add(x01Var);
                    }
                }
                this.S = true;
                int[] iArr2 = x01Var.B;
                boolean z4 = x01Var.D;
                float f18 = x01Var.f30477m;
                int i22 = x01Var.f30485u;
                int i23 = x01Var.f30484t;
                Matrix matrix = x01Var.f30482r;
                y01 y01Var = x01Var.E;
                long nanoTime = System.nanoTime();
                if (x01Var.f30469b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                x01Var.f30469b = nanoTime;
                if (x01Var.f30478n && !x01Var.f30479o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(x01Var.f30473i, x01Var.f30474j);
                    x01Var.c();
                }
                x01Var.f30470c = (float) ((f18 * d) + x01Var.f30470c);
                GLES20.glUniformMatrix3fv(y01Var.f30818x, 1, false, x01Var.f30480p, 0);
                int i24 = y01Var.f30819y;
                if (x01Var.d) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                GLES20.glUniform1f(i24, f10);
                GLES20.glUniform1f(y01Var.B, x01Var.f30470c);
                GLES20.glUniform1f(y01Var.C, ((float) d) * f18);
                GLES20.glUniform1f(y01Var.D, x01Var.f30483s);
                GLES20.glUniform3f(y01Var.F, x01Var.v, x01Var.f30486w, x01Var.f30487x);
                GLES20.glUniform2f(y01Var.M, x01Var.f30472g, x01Var.h);
                int i25 = y01Var.N;
                if (z4) {
                    f11 = 0.8f;
                } else {
                    f11 = 1.0f;
                }
                GLES20.glUniform1f(i25, f11);
                int i26 = y01Var.O;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.6f;
                }
                GLES20.glUniform1f(i26, f12);
                GLES20.glUniform2f(y01Var.G, i23, i22);
                GLES20.glUniform1f(y01Var.H, x01Var.f30488y);
                GLES20.glUniform2f(y01Var.I, 0.0f, 0.0f);
                GLES20.glUniform1f(y01Var.K, x01Var.f30475k);
                GLES20.glUniform1f(y01Var.L, x01Var.f30476l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, x01Var.A[0]);
                GLES20.glUniform1i(y01Var.J, 0);
                GLES20.glBindBuffer(34962, iArr2[x01Var.f30489z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - x01Var.f30489z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, x01Var.f30483s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                x01Var.d = false;
                x01Var.f30489z = 1 - x01Var.f30489z;
                float f19 = x01Var.f30470c;
                float f20 = x01Var.f30476l;
                if (x01Var.D) {
                    f13 = 2.0f;
                } else {
                    f13 = 0.9f;
                }
                if (f19 > f20 + f13) {
                    x01Var.a();
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        for (int i27 = 0; i27 < this.R.size(); i27++) {
                            AndroidUtilities.runOnUIThread(((x01) this.R.get(i27)).e);
                        }
                        this.R.clear();
                        for (int i28 = 0; i28 < this.Q.size(); i28++) {
                            ((x01) this.Q.get(i28)).a();
                        }
                        this.Q.clear();
                        AndroidUtilities.runOnUIThread(new mc(13));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f30814n, this.f30816s);
            for (int i29 = 0; i29 < this.R.size(); i29++) {
                AndroidUtilities.runOnUIThread(((x01) this.R.get(i29)).e);
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
        this.f30814n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f30814n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f30815r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f30814n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f30814n, this.f30815r, this.f30812c, null);
            this.f30816s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f30814n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f30817w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f30817w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f30817w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f30817w);
                    GLES20.glGetProgramiv(this.f30817w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f30817w));
                        j();
                        return;
                    }
                    this.f30818x = GLES20.glGetUniformLocation(this.f30817w, "matrix");
                    this.G = GLES20.glGetUniformLocation(this.f30817w, "rectSize");
                    this.I = GLES20.glGetUniformLocation(this.f30817w, "rectPos");
                    this.f30819y = GLES20.glGetUniformLocation(this.f30817w, "reset");
                    this.B = GLES20.glGetUniformLocation(this.f30817w, "time");
                    this.C = GLES20.glGetUniformLocation(this.f30817w, "deltaTime");
                    this.D = GLES20.glGetUniformLocation(this.f30817w, "particlesCount");
                    this.E = GLES20.glGetUniformLocation(this.f30817w, "size");
                    this.F = GLES20.glGetUniformLocation(this.f30817w, "gridSize");
                    this.J = GLES20.glGetUniformLocation(this.f30817w, "tex");
                    this.H = GLES20.glGetUniformLocation(this.f30817w, "seed");
                    this.K = GLES20.glGetUniformLocation(this.f30817w, "dp");
                    this.L = GLES20.glGetUniformLocation(this.f30817w, "longevity");
                    this.M = GLES20.glGetUniformLocation(this.f30817w, "offset");
                    this.N = GLES20.glGetUniformLocation(this.f30817w, "scale");
                    this.O = GLES20.glGetUniformLocation(this.f30817w, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f30813f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f30817w);
                    GLES20.glUniform2f(this.E, this.e, this.f30813f);
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
                                    x01 x01Var = (x01) arrayList.get(i11);
                                    if (x01Var.f30468a.contains(view)) {
                                        x01Var.a();
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
                            x01 x01Var2 = (x01) arrayList.get(i11);
                            x01Var2.f30472g += message.arg1;
                            x01Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((x01) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f30811b.get()) {
                this.e = i12;
                this.f30813f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.E, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f30811b.get()) {
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
        AtomicBoolean atomicBoolean = this.f30811b;
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
            ((x01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f30812c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        a11.b(this.d);
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
                    b((x01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            FileLog.e(e);
            while (i10 < arrayList.size()) {
                x01 x01Var = (x01) arrayList.get(i10);
                Runnable runnable = x01Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                x01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new mc(12));
            j();
        }
    }
}
