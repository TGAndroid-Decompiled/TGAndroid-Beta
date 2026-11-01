package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class r40 extends org.telegram.messenger.s5 {
    public boolean D;
    public Integer E;
    public int F;
    public int G;
    public final e50 H;
    public final SurfaceTexture f29879a;
    public EGL10 f29880b;
    public EGLDisplay f29881c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f29882f;
    public Object h;
    public final SurfaceTexture[] f29883n;
    public int f29884r;
    public int f29885s;
    public int f29886w;
    public int f29887x;
    public int f29888y;

    public r40(e50 e50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread", true);
        this.H = e50Var;
        this.f29883n = new SurfaceTexture[2];
        this.E = 0;
        this.f29879a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void a(int i10, boolean z10, int i11, int i12, long j10) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new u40(i11, i12, j10, 0L, z10)), 0);
        }
    }

    public final void b() {
        e50 e50Var = this.H;
        if (e50Var.m0[e50Var.f25715j1] != null) {
            e50 e50Var2 = this.H;
            int width = e50Var2.m0[e50Var2.f25715j1].getWidth();
            e50 e50Var3 = this.H;
            int height = e50Var3.m0[e50Var3.f25715j1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                e50 e50Var4 = this.H;
                e50Var4.K0 = 1.0f;
                e50Var4.L0 = 1.0f;
            } else if (i10 > i11) {
                e50 e50Var5 = this.H;
                e50Var5.K0 = 1.0f;
                e50Var5.L0 = i10 / this.G;
            } else {
                e50 e50Var6 = this.H;
                e50Var6.K0 = i11 / this.F;
                e50Var6.L0 = 1.0f;
            }
            org.telegram.messenger.f8.b("InstantCamera camera scaleX = " + this.H.K0 + " scaleY = " + this.H.L0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f29883n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f29883n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f29883n[i10] = null;
                }
            }
        }
        this.H.V = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f29880b.eglGetCurrentContext()) || !this.e.equals(this.f29880b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f29880b;
                EGLDisplay eGLDisplay = this.f29881c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f25695a0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f25695a0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f25695a0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f25695a0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f29880b;
            EGLDisplay eGLDisplay2 = this.f29881c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f29880b.eglDestroySurface(this.f29881c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f29880b.eglDestroyContext(this.f29881c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f29881c;
        if (eGLDisplay3 != null) {
            this.f29880b.eglTerminate(eGLDisplay3);
            this.f29881c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        Object obj;
        boolean z14;
        x40 x40Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            u40 u40Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            e50 e50Var = this.H;
                            e50Var.f25715j1 = 1 - e50Var.f25715j1;
                            if (this.H.A0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f25715j1);
                            }
                            b();
                            e50 e50Var2 = this.H;
                            float f7 = (1.0f / e50Var2.K0) / 2.0f;
                            float f10 = (1.0f / e50Var2.L0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            e50Var2.I0 = org.telegram.messenger.a30.g(ByteBuffer.allocateDirect(32));
                            this.H.I0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.v2.f18578a) {
                        org.telegram.messenger.f8.b("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 == obj2) {
                        if (obj3 instanceof CameraSession) {
                            i11 = ((CameraSession) obj3).getWorldAngle();
                        } else if (obj3 instanceof Camera2Session) {
                            i11 = ((Camera2Session) obj3).getWorldAngle();
                        } else {
                            i11 = 0;
                        }
                        Matrix.setIdentityM(this.H.E0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.E0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f29880b;
                EGLDisplay eGLDisplay = this.f29881c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.v2.f18578a) {
                        org.telegram.messenger.f8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f29880b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f29883n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.G0);
                    this.f29883n[0].setOnFrameAvailableListener(null);
                    this.f29883n[0].release();
                    e50 e50Var3 = this.H;
                    int[] iArr = e50Var3.f25697b0;
                    int[] iArr2 = e50Var3.f25695a0;
                    iArr[0] = iArr2[0];
                    e50Var3.f25699c0 = 0.0f;
                    iArr2[0] = 0;
                    e50Var3.J0 = e50Var3.I0.duplicate();
                    e50 e50Var4 = this.H;
                    e50Var4.M0 = e50Var4.m0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.J = false;
                GLES20.glGenTextures(1, this.H.f25695a0, 0);
                GLES20.glBindTexture(36197, this.H.f25695a0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f29883n[0] = new SurfaceTexture(this.H.f25695a0[0]);
                this.f29883n[0].setOnFrameAvailableListener(new fz(this, 1));
                if (this.H.A0) {
                    this.H.p("GL input recreated: surface=0");
                }
                org.telegram.messenger.i0.g3(new ag.o0(this.H, 0, this.f29883n[0], 28));
                b();
                e50 e50Var5 = this.H;
                float f15 = (1.0f / e50Var5.K0) / 2.0f;
                float f16 = (1.0f / e50Var5.L0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                e50Var5.I0 = org.telegram.messenger.a30.g(ByteBuffer.allocateDirect(32));
                this.H.I0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.D && ((!((z14 = (obj = message.obj) instanceof u40)) || ((u40) obj).f30858c != -2) && (x40Var = this.H.f25711h1) != null)) {
                int i13 = message.arg1;
                if (z14) {
                    u40Var = (u40) obj;
                }
                x40Var.i(i13, u40Var);
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
                return;
            }
            return;
        }
        int i14 = message.arg1;
        int i15 = message.arg2;
        if ((i15 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f29882f) {
            if (!this.d.equals(this.f29880b.eglGetCurrentContext()) || !this.e.equals(this.f29880b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f29880b;
                EGLDisplay eGLDisplay2 = this.f29881c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.v2.f18578a) {
                        org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f29883n[0].updateTexImage();
            }
            if (z11) {
                this.f29883n[1].updateTexImage();
            }
            if (this.H.A0 && this.H.f25715j1 == this.H.f25737z0 && ((this.H.f25715j1 == 0 && z10) || (this.H.f25715j1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.D) {
                e50 e50Var6 = this.H;
                if (e50Var6.f25711h1 == null) {
                    e50Var6.f25711h1 = new x40(e50Var6);
                }
                e50 e50Var7 = this.H;
                if (e50Var7.f25711h1.F0) {
                    if (!e50Var7.J) {
                        this.H.J = true;
                        org.telegram.messenger.i0.g3(new Runnable(this) {
                            public final r40 f29630b;

                            {
                                this.f29630b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f29630b.H.f25723q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        e50 e50Var8 = this.f29630b.H;
                                        if (e50Var8.f25722p0 != null) {
                                            Bitmap bitmap = e50Var8.f25713i1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                e50Var8.f25713i1 = null;
                                            }
                                            e50Var8.f25713i1 = e50Var8.f25722p0.getBitmap();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    z13 = false;
                } else {
                    z13 = true;
                }
                e50 e50Var8 = this.H;
                x40 x40Var2 = e50Var8.f25711h1;
                org.telegram.messenger.qe qeVar = e50Var8.f25703e0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (x40Var2.F0 && x40Var2.T != null && x40Var2.T.getLooper() != null && x40Var2.T.getLooper().getThread() != null && x40Var2.T.getLooper().getThread().isAlive()) {
                    x40Var2.f32406x = eglGetCurrentContext;
                    x40Var2.T.sendMessage(x40Var2.T.obtainMessage(0, 1, 0));
                }
                x40Var2.F0 = true;
                int i16 = org.telegram.messenger.wp.r1(x40Var2.H0.e).f19267v3;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.sz(22));
                x40Var2.f32376a = qeVar;
                x40Var2.d = i16;
                x40Var2.e = i16;
                x40Var2.f32384f = org.telegram.messenger.wp.r1(x40Var2.H0.e).f19277w3 * 1024;
                x40Var2.f32406x = eglGetCurrentContext;
                synchronized (x40Var2.U) {
                    try {
                        if (!x40Var2.W) {
                            x40Var2.W = true;
                            Thread thread = new Thread(x40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!x40Var2.V) {
                                try {
                                    x40Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            x40Var2.A0.clear();
                            x40Var2.C0 = 0;
                            org.telegram.messenger.s5 s5Var = x40Var2.B0;
                            if (s5Var != null) {
                                s5Var.cleanupQueue();
                                x40Var2.B0.recycle();
                            }
                            x40Var2.B0 = new org.telegram.messenger.s5("keyframes_thumb_queue", true);
                            x40Var2.T.sendMessage(x40Var2.T.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                if (obj4 instanceof CameraSession) {
                    i10 = ((CameraSession) obj4).getCurrentOrientation();
                } else if (obj4 instanceof Camera2Session) {
                    i10 = ((Camera2Session) obj4).getCurrentOrientation();
                } else {
                    i10 = 0;
                }
                if (i10 == 90 || i10 == 270) {
                    e50 e50Var9 = this.H;
                    float f21 = e50Var9.K0;
                    e50Var9.K0 = e50Var9.L0;
                    e50Var9.L0 = f21;
                }
                this.D = true;
                this.H.v();
            } else {
                z13 = false;
            }
            e50 e50Var10 = this.H;
            if (e50Var10.f25711h1 != null && ((e50Var10.f25715j1 == 0 && z10) || (this.H.f25715j1 == 1 && z11))) {
                e50 e50Var11 = this.H;
                x40 x40Var3 = e50Var11.f25711h1;
                SurfaceTexture surfaceTexture2 = this.f29883n[e50Var11.f25715j1];
                e50 e50Var12 = this.H;
                if (e50Var12.f25728t0) {
                    i14 = e50Var12.f25715j1;
                }
                x40Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f29883n[this.H.f25715j1].getTransformMatrix(this.H.F0);
            GLES20.glUseProgram(this.f29884r);
            GLES20.glActiveTexture(33984);
            e50 e50Var13 = this.H;
            GLES20.glBindTexture(36197, e50Var13.f25695a0[e50Var13.f25715j1]);
            GLES20.glVertexAttribPointer(this.f29887x, 3, 5126, false, 12, (Buffer) this.H.H0);
            GLES20.glEnableVertexAttribArray(this.f29887x);
            GLES20.glVertexAttribPointer(this.f29888y, 2, 5126, false, 8, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f29888y);
            GLES20.glUniformMatrix4fv(this.f29886w, 1, false, this.H.F0, 0);
            GLES20.glUniformMatrix4fv(this.f29885s, 1, false, this.H.E0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f29887x);
            GLES20.glDisableVertexAttribArray(this.f29888y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f29880b.eglSwapBuffers(this.f29881c, this.e);
            if (z12 && this.H.A0) {
                this.H.A0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f25715j1);
            }
            if (z13) {
                org.telegram.messenger.i0.g3(new Runnable(this) {
                    public final r40 f29630b;

                    {
                        this.f29630b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f29630b.H.f25723q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                e50 e50Var82 = this.f29630b.H;
                                if (e50Var82.f25722p0 != null) {
                                    Bitmap bitmap = e50Var82.f25713i1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        e50Var82.f25713i1 = null;
                                    }
                                    e50Var82.f25713i1 = e50Var82.f25722p0.getBitmap();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z10, boolean z11) {
        int i10;
        Handler handler = getHandler();
        if (handler != null) {
            int intValue = this.E.intValue();
            if (z11) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            sendMessage(handler.obtainMessage(0, intValue, (z10 ? 1 : 0) + i10), 0);
        }
    }

    @Override
    public final void run() {
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f29880b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f29881c = eglGetDisplay;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f29880b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f29880b.eglChooseConfig(this.f29881c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f29880b.eglCreateContext(this.f29881c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.v2.f18578a) {
                        org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f29879a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f29880b.eglCreateWindowSurface(this.f29881c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f29880b.eglMakeCurrent(this.f29881c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.v2.f18578a) {
                                    org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                e50 e50Var = this.H;
                                float f7 = e50Var.K0;
                                int[] iArr2 = e50Var.f25695a0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / e50Var.L0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (e50Var.f25711h1 == null) {
                                    e50Var.f25711h1 = new x40(e50Var);
                                }
                                FloatBuffer g10 = org.telegram.messenger.a30.g(ByteBuffer.allocateDirect(48));
                                e50Var.H0 = g10;
                                g10.put(fArr).position(0);
                                FloatBuffer g11 = org.telegram.messenger.a30.g(ByteBuffer.allocateDirect(32));
                                e50Var.I0 = g11;
                                g11.put(fArr2).position(0);
                                Matrix.setIdentityM(e50Var.F0, 0);
                                int k10 = e50.k(e50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = e50.k(e50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f29884r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(this.f29884r, k11);
                                    GLES20.glLinkProgram(this.f29884r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f29884r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.v2.f18578a) {
                                            org.telegram.messenger.f8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f29884r);
                                        this.f29884r = 0;
                                    } else {
                                        this.f29887x = GLES20.glGetAttribLocation(this.f29884r, "aPosition");
                                        this.f29888y = GLES20.glGetAttribLocation(this.f29884r, "aTextureCoord");
                                        this.f29885s = GLES20.glGetUniformLocation(this.f29884r, "uMVPMatrix");
                                        this.f29886w = GLES20.glGetUniformLocation(this.f29884r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(e50Var.E0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f29883n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                r40 r40Var = r40.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                r40Var.H.V = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                r40Var.requestRender(z11, z12);
                                            }
                                        });
                                        org.telegram.messenger.i0.g3(new ag.o0(e50Var, i10, surfaceTextureArr[i10], 28));
                                    }
                                    if (org.telegram.messenger.v2.f18578a) {
                                        org.telegram.messenger.f8.d("InstantCamera gl initied");
                                    }
                                    z10 = true;
                                } else {
                                    if (org.telegram.messenger.v2.f18578a) {
                                        org.telegram.messenger.f8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.v2.f18578a) {
                                org.telegram.messenger.a30.t(this.f29880b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f29882f = z10;
        super.run();
    }
}
