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
public final class py extends org.telegram.messenger.q5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final x9 I;
    public ca J;
    public final sy K;
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
    public final SurfaceTexture f37268a;
    public boolean f37269a0;
    public EGL10 f37270b;
    public long f37271b0;
    public EGLDisplay f37272c;
    public final zw f37273c0;
    public EGLContext d;
    public boolean f37274d0;
    public EGLSurface f37275e;
    public final Runnable f37276e0;
    public boolean f37277f;
    public final boolean h;
    public volatile int f37278n;
    public volatile int f37279r;
    public Bitmap f37280s;
    public final int f37281w;
    public SurfaceTexture f37282x;
    public boolean f37283y;

    public py(SurfaceTexture surfaceTexture, Bitmap bitmap, int i3, boolean z10, boolean z11, x9 x9Var, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f37276e0 = new my(this, 1);
        this.f37268a = surfaceTexture;
        this.f37278n = i10;
        this.f37279r = i11;
        this.f37280s = bitmap;
        this.f37281w = i3;
        this.I = x9Var;
        boolean z12 = x9Var != null;
        this.H = z12;
        if (z12) {
            ca caVar = new ca();
            this.J = caVar;
            x9 x9Var2 = caVar.f32638t;
            if (x9Var2 != null && x9Var2.f40281m != null) {
                x9Var2.f40281m = null;
            }
            caVar.f32638t = x9Var;
            if (x9Var != null && x9Var.f40281m != caVar) {
                x9Var.f40281m = caVar;
                x9Var.d();
            }
        }
        this.h = false;
        sy syVar = new sy(false, null);
        this.K = syVar;
        syVar.f38160i1 = z11;
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

    public static void a(py pyVar) {
        ry ryVar;
        if (pyVar.f37277f) {
            pyVar.b();
            if (pyVar.f37283y) {
                pyVar.f37282x.updateTexImage();
                pyVar.f37282x.getTransformMatrix(pyVar.E);
                pyVar.f();
                pyVar.f37283y = false;
                sy syVar = pyVar.K;
                syVar.P0 = pyVar.E;
                syVar.W0 = false;
                pyVar.G = true;
            }
            if (pyVar.f37269a0) {
                if (pyVar.h && ((ryVar = pyVar.K.f38152f1) == null || ryVar.o())) {
                    GLES20.glViewport(0, 0, pyVar.f37278n, pyVar.f37279r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(pyVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, pyVar.F[0]);
                    GLES20.glUniform1i(pyVar.T, 0);
                    GLES20.glEnableVertexAttribArray(pyVar.S);
                    int i3 = pyVar.S;
                    FloatBuffer floatBuffer = pyVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = pyVar.K.f38138a1;
                    }
                    GLES20.glVertexAttribPointer(i3, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(pyVar.Q);
                    GLES20.glVertexAttribPointer(pyVar.Q, 2, 5126, false, 8, (Buffer) pyVar.K.f38141b1);
                    GLES20.glUniformMatrix4fv(pyVar.R, 1, false, pyVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    pyVar.f37270b.eglSwapBuffers(pyVar.f37272c, pyVar.f37275e);
                    ca caVar = pyVar.J;
                    if (caVar != null) {
                        caVar.a(pyVar.F[0], pyVar.X, pyVar.Y, pyVar.E);
                        return;
                    }
                    return;
                }
                if (pyVar.f37273c0 == null || pyVar.G) {
                    GLES20.glViewport(0, 0, pyVar.V, pyVar.W);
                    pyVar.K.f();
                    pyVar.K.d();
                    if (pyVar.f37273c0 == null) {
                        pyVar.K.e();
                    }
                    pyVar.K.c();
                    pyVar.U = pyVar.K.b();
                    pyVar.f37274d0 = true;
                }
                if (pyVar.f37274d0) {
                    GLES20.glViewport(0, 0, pyVar.f37278n, pyVar.f37279r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g7 = pyVar.K.g(1 ^ (pyVar.U ? 1 : 0));
                    GLES20.glUseProgram(pyVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g7);
                    GLES20.glUniform1i(pyVar.O, 0);
                    GLES20.glEnableVertexAttribArray(pyVar.N);
                    int i10 = pyVar.N;
                    FloatBuffer floatBuffer2 = pyVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = pyVar.K.f38138a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(pyVar.M);
                    GLES20.glVertexAttribPointer(pyVar.M, 2, 5126, false, 8, (Buffer) pyVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    pyVar.f37270b.eglSwapBuffers(pyVar.f37272c, pyVar.f37275e);
                    ca caVar2 = pyVar.J;
                    if (caVar2 != null) {
                        caVar2.a(g7, pyVar.V, pyVar.W, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.d.equals(this.f37270b.eglGetCurrentContext()) || !this.f37275e.equals(this.f37270b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f37270b;
            EGLDisplay eGLDisplay = this.f37272c;
            EGLSurface eGLSurface = this.f37275e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new ny(this, z10, z12, z11, 0));
    }

    public final void e(ry ryVar) {
        postRunnable(new cl(22, this, ryVar));
    }

    public final void f() {
        int i3;
        int i10;
        if (!this.f37269a0 && (i3 = this.X) > 0 && (i10 = this.Y) > 0) {
            this.K.i(this.f37280s, this.f37281w, this.F[0], i3, i10);
            this.f37269a0 = true;
            sy syVar = this.K;
            this.V = syVar.X0;
            this.W = syVar.Y0;
        }
    }

    public final void finish() {
        this.f37280s = null;
        if (this.f37275e != null) {
            EGL10 egl10 = this.f37270b;
            EGLDisplay eGLDisplay = this.f37272c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f37270b.eglDestroySurface(this.f37272c, this.f37275e);
            this.f37275e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            x9 x9Var = this.I;
            if (x9Var != null) {
                synchronized (x9Var.f40275f) {
                    try {
                        if (x9Var.f40276g == eGLContext) {
                            x9Var.f40276g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f37270b.eglDestroyContext(this.f37272c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f37272c;
        if (eGLDisplay2 != null) {
            this.f37270b.eglTerminate(eGLDisplay2);
            this.f37272c = null;
        }
        SurfaceTexture surfaceTexture = this.f37268a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final boolean g(gi.e7 e7Var) {
        int i3;
        String str;
        int h;
        int h7;
        if (e7Var != null) {
            i3 = e7Var.a();
        } else {
            i3 = 0;
        }
        if (i3 == 1) {
            str = org.telegram.messenger.g0.y2(null, 2131624045);
        } else if (i3 == 2) {
            str = org.telegram.messenger.g0.y2(null, 2131624046);
        } else {
            str = "";
        }
        if (i3 != 0) {
            h = sy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = sy.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = sy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = sy.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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

    public final void h(int i3, int i10) {
        if (this.J == null) {
            return;
        }
        postRunnable(new ly(this, i3, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i3;
        int i10;
        ca caVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f37270b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f37272c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f37270b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f37270b.eglChooseConfig(this.f37272c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                x9 x9Var = this.I;
                if (x9Var != null) {
                    synchronized (x9Var.f40275f) {
                        try {
                            eGLContext = x9Var.f40276g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f37270b.eglCreateContext(this.f37272c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25040a) {
                        org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    x9 x9Var2 = this.I;
                    if (x9Var2 != null) {
                        x9Var2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f37268a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f37270b.eglCreateWindowSurface(this.f37272c, eGLConfig, surfaceTexture, null);
                        this.f37275e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f37270b.eglMakeCurrent(this.f37272c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f25040a) {
                                    org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = sy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = sy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f37280s;
                                        if (bitmap != null) {
                                            i3 = bitmap.getWidth();
                                            i10 = this.f37280s.getHeight();
                                        } else {
                                            i3 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i11 = i3;
                                        int i12 = i10;
                                        if (this.f37273c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.f37282x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new oy(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.h3(new my(this, 2));
                                        }
                                        if (this.H && (caVar = this.J) != null && !caVar.b(this.f37278n / this.f37279r, this.I.f40271a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (!this.K.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.K.i(this.f37280s, this.f37281w, this.F[0], i11, i12);
                                                this.f37269a0 = true;
                                                sy syVar = this.K;
                                                this.V = syVar.X0;
                                                this.W = syVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25040a) {
                                org.telegram.messenger.camera.q.t(this.f37270b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.f37277f = z10;
        super.run();
    }

    public py(SurfaceTexture surfaceTexture, zw zwVar, gi.e7 e7Var, x9 x9Var, int i3, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.f37276e0 = new my(this, 1);
        this.f37268a = surfaceTexture;
        this.f37278n = i3;
        this.f37279r = i10;
        this.f37273c0 = zwVar;
        this.I = x9Var;
        boolean z10 = x9Var != null;
        this.H = z10;
        if (z10) {
            ca caVar = new ca();
            this.J = caVar;
            x9 x9Var2 = caVar.f32638t;
            if (x9Var2 != null && x9Var2.f40281m != null) {
                x9Var2.f40281m = null;
            }
            caVar.f32638t = x9Var;
            if (x9Var != null && x9Var.f40281m != caVar) {
                x9Var.f40281m = caVar;
                x9Var.d();
            }
        }
        this.h = true;
        this.K = new sy(true, e7Var);
        start();
    }
}
