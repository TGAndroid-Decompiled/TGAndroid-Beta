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
public final class d40 extends org.telegram.messenger.q5 {
    public boolean E;
    public Integer F;
    public int G;
    public int H;
    public final r40 I;
    public final SurfaceTexture f33830a;
    public EGL10 f33831b;
    public EGLDisplay f33832c;
    public EGLContext d;
    public EGLSurface f33833e;
    public boolean f33834f;
    public Object h;
    public final SurfaceTexture[] f33835n;
    public int f33836r;
    public int f33837s;
    public int f33838w;
    public int f33839x;
    public int f33840y;

    public d40(r40 r40Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.I = r40Var;
        this.f33835n = new SurfaceTexture[2];
        this.F = 0;
        this.f33830a = surfaceTexture;
        this.G = i7;
        this.H = i10;
    }

    public final void a(int i7, boolean z10, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new g40(i10, i11, j3, 0L, z10)), 0);
        }
    }

    public final void b() {
        r40 r40Var = this.I;
        if (r40Var.f38864n0[r40Var.f38861k1] != null) {
            r40 r40Var2 = this.I;
            int width = r40Var2.f38864n0[r40Var2.f38861k1].getWidth();
            r40 r40Var3 = this.I;
            int height = r40Var3.f38864n0[r40Var3.f38861k1].getHeight();
            float min = this.G / Math.min(width, height);
            int i7 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i7 == i10) {
                r40 r40Var4 = this.I;
                r40Var4.L0 = 1.0f;
                r40Var4.M0 = 1.0f;
            } else if (i7 > i10) {
                r40 r40Var5 = this.I;
                r40Var5.L0 = 1.0f;
                r40Var5.M0 = i7 / this.H;
            } else {
                r40 r40Var6 = this.I;
                r40Var6.L0 = i10 / this.G;
                r40Var6.M0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.I.L0 + " scaleY = " + this.I.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f33835n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.f33835n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f33835n[i7] = null;
                }
            }
        }
        this.I.W = false;
        if (this.f33833e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f33831b.eglGetCurrentContext()) || !this.f33833e.equals(this.f33831b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f33831b;
                EGLDisplay eGLDisplay = this.f33832c;
                EGLSurface eGLSurface = this.f33833e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.I.f38840b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.I.f38840b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.I.f38840b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.I.f38840b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f33833e != null) {
            EGL10 egl102 = this.f33831b;
            EGLDisplay eGLDisplay2 = this.f33832c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f33831b.eglDestroySurface(this.f33832c, this.f33833e);
            this.f33833e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f33831b.eglDestroyContext(this.f33832c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f33832c;
        if (eGLDisplay3 != null) {
            this.f33831b.eglTerminate(eGLDisplay3);
            this.f33832c = null;
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
        j40 j40Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            g40 g40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            r40 r40Var = this.I;
                            r40Var.f38861k1 = 1 - r40Var.f38861k1;
                            if (this.I.B0) {
                                this.I.q("GL surface flip applied: surface=" + this.I.f38861k1);
                            }
                            b();
                            r40 r40Var2 = this.I;
                            float f10 = (1.0f / r40Var2.L0) / 2.0f;
                            float f11 = (1.0f / r40Var2.M0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            r40Var2.J0 = org.telegram.messenger.i20.h(ByteBuffer.allocateDirect(32));
                            this.I.J0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.r2.f26198a) {
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
                EGL10 egl10 = this.f33831b;
                EGLDisplay eGLDisplay = this.f33832c;
                EGLSurface eGLSurface = this.f33833e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f33831b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f33835n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.I.H0);
                    this.f33835n[0].setOnFrameAvailableListener(null);
                    this.f33835n[0].release();
                    r40 r40Var3 = this.I;
                    int[] iArr = r40Var3.f38842c0;
                    int[] iArr2 = r40Var3.f38840b0;
                    iArr[0] = iArr2[0];
                    r40Var3.f38844d0 = 0.0f;
                    iArr2[0] = 0;
                    r40Var3.K0 = r40Var3.J0.duplicate();
                    r40 r40Var4 = this.I;
                    r40Var4.N0 = r40Var4.f38864n0[0];
                }
                this.F = Integer.valueOf(this.F.intValue() + 1);
                this.I.K = false;
                GLES20.glGenTextures(1, this.I.f38840b0, 0);
                GLES20.glBindTexture(36197, this.I.f38840b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f33835n[0] = new SurfaceTexture(this.I.f38840b0[0]);
                this.f33835n[0].setOnFrameAvailableListener(new vy(this, 1));
                if (this.I.B0) {
                    this.I.q("GL input recreated: surface=0");
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this.I, 0, this.f33835n[0], 14));
                b();
                r40 r40Var5 = this.I;
                float f16 = (1.0f / r40Var5.L0) / 2.0f;
                float f17 = (1.0f / r40Var5.M0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                r40Var5.J0 = org.telegram.messenger.i20.h(ByteBuffer.allocateDirect(32));
                this.I.J0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.E && ((!((z14 = (obj = message.obj) instanceof g40)) || ((g40) obj).f34793c != -2) && (j40Var = this.I.f38857i1) != null)) {
                int i12 = message.arg1;
                if (z14) {
                    g40Var = (g40) obj;
                }
                j40Var.i(i12, g40Var);
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
        if (this.f33834f) {
            if (!this.d.equals(this.f33831b.eglGetCurrentContext()) || !this.f33833e.equals(this.f33831b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f33831b;
                EGLDisplay eGLDisplay2 = this.f33832c;
                EGLSurface eGLSurface2 = this.f33833e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f33835n[0].updateTexImage();
            }
            if (z11) {
                this.f33835n[1].updateTexImage();
            }
            if (this.I.B0 && this.I.f38861k1 == this.I.A0 && ((this.I.f38861k1 == 0 && z10) || (this.I.f38861k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.E) {
                r40 r40Var6 = this.I;
                if (r40Var6.f38857i1 == null) {
                    r40Var6.f38857i1 = new j40(r40Var6);
                }
                r40 r40Var7 = this.I;
                if (r40Var7.f38857i1.G0) {
                    if (!r40Var7.K) {
                        this.I.K = true;
                        org.telegram.messenger.g0.h3(new Runnable(this) {
                            public final d40 f33499b;

                            {
                                this.f33499b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f33499b.I.f38869r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        r40 r40Var8 = this.f33499b.I;
                                        if (r40Var8.f38867q0 != null) {
                                            Bitmap bitmap = r40Var8.f38859j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                r40Var8.f38859j1 = null;
                                            }
                                            r40Var8.f38859j1 = r40Var8.f38867q0.getBitmap();
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
                r40 r40Var8 = this.I;
                j40 j40Var2 = r40Var8.f38857i1;
                org.telegram.messenger.oe oeVar = r40Var8.f38850f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (j40Var2.G0 && j40Var2.U != null && j40Var2.U.getLooper() != null && j40Var2.U.getLooper().getThread() != null && j40Var2.U.getLooper().getThread().isAlive()) {
                    j40Var2.f35883x = eglGetCurrentContext;
                    j40Var2.U.sendMessage(j40Var2.U.obtainMessage(0, 1, 0));
                }
                j40Var2.G0 = true;
                int i15 = org.telegram.messenger.np.s1(j40Var2.I0.f38846e).f25424w3;
                org.telegram.messenger.g0.h3(new ih(7));
                j40Var2.f35852a = oeVar;
                j40Var2.d = i15;
                j40Var2.f35859e = i15;
                j40Var2.f35861f = org.telegram.messenger.np.s1(j40Var2.I0.f38846e).f25434x3 * 1024;
                j40Var2.f35883x = eglGetCurrentContext;
                synchronized (j40Var2.V) {
                    try {
                        if (!j40Var2.X) {
                            j40Var2.X = true;
                            Thread thread = new Thread(j40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!j40Var2.W) {
                                try {
                                    j40Var2.V.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            j40Var2.B0.clear();
                            j40Var2.D0 = 0;
                            org.telegram.messenger.q5 q5Var = j40Var2.C0;
                            if (q5Var != null) {
                                q5Var.cleanupQueue();
                                j40Var2.C0.recycle();
                            }
                            j40Var2.C0 = new org.telegram.messenger.q5("keyframes_thumb_queue", true);
                            j40Var2.U.sendMessage(j40Var2.U.obtainMessage(0));
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
                    r40 r40Var9 = this.I;
                    float f22 = r40Var9.L0;
                    r40Var9.L0 = r40Var9.M0;
                    r40Var9.M0 = f22;
                }
                this.E = true;
                this.I.w();
            } else {
                z13 = false;
            }
            r40 r40Var10 = this.I;
            if (r40Var10.f38857i1 != null && ((r40Var10.f38861k1 == 0 && z10) || (this.I.f38861k1 == 1 && z11))) {
                r40 r40Var11 = this.I;
                j40 j40Var3 = r40Var11.f38857i1;
                SurfaceTexture surfaceTexture2 = this.f33835n[r40Var11.f38861k1];
                r40 r40Var12 = this.I;
                if (r40Var12.f38873u0) {
                    i13 = r40Var12.f38861k1;
                }
                j40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f33835n[this.I.f38861k1].getTransformMatrix(this.I.G0);
            GLES20.glUseProgram(this.f33836r);
            GLES20.glActiveTexture(33984);
            r40 r40Var13 = this.I;
            GLES20.glBindTexture(36197, r40Var13.f38840b0[r40Var13.f38861k1]);
            GLES20.glVertexAttribPointer(this.f33839x, 3, 5126, false, 12, (Buffer) this.I.I0);
            GLES20.glEnableVertexAttribArray(this.f33839x);
            GLES20.glVertexAttribPointer(this.f33840y, 2, 5126, false, 8, (Buffer) this.I.J0);
            GLES20.glEnableVertexAttribArray(this.f33840y);
            GLES20.glUniformMatrix4fv(this.f33838w, 1, false, this.I.G0, 0);
            GLES20.glUniformMatrix4fv(this.f33837s, 1, false, this.I.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f33839x);
            GLES20.glDisableVertexAttribArray(this.f33840y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f33831b.eglSwapBuffers(this.f33832c, this.f33833e);
            if (z12 && this.I.B0) {
                this.I.B0 = false;
                this.I.q("first target frame presented: surface=" + this.I.f38861k1);
            }
            if (z13) {
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final d40 f33499b;

                    {
                        this.f33499b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f33499b.I.f38869r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                r40 r40Var82 = this.f33499b.I;
                                if (r40Var82.f38867q0 != null) {
                                    Bitmap bitmap = r40Var82.f38859j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        r40Var82.f38859j1 = null;
                                    }
                                    r40Var82.f38859j1 = r40Var82.f38867q0.getBitmap();
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
        if (org.telegram.messenger.r2.f26198a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f33831b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f33832c = eglGetDisplay;
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
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f33831b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f33831b.eglChooseConfig(this.f33832c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f33831b.eglCreateContext(this.f33832c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f33830a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f33831b.eglCreateWindowSurface(this.f33832c, eGLConfig, surfaceTexture, null);
                        this.f33833e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f33831b.eglMakeCurrent(this.f33832c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f26198a) {
                                    org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                r40 r40Var = this.I;
                                float f10 = r40Var.L0;
                                int[] iArr2 = r40Var.f38840b0;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / r40Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (r40Var.f38857i1 == null) {
                                    r40Var.f38857i1 = new j40(r40Var);
                                }
                                FloatBuffer h = org.telegram.messenger.i20.h(ByteBuffer.allocateDirect(48));
                                r40Var.I0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h7 = org.telegram.messenger.i20.h(ByteBuffer.allocateDirect(32));
                                r40Var.J0 = h7;
                                h7.put(fArr2).position(0);
                                Matrix.setIdentityM(r40Var.G0, 0);
                                int l10 = r40.l(r40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = r40.l(r40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f33836r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(this.f33836r, l11);
                                    GLES20.glLinkProgram(this.f33836r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f33836r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.r2.f26198a) {
                                            org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f33836r);
                                        this.f33836r = 0;
                                    } else {
                                        this.f33839x = GLES20.glGetAttribLocation(this.f33836r, "aPosition");
                                        this.f33840y = GLES20.glGetAttribLocation(this.f33836r, "aTextureCoord");
                                        this.f33837s = GLES20.glGetUniformLocation(this.f33836r, "uMVPMatrix");
                                        this.f33838w = GLES20.glGetUniformLocation(this.f33836r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(r40Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i7 = 0; i7 < 2; i7++) {
                                        GLES20.glBindTexture(36197, iArr2[i7]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i7]);
                                        SurfaceTexture[] surfaceTextureArr = this.f33835n;
                                        surfaceTextureArr[i7] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                d40 d40Var = d40.this;
                                                int i10 = i7;
                                                boolean z12 = true;
                                                d40Var.I.W = true;
                                                if (i10 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i10 != 1) {
                                                    z12 = false;
                                                }
                                                d40Var.requestRender(z11, z12);
                                            }
                                        });
                                        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(r40Var, i7, surfaceTextureArr[i7], 14));
                                    }
                                    if (org.telegram.messenger.r2.f26198a) {
                                        org.telegram.messenger.a8.d("InstantCamera gl initied");
                                    }
                                    z10 = true;
                                } else {
                                    if (org.telegram.messenger.r2.f26198a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f26198a) {
                                org.telegram.messenger.i20.u(this.f33831b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f33834f = z10;
        super.run();
    }
}
