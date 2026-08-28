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
public final class w40 extends DispatchQueue {
    public Integer A;
    public int B;
    public int C;
    public final f50 D;
    public final SurfaceTexture f34098a;
    public EGL10 f34099b;
    public EGLDisplay f34100c;
    public EGLContext d;
    public EGLSurface f34101e;
    public boolean f34102f;
    public Object h;
    public final SurfaceTexture[] f34103n;
    public int f34104r;
    public int f34105s;
    public int v;
    public int f34106w;
    public int f34107x;
    public boolean f34108y;

    public w40(f50 f50Var, SurfaceTexture surfaceTexture, int i9, int i10) {
        super("CameraGLThread");
        this.D = f50Var;
        this.f34103n = new SurfaceTexture[2];
        this.A = 0;
        this.f34098a = surfaceTexture;
        this.B = i9;
        this.C = i10;
    }

    public final void b(long j10, int i9, boolean z10, int i10, int i11) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i9, 0, new z40(j10, i10, i11, z10, 0L)), 0);
        }
    }

    public final void c() {
        f50 f50Var = this.D;
        if (f50Var.f28280e0[f50Var.W0] != null) {
            f50 f50Var2 = this.D;
            int width = f50Var2.f28280e0[f50Var2.W0].getWidth();
            f50 f50Var3 = this.D;
            int height = f50Var3.f28280e0[f50Var3.W0].getHeight();
            float min = this.B / Math.min(width, height);
            int i9 = (int) (width * min);
            int i10 = (int) (height * min);
            if (i9 == i10) {
                f50 f50Var4 = this.D;
                f50Var4.f28304x0 = 1.0f;
                f50Var4.f28306y0 = 1.0f;
            } else if (i9 > i10) {
                f50 f50Var5 = this.D;
                f50Var5.f28304x0 = 1.0f;
                f50Var5.f28306y0 = i9 / this.C;
            } else {
                f50 f50Var6 = this.D;
                f50Var6.f28304x0 = i10 / this.B;
                f50Var6.f28306y0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.D.f28304x0 + " scaleY = " + this.D.f28306y0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f34103n != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                SurfaceTexture surfaceTexture = this.f34103n[i9];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f34103n[i9] = null;
                }
            }
        }
        this.D.N = false;
        if (this.f34101e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f34099b.eglGetCurrentContext()) || !this.f34101e.equals(this.f34099b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f34099b;
                EGLDisplay eGLDisplay = this.f34100c;
                EGLSurface eGLSurface = this.f34101e;
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
        if (this.f34101e != null) {
            EGL10 egl102 = this.f34099b;
            EGLDisplay eGLDisplay2 = this.f34100c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f34099b.eglDestroySurface(this.f34100c, this.f34101e);
            this.f34101e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f34099b.eglDestroyContext(this.f34100c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f34100c;
        if (eGLDisplay3 != null) {
            this.f34099b.eglTerminate(eGLDisplay3);
            this.f34100c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        Object obj;
        boolean z13;
        e50 e50Var;
        int i10;
        int i11 = message.what;
        if (i11 != 0) {
            z40 z40Var = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f50 f50Var = this.D;
                            f50Var.W0 = 1 - f50Var.W0;
                            c();
                            f50 f50Var2 = this.D;
                            float f10 = (1.0f / f50Var2.f28304x0) / 2.0f;
                            float f11 = (1.0f / f50Var2.f28306y0) / 2.0f;
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            f50Var2.f28300v0 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
                            this.D.f28300v0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
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
                            i10 = ((CameraSession) obj3).getWorldAngle();
                        } else if (obj3 instanceof Camera2Session) {
                            i10 = ((Camera2Session) obj3).getWorldAngle();
                        } else {
                            i10 = 0;
                        }
                        Matrix.setIdentityM(this.D.f28295r0, 0);
                        if (i10 != 0) {
                            Matrix.rotateM(this.D.f28295r0, 0, i10, 0.0f, 0.0f, 1.0f);
                            return;
                        }
                        return;
                    }
                    this.h = obj2;
                    return;
                }
                EGL10 egl10 = this.f34099b;
                EGLDisplay eGLDisplay = this.f34100c;
                EGLSurface eGLSurface = this.f34101e;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f34099b.eglGetError()));
                        return;
                    }
                    return;
                }
                SurfaceTexture surfaceTexture = this.f34103n[0];
                if (surfaceTexture != null) {
                    surfaceTexture.getTransformMatrix(this.D.f28298t0);
                    this.f34103n[0].setOnFrameAvailableListener(null);
                    this.f34103n[0].release();
                    f50 f50Var3 = this.D;
                    int[] iArr = f50Var3.Q;
                    int[] iArr2 = f50Var3.P;
                    iArr[0] = iArr2[0];
                    f50Var3.R = 0.0f;
                    iArr2[0] = 0;
                    f50Var3.f28302w0 = f50Var3.f28300v0.duplicate();
                    f50 f50Var4 = this.D;
                    f50Var4.f28307z0 = f50Var4.f28280e0[0];
                }
                this.A = Integer.valueOf(this.A.intValue() + 1);
                this.D.B = false;
                GLES20.glGenTextures(1, this.D.P, 0);
                GLES20.glBindTexture(36197, this.D.P[0]);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.f34103n[0] = new SurfaceTexture(this.D.P[0]);
                this.f34103n[0].setOnFrameAvailableListener(new gz(this, 1));
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this.D, 0, this.f34103n[0], 7));
                c();
                f50 f50Var5 = this.D;
                float f16 = (1.0f / f50Var5.f28304x0) / 2.0f;
                float f17 = (1.0f / f50Var5.f28306y0) / 2.0f;
                float f18 = 0.5f - f16;
                float f19 = 0.5f - f17;
                float f20 = f16 + 0.5f;
                float f21 = f17 + 0.5f;
                f50Var5.f28300v0 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
                this.D.f28300v0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
                return;
            }
            finish();
            if (this.f34108y && ((!((z13 = (obj = message.obj) instanceof z40)) || ((z40) obj).f35183c != -2) && (e50Var = this.D.U0) != null)) {
                int i12 = message.arg1;
                if (z13) {
                    z40Var = (z40) obj;
                }
                e50Var.i(i12, z40Var);
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
                return;
            }
            return;
        }
        int i13 = message.arg1;
        int i14 = message.arg2;
        if ((i14 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i14 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34102f) {
            if (!this.d.equals(this.f34099b.eglGetCurrentContext()) || !this.f34101e.equals(this.f34099b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.f34099b;
                EGLDisplay eGLDisplay2 = this.f34100c;
                EGLSurface eGLSurface2 = this.f34101e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                this.f34103n[0].updateTexImage();
            }
            if (z11) {
                this.f34103n[1].updateTexImage();
            }
            if (!this.f34108y) {
                f50 f50Var6 = this.D;
                if (f50Var6.U0 == null) {
                    f50Var6.U0 = new e50(f50Var6);
                }
                f50 f50Var7 = this.D;
                if (f50Var7.U0.B0) {
                    if (!f50Var7.B) {
                        this.D.B = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {
                            public final w40 f33259b;

                            {
                                this.f33259b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f33259b.D.f28285i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        return;
                                    default:
                                        f50 f50Var8 = this.f33259b.D;
                                        if (f50Var8.f28284h0 != null) {
                                            Bitmap bitmap = f50Var8.V0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                f50Var8.V0 = null;
                                            }
                                            f50Var8.V0 = f50Var8.f28284h0.getBitmap();
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
                f50 f50Var8 = this.D;
                e50 e50Var2 = f50Var8.U0;
                s40 s40Var = f50Var8.T;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (e50Var2.B0 && e50Var2.P != null && e50Var2.P.getLooper() != null && e50Var2.P.getLooper().getThread() != null && e50Var2.P.getLooper().getThread().isAlive()) {
                    e50Var2.f27953w = eglGetCurrentContext;
                    e50Var2.P.sendMessage(e50Var2.P.obtainMessage(0, 1, 0));
                }
                e50Var2.B0 = true;
                int i15 = MessagesController.getInstance(e50Var2.D0.f28272a).roundVideoSize;
                AndroidUtilities.runOnUIThread(new b50(e50Var2, 1));
                e50Var2.f27924a = s40Var;
                e50Var2.d = i15;
                e50Var2.f27931e = i15;
                e50Var2.f27933f = MessagesController.getInstance(e50Var2.D0.f28272a).roundVideoBitrate * 1024;
                e50Var2.f27953w = eglGetCurrentContext;
                synchronized (e50Var2.Q) {
                    try {
                        if (!e50Var2.S) {
                            e50Var2.S = true;
                            Thread thread = new Thread(e50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!e50Var2.R) {
                                try {
                                    e50Var2.Q.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            e50Var2.f27954w0.clear();
                            e50Var2.f27958y0 = 0;
                            DispatchQueue dispatchQueue = e50Var2.f27956x0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                e50Var2.f27956x0.recycle();
                            }
                            e50Var2.f27956x0 = new DispatchQueue("keyframes_thumb_queue");
                            e50Var2.P.sendMessage(e50Var2.P.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                if (obj4 instanceof CameraSession) {
                    i9 = ((CameraSession) obj4).getCurrentOrientation();
                } else if (obj4 instanceof Camera2Session) {
                    i9 = ((Camera2Session) obj4).getCurrentOrientation();
                } else {
                    i9 = 0;
                }
                if (i9 == 90 || i9 == 270) {
                    f50 f50Var9 = this.D;
                    float f22 = f50Var9.f28304x0;
                    f50Var9.f28304x0 = f50Var9.f28306y0;
                    f50Var9.f28306y0 = f22;
                }
                this.f34108y = true;
                this.D.r();
            } else {
                z12 = false;
            }
            f50 f50Var10 = this.D;
            if (f50Var10.U0 != null && ((f50Var10.W0 == 0 && z10) || (this.D.W0 == 1 && z11))) {
                f50 f50Var11 = this.D;
                e50 e50Var3 = f50Var11.U0;
                SurfaceTexture surfaceTexture2 = this.f34103n[f50Var11.W0];
                f50 f50Var12 = this.D;
                if (f50Var12.f28288l0) {
                    i13 = f50Var12.W0;
                }
                e50Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.f34103n[this.D.W0].getTransformMatrix(this.D.f28297s0);
            GLES20.glUseProgram(this.f34104r);
            GLES20.glActiveTexture(33984);
            f50 f50Var13 = this.D;
            GLES20.glBindTexture(36197, f50Var13.P[f50Var13.W0]);
            GLES20.glVertexAttribPointer(this.f34106w, 3, 5126, false, 12, (Buffer) this.D.f28299u0);
            GLES20.glEnableVertexAttribArray(this.f34106w);
            GLES20.glVertexAttribPointer(this.f34107x, 2, 5126, false, 8, (Buffer) this.D.f28300v0);
            GLES20.glEnableVertexAttribArray(this.f34107x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.D.f28297s0, 0);
            GLES20.glUniformMatrix4fv(this.f34105s, 1, false, this.D.f28295r0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f34106w);
            GLES20.glDisableVertexAttribArray(this.f34107x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f34099b.eglSwapBuffers(this.f34100c, this.f34101e);
            if (z12) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final w40 f33259b;

                    {
                        this.f33259b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f33259b.D.f28285i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                return;
                            default:
                                f50 f50Var82 = this.f33259b.D;
                                if (f50Var82.f28284h0 != null) {
                                    Bitmap bitmap = f50Var82.V0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        f50Var82.V0 = null;
                                    }
                                    f50Var82.V0 = f50Var82.f28284h0.getBitmap();
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
        int i9;
        Handler handler = getHandler();
        if (handler != null) {
            int intValue = this.A.intValue();
            if (z11) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            sendMessage(handler.obtainMessage(0, intValue, (z10 ? 1 : 0) + i9), 0);
        }
    }

    @Override
    public final void run() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f34099b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f34100c = eglGetDisplay;
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
                org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f34099b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f34099b.eglChooseConfig(this.f34100c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.f34099b.eglCreateContext(this.f34100c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f34098a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f34099b.eglCreateWindowSurface(this.f34100c, eGLConfig, surfaceTexture, null);
                        this.f34101e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f34099b.eglMakeCurrent(this.f34100c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                c();
                                f50 f50Var = this.D;
                                float f10 = f50Var.f28304x0;
                                int[] iArr2 = f50Var.P;
                                float f11 = (1.0f / f10) / 2.0f;
                                float f12 = (1.0f / f50Var.f28306y0) / 2.0f;
                                float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                                float f13 = 0.5f - f11;
                                float f14 = 0.5f - f12;
                                float f15 = f11 + 0.5f;
                                float f16 = f12 + 0.5f;
                                float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                                if (f50Var.U0 == null) {
                                    f50Var.U0 = new e50(f50Var);
                                }
                                FloatBuffer h = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(48));
                                f50Var.f28299u0 = h;
                                h.put(fArr).position(0);
                                FloatBuffer h10 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
                                f50Var.f28300v0 = h10;
                                h10.put(fArr2).position(0);
                                Matrix.setIdentityM(f50Var.f28297s0, 0);
                                int a2 = f50.a(f50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                int a3 = f50.a(f50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                                if (a2 != 0 && a3 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.f34104r = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, a2);
                                    GLES20.glAttachShader(this.f34104r, a3);
                                    GLES20.glLinkProgram(this.f34104r);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.f34104r, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.e("InstantCamera failed link shader");
                                        }
                                        GLES20.glDeleteProgram(this.f34104r);
                                        this.f34104r = 0;
                                    } else {
                                        this.f34106w = GLES20.glGetAttribLocation(this.f34104r, "aPosition");
                                        this.f34107x = GLES20.glGetAttribLocation(this.f34104r, "aTextureCoord");
                                        this.f34105s = GLES20.glGetUniformLocation(this.f34104r, "uMVPMatrix");
                                        this.v = GLES20.glGetUniformLocation(this.f34104r, "uSTMatrix");
                                    }
                                    Matrix.setIdentityM(f50Var.f28295r0, 0);
                                    GLES20.glGenTextures(2, iArr2, 0);
                                    for (final int i9 = 0; i9 < 2; i9++) {
                                        GLES20.glBindTexture(36197, iArr2[i9]);
                                        GLES20.glTexParameteri(36197, 10241, 9729);
                                        GLES20.glTexParameteri(36197, 10240, 9729);
                                        GLES20.glTexParameteri(36197, 10242, 33071);
                                        GLES20.glTexParameteri(36197, 10243, 33071);
                                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i9]);
                                        SurfaceTexture[] surfaceTextureArr = this.f34103n;
                                        surfaceTextureArr[i9] = surfaceTexture2;
                                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                            @Override
                                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                                boolean z11;
                                                w40 w40Var = w40.this;
                                                int i10 = i9;
                                                boolean z12 = true;
                                                w40Var.D.N = true;
                                                if (i10 == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (i10 != 1) {
                                                    z12 = false;
                                                }
                                                w40Var.requestRender(z11, z12);
                                            }
                                        });
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(f50Var, i9, surfaceTextureArr[i9], 7));
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
                                org.telegram.messenger.ll.t(this.f34099b, new StringBuilder("InstantCamera createWindowSurface failed "));
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
        this.f34102f = z10;
        super.run();
    }
}
