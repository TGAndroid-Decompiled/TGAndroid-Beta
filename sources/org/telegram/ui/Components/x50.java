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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;
public final class x50 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final m60 H;
    public final SurfaceTexture f32304a;
    public EGL10 f32305b;
    public EGLDisplay f32306c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f32307f;
    public Object h;
    public final SurfaceTexture[] f32308n;
    public int f32309r;
    public int f32310s;
    public int v;
    public int f32311w;
    public int f32312x;
    public boolean f32313y;

    public x50(m60 m60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = m60Var;
        this.f32308n = new SurfaceTexture[2];
        this.E = 0;
        this.f32304a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j10, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new a60(j10, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        m60 m60Var = this.H;
        if (m60Var.f28428n0[m60Var.f28425k1] != null) {
            m60 m60Var2 = this.H;
            int width = m60Var2.f28428n0[m60Var2.f28425k1].getWidth();
            m60 m60Var3 = this.H;
            int height = m60Var3.f28428n0[m60Var3.f28425k1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                m60 m60Var4 = this.H;
                m60Var4.L0 = 1.0f;
                m60Var4.M0 = 1.0f;
            } else if (i10 > i11) {
                m60 m60Var5 = this.H;
                m60Var5.L0 = 1.0f;
                m60Var5.M0 = i10 / this.G;
            } else {
                m60 m60Var6 = this.H;
                m60Var6.L0 = i11 / this.F;
                m60Var6.M0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.L0 + " scaleY = " + this.H.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f32308n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f32308n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f32308n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f32305b.eglGetCurrentContext()) || !this.e.equals(this.f32305b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f32305b;
                EGLDisplay eGLDisplay = this.f32306c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f28405b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f28405b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f28405b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f28405b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f32305b;
            EGLDisplay eGLDisplay2 = this.f32306c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f32305b.eglDestroySurface(this.f32306c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f32305b.eglDestroyContext(this.f32306c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f32306c;
        if (eGLDisplay3 != null) {
            this.f32305b.eglTerminate(eGLDisplay3);
            this.f32306c = null;
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
        f60 f60Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            a60 a60Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            m60 m60Var = this.H;
                            m60Var.f28425k1 = 1 - m60Var.f28425k1;
                            if (this.H.B0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f28425k1);
                            }
                            c();
                            m60 m60Var2 = this.H;
                            float f7 = (1.0f / m60Var2.L0) / 2.0f;
                            float f10 = (1.0f / m60Var2.M0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            m60Var2.J0 = org.telegram.messenger.kk.h(ByteBuffer.allocateDirect(32));
                            this.H.J0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
                            return;
                        }
                        return;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera set gl renderer session");
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
                        Matrix.setIdentityM(this.H.F0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.F0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f32305b;
                EGLDisplay eGLDisplay = this.f32306c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f32305b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f32308n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.H0);
                    this.f32308n[0].setOnFrameAvailableListener(null);
                    this.f32308n[0].release();
                    m60 m60Var3 = this.H;
                    int[] iArr = m60Var3.f28407c0;
                    int[] iArr2 = m60Var3.f28405b0;
                    iArr[0] = iArr2[0];
                    m60Var3.f28409d0 = 0.0f;
                    iArr2[0] = 0;
                    m60Var3.K0 = m60Var3.J0.duplicate();
                    m60 m60Var4 = this.H;
                    m60Var4.N0 = m60Var4.f28428n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f28405b0, 0);
                GLES20.glBindTexture(36197, this.H.f28405b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f32308n[0] = new SurfaceTexture(this.H.f28405b0[0]);
                this.f32308n[0].setOnFrameAvailableListener(new d00(this, 1));
                if (this.H.B0) {
                    this.H.p("GL input recreated: surface=0");
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this.H, 0, this.f32308n[0], 12));
                c();
                m60 m60Var5 = this.H;
                float f15 = (1.0f / m60Var5.L0) / 2.0f;
                float f16 = (1.0f / m60Var5.M0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                m60Var5.J0 = org.telegram.messenger.kk.h(ByteBuffer.allocateDirect(32));
                this.H.J0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f32313y && ((!((z14 = (obj = message.obj) instanceof a60)) || ((a60) obj).f24501c != -2) && (f60Var = this.H.f28421i1) != null)) {
                int i13 = message.arg1;
                if (z14) {
                    a60Var = (a60) obj;
                }
                f60Var.i(i13, a60Var);
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
        if (this.f32307f) {
            if (!this.d.equals(this.f32305b.eglGetCurrentContext()) || !this.e.equals(this.f32305b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f32305b;
                EGLDisplay eGLDisplay2 = this.f32306c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f32308n[0].updateTexImage();
            }
            if (z11) {
                this.f32308n[1].updateTexImage();
            }
            if (this.H.B0 && this.H.f28425k1 == this.H.A0 && ((this.H.f28425k1 == 0 && z10) || (this.H.f28425k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.f32313y) {
                m60 m60Var6 = this.H;
                if (m60Var6.f28421i1 == null) {
                    m60Var6.f28421i1 = new f60(m60Var6);
                }
                m60 m60Var7 = this.H;
                if (m60Var7.f28421i1.F0) {
                    if (!m60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final x50 f32015b;

                            {
                                this.f32015b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f32015b.H.f28433r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        m60 m60Var8 = this.f32015b.H;
                                        if (m60Var8.f28431q0 != null) {
                                            Bitmap bitmap = m60Var8.f28423j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                m60Var8.f28423j1 = null;
                                            }
                                            m60Var8.f28423j1 = m60Var8.f28431q0.getBitmap();
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
                m60 m60Var8 = this.H;
                f60 f60Var2 = m60Var8.f28421i1;
                s50 s50Var = m60Var8.f28414f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (f60Var2.F0 && f60Var2.T != null && f60Var2.T.getLooper() != null && f60Var2.T.getLooper().getThread() != null && f60Var2.T.getLooper().getThread().isAlive()) {
                    f60Var2.f26142w = eglGetCurrentContext;
                    f60Var2.T.sendMessage(f60Var2.T.obtainMessage(0, 1, 0));
                }
                f60Var2.F0 = true;
                int i16 = MessagesController.getInstance(f60Var2.H0.f28413f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new rc(12));
                f60Var2.f26114a = s50Var;
                f60Var2.d = i16;
                f60Var2.e = i16;
                f60Var2.f26122f = MessagesController.getInstance(f60Var2.H0.f28413f).roundVideoBitrate * 1024;
                f60Var2.f26142w = eglGetCurrentContext;
                synchronized (f60Var2.U) {
                    try {
                        if (!f60Var2.W) {
                            f60Var2.W = true;
                            Thread thread = new Thread(f60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!f60Var2.V) {
                                try {
                                    f60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            f60Var2.A0.clear();
                            f60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = f60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                f60Var2.B0.recycle();
                            }
                            f60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            f60Var2.T.sendMessage(f60Var2.T.obtainMessage(0));
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
                    m60 m60Var9 = this.H;
                    float f21 = m60Var9.L0;
                    m60Var9.L0 = m60Var9.M0;
                    m60Var9.M0 = f21;
                }
                this.f32313y = true;
                this.H.v();
            } else {
                z13 = false;
            }
            m60 m60Var10 = this.H;
            if (m60Var10.f28421i1 != null && ((m60Var10.f28425k1 == 0 && z10) || (this.H.f28425k1 == 1 && z11))) {
                m60 m60Var11 = this.H;
                f60 f60Var3 = m60Var11.f28421i1;
                SurfaceTexture surfaceTexture2 = this.f32308n[m60Var11.f28425k1];
                m60 m60Var12 = this.H;
                if (m60Var12.f28437u0) {
                    i14 = m60Var12.f28425k1;
                }
                f60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f32308n[this.H.f28425k1].getTransformMatrix(this.H.G0);
            GLES20.glUseProgram(this.f32309r);
            GLES20.glActiveTexture(33984);
            m60 m60Var13 = this.H;
            GLES20.glBindTexture(36197, m60Var13.f28405b0[m60Var13.f28425k1]);
            GLES20.glVertexAttribPointer(this.f32311w, 3, 5126, false, 12, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f32311w);
            GLES20.glVertexAttribPointer(this.f32312x, 2, 5126, false, 8, (Buffer) this.H.J0);
            GLES20.glEnableVertexAttribArray(this.f32312x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.G0, 0);
            GLES20.glUniformMatrix4fv(this.f32310s, 1, false, this.H.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f32311w);
            GLES20.glDisableVertexAttribArray(this.f32312x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f32305b.eglSwapBuffers(this.f32306c, this.e);
            if (z12 && this.H.B0) {
                this.H.B0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f28425k1);
            }
            if (z13) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final x50 f32015b;

                    {
                        this.f32015b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f32015b.H.f28433r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                m60 m60Var82 = this.f32015b.H;
                                if (m60Var82.f28431q0 != null) {
                                    Bitmap bitmap = m60Var82.f28423j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        m60Var82.f28423j1 = null;
                                    }
                                    m60Var82.f28423j1 = m60Var82.f28431q0.getBitmap();
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
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f32305b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f32306c = eglGetDisplay;
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
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f32305b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f32305b.eglChooseConfig(this.f32306c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f32305b.eglCreateContext(this.f32306c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f32304a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f32305b.eglCreateWindowSurface(this.f32306c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f32305b.eglMakeCurrent(this.f32306c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                m60 m60Var = this.H;
                                float f7 = m60Var.L0;
                                int[] iArr2 = m60Var.f28405b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / m60Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (m60Var.f28421i1 == null) {
                                    m60Var.f28421i1 = new f60(m60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.kk.h(ByteBuffer.allocateDirect(48));
                                m60Var.I0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.kk.h(ByteBuffer.allocateDirect(32));
                                m60Var.J0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(m60Var.G0, 0);
                                int j10 = m60.j(m60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = m60.j(m60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f32309r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(this.f32309r, j11);
                                    GLES20.glLinkProgram(this.f32309r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f32309r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f32309r);
                                        this.f32309r = 0;
                                    } else {
                                        this.f32311w = GLES20.glGetAttribLocation(this.f32309r, "aPosition");
                                        this.f32312x = GLES20.glGetAttribLocation(this.f32309r, "aTextureCoord");
                                        this.f32310s = GLES20.glGetUniformLocation(this.f32309r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f32309r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(m60Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f32308n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                x50 x50Var = x50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                x50Var.H.W = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                x50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(m60Var, i10, surfaceTextureArr[i10], 12));
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera gl initied");
                                    }
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.kk.v(this.f32305b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        }
        this.f32307f = z10;
        super.run();
    }
}
