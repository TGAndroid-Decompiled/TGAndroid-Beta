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
    public final f60 H;
    public final SurfaceTexture f28943a;
    public EGL10 f28944b;
    public EGLDisplay f28945c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f28946f;
    public Object h;
    public final SurfaceTexture[] f28947n;
    public int f28948r;
    public int f28949s;
    public int v;
    public int f28950w;
    public int f28951x;
    public boolean f28952y;

    public x50(f60 f60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = f60Var;
        this.f28947n = new SurfaceTexture[2];
        this.E = 0;
        this.f28943a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new a60(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        f60 f60Var = this.H;
        if (f60Var.f22887i0[f60Var.f22875a1] != null) {
            f60 f60Var2 = this.H;
            int width = f60Var2.f22887i0[f60Var2.f22875a1].getWidth();
            f60 f60Var3 = this.H;
            int height = f60Var3.f22887i0[f60Var3.f22875a1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                f60 f60Var4 = this.H;
                f60Var4.B0 = 1.0f;
                f60Var4.C0 = 1.0f;
            } else if (i10 > i11) {
                f60 f60Var5 = this.H;
                f60Var5.B0 = 1.0f;
                f60Var5.C0 = i10 / this.G;
            } else {
                f60 f60Var6 = this.H;
                f60Var6.B0 = i11 / this.F;
                f60Var6.C0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.B0 + " scaleY = " + this.H.C0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f28947n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f28947n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f28947n[i10] = null;
                }
            }
        }
        this.H.R = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f28944b.eglGetCurrentContext()) || !this.e.equals(this.f28944b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f28944b;
                EGLDisplay eGLDisplay = this.f28945c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.T;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.T[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.T;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.T[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f28944b;
            EGLDisplay eGLDisplay2 = this.f28945c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f28944b.eglDestroySurface(this.f28945c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f28944b.eglDestroyContext(this.f28945c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f28945c;
        if (eGLDisplay3 != null) {
            this.f28944b.eglTerminate(eGLDisplay3);
            this.f28945c = null;
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
        e60 e60Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            a60 a60Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f60 f60Var = this.H;
                            f60Var.f22875a1 = 1 - f60Var.f22875a1;
                            c();
                            f60 f60Var2 = this.H;
                            float f7 = (1.0f / f60Var2.B0) / 2.0f;
                            float f10 = (1.0f / f60Var2.C0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            f60Var2.f22909z0 = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(32));
                            this.H.f22909z0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                        Matrix.setIdentityM(this.H.f22902v0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.f22902v0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f28944b;
                EGLDisplay eGLDisplay = this.f28945c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f28944b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f28947n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.f22906x0);
                    this.f28947n[0].setOnFrameAvailableListener(null);
                    this.f28947n[0].release();
                    f60 f60Var3 = this.H;
                    int[] iArr = f60Var3.U;
                    int[] iArr2 = f60Var3.T;
                    iArr[0] = iArr2[0];
                    f60Var3.V = 0.0f;
                    iArr2[0] = 0;
                    f60Var3.A0 = f60Var3.f22909z0.duplicate();
                    f60 f60Var4 = this.H;
                    f60Var4.D0 = f60Var4.f22887i0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.F = false;
                GLES20.glGenTextures(1, this.H.T, 0);
                GLES20.glBindTexture(36197, this.H.T[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f28947n[0] = new SurfaceTexture(this.H.T[0]);
                this.f28947n[0].setOnFrameAvailableListener(new b00(this, 1));
                AndroidUtilities.runOnUIThread(new my(this.H, 0, this.f28947n[0], 4));
                c();
                f60 f60Var5 = this.H;
                float f15 = (1.0f / f60Var5.B0) / 2.0f;
                float f16 = (1.0f / f60Var5.C0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                f60Var5.f22909z0 = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(32));
                this.H.f22909z0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f28952y && ((!((z13 = (obj = message.obj) instanceof a60)) || ((a60) obj).f21394c != -2) && (e60Var = this.H.Y0) != null)) {
                int i13 = message.arg1;
                if (z13) {
                    a60Var = (a60) obj;
                }
                e60Var.i(i13, a60Var);
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
        if (this.f28946f) {
            if (!this.d.equals(this.f28944b.eglGetCurrentContext()) || !this.e.equals(this.f28944b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f28944b;
                EGLDisplay eGLDisplay2 = this.f28945c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.em.s(this.f28944b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f28947n[0].updateTexImage();
            }
            if (z11) {
                this.f28947n[1].updateTexImage();
            }
            if (!this.f28952y) {
                f60 f60Var6 = this.H;
                if (f60Var6.Y0 == null) {
                    f60Var6.Y0 = new e60(f60Var6);
                }
                f60 f60Var7 = this.H;
                if (f60Var7.Y0.F0) {
                    if (!f60Var7.F) {
                        this.H.F = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final x50 f28664b;

                            {
                                this.f28664b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f28664b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        f60 f60Var8 = this.f28664b.H;
                                        if (f60Var8.f22890l0 != null) {
                                            Bitmap bitmap = f60Var8.Z0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                f60Var8.Z0 = null;
                                            }
                                            f60Var8.Z0 = f60Var8.f22890l0.getBitmap();
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
                e60 e60Var2 = f60Var8.Y0;
                s50 s50Var = f60Var8.f22874a0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (e60Var2.F0 && e60Var2.T != null && e60Var2.T.getLooper() != null && e60Var2.T.getLooper().getThread() != null && e60Var2.T.getLooper().getThread().isAlive()) {
                    e60Var2.f22596w = eglGetCurrentContext;
                    e60Var2.T.sendMessage(e60Var2.T.obtainMessage(0, 1, 0));
                }
                e60Var2.F0 = true;
                int i16 = MessagesController.getInstance(e60Var2.H0.f22873a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new b60(e60Var2, 1));
                e60Var2.f22568a = s50Var;
                e60Var2.d = i16;
                e60Var2.e = i16;
                e60Var2.f22576f = MessagesController.getInstance(e60Var2.H0.f22873a).roundVideoBitrate * 1024;
                e60Var2.f22596w = eglGetCurrentContext;
                synchronized (e60Var2.U) {
                    try {
                        if (!e60Var2.W) {
                            e60Var2.W = true;
                            Thread thread = new Thread(e60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!e60Var2.V) {
                                try {
                                    e60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            e60Var2.A0.clear();
                            e60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = e60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                e60Var2.B0.recycle();
                            }
                            e60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            e60Var2.T.sendMessage(e60Var2.T.obtainMessage(0));
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
                    float f21 = f60Var9.B0;
                    f60Var9.B0 = f60Var9.C0;
                    f60Var9.C0 = f21;
                }
                this.f28952y = true;
                this.H.r();
            } else {
                z12 = false;
            }
            f60 f60Var10 = this.H;
            if (f60Var10.Y0 != null && ((f60Var10.f22875a1 == 0 && z10) || (this.H.f22875a1 == 1 && z11))) {
                f60 f60Var11 = this.H;
                e60 e60Var3 = f60Var11.Y0;
                SurfaceTexture surfaceTexture2 = this.f28947n[f60Var11.f22875a1];
                f60 f60Var12 = this.H;
                if (f60Var12.f22894p0) {
                    i14 = f60Var12.f22875a1;
                }
                e60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f28947n[this.H.f22875a1].getTransformMatrix(this.H.f22904w0);
            GLES20.glUseProgram(this.f28948r);
            GLES20.glActiveTexture(33984);
            f60 f60Var13 = this.H;
            GLES20.glBindTexture(36197, f60Var13.T[f60Var13.f22875a1]);
            GLES20.glVertexAttribPointer(this.f28950w, 3, 5126, false, 12, (Buffer) this.H.f22908y0);
            GLES20.glEnableVertexAttribArray(this.f28950w);
            GLES20.glVertexAttribPointer(this.f28951x, 2, 5126, false, 8, (Buffer) this.H.f22909z0);
            GLES20.glEnableVertexAttribArray(this.f28951x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.f22904w0, 0);
            GLES20.glUniformMatrix4fv(this.f28949s, 1, false, this.H.f22902v0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f28950w);
            GLES20.glDisableVertexAttribArray(this.f28951x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f28944b.eglSwapBuffers(this.f28945c, this.e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final x50 f28664b;

                    {
                        this.f28664b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f28664b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                f60 f60Var82 = this.f28664b.H;
                                if (f60Var82.f22890l0 != null) {
                                    Bitmap bitmap = f60Var82.Z0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        f60Var82.Z0 = null;
                                    }
                                    f60Var82.Z0 = f60Var82.f22890l0.getBitmap();
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
        this.f28944b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f28945c = eglGetDisplay;
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
                org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f28944b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f28944b.eglChooseConfig(this.f28945c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f28944b.eglCreateContext(this.f28945c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f28943a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f28944b.eglCreateWindowSurface(this.f28945c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f28944b.eglMakeCurrent(this.f28945c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                f60 f60Var = this.H;
                                float f7 = f60Var.B0;
                                int[] iArr2 = f60Var.T;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / f60Var.C0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (f60Var.Y0 == null) {
                                    f60Var.Y0 = new e60(f60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(48));
                                f60Var.f22908y0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.em.h(ByteBuffer.allocateDirect(32));
                                f60Var.f22909z0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(f60Var.f22904w0, 0);
                                int a2 = f60.a(f60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = f60.a(f60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f28948r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f28948r, a10);
                                    GLES20.glLinkProgram(this.f28948r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f28948r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f28948r);
                                        this.f28948r = 0;
                                    } else {
                                        this.f28950w = GLES20.glGetAttribLocation(this.f28948r, "aPosition");
                                        this.f28951x = GLES20.glGetAttribLocation(this.f28948r, "aTextureCoord");
                                        this.f28949s = GLES20.glGetUniformLocation(this.f28948r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f28948r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(f60Var.f22902v0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f28947n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                x50 x50Var = x50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                x50Var.H.R = true;
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
                                        AndroidUtilities.runOnUIThread(new my(f60Var, i10, surfaceTextureArr[i10], 4));
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
                                org.telegram.messenger.em.s(this.f28944b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f28946f = z10;
        super.run();
    }
}
