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
public final class k50 extends DispatchQueue {
    public Integer A;
    public int B;
    public int C;
    public final s50 D;
    public final SurfaceTexture f29925a;
    public EGL10 f29926b;
    public EGLDisplay f29927c;
    public EGLContext d;
    public EGLSurface f29928e;
    public boolean f29929f;
    public Object h;
    public final SurfaceTexture[] f29930n;
    public int f29931r;
    public int f29932s;
    public int v;
    public int f29933w;
    public int f29934x;
    public boolean f29935y;

    public k50(s50 s50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.D = s50Var;
        this.f29930n = new SurfaceTexture[2];
        this.A = 0;
        this.f29925a = surfaceTexture;
        this.B = i10;
        this.C = i11;
    }

    public final void b(long j10, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new n50(j10, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        s50 s50Var = this.D;
        if (s50Var.f32501e0[s50Var.W0] != null) {
            s50 s50Var2 = this.D;
            int width = s50Var2.f32501e0[s50Var2.W0].getWidth();
            s50 s50Var3 = this.D;
            int height = s50Var3.f32501e0[s50Var3.W0].getHeight();
            float min = this.B / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                s50 s50Var4 = this.D;
                s50Var4.f32525x0 = 1.0f;
                s50Var4.f32527y0 = 1.0f;
            } else if (i10 > i11) {
                s50 s50Var5 = this.D;
                s50Var5.f32525x0 = 1.0f;
                s50Var5.f32527y0 = i10 / this.C;
            } else {
                s50 s50Var6 = this.D;
                s50Var6.f32525x0 = i11 / this.B;
                s50Var6.f32527y0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.D.f32525x0 + " scaleY = " + this.D.f32527y0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f29930n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f29930n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f29930n[i10] = null;
                }
            }
        }
        this.D.N = false;
        if (this.f29928e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f29926b.eglGetCurrentContext()) || !this.f29928e.equals(this.f29926b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f29926b;
                EGLDisplay eGLDisplay = this.f29927c;
                EGLSurface eGLSurface = this.f29928e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.D.P;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.D.P[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.D.P;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.D.P[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f29928e != null) {
            EGL10 egl102 = this.f29926b;
            EGLDisplay eGLDisplay2 = this.f29927c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f29926b.eglDestroySurface(this.f29927c, this.f29928e);
            this.f29928e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f29926b.eglDestroyContext(this.f29927c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f29927c;
        if (eGLDisplay3 != null) {
            this.f29926b.eglTerminate(eGLDisplay3);
            this.f29927c = null;
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
        r50 r50Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            n50 n50Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            s50 s50Var = this.D;
                            s50Var.W0 = 1 - s50Var.W0;
                            c();
                            s50 s50Var2 = this.D;
                            float f9 = (1.0f / s50Var2.f32525x0) / 2.0f;
                            float f10 = (1.0f / s50Var2.f32527y0) / 2.0f;
                            float f11 = 0.5f - f9;
                            float f12 = 0.5f - f10;
                            float f13 = f9 + 0.5f;
                            float f14 = f10 + 0.5f;
                            s50Var2.f32521v0 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
                            this.D.f32521v0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                        Matrix.setIdentityM(this.D.f32516r0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.D.f32516r0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f29926b;
                EGLDisplay eGLDisplay = this.f29927c;
                EGLSurface eGLSurface = this.f29928e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f29926b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f29930n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.D.f32519t0);
                    this.f29930n[0].setOnFrameAvailableListener(null);
                    this.f29930n[0].release();
                    s50 s50Var3 = this.D;
                    int[] iArr = s50Var3.Q;
                    int[] iArr2 = s50Var3.P;
                    iArr[0] = iArr2[0];
                    s50Var3.R = 0.0f;
                    iArr2[0] = 0;
                    s50Var3.f32523w0 = s50Var3.f32521v0.duplicate();
                    s50 s50Var4 = this.D;
                    s50Var4.f32528z0 = s50Var4.f32501e0[0];
                }
                this.A = Integer.valueOf(this.A.intValue() + 1);
                this.D.B = false;
                GLES20.glGenTextures(1, this.D.P, 0);
                GLES20.glBindTexture(36197, this.D.P[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f29930n[0] = new SurfaceTexture(this.D.P[0]);
                this.f29930n[0].setOnFrameAvailableListener(new pz(this, 1));
                AndroidUtilities.runOnUIThread(new rm(this.D, 0, this.f29930n[0], 6));
                c();
                s50 s50Var5 = this.D;
                float f15 = (1.0f / s50Var5.f32525x0) / 2.0f;
                float f16 = (1.0f / s50Var5.f32527y0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                s50Var5.f32521v0 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
                this.D.f32521v0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f29935y && ((!((z13 = (obj = message.obj) instanceof n50)) || ((n50) obj).f30858c != -2) && (r50Var = this.D.U0) != null)) {
                int i13 = message.arg1;
                if (z13) {
                    n50Var = (n50) obj;
                }
                r50Var.i(i13, n50Var);
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
        if (this.f29929f) {
            if (!this.d.equals(this.f29926b.eglGetCurrentContext()) || !this.f29928e.equals(this.f29926b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f29926b;
                EGLDisplay eGLDisplay2 = this.f29927c;
                EGLSurface eGLSurface2 = this.f29928e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f29930n[0].updateTexImage();
            }
            if (z11) {
                this.f29930n[1].updateTexImage();
            }
            if (!this.f29935y) {
                s50 s50Var6 = this.D;
                if (s50Var6.U0 == null) {
                    s50Var6.U0 = new r50(s50Var6);
                }
                s50 s50Var7 = this.D;
                if (s50Var7.U0.B0) {
                    if (!s50Var7.B) {
                        this.D.B = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final k50 f29555b;

                            {
                                this.f29555b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f29555b.D.f32506i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        s50 s50Var8 = this.f29555b.D;
                                        if (s50Var8.f32505h0 != null) {
                                            Bitmap bitmap = s50Var8.V0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                s50Var8.V0 = null;
                                            }
                                            s50Var8.V0 = s50Var8.f32505h0.getBitmap();
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
                s50 s50Var8 = this.D;
                r50 r50Var2 = s50Var8.U0;
                g50 g50Var = s50Var8.T;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (r50Var2.B0 && r50Var2.P != null && r50Var2.P.getLooper() != null && r50Var2.P.getLooper().getThread() != null && r50Var2.P.getLooper().getThread().isAlive()) {
                    r50Var2.f32213w = eglGetCurrentContext;
                    r50Var2.P.sendMessage(r50Var2.P.obtainMessage(0, 1, 0));
                }
                r50Var2.B0 = true;
                int i16 = MessagesController.getInstance(r50Var2.D0.f32493a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new o50(r50Var2, 1));
                r50Var2.f32184a = g50Var;
                r50Var2.d = i16;
                r50Var2.f32191e = i16;
                r50Var2.f32193f = MessagesController.getInstance(r50Var2.D0.f32493a).roundVideoBitrate * 1024;
                r50Var2.f32213w = eglGetCurrentContext;
                synchronized (r50Var2.Q) {
                    try {
                        if (!r50Var2.S) {
                            r50Var2.S = true;
                            Thread thread = new Thread(r50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!r50Var2.R) {
                                try {
                                    r50Var2.Q.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            r50Var2.f32214w0.clear();
                            r50Var2.f32218y0 = 0;
                            DispatchQueue dispatchQueue = r50Var2.f32216x0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                r50Var2.f32216x0.recycle();
                            }
                            r50Var2.f32216x0 = new DispatchQueue("keyframes_thumb_queue");
                            r50Var2.P.sendMessage(r50Var2.P.obtainMessage(0));
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
                    s50 s50Var9 = this.D;
                    float f21 = s50Var9.f32525x0;
                    s50Var9.f32525x0 = s50Var9.f32527y0;
                    s50Var9.f32527y0 = f21;
                }
                this.f29935y = true;
                this.D.r();
            } else {
                z12 = false;
            }
            s50 s50Var10 = this.D;
            if (s50Var10.U0 != null && ((s50Var10.W0 == 0 && z10) || (this.D.W0 == 1 && z11))) {
                s50 s50Var11 = this.D;
                r50 r50Var3 = s50Var11.U0;
                SurfaceTexture surfaceTexture2 = this.f29930n[s50Var11.W0];
                s50 s50Var12 = this.D;
                if (s50Var12.f32509l0) {
                    i14 = s50Var12.W0;
                }
                r50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f29930n[this.D.W0].getTransformMatrix(this.D.f32518s0);
            GLES20.glUseProgram(this.f29931r);
            GLES20.glActiveTexture(33984);
            s50 s50Var13 = this.D;
            GLES20.glBindTexture(36197, s50Var13.P[s50Var13.W0]);
            GLES20.glVertexAttribPointer(this.f29933w, 3, 5126, false, 12, (Buffer) this.D.f32520u0);
            GLES20.glEnableVertexAttribArray(this.f29933w);
            GLES20.glVertexAttribPointer(this.f29934x, 2, 5126, false, 8, (Buffer) this.D.f32521v0);
            GLES20.glEnableVertexAttribArray(this.f29934x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.D.f32518s0, 0);
            GLES20.glUniformMatrix4fv(this.f29932s, 1, false, this.D.f32516r0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f29933w);
            GLES20.glDisableVertexAttribArray(this.f29934x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f29926b.eglSwapBuffers(this.f29927c, this.f29928e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final k50 f29555b;

                    {
                        this.f29555b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f29555b.D.f32506i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                s50 s50Var82 = this.f29555b.D;
                                if (s50Var82.f32505h0 != null) {
                                    Bitmap bitmap = s50Var82.V0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        s50Var82.V0 = null;
                                    }
                                    s50Var82.V0 = s50Var82.f32505h0.getBitmap();
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
            int intValue = this.A.intValue();
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
        this.f29926b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f29927c = eglGetDisplay;
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
                org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f29926b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f29926b.eglChooseConfig(this.f29927c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f29926b.eglCreateContext(this.f29927c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f29925a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f29926b.eglCreateWindowSurface(this.f29927c, eGLConfig, surfaceTexture, null);
                        this.f29928e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f29926b.eglMakeCurrent(this.f29927c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                s50 s50Var = this.D;
                                float f9 = s50Var.f32525x0;
                                int[] iArr2 = s50Var.P;
                                float f10 = (1.0f / f9) / 2.0f;
                                float f11 = (1.0f / s50Var.f32527y0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (s50Var.U0 == null) {
                                    s50Var.U0 = new r50(s50Var);
                                }
                                FloatBuffer l10 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(48));
                                s50Var.f32520u0 = l10;
                                l10.put(fArr).position(0);
                                FloatBuffer l11 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
                                s50Var.f32521v0 = l11;
                                l11.put(fArr2).position(0);
                                Matrix.setIdentityM(s50Var.f32518s0, 0);
                                int a2 = s50.a(s50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = s50.a(s50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f29931r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f29931r, a10);
                                    GLES20.glLinkProgram(this.f29931r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f29931r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f29931r);
                                        this.f29931r = 0;
                                    } else {
                                        this.f29933w = GLES20.glGetAttribLocation(this.f29931r, "aPosition");
                                        this.f29934x = GLES20.glGetAttribLocation(this.f29931r, "aTextureCoord");
                                        this.f29932s = GLES20.glGetUniformLocation(this.f29931r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f29931r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(s50Var.f32516r0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f29930n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                k50 k50Var = k50.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                k50Var.D.N = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                k50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new rm(s50Var, i10, surfaceTextureArr[i10], 6));
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
                                org.telegram.messenger.x3.u(this.f29926b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f29929f = z10;
        super.run();
    }
}
