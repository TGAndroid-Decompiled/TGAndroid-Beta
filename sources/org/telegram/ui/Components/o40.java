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
public final class o40 extends org.telegram.messenger.r5 {
    public boolean E;
    public Integer F;
    public int G;
    public int H;
    public final c50 I;
    public final SurfaceTexture f38073a;
    public EGL10 f38074b;
    public EGLDisplay f38075c;
    public EGLContext d;
    public EGLSurface f38076e;
    public boolean f38077f;
    public Object h;
    public final SurfaceTexture[] f38078n;
    public int f38079r;
    public int f38080s;
    public int f38081w;
    public int f38082x;
    public int f38083y;

    public o40(c50 c50Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.I = c50Var;
        this.f38078n = new SurfaceTexture[2];
        this.F = 0;
        this.f38073a = surfaceTexture;
        this.G = i7;
        this.H = i10;
    }

    public final void a(int i7, boolean z10, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new r40(i10, i11, j3, 0L, z10)), 0);
        }
    }

    public final void b() {
        c50 c50Var = this.I;
        if (c50Var.f34041n0[c50Var.f34038k1] != null) {
            c50 c50Var2 = this.I;
            int width = c50Var2.f34041n0[c50Var2.f34038k1].getWidth();
            c50 c50Var3 = this.I;
            int height = c50Var3.f34041n0[c50Var3.f34038k1].getHeight();
            float min = this.G / Math.min(width, height);
            int i7 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i7 == i10) {
                c50 c50Var4 = this.I;
                c50Var4.L0 = 1.0f;
                c50Var4.M0 = 1.0f;
            } else if (i7 > i10) {
                c50 c50Var5 = this.I;
                c50Var5.L0 = 1.0f;
                c50Var5.M0 = i7 / this.H;
            } else {
                c50 c50Var6 = this.I;
                c50Var6.L0 = i10 / this.G;
                c50Var6.M0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.I.L0 + " scaleY = " + this.I.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f38078n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.f38078n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f38078n[i7] = null;
                }
            }
        }
        this.I.W = false;
        if (this.f38076e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f38074b.eglGetCurrentContext()) || !this.f38076e.equals(this.f38074b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f38074b;
                EGLDisplay eGLDisplay = this.f38075c;
                EGLSurface eGLSurface = this.f38076e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.I.f34017b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.I.f34017b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.I.f34017b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.I.f34017b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f38076e != null) {
            EGL10 egl102 = this.f38074b;
            EGLDisplay eGLDisplay2 = this.f38075c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f38074b.eglDestroySurface(this.f38075c, this.f38076e);
            this.f38076e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f38074b.eglDestroyContext(this.f38075c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f38075c;
        if (eGLDisplay3 != null) {
            this.f38074b.eglTerminate(eGLDisplay3);
            this.f38075c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        Object obj;
        boolean z14;
        u40 u40Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            r40 r40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            c50 c50Var = this.I;
                            c50Var.f34038k1 = 1 - c50Var.f34038k1;
                            if (this.I.B0) {
                                this.I.q("GL surface flip applied: surface=" + this.I.f34038k1);
                            }
                            b();
                            c50 c50Var2 = this.I;
                            float f10 = (1.0f / c50Var2.L0) / 2.0f;
                            float f11 = (1.0f / c50Var2.M0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            c50Var2.J0 = org.telegram.messenger.o10.i(ByteBuffer.allocateDirect(32));
                            this.I.J0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.a8.b("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 == obj2) {
                        if (obj3 instanceof CameraSession) {
                            i10 = ((CameraSession) obj3).getWorldAngle();
                        } else if (obj3 instanceof Camera2Session) {
                            i10 = ((Camera2Session) obj3).getRoundVideoRotationAngle();
                        } else {
                            i10 = 0;
                        }
                        Matrix.setIdentityM(this.I.F0, 0);
                        if (i10 != 0) {
                            Matrix.rotateM(this.I.F0, 0, i10, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f38074b;
                EGLDisplay eGLDisplay = this.f38075c;
                EGLSurface eGLSurface = this.f38076e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f38074b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f38078n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.I.H0);
                    this.f38078n[0].setOnFrameAvailableListener(null);
                    this.f38078n[0].release();
                    c50 c50Var3 = this.I;
                    int[] iArr = c50Var3.f34019c0;
                    int[] iArr2 = c50Var3.f34017b0;
                    iArr[0] = iArr2[0];
                    c50Var3.f34021d0 = 0.0f;
                    iArr2[0] = 0;
                    c50Var3.K0 = c50Var3.J0.duplicate();
                    c50 c50Var4 = this.I;
                    c50Var4.N0 = c50Var4.f34041n0[0];
                }
                this.F = Integer.valueOf(this.F.intValue() + 1);
                this.I.K = false;
                GLES20.glGenTextures(1, this.I.f34017b0, 0);
                GLES20.glBindTexture(36197, this.I.f34017b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f38078n[0] = new SurfaceTexture(this.I.f34017b0[0]);
                this.f38078n[0].setOnFrameAvailableListener(new dz(this, 1));
                if (this.I.B0) {
                    this.I.q("GL input recreated: surface=0");
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0(this.I, 0, this.f38078n[0], 14));
                b();
                c50 c50Var5 = this.I;
                float f16 = (1.0f / c50Var5.L0) / 2.0f;
                float f17 = (1.0f / c50Var5.M0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                c50Var5.J0 = org.telegram.messenger.o10.i(ByteBuffer.allocateDirect(32));
                this.I.J0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.E && ((!((z14 = (obj = message.obj) instanceof r40)) || ((r40) obj).f39070c != -2) && (u40Var = this.I.f34034i1) != null)) {
                int i12 = message.arg1;
                if (z14) {
                    r40Var = (r40) obj;
                }
                u40Var.i(i12, r40Var);
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
                return;
            }
            return;
        }
        int i13 = message.arg1;
        int i14 = message.arg2;
        if ((i14 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i14 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f38077f) {
            if (!this.d.equals(this.f38074b.eglGetCurrentContext()) || !this.f38076e.equals(this.f38074b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f38074b;
                EGLDisplay eGLDisplay2 = this.f38075c;
                EGLSurface eGLSurface2 = this.f38076e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f38078n[0].updateTexImage();
            }
            if (z11) {
                this.f38078n[1].updateTexImage();
            }
            if (this.I.B0 && this.I.f34038k1 == this.I.A0 && ((this.I.f34038k1 == 0 && z10) || (this.I.f34038k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.E) {
                c50 c50Var6 = this.I;
                if (c50Var6.f34034i1 == null) {
                    c50Var6.f34034i1 = new u40(c50Var6);
                }
                c50 c50Var7 = this.I;
                if (c50Var7.f34034i1.G0) {
                    if (!c50Var7.K) {
                        this.I.K = true;
                        org.telegram.messenger.g0.g3(new Runnable(this) {
                            public final o40 f37772b;

                            {
                                this.f37772b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f37772b.I.f34046r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        c50 c50Var8 = this.f37772b.I;
                                        if (c50Var8.f34044q0 != null) {
                                            Bitmap bitmap = c50Var8.f34036j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                c50Var8.f34036j1 = null;
                                            }
                                            c50Var8.f34036j1 = c50Var8.f34044q0.getBitmap();
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
                c50 c50Var8 = this.I;
                u40 u40Var2 = c50Var8.f34034i1;
                org.telegram.messenger.oe oeVar = c50Var8.f34027f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (u40Var2.G0 && u40Var2.U != null && u40Var2.U.getLooper() != null && u40Var2.U.getLooper().getThread() != null && u40Var2.U.getLooper().getThread().isAlive()) {
                    u40Var2.f40255x = eglGetCurrentContext;
                    u40Var2.U.sendMessage(u40Var2.U.obtainMessage(0, 1, 0));
                }
                u40Var2.G0 = true;
                int i15 = org.telegram.messenger.np.u1(u40Var2.I0.f34023e).f26012y3;
                org.telegram.messenger.g0.g3(new me(9));
                u40Var2.f40224a = oeVar;
                u40Var2.d = i15;
                u40Var2.f40231e = i15;
                u40Var2.f40233f = org.telegram.messenger.np.u1(u40Var2.I0.f34023e).f26021z3 * 1024;
                u40Var2.f40255x = eglGetCurrentContext;
                synchronized (u40Var2.V) {
                    try {
                        if (!u40Var2.X) {
                            u40Var2.X = true;
                            Thread thread = new Thread(u40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!u40Var2.W) {
                                try {
                                    u40Var2.V.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            u40Var2.B0.clear();
                            u40Var2.D0 = 0;
                            org.telegram.messenger.r5 r5Var = u40Var2.C0;
                            if (r5Var != null) {
                                r5Var.cleanupQueue();
                                u40Var2.C0.recycle();
                            }
                            u40Var2.C0 = new org.telegram.messenger.r5("keyframes_thumb_queue", true);
                            u40Var2.U.sendMessage(u40Var2.U.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                if (obj4 instanceof CameraSession) {
                    i7 = ((CameraSession) obj4).getCurrentOrientation();
                } else if (obj4 instanceof Camera2Session) {
                    i7 = ((Camera2Session) obj4).getCurrentOrientation();
                } else {
                    i7 = 0;
                }
                if (i7 == 90 || i7 == 270) {
                    c50 c50Var9 = this.I;
                    float f22 = c50Var9.L0;
                    c50Var9.L0 = c50Var9.M0;
                    c50Var9.M0 = f22;
                }
                this.E = true;
                this.I.w();
            } else {
                z13 = false;
            }
            c50 c50Var10 = this.I;
            if (c50Var10.f34034i1 != null && ((c50Var10.f34038k1 == 0 && z10) || (this.I.f34038k1 == 1 && z11))) {
                c50 c50Var11 = this.I;
                u40 u40Var3 = c50Var11.f34034i1;
                SurfaceTexture surfaceTexture2 = this.f38078n[c50Var11.f34038k1];
                c50 c50Var12 = this.I;
                if (c50Var12.f34050u0) {
                    i13 = c50Var12.f34038k1;
                }
                u40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f38078n[this.I.f34038k1].getTransformMatrix(this.I.G0);
            GLES20.glUseProgram(this.f38079r);
            GLES20.glActiveTexture(33984);
            c50 c50Var13 = this.I;
            GLES20.glBindTexture(36197, c50Var13.f34017b0[c50Var13.f34038k1]);
            GLES20.glVertexAttribPointer(this.f38082x, 3, 5126, false, 12, (Buffer) this.I.I0);
            GLES20.glEnableVertexAttribArray(this.f38082x);
            GLES20.glVertexAttribPointer(this.f38083y, 2, 5126, false, 8, (Buffer) this.I.J0);
            GLES20.glEnableVertexAttribArray(this.f38083y);
            GLES20.glUniformMatrix4fv(this.f38081w, 1, false, this.I.G0, 0);
            GLES20.glUniformMatrix4fv(this.f38080s, 1, false, this.I.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f38082x);
            GLES20.glDisableVertexAttribArray(this.f38083y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f38074b.eglSwapBuffers(this.f38075c, this.f38076e);
            if (z12 && this.I.B0) {
                this.I.B0 = false;
                this.I.q("first target frame presented: surface=" + this.I.f34038k1);
            }
            if (z13) {
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final o40 f37772b;

                    {
                        this.f37772b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f37772b.I.f34046r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                c50 c50Var82 = this.f37772b.I;
                                if (c50Var82.f34044q0 != null) {
                                    Bitmap bitmap = c50Var82.f34036j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        c50Var82.f34036j1 = null;
                                    }
                                    c50Var82.f34036j1 = c50Var82.f34044q0.getBitmap();
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
        int i7;
        Handler handler = getHandler();
        if (handler != null) {
            int intValue = this.F.intValue();
            if (z11) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            sendMessage(handler.obtainMessage(0, intValue, (z10 ? 1 : 0) + i7), 0);
        }
    }

    @Override
    public final void run() {
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f38074b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f38075c = eglGetDisplay;
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
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f38074b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26730a) {
                org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f38074b.eglChooseConfig(this.f38075c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f38074b.eglCreateContext(this.f38075c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f38073a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f38074b.eglCreateWindowSurface(this.f38075c, eGLConfig, surfaceTexture, null);
                        this.f38076e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f38074b.eglMakeCurrent(this.f38075c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.s2.f26730a) {
                                    org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                c50 c50Var = this.I;
                                float f10 = c50Var.L0;
                                int[] iArr2 = c50Var.f34017b0;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / c50Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (c50Var.f34034i1 == null) {
                                    c50Var.f34034i1 = new u40(c50Var);
                                }
                                FloatBuffer i7 = org.telegram.messenger.o10.i(ByteBuffer.allocateDirect(48));
                                c50Var.I0 = i7;
                                i7.put(fArr).position(0);
                                FloatBuffer i10 = org.telegram.messenger.o10.i(ByteBuffer.allocateDirect(32));
                                c50Var.J0 = i10;
                                i10.put(fArr2).position(0);
                                Matrix.setIdentityM(c50Var.G0, 0);
                                int l10 = c50.l(c50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = c50.l(c50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f38079r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(this.f38079r, l11);
                                    GLES20.glLinkProgram(this.f38079r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f38079r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.s2.f26730a) {
                                            org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f38079r);
                                        this.f38079r = 0;
                                    } else {
                                        this.f38082x = GLES20.glGetAttribLocation(this.f38079r, "aPosition");
                                        this.f38083y = GLES20.glGetAttribLocation(this.f38079r, "aTextureCoord");
                                        this.f38080s = GLES20.glGetUniformLocation(this.f38079r, "uMVPMatrix");
                                        this.f38081w = GLES20.glGetUniformLocation(this.f38079r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(c50Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i11 = 0; i11 < 2; i11++) {
                                        GLES20.glBindTexture(36197, iArr2[i11]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i11]);
                                        SurfaceTexture[] surfaceTextureArr = this.f38078n;
                                        surfaceTextureArr[i11] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                o40 o40Var = o40.this;
                                                int i12 = i11;
                                                boolean z12 = true;
                                                o40Var.I.W = true;
                                                if (i12 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i12 != 1) {
                                                    z12 = false;
                                                }
                                                o40Var.requestRender(z11, z12);
                                            }
                                        });
                                        org.telegram.messenger.g0.g3(new org.telegram.ui.f0(c50Var, i11, surfaceTextureArr[i11], 14));
                                    }
                                    if (org.telegram.messenger.s2.f26730a) {
                                        org.telegram.messenger.a8.d("InstantCamera gl initied");
                                    }
                                    z10 = true;
                                } else {
                                    if (org.telegram.messenger.s2.f26730a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26730a) {
                                org.telegram.messenger.o10.v(this.f38074b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26730a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f38077f = z10;
        super.run();
    }
}
