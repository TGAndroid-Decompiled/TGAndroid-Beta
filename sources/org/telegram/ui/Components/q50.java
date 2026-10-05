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
    public Integer E;
    public int F;
    public int G;
    public final f60 H;
    public final SurfaceTexture f29941a;
    public EGL10 f29942b;
    public EGLDisplay f29943c;
    public EGLContext d;
    public EGLSurface f29944e;
    public boolean f29945f;
    public Object h;
    public final SurfaceTexture[] f29946n;
    public int f29947r;
    public int f29948s;
    public int v;
    public int f29949w;
    public int f29950x;
    public boolean f29951y;

    public q50(f60 f60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = f60Var;
        this.f29946n = new SurfaceTexture[2];
        this.E = 0;
        this.f29941a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new t50(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        f60 f60Var = this.H;
        if (f60Var.f26372n0[f60Var.f26363f1] != null) {
            f60 f60Var2 = this.H;
            int width = f60Var2.f26372n0[f60Var2.f26363f1].getWidth();
            f60 f60Var3 = this.H;
            int height = f60Var3.f26372n0[f60Var3.f26363f1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                f60 f60Var4 = this.H;
                f60Var4.G0 = 1.0f;
                f60Var4.H0 = 1.0f;
            } else if (i10 > i11) {
                f60 f60Var5 = this.H;
                f60Var5.G0 = 1.0f;
                f60Var5.H0 = i10 / this.G;
            } else {
                f60 f60Var6 = this.H;
                f60Var6.G0 = i11 / this.F;
                f60Var6.H0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.G0 + " scaleY = " + this.H.H0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f29946n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f29946n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f29946n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.f29944e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f29942b.eglGetCurrentContext()) || !this.f29944e.equals(this.f29942b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f29942b;
                EGLDisplay eGLDisplay = this.f29943c;
                EGLSurface eGLSurface = this.f29944e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f26353b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f26353b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f26353b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f26353b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f29944e != null) {
            EGL10 egl102 = this.f29942b;
            EGLDisplay eGLDisplay2 = this.f29943c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f29942b.eglDestroySurface(this.f29943c, this.f29944e);
            this.f29944e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f29942b.eglDestroyContext(this.f29943c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f29943c;
        if (eGLDisplay3 != null) {
            this.f29942b.eglTerminate(eGLDisplay3);
            this.f29943c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj;
        boolean z13;
        y50 y50Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            t50 t50Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f60 f60Var = this.H;
                            f60Var.f26363f1 = 1 - f60Var.f26363f1;
                            c();
                            f60 f60Var2 = this.H;
                            float f7 = (1.0f / f60Var2.G0) / 2.0f;
                            float f10 = (1.0f / f60Var2.H0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            f60Var2.E0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                            this.H.E0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                        Matrix.setIdentityM(this.H.A0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.A0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f29942b;
                EGLDisplay eGLDisplay = this.f29943c;
                EGLSurface eGLSurface = this.f29944e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f29942b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f29946n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.C0);
                    this.f29946n[0].setOnFrameAvailableListener(null);
                    this.f29946n[0].release();
                    f60 f60Var3 = this.H;
                    int[] iArr = f60Var3.f26355c0;
                    int[] iArr2 = f60Var3.f26353b0;
                    iArr[0] = iArr2[0];
                    f60Var3.f26357d0 = 0.0f;
                    iArr2[0] = 0;
                    f60Var3.F0 = f60Var3.E0.duplicate();
                    f60 f60Var4 = this.H;
                    f60Var4.I0 = f60Var4.f26372n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f26353b0, 0);
                GLES20.glBindTexture(36197, this.H.f26353b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f29946n[0] = new SurfaceTexture(this.H.f26353b0[0]);
                this.f29946n[0].setOnFrameAvailableListener(new xz(this, 1));
                AndroidUtilities.runOnUIThread(new zm(this.H, 0, this.f29946n[0], 6));
                c();
                f60 f60Var5 = this.H;
                float f15 = (1.0f / f60Var5.G0) / 2.0f;
                float f16 = (1.0f / f60Var5.H0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                f60Var5.E0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                this.H.E0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f29951y && ((!((z13 = (obj = message.obj) instanceof t50)) || ((t50) obj).f31063c != -2) && (y50Var = this.H.f26358d1) != null)) {
                int i13 = message.arg1;
                if (z13) {
                    t50Var = (t50) obj;
                }
                y50Var.i(i13, t50Var);
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
        if (this.f29945f) {
            if (!this.d.equals(this.f29942b.eglGetCurrentContext()) || !this.f29944e.equals(this.f29942b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f29942b;
                EGLDisplay eGLDisplay2 = this.f29943c;
                EGLSurface eGLSurface2 = this.f29944e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f29946n[0].updateTexImage();
            }
            if (z11) {
                this.f29946n[1].updateTexImage();
            }
            if (!this.f29951y) {
                f60 f60Var6 = this.H;
                if (f60Var6.f26358d1 == null) {
                    f60Var6.f26358d1 = new y50(f60Var6);
                }
                f60 f60Var7 = this.H;
                if (f60Var7.f26358d1.F0) {
                    if (!f60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final q50 f29596b;

                            {
                                this.f29596b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f29596b.H.f26377r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        f60 f60Var8 = this.f29596b.H;
                                        if (f60Var8.f26375q0 != null) {
                                            Bitmap bitmap = f60Var8.f26360e1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                f60Var8.f26360e1 = null;
                                            }
                                            f60Var8.f26360e1 = f60Var8.f26375q0.getBitmap();
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
                f60 f60Var8 = this.H;
                y50 y50Var2 = f60Var8.f26358d1;
                m50 m50Var = f60Var8.f26362f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (y50Var2.F0 && y50Var2.T != null && y50Var2.T.getLooper() != null && y50Var2.T.getLooper().getThread() != null && y50Var2.T.getLooper().getThread().isAlive()) {
                    y50Var2.f33214w = eglGetCurrentContext;
                    y50Var2.T.sendMessage(y50Var2.T.obtainMessage(0, 1, 0));
                }
                y50Var2.F0 = true;
                int i16 = MessagesController.getInstance(y50Var2.H0.f26361f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new uh(7));
                y50Var2.f33185a = m50Var;
                y50Var2.d = i16;
                y50Var2.f33192e = i16;
                y50Var2.f33194f = MessagesController.getInstance(y50Var2.H0.f26361f).roundVideoBitrate * 1024;
                y50Var2.f33214w = eglGetCurrentContext;
                synchronized (y50Var2.U) {
                    try {
                        if (!y50Var2.W) {
                            y50Var2.W = true;
                            Thread thread = new Thread(y50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!y50Var2.V) {
                                try {
                                    y50Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            y50Var2.A0.clear();
                            y50Var2.C0 = 0;
                            DispatchQueue dispatchQueue = y50Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                y50Var2.B0.recycle();
                            }
                            y50Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            y50Var2.T.sendMessage(y50Var2.T.obtainMessage(0));
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
                    f60 f60Var9 = this.H;
                    float f21 = f60Var9.G0;
                    f60Var9.G0 = f60Var9.H0;
                    f60Var9.H0 = f21;
                }
                this.f29951y = true;
                this.H.u();
            } else {
                z12 = false;
            }
            f60 f60Var10 = this.H;
            if (f60Var10.f26358d1 != null && ((f60Var10.f26363f1 == 0 && z10) || (this.H.f26363f1 == 1 && z11))) {
                f60 f60Var11 = this.H;
                y50 y50Var3 = f60Var11.f26358d1;
                SurfaceTexture surfaceTexture2 = this.f29946n[f60Var11.f26363f1];
                f60 f60Var12 = this.H;
                if (f60Var12.f26381u0) {
                    i14 = f60Var12.f26363f1;
                }
                y50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f29946n[this.H.f26363f1].getTransformMatrix(this.H.B0);
            GLES20.glUseProgram(this.f29947r);
            GLES20.glActiveTexture(33984);
            f60 f60Var13 = this.H;
            GLES20.glBindTexture(36197, f60Var13.f26353b0[f60Var13.f26363f1]);
            GLES20.glVertexAttribPointer(this.f29949w, 3, 5126, false, 12, (Buffer) this.H.D0);
            GLES20.glEnableVertexAttribArray(this.f29949w);
            GLES20.glVertexAttribPointer(this.f29950x, 2, 5126, false, 8, (Buffer) this.H.E0);
            GLES20.glEnableVertexAttribArray(this.f29950x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.B0, 0);
            GLES20.glUniformMatrix4fv(this.f29948s, 1, false, this.H.A0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f29949w);
            GLES20.glDisableVertexAttribArray(this.f29950x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f29942b.eglSwapBuffers(this.f29943c, this.f29944e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final q50 f29596b;

                    {
                        this.f29596b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f29596b.H.f26377r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                f60 f60Var82 = this.f29596b.H;
                                if (f60Var82.f26375q0 != null) {
                                    Bitmap bitmap = f60Var82.f26360e1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        f60Var82.f26360e1 = null;
                                    }
                                    f60Var82.f26360e1 = f60Var82.f26375q0.getBitmap();
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
        this.f29942b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f29943c = eglGetDisplay;
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
                org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f29942b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f29942b.eglChooseConfig(this.f29943c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f29942b.eglCreateContext(this.f29943c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f29941a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f29942b.eglCreateWindowSurface(this.f29943c, eGLConfig, surfaceTexture, null);
                        this.f29944e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f29942b.eglMakeCurrent(this.f29943c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                f60 f60Var = this.H;
                                float f7 = f60Var.G0;
                                int[] iArr2 = f60Var.f26353b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / f60Var.H0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (f60Var.f26358d1 == null) {
                                    f60Var.f26358d1 = new y50(f60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(48));
                                f60Var.D0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                                f60Var.E0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(f60Var.B0, 0);
                                int j3 = f60.j(f60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j10 = f60.j(f60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j3 != 0 && j10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f29947r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j3);
                                    GLES20.glAttachShader(this.f29947r, j10);
                                    GLES20.glLinkProgram(this.f29947r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f29947r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f29947r);
                                        this.f29947r = 0;
                                    } else {
                                        this.f29949w = GLES20.glGetAttribLocation(this.f29947r, "aPosition");
                                        this.f29950x = GLES20.glGetAttribLocation(this.f29947r, "aTextureCoord");
                                        this.f29948s = GLES20.glGetUniformLocation(this.f29947r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f29947r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(f60Var.A0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f29946n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                q50 q50Var = q50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                q50Var.H.W = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                q50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new zm(f60Var, i10, surfaceTextureArr[i10], 6));
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
                                org.telegram.messenger.bi.t(this.f29942b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f29945f = z10;
        super.run();
    }
}
