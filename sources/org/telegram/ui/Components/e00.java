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
public final class e00 extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final la H;
    public ra I;
    public final i00 J;
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
    public final SurfaceTexture f27635a;
    public long f27636a0;
    public EGL10 f27637b;
    public final tv f27638b0;
    public EGLDisplay f27639c;
    public boolean f27640c0;
    public EGLContext d;
    public final Runnable f27641d0;
    public EGLSurface e;
    public boolean f27642f;
    public final boolean h;
    public volatile int f27643n;
    public volatile int f27644r;
    public Bitmap f27645s;
    public final int v;
    public SurfaceTexture f27646w;
    public boolean f27647x;
    public final float[] f27648y;

    public e00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, la laVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f27648y = new float[16];
        this.E = new int[1];
        this.f27641d0 = new b00(this, 1);
        this.f27635a = surfaceTexture;
        this.f27643n = i11;
        this.f27644r = i12;
        this.f27645s = bitmap;
        this.v = i10;
        this.H = laVar;
        boolean z12 = laVar != null;
        this.G = z12;
        if (z12) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f32205t;
            if (laVar2 != null && laVar2.f30210m != null) {
                laVar2.f30210m = null;
            }
            raVar.f32205t = laVar;
            if (laVar != null && laVar.f30210m != raVar) {
                laVar.f30210m = raVar;
                laVar.d();
            }
        }
        this.h = false;
        i00 i00Var = new i00(false, null);
        this.J = i00Var;
        i00Var.f29135i1 = z11;
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

    public static void b(e00 e00Var) {
        h00 h00Var;
        if (e00Var.f27642f) {
            e00Var.c();
            if (e00Var.f27647x) {
                e00Var.f27646w.updateTexImage();
                e00Var.f27646w.getTransformMatrix(e00Var.f27648y);
                e00Var.g();
                e00Var.f27647x = false;
                i00 i00Var = e00Var.J;
                i00Var.P0 = e00Var.f27648y;
                i00Var.W0 = false;
                e00Var.F = true;
            }
            if (e00Var.Z) {
                if (e00Var.h && ((h00Var = e00Var.J.f29127f1) == null || h00Var.b())) {
                    GLES20.glViewport(0, 0, e00Var.f27643n, e00Var.f27644r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(e00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, e00Var.E[0]);
                    GLES20.glUniform1i(e00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(e00Var.R);
                    int i10 = e00Var.R;
                    FloatBuffer floatBuffer = e00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = e00Var.J.f29114a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(e00Var.P);
                    GLES20.glVertexAttribPointer(e00Var.P, 2, 5126, false, 8, (Buffer) e00Var.J.f29117b1);
                    GLES20.glUniformMatrix4fv(e00Var.Q, 1, false, e00Var.f27648y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e00Var.f27637b.eglSwapBuffers(e00Var.f27639c, e00Var.e);
                    ra raVar = e00Var.I;
                    if (raVar != null) {
                        raVar.a(e00Var.f27648y, e00Var.E[0], e00Var.W, e00Var.X);
                        return;
                    }
                    return;
                }
                if (e00Var.f27638b0 == null || e00Var.F) {
                    GLES20.glViewport(0, 0, e00Var.U, e00Var.V);
                    e00Var.J.f();
                    e00Var.J.d();
                    if (e00Var.f27638b0 == null) {
                        e00Var.J.e();
                    }
                    e00Var.J.c();
                    e00Var.T = e00Var.J.b();
                    e00Var.f27640c0 = true;
                }
                if (e00Var.f27640c0) {
                    GLES20.glViewport(0, 0, e00Var.f27643n, e00Var.f27644r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g7 = e00Var.J.g(1 ^ (e00Var.T ? 1 : 0));
                    GLES20.glUseProgram(e00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g7);
                    GLES20.glUniform1i(e00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(e00Var.M);
                    int i11 = e00Var.M;
                    FloatBuffer floatBuffer2 = e00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = e00Var.J.f29114a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(e00Var.L);
                    GLES20.glVertexAttribPointer(e00Var.L, 2, 5126, false, 8, (Buffer) e00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e00Var.f27637b.eglSwapBuffers(e00Var.f27639c, e00Var.e);
                    ra raVar2 = e00Var.I;
                    if (raVar2 != null) {
                        raVar2.a(null, g7, e00Var.U, e00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f27637b.eglGetCurrentContext()) || !this.e.equals(this.f27637b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f27637b;
            EGLDisplay eGLDisplay = this.f27639c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        postRunnable(new c00(this, z10, z12, z11, 0));
    }

    public final void f(h00 h00Var) {
        postRunnable(new so(20, this, h00Var));
    }

    public final void finish() {
        this.f27645s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f27637b;
            EGLDisplay eGLDisplay = this.f27639c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f27637b.eglDestroySurface(this.f27639c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            la laVar = this.H;
            if (laVar != null) {
                synchronized (laVar.f30204f) {
                    try {
                        if (laVar.f30205g == eGLContext) {
                            laVar.f30205g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f27637b.eglDestroyContext(this.f27639c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f27639c;
        if (eGLDisplay2 != null) {
            this.f27637b.eglTerminate(eGLDisplay2);
            this.f27639c = null;
        }
        SurfaceTexture surfaceTexture = this.f27635a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f27645s, this.v, this.E[0], i10, i11);
            this.Z = true;
            i00 i00Var = this.J;
            this.U = i00Var.X0;
            this.V = i00Var.Y0;
        }
    }

    public final boolean h(fi.v7 v7Var) {
        int i10;
        String str;
        int h;
        int h10;
        if (v7Var != null) {
            i10 = v7Var.a();
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
            h = i00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = i00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = i00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = i00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new a00(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        ra raVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f27637b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f27639c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f27637b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f27637b.eglChooseConfig(this.f27639c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                la laVar = this.H;
                if (laVar != null) {
                    synchronized (laVar.f30204f) {
                        try {
                            eGLContext = laVar.f30205g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f27637b.eglCreateContext(this.f27639c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    la laVar2 = this.H;
                    if (laVar2 != null) {
                        laVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f27635a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f27637b.eglCreateWindowSurface(this.f27639c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f27637b.eglMakeCurrent(this.f27639c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = i00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = i00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f27645s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f27645s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f27638b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f27648y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f27646w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new d00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new b00(this, 2));
                                        }
                                        if (this.G && (raVar = this.I) != null && !raVar.b(this.f27643n / this.f27644r, this.H.f30201a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f27645s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                i00 i00Var = this.J;
                                                this.U = i00Var.X0;
                                                this.V = i00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.wh.t(this.f27637b, new StringBuilder("createWindowSurface failed "));
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
        this.f27642f = z10;
        super.run();
    }

    public e00(SurfaceTexture surfaceTexture, tv tvVar, fi.v7 v7Var, la laVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f27648y = new float[16];
        this.E = new int[1];
        this.f27641d0 = new b00(this, 1);
        this.f27635a = surfaceTexture;
        this.f27643n = i10;
        this.f27644r = i11;
        this.f27638b0 = tvVar;
        this.H = laVar;
        boolean z10 = laVar != null;
        this.G = z10;
        if (z10) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f32205t;
            if (laVar2 != null && laVar2.f30210m != null) {
                laVar2.f30210m = null;
            }
            raVar.f32205t = laVar;
            if (laVar != null && laVar.f30210m != raVar) {
                laVar.f30210m = raVar;
                laVar.d();
            }
        }
        this.h = true;
        this.J = new i00(true, v7Var);
        start();
    }
}
