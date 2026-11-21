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
public final class ez extends org.telegram.messenger.r5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final ca I;
    public ha J;
    public final hz K;
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
    public final SurfaceTexture f35020a;
    public boolean f35021a0;
    public EGL10 f35022b;
    public long f35023b0;
    public EGLDisplay f35024c;
    public final ky f35025c0;
    public EGLContext d;
    public boolean f35026d0;
    public EGLSurface f35027e;
    public final Runnable f35028e0;
    public boolean f35029f;
    public final boolean h;
    public volatile int f35030n;
    public volatile int f35031r;
    public Bitmap f35032s;
    public final int f35033w;
    public SurfaceTexture f35034x;
    public boolean f35035y;

    public ez(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z10, boolean z11, ca caVar, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f35028e0 = new bz(this, 1);
        this.f35020a = surfaceTexture;
        this.f35030n = i10;
        this.f35031r = i11;
        this.f35032s = bitmap;
        this.f35033w = i7;
        this.I = caVar;
        boolean z12 = caVar != null;
        this.H = z12;
        if (z12) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.f35863t;
            if (caVar2 != null && caVar2.f34141m != null) {
                caVar2.f34141m = null;
            }
            haVar.f35863t = caVar;
            if (caVar != null && caVar.f34141m != haVar) {
                caVar.f34141m = haVar;
                caVar.d();
            }
        }
        this.h = false;
        hz hzVar = new hz(false, null);
        this.K = hzVar;
        hzVar.f36029i1 = z11;
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

    public static void a(ez ezVar) {
        gz gzVar;
        if (ezVar.f35029f) {
            ezVar.b();
            if (ezVar.f35035y) {
                ezVar.f35034x.updateTexImage();
                ezVar.f35034x.getTransformMatrix(ezVar.E);
                ezVar.f();
                ezVar.f35035y = false;
                hz hzVar = ezVar.K;
                hzVar.P0 = ezVar.E;
                hzVar.W0 = false;
                ezVar.G = true;
            }
            if (ezVar.f35021a0) {
                if (ezVar.h && ((gzVar = ezVar.K.f36021f1) == null || gzVar.q())) {
                    GLES20.glViewport(0, 0, ezVar.f35030n, ezVar.f35031r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(ezVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, ezVar.F[0]);
                    GLES20.glUniform1i(ezVar.T, 0);
                    GLES20.glEnableVertexAttribArray(ezVar.S);
                    int i7 = ezVar.S;
                    FloatBuffer floatBuffer = ezVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = ezVar.K.f36007a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(ezVar.Q);
                    GLES20.glVertexAttribPointer(ezVar.Q, 2, 5126, false, 8, (Buffer) ezVar.K.f36010b1);
                    GLES20.glUniformMatrix4fv(ezVar.R, 1, false, ezVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    ezVar.f35022b.eglSwapBuffers(ezVar.f35024c, ezVar.f35027e);
                    ha haVar = ezVar.J;
                    if (haVar != null) {
                        haVar.a(ezVar.F[0], ezVar.X, ezVar.Y, ezVar.E);
                        return;
                    }
                    return;
                }
                if (ezVar.f35025c0 == null || ezVar.G) {
                    GLES20.glViewport(0, 0, ezVar.V, ezVar.W);
                    ezVar.K.f();
                    ezVar.K.d();
                    if (ezVar.f35025c0 == null) {
                        ezVar.K.e();
                    }
                    ezVar.K.c();
                    ezVar.U = ezVar.K.b();
                    ezVar.f35026d0 = true;
                }
                if (ezVar.f35026d0) {
                    GLES20.glViewport(0, 0, ezVar.f35030n, ezVar.f35031r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = ezVar.K.g(1 ^ (ezVar.U ? 1 : 0));
                    GLES20.glUseProgram(ezVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(ezVar.O, 0);
                    GLES20.glEnableVertexAttribArray(ezVar.N);
                    int i10 = ezVar.N;
                    FloatBuffer floatBuffer2 = ezVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = ezVar.K.f36007a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(ezVar.M);
                    GLES20.glVertexAttribPointer(ezVar.M, 2, 5126, false, 8, (Buffer) ezVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    ezVar.f35022b.eglSwapBuffers(ezVar.f35024c, ezVar.f35027e);
                    ha haVar2 = ezVar.J;
                    if (haVar2 != null) {
                        haVar2.a(g10, ezVar.V, ezVar.W, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f35022b.eglGetCurrentContext()) || !this.f35027e.equals(this.f35022b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f35022b;
            EGLDisplay eGLDisplay = this.f35024c;
            EGLSurface eGLSurface = this.f35027e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.s2.f26749a) {
                org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new cz(this, z10, z12, z11, 0));
    }

    public final void d(gz gzVar) {
        postRunnable(new ou(9, this, gzVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (!this.f35021a0 && (i7 = this.X) > 0 && (i10 = this.Y) > 0) {
            this.K.i(this.f35032s, this.f35033w, this.F[0], i7, i10);
            this.f35021a0 = true;
            hz hzVar = this.K;
            this.V = hzVar.X0;
            this.W = hzVar.Y0;
        }
    }

    public final void finish() {
        this.f35032s = null;
        if (this.f35027e != null) {
            EGL10 egl10 = this.f35022b;
            EGLDisplay eGLDisplay = this.f35024c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f35022b.eglDestroySurface(this.f35024c, this.f35027e);
            this.f35027e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ca caVar = this.I;
            if (caVar != null) {
                synchronized (caVar.f34135f) {
                    try {
                        if (caVar.f34136g == eGLContext) {
                            caVar.f34136g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f35022b.eglDestroyContext(this.f35024c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f35024c;
        if (eGLDisplay2 != null) {
            this.f35022b.eglTerminate(eGLDisplay2);
            this.f35024c = null;
        }
        SurfaceTexture surfaceTexture = this.f35020a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean g(hi.b7 b7Var) {
        int i7;
        String str;
        int h;
        int h7;
        if (b7Var != null) {
            i7 = b7Var.a();
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
            h = hz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = hz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = hz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = hz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new az(this, i7, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        ha haVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f35022b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f35024c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.s2.f26749a) {
                org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f35022b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26749a) {
                org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f35022b.eglChooseConfig(this.f35024c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ca caVar = this.I;
                if (caVar != null) {
                    synchronized (caVar.f34135f) {
                        try {
                            eGLContext = caVar.f34136g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f35022b.eglCreateContext(this.f35024c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26749a) {
                        org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ca caVar2 = this.I;
                    if (caVar2 != null) {
                        caVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f35020a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f35022b.eglCreateWindowSurface(this.f35024c, eGLConfig, surfaceTexture, null);
                        this.f35027e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f35022b.eglMakeCurrent(this.f35024c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.s2.f26749a) {
                                    org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = hz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = hz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f35032s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.f35032s.getHeight();
                                        } else {
                                            i7 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i11 = i7;
                                        int i12 = i10;
                                        if (this.f35025c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.f35034x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new dz(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.g3(new bz(this, 2));
                                        }
                                        if (this.H && (haVar = this.J) != null && !haVar.b(this.f35030n / this.f35031r, this.I.f34131a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.K.i(this.f35032s, this.f35033w, this.F[0], i11, i12);
                                                this.f35021a0 = true;
                                                hz hzVar = this.K;
                                                this.V = hzVar.X0;
                                                this.W = hzVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26749a) {
                                org.telegram.messenger.n10.v(this.f35022b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26749a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f35029f = z10;
        super.run();
    }

    public ez(SurfaceTexture surfaceTexture, ky kyVar, hi.b7 b7Var, ca caVar, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f35028e0 = new bz(this, 1);
        this.f35020a = surfaceTexture;
        this.f35030n = i7;
        this.f35031r = i10;
        this.f35025c0 = kyVar;
        this.I = caVar;
        boolean z10 = caVar != null;
        this.H = z10;
        if (z10) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.f35863t;
            if (caVar2 != null && caVar2.f34141m != null) {
                caVar2.f34141m = null;
            }
            haVar.f35863t = caVar;
            if (caVar != null && caVar.f34141m != haVar) {
                caVar.f34141m = haVar;
                caVar.d();
            }
        }
        this.h = true;
        this.K = new hz(true, b7Var);
        start();
    }
}
