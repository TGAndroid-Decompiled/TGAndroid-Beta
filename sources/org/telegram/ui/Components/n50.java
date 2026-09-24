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
    public final c60 H;
    public final SurfaceTexture f26632a;
    public EGL10 f26633b;
    public EGLDisplay f26634c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f26635f;
    public Object h;
    public final SurfaceTexture[] f26636n;
    public int f26637r;
    public int f26638s;
    public int v;
    public int f26639w;
    public int f26640x;
    public boolean f26641y;

    public n50(c60 c60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = c60Var;
        this.f26636n = new SurfaceTexture[2];
        this.E = 0;
        this.f26632a = surfaceTexture;
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
        c60 c60Var = this.H;
        if (c60Var.f23203n0[c60Var.f23194f1] != null) {
            c60 c60Var2 = this.H;
            int width = c60Var2.f23203n0[c60Var2.f23194f1].getWidth();
            c60 c60Var3 = this.H;
            int height = c60Var3.f23203n0[c60Var3.f23194f1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                c60 c60Var4 = this.H;
                c60Var4.G0 = 1.0f;
                c60Var4.H0 = 1.0f;
            } else if (i10 > i11) {
                c60 c60Var5 = this.H;
                c60Var5.G0 = 1.0f;
                c60Var5.H0 = i10 / this.G;
            } else {
                c60 c60Var6 = this.H;
                c60Var6.G0 = i11 / this.F;
                c60Var6.H0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.G0 + " scaleY = " + this.H.H0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f26636n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f26636n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f26636n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f26633b.eglGetCurrentContext()) || !this.e.equals(this.f26633b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26633b;
                EGLDisplay eGLDisplay = this.f26634c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f23184b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f23184b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f23184b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f23184b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.f26633b;
            EGLDisplay eGLDisplay2 = this.f26634c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f26633b.eglDestroySurface(this.f26634c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f26633b.eglDestroyContext(this.f26634c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f26634c;
        if (eGLDisplay3 != null) {
            this.f26633b.eglTerminate(eGLDisplay3);
            this.f26634c = null;
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
                            c60 c60Var = this.H;
                            c60Var.f23194f1 = 1 - c60Var.f23194f1;
                            c();
                            c60 c60Var2 = this.H;
                            float f7 = (1.0f / c60Var2.G0) / 2.0f;
                            float f10 = (1.0f / c60Var2.H0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            c60Var2.E0 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
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
                EGL10 egl10 = this.f26633b;
                EGLDisplay eGLDisplay = this.f26634c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f26633b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f26636n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.C0);
                    this.f26636n[0].setOnFrameAvailableListener(null);
                    this.f26636n[0].release();
                    c60 c60Var3 = this.H;
                    int[] iArr = c60Var3.f23186c0;
                    int[] iArr2 = c60Var3.f23184b0;
                    iArr[0] = iArr2[0];
                    c60Var3.f23188d0 = 0.0f;
                    iArr2[0] = 0;
                    c60Var3.F0 = c60Var3.E0.duplicate();
                    c60 c60Var4 = this.H;
                    c60Var4.I0 = c60Var4.f23203n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f23184b0, 0);
                GLES20.glBindTexture(36197, this.H.f23184b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f26636n[0] = new SurfaceTexture(this.H.f23184b0[0]);
                this.f26636n[0].setOnFrameAvailableListener(new vz(this, 1));
                AndroidUtilities.runOnUIThread(new xm(this.H, 0, this.f26636n[0], 6));
                c();
                c60 c60Var5 = this.H;
                float f15 = (1.0f / c60Var5.G0) / 2.0f;
                float f16 = (1.0f / c60Var5.H0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                c60Var5.E0 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
                this.H.E0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f26641y && ((!((z13 = (obj = message.obj) instanceof q50)) || ((q50) obj).f27506c != -2) && (v50Var = this.H.f23189d1) != null)) {
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
        if (this.f26635f) {
            if (!this.d.equals(this.f26633b.eglGetCurrentContext()) || !this.e.equals(this.f26633b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f26633b;
                EGLDisplay eGLDisplay2 = this.f26634c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f26636n[0].updateTexImage();
            }
            if (z11) {
                this.f26636n[1].updateTexImage();
            }
            if (!this.f26641y) {
                c60 c60Var6 = this.H;
                if (c60Var6.f23189d1 == null) {
                    c60Var6.f23189d1 = new v50(c60Var6);
                }
                c60 c60Var7 = this.H;
                if (c60Var7.f23189d1.F0) {
                    if (!c60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final n50 f26357b;

                            {
                                this.f26357b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f26357b.H.f23208r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        c60 c60Var8 = this.f26357b.H;
                                        if (c60Var8.f23206q0 != null) {
                                            Bitmap bitmap = c60Var8.f23191e1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                c60Var8.f23191e1 = null;
                                            }
                                            c60Var8.f23191e1 = c60Var8.f23206q0.getBitmap();
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
                c60 c60Var8 = this.H;
                v50 v50Var2 = c60Var8.f23189d1;
                j50 j50Var = c60Var8.f23193f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (v50Var2.F0 && v50Var2.T != null && v50Var2.T.getLooper() != null && v50Var2.T.getLooper().getThread() != null && v50Var2.T.getLooper().getThread().isAlive()) {
                    v50Var2.f29029w = eglGetCurrentContext;
                    v50Var2.T.sendMessage(v50Var2.T.obtainMessage(0, 1, 0));
                }
                v50Var2.F0 = true;
                int i16 = MessagesController.getInstance(v50Var2.H0.f23192f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new th(7));
                v50Var2.f29001a = j50Var;
                v50Var2.d = i16;
                v50Var2.e = i16;
                v50Var2.f29009f = MessagesController.getInstance(v50Var2.H0.f23192f).roundVideoBitrate * 1024;
                v50Var2.f29029w = eglGetCurrentContext;
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
                    c60 c60Var9 = this.H;
                    float f21 = c60Var9.G0;
                    c60Var9.G0 = c60Var9.H0;
                    c60Var9.H0 = f21;
                }
                this.f26641y = true;
                this.H.u();
            } else {
                z12 = false;
            }
            c60 c60Var10 = this.H;
            if (c60Var10.f23189d1 != null && ((c60Var10.f23194f1 == 0 && z10) || (this.H.f23194f1 == 1 && z11))) {
                c60 c60Var11 = this.H;
                v50 v50Var3 = c60Var11.f23189d1;
                SurfaceTexture surfaceTexture2 = this.f26636n[c60Var11.f23194f1];
                c60 c60Var12 = this.H;
                if (c60Var12.f23212u0) {
                    i14 = c60Var12.f23194f1;
                }
                v50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f26636n[this.H.f23194f1].getTransformMatrix(this.H.B0);
            GLES20.glUseProgram(this.f26637r);
            GLES20.glActiveTexture(33984);
            c60 c60Var13 = this.H;
            GLES20.glBindTexture(36197, c60Var13.f23184b0[c60Var13.f23194f1]);
            GLES20.glVertexAttribPointer(this.f26639w, 3, 5126, false, 12, (Buffer) this.H.D0);
            GLES20.glEnableVertexAttribArray(this.f26639w);
            GLES20.glVertexAttribPointer(this.f26640x, 2, 5126, false, 8, (Buffer) this.H.E0);
            GLES20.glEnableVertexAttribArray(this.f26640x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.B0, 0);
            GLES20.glUniformMatrix4fv(this.f26638s, 1, false, this.H.A0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f26639w);
            GLES20.glDisableVertexAttribArray(this.f26640x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f26633b.eglSwapBuffers(this.f26634c, this.e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final n50 f26357b;

                    {
                        this.f26357b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f26357b.H.f23208r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                c60 c60Var82 = this.f26357b.H;
                                if (c60Var82.f23206q0 != null) {
                                    Bitmap bitmap = c60Var82.f23191e1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        c60Var82.f23191e1 = null;
                                    }
                                    c60Var82.f23191e1 = c60Var82.f23206q0.getBitmap();
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
        this.f26633b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26634c = eglGetDisplay;
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
                org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f26633b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26633b.eglChooseConfig(this.f26634c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f26633b.eglCreateContext(this.f26634c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f26632a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f26633b.eglCreateWindowSurface(this.f26634c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f26633b.eglMakeCurrent(this.f26634c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                c60 c60Var = this.H;
                                float f7 = c60Var.G0;
                                int[] iArr2 = c60Var.f23184b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / c60Var.H0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (c60Var.f23189d1 == null) {
                                    c60Var.f23189d1 = new v50(c60Var);
                                }
                                FloatBuffer i10 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(48));
                                c60Var.D0 = i10;
                                i10.put(fArr).position(0);
                                FloatBuffer i11 = org.telegram.messenger.ok.i(ByteBuffer.allocateDirect(32));
                                c60Var.E0 = i11;
                                i11.put(fArr2).position(0);
                                Matrix.setIdentityM(c60Var.B0, 0);
                                int j3 = c60.j(c60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j10 = c60.j(c60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j3 != 0 && j10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f26637r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j3);
                                    GLES20.glAttachShader(this.f26637r, j10);
                                    GLES20.glLinkProgram(this.f26637r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f26637r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f26637r);
                                        this.f26637r = 0;
                                    } else {
                                        this.f26639w = GLES20.glGetAttribLocation(this.f26637r, "aPosition");
                                        this.f26640x = GLES20.glGetAttribLocation(this.f26637r, "aTextureCoord");
                                        this.f26638s = GLES20.glGetUniformLocation(this.f26637r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f26637r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(c60Var.A0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i12 = 0; i12 < 2; i12++) {
                                        GLES20.glBindTexture(36197, iArr2[i12]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i12]);
                                        SurfaceTexture[] surfaceTextureArr = this.f26636n;
                                        surfaceTextureArr[i12] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                n50 n50Var = n50.this;
                                                int i13 = i12;
                                                boolean z12 = true;
                                                n50Var.H.W = true;
                                                if (i13 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i13 != 1) {
                                                    z12 = false;
                                                }
                                                n50Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new xm(c60Var, i12, surfaceTextureArr[i12], 6));
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
                                org.telegram.messenger.ok.u(this.f26633b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f26635f = z10;
        super.run();
    }
}
