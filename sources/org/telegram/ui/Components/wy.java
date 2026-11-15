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
public final class wy extends org.telegram.messenger.q5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final u9 I;
    public z9 J;
    public final zy K;
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
    public final SurfaceTexture f41468a;
    public boolean f41469a0;
    public EGL10 f41470b;
    public long f41471b0;
    public EGLDisplay f41472c;
    public final gx f41473c0;
    public EGLContext d;
    public boolean f41474d0;
    public EGLSurface f41475e;
    public final Runnable f41476e0;
    public boolean f41477f;
    public final boolean h;
    public volatile int f41478n;
    public volatile int f41479r;
    public Bitmap f41480s;
    public final int f41481w;
    public SurfaceTexture f41482x;
    public boolean f41483y;

    public wy(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z10, boolean z11, u9 u9Var, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f41476e0 = new ty(this, 1);
        this.f41468a = surfaceTexture;
        this.f41478n = i10;
        this.f41479r = i11;
        this.f41480s = bitmap;
        this.f41481w = i7;
        this.I = u9Var;
        boolean z12 = u9Var != null;
        this.H = z12;
        if (z12) {
            z9 z9Var = new z9();
            this.J = z9Var;
            u9 u9Var2 = z9Var.f42325t;
            if (u9Var2 != null && u9Var2.f39977m != null) {
                u9Var2.f39977m = null;
            }
            z9Var.f42325t = u9Var;
            if (u9Var != null && u9Var.f39977m != z9Var) {
                u9Var.f39977m = z9Var;
                u9Var.d();
            }
        }
        this.h = false;
        zy zyVar = new zy(false, null);
        this.K = zyVar;
        zyVar.f42462i1 = z11;
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

    public static void a(wy wyVar) {
        yy yyVar;
        if (wyVar.f41477f) {
            wyVar.b();
            if (wyVar.f41483y) {
                wyVar.f41482x.updateTexImage();
                wyVar.f41482x.getTransformMatrix(wyVar.E);
                wyVar.f();
                wyVar.f41483y = false;
                zy zyVar = wyVar.K;
                zyVar.P0 = wyVar.E;
                zyVar.W0 = false;
                wyVar.G = true;
            }
            if (wyVar.f41469a0) {
                if (wyVar.h && ((yyVar = wyVar.K.f42454f1) == null || yyVar.h())) {
                    GLES20.glViewport(0, 0, wyVar.f41478n, wyVar.f41479r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(wyVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, wyVar.F[0]);
                    GLES20.glUniform1i(wyVar.T, 0);
                    GLES20.glEnableVertexAttribArray(wyVar.S);
                    int i7 = wyVar.S;
                    FloatBuffer floatBuffer = wyVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = wyVar.K.f42440a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(wyVar.Q);
                    GLES20.glVertexAttribPointer(wyVar.Q, 2, 5126, false, 8, (Buffer) wyVar.K.f42443b1);
                    GLES20.glUniformMatrix4fv(wyVar.R, 1, false, wyVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    wyVar.f41470b.eglSwapBuffers(wyVar.f41472c, wyVar.f41475e);
                    z9 z9Var = wyVar.J;
                    if (z9Var != null) {
                        z9Var.a(wyVar.F[0], wyVar.X, wyVar.Y, wyVar.E);
                        return;
                    }
                    return;
                }
                if (wyVar.f41473c0 == null || wyVar.G) {
                    GLES20.glViewport(0, 0, wyVar.V, wyVar.W);
                    wyVar.K.f();
                    wyVar.K.d();
                    if (wyVar.f41473c0 == null) {
                        wyVar.K.e();
                    }
                    wyVar.K.c();
                    wyVar.U = wyVar.K.b();
                    wyVar.f41474d0 = true;
                }
                if (wyVar.f41474d0) {
                    GLES20.glViewport(0, 0, wyVar.f41478n, wyVar.f41479r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = wyVar.K.g(1 ^ (wyVar.U ? 1 : 0));
                    GLES20.glUseProgram(wyVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(wyVar.O, 0);
                    GLES20.glEnableVertexAttribArray(wyVar.N);
                    int i10 = wyVar.N;
                    FloatBuffer floatBuffer2 = wyVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = wyVar.K.f42440a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(wyVar.M);
                    GLES20.glVertexAttribPointer(wyVar.M, 2, 5126, false, 8, (Buffer) wyVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    wyVar.f41470b.eglSwapBuffers(wyVar.f41472c, wyVar.f41475e);
                    z9 z9Var2 = wyVar.J;
                    if (z9Var2 != null) {
                        z9Var2.a(g10, wyVar.V, wyVar.W, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f41470b.eglGetCurrentContext()) || !this.f41475e.equals(this.f41470b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f41470b;
            EGLDisplay eGLDisplay = this.f41472c;
            EGLSurface eGLSurface = this.f41475e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new uy(this, z10, z12, z11, 0));
    }

    public final void d(yy yyVar) {
        postRunnable(new vs(11, this, yyVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (!this.f41469a0 && (i7 = this.X) > 0 && (i10 = this.Y) > 0) {
            this.K.i(this.f41480s, this.f41481w, this.F[0], i7, i10);
            this.f41469a0 = true;
            zy zyVar = this.K;
            this.V = zyVar.X0;
            this.W = zyVar.Y0;
        }
    }

    public final void finish() {
        this.f41480s = null;
        if (this.f41475e != null) {
            EGL10 egl10 = this.f41470b;
            EGLDisplay eGLDisplay = this.f41472c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41470b.eglDestroySurface(this.f41472c, this.f41475e);
            this.f41475e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            u9 u9Var = this.I;
            if (u9Var != null) {
                synchronized (u9Var.f39971f) {
                    try {
                        if (u9Var.f39972g == eGLContext) {
                            u9Var.f39972g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f41470b.eglDestroyContext(this.f41472c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f41472c;
        if (eGLDisplay2 != null) {
            this.f41470b.eglTerminate(eGLDisplay2);
            this.f41472c = null;
        }
        SurfaceTexture surfaceTexture = this.f41468a;
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
            h = zy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = zy.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = zy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = zy.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new sy(this, i7, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        z9 z9Var;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f41470b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f41472c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f41470b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f41470b.eglChooseConfig(this.f41472c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                u9 u9Var = this.I;
                if (u9Var != null) {
                    synchronized (u9Var.f39971f) {
                        try {
                            eGLContext = u9Var.f39972g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f41470b.eglCreateContext(this.f41472c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    u9 u9Var2 = this.I;
                    if (u9Var2 != null) {
                        u9Var2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f41468a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f41470b.eglCreateWindowSurface(this.f41472c, eGLConfig, surfaceTexture, null);
                        this.f41475e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f41470b.eglMakeCurrent(this.f41472c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f26198a) {
                                    org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = zy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = zy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f41480s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.f41480s.getHeight();
                                        } else {
                                            i7 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i11 = i7;
                                        int i12 = i10;
                                        if (this.f41473c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.f41482x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new vy(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.h3(new ty(this, 2));
                                        }
                                        if (this.H && (z9Var = this.J) != null && !z9Var.b(this.f41478n / this.f41479r, this.I.f39967a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.K.i(this.f41480s, this.f41481w, this.F[0], i11, i12);
                                                this.f41469a0 = true;
                                                zy zyVar = this.K;
                                                this.V = zyVar.X0;
                                                this.W = zyVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f26198a) {
                                org.telegram.messenger.i20.u(this.f41470b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f41477f = z10;
        super.run();
    }

    public wy(SurfaceTexture surfaceTexture, gx gxVar, hi.c7 c7Var, u9 u9Var, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f41476e0 = new ty(this, 1);
        this.f41468a = surfaceTexture;
        this.f41478n = i7;
        this.f41479r = i10;
        this.f41473c0 = gxVar;
        this.I = u9Var;
        boolean z10 = u9Var != null;
        this.H = z10;
        if (z10) {
            z9 z9Var = new z9();
            this.J = z9Var;
            u9 u9Var2 = z9Var.f42325t;
            if (u9Var2 != null && u9Var2.f39977m != null) {
                u9Var2.f39977m = null;
            }
            z9Var.f42325t = u9Var;
            if (u9Var != null && u9Var.f39977m != z9Var) {
                u9Var.f39977m = z9Var;
                u9Var.d();
            }
        }
        this.h = true;
        this.K = new zy(true, c7Var);
        start();
    }
}
