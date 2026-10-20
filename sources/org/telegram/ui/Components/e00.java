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
    public final ja H;
    public pa I;
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
    public final SurfaceTexture f25677a;
    public long f25678a0;
    public EGL10 f25679b;
    public final tv f25680b0;
    public EGLDisplay f25681c;
    public boolean f25682c0;
    public EGLContext d;
    public final Runnable f25683d0;
    public EGLSurface e;
    public boolean f25684f;
    public final boolean h;
    public volatile int f25685n;
    public volatile int f25686r;
    public Bitmap f25687s;
    public final int v;
    public SurfaceTexture f25688w;
    public boolean f25689x;
    public final float[] f25690y;

    public e00(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ja jaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f25690y = new float[16];
        this.E = new int[1];
        this.f25683d0 = new b00(this, 1);
        this.f25677a = surfaceTexture;
        this.f25685n = i11;
        this.f25686r = i12;
        this.f25687s = bitmap;
        this.v = i10;
        this.H = jaVar;
        boolean z12 = jaVar != null;
        this.G = z12;
        if (z12) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f29286t;
            if (jaVar2 != null && jaVar2.f27482m != null) {
                jaVar2.f27482m = null;
            }
            paVar.f29286t = jaVar;
            if (jaVar != null && jaVar.f27482m != paVar) {
                jaVar.f27482m = paVar;
                jaVar.d();
            }
        }
        this.h = false;
        i00 i00Var = new i00(false, null);
        this.J = i00Var;
        i00Var.f27046i1 = z11;
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
        if (e00Var.f25684f) {
            e00Var.c();
            if (e00Var.f25689x) {
                e00Var.f25688w.updateTexImage();
                e00Var.f25688w.getTransformMatrix(e00Var.f25690y);
                e00Var.g();
                e00Var.f25689x = false;
                i00 i00Var = e00Var.J;
                i00Var.P0 = e00Var.f25690y;
                i00Var.W0 = false;
                e00Var.F = true;
            }
            if (e00Var.Z) {
                if (e00Var.h && ((h00Var = e00Var.J.f27038f1) == null || h00Var.b())) {
                    GLES20.glViewport(0, 0, e00Var.f25685n, e00Var.f25686r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(e00Var.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, e00Var.E[0]);
                    GLES20.glUniform1i(e00Var.S, 0);
                    GLES20.glEnableVertexAttribArray(e00Var.R);
                    int i10 = e00Var.R;
                    FloatBuffer floatBuffer = e00Var.Y;
                    if (floatBuffer == null) {
                        floatBuffer = e00Var.J.f27025a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(e00Var.P);
                    GLES20.glVertexAttribPointer(e00Var.P, 2, 5126, false, 8, (Buffer) e00Var.J.f27028b1);
                    GLES20.glUniformMatrix4fv(e00Var.Q, 1, false, e00Var.f25690y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e00Var.f25679b.eglSwapBuffers(e00Var.f25681c, e00Var.e);
                    pa paVar = e00Var.I;
                    if (paVar != null) {
                        paVar.a(e00Var.f25690y, e00Var.E[0], e00Var.W, e00Var.X);
                        return;
                    }
                    return;
                }
                if (e00Var.f25680b0 == null || e00Var.F) {
                    GLES20.glViewport(0, 0, e00Var.U, e00Var.V);
                    e00Var.J.f();
                    e00Var.J.d();
                    if (e00Var.f25680b0 == null) {
                        e00Var.J.e();
                    }
                    e00Var.J.c();
                    e00Var.T = e00Var.J.b();
                    e00Var.f25682c0 = true;
                }
                if (e00Var.f25682c0) {
                    GLES20.glViewport(0, 0, e00Var.f25685n, e00Var.f25686r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = e00Var.J.g(1 ^ (e00Var.T ? 1 : 0));
                    GLES20.glUseProgram(e00Var.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(e00Var.N, 0);
                    GLES20.glEnableVertexAttribArray(e00Var.M);
                    int i11 = e00Var.M;
                    FloatBuffer floatBuffer2 = e00Var.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = e00Var.J.f27025a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(e00Var.L);
                    GLES20.glVertexAttribPointer(e00Var.L, 2, 5126, false, 8, (Buffer) e00Var.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    e00Var.f25679b.eglSwapBuffers(e00Var.f25681c, e00Var.e);
                    pa paVar2 = e00Var.I;
                    if (paVar2 != null) {
                        paVar2.a(null, g10, e00Var.U, e00Var.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f25679b.eglGetCurrentContext()) || !this.e.equals(this.f25679b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f25679b;
            EGLDisplay eGLDisplay = this.f25681c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        postRunnable(new c00(this, z10, z12, z11, 0));
    }

    public final void f(h00 h00Var) {
        postRunnable(new yt(10, this, h00Var));
    }

    public final void finish() {
        this.f25687s = null;
        if (this.e != null) {
            EGL10 egl10 = this.f25679b;
            EGLDisplay eGLDisplay = this.f25681c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f25679b.eglDestroySurface(this.f25681c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ja jaVar = this.H;
            if (jaVar != null) {
                synchronized (jaVar.f27476f) {
                    try {
                        if (jaVar.f27477g == eGLContext) {
                            jaVar.f27477g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f25679b.eglDestroyContext(this.f25681c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f25681c;
        if (eGLDisplay2 != null) {
            this.f25679b.eglTerminate(eGLDisplay2);
            this.f25681c = null;
        }
        SurfaceTexture surfaceTexture = this.f25677a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f25687s, this.v, this.E[0], i10, i11);
            this.Z = true;
            i00 i00Var = this.J;
            this.U = i00Var.X0;
            this.V = i00Var.Y0;
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
        pa paVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f25679b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f25681c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f25679b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f25679b.eglChooseConfig(this.f25681c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ja jaVar = this.H;
                if (jaVar != null) {
                    synchronized (jaVar.f27476f) {
                        try {
                            eGLContext = jaVar.f27477g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f25679b.eglCreateContext(this.f25681c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ja jaVar2 = this.H;
                    if (jaVar2 != null) {
                        jaVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f25677a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f25679b.eglCreateWindowSurface(this.f25681c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f25679b.eglMakeCurrent(this.f25681c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("eglMakeCurrent failed "));
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
                                        Bitmap bitmap = this.f25687s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f25687s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f25680b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f25690y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f25688w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new d00(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new b00(this, 2));
                                        }
                                        if (this.G && (paVar = this.I) != null && !paVar.b(this.f25685n / this.f25686r, this.H.f27473a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f25687s, this.v, this.E[0], i12, i13);
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
                                org.telegram.messenger.mk.v(this.f25679b, new StringBuilder("createWindowSurface failed "));
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
        this.f25684f = z10;
        super.run();
    }

    public e00(SurfaceTexture surfaceTexture, tv tvVar, ei.z7 z7Var, ja jaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f25690y = new float[16];
        this.E = new int[1];
        this.f25683d0 = new b00(this, 1);
        this.f25677a = surfaceTexture;
        this.f25685n = i10;
        this.f25686r = i11;
        this.f25680b0 = tvVar;
        this.H = jaVar;
        boolean z10 = jaVar != null;
        this.G = z10;
        if (z10) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.f29286t;
            if (jaVar2 != null && jaVar2.f27482m != null) {
                jaVar2.f27482m = null;
            }
            paVar.f29286t = jaVar;
            if (jaVar != null && jaVar.f27482m != paVar) {
                jaVar.f27482m = paVar;
                jaVar.d();
            }
        }
        this.h = true;
        this.J = new i00(true, z7Var);
        start();
    }
}
