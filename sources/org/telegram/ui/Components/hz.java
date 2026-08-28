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
public final class hz extends DispatchQueue {
    public final int[] A;
    public boolean B;
    public boolean C;
    public final ba D;
    public ha E;
    public final lz F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final FloatBuffer U;
    public boolean V;
    public long W;
    public final wu X;
    public boolean Y;
    public final Runnable Z;
    public final SurfaceTexture f29234a;
    public EGL10 f29235b;
    public EGLDisplay f29236c;
    public EGLContext d;
    public EGLSurface f29237e;
    public boolean f29238f;
    public final boolean h;
    public volatile int f29239n;
    public volatile int f29240r;
    public Bitmap f29241s;
    public final int v;
    public SurfaceTexture f29242w;
    public boolean f29243x;
    public final float[] f29244y;

    public hz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i9, boolean z10, boolean z11, ba baVar, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.f29244y = new float[16];
        this.A = new int[1];
        this.Z = new ez(this, 1);
        this.f29234a = surfaceTexture;
        this.f29239n = i10;
        this.f29240r = i11;
        this.f29241s = bitmap;
        this.v = i9;
        this.D = baVar;
        boolean z12 = baVar != null;
        this.C = z12;
        if (z12) {
            ha haVar = new ha();
            this.E = haVar;
            ba baVar2 = haVar.f29021t;
            if (baVar2 != null && baVar2.f27130m != null) {
                baVar2.f27130m = null;
            }
            haVar.f29021t = baVar;
            if (baVar != null && baVar.f27130m != haVar) {
                baVar.f27130m = haVar;
                baVar.d();
            }
        }
        this.h = false;
        lz lzVar = new lz(false, null);
        this.F = lzVar;
        lzVar.f30610i1 = z11;
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
        this.U = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void b(hz hzVar) {
        kz kzVar;
        if (hzVar.f29238f) {
            hzVar.c();
            if (hzVar.f29243x) {
                hzVar.f29242w.updateTexImage();
                hzVar.f29242w.getTransformMatrix(hzVar.f29244y);
                hzVar.g();
                hzVar.f29243x = false;
                lz lzVar = hzVar.F;
                lzVar.P0 = hzVar.f29244y;
                lzVar.W0 = false;
                hzVar.B = true;
            }
            if (hzVar.V) {
                if (hzVar.h && ((kzVar = hzVar.F.f30602f1) == null || kzVar.b())) {
                    GLES20.glViewport(0, 0, hzVar.f29239n, hzVar.f29240r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(hzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, hzVar.A[0]);
                    GLES20.glUniform1i(hzVar.O, 0);
                    GLES20.glEnableVertexAttribArray(hzVar.N);
                    int i9 = hzVar.N;
                    FloatBuffer floatBuffer = hzVar.U;
                    if (floatBuffer == null) {
                        floatBuffer = hzVar.F.f30588a1;
                    }
                    GLES20.glVertexAttribPointer(i9, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(hzVar.L);
                    GLES20.glVertexAttribPointer(hzVar.L, 2, 5126, false, 8, (Buffer) hzVar.F.f30591b1);
                    GLES20.glUniformMatrix4fv(hzVar.M, 1, false, hzVar.f29244y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    hzVar.f29235b.eglSwapBuffers(hzVar.f29236c, hzVar.f29237e);
                    ha haVar = hzVar.E;
                    if (haVar != null) {
                        haVar.a(hzVar.f29244y, hzVar.A[0], hzVar.S, hzVar.T);
                        return;
                    }
                    return;
                }
                if (hzVar.X == null || hzVar.B) {
                    GLES20.glViewport(0, 0, hzVar.Q, hzVar.R);
                    hzVar.F.f();
                    hzVar.F.d();
                    if (hzVar.X == null) {
                        hzVar.F.e();
                    }
                    hzVar.F.c();
                    hzVar.P = hzVar.F.b();
                    hzVar.Y = true;
                }
                if (hzVar.Y) {
                    GLES20.glViewport(0, 0, hzVar.f29239n, hzVar.f29240r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = hzVar.F.g(1 ^ (hzVar.P ? 1 : 0));
                    GLES20.glUseProgram(hzVar.G);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(hzVar.J, 0);
                    GLES20.glEnableVertexAttribArray(hzVar.I);
                    int i10 = hzVar.I;
                    FloatBuffer floatBuffer2 = hzVar.U;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = hzVar.F.f30588a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(hzVar.H);
                    GLES20.glVertexAttribPointer(hzVar.H, 2, 5126, false, 8, (Buffer) hzVar.F.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    hzVar.f29235b.eglSwapBuffers(hzVar.f29236c, hzVar.f29237e);
                    ha haVar2 = hzVar.E;
                    if (haVar2 != null) {
                        haVar2.a(null, g10, hzVar.Q, hzVar.R);
                    }
                }
            }
        }
    }

    public final void c() {
        if (!this.d.equals(this.f29235b.eglGetCurrentContext()) || !this.f29237e.equals(this.f29235b.eglGetCurrentSurface(12377))) {
            EGL10 egl10 = this.f29235b;
            EGLDisplay eGLDisplay = this.f29236c;
            EGLSurface eGLSurface = this.f29237e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) && BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglMakeCurrent failed "));
            }
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new fz(this, z10, z12, z11, 0));
    }

    public final void f(kz kzVar) {
        postRunnable(new zq(15, this, kzVar));
    }

    public final void finish() {
        this.f29241s = null;
        if (this.f29237e != null) {
            EGL10 egl10 = this.f29235b;
            EGLDisplay eGLDisplay = this.f29236c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f29235b.eglDestroySurface(this.f29236c, this.f29237e);
            this.f29237e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ba baVar = this.D;
            if (baVar != null) {
                synchronized (baVar.f27124f) {
                    try {
                        if (baVar.f27125g == eGLContext) {
                            baVar.f27125g = null;
                        }
                    } finally {
                    }
                }
            }
            this.f29235b.eglDestroyContext(this.f29236c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.f29236c;
        if (eGLDisplay2 != null) {
            this.f29235b.eglTerminate(eGLDisplay2);
            this.f29236c = null;
        }
        SurfaceTexture surfaceTexture = this.f29234a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i9;
        int i10;
        if (!this.V && (i9 = this.S) > 0 && (i10 = this.T) > 0) {
            this.F.i(this.f29241s, this.v, this.A[0], i9, i10);
            this.V = true;
            lz lzVar = this.F;
            this.Q = lzVar.X0;
            this.R = lzVar.Y0;
        }
    }

    public final boolean h(kh.z7 z7Var) {
        int i9;
        String str;
        int h;
        int h10;
        if (z7Var != null) {
            i9 = z7Var.a();
        } else {
            i9 = 0;
        }
        if (i9 == 1) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else if (i9 == 2) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        } else {
            str = "";
        }
        if (i9 != 0) {
            h = lz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = lz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", str));
        } else {
            h = lz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = lz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h10 == 0) {
            return false;
        }
        int i10 = this.K;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.K = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.K, h10);
        GLES20.glBindAttribLocation(this.K, 0, "position");
        GLES20.glBindAttribLocation(this.K, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.K);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.K, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.K);
            this.K = 0;
        } else {
            this.L = GLES20.glGetAttribLocation(this.K, "position");
            this.N = GLES20.glGetAttribLocation(this.K, "inputTexCoord");
            this.O = GLES20.glGetUniformLocation(this.K, "sourceImage");
            this.M = GLES20.glGetUniformLocation(this.K, "videoMatrix");
        }
        return true;
    }

    public final void i(int i9, int i10) {
        if (this.E == null) {
            return;
        }
        postRunnable(new dz(this, i9, i10, 2));
    }

    @Override
    public final void run() {
        EGLContext eGLContext;
        int i9;
        int i10;
        ha haVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f29235b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f29236c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f29235b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f29235b.eglChooseConfig(this.f29236c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr2 = {12440, 2, 12344};
                ba baVar = this.D;
                if (baVar != null) {
                    synchronized (baVar.f27124f) {
                        try {
                            eGLContext = baVar.f27125g;
                            if (eGLContext == null) {
                                eGLContext = EGL10.EGL_NO_CONTEXT;
                            }
                        } finally {
                        }
                    }
                } else {
                    eGLContext = EGL10.EGL_NO_CONTEXT;
                }
                EGLContext eglCreateContext = this.f29235b.eglCreateContext(this.f29236c, eGLConfig, eGLContext, iArr2);
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    ba baVar2 = this.D;
                    if (baVar2 != null) {
                        baVar2.a(eglCreateContext);
                    }
                    SurfaceTexture surfaceTexture = this.f29234a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f29235b.eglCreateWindowSurface(this.f29236c, eGLConfig, surfaceTexture, null);
                        this.f29237e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f29235b.eglMakeCurrent(this.f29236c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int h = lz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = lz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.G = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.G, h10);
                                    GLES20.glBindAttribLocation(this.G, 0, "position");
                                    GLES20.glBindAttribLocation(this.G, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.G);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.G, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.G);
                                        this.G = 0;
                                    } else {
                                        this.H = GLES20.glGetAttribLocation(this.G, "position");
                                        this.I = GLES20.glGetAttribLocation(this.G, "inputTexCoord");
                                        this.J = GLES20.glGetUniformLocation(this.G, "sourceImage");
                                    }
                                    if (h(null)) {
                                        Bitmap bitmap = this.f29241s;
                                        if (bitmap != null) {
                                            i9 = bitmap.getWidth();
                                            i10 = this.f29241s.getHeight();
                                        } else {
                                            i9 = this.S;
                                            i10 = this.T;
                                        }
                                        int i11 = i9;
                                        int i12 = i10;
                                        if (this.X != null) {
                                            GLES20.glGenTextures(1, this.A, 0);
                                            Matrix.setIdentityM(this.f29244y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.A[0]);
                                            this.f29242w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new gz(this, 0));
                                            GLES20.glBindTexture(36197, this.A[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new ez(this, 2));
                                        }
                                        if (this.C && (haVar = this.E) != null && !haVar.b(this.f29239n / this.f29240r, this.D.f27120a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.C = false;
                                            this.E = null;
                                        }
                                        if (!this.F.a()) {
                                            finish();
                                        } else {
                                            if (i11 != 0 && i12 != 0) {
                                                this.F.i(this.f29241s, this.v, this.A[0], i11, i12);
                                                this.V = true;
                                                lz lzVar = this.F;
                                                this.Q = lzVar.X0;
                                                this.R = lzVar.Y0;
                                            }
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ll.t(this.f29235b, new StringBuilder("createWindowSurface failed "));
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
        this.f29238f = z10;
        super.run();
    }

    public hz(SurfaceTexture surfaceTexture, wu wuVar, kh.z7 z7Var, ba baVar, int i9, int i10) {
        super("VideoFilterGLThread", false);
        this.f29244y = new float[16];
        this.A = new int[1];
        this.Z = new ez(this, 1);
        this.f29234a = surfaceTexture;
        this.f29239n = i9;
        this.f29240r = i10;
        this.X = wuVar;
        this.D = baVar;
        boolean z10 = baVar != null;
        this.C = z10;
        if (z10) {
            ha haVar = new ha();
            this.E = haVar;
            ba baVar2 = haVar.f29021t;
            if (baVar2 != null && baVar2.f27130m != null) {
                baVar2.f27130m = null;
            }
            haVar.f29021t = baVar;
            if (baVar != null && baVar.f27130m != haVar) {
                baVar.f27130m = haVar;
                baVar.d();
            }
        }
        this.h = true;
        this.F = new lz(true, z7Var);
        start();
    }
}
