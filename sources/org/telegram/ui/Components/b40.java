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
public final class b40 extends org.telegram.messenger.q5 {
    public boolean D;
    public Integer E;
    public int F;
    public int G;
    public final p40 H;
    public final SurfaceTexture f32087a;
    public EGL10 f32088b;
    public EGLDisplay f32089c;
    public EGLContext d;
    public EGLSurface f32090e;
    public boolean f32091f;
    public Object h;
    public final SurfaceTexture[] f32092n;
    public int f32093r;
    public int f32094s;
    public int f32095w;
    public int f32096x;
    public int f32097y;

    public b40(p40 p40Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.H = p40Var;
        this.f32092n = new SurfaceTexture[2];
        this.E = 0;
        this.f32087a = surfaceTexture;
        this.F = i7;
        this.G = i10;
    }

    public final void a(int i7, boolean z9, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new e40(i10, i11, j3, 0L, z9)), 0);
        }
    }

    public final void b() {
        p40 p40Var = this.H;
        if (p40Var.m0[p40Var.f36904j1] != null) {
            p40 p40Var2 = this.H;
            int width = p40Var2.m0[p40Var2.f36904j1].getWidth();
            p40 p40Var3 = this.H;
            int height = p40Var3.m0[p40Var3.f36904j1].getHeight();
            float min = this.F / Math.min(width, height);
            int i7 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i7 == i10) {
                p40 p40Var4 = this.H;
                p40Var4.K0 = 1.0f;
                p40Var4.L0 = 1.0f;
            } else if (i7 > i10) {
                p40 p40Var5 = this.H;
                p40Var5.K0 = 1.0f;
                p40Var5.L0 = i7 / this.G;
            } else {
                p40 p40Var6 = this.H;
                p40Var6.K0 = i10 / this.F;
                p40Var6.L0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.H.K0 + " scaleY = " + this.H.L0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f32092n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.f32092n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f32092n[i7] = null;
                }
            }
        }
        this.H.V = false;
        if (this.f32090e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f32088b.eglGetCurrentContext()) || !this.f32090e.equals(this.f32088b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f32088b;
                EGLDisplay eGLDisplay = this.f32089c;
                EGLSurface eGLSurface = this.f32090e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f36883a0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f36883a0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f36883a0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f36883a0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f32090e != null) {
            EGL10 egl102 = this.f32088b;
            EGLDisplay eGLDisplay2 = this.f32089c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f32088b.eglDestroySurface(this.f32089c, this.f32090e);
            this.f32090e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f32088b.eglDestroyContext(this.f32089c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f32089c;
        if (eGLDisplay3 != null) {
            this.f32088b.eglTerminate(eGLDisplay3);
            this.f32089c = null;
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
        h40 h40Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            e40 e40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            p40 p40Var = this.H;
                            p40Var.f36904j1 = 1 - p40Var.f36904j1;
                            if (this.H.A0) {
                                this.H.q("GL surface flip applied: surface=" + this.H.f36904j1);
                            }
                            b();
                            p40 p40Var2 = this.H;
                            float f10 = (1.0f / p40Var2.K0) / 2.0f;
                            float f11 = (1.0f / p40Var2.L0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            p40Var2.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                            this.H.I0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                            return;
                        }
                        return;
                    }
                    if (org.telegram.messenger.r2.f25212a) {
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
                EGL10 egl10 = this.f32088b;
                EGLDisplay eGLDisplay = this.f32089c;
                EGLSurface eGLSurface = this.f32090e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f32088b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f32092n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.G0);
                    this.f32092n[0].setOnFrameAvailableListener(null);
                    this.f32092n[0].release();
                    p40 p40Var3 = this.H;
                    int[] iArr = p40Var3.f36885b0;
                    int[] iArr2 = p40Var3.f36883a0;
                    iArr[0] = iArr2[0];
                    p40Var3.f36887c0 = 0.0f;
                    iArr2[0] = 0;
                    p40Var3.J0 = p40Var3.I0.duplicate();
                    p40 p40Var4 = this.H;
                    p40Var4.M0 = p40Var4.m0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.J = false;
                GLES20.glGenTextures(1, this.H.f36883a0, 0);
                GLES20.glBindTexture(36197, this.H.f36883a0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f32092n[0] = new SurfaceTexture(this.H.f36883a0[0]);
                this.f32092n[0].setOnFrameAvailableListener(new ry(this, 1));
                if (this.H.A0) {
                    this.H.q("GL input recreated: surface=0");
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.q8(this.H, 0, this.f32092n[0], 11));
                b();
                p40 p40Var5 = this.H;
                float f16 = (1.0f / p40Var5.K0) / 2.0f;
                float f17 = (1.0f / p40Var5.L0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                p40Var5.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.H.I0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.D && ((!((z13 = (obj = message.obj) instanceof e40)) || ((e40) obj).f33288c != -2) && (h40Var = this.H.f36900h1) != null)) {
                int i12 = message.arg1;
                if (z13) {
                    e40Var = (e40) obj;
                }
                h40Var.i(i12, e40Var);
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
        if (this.f32091f) {
            if (!this.d.equals(this.f32088b.eglGetCurrentContext()) || !this.f32090e.equals(this.f32088b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f32088b;
                EGLDisplay eGLDisplay2 = this.f32089c;
                EGLSurface eGLSurface2 = this.f32090e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z9) {
                this.f32092n[0].updateTexImage();
            }
            if (z10) {
                this.f32092n[1].updateTexImage();
            }
            if (this.H.A0 && this.H.f36904j1 == this.H.f36926z0 && ((this.H.f36904j1 == 0 && z9) || (this.H.f36904j1 == 1 && z10))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.D) {
                p40 p40Var6 = this.H;
                if (p40Var6.f36900h1 == null) {
                    p40Var6.f36900h1 = new h40(p40Var6);
                }
                p40 p40Var7 = this.H;
                if (p40Var7.f36900h1.F0) {
                    if (!p40Var7.J) {
                        this.H.J = true;
                        org.telegram.messenger.g0.h3(new Runnable(this) {
                            public final b40 f31705b;

                            {
                                this.f31705b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f31705b.H.f36912q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        p40 p40Var8 = this.f31705b.H;
                                        if (p40Var8.f36911p0 != null) {
                                            Bitmap bitmap = p40Var8.f36902i1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                p40Var8.f36902i1 = null;
                                            }
                                            p40Var8.f36902i1 = p40Var8.f36911p0.getBitmap();
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
                p40 p40Var8 = this.H;
                h40 h40Var2 = p40Var8.f36900h1;
                org.telegram.messenger.pe peVar = p40Var8.f36892e0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (h40Var2.F0 && h40Var2.T != null && h40Var2.T.getLooper() != null && h40Var2.T.getLooper().getThread() != null && h40Var2.T.getLooper().getThread().isAlive()) {
                    h40Var2.f34199x = eglGetCurrentContext;
                    h40Var2.T.sendMessage(h40Var2.T.obtainMessage(0, 1, 0));
                }
                h40Var2.F0 = true;
                int i15 = org.telegram.messenger.qp.s1(h40Var2.H0.f36891e).f24918v3;
                org.telegram.messenger.g0.h3(new vs(3));
                h40Var2.f34168a = peVar;
                h40Var2.d = i15;
                h40Var2.f34175e = i15;
                h40Var2.f34177f = org.telegram.messenger.qp.s1(h40Var2.H0.f36891e).f24928w3 * 1024;
                h40Var2.f34199x = eglGetCurrentContext;
                synchronized (h40Var2.U) {
                    try {
                        if (!h40Var2.W) {
                            h40Var2.W = true;
                            Thread thread = new Thread(h40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!h40Var2.V) {
                                try {
                                    h40Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            h40Var2.A0.clear();
                            h40Var2.C0 = 0;
                            org.telegram.messenger.q5 q5Var = h40Var2.B0;
                            if (q5Var != null) {
                                q5Var.cleanupQueue();
                                h40Var2.B0.recycle();
                            }
                            h40Var2.B0 = new org.telegram.messenger.q5("keyframes_thumb_queue", true);
                            h40Var2.T.sendMessage(h40Var2.T.obtainMessage(0));
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
                    p40 p40Var9 = this.H;
                    float f22 = p40Var9.K0;
                    p40Var9.K0 = p40Var9.L0;
                    p40Var9.L0 = f22;
                }
                this.D = true;
                this.H.w();
            } else {
                z12 = false;
            }
            p40 p40Var10 = this.H;
            if (p40Var10.f36900h1 != null && ((p40Var10.f36904j1 == 0 && z9) || (this.H.f36904j1 == 1 && z10))) {
                p40 p40Var11 = this.H;
                h40 h40Var3 = p40Var11.f36900h1;
                SurfaceTexture surfaceTexture2 = this.f32092n[p40Var11.f36904j1];
                p40 p40Var12 = this.H;
                if (p40Var12.f36917t0) {
                    i13 = p40Var12.f36904j1;
                }
                h40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f32092n[this.H.f36904j1].getTransformMatrix(this.H.F0);
            GLES20.glUseProgram(this.f32093r);
            GLES20.glActiveTexture(33984);
            p40 p40Var13 = this.H;
            GLES20.glBindTexture(36197, p40Var13.f36883a0[p40Var13.f36904j1]);
            GLES20.glVertexAttribPointer(this.f32096x, 3, 5126, false, 12, (Buffer) this.H.H0);
            GLES20.glEnableVertexAttribArray(this.f32096x);
            GLES20.glVertexAttribPointer(this.f32097y, 2, 5126, false, 8, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f32097y);
            GLES20.glUniformMatrix4fv(this.f32095w, 1, false, this.H.F0, 0);
            GLES20.glUniformMatrix4fv(this.f32094s, 1, false, this.H.E0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f32096x);
            GLES20.glDisableVertexAttribArray(this.f32097y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f32088b.eglSwapBuffers(this.f32089c, this.f32090e);
            if (z11 && this.H.A0) {
                this.H.A0 = false;
                this.H.q("first target frame presented: surface=" + this.H.f36904j1);
            }
            if (z12) {
                org.telegram.messenger.g0.h3(new Runnable(this) {
                    public final b40 f31705b;

                    {
                        this.f31705b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f31705b.H.f36912q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                p40 p40Var82 = this.f31705b.H;
                                if (p40Var82.f36911p0 != null) {
                                    Bitmap bitmap = p40Var82.f36902i1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        p40Var82.f36902i1 = null;
                                    }
                                    p40Var82.f36902i1 = p40Var82.f36911p0.getBitmap();
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f32088b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f32089c = eglGetDisplay;
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
            if (org.telegram.messenger.r2.f25212a) {
                org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f32088b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25212a) {
                org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f32088b.eglChooseConfig(this.f32089c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f32088b.eglCreateContext(this.f32089c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f32087a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f32088b.eglCreateWindowSurface(this.f32089c, eGLConfig, surfaceTexture, null);
                        this.f32090e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f32088b.eglMakeCurrent(this.f32089c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (org.telegram.messenger.r2.f25212a) {
                                    org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                b();
                                p40 p40Var = this.H;
                                float f10 = p40Var.K0;
                                int[] iArr2 = p40Var.f36883a0;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / p40Var.L0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (p40Var.f36900h1 == null) {
                                    p40Var.f36900h1 = new h40(p40Var);
                                }
                                FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(48));
                                p40Var.H0 = g10;
                                g10.put(fArr).position(0);
                                FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                                p40Var.I0 = g11;
                                g11.put(fArr2).position(0);
                                Matrix.setIdentityM(p40Var.F0, 0);
                                int l10 = p40.l(p40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int l11 = p40.l(p40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (l10 != 0 && l11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f32093r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, l10);
                                    GLES20.glAttachShader(this.f32093r, l11);
                                    GLES20.glLinkProgram(this.f32093r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f32093r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (org.telegram.messenger.r2.f25212a) {
                                            org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f32093r);
                                        this.f32093r = 0;
                                    } else {
                                        this.f32096x = GLES20.glGetAttribLocation(this.f32093r, "aPosition");
                                        this.f32097y = GLES20.glGetAttribLocation(this.f32093r, "aTextureCoord");
                                        this.f32094s = GLES20.glGetUniformLocation(this.f32093r, "uMVPMatrix");
                                        this.f32095w = GLES20.glGetUniformLocation(this.f32093r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(p40Var.E0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i7 = 0; i7 < 2; i7++) {
                                        GLES20.glBindTexture(36197, iArr2[i7]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i7]);
                                        SurfaceTexture[] surfaceTextureArr = this.f32092n;
                                        surfaceTextureArr[i7] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z10;
                                                b40 b40Var = b40.this;
                                                int i10 = i7;
                                                boolean z11 = true;
                                                b40Var.H.V = true;
                                                if (i10 == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (i10 != 1) {
                                                    z11 = false;
                                                }
                                                b40Var.requestRender(z10, z11);
                                            }
                                        });
                                        org.telegram.messenger.g0.h3(new org.telegram.ui.q8(p40Var, i7, surfaceTextureArr[i7], 11));
                                    }
                                    if (org.telegram.messenger.r2.f25212a) {
                                        org.telegram.messenger.a8.d("InstantCamera gl initied");
                                    }
                                    z9 = true;
                                } else {
                                    if (org.telegram.messenger.r2.f25212a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25212a) {
                                org.telegram.messenger.camera.q.t(this.f32088b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f32091f = z9;
        super.run();
    }
}
