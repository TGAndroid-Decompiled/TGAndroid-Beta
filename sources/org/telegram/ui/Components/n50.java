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
public final class n50 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final w50 H;
    public final SurfaceTexture f28613a;
    public EGL10 f28614b;
    public EGLDisplay f28615c;
    public EGLContext d;
    public EGLSurface f28616e;
    public boolean f28617f;
    public Object h;
    public final SurfaceTexture[] f28618n;
    public int f28619r;
    public int f28620s;
    public int v;
    public int f28621w;
    public int f28622x;
    public boolean f28623y;

    public n50(w50 w50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = w50Var;
        this.f28618n = new SurfaceTexture[2];
        this.E = 0;
        this.f28613a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new q50(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        w50 w50Var = this.H;
        if (w50Var.f32139i0[w50Var.f32126a1] != null) {
            w50 w50Var2 = this.H;
            int width = w50Var2.f32139i0[w50Var2.f32126a1].getWidth();
            w50 w50Var3 = this.H;
            int height = w50Var3.f32139i0[w50Var3.f32126a1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                w50 w50Var4 = this.H;
                w50Var4.B0 = 1.0f;
                w50Var4.C0 = 1.0f;
            } else if (i10 > i11) {
                w50 w50Var5 = this.H;
                w50Var5.B0 = 1.0f;
                w50Var5.C0 = i10 / this.G;
            } else {
                w50 w50Var6 = this.H;
                w50Var6.B0 = i11 / this.F;
                w50Var6.C0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.B0 + " scaleY = " + this.H.C0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f28618n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f28618n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f28618n[i10] = null;
                }
            }
        }
        this.H.R = false;
        if (this.f28616e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f28614b.eglGetCurrentContext()) || !this.f28616e.equals(this.f28614b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f28614b;
                EGLDisplay eGLDisplay = this.f28615c;
                EGLSurface eGLSurface = this.f28616e;
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
        if (this.f28616e != null) {
            EGL10 egl102 = this.f28614b;
            EGLDisplay eGLDisplay2 = this.f28615c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f28614b.eglDestroySurface(this.f28615c, this.f28616e);
            this.f28616e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f28614b.eglDestroyContext(this.f28615c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f28615c;
        if (eGLDisplay3 != null) {
            this.f28614b.eglTerminate(eGLDisplay3);
            this.f28615c = null;
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
        v50 v50Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            q50 q50Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            w50 w50Var = this.H;
                            w50Var.f32126a1 = 1 - w50Var.f32126a1;
                            c();
                            w50 w50Var2 = this.H;
                            float f7 = (1.0f / w50Var2.B0) / 2.0f;
                            float f10 = (1.0f / w50Var2.C0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            w50Var2.f32161z0 = org.telegram.messenger.wl.h(ByteBuffer.allocateDirect(32));
                            this.H.f32161z0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                        Matrix.setIdentityM(this.H.f32154v0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.f32154v0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f28614b;
                EGLDisplay eGLDisplay = this.f28615c;
                EGLSurface eGLSurface = this.f28616e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f28614b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f28618n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.f32158x0);
                    this.f28618n[0].setOnFrameAvailableListener(null);
                    this.f28618n[0].release();
                    w50 w50Var3 = this.H;
                    int[] iArr = w50Var3.U;
                    int[] iArr2 = w50Var3.T;
                    iArr[0] = iArr2[0];
                    w50Var3.V = 0.0f;
                    iArr2[0] = 0;
                    w50Var3.A0 = w50Var3.f32161z0.duplicate();
                    w50 w50Var4 = this.H;
                    w50Var4.D0 = w50Var4.f32139i0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.F = false;
                GLES20.glGenTextures(1, this.H.T, 0);
                GLES20.glBindTexture(36197, this.H.T[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f28618n[0] = new SurfaceTexture(this.H.T[0]);
                this.f28618n[0].setOnFrameAvailableListener(new uz(this, 1));
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(this.H, 0, this.f28618n[0], 7));
                c();
                w50 w50Var5 = this.H;
                float f15 = (1.0f / w50Var5.B0) / 2.0f;
                float f16 = (1.0f / w50Var5.C0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                w50Var5.f32161z0 = org.telegram.messenger.wl.h(ByteBuffer.allocateDirect(32));
                this.H.f32161z0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f28623y && ((!((z13 = (obj = message.obj) instanceof q50)) || ((q50) obj).f29592c != -2) && (v50Var = this.H.Y0) != null)) {
                int i13 = message.arg1;
                if (z13) {
                    q50Var = (q50) obj;
                }
                v50Var.i(i13, q50Var);
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
        if (this.f28617f) {
            if (!this.d.equals(this.f28614b.eglGetCurrentContext()) || !this.f28616e.equals(this.f28614b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f28614b;
                EGLDisplay eGLDisplay2 = this.f28615c;
                EGLSurface eGLSurface2 = this.f28616e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f28618n[0].updateTexImage();
            }
            if (z11) {
                this.f28618n[1].updateTexImage();
            }
            if (!this.f28623y) {
                w50 w50Var6 = this.H;
                if (w50Var6.Y0 == null) {
                    w50Var6.Y0 = new v50(w50Var6);
                }
                w50 w50Var7 = this.H;
                if (w50Var7.Y0.F0) {
                    if (!w50Var7.F) {
                        this.H.F = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final n50 f28386b;

                            {
                                this.f28386b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f28386b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        w50 w50Var8 = this.f28386b.H;
                                        if (w50Var8.f32142l0 != null) {
                                            Bitmap bitmap = w50Var8.Z0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                w50Var8.Z0 = null;
                                            }
                                            w50Var8.Z0 = w50Var8.f32142l0.getBitmap();
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
                w50 w50Var8 = this.H;
                v50 v50Var2 = w50Var8.Y0;
                i50 i50Var = w50Var8.f32125a0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (v50Var2.F0 && v50Var2.T != null && v50Var2.T.getLooper() != null && v50Var2.T.getLooper().getThread() != null && v50Var2.T.getLooper().getThread().isAlive()) {
                    v50Var2.f31125w = eglGetCurrentContext;
                    v50Var2.T.sendMessage(v50Var2.T.obtainMessage(0, 1, 0));
                }
                v50Var2.F0 = true;
                int i16 = MessagesController.getInstance(v50Var2.H0.f32124a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new r50(v50Var2, 1));
                v50Var2.f31096a = i50Var;
                v50Var2.d = i16;
                v50Var2.f31103e = i16;
                v50Var2.f31105f = MessagesController.getInstance(v50Var2.H0.f32124a).roundVideoBitrate * 1024;
                v50Var2.f31125w = eglGetCurrentContext;
                synchronized (v50Var2.U) {
                    try {
                        if (!v50Var2.W) {
                            v50Var2.W = true;
                            Thread thread = new Thread(v50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!v50Var2.V) {
                                try {
                                    v50Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            v50Var2.A0.clear();
                            v50Var2.C0 = 0;
                            DispatchQueue dispatchQueue = v50Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                v50Var2.B0.recycle();
                            }
                            v50Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            v50Var2.T.sendMessage(v50Var2.T.obtainMessage(0));
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
                    w50 w50Var9 = this.H;
                    float f21 = w50Var9.B0;
                    w50Var9.B0 = w50Var9.C0;
                    w50Var9.C0 = f21;
                }
                this.f28623y = true;
                this.H.r();
            } else {
                z12 = false;
            }
            w50 w50Var10 = this.H;
            if (w50Var10.Y0 != null && ((w50Var10.f32126a1 == 0 && z10) || (this.H.f32126a1 == 1 && z11))) {
                w50 w50Var11 = this.H;
                v50 v50Var3 = w50Var11.Y0;
                SurfaceTexture surfaceTexture2 = this.f28618n[w50Var11.f32126a1];
                w50 w50Var12 = this.H;
                if (w50Var12.f32146p0) {
                    i14 = w50Var12.f32126a1;
                }
                v50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f28618n[this.H.f32126a1].getTransformMatrix(this.H.f32156w0);
            GLES20.glUseProgram(this.f28619r);
            GLES20.glActiveTexture(33984);
            w50 w50Var13 = this.H;
            GLES20.glBindTexture(36197, w50Var13.T[w50Var13.f32126a1]);
            GLES20.glVertexAttribPointer(this.f28621w, 3, 5126, false, 12, (Buffer) this.H.f32160y0);
            GLES20.glEnableVertexAttribArray(this.f28621w);
            GLES20.glVertexAttribPointer(this.f28622x, 2, 5126, false, 8, (Buffer) this.H.f32161z0);
            GLES20.glEnableVertexAttribArray(this.f28622x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.f32156w0, 0);
            GLES20.glUniformMatrix4fv(this.f28620s, 1, false, this.H.f32154v0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f28621w);
            GLES20.glDisableVertexAttribArray(this.f28622x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f28614b.eglSwapBuffers(this.f28615c, this.f28616e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final n50 f28386b;

                    {
                        this.f28386b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f28386b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                w50 w50Var82 = this.f28386b.H;
                                if (w50Var82.f32142l0 != null) {
                                    Bitmap bitmap = w50Var82.Z0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        w50Var82.Z0 = null;
                                    }
                                    w50Var82.Z0 = w50Var82.f32142l0.getBitmap();
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
        this.f28614b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f28615c = eglGetDisplay;
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
                org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f28614b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f28614b.eglChooseConfig(this.f28615c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f28614b.eglCreateContext(this.f28615c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f28613a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f28614b.eglCreateWindowSurface(this.f28615c, eGLConfig, surfaceTexture, null);
                        this.f28616e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f28614b.eglMakeCurrent(this.f28615c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                w50 w50Var = this.H;
                                float f7 = w50Var.B0;
                                int[] iArr2 = w50Var.T;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / w50Var.C0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (w50Var.Y0 == null) {
                                    w50Var.Y0 = new v50(w50Var);
                                }
                                FloatBuffer h = org.telegram.messenger.wl.h(ByteBuffer.allocateDirect(48));
                                w50Var.f32160y0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.wl.h(ByteBuffer.allocateDirect(32));
                                w50Var.f32161z0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(w50Var.f32156w0, 0);
                                int a2 = w50.a(w50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = w50.a(w50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f28619r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f28619r, a10);
                                    GLES20.glLinkProgram(this.f28619r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f28619r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f28619r);
                                        this.f28619r = 0;
                                    } else {
                                        this.f28621w = GLES20.glGetAttribLocation(this.f28619r, "aPosition");
                                        this.f28622x = GLES20.glGetAttribLocation(this.f28619r, "aTextureCoord");
                                        this.f28620s = GLES20.glGetUniformLocation(this.f28619r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f28619r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(w50Var.f32154v0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f28618n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                n50 n50Var = n50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                n50Var.H.R = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                n50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(w50Var, i10, surfaceTextureArr[i10], 7));
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
                                org.telegram.messenger.wl.s(this.f28614b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f28617f = z10;
        super.run();
    }
}
