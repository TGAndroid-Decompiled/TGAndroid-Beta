package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class wz extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ja H;
    public pa I;
    public final a00 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final FloatBuffer Y;
    public boolean Z;
    public final SurfaceTexture f30193a;
    public long f30194a0;
    public EGL10 f30195b;
    public final nv f30196b0;
    public EGLDisplay f30197c;
    public boolean f30198c0;
    public EGLContext d;
    public final Runnable f30199d0;
    public EGLSurface e;
    public boolean f30200f;
    public final boolean h;
    public volatile int f30201n;
    public volatile int f30202r;
    public Bitmap f30203s;
    public final int v;
    public SurfaceTexture f30204w;
    public boolean f30205x;
    public final float[] f30206y;

    public wz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ja jaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f30206y = new float[16];
        this.E = new int[1];
        this.f30199d0 = new tz(this, 1);
        this.f30193a = surfaceTexture;
        this.f30201n = i11;
        this.f30202r = i12;
        this.f30203s = bitmap;
        this.v = i10;
        this.H = jaVar;
        boolean z12 = jaVar != null;
        this.G = z12;
        if (z12) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f27297t;
            if (jaVar2 != null && jaVar2.f25349m != null) {
                jaVar2.f25349m = null;
            }
            paVar.f27297t = jaVar;
            if (jaVar != null && jaVar.f25349m != paVar) {
                jaVar.f25349m = paVar;
                jaVar.d();
            }
        }
        this.h = false;
        a00 a00Var = new a00(false, null);
        this.J = a00Var;
        a00Var.f22480i1 = z11;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z10) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Y = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void b(wz wzVar) {
        zz zzVar;
        if (wzVar.f30200f) {
            wzVar.c();
            if (wzVar.f30205x) {
                wzVar.f30204w.updateTexImage();
                wzVar.f30204w.getTransformMatrix(wzVar.f30206y);
                wzVar.g();
                wzVar.f30205x = false;
                a00 a00Var = wzVar.J;
                a00Var.P0 = wzVar.f30206y;
                a00Var.W0 = false;
                wzVar.F = true;
            }
            if (wzVar.Z) {
                if (wzVar.h && ((zzVar = wzVar.J.f22472f1) == null || zzVar.b())) {
                    GLES20.glViewport(0, 0, wzVar.f30201n, wzVar.f30202r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(wzVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, wzVar.E[0]);
                    GLES20.glUniform1i(wzVar.S, 0);
                    GLES20.glEnableVertexAttribArray(wzVar.R);
                    int i10 = wzVar.R;
                    FloatBuffer floatBuffer = wzVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = wzVar.J.f22459a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(wzVar.P);
                    GLES20.glVertexAttribPointer(wzVar.P, 2, 5126, false, 8, (Buffer) wzVar.J.f22462b1);
                    GLES20.glUniformMatrix4fv(wzVar.Q, 1, false, wzVar.f30206y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    wzVar.f30195b.eglSwapBuffers(wzVar.f30197c, wzVar.e);
                    pa paVar = wzVar.I;
                    if (paVar != null) {
                        paVar.a(wzVar.f30206y, wzVar.E[0], wzVar.W, wzVar.X);
                        return;
                    }
                    return;
                }
                if (wzVar.f30196b0 == null || wzVar.F) {
                    GLES20.glViewport(0, 0, wzVar.U, wzVar.V);
                    wzVar.J.f();
                    wzVar.J.d();
                    if (wzVar.f30196b0 == null) {
                        wzVar.J.e();
                    }
                    wzVar.J.c();
                    wzVar.T = wzVar.J.b();
                    wzVar.f30198c0 = true;
                }
                if (wzVar.f30198c0) {
                    GLES20.glViewport(0, 0, wzVar.f30201n, wzVar.f30202r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = wzVar.J.g(1 ^ (wzVar.T ? 1 : 0));
                    GLES20.glUseProgram(wzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(wzVar.N, 0);
                    GLES20.glEnableVertexAttribArray(wzVar.M);
                    int i11 = wzVar.M;
                    FloatBuffer floatBuffer2 = wzVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = wzVar.J.f22459a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(wzVar.L);
                    GLES20.glVertexAttribPointer(wzVar.L, 2, 5126, false, 8, (Buffer) wzVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    wzVar.f30195b.eglSwapBuffers(wzVar.f30197c, wzVar.e);
                    pa paVar2 = wzVar.I;
                    if (paVar2 != null) {
                        paVar2.a(null, g10, wzVar.U, wzVar.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f30195b.eglGetCurrentContext()) || !this.e.equals(this.f30195b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f30195b;
            EGLDisplay eGLDisplay = this.f30197c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new uz(this, z10, z12, z11, 0));
    }

    public final void f(zz zzVar) {
        postRunnable(new cv(9, this, zzVar));
    }

    public final void finish() {
        this.f30203s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f30195b;
            EGLDisplay eGLDisplay = this.f30197c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f30195b.eglDestroySurface(this.f30197c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ja jaVar = this.H;
            if (jaVar != null) {
                synchronized (jaVar.f25343f) {
                    try {
                        if (jaVar.f25344g == eGLContext) {
                            jaVar.f25344g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f30195b.eglDestroyContext(this.f30197c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f30197c;
        if (eGLDisplay2 != null) {
            this.f30195b.eglTerminate(eGLDisplay2);
            this.f30197c = null;
        }
        SurfaceTexture surfaceTexture = this.f30193a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f30203s, this.v, this.E[0], i10, i11);
            this.Z = true;
            a00 a00Var = this.J;
            this.U = a00Var.X0;
            this.V = a00Var.Y0;
        }
    }

    public final boolean h(ci.k8 k8Var) {
        int i10;
        String str;
        int h;
        int h10;
        if (k8Var != null) {
            i10 = k8Var.a();
        } else {
            i10 = 0;
        }
        if (i10 == 1) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else if (i10 == 2) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        } else {
            str = "";
        }
        if (i10 != 0) {
            h = a00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = a00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = a00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = a00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h10 == 0) {
            return false;
        }
        int i11 = this.O;
        if (i11 != 0) {
            GLES20.glDeleteProgram(i11);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.O = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.O, h10);
        GLES20.glBindAttribLocation(this.O, 0, "position");
        GLES20.glBindAttribLocation(this.O, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.O);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.O, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.O);
            this.O = 0;
        } else {
            this.P = GLES20.glGetAttribLocation(this.O, "position");
            this.R = GLES20.glGetAttribLocation(this.O, "inputTexCoord");
            this.S = GLES20.glGetUniformLocation(this.O, "sourceImage");
            this.Q = GLES20.glGetUniformLocation(this.O, "videoMatrix");
        }
        return true;
    }

    public final void i(int i10, int i11) {
        if (this.I == null) {
            return;
        }
        postRunnable(new sz(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        pa paVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f30195b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f30197c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f30195b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f30195b.eglChooseConfig(this.f30197c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ja jaVar = this.H;
                if (jaVar != null) {
                    synchronized (jaVar.f25343f) {
                        try {
                            eGLContext = jaVar.f25344g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f30195b.eglCreateContext(this.f30197c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ja jaVar2 = this.H;
                    if (jaVar2 != null) {
                        jaVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f30193a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f30195b.eglCreateWindowSurface(this.f30197c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f30195b.eglMakeCurrent(this.f30197c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = a00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = a00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.K = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.K, h10);
                                    GLES20.glBindAttribLocation(this.K, 0, "position");
                                    GLES20.glBindAttribLocation(this.K, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.K);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.K, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.K);
                                        this.K = 0;
                                    } else {
                                        this.L = GLES20.glGetAttribLocation(this.K, "position");
                                        this.M = GLES20.glGetAttribLocation(this.K, "inputTexCoord");
                                        this.N = GLES20.glGetUniformLocation(this.K, "sourceImage");
                                    }
                                    if (h(null)) {
                                        Bitmap bitmap = this.f30203s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f30203s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f30196b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f30206y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f30204w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new vz(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new tz(this, 2));
                                        }
                                        if (this.G && (paVar = this.I) != null && !paVar.b(this.f30201n / this.f30202r, this.H.f25340a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f30203s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                a00 a00Var = this.J;
                                                this.U = a00Var.X0;
                                                this.V = a00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ok.u(this.f30195b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f30200f = z10;
        super.run();
    }

    public wz(SurfaceTexture surfaceTexture, nv nvVar, ci.k8 k8Var, ja jaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f30206y = new float[16];
        this.E = new int[1];
        this.f30199d0 = new tz(this, 1);
        this.f30193a = surfaceTexture;
        this.f30201n = i10;
        this.f30202r = i11;
        this.f30196b0 = nvVar;
        this.H = jaVar;
        boolean z10 = jaVar != null;
        this.G = z10;
        if (z10) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f27297t;
            if (jaVar2 != null && jaVar2.f25349m != null) {
                jaVar2.f25349m = null;
            }
            paVar.f27297t = jaVar;
            if (jaVar != null && jaVar.f25349m != paVar) {
                jaVar.f25349m = paVar;
                jaVar.d();
            }
        }
        this.h = true;
        this.J = new a00(true, k8Var);
        start();
    }
}
