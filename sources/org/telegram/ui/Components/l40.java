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
public final class l40 extends org.telegram.messenger.r5 {
    public boolean E;
    public Integer F;
    public int G;
    public int H;
    public final z40 I;
    public final SurfaceTexture f36999a;
    public EGL10 f37000b;
    public EGLDisplay f37001c;
    public EGLContext d;
    public EGLSurface f37002e;
    public boolean f37003f;
    public Object h;
    public final SurfaceTexture[] f37004n;
    public int f37005r;
    public int f37006s;
    public int f37007w;
    public int f37008x;
    public int f37009y;

    public l40(z40 z40Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.I = z40Var;
        this.f37004n = new SurfaceTexture[2];
        this.F = 0;
        this.f36999a = surfaceTexture;
        this.G = i7;
        this.H = i10;
    }

    public final void a(int i7, boolean z10, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new o40(i10, i11, j3, 0L, z10)), 0);
        }
    }

    public final void b() {
        z40 z40Var = this.I;
        if (z40Var.f42788n0[z40Var.f42785k1] != null) {
            z40 z40Var2 = this.I;
            int width = z40Var2.f42788n0[z40Var2.f42785k1].getWidth();
            z40 z40Var3 = this.I;
            int height = z40Var3.f42788n0[z40Var3.f42785k1].getHeight();
            float min = this.G / Math.min(width, height);
            int i7 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i7 == i10) {
                z40 z40Var4 = this.I;
                z40Var4.L0 = 1.0f;
                z40Var4.M0 = 1.0f;
            } else if (i7 > i10) {
                z40 z40Var5 = this.I;
                z40Var5.L0 = 1.0f;
                z40Var5.M0 = i7 / this.H;
            } else {
                z40 z40Var6 = this.I;
                z40Var6.L0 = i10 / this.G;
                z40Var6.M0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.I.L0 + " scaleY = " + this.I.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f37004n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.f37004n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f37004n[i7] = null;
                }
            }
        }
        this.I.W = false;
        if (this.f37002e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f37000b.eglGetCurrentContext()) || !this.f37002e.equals(this.f37000b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f37000b;
                EGLDisplay eGLDisplay = this.f37001c;
                EGLSurface eGLSurface = this.f37002e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.I.f42764b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.I.f42764b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.I.f42764b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.I.f42764b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f37002e != null) {
            EGL10 egl102 = this.f37000b;
            EGLDisplay eGLDisplay2 = this.f37001c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f37000b.eglDestroySurface(this.f37001c, this.f37002e);
            this.f37002e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f37000b.eglDestroyContext(this.f37001c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f37001c;
        if (eGLDisplay3 != null) {
            this.f37000b.eglTerminate(eGLDisplay3);
            this.f37001c = null;
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
        r40 r40Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            o40 o40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            z40 z40Var = this.I;
                            z40Var.f42785k1 = 1 - z40Var.f42785k1;
                            if (this.I.B0) {
                                this.I.q("GL surface flip applied: surface=" + this.I.f42785k1);
                            }
                            b();
                            z40 z40Var2 = this.I;
                            float f10 = (1.0f / z40Var2.L0) / 2.0f;
                            float f11 = (1.0f / z40Var2.M0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            z40Var2.J0 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
                            this.I.J0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.s2.f26723a) {
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
                EGL10 egl10 = this.f37000b;
                EGLDisplay eGLDisplay = this.f37001c;
                EGLSurface eGLSurface = this.f37002e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f37000b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f37004n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.I.H0);
                    this.f37004n[0].setOnFrameAvailableListener(null);
                    this.f37004n[0].release();
                    z40 z40Var3 = this.I;
                    int[] iArr = z40Var3.f42766c0;
                    int[] iArr2 = z40Var3.f42764b0;
                    iArr[0] = iArr2[0];
                    z40Var3.f42768d0 = 0.0f;
                    iArr2[0] = 0;
                    z40Var3.K0 = z40Var3.J0.duplicate();
                    z40 z40Var4 = this.I;
                    z40Var4.N0 = z40Var4.f42788n0[0];
                }
                this.F = Integer.valueOf(this.F.intValue() + 1);
                this.I.K = false;
                GLES20.glGenTextures(1, this.I.f42764b0, 0);
                GLES20.glBindTexture(36197, this.I.f42764b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f37004n[0] = new SurfaceTexture(this.I.f42764b0[0]);
                this.f37004n[0].setOnFrameAvailableListener(new bz(this, 1));
                if (this.I.B0) {
                    this.I.q("GL input recreated: surface=0");
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.b0(this.I, 0, this.f37004n[0], 15));
                b();
                z40 z40Var5 = this.I;
                float f16 = (1.0f / z40Var5.L0) / 2.0f;
                float f17 = (1.0f / z40Var5.M0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                z40Var5.J0 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
                this.I.J0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.E && ((!((z14 = (obj = message.obj) instanceof o40)) || ((o40) obj).f37956c != -2) && (r40Var = this.I.f42781i1) != null)) {
                int i12 = message.arg1;
                if (z14) {
                    o40Var = (o40) obj;
                }
                r40Var.i(i12, o40Var);
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
        if (this.f37003f) {
            if (!this.d.equals(this.f37000b.eglGetCurrentContext()) || !this.f37002e.equals(this.f37000b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f37000b;
                EGLDisplay eGLDisplay2 = this.f37001c;
                EGLSurface eGLSurface2 = this.f37002e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f37004n[0].updateTexImage();
            }
            if (z11) {
                this.f37004n[1].updateTexImage();
            }
            if (this.I.B0 && this.I.f42785k1 == this.I.A0 && ((this.I.f42785k1 == 0 && z10) || (this.I.f42785k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.E) {
                z40 z40Var6 = this.I;
                if (z40Var6.f42781i1 == null) {
                    z40Var6.f42781i1 = new r40(z40Var6);
                }
                z40 z40Var7 = this.I;
                if (z40Var7.f42781i1.G0) {
                    if (!z40Var7.K) {
                        this.I.K = true;
                        org.telegram.messenger.g0.g3(new Runnable(this) {
                            public final l40 f36676b;

                            {
                                this.f36676b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f36676b.I.f42793r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        z40 z40Var8 = this.f36676b.I;
                                        if (z40Var8.f42791q0 != null) {
                                            Bitmap bitmap = z40Var8.f42783j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                z40Var8.f42783j1 = null;
                                            }
                                            z40Var8.f42783j1 = z40Var8.f42791q0.getBitmap();
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
                z40 z40Var8 = this.I;
                r40 r40Var2 = z40Var8.f42781i1;
                org.telegram.messenger.ne neVar = z40Var8.f42774f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (r40Var2.G0 && r40Var2.U != null && r40Var2.U.getLooper() != null && r40Var2.U.getLooper().getThread() != null && r40Var2.U.getLooper().getThread().isAlive()) {
                    r40Var2.f39033x = eglGetCurrentContext;
                    r40Var2.U.sendMessage(r40Var2.U.obtainMessage(0, 1, 0));
                }
                r40Var2.G0 = true;
                int i15 = org.telegram.messenger.mp.u1(r40Var2.I0.f42770e).f25815y3;
                org.telegram.messenger.g0.g3(new me(9));
                r40Var2.f39002a = neVar;
                r40Var2.d = i15;
                r40Var2.f39009e = i15;
                r40Var2.f39011f = org.telegram.messenger.mp.u1(r40Var2.I0.f42770e).f25824z3 * 1024;
                r40Var2.f39033x = eglGetCurrentContext;
                synchronized (r40Var2.V) {
                    try {
                        if (!r40Var2.X) {
                            r40Var2.X = true;
                            Thread thread = new Thread(r40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!r40Var2.W) {
                                try {
                                    r40Var2.V.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            r40Var2.B0.clear();
                            r40Var2.D0 = 0;
                            org.telegram.messenger.r5 r5Var = r40Var2.C0;
                            if (r5Var != null) {
                                r5Var.cleanupQueue();
                                r40Var2.C0.recycle();
                            }
                            r40Var2.C0 = new org.telegram.messenger.r5("keyframes_thumb_queue", true);
                            r40Var2.U.sendMessage(r40Var2.U.obtainMessage(0));
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
                    z40 z40Var9 = this.I;
                    float f22 = z40Var9.L0;
                    z40Var9.L0 = z40Var9.M0;
                    z40Var9.M0 = f22;
                }
                this.E = true;
                this.I.w();
            } else {
                z13 = false;
            }
            z40 z40Var10 = this.I;
            if (z40Var10.f42781i1 != null && ((z40Var10.f42785k1 == 0 && z10) || (this.I.f42785k1 == 1 && z11))) {
                z40 z40Var11 = this.I;
                r40 r40Var3 = z40Var11.f42781i1;
                SurfaceTexture surfaceTexture2 = this.f37004n[z40Var11.f42785k1];
                z40 z40Var12 = this.I;
                if (z40Var12.f42797u0) {
                    i13 = z40Var12.f42785k1;
                }
                r40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f37004n[this.I.f42785k1].getTransformMatrix(this.I.G0);
            GLES20.glUseProgram(this.f37005r);
            GLES20.glActiveTexture(33984);
            z40 z40Var13 = this.I;
            GLES20.glBindTexture(36197, z40Var13.f42764b0[z40Var13.f42785k1]);
            GLES20.glVertexAttribPointer(this.f37008x, 3, 5126, false, 12, (Buffer) this.I.I0);
            GLES20.glEnableVertexAttribArray(this.f37008x);
            GLES20.glVertexAttribPointer(this.f37009y, 2, 5126, false, 8, (Buffer) this.I.J0);
            GLES20.glEnableVertexAttribArray(this.f37009y);
            GLES20.glUniformMatrix4fv(this.f37007w, 1, false, this.I.G0, 0);
            GLES20.glUniformMatrix4fv(this.f37006s, 1, false, this.I.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f37008x);
            GLES20.glDisableVertexAttribArray(this.f37009y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f37000b.eglSwapBuffers(this.f37001c, this.f37002e);
            if (z12 && this.I.B0) {
                this.I.B0 = false;
                this.I.q("first target frame presented: surface=" + this.I.f42785k1);
            }
            if (z13) {
                org.telegram.messenger.g0.g3(new Runnable(this) {
                    public final l40 f36676b;

                    {
                        this.f36676b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f36676b.I.f42793r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                z40 z40Var82 = this.f36676b.I;
                                if (z40Var82.f42791q0 != null) {
                                    Bitmap bitmap = z40Var82.f42783j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        z40Var82.f42783j1 = null;
                                    }
                                    z40Var82.f42783j1 = z40Var82.f42791q0.getBitmap();
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f37000b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f37001c = eglGetDisplay;
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
            if (org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f37000b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.s2.f26723a) {
                org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f37000b.eglChooseConfig(this.f37001c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f37000b.eglCreateContext(this.f37001c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.f26723a) {
                        org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f36999a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f37000b.eglCreateWindowSurface(this.f37001c, eGLConfig, surfaceTexture, null);
                        this.f37002e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f37000b.eglMakeCurrent(this.f37001c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.s2.f26723a) {
                                    org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                z40 z40Var = this.I;
                                float f10 = z40Var.L0;
                                int[] iArr2 = z40Var.f42764b0;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / z40Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (z40Var.f42781i1 == null) {
                                    z40Var.f42781i1 = new r40(z40Var);
                                }
                                FloatBuffer i7 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(48));
                                z40Var.I0 = i7;
                                i7.put(fArr).position(0);
                                FloatBuffer i10 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
                                z40Var.J0 = i10;
                                i10.put(fArr2).position(0);
                                Matrix.setIdentityM(z40Var.G0, 0);
                                int l10 = z40.l(z40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = z40.l(z40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f37005r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(this.f37005r, l11);
                                    GLES20.glLinkProgram(this.f37005r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f37005r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.s2.f26723a) {
                                            org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f37005r);
                                        this.f37005r = 0;
                                    } else {
                                        this.f37008x = GLES20.glGetAttribLocation(this.f37005r, "aPosition");
                                        this.f37009y = GLES20.glGetAttribLocation(this.f37005r, "aTextureCoord");
                                        this.f37006s = GLES20.glGetUniformLocation(this.f37005r, "uMVPMatrix");
                                        this.f37007w = GLES20.glGetUniformLocation(this.f37005r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(z40Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i11 = 0; i11 < 2; i11++) {
                                        GLES20.glBindTexture(36197, iArr2[i11]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i11]);
                                        SurfaceTexture[] surfaceTextureArr = this.f37004n;
                                        surfaceTextureArr[i11] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                l40 l40Var = l40.this;
                                                int i12 = i11;
                                                boolean z12 = true;
                                                l40Var.I.W = true;
                                                if (i12 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i12 != 1) {
                                                    z12 = false;
                                                }
                                                l40Var.requestRender(z11, z12);
                                            }
                                        });
                                        org.telegram.messenger.g0.g3(new org.telegram.ui.b0(z40Var, i11, surfaceTextureArr[i11], 15));
                                    }
                                    if (org.telegram.messenger.s2.f26723a) {
                                        org.telegram.messenger.a8.d("InstantCamera gl initied");
                                    }
                                    z10 = true;
                                } else {
                                    if (org.telegram.messenger.s2.f26723a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.s2.f26723a) {
                                org.telegram.messenger.n10.v(this.f37000b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.f26723a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f37003f = z10;
        super.run();
    }
}
