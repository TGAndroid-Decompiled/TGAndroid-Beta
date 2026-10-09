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
public final class l00 extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ma H;
    public sa I;
    public final p00 J;
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
    public final SurfaceTexture f28188a;
    public long f28189a0;
    public EGL10 f28190b;
    public final bw f28191b0;
    public EGLDisplay f28192c;
    public boolean f28193c0;
    public EGLContext d;
    public final Runnable f28194d0;
    public EGLSurface f28195e;
    public boolean f28196f;
    public final boolean h;
    public volatile int f28197n;
    public volatile int f28198r;
    public Bitmap f28199s;
    public final int v;
    public SurfaceTexture f28200w;
    public boolean f28201x;
    public final float[] f28202y;

    public l00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ma maVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f28202y = new float[16];
        this.E = new int[1];
        this.f28194d0 = new i00(this, 1);
        this.f28188a = surfaceTexture;
        this.f28197n = i11;
        this.f28198r = i12;
        this.f28199s = bitmap;
        this.v = i10;
        this.H = maVar;
        boolean z12 = maVar != null;
        this.G = z12;
        if (z12) {
            sa saVar = new sa();
            this.I = saVar;
            ma maVar2 = saVar.f30757t;
            if (maVar2 != null && maVar2.f28797m != null) {
                maVar2.f28797m = null;
            }
            saVar.f30757t = maVar;
            if (maVar != null && maVar.f28797m != saVar) {
                maVar.f28797m = saVar;
                maVar.d();
            }
        }
        this.h = false;
        p00 p00Var = new p00(false, null);
        this.J = p00Var;
        p00Var.f29643i1 = z11;
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

    public static void b(l00 l00Var) {
        o00 o00Var;
        if (l00Var.f28196f) {
            l00Var.c();
            if (l00Var.f28201x) {
                l00Var.f28200w.updateTexImage();
                l00Var.f28200w.getTransformMatrix(l00Var.f28202y);
                l00Var.g();
                l00Var.f28201x = false;
                p00 p00Var = l00Var.J;
                p00Var.P0 = l00Var.f28202y;
                p00Var.W0 = false;
                l00Var.F = true;
            }
            if (l00Var.Z) {
                if (l00Var.h && ((o00Var = l00Var.J.f29635f1) == null || o00Var.b())) {
                    GLES20.glViewport(0, 0, l00Var.f28197n, l00Var.f28198r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(l00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, l00Var.E[0]);
                    GLES20.glUniform1i(l00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(l00Var.R);
                    int i10 = l00Var.R;
                    FloatBuffer floatBuffer = l00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = l00Var.J.f29621a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(l00Var.P);
                    GLES20.glVertexAttribPointer(l00Var.P, 2, 5126, false, 8, (Buffer) l00Var.J.f29624b1);
                    GLES20.glUniformMatrix4fv(l00Var.Q, 1, false, l00Var.f28202y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    l00Var.f28190b.eglSwapBuffers(l00Var.f28192c, l00Var.f28195e);
                    sa saVar = l00Var.I;
                    if (saVar != null) {
                        saVar.a(l00Var.f28202y, l00Var.E[0], l00Var.W, l00Var.X);
                        return;
                    }
                    return;
                }
                if (l00Var.f28191b0 == null || l00Var.F) {
                    GLES20.glViewport(0, 0, l00Var.U, l00Var.V);
                    l00Var.J.f();
                    l00Var.J.d();
                    if (l00Var.f28191b0 == null) {
                        l00Var.J.e();
                    }
                    l00Var.J.c();
                    l00Var.T = l00Var.J.b();
                    l00Var.f28193c0 = true;
                }
                if (l00Var.f28193c0) {
                    GLES20.glViewport(0, 0, l00Var.f28197n, l00Var.f28198r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = l00Var.J.g(1 ^ (l00Var.T ? 1 : 0));
                    GLES20.glUseProgram(l00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(l00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(l00Var.M);
                    int i11 = l00Var.M;
                    FloatBuffer floatBuffer2 = l00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = l00Var.J.f29621a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(l00Var.L);
                    GLES20.glVertexAttribPointer(l00Var.L, 2, 5126, false, 8, (Buffer) l00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    l00Var.f28190b.eglSwapBuffers(l00Var.f28192c, l00Var.f28195e);
                    sa saVar2 = l00Var.I;
                    if (saVar2 != null) {
                        saVar2.a(null, g10, l00Var.U, l00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f28190b.eglGetCurrentContext()) || !this.f28195e.equals(this.f28190b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f28190b;
            EGLDisplay eGLDisplay = this.f28192c;
            EGLSurface eGLSurface = this.f28195e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new j00(this, z10, z12, z11, 0));
    }

    public final void f(o00 o00Var) {
        postRunnable(new zr(15, this, o00Var));
    }

    public final void finish() {
        this.f28199s = null;
        if (this.f28195e != null) {
            EGL10 egl10 = this.f28190b;
            EGLDisplay eGLDisplay = this.f28192c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f28190b.eglDestroySurface(this.f28192c, this.f28195e);
            this.f28195e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ma maVar = this.H;
            if (maVar != null) {
                synchronized (maVar.f28791f) {
                    try {
                        if (maVar.f28792g == eGLContext) {
                            maVar.f28792g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f28190b.eglDestroyContext(this.f28192c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f28192c;
        if (eGLDisplay2 != null) {
            this.f28190b.eglTerminate(eGLDisplay2);
            this.f28192c = null;
        }
        SurfaceTexture surfaceTexture = this.f28188a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f28199s, this.v, this.E[0], i10, i11);
            this.Z = true;
            p00 p00Var = this.J;
            this.U = p00Var.X0;
            this.V = p00Var.Y0;
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
            h = p00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = p00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = p00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = p00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new h00(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        sa saVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f28190b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f28192c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f28190b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f28190b.eglChooseConfig(this.f28192c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ma maVar = this.H;
                if (maVar != null) {
                    synchronized (maVar.f28791f) {
                        try {
                            eGLContext = maVar.f28792g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f28190b.eglCreateContext(this.f28192c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ma maVar2 = this.H;
                    if (maVar2 != null) {
                        maVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f28188a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f28190b.eglCreateWindowSurface(this.f28192c, eGLConfig, surfaceTexture, null);
                        this.f28195e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f28190b.eglMakeCurrent(this.f28192c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = p00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = p00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f28199s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f28199s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f28191b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f28202y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f28200w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new k00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new i00(this, 2));
                                        }
                                        if (this.G && (saVar = this.I) != null && !saVar.b(this.f28197n / this.f28198r, this.H.f28787a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f28199s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                p00 p00Var = this.J;
                                                this.U = p00Var.X0;
                                                this.V = p00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.bi.v(this.f28190b, new StringBuilder("createWindowSurface failed "));
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
        this.f28196f = z10;
        super.run();
    }

    public l00(SurfaceTexture surfaceTexture, bw bwVar, ci.k8 k8Var, ma maVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f28202y = new float[16];
        this.E = new int[1];
        this.f28194d0 = new i00(this, 1);
        this.f28188a = surfaceTexture;
        this.f28197n = i10;
        this.f28198r = i11;
        this.f28191b0 = bwVar;
        this.H = maVar;
        boolean z10 = maVar != null;
        this.G = z10;
        if (z10) {
            sa saVar = new sa();
            this.I = saVar;
            ma maVar2 = saVar.f30757t;
            if (maVar2 != null && maVar2.f28797m != null) {
                maVar2.f28797m = null;
            }
            saVar.f30757t = maVar;
            if (maVar != null && maVar.f28797m != saVar) {
                maVar.f28797m = saVar;
                maVar.d();
            }
        }
        this.h = true;
        this.J = new p00(true, k8Var);
        start();
    }
}
