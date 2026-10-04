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
public final class yz extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ka H;
    public qa I;
    public final c00 J;
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
    public final SurfaceTexture f33290a;
    public long f33291a0;
    public EGL10 f33292b;
    public final pv f33293b0;
    public EGLDisplay f33294c;
    public boolean f33295c0;
    public EGLContext d;
    public final Runnable f33296d0;
    public EGLSurface f33297e;
    public boolean f33298f;
    public final boolean h;
    public volatile int f33299n;
    public volatile int f33300r;
    public Bitmap f33301s;
    public final int v;
    public SurfaceTexture f33302w;
    public boolean f33303x;
    public final float[] f33304y;

    public yz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ka kaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.f33304y = new float[16];
        this.E = new int[1];
        this.f33296d0 = new vz(this, 1);
        this.f33290a = surfaceTexture;
        this.f33299n = i11;
        this.f33300r = i12;
        this.f33301s = bitmap;
        this.v = i10;
        this.H = kaVar;
        boolean z12 = kaVar != null;
        this.G = z12;
        if (z12) {
            qa qaVar = new qa();
            this.I = qaVar;
            ka kaVar2 = qaVar.f29988t;
            if (kaVar2 != null && kaVar2.f28054m != null) {
                kaVar2.f28054m = null;
            }
            qaVar.f29988t = kaVar;
            if (kaVar != null && kaVar.f28054m != qaVar) {
                kaVar.f28054m = qaVar;
                kaVar.d();
            }
        }
        this.h = false;
        c00 c00Var = new c00(false, null);
        this.J = c00Var;
        c00Var.f25119i1 = z11;
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

    public static void b(yz yzVar) {
        b00 b00Var;
        if (yzVar.f33298f) {
            yzVar.c();
            if (yzVar.f33303x) {
                yzVar.f33302w.updateTexImage();
                yzVar.f33302w.getTransformMatrix(yzVar.f33304y);
                yzVar.g();
                yzVar.f33303x = false;
                c00 c00Var = yzVar.J;
                c00Var.P0 = yzVar.f33304y;
                c00Var.W0 = false;
                yzVar.F = true;
            }
            if (yzVar.Z) {
                if (yzVar.h && ((b00Var = yzVar.J.f25111f1) == null || b00Var.b())) {
                    GLES20.glViewport(0, 0, yzVar.f33299n, yzVar.f33300r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(yzVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, yzVar.E[0]);
                    GLES20.glUniform1i(yzVar.S, 0);
                    GLES20.glEnableVertexAttribArray(yzVar.R);
                    int i10 = yzVar.R;
                    FloatBuffer floatBuffer = yzVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = yzVar.J.f25097a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(yzVar.P);
                    GLES20.glVertexAttribPointer(yzVar.P, 2, 5126, false, 8, (Buffer) yzVar.J.f25100b1);
                    GLES20.glUniformMatrix4fv(yzVar.Q, 1, false, yzVar.f33304y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    yzVar.f33292b.eglSwapBuffers(yzVar.f33294c, yzVar.f33297e);
                    qa qaVar = yzVar.I;
                    if (qaVar != null) {
                        qaVar.a(yzVar.f33304y, yzVar.E[0], yzVar.W, yzVar.X);
                        return;
                    }
                    return;
                }
                if (yzVar.f33293b0 == null || yzVar.F) {
                    GLES20.glViewport(0, 0, yzVar.U, yzVar.V);
                    yzVar.J.f();
                    yzVar.J.d();
                    if (yzVar.f33293b0 == null) {
                        yzVar.J.e();
                    }
                    yzVar.J.c();
                    yzVar.T = yzVar.J.b();
                    yzVar.f33295c0 = true;
                }
                if (yzVar.f33295c0) {
                    GLES20.glViewport(0, 0, yzVar.f33299n, yzVar.f33300r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = yzVar.J.g(1 ^ (yzVar.T ? 1 : 0));
                    GLES20.glUseProgram(yzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(yzVar.N, 0);
                    GLES20.glEnableVertexAttribArray(yzVar.M);
                    int i11 = yzVar.M;
                    FloatBuffer floatBuffer2 = yzVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = yzVar.J.f25097a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(yzVar.L);
                    GLES20.glVertexAttribPointer(yzVar.L, 2, 5126, false, 8, (Buffer) yzVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    yzVar.f33292b.eglSwapBuffers(yzVar.f33294c, yzVar.f33297e);
                    qa qaVar2 = yzVar.I;
                    if (qaVar2 != null) {
                        qaVar2.a(null, g10, yzVar.U, yzVar.V);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f33292b.eglGetCurrentContext()) || !this.f33297e.equals(this.f33292b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f33292b;
            EGLDisplay eGLDisplay = this.f33294c;
            EGLSurface eGLSurface = this.f33297e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new wz(this, z10, z12, z11, 0));
    }

    public final void f(b00 b00Var) {
        postRunnable(new yw(7, this, b00Var));
    }

    public final void finish() {
        this.f33301s = null;
        if (this.f33297e != null) {
            EGL10 egl10 = this.f33292b;
            EGLDisplay eGLDisplay = this.f33294c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f33292b.eglDestroySurface(this.f33294c, this.f33297e);
            this.f33297e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ka kaVar = this.H;
            if (kaVar != null) {
                synchronized (kaVar.f28048f) {
                    try {
                        if (kaVar.f28049g == eGLContext) {
                            kaVar.f28049g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f33292b.eglDestroyContext(this.f33294c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f33294c;
        if (eGLDisplay2 != null) {
            this.f33292b.eglTerminate(eGLDisplay2);
            this.f33294c = null;
        }
        SurfaceTexture surfaceTexture = this.f33290a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (!this.Z && (i10 = this.W) > 0 && (i11 = this.X) > 0) {
            this.J.i(this.f33301s, this.v, this.E[0], i10, i11);
            this.Z = true;
            c00 c00Var = this.J;
            this.U = c00Var.X0;
            this.V = c00Var.Y0;
        }
    }

    public final boolean h(ci.j8 j8Var) {
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
            h = c00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = c00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = c00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = c00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new uz(this, i10, i11, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        qa qaVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f33292b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f33294c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f33292b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f33292b.eglChooseConfig(this.f33294c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ka kaVar = this.H;
                if (kaVar != null) {
                    synchronized (kaVar.f28048f) {
                        try {
                            eGLContext = kaVar.f28049g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f33292b.eglCreateContext(this.f33294c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ka kaVar2 = this.H;
                    if (kaVar2 != null) {
                        kaVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f33290a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f33292b.eglCreateWindowSurface(this.f33294c, eGLConfig, surfaceTexture, null);
                        this.f33297e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f33292b.eglMakeCurrent(this.f33294c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = c00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = c00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                        Bitmap bitmap = this.f33301s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.f33301s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i12 = i10;
                                        int i13 = i11;
                                        if (this.f33293b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.f33304y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.f33302w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new xz(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new vz(this, 2));
                                        }
                                        if (this.G && (qaVar = this.I) != null && !qaVar.b(this.f33299n / this.f33300r, this.H.f28044a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (!this.J.a()) {
                                            finish();
                                        } else {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.f33301s, this.v, this.E[0], i12, i13);
                                                this.Z = true;
                                                c00 c00Var = this.J;
                                                this.U = c00Var.X0;
                                                this.V = c00Var.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ok.u(this.f33292b, new StringBuilder("createWindowSurface failed "));
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
        this.f33298f = z10;
        super.run();
    }

    public yz(SurfaceTexture surfaceTexture, pv pvVar, ci.j8 j8Var, ka kaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.f33304y = new float[16];
        this.E = new int[1];
        this.f33296d0 = new vz(this, 1);
        this.f33290a = surfaceTexture;
        this.f33299n = i10;
        this.f33300r = i11;
        this.f33293b0 = pvVar;
        this.H = kaVar;
        boolean z10 = kaVar != null;
        this.G = z10;
        if (z10) {
            qa qaVar = new qa();
            this.I = qaVar;
            ka kaVar2 = qaVar.f29988t;
            if (kaVar2 != null && kaVar2.f28054m != null) {
                kaVar2.f28054m = null;
            }
            qaVar.f29988t = kaVar;
            if (kaVar != null && kaVar.f28054m != qaVar) {
                kaVar.f28054m = qaVar;
                kaVar.d();
            }
        }
        this.h = true;
        this.J = new c00(true, j8Var);
        start();
    }
}
