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
public final class h00 extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final la H;
    public ra I;
    public final l00 J;
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
    public final SurfaceTexture f25442a;
    public long f25443a0;
    public EGL10 f25444b;
    public final xv f25445b0;
    public EGLDisplay f25446c;
    public boolean f25447c0;
    public EGLContext d;
    public final Runnable f25448d0;
    public EGLSurface e;
    public boolean f25449f;
    public final boolean h;
    public volatile int f25450n;
    public volatile int f25451r;
    public Bitmap f25452s;
    public final int v;
    public SurfaceTexture f25453w;
    public boolean f25454x;
    public final float[] f25455y;

    public h00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, la laVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f25455y = new float[16];
        this.E = new int[1];
        this.f25448d0 = new e00(this, 1);
        this.f25442a = surfaceTexture;
        this.f25450n = i11;
        this.f25451r = i12;
        this.f25452s = bitmap;
        this.v = i10;
        this.H = laVar;
        boolean z12 = laVar != null;
        this.G = z12;
        if (z12) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f28797t;
            if (laVar2 != null && laVar2.f27010m != null) {
                laVar2.f27010m = null;
            }
            raVar.f28797t = laVar;
            if (laVar != null && laVar.f27010m != raVar) {
                laVar.f27010m = raVar;
                laVar.d();
            }
        }
        this.h = false;
        l00 l00Var = new l00(false, null);
        this.J = l00Var;
        l00Var.f26868i1 = z11;
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

    public static void b(h00 h00Var) {
        k00 k00Var;
        if (h00Var.f25449f) {
            h00Var.c();
            if (h00Var.f25454x) {
                h00Var.f25453w.updateTexImage();
                h00Var.f25453w.getTransformMatrix(h00Var.f25455y);
                h00Var.g();
                h00Var.f25454x = false;
                l00 l00Var = h00Var.J;
                l00Var.P0 = h00Var.f25455y;
                l00Var.W0 = false;
                h00Var.F = true;
            }
            if (h00Var.Z) {
                if (h00Var.h && ((k00Var = h00Var.J.f26860f1) == null || k00Var.b())) {
                    GLES20.glViewport(0, 0, h00Var.f25450n, h00Var.f25451r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(h00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, h00Var.E[0]);
                    GLES20.glUniform1i(h00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(h00Var.R);
                    int i10 = h00Var.R;
                    FloatBuffer floatBuffer = h00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = h00Var.J.f26847a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(h00Var.P);
                    GLES20.glVertexAttribPointer(h00Var.P, 2, 5126, false, 8, (Buffer) h00Var.J.f26850b1);
                    GLES20.glUniformMatrix4fv(h00Var.Q, 1, false, h00Var.f25455y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    h00Var.f25444b.eglSwapBuffers(h00Var.f25446c, h00Var.e);
                    ra raVar = h00Var.I;
                    if (raVar != null) {
                        raVar.a(h00Var.f25455y, h00Var.E[0], h00Var.W, h00Var.X);
                        return;
                    }
                    return;
                }
                if (h00Var.f25445b0 == null || h00Var.F) {
                    GLES20.glViewport(0, 0, h00Var.U, h00Var.V);
                    h00Var.J.f();
                    h00Var.J.d();
                    if (h00Var.f25445b0 == null) {
                        h00Var.J.e();
                    }
                    h00Var.J.c();
                    h00Var.T = h00Var.J.b();
                    h00Var.f25447c0 = true;
                }
                if (h00Var.f25447c0) {
                    GLES20.glViewport(0, 0, h00Var.f25450n, h00Var.f25451r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = h00Var.J.g(1 ^ (h00Var.T ? 1 : 0));
                    GLES20.glUseProgram(h00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(h00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(h00Var.M);
                    int i11 = h00Var.M;
                    FloatBuffer floatBuffer2 = h00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = h00Var.J.f26847a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(h00Var.L);
                    GLES20.glVertexAttribPointer(h00Var.L, 2, 5126, false, 8, (Buffer) h00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    h00Var.f25444b.eglSwapBuffers(h00Var.f25446c, h00Var.e);
                    ra raVar2 = h00Var.I;
                    if (raVar2 != null) {
                        raVar2.a(null, g10, h00Var.U, h00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f25444b.eglGetCurrentContext()) || !this.e.equals(this.f25444b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f25444b;
            EGLDisplay eGLDisplay = this.f25446c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        postRunnable(new f00(this, z10, z12, z11, 0));
    }

    public final void f(k00 k00Var) {
        postRunnable(new sk(26, this, k00Var));
    }

    public final void finish() {
        this.f25452s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f25444b;
            EGLDisplay eGLDisplay = this.f25446c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f25444b.eglDestroySurface(this.f25446c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            la laVar = this.H;
            if (laVar != null) {
                synchronized (laVar.f27004f) {
                    try {
                        if (laVar.f27005g == eGLContext) {
                            laVar.f27005g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f25444b.eglDestroyContext(this.f25446c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f25446c;
        if (eGLDisplay2 != null) {
            this.f25444b.eglTerminate(eGLDisplay2);
            this.f25446c = null;
        }
        SurfaceTexture surfaceTexture = this.f25442a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f25452s, this.v, this.E[0], i10, i11);
            this.Z = true;
            l00 l00Var = this.J;
            this.U = l00Var.X0;
            this.V = l00Var.Y0;
        }
    }

    public final boolean h(di.j8 j8Var) {
        int i10;
        String str;
        int h;
        int h10;
        if (j8Var != null) {
            i10 = j8Var.a();
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
            h = l00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = l00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = l00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = l00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new d00(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        ra raVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f25444b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f25446c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f25444b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f25444b.eglChooseConfig(this.f25446c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                la laVar = this.H;
                if (laVar != null) {
                    synchronized (laVar.f27004f) {
                        try {
                            eGLContext = laVar.f27005g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f25444b.eglCreateContext(this.f25446c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    la laVar2 = this.H;
                    if (laVar2 != null) {
                        laVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f25442a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f25444b.eglCreateWindowSurface(this.f25446c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f25444b.eglMakeCurrent(this.f25446c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = l00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = l00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f25452s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f25452s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f25445b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f25455y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f25453w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new g00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new e00(this, 2));
                                        }
                                        if (this.G && (raVar = this.I) != null && !raVar.b(this.f25450n / this.f25451r, this.H.f27001a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f25452s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                l00 l00Var = this.J;
                                                this.U = l00Var.X0;
                                                this.V = l00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.yh.u(this.f25444b, new StringBuilder("createWindowSurface failed "));
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
        this.f25449f = z10;
        super.run();
    }

    public h00(SurfaceTexture surfaceTexture, xv xvVar, di.j8 j8Var, la laVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f25455y = new float[16];
        this.E = new int[1];
        this.f25448d0 = new e00(this, 1);
        this.f25442a = surfaceTexture;
        this.f25450n = i10;
        this.f25451r = i11;
        this.f25445b0 = xvVar;
        this.H = laVar;
        boolean z10 = laVar != null;
        this.G = z10;
        if (z10) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f28797t;
            if (laVar2 != null && laVar2.f27010m != null) {
                laVar2.f27010m = null;
            }
            raVar.f28797t = laVar;
            if (laVar != null && laVar.f27010m != raVar) {
                laVar.f27010m = raVar;
                laVar.d();
            }
        }
        this.h = true;
        this.J = new l00(true, j8Var);
        start();
    }
}
