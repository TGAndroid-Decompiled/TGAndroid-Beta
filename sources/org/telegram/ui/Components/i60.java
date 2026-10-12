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
public final class i60 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final w60 H;
    public final SurfaceTexture f27066a;
    public EGL10 f27067b;
    public EGLDisplay f27068c;
    public EGLContext d;
    public EGLSurface f27069e;
    public boolean f27070f;
    public Object h;
    public final SurfaceTexture[] f27071n;
    public int f27072r;
    public int f27073s;
    public int v;
    public int f27074w;
    public int f27075x;
    public boolean f27076y;

    public i60(w60 w60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = w60Var;
        this.f27071n = new SurfaceTexture[2];
        this.E = 0;
        this.f27066a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new l60(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        w60 w60Var = this.H;
        if (w60Var.f32312n0[w60Var.f32309k1] != null) {
            w60 w60Var2 = this.H;
            int width = w60Var2.f32312n0[w60Var2.f32309k1].getWidth();
            w60 w60Var3 = this.H;
            int height = w60Var3.f32312n0[w60Var3.f32309k1].getHeight();
            float min = this.F / Math.min(width, height);
            int i10 = (int) (width * min);
            int i11 = (int) (height * min);
            if (i10 == i11) {
                w60 w60Var4 = this.H;
                w60Var4.L0 = 1.0f;
                w60Var4.M0 = 1.0f;
            } else if (i10 > i11) {
                w60 w60Var5 = this.H;
                w60Var5.L0 = 1.0f;
                w60Var5.M0 = i10 / this.G;
            } else {
                w60 w60Var6 = this.H;
                w60Var6.L0 = i11 / this.F;
                w60Var6.M0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.L0 + " scaleY = " + this.H.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f27071n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f27071n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f27071n[i10] = null;
                }
            }
        }
        this.H.W = false;
        if (this.f27069e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f27067b.eglGetCurrentContext()) || !this.f27069e.equals(this.f27067b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f27067b;
                EGLDisplay eGLDisplay = this.f27068c;
                EGLSurface eGLSurface = this.f27069e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.f32289b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.f32289b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.f32289b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.f32289b0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.f27069e != null) {
            EGL10 egl102 = this.f27067b;
            EGLDisplay eGLDisplay2 = this.f27068c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f27067b.eglDestroySurface(this.f27068c, this.f27069e);
            this.f27069e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f27067b.eglDestroyContext(this.f27068c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f27068c;
        if (eGLDisplay3 != null) {
            this.f27067b.eglTerminate(eGLDisplay3);
            this.f27068c = null;
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
        p60 p60Var;
        int i11;
        int i12 = message.what;
        if (i12 != 0) {
            l60 l60Var = null;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            w60 w60Var = this.H;
                            w60Var.f32309k1 = 1 - w60Var.f32309k1;
                            if (this.H.B0) {
                                this.H.p("GL surface flip applied: surface=" + this.H.f32309k1);
                            }
                            c();
                            w60 w60Var2 = this.H;
                            float f7 = (1.0f / w60Var2.L0) / 2.0f;
                            float f10 = (1.0f / w60Var2.M0) / 2.0f;
                            float f11 = 0.5f - f7;
                            float f12 = 0.5f - f10;
                            float f13 = f7 + 0.5f;
                            float f14 = f10 + 0.5f;
                            w60Var2.J0 = org.telegram.messenger.am.h(ByteBuffer.allocateDirect(32));
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
                EGL10 egl10 = this.f27067b;
                EGLDisplay eGLDisplay = this.f27068c;
                EGLSurface eGLSurface = this.f27069e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f27067b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f27071n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.H.H0);
                    this.f27071n[0].setOnFrameAvailableListener(null);
                    this.f27071n[0].release();
                    w60 w60Var3 = this.H;
                    int[] iArr = w60Var3.f32291c0;
                    int[] iArr2 = w60Var3.f32289b0;
                    iArr[0] = iArr2[0];
                    w60Var3.f32293d0 = 0.0f;
                    iArr2[0] = 0;
                    w60Var3.K0 = w60Var3.J0.duplicate();
                    w60 w60Var4 = this.H;
                    w60Var4.N0 = w60Var4.f32312n0[0];
                }
                this.E = Integer.valueOf(this.E.intValue() + 1);
                this.H.K = false;
                GLES20.glGenTextures(1, this.H.f32289b0, 0);
                GLES20.glBindTexture(36197, this.H.f32289b0[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f27071n[0] = new SurfaceTexture(this.H.f32289b0[0]);
                this.f27071n[0].setOnFrameAvailableListener(new n00(this, 1));
                if (this.H.B0) {
                    this.H.p("GL input recreated: surface=0");
                }
                AndroidUtilities.runOnUIThread(new bl(this.H, 0, this.f27071n[0], 7));
                c();
                w60 w60Var5 = this.H;
                float f15 = (1.0f / w60Var5.L0) / 2.0f;
                float f16 = (1.0f / w60Var5.M0) / 2.0f;
                float f17 = 0.5f - f15;
                float f18 = 0.5f - f16;
                float f19 = f15 + 0.5f;
                float f20 = f16 + 0.5f;
                w60Var5.J0 = org.telegram.messenger.am.h(ByteBuffer.allocateDirect(32));
                this.H.J0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
                return;
            }
            finish();
            if (this.f27076y && ((!((z14 = (obj = message.obj) instanceof l60)) || ((l60) obj).f28058c != -2) && (p60Var = this.H.f32305i1) != null)) {
                int i13 = message.arg1;
                if (z14) {
                    l60Var = (l60) obj;
                }
                p60Var.i(i13, l60Var);
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
        if (this.f27070f) {
            if (!this.d.equals(this.f27067b.eglGetCurrentContext()) || !this.f27069e.equals(this.f27067b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f27067b;
                EGLDisplay eGLDisplay2 = this.f27068c;
                EGLSurface eGLSurface2 = this.f27069e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.am.v(this.f27067b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f27071n[0].updateTexImage();
            }
            if (z11) {
                this.f27071n[1].updateTexImage();
            }
            if (this.H.B0 && this.H.f32309k1 == this.H.A0 && ((this.H.f32309k1 == 0 && z10) || (this.H.f32309k1 == 1 && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!this.f27076y) {
                w60 w60Var6 = this.H;
                if (w60Var6.f32305i1 == null) {
                    w60Var6.f32305i1 = new p60(w60Var6);
                }
                w60 w60Var7 = this.H;
                if (w60Var7.f32305i1.F0) {
                    if (!w60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final i60 f26662b;

                            {
                                this.f26662b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f26662b.H.f32317r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        w60 w60Var8 = this.f26662b.H;
                                        if (w60Var8.f32315q0 != null) {
                                            Bitmap bitmap = w60Var8.f32307j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                w60Var8.f32307j1 = null;
                                            }
                                            w60Var8.f32307j1 = w60Var8.f32315q0.getBitmap();
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
                w60 w60Var8 = this.H;
                p60 p60Var2 = w60Var8.f32305i1;
                d60 d60Var = w60Var8.f32298f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (p60Var2.F0 && p60Var2.T != null && p60Var2.T.getLooper() != null && p60Var2.T.getLooper().getThread() != null && p60Var2.T.getLooper().getThread().isAlive()) {
                    p60Var2.f29420w = eglGetCurrentContext;
                    p60Var2.T.sendMessage(p60Var2.T.obtainMessage(0, 1, 0));
                }
                p60Var2.F0 = true;
                int i16 = MessagesController.getInstance(p60Var2.H0.f32297f).roundVideoSize;
                AndroidUtilities.runOnUIThread(new xh(7));
                p60Var2.f29391a = d60Var;
                p60Var2.d = i16;
                p60Var2.f29398e = i16;
                p60Var2.f29400f = MessagesController.getInstance(p60Var2.H0.f32297f).roundVideoBitrate * 1024;
                p60Var2.f29420w = eglGetCurrentContext;
                synchronized (p60Var2.U) {
                    try {
                        if (!p60Var2.W) {
                            p60Var2.W = true;
                            Thread thread = new Thread(p60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!p60Var2.V) {
                                try {
                                    p60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            p60Var2.A0.clear();
                            p60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = p60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                p60Var2.B0.recycle();
                            }
                            p60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            p60Var2.T.sendMessage(p60Var2.T.obtainMessage(0));
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
                    w60 w60Var9 = this.H;
                    float f21 = w60Var9.L0;
                    w60Var9.L0 = w60Var9.M0;
                    w60Var9.M0 = f21;
                }
                this.f27076y = true;
                this.H.v();
            } else {
                z13 = false;
            }
            w60 w60Var10 = this.H;
            if (w60Var10.f32305i1 != null && ((w60Var10.f32309k1 == 0 && z10) || (this.H.f32309k1 == 1 && z11))) {
                w60 w60Var11 = this.H;
                p60 p60Var3 = w60Var11.f32305i1;
                SurfaceTexture surfaceTexture2 = this.f27071n[w60Var11.f32309k1];
                w60 w60Var12 = this.H;
                if (w60Var12.f32321u0) {
                    i14 = w60Var12.f32309k1;
                }
                p60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f27071n[this.H.f32309k1].getTransformMatrix(this.H.G0);
            GLES20.glUseProgram(this.f27072r);
            GLES20.glActiveTexture(33984);
            w60 w60Var13 = this.H;
            GLES20.glBindTexture(36197, w60Var13.f32289b0[w60Var13.f32309k1]);
            GLES20.glVertexAttribPointer(this.f27074w, 3, 5126, false, 12, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.f27074w);
            GLES20.glVertexAttribPointer(this.f27075x, 2, 5126, false, 8, (Buffer) this.H.J0);
            GLES20.glEnableVertexAttribArray(this.f27075x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.G0, 0);
            GLES20.glUniformMatrix4fv(this.f27073s, 1, false, this.H.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f27074w);
            GLES20.glDisableVertexAttribArray(this.f27075x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f27067b.eglSwapBuffers(this.f27068c, this.f27069e);
            if (z12 && this.H.B0) {
                this.H.B0 = false;
                this.H.p("first target frame presented: surface=" + this.H.f32309k1);
            }
            if (z13) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final i60 f26662b;

                    {
                        this.f26662b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f26662b.H.f32317r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                w60 w60Var82 = this.f26662b.H;
                                if (w60Var82.f32315q0 != null) {
                                    Bitmap bitmap = w60Var82.f32307j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        w60Var82.f32307j1 = null;
                                    }
                                    w60Var82.f32307j1 = w60Var82.f32315q0.getBitmap();
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
        this.f27067b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f27068c = eglGetDisplay;
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
                org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f27067b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f27067b.eglChooseConfig(this.f27068c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f27067b.eglCreateContext(this.f27068c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f27066a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f27067b.eglCreateWindowSurface(this.f27068c, eGLConfig, surfaceTexture, null);
                        this.f27069e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f27067b.eglMakeCurrent(this.f27068c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                w60 w60Var = this.H;
                                float f7 = w60Var.L0;
                                int[] iArr2 = w60Var.f32289b0;
                                float f10 = (1.0f / f7) / 2.0f;
                                float f11 = (1.0f / w60Var.M0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f12 = 0.5f - f10;
                                float f13 = 0.5f - f11;
                                float f14 = f10 + 0.5f;
                                float f15 = f11 + 0.5f;
                                float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                                if (w60Var.f32305i1 == null) {
                                    w60Var.f32305i1 = new p60(w60Var);
                                }
                                FloatBuffer h = org.telegram.messenger.am.h(ByteBuffer.allocateDirect(48));
                                w60Var.I0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.am.h(ByteBuffer.allocateDirect(32));
                                w60Var.J0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(w60Var.G0, 0);
                                int j3 = w60.j(w60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int j10 = w60.j(w60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (j3 != 0 && j10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f27072r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, j3);
                                    GLES20.glAttachShader(this.f27072r, j10);
                                    GLES20.glLinkProgram(this.f27072r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f27072r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f27072r);
                                        this.f27072r = 0;
                                    } else {
                                        this.f27074w = GLES20.glGetAttribLocation(this.f27072r, "aPosition");
                                        this.f27075x = GLES20.glGetAttribLocation(this.f27072r, "aTextureCoord");
                                        this.f27073s = GLES20.glGetUniformLocation(this.f27072r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f27072r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(w60Var.F0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i10 = 0; i10 < 2; i10++) {
                                        GLES20.glBindTexture(36197, iArr2[i10]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                        SurfaceTexture[] surfaceTextureArr = this.f27071n;
                                        surfaceTextureArr[i10] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                i60 i60Var = i60.this;
                                                int i11 = i10;
                                                boolean z12 = true;
                                                i60Var.H.W = true;
                                                if (i11 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i11 != 1) {
                                                    z12 = false;
                                                }
                                                i60Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new bl(w60Var, i10, surfaceTextureArr[i10], 7));
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
                                org.telegram.messenger.am.v(this.f27067b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f27070f = z10;
        super.run();
    }
}
