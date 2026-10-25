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
public final class z50 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final o60 H;
    public final SurfaceTexture f35211a;
    public EGL10 f35212b;
    public EGLDisplay f35213c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f35214f;
    public Object h;
    public final SurfaceTexture[] f35215n;
    public int f35216r;
    public int f35217s;
    public int v;
    public int f35218w;
    public int f35219x;
    public boolean f35220y;

    public z50(o60 o60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = o60Var;
        this.f35215n = new SurfaceTexture[2];
        this.E = 0;
        this.f35211a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j10, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new c60(j10, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        o60 o60Var = this.H;
        if (o60Var.f31191n0[o60Var.f31188k1] != null) {
            o60 o60Var2 = this.H;
            int width = o60Var2.f31191n0[o60Var2.f31188k1].getWidth();
            o60 o60Var3 = this.H;
            int height = o60Var3.f31191n0[o60Var3.f31188k1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                o60 o60Var4 = this.H;
                o60Var4.L0 = 1.0f;
                o60Var4.M0 = 1.0f;
            } else if (i10 > i11) {
                o60 o60Var5 = this.H;
                o60Var5.L0 = 1.0f;
                o60Var5.M0 = i10 / this.G;
            } else {
                o60 o60Var6 = this.H;
                o60Var6.L0 = i11 / this.F;
                o60Var6.M0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.L0 + " scaleY = " + this.H.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f35215n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f35215n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f35215n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f35212b.eglGetCurrentContext()) || !this.e.equals(this.f35212b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f35212b;
                EGLDisplay eGLDisplay = this.f35213c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f31168b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f31168b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f31168b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f31168b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f35212b;
            EGLDisplay eGLDisplay2 = this.f35213c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f35212b.eglDestroySurface(this.f35213c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f35212b.eglDestroyContext(this.f35213c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f35213c;
        if (eGLDisplay3 != null) {
            this.f35212b.eglTerminate(eGLDisplay3);
            this.f35213c = null;
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
        h60 h60Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            c60 c60Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            o60 o60Var = this.H;
                            o60Var.f31188k1 = 1 - o60Var.f31188k1;
                            if (this.H.B0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f31188k1);
                            }
                            c();
                            o60 o60Var2 = this.H;
                            float f7 = (1.0f / o60Var2.L0) / 2.0f;
                            float f10 = (1.0f / o60Var2.M0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            o60Var2.J0 = org.telegram.messenger.vh.h(ByteBuffer.allocateDirect(32));
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
                EGL10 egl10 = this.f35212b;
                EGLDisplay eGLDisplay = this.f35213c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f35212b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f35215n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.H0);
                    this.f35215n[0].setOnFrameAvailableListener(null);
                    this.f35215n[0].release();
                    o60 o60Var3 = this.H;
                    int[] iArr = o60Var3.f31170c0;
                    int[] iArr2 = o60Var3.f31168b0;
                    iArr[0] = iArr2[0];
                    o60Var3.f31172d0 = 0.0f;
                    iArr2[0] = 0;
                    o60Var3.K0 = o60Var3.J0.duplicate();
                    o60 o60Var4 = this.H;
                    o60Var4.N0 = o60Var4.f31191n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f31168b0, 0);
                GLES20.glBindTexture(36197, this.H.f31168b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f35215n[0] = new SurfaceTexture(this.H.f31168b0[0]);
                this.f35215n[0].setOnFrameAvailableListener(new d00(this, 1));
                if (this.H.B0) {
                    this.H.p("GL input recreated: surface=0");
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this.H, 0, this.f35215n[0], 12));
                c();
                o60 o60Var5 = this.H;
                float f15 = (1.0f / o60Var5.L0) / 2.0f;
                float f16 = (1.0f / o60Var5.M0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                o60Var5.J0 = org.telegram.messenger.vh.h(ByteBuffer.allocateDirect(32));
                this.H.J0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f35220y && ((!((z14 = (obj = message.obj) instanceof c60)) || ((c60) obj).f27076c != -2) && (h60Var = this.H.f31184i1) != null)) {
                int i13 = message.arg1;
                if (z14) {
                    c60Var = (c60) obj;
                }
                h60Var.i(i13, c60Var);
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
        if (this.f35214f) {
            if (!this.d.equals(this.f35212b.eglGetCurrentContext()) || !this.e.equals(this.f35212b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f35212b;
                EGLDisplay eGLDisplay2 = this.f35213c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f35215n[0].updateTexImage();
            }
            if (z11) {
                this.f35215n[1].updateTexImage();
            }
            if (this.H.B0 && this.H.f31188k1 == this.H.A0 && ((this.H.f31188k1 == 0 && z10) || (this.H.f31188k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.f35220y) {
                o60 o60Var6 = this.H;
                if (o60Var6.f31184i1 == null) {
                    o60Var6.f31184i1 = new h60(o60Var6);
                }
                o60 o60Var7 = this.H;
                if (o60Var7.f31184i1.F0) {
                    if (!o60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final z50 f34929b;

                            {
                                this.f34929b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f34929b.H.f31196r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        o60 o60Var8 = this.f34929b.H;
                                        if (o60Var8.f31194q0 != null) {
                                            Bitmap bitmap = o60Var8.f31186j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                o60Var8.f31186j1 = null;
                                            }
                                            o60Var8.f31186j1 = o60Var8.f31194q0.getBitmap();
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
                o60 o60Var8 = this.H;
                h60 h60Var2 = o60Var8.f31184i1;
                u50 u50Var = o60Var8.f31177f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (h60Var2.F0 && h60Var2.T != null && h60Var2.T.getLooper() != null && h60Var2.T.getLooper().getThread() != null && h60Var2.T.getLooper().getThread().isAlive()) {
                    h60Var2.f28843w = eglGetCurrentContext;
                    h60Var2.T.sendMessage(h60Var2.T.obtainMessage(0, 1, 0));
                }
                h60Var2.F0 = true;
                int i16 = MessagesController.getInstance(h60Var2.H0.f31176f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new k5(14));
                h60Var2.f28815a = u50Var;
                h60Var2.d = i16;
                h60Var2.e = i16;
                h60Var2.f28823f = MessagesController.getInstance(h60Var2.H0.f31176f).roundVideoBitrate * 1024;
                h60Var2.f28843w = eglGetCurrentContext;
                synchronized (h60Var2.U) {
                    try {
                        if (!h60Var2.W) {
                            h60Var2.W = true;
                            Thread thread = new Thread(h60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!h60Var2.V) {
                                try {
                                    h60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            h60Var2.A0.clear();
                            h60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = h60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                h60Var2.B0.recycle();
                            }
                            h60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            h60Var2.T.sendMessage(h60Var2.T.obtainMessage(0));
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
                    o60 o60Var9 = this.H;
                    float f21 = o60Var9.L0;
                    o60Var9.L0 = o60Var9.M0;
                    o60Var9.M0 = f21;
                }
                this.f35220y = true;
                this.H.v();
            } else {
                z13 = false;
            }
            o60 o60Var10 = this.H;
            if (o60Var10.f31184i1 != null && ((o60Var10.f31188k1 == 0 && z10) || (this.H.f31188k1 == 1 && z11))) {
                o60 o60Var11 = this.H;
                h60 h60Var3 = o60Var11.f31184i1;
                SurfaceTexture surfaceTexture2 = this.f35215n[o60Var11.f31188k1];
                o60 o60Var12 = this.H;
                if (o60Var12.f31200u0) {
                    i14 = o60Var12.f31188k1;
                }
                h60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f35215n[this.H.f31188k1].getTransformMatrix(this.H.G0);
            GLES20.glUseProgram(this.f35216r);
            GLES20.glActiveTexture(33984);
            o60 o60Var13 = this.H;
            GLES20.glBindTexture(36197, o60Var13.f31168b0[o60Var13.f31188k1]);
            GLES20.glVertexAttribPointer(this.f35218w, 3, 5126, false, 12, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f35218w);
            GLES20.glVertexAttribPointer(this.f35219x, 2, 5126, false, 8, (Buffer) this.H.J0);
            GLES20.glEnableVertexAttribArray(this.f35219x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.G0, 0);
            GLES20.glUniformMatrix4fv(this.f35217s, 1, false, this.H.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f35218w);
            GLES20.glDisableVertexAttribArray(this.f35219x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f35212b.eglSwapBuffers(this.f35213c, this.e);
            if (z12 && this.H.B0) {
                this.H.B0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f31188k1);
            }
            if (z13) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final z50 f34929b;

                    {
                        this.f34929b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f34929b.H.f31196r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                o60 o60Var82 = this.f34929b.H;
                                if (o60Var82.f31194q0 != null) {
                                    Bitmap bitmap = o60Var82.f31186j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        o60Var82.f31186j1 = null;
                                    }
                                    o60Var82.f31186j1 = o60Var82.f31194q0.getBitmap();
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
        this.f35212b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f35213c = eglGetDisplay;
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
                org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f35212b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f35212b.eglChooseConfig(this.f35213c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f35212b.eglCreateContext(this.f35213c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f35211a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f35212b.eglCreateWindowSurface(this.f35213c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f35212b.eglMakeCurrent(this.f35213c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                o60 o60Var = this.H;
                                float f7 = o60Var.L0;
                                int[] iArr2 = o60Var.f31168b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / o60Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (o60Var.f31184i1 == null) {
                                    o60Var.f31184i1 = new h60(o60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.vh.h(ByteBuffer.allocateDirect(48));
                                o60Var.I0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.vh.h(ByteBuffer.allocateDirect(32));
                                o60Var.J0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(o60Var.G0, 0);
                                int j10 = o60.j(o60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j11 = o60.j(o60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j10 != 0 && j11 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f35216r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j10);
                                    GLES20.glAttachShader(this.f35216r, j11);
                                    GLES20.glLinkProgram(this.f35216r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f35216r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f35216r);
                                        this.f35216r = 0;
                                    } else {
                                        this.f35218w = GLES20.glGetAttribLocation(this.f35216r, "aPosition");
                                        this.f35219x = GLES20.glGetAttribLocation(this.f35216r, "aTextureCoord");
                                        this.f35217s = GLES20.glGetUniformLocation(this.f35216r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f35216r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(o60Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f35215n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                z50 z50Var = z50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                z50Var.H.W = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                z50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(o60Var, i10, surfaceTextureArr[i10], 12));
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
                                org.telegram.messenger.vh.t(this.f35212b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f35214f = z10;
        super.run();
    }
}
