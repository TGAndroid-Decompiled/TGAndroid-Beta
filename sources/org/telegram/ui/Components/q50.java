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
public final class q50 extends DispatchQueue {
    public Integer B;
    public int C;
    public int D;
    public final y50 E;
    public final SurfaceTexture f28072a;
    public EGL10 f28073b;
    public EGLDisplay f28074c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f28075f;
    public Object h;
    public final SurfaceTexture[] f28076n;
    public int f28077r;
    public int f28078s;
    public int v;
    public int f28079w;
    public int f28080x;
    public boolean f28081y;

    public q50(y50 y50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.E = y50Var;
        this.f28076n = new SurfaceTexture[2];
        this.B = 0;
        this.f28072a = surfaceTexture;
        this.C = i10;
        this.D = i11;
    }

    public final void b(long j10, int i10, boolean z4, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new t50(j10, i11, i12, z4, 0L)), 0);
        }
    }

    public final void c() {
        y50 y50Var = this.E;
        if (y50Var.f30880f0[y50Var.X0] != null) {
            y50 y50Var2 = this.E;
            int width = y50Var2.f30880f0[y50Var2.X0].getWidth();
            y50 y50Var3 = this.E;
            int height = y50Var3.f30880f0[y50Var3.X0].getHeight();
            float min = this.C / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                y50 y50Var4 = this.E;
                y50Var4.f30904y0 = 1.0f;
                y50Var4.f30905z0 = 1.0f;
            } else if (i10 > i11) {
                y50 y50Var5 = this.E;
                y50Var5.f30904y0 = 1.0f;
                y50Var5.f30905z0 = i10 / this.D;
            } else {
                y50 y50Var6 = this.E;
                y50Var6.f30904y0 = i11 / this.C;
                y50Var6.f30905z0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.E.f30904y0 + " scaleY = " + this.E.f30905z0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f28076n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f28076n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f28076n[i10] = null;
                }
            }
        }
        this.E.O = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f28073b.eglGetCurrentContext()) || !this.e.equals(this.f28073b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f28073b;
                EGLDisplay eGLDisplay = this.f28074c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.E.Q;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.E.Q[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.E.Q;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.E.Q[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f28073b;
            EGLDisplay eGLDisplay2 = this.f28074c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f28073b.eglDestroySurface(this.f28074c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f28073b.eglDestroyContext(this.f28074c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f28074c;
        if (eGLDisplay3 != null) {
            this.f28073b.eglTerminate(eGLDisplay3);
            this.f28074c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        Object obj;
        boolean z12;
        x50 x50Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            t50 t50Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            y50 y50Var = this.E;
                            y50Var.X0 = 1 - y50Var.X0;
                            c();
                            y50 y50Var2 = this.E;
                            float f10 = (1.0f / y50Var2.f30904y0) / 2.0f;
                            float f11 = (1.0f / y50Var2.f30905z0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            y50Var2.f30900w0 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
                            this.E.f30900w0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
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
                        Matrix.setIdentityM(this.E.f30895s0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.E.f30895s0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f28073b;
                EGLDisplay eGLDisplay = this.f28074c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f28073b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f28076n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.E.f30897u0);
                    this.f28076n[0].setOnFrameAvailableListener(null);
                    this.f28076n[0].release();
                    y50 y50Var3 = this.E;
                    int[] iArr = y50Var3.R;
                    int[] iArr2 = y50Var3.Q;
                    iArr[0] = iArr2[0];
                    y50Var3.S = 0.0f;
                    iArr2[0] = 0;
                    y50Var3.f30902x0 = y50Var3.f30900w0.duplicate();
                    y50 y50Var4 = this.E;
                    y50Var4.A0 = y50Var4.f30880f0[0];
                }
                this.B = Integer.valueOf(this.B.intValue() + 1);
                this.E.C = false;
                GLES20.glGenTextures(1, this.E.Q, 0);
                GLES20.glBindTexture(36197, this.E.Q[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f28076n[0] = new SurfaceTexture(this.E.Q[0]);
                this.f28076n[0].setOnFrameAvailableListener(new uz(this, 1));
                AndroidUtilities.runOnUIThread(new ey(this.E, 0, this.f28076n[0], 4));
                c();
                y50 y50Var5 = this.E;
                float f16 = (1.0f / y50Var5.f30904y0) / 2.0f;
                float f17 = (1.0f / y50Var5.f30905z0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                y50Var5.f30900w0 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
                this.E.f30900w0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.f28081y && ((!((z12 = (obj = message.obj) instanceof t50)) || ((t50) obj).f28901c != -2) && (x50Var = this.E.V0) != null)) {
                int i13 = message.arg1;
                if (z12) {
                    t50Var = (t50) obj;
                }
                x50Var.i(i13, t50Var);
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
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i15 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28075f) {
            if (!this.d.equals(this.f28073b.eglGetCurrentContext()) || !this.e.equals(this.f28073b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f28073b;
                EGLDisplay eGLDisplay2 = this.f28074c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z4) {
                this.f28076n[0].updateTexImage();
            }
            if (z10) {
                this.f28076n[1].updateTexImage();
            }
            if (!this.f28081y) {
                y50 y50Var6 = this.E;
                if (y50Var6.V0 == null) {
                    y50Var6.V0 = new x50(y50Var6);
                }
                y50 y50Var7 = this.E;
                if (y50Var7.V0.C0) {
                    if (!y50Var7.C) {
                        this.E.C = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final q50 f27741b;

                            {
                                this.f27741b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f27741b.E.f30884j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        y50 y50Var8 = this.f27741b.E;
                                        if (y50Var8.f30883i0 != null) {
                                            Bitmap bitmap = y50Var8.W0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                y50Var8.W0 = null;
                                            }
                                            y50Var8.W0 = y50Var8.f30883i0.getBitmap();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                    }
                    z11 = false;
                } else {
                    z11 = true;
                }
                y50 y50Var8 = this.E;
                x50 x50Var2 = y50Var8.V0;
                m50 m50Var = y50Var8.U;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (x50Var2.C0 && x50Var2.Q != null && x50Var2.Q.getLooper() != null && x50Var2.Q.getLooper().getThread() != null && x50Var2.Q.getLooper().getThread().isAlive()) {
                    x50Var2.f30507w = eglGetCurrentContext;
                    x50Var2.Q.sendMessage(x50Var2.Q.obtainMessage(0, 1, 0));
                }
                x50Var2.C0 = true;
                int i16 = MessagesController.getInstance(x50Var2.E0.f30871a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new u50(x50Var2, 1));
                x50Var2.f30479a = m50Var;
                x50Var2.d = i16;
                x50Var2.e = i16;
                x50Var2.f30487f = MessagesController.getInstance(x50Var2.E0.f30871a).roundVideoBitrate * 1024;
                x50Var2.f30507w = eglGetCurrentContext;
                synchronized (x50Var2.R) {
                    try {
                        if (!x50Var2.T) {
                            x50Var2.T = true;
                            Thread thread = new Thread(x50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!x50Var2.S) {
                                try {
                                    x50Var2.R.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            x50Var2.f30510x0.clear();
                            x50Var2.f30513z0 = 0;
                            DispatchQueue dispatchQueue = x50Var2.f30512y0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                x50Var2.f30512y0.recycle();
                            }
                            x50Var2.f30512y0 = new DispatchQueue("keyframes_thumb_queue");
                            x50Var2.Q.sendMessage(x50Var2.Q.obtainMessage(0));
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
                    y50 y50Var9 = this.E;
                    float f22 = y50Var9.f30904y0;
                    y50Var9.f30904y0 = y50Var9.f30905z0;
                    y50Var9.f30905z0 = f22;
                }
                this.f28081y = true;
                this.E.r();
            } else {
                z11 = false;
            }
            y50 y50Var10 = this.E;
            if (y50Var10.V0 != null && ((y50Var10.X0 == 0 && z4) || (this.E.X0 == 1 && z10))) {
                y50 y50Var11 = this.E;
                x50 x50Var3 = y50Var11.V0;
                SurfaceTexture surfaceTexture2 = this.f28076n[y50Var11.X0];
                y50 y50Var12 = this.E;
                if (y50Var12.m0) {
                    i14 = y50Var12.X0;
                }
                x50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f28076n[this.E.X0].getTransformMatrix(this.E.f30896t0);
            GLES20.glUseProgram(this.f28077r);
            GLES20.glActiveTexture(33984);
            y50 y50Var13 = this.E;
            GLES20.glBindTexture(36197, y50Var13.Q[y50Var13.X0]);
            GLES20.glVertexAttribPointer(this.f28079w, 3, 5126, false, 12, (Buffer) this.E.f30898v0);
            GLES20.glEnableVertexAttribArray(this.f28079w);
            GLES20.glVertexAttribPointer(this.f28080x, 2, 5126, false, 8, (Buffer) this.E.f30900w0);
            GLES20.glEnableVertexAttribArray(this.f28080x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.E.f30896t0, 0);
            GLES20.glUniformMatrix4fv(this.f28078s, 1, false, this.E.f30895s0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f28079w);
            GLES20.glDisableVertexAttribArray(this.f28080x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f28073b.eglSwapBuffers(this.f28074c, this.e);
            if (z11) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final q50 f27741b;

                    {
                        this.f27741b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f27741b.E.f30884j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                y50 y50Var82 = this.f27741b.E;
                                if (y50Var82.f30883i0 != null) {
                                    Bitmap bitmap = y50Var82.W0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        y50Var82.W0 = null;
                                    }
                                    y50Var82.W0 = y50Var82.f30883i0.getBitmap();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z4, boolean z10) {
        int i10;
        Handler handler = getHandler();
        if (handler != null) {
            int intValue = this.B.intValue();
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            sendMessage(handler.obtainMessage(0, intValue, (z4 ? 1 : 0) + i10), 0);
        }
    }

    @Override
    public final void run() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f28073b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f28074c = eglGetDisplay;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f28073b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f28073b.eglChooseConfig(this.f28074c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f28073b.eglCreateContext(this.f28074c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f28072a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f28073b.eglCreateWindowSurface(this.f28074c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f28073b.eglMakeCurrent(this.f28074c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                y50 y50Var = this.E;
                                float f10 = y50Var.f30904y0;
                                int[] iArr2 = y50Var.Q;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / y50Var.f30905z0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (y50Var.V0 == null) {
                                    y50Var.V0 = new x50(y50Var);
                                }
                                FloatBuffer k10 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(48));
                                y50Var.f30898v0 = k10;
                                k10.put(fArr).position(0);
                                FloatBuffer k11 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
                                y50Var.f30900w0 = k11;
                                k11.put(fArr2).position(0);
                                Matrix.setIdentityM(y50Var.f30896t0, 0);
                                int a2 = y50.a(y50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = y50.a(y50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f28077r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f28077r, a10);
                                    GLES20.glLinkProgram(this.f28077r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f28077r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f28077r);
                                        this.f28077r = 0;
                                    } else {
                                        this.f28079w = GLES20.glGetAttribLocation(this.f28077r, "aPosition");
                                        this.f28080x = GLES20.glGetAttribLocation(this.f28077r, "aTextureCoord");
                                        this.f28078s = GLES20.glGetUniformLocation(this.f28077r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f28077r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(y50Var.f30895s0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f28076n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z10;
                                                q50 q50Var = q50.this;
                                                int i11 = i10;
                                                boolean z11 = true;
                                                q50Var.E.O = true;
                                                if (i11 == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (i11 != 1) {
                                                    z11 = false;
                                                }
                                                q50Var.requestRender(z10, z11);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new ey(y50Var, i10, surfaceTextureArr[i10], 4));
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera gl initied");
                                    }
                                    z4 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera failed creating shader");
                                    }
                                    finish();
                                }
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.y3.u(this.f28073b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f28075f = z4;
        super.run();
    }
}
