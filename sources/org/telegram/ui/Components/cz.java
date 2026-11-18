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
public final class cz extends org.telegram.messenger.r5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final ca I;
    public ha J;
    public final fz K;
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
    public final SurfaceTexture f34203a;
    public boolean f34204a0;
    public EGL10 f34205b;
    public long f34206b0;
    public EGLDisplay f34207c;
    public final iy f34208c0;
    public EGLContext d;
    public boolean f34209d0;
    public EGLSurface f34210e;
    public final Runnable f34211e0;
    public boolean f34212f;
    public final boolean h;
    public volatile int f34213n;
    public volatile int f34214r;
    public Bitmap f34215s;
    public final int f34216w;
    public SurfaceTexture f34217x;
    public boolean f34218y;

    public cz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z10, boolean z11, ca caVar, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f34211e0 = new zy(this, 1);
        this.f34203a = surfaceTexture;
        this.f34213n = i10;
        this.f34214r = i11;
        this.f34215s = bitmap;
        this.f34216w = i7;
        this.I = caVar;
        boolean z12 = caVar != null;
        this.H = z12;
        if (z12) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.f35843t;
            if (caVar2 != null && caVar2.f33951m != null) {
                caVar2.f33951m = null;
            }
            haVar.f35843t = caVar;
            if (caVar != null && caVar.f33951m != haVar) {
                caVar.f33951m = haVar;
                caVar.d();
            }
        }
        this.h = false;
        fz fzVar = new fz(false, null);
        this.K = fzVar;
        fzVar.f35213i1 = z11;
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

    public static void a(cz czVar) {
        ez ezVar;
        if (czVar.f34212f) {
            czVar.b();
            if (czVar.f34218y) {
                czVar.f34217x.updateTexImage();
                czVar.f34217x.getTransformMatrix(czVar.E);
                czVar.f();
                czVar.f34218y = false;
                fz fzVar = czVar.K;
                fzVar.P0 = czVar.E;
                fzVar.W0 = false;
                czVar.G = true;
            }
            if (czVar.f34204a0) {
                if (czVar.h && ((ezVar = czVar.K.f35205f1) == null || ezVar.q())) {
                    GLES20.glViewport(0, 0, czVar.f34213n, czVar.f34214r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(czVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, czVar.F[0]);
                    GLES20.glUniform1i(czVar.T, 0);
                    GLES20.glEnableVertexAttribArray(czVar.S);
                    int i7 = czVar.S;
                    FloatBuffer floatBuffer = czVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = czVar.K.f35191a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(czVar.Q);
                    GLES20.glVertexAttribPointer(czVar.Q, 2, 5126, false, 8, (Buffer) czVar.K.f35194b1);
                    GLES20.glUniformMatrix4fv(czVar.R, 1, false, czVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    czVar.f34205b.eglSwapBuffers(czVar.f34207c, czVar.f34210e);
                    ha haVar = czVar.J;
                    if (haVar != null) {
                        haVar.a(czVar.F[0], czVar.X, czVar.Y, czVar.E);
                        return;
                    }
                    return;
                }
                if (czVar.f34208c0 == null || czVar.G) {
                    GLES20.glViewport(0, 0, czVar.V, czVar.W);
                    czVar.K.f();
                    czVar.K.d();
                    if (czVar.f34208c0 == null) {
                        czVar.K.e();
                    }
                    czVar.K.c();
                    czVar.U = czVar.K.b();
                    czVar.f34209d0 = true;
                }
                if (czVar.f34209d0) {
                    GLES20.glViewport(0, 0, czVar.f34213n, czVar.f34214r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = czVar.K.g(1 ^ (czVar.U ? 1 : 0));
                    GLES20.glUseProgram(czVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(czVar.O, 0);
                    GLES20.glEnableVertexAttribArray(czVar.N);
                    int i10 = czVar.N;
                    FloatBuffer floatBuffer2 = czVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = czVar.K.f35191a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(czVar.M);
                    GLES20.glVertexAttribPointer(czVar.M, 2, 5126, false, 8, (Buffer) czVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    czVar.f34205b.eglSwapBuffers(czVar.f34207c, czVar.f34210e);
                    ha haVar2 = czVar.J;
                    if (haVar2 != null) {
                        haVar2.a(g10, czVar.V, czVar.W, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f34205b.eglGetCurrentContext()) || !this.f34210e.equals(this.f34205b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f34205b;
            EGLDisplay eGLDisplay = this.f34207c;
            EGLSurface eGLSurface = this.f34210e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new az(this, z10, z12, z11, 0));
    }

    public final void d(ez ezVar) {
        postRunnable(new dw(7, this, ezVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (!this.f34204a0 && (i7 = this.X) > 0 && (i10 = this.Y) > 0) {
            this.K.i(this.f34215s, this.f34216w, this.F[0], i7, i10);
            this.f34204a0 = true;
            fz fzVar = this.K;
            this.V = fzVar.X0;
            this.W = fzVar.Y0;
        }
    }

    public final void finish() {
        this.f34215s = null;
        if (this.f34210e != null) {
            EGL10 egl10 = this.f34205b;
            EGLDisplay eGLDisplay = this.f34207c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f34205b.eglDestroySurface(this.f34207c, this.f34210e);
            this.f34210e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ca caVar = this.I;
            if (caVar != null) {
                synchronized (caVar.f33945f) {
                    try {
                        if (caVar.f33946g == eGLContext) {
                            caVar.f33946g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f34205b.eglDestroyContext(this.f34207c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f34207c;
        if (eGLDisplay2 != null) {
            this.f34205b.eglTerminate(eGLDisplay2);
            this.f34207c = null;
        }
        SurfaceTexture surfaceTexture = this.f34203a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean g(hi.c7 c7Var) {
        int i7;
        String str;
        int h;
        int h7;
        if (c7Var != null) {
            i7 = c7Var.a();
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
            h = fz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = fz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = fz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = fz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new yy(this, i7, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        ha haVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f34205b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f34207c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f34205b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f34205b.eglChooseConfig(this.f34207c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ca caVar = this.I;
                if (caVar != null) {
                    synchronized (caVar.f33945f) {
                        try {
                            eGLContext = caVar.f33946g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f34205b.eglCreateContext(this.f34207c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ca caVar2 = this.I;
                    if (caVar2 != null) {
                        caVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f34203a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f34205b.eglCreateWindowSurface(this.f34207c, eGLConfig, surfaceTexture, null);
                        this.f34210e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f34205b.eglMakeCurrent(this.f34207c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.s2.f26723a) {
                                    org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = fz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = fz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f34215s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.f34215s.getHeight();
                                        } else {
                                            i7 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i11 = i7;
                                        int i12 = i10;
                                        if (this.f34208c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.f34217x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new bz(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.g3(new zy(this, 2));
                                        }
                                        if (this.H && (haVar = this.J) != null && !haVar.b(this.f34213n / this.f34214r, this.I.f33941a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.K.i(this.f34215s, this.f34216w, this.F[0], i11, i12);
                                                this.f34204a0 = true;
                                                fz fzVar = this.K;
                                                this.V = fzVar.X0;
                                                this.W = fzVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26723a) {
                                org.telegram.messenger.n10.v(this.f34205b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f34212f = z10;
        super.run();
    }

    public cz(SurfaceTexture surfaceTexture, iy iyVar, hi.c7 c7Var, ca caVar, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f34211e0 = new zy(this, 1);
        this.f34203a = surfaceTexture;
        this.f34213n = i7;
        this.f34214r = i10;
        this.f34208c0 = iyVar;
        this.I = caVar;
        boolean z10 = caVar != null;
        this.H = z10;
        if (z10) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.f35843t;
            if (caVar2 != null && caVar2.f33951m != null) {
                caVar2.f33951m = null;
            }
            haVar.f35843t = caVar;
            if (caVar != null && caVar.f33951m != haVar) {
                caVar.f33951m = haVar;
                caVar.d();
            }
        }
        this.h = true;
        this.K = new fz(true, c7Var);
        start();
    }
}
