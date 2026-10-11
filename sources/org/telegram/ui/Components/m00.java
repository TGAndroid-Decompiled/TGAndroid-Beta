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
public final class m00 extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final la H;
    public ra I;
    public final q00 J;
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
    public final SurfaceTexture f28641a;
    public long f28642a0;
    public EGL10 f28643b;
    public final cw f28644b0;
    public EGLDisplay f28645c;
    public boolean f28646c0;
    public EGLContext d;
    public final Runnable f28647d0;
    public EGLSurface f28648e;
    public boolean f28649f;
    public final boolean h;
    public volatile int f28650n;
    public volatile int f28651r;
    public Bitmap f28652s;
    public final int v;
    public SurfaceTexture f28653w;
    public boolean f28654x;
    public final float[] f28655y;

    public m00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, la laVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f28655y = new float[16];
        this.E = new int[1];
        this.f28647d0 = new j00(this, 1);
        this.f28641a = surfaceTexture;
        this.f28650n = i11;
        this.f28651r = i12;
        this.f28652s = bitmap;
        this.v = i10;
        this.H = laVar;
        boolean z12 = laVar != null;
        this.G = z12;
        if (z12) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f30482t;
            if (laVar2 != null && laVar2.f28327m != null) {
                laVar2.f28327m = null;
            }
            raVar.f30482t = laVar;
            if (laVar != null && laVar.f28327m != raVar) {
                laVar.f28327m = raVar;
                laVar.d();
            }
        }
        this.h = false;
        q00 q00Var = new q00(false, null);
        this.J = q00Var;
        q00Var.f30041i1 = z11;
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

    public static void b(m00 m00Var) {
        p00 p00Var;
        if (m00Var.f28649f) {
            m00Var.c();
            if (m00Var.f28654x) {
                m00Var.f28653w.updateTexImage();
                m00Var.f28653w.getTransformMatrix(m00Var.f28655y);
                m00Var.g();
                m00Var.f28654x = false;
                q00 q00Var = m00Var.J;
                q00Var.P0 = m00Var.f28655y;
                q00Var.W0 = false;
                m00Var.F = true;
            }
            if (m00Var.Z) {
                if (m00Var.h && ((p00Var = m00Var.J.f30033f1) == null || p00Var.b())) {
                    GLES20.glViewport(0, 0, m00Var.f28650n, m00Var.f28651r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(m00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, m00Var.E[0]);
                    GLES20.glUniform1i(m00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(m00Var.R);
                    int i10 = m00Var.R;
                    FloatBuffer floatBuffer = m00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = m00Var.J.f30019a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(m00Var.P);
                    GLES20.glVertexAttribPointer(m00Var.P, 2, 5126, false, 8, (Buffer) m00Var.J.f30022b1);
                    GLES20.glUniformMatrix4fv(m00Var.Q, 1, false, m00Var.f28655y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    m00Var.f28643b.eglSwapBuffers(m00Var.f28645c, m00Var.f28648e);
                    ra raVar = m00Var.I;
                    if (raVar != null) {
                        raVar.a(m00Var.f28655y, m00Var.E[0], m00Var.W, m00Var.X);
                        return;
                    }
                    return;
                }
                if (m00Var.f28644b0 == null || m00Var.F) {
                    GLES20.glViewport(0, 0, m00Var.U, m00Var.V);
                    m00Var.J.f();
                    m00Var.J.d();
                    if (m00Var.f28644b0 == null) {
                        m00Var.J.e();
                    }
                    m00Var.J.c();
                    m00Var.T = m00Var.J.b();
                    m00Var.f28646c0 = true;
                }
                if (m00Var.f28646c0) {
                    GLES20.glViewport(0, 0, m00Var.f28650n, m00Var.f28651r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = m00Var.J.g(1 ^ (m00Var.T ? 1 : 0));
                    GLES20.glUseProgram(m00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(m00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(m00Var.M);
                    int i11 = m00Var.M;
                    FloatBuffer floatBuffer2 = m00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = m00Var.J.f30019a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(m00Var.L);
                    GLES20.glVertexAttribPointer(m00Var.L, 2, 5126, false, 8, (Buffer) m00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    m00Var.f28643b.eglSwapBuffers(m00Var.f28645c, m00Var.f28648e);
                    ra raVar2 = m00Var.I;
                    if (raVar2 != null) {
                        raVar2.a(null, g10, m00Var.U, m00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f28643b.eglGetCurrentContext()) || !this.f28648e.equals(this.f28643b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f28643b;
            EGLDisplay eGLDisplay = this.f28645c;
            EGLSurface eGLSurface = this.f28648e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new k00(this, z10, z12, z11, 0));
    }

    public final void f(p00 p00Var) {
        postRunnable(new bs(14, this, p00Var));
    }

    public final void finish() {
        this.f28652s = null;
        if (this.f28648e != null) {
            EGL10 egl10 = this.f28643b;
            EGLDisplay eGLDisplay = this.f28645c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f28643b.eglDestroySurface(this.f28645c, this.f28648e);
            this.f28648e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            la laVar = this.H;
            if (laVar != null) {
                synchronized (laVar.f28321f) {
                    try {
                        if (laVar.f28322g == eGLContext) {
                            laVar.f28322g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f28643b.eglDestroyContext(this.f28645c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f28645c;
        if (eGLDisplay2 != null) {
            this.f28643b.eglTerminate(eGLDisplay2);
            this.f28645c = null;
        }
        SurfaceTexture surfaceTexture = this.f28641a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f28652s, this.v, this.E[0], i10, i11);
            this.Z = true;
            q00 q00Var = this.J;
            this.U = q00Var.X0;
            this.V = q00Var.Y0;
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
            h = q00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = q00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = q00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = q00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new i00(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        ra raVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f28643b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f28645c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f28643b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f28643b.eglChooseConfig(this.f28645c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                la laVar = this.H;
                if (laVar != null) {
                    synchronized (laVar.f28321f) {
                        try {
                            eGLContext = laVar.f28322g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f28643b.eglCreateContext(this.f28645c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    la laVar2 = this.H;
                    if (laVar2 != null) {
                        laVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f28641a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f28643b.eglCreateWindowSurface(this.f28645c, eGLConfig, surfaceTexture, null);
                        this.f28648e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f28643b.eglMakeCurrent(this.f28645c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = q00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = q00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f28652s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f28652s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f28644b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f28655y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f28653w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new l00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new j00(this, 2));
                                        }
                                        if (this.G && (raVar = this.I) != null && !raVar.b(this.f28650n / this.f28651r, this.H.f28317a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f28652s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                q00 q00Var = this.J;
                                                this.U = q00Var.X0;
                                                this.V = q00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ai.v(this.f28643b, new StringBuilder("createWindowSurface failed "));
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
        this.f28649f = z10;
        super.run();
    }

    public m00(SurfaceTexture surfaceTexture, cw cwVar, ci.k8 k8Var, la laVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f28655y = new float[16];
        this.E = new int[1];
        this.f28647d0 = new j00(this, 1);
        this.f28641a = surfaceTexture;
        this.f28650n = i10;
        this.f28651r = i11;
        this.f28644b0 = cwVar;
        this.H = laVar;
        boolean z10 = laVar != null;
        this.G = z10;
        if (z10) {
            ra raVar = new ra();
            this.I = raVar;
            la laVar2 = raVar.f30482t;
            if (laVar2 != null && laVar2.f28327m != null) {
                laVar2.f28327m = null;
            }
            raVar.f30482t = laVar;
            if (laVar != null && laVar.f28327m != raVar) {
                laVar.f28327m = raVar;
                laVar.d();
            }
        }
        this.h = true;
        this.J = new q00(true, k8Var);
        start();
    }
}
