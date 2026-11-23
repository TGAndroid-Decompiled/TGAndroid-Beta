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
public final class bz extends org.telegram.messenger.r5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final ba I;
    public ga J;
    public final ez K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final FloatBuffer Z;
    public final SurfaceTexture f33843a;
    public boolean f33844a0;
    public EGL10 f33845b;
    public long f33846b0;
    public EGLDisplay f33847c;
    public final hy f33848c0;
    public EGLContext d;
    public boolean f33849d0;
    public EGLSurface f33850e;
    public final Runnable f33851e0;
    public boolean f33852f;
    public final boolean h;
    public volatile int f33853n;
    public volatile int f33854r;
    public Bitmap f33855s;
    public final int f33856w;
    public SurfaceTexture f33857x;
    public boolean f33858y;

    public bz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z10, boolean z11, ba baVar, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f33851e0 = new yy(this, 1);
        this.f33843a = surfaceTexture;
        this.f33853n = i10;
        this.f33854r = i11;
        this.f33855s = bitmap;
        this.f33856w = i7;
        this.I = baVar;
        boolean z12 = baVar != null;
        this.H = z12;
        if (z12) {
            ga gaVar = new ga();
            this.J = gaVar;
            ba baVar2 = gaVar.f35392t;
            if (baVar2 != null && baVar2.f33717m != null) {
                baVar2.f33717m = null;
            }
            gaVar.f35392t = baVar;
            if (baVar != null && baVar.f33717m != gaVar) {
                baVar.f33717m = gaVar;
                baVar.d();
            }
        }
        this.h = false;
        ez ezVar = new ez(false, null);
        this.K = ezVar;
        ezVar.f34891i1 = z11;
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
        this.Z = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void a(bz bzVar) {
        dz dzVar;
        if (bzVar.f33852f) {
            bzVar.b();
            if (bzVar.f33858y) {
                bzVar.f33857x.updateTexImage();
                bzVar.f33857x.getTransformMatrix(bzVar.E);
                bzVar.f();
                bzVar.f33858y = false;
                ez ezVar = bzVar.K;
                ezVar.P0 = bzVar.E;
                ezVar.W0 = false;
                bzVar.G = true;
            }
            if (bzVar.f33844a0) {
                if (bzVar.h && ((dzVar = bzVar.K.f34883f1) == null || dzVar.x())) {
                    GLES20.glViewport(0, 0, bzVar.f33853n, bzVar.f33854r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(bzVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, bzVar.F[0]);
                    GLES20.glUniform1i(bzVar.T, 0);
                    GLES20.glEnableVertexAttribArray(bzVar.S);
                    int i7 = bzVar.S;
                    FloatBuffer floatBuffer = bzVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = bzVar.K.f34869a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(bzVar.Q);
                    GLES20.glVertexAttribPointer(bzVar.Q, 2, 5126, false, 8, (Buffer) bzVar.K.f34872b1);
                    GLES20.glUniformMatrix4fv(bzVar.R, 1, false, bzVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    bzVar.f33845b.eglSwapBuffers(bzVar.f33847c, bzVar.f33850e);
                    ga gaVar = bzVar.J;
                    if (gaVar != null) {
                        gaVar.a(bzVar.F[0], bzVar.X, bzVar.Y, bzVar.E);
                        return;
                    }
                    return;
                }
                if (bzVar.f33848c0 == null || bzVar.G) {
                    GLES20.glViewport(0, 0, bzVar.V, bzVar.W);
                    bzVar.K.f();
                    bzVar.K.d();
                    if (bzVar.f33848c0 == null) {
                        bzVar.K.e();
                    }
                    bzVar.K.c();
                    bzVar.U = bzVar.K.b();
                    bzVar.f33849d0 = true;
                }
                if (bzVar.f33849d0) {
                    GLES20.glViewport(0, 0, bzVar.f33853n, bzVar.f33854r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = bzVar.K.g(1 ^ (bzVar.U ? 1 : 0));
                    GLES20.glUseProgram(bzVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(bzVar.O, 0);
                    GLES20.glEnableVertexAttribArray(bzVar.N);
                    int i10 = bzVar.N;
                    FloatBuffer floatBuffer2 = bzVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = bzVar.K.f34869a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(bzVar.M);
                    GLES20.glVertexAttribPointer(bzVar.M, 2, 5126, false, 8, (Buffer) bzVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    bzVar.f33845b.eglSwapBuffers(bzVar.f33847c, bzVar.f33850e);
                    ga gaVar2 = bzVar.J;
                    if (gaVar2 != null) {
                        gaVar2.a(g10, bzVar.V, bzVar.W, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f33845b.eglGetCurrentContext()) || !this.f33850e.equals(this.f33845b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f33845b;
            EGLDisplay eGLDisplay = this.f33847c;
            EGLSurface eGLSurface = this.f33850e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.s2.f26829a) {
                org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new zy(this, z10, z12, z11, 0));
    }

    public final void d(dz dzVar) {
        postRunnable(new bt(11, this, dzVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (!this.f33844a0 && (i7 = this.X) > 0 && (i10 = this.Y) > 0) {
            this.K.i(this.f33855s, this.f33856w, this.F[0], i7, i10);
            this.f33844a0 = true;
            ez ezVar = this.K;
            this.V = ezVar.X0;
            this.W = ezVar.Y0;
        }
    }

    public final void finish() {
        this.f33855s = null;
        if (this.f33850e != null) {
            EGL10 egl10 = this.f33845b;
            EGLDisplay eGLDisplay = this.f33847c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f33845b.eglDestroySurface(this.f33847c, this.f33850e);
            this.f33850e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ba baVar = this.I;
            if (baVar != null) {
                synchronized (baVar.f33711f) {
                    try {
                        if (baVar.f33712g == eGLContext) {
                            baVar.f33712g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f33845b.eglDestroyContext(this.f33847c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f33847c;
        if (eGLDisplay2 != null) {
            this.f33845b.eglTerminate(eGLDisplay2);
            this.f33847c = null;
        }
        SurfaceTexture surfaceTexture = this.f33843a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean g(hi.w7 w7Var) {
        int i7;
        String str;
        int h;
        int h7;
        if (w7Var != null) {
            i7 = w7Var.a();
        } else {
            i7 = 0;
        }
        if (i7 == 1) {
            str = org.telegram.messenger.g0.y2(null, 2131624046);
        } else if (i7 == 2) {
            str = org.telegram.messenger.g0.y2(null, 2131624047);
        } else {
            str = "";
        }
        if (i7 != 0) {
            h = ez.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = ez.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = ez.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = ez.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h7 == 0) {
            return false;
        }
        int i10 = this.P;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.P = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.P, h7);
        GLES20.glBindAttribLocation(this.P, 0, "position");
        GLES20.glBindAttribLocation(this.P, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.P);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.P, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.P);
            this.P = 0;
        } else {
            this.Q = GLES20.glGetAttribLocation(this.P, "position");
            this.S = GLES20.glGetAttribLocation(this.P, "inputTexCoord");
            this.T = GLES20.glGetUniformLocation(this.P, "sourceImage");
            this.R = GLES20.glGetUniformLocation(this.P, "videoMatrix");
        }
        return true;
    }

    public final void h(int i7, int i10) {
        if (this.J == null) {
            return;
        }
        postRunnable(new xy(this, i7, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        ga gaVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f33845b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f33847c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.s2.f26829a) {
                org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f33845b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26829a) {
                org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f33845b.eglChooseConfig(this.f33847c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ba baVar = this.I;
                if (baVar != null) {
                    synchronized (baVar.f33711f) {
                        try {
                            eGLContext = baVar.f33712g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f33845b.eglCreateContext(this.f33847c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26829a) {
                        org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ba baVar2 = this.I;
                    if (baVar2 != null) {
                        baVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f33843a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f33845b.eglCreateWindowSurface(this.f33847c, eGLConfig, surfaceTexture, null);
                        this.f33850e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f33845b.eglMakeCurrent(this.f33847c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.s2.f26829a) {
                                    org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = ez.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = ez.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h7 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.L = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.L, h7);
                                    GLES20.glBindAttribLocation(this.L, 0, "position");
                                    GLES20.glBindAttribLocation(this.L, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.L);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.L, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.L);
                                        this.L = 0;
                                    } else {
                                        this.M = GLES20.glGetAttribLocation(this.L, "position");
                                        this.N = GLES20.glGetAttribLocation(this.L, "inputTexCoord");
                                        this.O = GLES20.glGetUniformLocation(this.L, "sourceImage");
                                    }
                                    if (g(null)) {
                                        Bitmap bitmap = this.f33855s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.f33855s.getHeight();
                                        } else {
                                            i7 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i11 = i7;
                                        int i12 = i10;
                                        if (this.f33848c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.f33857x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new az(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.g3(new yy(this, 2));
                                        }
                                        if (this.H && (gaVar = this.J) != null && !gaVar.b(this.f33853n / this.f33854r, this.I.f33707a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.K.i(this.f33855s, this.f33856w, this.F[0], i11, i12);
                                                this.f33844a0 = true;
                                                ez ezVar = this.K;
                                                this.V = ezVar.X0;
                                                this.W = ezVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26829a) {
                                org.telegram.messenger.m10.v(this.f33845b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26829a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f33852f = z10;
        super.run();
    }

    public bz(SurfaceTexture surfaceTexture, hy hyVar, hi.w7 w7Var, ba baVar, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f33851e0 = new yy(this, 1);
        this.f33843a = surfaceTexture;
        this.f33853n = i7;
        this.f33854r = i10;
        this.f33848c0 = hyVar;
        this.I = baVar;
        boolean z10 = baVar != null;
        this.H = z10;
        if (z10) {
            ga gaVar = new ga();
            this.J = gaVar;
            ba baVar2 = gaVar.f35392t;
            if (baVar2 != null && baVar2.f33717m != null) {
                baVar2.f33717m = null;
            }
            gaVar.f35392t = baVar;
            if (baVar != null && baVar.f33717m != gaVar) {
                baVar.f33717m = gaVar;
                baVar.d();
            }
        }
        this.h = true;
        this.K = new ez(true, w7Var);
        start();
    }
}
