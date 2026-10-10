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
public final class f60 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final u60 H;
    public final SurfaceTexture f26315a;
    public EGL10 f26316b;
    public EGLDisplay f26317c;
    public EGLContext d;
    public EGLSurface f26318e;
    public boolean f26319f;
    public Object h;
    public final SurfaceTexture[] f26320n;
    public int f26321r;
    public int f26322s;
    public int v;
    public int f26323w;
    public int f26324x;
    public boolean f26325y;

    public f60(u60 u60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = u60Var;
        this.f26320n = new SurfaceTexture[2];
        this.E = 0;
        this.f26315a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new i60(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        u60 u60Var = this.H;
        if (u60Var.f31361n0[u60Var.f31358k1] != null) {
            u60 u60Var2 = this.H;
            int width = u60Var2.f31361n0[u60Var2.f31358k1].getWidth();
            u60 u60Var3 = this.H;
            int height = u60Var3.f31361n0[u60Var3.f31358k1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                u60 u60Var4 = this.H;
                u60Var4.L0 = 1.0f;
                u60Var4.M0 = 1.0f;
            } else if (i10 > i11) {
                u60 u60Var5 = this.H;
                u60Var5.L0 = 1.0f;
                u60Var5.M0 = i10 / this.G;
            } else {
                u60 u60Var6 = this.H;
                u60Var6.L0 = i11 / this.F;
                u60Var6.M0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.L0 + " scaleY = " + this.H.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f26320n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f26320n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f26320n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.f26318e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f26316b.eglGetCurrentContext()) || !this.f26318e.equals(this.f26316b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26316b;
                EGLDisplay eGLDisplay = this.f26317c;
                EGLSurface eGLSurface = this.f26318e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f31338b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f31338b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f31338b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f31338b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f26318e != null) {
            EGL10 egl102 = this.f26316b;
            EGLDisplay eGLDisplay2 = this.f26317c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f26316b.eglDestroySurface(this.f26317c, this.f26318e);
            this.f26318e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f26316b.eglDestroyContext(this.f26317c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f26317c;
        if (eGLDisplay3 != null) {
            this.f26316b.eglTerminate(eGLDisplay3);
            this.f26317c = null;
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
        m60 m60Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            i60 i60Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            u60 u60Var = this.H;
                            u60Var.f31358k1 = 1 - u60Var.f31358k1;
                            if (this.H.B0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f31358k1);
                            }
                            c();
                            u60 u60Var2 = this.H;
                            float f7 = (1.0f / u60Var2.L0) / 2.0f;
                            float f10 = (1.0f / u60Var2.M0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            u60Var2.J0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
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
                EGL10 egl10 = this.f26316b;
                EGLDisplay eGLDisplay = this.f26317c;
                EGLSurface eGLSurface = this.f26318e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f26316b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f26320n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.H0);
                    this.f26320n[0].setOnFrameAvailableListener(null);
                    this.f26320n[0].release();
                    u60 u60Var3 = this.H;
                    int[] iArr = u60Var3.f31340c0;
                    int[] iArr2 = u60Var3.f31338b0;
                    iArr[0] = iArr2[0];
                    u60Var3.f31342d0 = 0.0f;
                    iArr2[0] = 0;
                    u60Var3.K0 = u60Var3.J0.duplicate();
                    u60 u60Var4 = this.H;
                    u60Var4.N0 = u60Var4.f31361n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f31338b0, 0);
                GLES20.glBindTexture(36197, this.H.f31338b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f26320n[0] = new SurfaceTexture(this.H.f31338b0[0]);
                this.f26320n[0].setOnFrameAvailableListener(new l00(this, 1));
                if (this.H.B0) {
                    this.H.p("GL input recreated: surface=0");
                }
                AndroidUtilities.runOnUIThread(new zk(this.H, 0, this.f26320n[0], 7));
                c();
                u60 u60Var5 = this.H;
                float f15 = (1.0f / u60Var5.L0) / 2.0f;
                float f16 = (1.0f / u60Var5.M0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                u60Var5.J0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                this.H.J0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f26325y && ((!((z14 = (obj = message.obj) instanceof i60)) || ((i60) obj).f27254c != -2) && (m60Var = this.H.f31354i1) != null)) {
                int i13 = message.arg1;
                if (z14) {
                    i60Var = (i60) obj;
                }
                m60Var.i(i13, i60Var);
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
        if (this.f26319f) {
            if (!this.d.equals(this.f26316b.eglGetCurrentContext()) || !this.f26318e.equals(this.f26316b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f26316b;
                EGLDisplay eGLDisplay2 = this.f26317c;
                EGLSurface eGLSurface2 = this.f26318e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f26320n[0].updateTexImage();
            }
            if (z11) {
                this.f26320n[1].updateTexImage();
            }
            if (this.H.B0 && this.H.f31358k1 == this.H.A0 && ((this.H.f31358k1 == 0 && z10) || (this.H.f31358k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.f26325y) {
                u60 u60Var6 = this.H;
                if (u60Var6.f31354i1 == null) {
                    u60Var6.f31354i1 = new m60(u60Var6);
                }
                u60 u60Var7 = this.H;
                if (u60Var7.f31354i1.F0) {
                    if (!u60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final f60 f25926b;

                            {
                                this.f25926b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f25926b.H.f31366r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        u60 u60Var8 = this.f25926b.H;
                                        if (u60Var8.f31364q0 != null) {
                                            Bitmap bitmap = u60Var8.f31356j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                u60Var8.f31356j1 = null;
                                            }
                                            u60Var8.f31356j1 = u60Var8.f31364q0.getBitmap();
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
                u60 u60Var8 = this.H;
                m60 m60Var2 = u60Var8.f31354i1;
                b60 b60Var = u60Var8.f31347f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (m60Var2.F0 && m60Var2.T != null && m60Var2.T.getLooper() != null && m60Var2.T.getLooper().getThread() != null && m60Var2.T.getLooper().getThread().isAlive()) {
                    m60Var2.f28673w = eglGetCurrentContext;
                    m60Var2.T.sendMessage(m60Var2.T.obtainMessage(0, 1, 0));
                }
                m60Var2.F0 = true;
                int i16 = MessagesController.getInstance(m60Var2.H0.f31346f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new vh(7));
                m60Var2.f28644a = b60Var;
                m60Var2.d = i16;
                m60Var2.f28651e = i16;
                m60Var2.f28653f = MessagesController.getInstance(m60Var2.H0.f31346f).roundVideoBitrate * 1024;
                m60Var2.f28673w = eglGetCurrentContext;
                synchronized (m60Var2.U) {
                    try {
                        if (!m60Var2.W) {
                            m60Var2.W = true;
                            Thread thread = new Thread(m60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!m60Var2.V) {
                                try {
                                    m60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            m60Var2.A0.clear();
                            m60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = m60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                m60Var2.B0.recycle();
                            }
                            m60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            m60Var2.T.sendMessage(m60Var2.T.obtainMessage(0));
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
                    u60 u60Var9 = this.H;
                    float f21 = u60Var9.L0;
                    u60Var9.L0 = u60Var9.M0;
                    u60Var9.M0 = f21;
                }
                this.f26325y = true;
                this.H.v();
            } else {
                z13 = false;
            }
            u60 u60Var10 = this.H;
            if (u60Var10.f31354i1 != null && ((u60Var10.f31358k1 == 0 && z10) || (this.H.f31358k1 == 1 && z11))) {
                u60 u60Var11 = this.H;
                m60 m60Var3 = u60Var11.f31354i1;
                SurfaceTexture surfaceTexture2 = this.f26320n[u60Var11.f31358k1];
                u60 u60Var12 = this.H;
                if (u60Var12.f31370u0) {
                    i14 = u60Var12.f31358k1;
                }
                m60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f26320n[this.H.f31358k1].getTransformMatrix(this.H.G0);
            GLES20.glUseProgram(this.f26321r);
            GLES20.glActiveTexture(33984);
            u60 u60Var13 = this.H;
            GLES20.glBindTexture(36197, u60Var13.f31338b0[u60Var13.f31358k1]);
            GLES20.glVertexAttribPointer(this.f26323w, 3, 5126, false, 12, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f26323w);
            GLES20.glVertexAttribPointer(this.f26324x, 2, 5126, false, 8, (Buffer) this.H.J0);
            GLES20.glEnableVertexAttribArray(this.f26324x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.G0, 0);
            GLES20.glUniformMatrix4fv(this.f26322s, 1, false, this.H.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f26323w);
            GLES20.glDisableVertexAttribArray(this.f26324x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f26316b.eglSwapBuffers(this.f26317c, this.f26318e);
            if (z12 && this.H.B0) {
                this.H.B0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f31358k1);
            }
            if (z13) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final f60 f25926b;

                    {
                        this.f25926b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f25926b.H.f31366r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                u60 u60Var82 = this.f25926b.H;
                                if (u60Var82.f31364q0 != null) {
                                    Bitmap bitmap = u60Var82.f31356j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        u60Var82.f31356j1 = null;
                                    }
                                    u60Var82.f31356j1 = u60Var82.f31364q0.getBitmap();
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
        this.f26316b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26317c = eglGetDisplay;
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
                org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f26316b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26316b.eglChooseConfig(this.f26317c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f26316b.eglCreateContext(this.f26317c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f26315a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f26316b.eglCreateWindowSurface(this.f26317c, eGLConfig, surfaceTexture, null);
                        this.f26318e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f26316b.eglMakeCurrent(this.f26317c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                u60 u60Var = this.H;
                                float f7 = u60Var.L0;
                                int[] iArr2 = u60Var.f31338b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / u60Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (u60Var.f31354i1 == null) {
                                    u60Var.f31354i1 = new m60(u60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(48));
                                u60Var.I0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                                u60Var.J0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(u60Var.G0, 0);
                                int j3 = u60.j(u60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j10 = u60.j(u60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j3 != 0 && j10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f26321r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j3);
                                    GLES20.glAttachShader(this.f26321r, j10);
                                    GLES20.glLinkProgram(this.f26321r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f26321r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f26321r);
                                        this.f26321r = 0;
                                    } else {
                                        this.f26323w = GLES20.glGetAttribLocation(this.f26321r, "aPosition");
                                        this.f26324x = GLES20.glGetAttribLocation(this.f26321r, "aTextureCoord");
                                        this.f26322s = GLES20.glGetUniformLocation(this.f26321r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f26321r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(u60Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f26320n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                f60 f60Var = f60.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                f60Var.H.W = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                f60Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new zk(u60Var, i10, surfaceTextureArr[i10], 7));
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
                                org.telegram.messenger.bi.v(this.f26316b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f26319f = z10;
        super.run();
    }
}
