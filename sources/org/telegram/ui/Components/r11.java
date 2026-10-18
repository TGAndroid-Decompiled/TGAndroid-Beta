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
public final class r11 extends DispatchQueue {
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
    public boolean f29789a;
    public final AtomicBoolean f29790b;
    public final SurfaceTexture f29791c;
    public o11 d;
    public int e;
    public int f29792f;
    public EGL10 h;
    public EGLDisplay f29793n;
    public EGLConfig f29794r;
    public EGLSurface f29795s;
    public EGLContext v;
    public int f29796w;
    public int f29797x;
    public int f29798y;

    public r11(SurfaceTexture surfaceTexture, o11 o11Var, o11 o11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.f29790b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.f29791c = surfaceTexture;
        this.d = o11Var2;
        this.e = i10;
        this.f29792f = i11;
        start();
    }

    public final void b(q11 q11Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, q11Var.A, 0);
        GLES20.glBindTexture(3553, q11Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, q11Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        q11Var.C.recycle();
        q11Var.C = null;
        if (q11Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((q11) obj).a();
            }
            this.T.clear();
        }
        this.T.add(q11Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.f29790b.get()) {
            AndroidUtilities.runOnUIThread(new ai.fb(runnable, runnable2, 1));
            t11.b(this.d);
            this.d = null;
            return;
        }
        q11 q11Var = new q11(this, matrix, bitmap, runnable, runnable2);
        getHandler();
        this.S = true;
        postRunnable(new p11(this, q11Var, 1));
    }

    public final void d(View view, float f7, Runnable runnable) {
        if (!this.f29790b.get()) {
            if (view != null) {
                view.setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            o11 o11Var = this.d;
            if (o11Var != null) {
                AndroidUtilities.runOnUIThread(o11Var);
                this.d = null;
                return;
            }
            return;
        }
        q11 q11Var = new q11(this, view, f7, runnable);
        getHandler();
        this.S = true;
        postRunnable(new p11(this, q11Var, 2));
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (!this.f29790b.get()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setVisibility(8);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            o11 o11Var = this.d;
            if (o11Var != null) {
                AndroidUtilities.runOnUIThread(o11Var);
                this.d = null;
                return;
            }
            return;
        }
        q11 q11Var = new q11(this, arrayList, runnable);
        this.S = true;
        postRunnable(new p11(this, q11Var, 0));
    }

    public final void g() {
        long j10;
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
        if (this.f29790b.get()) {
            GLES20.glClear(16384);
            int i15 = 0;
            int i16 = 0;
            while (i16 < this.T.size()) {
                q11 q11Var = (q11) this.T.get(i16);
                if (q11Var.d) {
                    ArrayList arrayList = this.T;
                    int i17 = i15;
                    int i18 = i17;
                    while (i17 < arrayList.size()) {
                        i18 += ((q11) arrayList.get(i17)).f29535u;
                        i17++;
                    }
                    float f13 = q11Var.f29535u;
                    float f14 = f13 / i18;
                    int[] iArr = q11Var.B;
                    int i19 = q11Var.f29534t;
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
                    if (!q11Var.E.f29789a) {
                        i20 = i11;
                    }
                    if (q11Var.D) {
                        i20 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    q11Var.f29533s = Utilities.clamp((int) ((i10 * i19) / (max * max)), (int) (i20 * f14), 10);
                    float f15 = i19;
                    float f16 = f15 / f13;
                    int round = (int) Math.round(Math.sqrt(clamp / f16));
                    q11Var.f29536w = round;
                    q11Var.v = Math.round(q11Var.f29533s / round);
                    while (true) {
                        i12 = q11Var.v;
                        i13 = q11Var.f29536w;
                        i14 = i12 * i13;
                        if (i14 >= q11Var.f29533s) {
                            break;
                        } else if (i12 / i13 < f16) {
                            q11Var.v = i12 + 1;
                        } else {
                            q11Var.f29536w = i13 + 1;
                        }
                    }
                    q11Var.f29533s = i14;
                    q11Var.f29537x = Math.max(f15 / i12, f13 / i13);
                    GLES20.glGenBuffers(2, iArr, i15);
                    for (int i21 = i15; i21 < 2; i21++) {
                        GLES20.glBindBuffer(34962, iArr[i21]);
                        GLES20.glBufferData(34962, q11Var.f29533s * 28, null, 35048);
                    }
                    if (q11Var.e != null) {
                        this.U.add(q11Var);
                    }
                }
                this.V = true;
                int[] iArr2 = q11Var.B;
                boolean z10 = q11Var.D;
                float f17 = q11Var.f29527m;
                int i22 = q11Var.f29535u;
                int i23 = q11Var.f29534t;
                Matrix matrix = q11Var.f29532r;
                r11 r11Var = q11Var.E;
                long nanoTime = System.nanoTime();
                if (q11Var.f29519b < 0) {
                    d = 0.0d;
                } else {
                    d = (nanoTime - j10) / 1.0E9d;
                }
                q11Var.f29519b = nanoTime;
                if (q11Var.f29528n && !q11Var.f29529o) {
                    matrix.reset();
                    matrix.postScale(i23, i22);
                    matrix.postTranslate(q11Var.f29523i, q11Var.f29524j);
                    q11Var.c();
                }
                q11Var.f29520c = (float) ((f17 * d) + q11Var.f29520c);
                GLES20.glUniformMatrix3fv(r11Var.f29797x, 1, false, q11Var.f29530p, 0);
                int i24 = r11Var.f29798y;
                if (q11Var.d) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                GLES20.glUniform1f(i24, f7);
                GLES20.glUniform1f(r11Var.E, q11Var.f29520c);
                GLES20.glUniform1f(r11Var.F, ((float) d) * f17);
                GLES20.glUniform1f(r11Var.G, q11Var.f29533s);
                GLES20.glUniform3f(r11Var.I, q11Var.v, q11Var.f29536w, q11Var.f29537x);
                GLES20.glUniform2f(r11Var.P, q11Var.f29522g, q11Var.h);
                int i25 = r11Var.Q;
                if (z10) {
                    f10 = 0.8f;
                } else {
                    f10 = 1.0f;
                }
                GLES20.glUniform1f(i25, f10);
                int i26 = r11Var.R;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                GLES20.glUniform1f(i26, f11);
                GLES20.glUniform2f(r11Var.J, i23, i22);
                GLES20.glUniform1f(r11Var.K, q11Var.f29538y);
                GLES20.glUniform2f(r11Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(r11Var.N, q11Var.f29525k);
                GLES20.glUniform1f(r11Var.O, q11Var.f29526l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, q11Var.A[0]);
                GLES20.glUniform1i(r11Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[q11Var.f29539z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - q11Var.f29539z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, q11Var.f29533s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                q11Var.d = false;
                q11Var.f29539z = 1 - q11Var.f29539z;
                float f18 = q11Var.f29520c;
                float f19 = q11Var.f29526l;
                if (q11Var.D) {
                    f12 = 2.0f;
                } else {
                    f12 = 0.9f;
                }
                if (f18 > f19 + f12) {
                    q11Var.a();
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        for (int i28 = i27; i28 < this.U.size(); i28++) {
                            AndroidUtilities.runOnUIThread(((q11) this.U.get(i28)).e);
                        }
                        this.U.clear();
                        for (int i29 = i27; i29 < this.T.size(); i29++) {
                            ((q11) this.T.get(i29)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new sc(16));
                        j();
                        return;
                    }
                }
            }
            this.h.eglSwapBuffers(this.f29793n, this.f29795s);
            for (int i30 = i27; i30 < this.U.size(); i30++) {
                AndroidUtilities.runOnUIThread(((q11) this.U.get(i30)).e);
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
        this.f29793n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
        } else if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.h.eglChooseConfig(this.f29793n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                FileLog.e("ThanosEffect: failed eglChooseConfig");
                i();
                return;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.f29794r = eGLConfig;
            EGLContext eglCreateContext = this.h.eglCreateContext(this.f29793n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
            this.v = eglCreateContext;
            if (eglCreateContext == null) {
                FileLog.e("ThanosEffect: eglContext == null");
                j();
                return;
            }
            EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.f29793n, this.f29794r, this.f29791c, null);
            this.f29795s = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                FileLog.e("ThanosEffect: eglSurface == null");
                j();
            } else if (!this.h.eglMakeCurrent(this.f29793n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
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
                    this.f29796w = glCreateProgram;
                    if (glCreateProgram == 0) {
                        FileLog.e("ThanosEffect: drawProgram == 0");
                        j();
                        return;
                    }
                    GLES20.glAttachShader(glCreateProgram, glCreateShader);
                    GLES20.glAttachShader(this.f29796w, glCreateShader2);
                    GLES30.glTransformFeedbackVaryings(this.f29796w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
                    GLES20.glLinkProgram(this.f29796w);
                    GLES20.glGetProgramiv(this.f29796w, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.f29796w));
                        j();
                        return;
                    }
                    this.f29797x = GLES20.glGetUniformLocation(this.f29796w, "matrix");
                    this.J = GLES20.glGetUniformLocation(this.f29796w, "rectSize");
                    this.L = GLES20.glGetUniformLocation(this.f29796w, "rectPos");
                    this.f29798y = GLES20.glGetUniformLocation(this.f29796w, "reset");
                    this.E = GLES20.glGetUniformLocation(this.f29796w, "time");
                    this.F = GLES20.glGetUniformLocation(this.f29796w, "deltaTime");
                    this.G = GLES20.glGetUniformLocation(this.f29796w, "particlesCount");
                    this.H = GLES20.glGetUniformLocation(this.f29796w, "size");
                    this.I = GLES20.glGetUniformLocation(this.f29796w, "gridSize");
                    this.M = GLES20.glGetUniformLocation(this.f29796w, "tex");
                    this.K = GLES20.glGetUniformLocation(this.f29796w, "seed");
                    this.N = GLES20.glGetUniformLocation(this.f29796w, "dp");
                    this.O = GLES20.glGetUniformLocation(this.f29796w, "longevity");
                    this.P = GLES20.glGetUniformLocation(this.f29796w, "offset");
                    this.Q = GLES20.glGetUniformLocation(this.f29796w, "scale");
                    this.R = GLES20.glGetUniformLocation(this.f29796w, "uvOffset");
                    GLES20.glViewport(0, 0, this.e, this.f29792f);
                    GLES20.glDisable(3042);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glUseProgram(this.f29796w);
                    GLES20.glUniform2f(this.H, this.e, this.f29792f);
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
                                    q11 q11Var = (q11) arrayList.get(i11);
                                    if (q11Var.f29518a.contains(view)) {
                                        q11Var.a();
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
                            q11 q11Var2 = (q11) arrayList.get(i11);
                            q11Var2.f29522g += message.arg1;
                            q11Var2.h += message.arg2;
                            i11++;
                        }
                        return;
                    }
                    b((q11) message.obj);
                    return;
                }
                j();
                return;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.f29790b.get()) {
                this.e = i12;
                this.f29792f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            g();
            return;
        }
        g();
    }

    public final void i() {
        if (!this.f29790b.get()) {
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
        AtomicBoolean atomicBoolean = this.f29790b;
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
            ((q11) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.f29791c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        t11.b(this.d);
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
                    b((q11) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            FileLog.e(e);
            while (i10 < arrayList.size()) {
                q11 q11Var = (q11) arrayList.get(i10);
                Runnable runnable = q11Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                q11Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new sc(15));
            j();
        }
    }
}
