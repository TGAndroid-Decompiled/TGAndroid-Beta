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
    public final x50 H;
    public final SurfaceTexture f26602a;
    public EGL10 f26603b;
    public EGLDisplay f26604c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f26605f;
    public Object h;
    public final SurfaceTexture[] f26606n;
    public int f26607r;
    public int f26608s;
    public int v;
    public int f26609w;
    public int f26610x;
    public boolean f26611y;

    public o50(x50 x50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = x50Var;
        this.f26606n = new SurfaceTexture[2];
        this.E = 0;
        this.f26602a = surfaceTexture;
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
        x50 x50Var = this.H;
        if (x50Var.f29902i0[x50Var.f29890a1] != null) {
            x50 x50Var2 = this.H;
            int width = x50Var2.f29902i0[x50Var2.f29890a1].getWidth();
            x50 x50Var3 = this.H;
            int height = x50Var3.f29902i0[x50Var3.f29890a1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                x50 x50Var4 = this.H;
                x50Var4.B0 = 1.0f;
                x50Var4.C0 = 1.0f;
            } else if (i10 > i11) {
                x50 x50Var5 = this.H;
                x50Var5.B0 = 1.0f;
                x50Var5.C0 = i10 / this.G;
            } else {
                x50 x50Var6 = this.H;
                x50Var6.B0 = i11 / this.F;
                x50Var6.C0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.B0 + " scaleY = " + this.H.C0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f26606n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f26606n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f26606n[i10] = null;
                }
            }
        }
        this.H.R = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f26603b.eglGetCurrentContext()) || !this.e.equals(this.f26603b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26603b;
                EGLDisplay eGLDisplay = this.f26604c;
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
            EGL10 egl102 = this.f26603b;
            EGLDisplay eGLDisplay2 = this.f26604c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f26603b.eglDestroySurface(this.f26604c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f26603b.eglDestroyContext(this.f26604c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f26604c;
        if (eGLDisplay3 != null) {
            this.f26603b.eglTerminate(eGLDisplay3);
            this.f26604c = null;
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
                            x50 x50Var = this.H;
                            x50Var.f29890a1 = 1 - x50Var.f29890a1;
                            c();
                            x50 x50Var2 = this.H;
                            float f7 = (1.0f / x50Var2.B0) / 2.0f;
                            float f10 = (1.0f / x50Var2.C0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            x50Var2.f29924z0 = org.telegram.messenger.ul.i(ByteBuffer.allocateDirect(32));
                            this.H.f29924z0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                        Matrix.setIdentityM(this.H.f29917v0, 0);
                        if (i11 != 0) {
                            Matrix.rotateM(this.H.f29917v0, 0, i11, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f26603b;
                EGLDisplay eGLDisplay = this.f26604c;
                EGLSurface eGLSurface = this.e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f26603b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f26606n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.f29921x0);
                    this.f26606n[0].setOnFrameAvailableListener(null);
                    this.f26606n[0].release();
                    x50 x50Var3 = this.H;
                    int[] iArr = x50Var3.U;
                    int[] iArr2 = x50Var3.T;
                    iArr[0] = iArr2[0];
                    x50Var3.V = 0.0f;
                    iArr2[0] = 0;
                    x50Var3.A0 = x50Var3.f29924z0.duplicate();
                    x50 x50Var4 = this.H;
                    x50Var4.D0 = x50Var4.f29902i0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.F = false;
                GLES20.glGenTextures(1, this.H.T, 0);
                GLES20.glBindTexture(36197, this.H.T[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f26606n[0] = new SurfaceTexture(this.H.T[0]);
                this.f26606n[0].setOnFrameAvailableListener(new vz(this, 1));
                AndroidUtilities.runOnUIThread(new xm(this.H, 0, this.f26606n[0], 6));
                c();
                x50 x50Var5 = this.H;
                float f15 = (1.0f / x50Var5.B0) / 2.0f;
                float f16 = (1.0f / x50Var5.C0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                x50Var5.f29924z0 = org.telegram.messenger.ul.i(ByteBuffer.allocateDirect(32));
                this.H.f29924z0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f26611y && ((!((z13 = (obj = message.obj) instanceof r50)) || ((r50) obj).f27558c != -2) && (w50Var = this.H.Y0) != null)) {
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
        if (this.f26605f) {
            if (!this.d.equals(this.f26603b.eglGetCurrentContext()) || !this.e.equals(this.f26603b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f26603b;
                EGLDisplay eGLDisplay2 = this.f26604c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f26606n[0].updateTexImage();
            }
            if (z11) {
                this.f26606n[1].updateTexImage();
            }
            if (!this.f26611y) {
                x50 x50Var6 = this.H;
                if (x50Var6.Y0 == null) {
                    x50Var6.Y0 = new w50(x50Var6);
                }
                x50 x50Var7 = this.H;
                if (x50Var7.Y0.F0) {
                    if (!x50Var7.F) {
                        this.H.F = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final o50 f26348b;

                            {
                                this.f26348b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f26348b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        x50 x50Var8 = this.f26348b.H;
                                        if (x50Var8.f29905l0 != null) {
                                            Bitmap bitmap = x50Var8.Z0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                x50Var8.Z0 = null;
                                            }
                                            x50Var8.Z0 = x50Var8.f29905l0.getBitmap();
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
                x50 x50Var8 = this.H;
                w50 w50Var2 = x50Var8.Y0;
                j50 j50Var = x50Var8.f29889a0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (w50Var2.F0 && w50Var2.T != null && w50Var2.T.getLooper() != null && w50Var2.T.getLooper().getThread() != null && w50Var2.T.getLooper().getThread().isAlive()) {
                    w50Var2.f29544w = eglGetCurrentContext;
                    w50Var2.T.sendMessage(w50Var2.T.obtainMessage(0, 1, 0));
                }
                w50Var2.F0 = true;
                int i16 = MessagesController.getInstance(w50Var2.H0.f29888a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new s50(w50Var2, 1));
                w50Var2.f29516a = j50Var;
                w50Var2.d = i16;
                w50Var2.e = i16;
                w50Var2.f29524f = MessagesController.getInstance(w50Var2.H0.f29888a).roundVideoBitrate * 1024;
                w50Var2.f29544w = eglGetCurrentContext;
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
                    x50 x50Var9 = this.H;
                    float f21 = x50Var9.B0;
                    x50Var9.B0 = x50Var9.C0;
                    x50Var9.C0 = f21;
                }
                this.f26611y = true;
                this.H.r();
            } else {
                z12 = false;
            }
            x50 x50Var10 = this.H;
            if (x50Var10.Y0 != null && ((x50Var10.f29890a1 == 0 && z10) || (this.H.f29890a1 == 1 && z11))) {
                x50 x50Var11 = this.H;
                w50 w50Var3 = x50Var11.Y0;
                SurfaceTexture surfaceTexture2 = this.f26606n[x50Var11.f29890a1];
                x50 x50Var12 = this.H;
                if (x50Var12.f29909p0) {
                    i14 = x50Var12.f29890a1;
                }
                w50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f26606n[this.H.f29890a1].getTransformMatrix(this.H.f29919w0);
            GLES20.glUseProgram(this.f26607r);
            GLES20.glActiveTexture(33984);
            x50 x50Var13 = this.H;
            GLES20.glBindTexture(36197, x50Var13.T[x50Var13.f29890a1]);
            GLES20.glVertexAttribPointer(this.f26609w, 3, 5126, false, 12, (Buffer) this.H.f29923y0);
            GLES20.glEnableVertexAttribArray(this.f26609w);
            GLES20.glVertexAttribPointer(this.f26610x, 2, 5126, false, 8, (Buffer) this.H.f29924z0);
            GLES20.glEnableVertexAttribArray(this.f26610x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.f29919w0, 0);
            GLES20.glUniformMatrix4fv(this.f26608s, 1, false, this.H.f29917v0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f26609w);
            GLES20.glDisableVertexAttribArray(this.f26610x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f26603b.eglSwapBuffers(this.f26604c, this.e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final o50 f26348b;

                    {
                        this.f26348b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f26348b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                x50 x50Var82 = this.f26348b.H;
                                if (x50Var82.f29905l0 != null) {
                                    Bitmap bitmap = x50Var82.Z0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        x50Var82.Z0 = null;
                                    }
                                    x50Var82.Z0 = x50Var82.f29905l0.getBitmap();
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
        this.f26603b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26604c = eglGetDisplay;
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
                org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f26603b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26603b.eglChooseConfig(this.f26604c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f26603b.eglCreateContext(this.f26604c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f26602a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f26603b.eglCreateWindowSurface(this.f26604c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f26603b.eglMakeCurrent(this.f26604c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                x50 x50Var = this.H;
                                float f7 = x50Var.B0;
                                int[] iArr2 = x50Var.T;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / x50Var.C0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (x50Var.Y0 == null) {
                                    x50Var.Y0 = new w50(x50Var);
                                }
                                FloatBuffer i10 = org.telegram.messenger.ul.i(ByteBuffer.allocateDirect(48));
                                x50Var.f29923y0 = i10;
                                i10.put(fArr).position(0);
                                FloatBuffer i11 = org.telegram.messenger.ul.i(ByteBuffer.allocateDirect(32));
                                x50Var.f29924z0 = i11;
                                i11.put(fArr2).position(0);
                                Matrix.setIdentityM(x50Var.f29919w0, 0);
                                int a2 = x50.a(x50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a10 = x50.a(x50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f26607r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f26607r, a10);
                                    GLES20.glLinkProgram(this.f26607r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f26607r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f26607r);
                                        this.f26607r = 0;
                                    } else {
                                        this.f26609w = GLES20.glGetAttribLocation(this.f26607r, "aPosition");
                                        this.f26610x = GLES20.glGetAttribLocation(this.f26607r, "aTextureCoord");
                                        this.f26608s = GLES20.glGetUniformLocation(this.f26607r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f26607r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(x50Var.f29917v0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i12 = 0; i12 < 2; i12++) {
                                        GLES20.glBindTexture(36197, iArr2[i12]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i12]);
                                        SurfaceTexture[] surfaceTextureArr = this.f26606n;
                                        surfaceTextureArr[i12] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                o50 o50Var = o50.this;
                                                int i13 = i12;
                                                boolean z12 = true;
                                                o50Var.H.R = true;
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
                                        AndroidUtilities.runOnUIThread(new xm(x50Var, i12, surfaceTextureArr[i12], 6));
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
                                org.telegram.messenger.ul.t(this.f26603b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f26605f = z10;
        super.run();
    }
}
