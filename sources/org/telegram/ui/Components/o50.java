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
public final class o50 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final d60 H;
    public final SurfaceTexture f26948a;
    public EGL10 f26949b;
    public EGLDisplay f26950c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f26951f;
    public Object h;
    public final SurfaceTexture[] f26952n;
    public int f26953r;
    public int f26954s;
    public int v;
    public int f26955w;
    public int f26956x;
    public boolean f26957y;

    public o50(d60 d60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = d60Var;
        this.f26952n = new SurfaceTexture[2];
        this.E = 0;
        this.f26948a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new r50(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        d60 d60Var = this.H;
        if (d60Var.f23570n0[d60Var.f23561f1] != null) {
            d60 d60Var2 = this.H;
            int width = d60Var2.f23570n0[d60Var2.f23561f1].getWidth();
            d60 d60Var3 = this.H;
            int height = d60Var3.f23570n0[d60Var3.f23561f1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                d60 d60Var4 = this.H;
                d60Var4.G0 = 1.0f;
                d60Var4.H0 = 1.0f;
            } else if (i10 > i11) {
                d60 d60Var5 = this.H;
                d60Var5.G0 = 1.0f;
                d60Var5.H0 = i10 / this.G;
            } else {
                d60 d60Var6 = this.H;
                d60Var6.G0 = i11 / this.F;
                d60Var6.H0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.G0 + " scaleY = " + this.H.H0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f26952n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f26952n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f26952n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f26949b.eglGetCurrentContext()) || !this.e.equals(this.f26949b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26949b;
                EGLDisplay eGLDisplay = this.f26950c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f23551b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f23551b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f23551b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f23551b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f26949b;
            EGLDisplay eGLDisplay2 = this.f26950c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f26949b.eglDestroySurface(this.f26950c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f26949b.eglDestroyContext(this.f26950c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f26950c;
        if (eGLDisplay3 != null) {
            this.f26949b.eglTerminate(eGLDisplay3);
            this.f26950c = null;
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
        w50 w50Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            r50 r50Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            d60 d60Var = this.H;
                            d60Var.f23561f1 = 1 - d60Var.f23561f1;
                            c();
                            d60 d60Var2 = this.H;
                            float f7 = (1.0f / d60Var2.G0) / 2.0f;
                            float f10 = (1.0f / d60Var2.H0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            d60Var2.E0 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
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
                EGL10 egl10 = this.f26949b;
                EGLDisplay eGLDisplay = this.f26950c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f26949b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f26952n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.C0);
                    this.f26952n[0].setOnFrameAvailableListener(null);
                    this.f26952n[0].release();
                    d60 d60Var3 = this.H;
                    int[] iArr = d60Var3.f23553c0;
                    int[] iArr2 = d60Var3.f23551b0;
                    iArr[0] = iArr2[0];
                    d60Var3.f23555d0 = 0.0f;
                    iArr2[0] = 0;
                    d60Var3.F0 = d60Var3.E0.duplicate();
                    d60 d60Var4 = this.H;
                    d60Var4.I0 = d60Var4.f23570n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f23551b0, 0);
                GLES20.glBindTexture(36197, this.H.f23551b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f26952n[0] = new SurfaceTexture(this.H.f23551b0[0]);
                this.f26952n[0].setOnFrameAvailableListener(new wz(this, 1));
                AndroidUtilities.runOnUIThread(new ym(this.H, 0, this.f26952n[0], 6));
                c();
                d60 d60Var5 = this.H;
                float f15 = (1.0f / d60Var5.G0) / 2.0f;
                float f16 = (1.0f / d60Var5.H0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                d60Var5.E0 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
                this.H.E0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f26957y && ((!((z13 = (obj = message.obj) instanceof r50)) || ((r50) obj).f27832c != -2) && (w50Var = this.H.f23556d1) != null)) {
                int i13 = message.arg1;
                if (z13) {
                    r50Var = (r50) obj;
                }
                w50Var.i(i13, r50Var);
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
        if (this.f26951f) {
            if (!this.d.equals(this.f26949b.eglGetCurrentContext()) || !this.e.equals(this.f26949b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f26949b;
                EGLDisplay eGLDisplay2 = this.f26950c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f26952n[0].updateTexImage();
            }
            if (z11) {
                this.f26952n[1].updateTexImage();
            }
            if (!this.f26957y) {
                d60 d60Var6 = this.H;
                if (d60Var6.f23556d1 == null) {
                    d60Var6.f23556d1 = new w50(d60Var6);
                }
                d60 d60Var7 = this.H;
                if (d60Var7.f23556d1.F0) {
                    if (!d60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final o50 f26673b;

                            {
                                this.f26673b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f26673b.H.f23575r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        d60 d60Var8 = this.f26673b.H;
                                        if (d60Var8.f23573q0 != null) {
                                            Bitmap bitmap = d60Var8.f23558e1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                d60Var8.f23558e1 = null;
                                            }
                                            d60Var8.f23558e1 = d60Var8.f23573q0.getBitmap();
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
                d60 d60Var8 = this.H;
                w50 w50Var2 = d60Var8.f23556d1;
                k50 k50Var = d60Var8.f23560f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (w50Var2.F0 && w50Var2.T != null && w50Var2.T.getLooper() != null && w50Var2.T.getLooper().getThread() != null && w50Var2.T.getLooper().getThread().isAlive()) {
                    w50Var2.f29882w = eglGetCurrentContext;
                    w50Var2.T.sendMessage(w50Var2.T.obtainMessage(0, 1, 0));
                }
                w50Var2.F0 = true;
                int i16 = MessagesController.getInstance(w50Var2.H0.f23559f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new th(7));
                w50Var2.f29854a = k50Var;
                w50Var2.d = i16;
                w50Var2.e = i16;
                w50Var2.f29862f = MessagesController.getInstance(w50Var2.H0.f23559f).roundVideoBitrate * 1024;
                w50Var2.f29882w = eglGetCurrentContext;
                synchronized (w50Var2.U) {
                    try {
                        if (!w50Var2.W) {
                            w50Var2.W = true;
                            Thread thread = new Thread(w50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!w50Var2.V) {
                                try {
                                    w50Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            w50Var2.A0.clear();
                            w50Var2.C0 = 0;
                            DispatchQueue dispatchQueue = w50Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                w50Var2.B0.recycle();
                            }
                            w50Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            w50Var2.T.sendMessage(w50Var2.T.obtainMessage(0));
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
                    d60 d60Var9 = this.H;
                    float f21 = d60Var9.G0;
                    d60Var9.G0 = d60Var9.H0;
                    d60Var9.H0 = f21;
                }
                this.f26957y = true;
                this.H.u();
            } else {
                z12 = false;
            }
            d60 d60Var10 = this.H;
            if (d60Var10.f23556d1 != null && ((d60Var10.f23561f1 == 0 && z10) || (this.H.f23561f1 == 1 && z11))) {
                d60 d60Var11 = this.H;
                w50 w50Var3 = d60Var11.f23556d1;
                SurfaceTexture surfaceTexture2 = this.f26952n[d60Var11.f23561f1];
                d60 d60Var12 = this.H;
                if (d60Var12.f23579u0) {
                    i14 = d60Var12.f23561f1;
                }
                w50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f26952n[this.H.f23561f1].getTransformMatrix(this.H.B0);
            GLES20.glUseProgram(this.f26953r);
            GLES20.glActiveTexture(33984);
            d60 d60Var13 = this.H;
            GLES20.glBindTexture(36197, d60Var13.f23551b0[d60Var13.f23561f1]);
            GLES20.glVertexAttribPointer(this.f26955w, 3, 5126, false, 12, (Buffer) this.H.D0);
            GLES20.glEnableVertexAttribArray(this.f26955w);
            GLES20.glVertexAttribPointer(this.f26956x, 2, 5126, false, 8, (Buffer) this.H.E0);
            GLES20.glEnableVertexAttribArray(this.f26956x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.B0, 0);
            GLES20.glUniformMatrix4fv(this.f26954s, 1, false, this.H.A0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f26955w);
            GLES20.glDisableVertexAttribArray(this.f26956x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f26949b.eglSwapBuffers(this.f26950c, this.e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final o50 f26673b;

                    {
                        this.f26673b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f26673b.H.f23575r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                d60 d60Var82 = this.f26673b.H;
                                if (d60Var82.f23573q0 != null) {
                                    Bitmap bitmap = d60Var82.f23558e1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        d60Var82.f23558e1 = null;
                                    }
                                    d60Var82.f23558e1 = d60Var82.f23573q0.getBitmap();
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
        this.f26949b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26950c = eglGetDisplay;
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
                org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f26949b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26949b.eglChooseConfig(this.f26950c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f26949b.eglCreateContext(this.f26950c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f26948a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f26949b.eglCreateWindowSurface(this.f26950c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f26949b.eglMakeCurrent(this.f26950c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                d60 d60Var = this.H;
                                float f7 = d60Var.G0;
                                int[] iArr2 = d60Var.f23551b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / d60Var.H0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (d60Var.f23556d1 == null) {
                                    d60Var.f23556d1 = new w50(d60Var);
                                }
                                FloatBuffer i10 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(48));
                                d60Var.D0 = i10;
                                i10.put(fArr).position(0);
                                FloatBuffer i11 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
                                d60Var.E0 = i11;
                                i11.put(fArr2).position(0);
                                Matrix.setIdentityM(d60Var.B0, 0);
                                int j3 = d60.j(d60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j10 = d60.j(d60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j3 != 0 && j10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f26953r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j3);
                                    GLES20.glAttachShader(this.f26953r, j10);
                                    GLES20.glLinkProgram(this.f26953r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f26953r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f26953r);
                                        this.f26953r = 0;
                                    } else {
                                        this.f26955w = GLES20.glGetAttribLocation(this.f26953r, "aPosition");
                                        this.f26956x = GLES20.glGetAttribLocation(this.f26953r, "aTextureCoord");
                                        this.f26954s = GLES20.glGetUniformLocation(this.f26953r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f26953r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(d60Var.A0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i12 = 0; i12 < 2; i12++) {
                                        GLES20.glBindTexture(36197, iArr2[i12]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i12]);
                                        SurfaceTexture[] surfaceTextureArr = this.f26952n;
                                        surfaceTextureArr[i12] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                o50 o50Var = o50.this;
                                                int i13 = i12;
                                                boolean z12 = true;
                                                o50Var.H.W = true;
                                                if (i13 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i13 != 1) {
                                                    z12 = false;
                                                }
                                                o50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new ym(d60Var, i12, surfaceTextureArr[i12], 6));
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
                                org.telegram.messenger.ok.u(this.f26949b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f26951f = z10;
        super.run();
    }
}
