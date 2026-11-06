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
public final class a40 extends org.telegram.messenger.q5 {
    public boolean D;
    public Integer E;
    public int F;
    public int G;
    public final o40 H;
    public final SurfaceTexture f31663a;
    public EGL10 f31664b;
    public EGLDisplay f31665c;
    public EGLContext d;
    public EGLSurface f31666e;
    public boolean f31667f;
    public Object h;
    public final SurfaceTexture[] f31668n;
    public int f31669r;
    public int f31670s;
    public int f31671w;
    public int f31672x;
    public int f31673y;

    public a40(o40 o40Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.H = o40Var;
        this.f31668n = new SurfaceTexture[2];
        this.E = 0;
        this.f31663a = surfaceTexture;
        this.F = i7;
        this.G = i10;
    }

    public final void a(int i7, boolean z9, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new d40(i10, i11, j3, 0L, z9)), 0);
        }
    }

    public final void b() {
        o40 o40Var = this.H;
        if (o40Var.m0[o40Var.f36609j1] != null) {
            o40 o40Var2 = this.H;
            int width = o40Var2.m0[o40Var2.f36609j1].getWidth();
            o40 o40Var3 = this.H;
            int height = o40Var3.m0[o40Var3.f36609j1].getHeight();
            float min = this.F / Math.min(width, height);
            int i7 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i7 == i10) {
                o40 o40Var4 = this.H;
                o40Var4.K0 = 1.0f;
                o40Var4.L0 = 1.0f;
            } else if (i7 > i10) {
                o40 o40Var5 = this.H;
                o40Var5.K0 = 1.0f;
                o40Var5.L0 = i7 / this.G;
            } else {
                o40 o40Var6 = this.H;
                o40Var6.K0 = i10 / this.F;
                o40Var6.L0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.H.K0 + " scaleY = " + this.H.L0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f31668n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.f31668n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f31668n[i7] = null;
                }
            }
        }
        this.H.V = false;
        if (this.f31666e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f31664b.eglGetCurrentContext()) || !this.f31666e.equals(this.f31664b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f31664b;
                EGLDisplay eGLDisplay = this.f31665c;
                EGLSurface eGLSurface = this.f31666e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f36588a0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f36588a0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f36588a0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f36588a0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f31666e != null) {
            EGL10 egl102 = this.f31664b;
            EGLDisplay eGLDisplay2 = this.f31665c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f31664b.eglDestroySurface(this.f31665c, this.f31666e);
            this.f31666e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f31664b.eglDestroyContext(this.f31665c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f31665c;
        if (eGLDisplay3 != null) {
            this.f31664b.eglTerminate(eGLDisplay3);
            this.f31665c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        Object obj;
        boolean z13;
        g40 g40Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            d40 d40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            o40 o40Var = this.H;
                            o40Var.f36609j1 = 1 - o40Var.f36609j1;
                            if (this.H.A0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f36609j1);
                            }
                            b();
                            o40 o40Var2 = this.H;
                            float f10 = (1.0f / o40Var2.K0) / 2.0f;
                            float f11 = (1.0f / o40Var2.L0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            o40Var2.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                            this.H.I0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.a8.b("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 == obj2) {
                        if (obj3 instanceof CameraSession) {
                            i10 = ((CameraSession) obj3).getWorldAngle();
                        } else if (obj3 instanceof Camera2Session) {
                            i10 = ((Camera2Session) obj3).getWorldAngle();
                        } else {
                            i10 = 0;
                        }
                        Matrix.setIdentityM(this.H.E0, 0);
                        if (i10 != 0) {
                            Matrix.rotateM(this.H.E0, 0, i10, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f31664b;
                EGLDisplay eGLDisplay = this.f31665c;
                EGLSurface eGLSurface = this.f31666e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f31664b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f31668n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.G0);
                    this.f31668n[0].setOnFrameAvailableListener(null);
                    this.f31668n[0].release();
                    o40 o40Var3 = this.H;
                    int[] iArr = o40Var3.f36590b0;
                    int[] iArr2 = o40Var3.f36588a0;
                    iArr[0] = iArr2[0];
                    o40Var3.f36592c0 = 0.0f;
                    iArr2[0] = 0;
                    o40Var3.J0 = o40Var3.I0.duplicate();
                    o40 o40Var4 = this.H;
                    o40Var4.M0 = o40Var4.m0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.J = false;
                GLES20.glGenTextures(1, this.H.f36588a0, 0);
                GLES20.glBindTexture(36197, this.H.f36588a0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f31668n[0] = new SurfaceTexture(this.H.f36588a0[0]);
                this.f31668n[0].setOnFrameAvailableListener(new qy(this, 1));
                if (this.H.A0) {
                    this.H.p("GL input recreated: surface=0");
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.q8(this.H, 0, this.f31668n[0], 11));
                b();
                o40 o40Var5 = this.H;
                float f16 = (1.0f / o40Var5.K0) / 2.0f;
                float f17 = (1.0f / o40Var5.L0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                o40Var5.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.H.I0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.D && ((!((z13 = (obj = message.obj) instanceof d40)) || ((d40) obj).f32761c != -2) && (g40Var = this.H.f36605h1) != null)) {
                int i12 = message.arg1;
                if (z13) {
                    d40Var = (d40) obj;
                }
                g40Var.i(i12, d40Var);
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
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i14 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f31667f) {
            if (!this.d.equals(this.f31664b.eglGetCurrentContext()) || !this.f31666e.equals(this.f31664b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f31664b;
                EGLDisplay eGLDisplay2 = this.f31665c;
                EGLSurface eGLSurface2 = this.f31666e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z9) {
                this.f31668n[0].updateTexImage();
            }
            if (z10) {
                this.f31668n[1].updateTexImage();
            }
            if (this.H.A0 && this.H.f36609j1 == this.H.f36631z0 && ((this.H.f36609j1 == 0 && z9) || (this.H.f36609j1 == 1 && z10))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.D) {
                o40 o40Var6 = this.H;
                if (o40Var6.f36605h1 == null) {
                    o40Var6.f36605h1 = new g40(o40Var6);
                }
                o40 o40Var7 = this.H;
                if (o40Var7.f36605h1.F0) {
                    if (!o40Var7.J) {
                        this.H.J = true;
                        org.telegram.messenger.g0.h3(new Runnable(this) {
                            public final a40 f40828b;

                            {
                                this.f40828b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f40828b.H.f36617q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        o40 o40Var8 = this.f40828b.H;
                                        if (o40Var8.f36616p0 != null) {
                                            Bitmap bitmap = o40Var8.f36607i1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                o40Var8.f36607i1 = null;
                                            }
                                            o40Var8.f36607i1 = o40Var8.f36616p0.getBitmap();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    z12 = false;
                } else {
                    z12 = true;
                }
                o40 o40Var8 = this.H;
                g40 g40Var2 = o40Var8.f36605h1;
                org.telegram.messenger.pe peVar = o40Var8.f36597e0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (g40Var2.F0 && g40Var2.T != null && g40Var2.T.getLooper() != null && g40Var2.T.getLooper().getThread() != null && g40Var2.T.getLooper().getThread().isAlive()) {
                    g40Var2.f33848x = eglGetCurrentContext;
                    g40Var2.T.sendMessage(g40Var2.T.obtainMessage(0, 1, 0));
                }
                g40Var2.F0 = true;
                int i15 = org.telegram.messenger.qp.s1(g40Var2.H0.f36596e).f24903v3;
                org.telegram.messenger.g0.h3(new l10(1));
                g40Var2.f33817a = peVar;
                g40Var2.d = i15;
                g40Var2.f33824e = i15;
                g40Var2.f33826f = org.telegram.messenger.qp.s1(g40Var2.H0.f36596e).f24913w3 * 1024;
                g40Var2.f33848x = eglGetCurrentContext;
                synchronized (g40Var2.U) {
                    try {
                        if (!g40Var2.W) {
                            g40Var2.W = true;
                            Thread thread = new Thread(g40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!g40Var2.V) {
                                try {
                                    g40Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            g40Var2.A0.clear();
                            g40Var2.C0 = 0;
                            org.telegram.messenger.q5 q5Var = g40Var2.B0;
                            if (q5Var != null) {
                                q5Var.cleanupQueue();
                                g40Var2.B0.recycle();
                            }
                            g40Var2.B0 = new org.telegram.messenger.q5("keyframes_thumb_queue", true);
                            g40Var2.T.sendMessage(g40Var2.T.obtainMessage(0));
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
                    o40 o40Var9 = this.H;
                    float f22 = o40Var9.K0;
                    o40Var9.K0 = o40Var9.L0;
                    o40Var9.L0 = f22;
                }
                this.D = true;
                this.H.v();
            } else {
                z12 = false;
            }
            o40 o40Var10 = this.H;
            if (o40Var10.f36605h1 != null && ((o40Var10.f36609j1 == 0 && z9) || (this.H.f36609j1 == 1 && z10))) {
                o40 o40Var11 = this.H;
                g40 g40Var3 = o40Var11.f36605h1;
                SurfaceTexture surfaceTexture2 = this.f31668n[o40Var11.f36609j1];
                o40 o40Var12 = this.H;
                if (o40Var12.f36622t0) {
                    i13 = o40Var12.f36609j1;
                }
                g40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f31668n[this.H.f36609j1].getTransformMatrix(this.H.F0);
            GLES20.glUseProgram(this.f31669r);
            GLES20.glActiveTexture(33984);
            o40 o40Var13 = this.H;
            GLES20.glBindTexture(36197, o40Var13.f36588a0[o40Var13.f36609j1]);
            GLES20.glVertexAttribPointer(this.f31672x, 3, 5126, false, 12, (Buffer) this.H.H0);
            GLES20.glEnableVertexAttribArray(this.f31672x);
            GLES20.glVertexAttribPointer(this.f31673y, 2, 5126, false, 8, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f31673y);
            GLES20.glUniformMatrix4fv(this.f31671w, 1, false, this.H.F0, 0);
            GLES20.glUniformMatrix4fv(this.f31670s, 1, false, this.H.E0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f31672x);
            GLES20.glDisableVertexAttribArray(this.f31673y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f31664b.eglSwapBuffers(this.f31665c, this.f31666e);
            if (z11 && this.H.A0) {
                this.H.A0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f36609j1);
            }
            if (z12) {
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final a40 f40828b;

                    {
                        this.f40828b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f40828b.H.f36617q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                o40 o40Var82 = this.f40828b.H;
                                if (o40Var82.f36616p0 != null) {
                                    Bitmap bitmap = o40Var82.f36607i1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        o40Var82.f36607i1 = null;
                                    }
                                    o40Var82.f36607i1 = o40Var82.f36616p0.getBitmap();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z9, boolean z10) {
        int i7;
        Handler handler = getHandler();
        if (handler != null) {
            int intValue = this.E.intValue();
            if (z10) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            sendMessage(handler.obtainMessage(0, intValue, (z9 ? 1 : 0) + i7), 0);
        }
    }

    @Override
    public final void run() {
        if (org.telegram.messenger.r2.f25191a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f31664b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f31665c = eglGetDisplay;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f31664b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25191a) {
                org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f31664b.eglChooseConfig(this.f31665c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f31664b.eglCreateContext(this.f31665c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25191a) {
                        org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f31663a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f31664b.eglCreateWindowSurface(this.f31665c, eGLConfig, surfaceTexture, null);
                        this.f31666e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f31664b.eglMakeCurrent(this.f31665c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f25191a) {
                                    org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                o40 o40Var = this.H;
                                float f10 = o40Var.K0;
                                int[] iArr2 = o40Var.f36588a0;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / o40Var.L0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (o40Var.f36605h1 == null) {
                                    o40Var.f36605h1 = new g40(o40Var);
                                }
                                FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(48));
                                o40Var.H0 = g10;
                                g10.put(fArr).position(0);
                                FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                                o40Var.I0 = g11;
                                g11.put(fArr2).position(0);
                                Matrix.setIdentityM(o40Var.F0, 0);
                                int k10 = o40.k(o40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int k11 = o40.k(o40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (k10 != 0 && k11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f31669r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, k10);
                                    GLES20.glAttachShader(this.f31669r, k11);
                                    GLES20.glLinkProgram(this.f31669r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f31669r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.r2.f25191a) {
                                            org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f31669r);
                                        this.f31669r = 0;
                                    } else {
                                        this.f31672x = GLES20.glGetAttribLocation(this.f31669r, "aPosition");
                                        this.f31673y = GLES20.glGetAttribLocation(this.f31669r, "aTextureCoord");
                                        this.f31670s = GLES20.glGetUniformLocation(this.f31669r, "uMVPMatrix");
                                        this.f31671w = GLES20.glGetUniformLocation(this.f31669r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(o40Var.E0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i7 = 0; i7 < 2; i7++) {
                                        GLES20.glBindTexture(36197, iArr2[i7]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i7]);
                                        SurfaceTexture[] surfaceTextureArr = this.f31668n;
                                        surfaceTextureArr[i7] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z10;
                                                a40 a40Var = a40.this;
                                                int i10 = i7;
                                                boolean z11 = true;
                                                a40Var.H.V = true;
                                                if (i10 == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (i10 != 1) {
                                                    z11 = false;
                                                }
                                                a40Var.requestRender(z10, z11);
                                            }
                                        });
                                        org.telegram.messenger.g0.h3(new org.telegram.ui.q8(o40Var, i7, surfaceTextureArr[i7], 11));
                                    }
                                    if (org.telegram.messenger.r2.f25191a) {
                                        org.telegram.messenger.a8.d("InstantCamera gl initied");
                                    }
                                    z9 = true;
                                } else {
                                    if (org.telegram.messenger.r2.f25191a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25191a) {
                                org.telegram.messenger.camera.q.t(this.f31664b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25191a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f31667f = z9;
        super.run();
    }
}
