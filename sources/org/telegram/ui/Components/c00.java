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
public final class c00 extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ha H;
    public na I;
    public final g00 J;
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
    public final SurfaceTexture f25134a;
    public long f25135a0;
    public EGL10 f25136b;
    public final rv f25137b0;
    public EGLDisplay f25138c;
    public boolean f25139c0;
    public EGLContext d;
    public final Runnable f25140d0;
    public EGLSurface e;
    public boolean f25141f;
    public final boolean h;
    public volatile int f25142n;
    public volatile int f25143r;
    public Bitmap f25144s;
    public final int v;
    public SurfaceTexture f25145w;
    public boolean f25146x;
    public final float[] f25147y;

    public c00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ha haVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f25147y = new float[16];
        this.E = new int[1];
        this.f25140d0 = new zz(this, 1);
        this.f25134a = surfaceTexture;
        this.f25142n = i11;
        this.f25143r = i12;
        this.f25144s = bitmap;
        this.v = i10;
        this.H = haVar;
        boolean z12 = haVar != null;
        this.G = z12;
        if (z12) {
            na naVar = new na();
            this.I = naVar;
            ha haVar2 = naVar.f28850t;
            if (haVar2 != null && haVar2.f26983m != null) {
                haVar2.f26983m = null;
            }
            naVar.f28850t = haVar;
            if (haVar != null && haVar.f26983m != naVar) {
                haVar.f26983m = naVar;
                haVar.d();
            }
        }
        this.h = false;
        g00 g00Var = new g00(false, null);
        this.J = g00Var;
        g00Var.f26481i1 = z11;
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

    public static void b(c00 c00Var) {
        f00 f00Var;
        if (c00Var.f25141f) {
            c00Var.c();
            if (c00Var.f25146x) {
                c00Var.f25145w.updateTexImage();
                c00Var.f25145w.getTransformMatrix(c00Var.f25147y);
                c00Var.g();
                c00Var.f25146x = false;
                g00 g00Var = c00Var.J;
                g00Var.P0 = c00Var.f25147y;
                g00Var.W0 = false;
                c00Var.F = true;
            }
            if (c00Var.Z) {
                if (c00Var.h && ((f00Var = c00Var.J.f26473f1) == null || f00Var.b())) {
                    GLES20.glViewport(0, 0, c00Var.f25142n, c00Var.f25143r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(c00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, c00Var.E[0]);
                    GLES20.glUniform1i(c00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(c00Var.R);
                    int i10 = c00Var.R;
                    FloatBuffer floatBuffer = c00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = c00Var.J.f26460a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(c00Var.P);
                    GLES20.glVertexAttribPointer(c00Var.P, 2, 5126, false, 8, (Buffer) c00Var.J.f26463b1);
                    GLES20.glUniformMatrix4fv(c00Var.Q, 1, false, c00Var.f25147y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    c00Var.f25136b.eglSwapBuffers(c00Var.f25138c, c00Var.e);
                    na naVar = c00Var.I;
                    if (naVar != null) {
                        naVar.a(c00Var.f25147y, c00Var.E[0], c00Var.W, c00Var.X);
                        return;
                    }
                    return;
                }
                if (c00Var.f25137b0 == null || c00Var.F) {
                    GLES20.glViewport(0, 0, c00Var.U, c00Var.V);
                    c00Var.J.f();
                    c00Var.J.d();
                    if (c00Var.f25137b0 == null) {
                        c00Var.J.e();
                    }
                    c00Var.J.c();
                    c00Var.T = c00Var.J.b();
                    c00Var.f25139c0 = true;
                }
                if (c00Var.f25139c0) {
                    GLES20.glViewport(0, 0, c00Var.f25142n, c00Var.f25143r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = c00Var.J.g(1 ^ (c00Var.T ? 1 : 0));
                    GLES20.glUseProgram(c00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(c00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(c00Var.M);
                    int i11 = c00Var.M;
                    FloatBuffer floatBuffer2 = c00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = c00Var.J.f26460a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(c00Var.L);
                    GLES20.glVertexAttribPointer(c00Var.L, 2, 5126, false, 8, (Buffer) c00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    c00Var.f25136b.eglSwapBuffers(c00Var.f25138c, c00Var.e);
                    na naVar2 = c00Var.I;
                    if (naVar2 != null) {
                        naVar2.a(null, g10, c00Var.U, c00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f25136b.eglGetCurrentContext()) || !this.e.equals(this.f25136b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f25136b;
            EGLDisplay eGLDisplay = this.f25138c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        postRunnable(new a00(this, z10, z12, z11, 0));
    }

    public final void f(f00 f00Var) {
        postRunnable(new wt(10, this, f00Var));
    }

    public final void finish() {
        this.f25144s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f25136b;
            EGLDisplay eGLDisplay = this.f25138c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f25136b.eglDestroySurface(this.f25138c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ha haVar = this.H;
            if (haVar != null) {
                synchronized (haVar.f26977f) {
                    try {
                        if (haVar.f26978g == eGLContext) {
                            haVar.f26978g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f25136b.eglDestroyContext(this.f25138c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f25138c;
        if (eGLDisplay2 != null) {
            this.f25136b.eglTerminate(eGLDisplay2);
            this.f25138c = null;
        }
        SurfaceTexture surfaceTexture = this.f25134a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f25144s, this.v, this.E[0], i10, i11);
            this.Z = true;
            g00 g00Var = this.J;
            this.U = g00Var.X0;
            this.V = g00Var.Y0;
        }
    }

    public final boolean h(ei.z7 z7Var) {
        int i10;
        String str;
        int h;
        int h10;
        if (z7Var != null) {
            i10 = z7Var.a();
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
            h = g00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = g00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = g00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = g00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new yz(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        na naVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f25136b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f25138c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f25136b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f25136b.eglChooseConfig(this.f25138c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ha haVar = this.H;
                if (haVar != null) {
                    synchronized (haVar.f26977f) {
                        try {
                            eGLContext = haVar.f26978g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f25136b.eglCreateContext(this.f25138c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ha haVar2 = this.H;
                    if (haVar2 != null) {
                        haVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f25134a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f25136b.eglCreateWindowSurface(this.f25138c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f25136b.eglMakeCurrent(this.f25138c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = g00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = g00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f25144s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f25144s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f25137b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f25147y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f25145w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new b00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new zz(this, 2));
                                        }
                                        if (this.G && (naVar = this.I) != null && !naVar.b(this.f25142n / this.f25143r, this.H.f26974a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f25144s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                g00 g00Var = this.J;
                                                this.U = g00Var.X0;
                                                this.V = g00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.tl.v(this.f25136b, new StringBuilder("createWindowSurface failed "));
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
        this.f25141f = z10;
        super.run();
    }

    public c00(SurfaceTexture surfaceTexture, rv rvVar, ei.z7 z7Var, ha haVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f25147y = new float[16];
        this.E = new int[1];
        this.f25140d0 = new zz(this, 1);
        this.f25134a = surfaceTexture;
        this.f25142n = i10;
        this.f25143r = i11;
        this.f25137b0 = rvVar;
        this.H = haVar;
        boolean z10 = haVar != null;
        this.G = z10;
        if (z10) {
            na naVar = new na();
            this.I = naVar;
            ha haVar2 = naVar.f28850t;
            if (haVar2 != null && haVar2.f26983m != null) {
                haVar2.f26983m = null;
            }
            naVar.f28850t = haVar;
            if (haVar != null && haVar.f26983m != naVar) {
                haVar.f26983m = naVar;
                haVar.d();
            }
        }
        this.h = true;
        this.J = new g00(true, z7Var);
        start();
    }
}
