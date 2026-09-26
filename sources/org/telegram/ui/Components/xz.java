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
public final class xz extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ja H;
    public pa I;
    public final b00 J;
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
    public final SurfaceTexture f30492a;
    public long f30493a0;
    public EGL10 f30494b;
    public final nv f30495b0;
    public EGLDisplay f30496c;
    public boolean f30497c0;
    public EGLContext d;
    public final Runnable f30498d0;
    public EGLSurface e;
    public boolean f30499f;
    public final boolean h;
    public volatile int f30500n;
    public volatile int f30501r;
    public Bitmap f30502s;
    public final int v;
    public SurfaceTexture f30503w;
    public boolean f30504x;
    public final float[] f30505y;

    public xz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ja jaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f30505y = new float[16];
        this.E = new int[1];
        this.f30498d0 = new uz(this, 1);
        this.f30492a = surfaceTexture;
        this.f30500n = i11;
        this.f30501r = i12;
        this.f30502s = bitmap;
        this.v = i10;
        this.H = jaVar;
        boolean z12 = jaVar != null;
        this.G = z12;
        if (z12) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f27319t;
            if (jaVar2 != null && jaVar2.f25365m != null) {
                jaVar2.f25365m = null;
            }
            paVar.f27319t = jaVar;
            if (jaVar != null && jaVar.f25365m != paVar) {
                jaVar.f25365m = paVar;
                jaVar.d();
            }
        }
        this.h = false;
        b00 b00Var = new b00(false, null);
        this.J = b00Var;
        b00Var.f22816i1 = z11;
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

    public static void b(xz xzVar) {
        a00 a00Var;
        if (xzVar.f30499f) {
            xzVar.c();
            if (xzVar.f30504x) {
                xzVar.f30503w.updateTexImage();
                xzVar.f30503w.getTransformMatrix(xzVar.f30505y);
                xzVar.g();
                xzVar.f30504x = false;
                b00 b00Var = xzVar.J;
                b00Var.P0 = xzVar.f30505y;
                b00Var.W0 = false;
                xzVar.F = true;
            }
            if (xzVar.Z) {
                if (xzVar.h && ((a00Var = xzVar.J.f22808f1) == null || a00Var.b())) {
                    GLES20.glViewport(0, 0, xzVar.f30500n, xzVar.f30501r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(xzVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, xzVar.E[0]);
                    GLES20.glUniform1i(xzVar.S, 0);
                    GLES20.glEnableVertexAttribArray(xzVar.R);
                    int i10 = xzVar.R;
                    FloatBuffer floatBuffer = xzVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = xzVar.J.f22795a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(xzVar.P);
                    GLES20.glVertexAttribPointer(xzVar.P, 2, 5126, false, 8, (Buffer) xzVar.J.f22798b1);
                    GLES20.glUniformMatrix4fv(xzVar.Q, 1, false, xzVar.f30505y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    xzVar.f30494b.eglSwapBuffers(xzVar.f30496c, xzVar.e);
                    pa paVar = xzVar.I;
                    if (paVar != null) {
                        paVar.a(xzVar.f30505y, xzVar.E[0], xzVar.W, xzVar.X);
                        return;
                    }
                    return;
                }
                if (xzVar.f30495b0 == null || xzVar.F) {
                    GLES20.glViewport(0, 0, xzVar.U, xzVar.V);
                    xzVar.J.f();
                    xzVar.J.d();
                    if (xzVar.f30495b0 == null) {
                        xzVar.J.e();
                    }
                    xzVar.J.c();
                    xzVar.T = xzVar.J.b();
                    xzVar.f30497c0 = true;
                }
                if (xzVar.f30497c0) {
                    GLES20.glViewport(0, 0, xzVar.f30500n, xzVar.f30501r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = xzVar.J.g(1 ^ (xzVar.T ? 1 : 0));
                    GLES20.glUseProgram(xzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(xzVar.N, 0);
                    GLES20.glEnableVertexAttribArray(xzVar.M);
                    int i11 = xzVar.M;
                    FloatBuffer floatBuffer2 = xzVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = xzVar.J.f22795a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(xzVar.L);
                    GLES20.glVertexAttribPointer(xzVar.L, 2, 5126, false, 8, (Buffer) xzVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    xzVar.f30494b.eglSwapBuffers(xzVar.f30496c, xzVar.e);
                    pa paVar2 = xzVar.I;
                    if (paVar2 != null) {
                        paVar2.a(null, g10, xzVar.U, xzVar.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f30494b.eglGetCurrentContext()) || !this.e.equals(this.f30494b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f30494b;
            EGLDisplay eGLDisplay = this.f30496c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new vz(this, z10, z12, z11, 0));
    }

    public final void f(a00 a00Var) {
        postRunnable(new ww(8, this, a00Var));
    }

    public final void finish() {
        this.f30502s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f30494b;
            EGLDisplay eGLDisplay = this.f30496c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f30494b.eglDestroySurface(this.f30496c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ja jaVar = this.H;
            if (jaVar != null) {
                synchronized (jaVar.f25359f) {
                    try {
                        if (jaVar.f25360g == eGLContext) {
                            jaVar.f25360g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f30494b.eglDestroyContext(this.f30496c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f30496c;
        if (eGLDisplay2 != null) {
            this.f30494b.eglTerminate(eGLDisplay2);
            this.f30496c = null;
        }
        SurfaceTexture surfaceTexture = this.f30492a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f30502s, this.v, this.E[0], i10, i11);
            this.Z = true;
            b00 b00Var = this.J;
            this.U = b00Var.X0;
            this.V = b00Var.Y0;
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
            h = b00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = b00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = b00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = b00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new tz(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        pa paVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f30494b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f30496c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f30494b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f30494b.eglChooseConfig(this.f30496c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ja jaVar = this.H;
                if (jaVar != null) {
                    synchronized (jaVar.f25359f) {
                        try {
                            eGLContext = jaVar.f25360g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f30494b.eglCreateContext(this.f30496c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ja jaVar2 = this.H;
                    if (jaVar2 != null) {
                        jaVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f30492a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f30494b.eglCreateWindowSurface(this.f30496c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f30494b.eglMakeCurrent(this.f30496c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = b00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = b00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f30502s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f30502s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f30495b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f30505y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f30503w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new wz(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new uz(this, 2));
                                        }
                                        if (this.G && (paVar = this.I) != null && !paVar.b(this.f30500n / this.f30501r, this.H.f25356a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f30502s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                b00 b00Var = this.J;
                                                this.U = b00Var.X0;
                                                this.V = b00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ok.u(this.f30494b, new StringBuilder("createWindowSurface failed "));
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
        this.f30499f = z10;
        super.run();
    }

    public xz(SurfaceTexture surfaceTexture, nv nvVar, ci.k8 k8Var, ja jaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f30505y = new float[16];
        this.E = new int[1];
        this.f30498d0 = new uz(this, 1);
        this.f30492a = surfaceTexture;
        this.f30500n = i10;
        this.f30501r = i11;
        this.f30495b0 = nvVar;
        this.H = jaVar;
        boolean z10 = jaVar != null;
        this.G = z10;
        if (z10) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f27319t;
            if (jaVar2 != null && jaVar2.f25365m != null) {
                jaVar2.f25365m = null;
            }
            paVar.f27319t = jaVar;
            if (jaVar != null && jaVar.f25365m != paVar) {
                jaVar.f25365m = paVar;
                jaVar.d();
            }
        }
        this.h = true;
        this.J = new b00(true, k8Var);
        start();
    }
}
