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
public final class ry extends org.telegram.messenger.q5 {
    public final float[] D;
    public final int[] E;
    public boolean F;
    public boolean G;
    public final y9 H;
    public da I;
    public final vy J;
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
    public final SurfaceTexture f37815a;
    public long f37816a0;
    public EGL10 f37817b;
    public final ax f37818b0;
    public EGLDisplay f37819c;
    public boolean f37820c0;
    public EGLContext d;
    public final Runnable f37821d0;
    public EGLSurface f37822e;
    public boolean f37823f;
    public final boolean h;
    public volatile int f37824n;
    public volatile int f37825r;
    public Bitmap f37826s;
    public final int f37827w;
    public SurfaceTexture f37828x;
    public boolean f37829y;

    public ry(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z9, boolean z10, y9 y9Var, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.f37821d0 = new oy(this, 1);
        this.f37815a = surfaceTexture;
        this.f37824n = i10;
        this.f37825r = i11;
        this.f37826s = bitmap;
        this.f37827w = i7;
        this.H = y9Var;
        boolean z11 = y9Var != null;
        this.G = z11;
        if (z11) {
            da daVar = new da();
            this.I = daVar;
            y9 y9Var2 = daVar.f32817t;
            if (y9Var2 != null && y9Var2.f40597m != null) {
                y9Var2.f40597m = null;
            }
            daVar.f32817t = y9Var;
            if (y9Var != null && y9Var.f40597m != daVar) {
                y9Var.f40597m = daVar;
                y9Var.d();
            }
        }
        this.h = false;
        vy vyVar = new vy(false, null);
        this.J = vyVar;
        vyVar.f39731i1 = z10;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z9) {
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

    public static void a(ry ryVar) {
        ty tyVar;
        if (ryVar.f37823f) {
            ryVar.b();
            if (ryVar.f37829y) {
                ryVar.f37828x.updateTexImage();
                ryVar.f37828x.getTransformMatrix(ryVar.D);
                ryVar.f();
                ryVar.f37829y = false;
                vy vyVar = ryVar.J;
                vyVar.P0 = ryVar.D;
                vyVar.W0 = false;
                ryVar.F = true;
            }
            if (ryVar.Z) {
                if (ryVar.h && ((tyVar = ryVar.J.f39723f1) == null || tyVar.n())) {
                    GLES20.glViewport(0, 0, ryVar.f37824n, ryVar.f37825r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(ryVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, ryVar.E[0]);
                    GLES20.glUniform1i(ryVar.S, 0);
                    GLES20.glEnableVertexAttribArray(ryVar.R);
                    int i7 = ryVar.R;
                    FloatBuffer floatBuffer = ryVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = ryVar.J.f39709a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(ryVar.P);
                    GLES20.glVertexAttribPointer(ryVar.P, 2, 5126, false, 8, (Buffer) ryVar.J.f39712b1);
                    GLES20.glUniformMatrix4fv(ryVar.Q, 1, false, ryVar.D, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    ryVar.f37817b.eglSwapBuffers(ryVar.f37819c, ryVar.f37822e);
                    da daVar = ryVar.I;
                    if (daVar != null) {
                        daVar.a(ryVar.E[0], ryVar.W, ryVar.X, ryVar.D);
                        return;
                    }
                    return;
                }
                if (ryVar.f37818b0 == null || ryVar.F) {
                    GLES20.glViewport(0, 0, ryVar.U, ryVar.V);
                    ryVar.J.f();
                    ryVar.J.d();
                    if (ryVar.f37818b0 == null) {
                        ryVar.J.e();
                    }
                    ryVar.J.c();
                    ryVar.T = ryVar.J.b();
                    ryVar.f37820c0 = true;
                }
                if (ryVar.f37820c0) {
                    GLES20.glViewport(0, 0, ryVar.f37824n, ryVar.f37825r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = ryVar.J.g(1 ^ (ryVar.T ? 1 : 0));
                    GLES20.glUseProgram(ryVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(ryVar.N, 0);
                    GLES20.glEnableVertexAttribArray(ryVar.M);
                    int i10 = ryVar.M;
                    FloatBuffer floatBuffer2 = ryVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = ryVar.J.f39709a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(ryVar.L);
                    GLES20.glVertexAttribPointer(ryVar.L, 2, 5126, false, 8, (Buffer) ryVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    ryVar.f37817b.eglSwapBuffers(ryVar.f37819c, ryVar.f37822e);
                    da daVar2 = ryVar.I;
                    if (daVar2 != null) {
                        daVar2.a(g10, ryVar.U, ryVar.V, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f37817b.eglGetCurrentContext()) || !this.f37822e.equals(this.f37817b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f37817b;
            EGLDisplay eGLDisplay = this.f37819c;
            EGLSurface eGLSurface = this.f37822e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z9, boolean z10, boolean z11) {
        postRunnable(new py(this, z9, z11, z10, 0));
    }

    public final void d(ty tyVar) {
        postRunnable(new fq(17, this, tyVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (!this.Z && (i7 = this.W) > 0 && (i10 = this.X) > 0) {
            this.J.i(this.f37826s, this.f37827w, this.E[0], i7, i10);
            this.Z = true;
            vy vyVar = this.J;
            this.U = vyVar.X0;
            this.V = vyVar.Y0;
        }
    }

    public final void finish() {
        this.f37826s = null;
        if (this.f37822e != null) {
            EGL10 egl10 = this.f37817b;
            EGLDisplay eGLDisplay = this.f37819c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f37817b.eglDestroySurface(this.f37819c, this.f37822e);
            this.f37822e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            y9 y9Var = this.H;
            if (y9Var != null) {
                synchronized (y9Var.f40591f) {
                    try {
                        if (y9Var.f40592g == eGLContext) {
                            y9Var.f40592g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f37817b.eglDestroyContext(this.f37819c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f37819c;
        if (eGLDisplay2 != null) {
            this.f37817b.eglTerminate(eGLDisplay2);
            this.f37819c = null;
        }
        SurfaceTexture surfaceTexture = this.f37815a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean g(fi.d7 d7Var) {
        int i7;
        String str;
        int h;
        int h7;
        if (d7Var != null) {
            i7 = d7Var.a();
        } else {
            i7 = 0;
        }
        if (i7 == 1) {
            str = org.telegram.messenger.g0.y2(null, 2131624045);
        } else if (i7 == 2) {
            str = org.telegram.messenger.g0.y2(null, 2131624046);
        } else {
            str = "";
        }
        if (i7 != 0) {
            h = vy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = vy.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = vy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = vy.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h7 == 0) {
            return false;
        }
        int i10 = this.O;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.O = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.O, h7);
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

    public final void h(int i7, int i10) {
        if (this.I == null) {
            return;
        }
        postRunnable(new ny(this, i7, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        da daVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f37817b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f37819c = eglGetDisplay;
        boolean z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f37817b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f37817b.eglChooseConfig(this.f37819c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                y9 y9Var = this.H;
                if (y9Var != null) {
                    synchronized (y9Var.f40591f) {
                        try {
                            eGLContext = y9Var.f40592g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f37817b.eglCreateContext(this.f37819c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    y9 y9Var2 = this.H;
                    if (y9Var2 != null) {
                        y9Var2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f37815a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f37817b.eglCreateWindowSurface(this.f37819c, eGLConfig, surfaceTexture, null);
                        this.f37822e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f37817b.eglMakeCurrent(this.f37819c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f25191a) {
                                    org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = vy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = vy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h7 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.K = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.K, h7);
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
                                    if (g(null)) {
                                        Bitmap bitmap = this.f37826s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.f37826s.getHeight();
                                        } else {
                                            i7 = this.W;
                                            i10 = this.X;
                                        }
                                        int i11 = i7;
                                        int i12 = i10;
                                        if (this.f37818b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.D, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f37828x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new qy(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.h3(new oy(this, 2));
                                        }
                                        if (this.G && (daVar = this.I) != null && !daVar.b(this.f37824n / this.f37825r, this.H.f40587a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.J.i(this.f37826s, this.f37827w, this.E[0], i11, i12);
                                                this.Z = true;
                                                vy vyVar = this.J;
                                                this.U = vyVar.X0;
                                                this.V = vyVar.Y0;
                                            }
                                            z9 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25191a) {
                                org.telegram.messenger.camera.q.t(this.f37817b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f37823f = z9;
        super.run();
    }

    public ry(SurfaceTexture surfaceTexture, ax axVar, fi.d7 d7Var, y9 y9Var, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.f37821d0 = new oy(this, 1);
        this.f37815a = surfaceTexture;
        this.f37824n = i7;
        this.f37825r = i10;
        this.f37818b0 = axVar;
        this.H = y9Var;
        boolean z9 = y9Var != null;
        this.G = z9;
        if (z9) {
            da daVar = new da();
            this.I = daVar;
            y9 y9Var2 = daVar.f32817t;
            if (y9Var2 != null && y9Var2.f40597m != null) {
                y9Var2.f40597m = null;
            }
            daVar.f32817t = y9Var;
            if (y9Var != null && y9Var.f40597m != daVar) {
                y9Var.f40597m = daVar;
                y9Var.d();
            }
        }
        this.h = true;
        this.J = new vy(true, d7Var);
        start();
    }
}
