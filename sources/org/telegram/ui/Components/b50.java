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

public final class b50 extends DispatchQueue {
    public Integer A;
    public int B;
    public int C;
    public final k50 D;

    public final SurfaceTexture f26928a;

    public EGL10 f26929b;

    public EGLDisplay f26930c;
    public EGLContext d;

    public EGLSurface f26931e;

    public boolean f26932f;
    public Object h;

    public final SurfaceTexture[] f26933n;

    public int f26934r;

    public int f26935s;
    public int v;

    public int f26936w;

    public int f26937x;

    public boolean f26938y;

    public b50(k50 k50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.D = k50Var;
        this.f26933n = new SurfaceTexture[2];
        this.A = 0;
        this.f26928a = surfaceTexture;
        this.B = i10;
        this.C = i11;
    }

    public final void b(long j10, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new e50(j10, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        k50 k50Var = this.D;
        if (k50Var.f29975e0[k50Var.W0] != null) {
            k50 k50Var2 = this.D;
            int width = k50Var2.f29975e0[k50Var2.W0].getWidth();
            k50 k50Var3 = this.D;
            int height = k50Var3.f29975e0[k50Var3.W0].getHeight();
            float fMin = this.B / Math.min(width, height);
            int i10 = (int) (width * fMin);
            int i11 = (int) (height * fMin);
            if (i10 == i11) {
                k50 k50Var4 = this.D;
                k50Var4.f29999x0 = 1.0f;
                k50Var4.f30001y0 = 1.0f;
            } else if (i10 > i11) {
                k50 k50Var5 = this.D;
                k50Var5.f29999x0 = 1.0f;
                k50Var5.f30001y0 = i10 / this.C;
            } else {
                k50 k50Var6 = this.D;
                k50Var6.f29999x0 = i11 / this.B;
                k50Var6.f30001y0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.D.f29999x0 + " scaleY = " + this.D.f30001y0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.f26933n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.f26933n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f26933n[i10] = null;
                }
            }
        }
        this.D.N = false;
        if (this.f26931e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.f26929b.eglGetCurrentContext()) || !this.f26931e.equals(this.f26929b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26929b;
                EGLDisplay eGLDisplay = this.f26930c;
                EGLSurface eGLSurface = this.f26931e;
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
        if (this.f26931e != null) {
            EGL10 egl11 = this.f26929b;
            EGLDisplay eGLDisplay2 = this.f26930c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.f26929b.eglDestroySurface(this.f26930c, this.f26931e);
            this.f26931e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.f26929b.eglDestroyContext(this.f26930c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.f26930c;
        if (eGLDisplay3 != null) {
            this.f26929b.eglTerminate(eGLDisplay3);
            this.f26930c = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        int currentOrientation;
        Object obj;
        boolean z11;
        j50 j50Var;
        int worldAngle;
        int i10 = message.what;
        final int i11 = 1;
        final int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.f26938y && ((!((z11 = (obj = message.obj) instanceof e50)) || ((e50) obj).f27953c != -2) && (j50Var = this.D.U0) != null)) {
                    j50Var.i(message.arg1, z11 ? (e50) obj : null);
                }
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                    return;
                }
                return;
            }
            int i13 = 6;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    k50 k50Var = this.D;
                    k50Var.W0 = 1 - k50Var.W0;
                    c();
                    k50 k50Var2 = this.D;
                    float f10 = (1.0f / k50Var2.f29999x0) / 2.0f;
                    float f11 = (1.0f / k50Var2.f30001y0) / 2.0f;
                    float f12 = 0.5f - f10;
                    float f13 = 0.5f - f11;
                    float f14 = f10 + 0.5f;
                    float f15 = f11 + 0.5f;
                    k50Var2.f29995v0 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(32));
                    this.D.f29995v0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera set gl renderer session");
                }
                Object obj2 = message.obj;
                Object obj3 = this.h;
                if (obj3 != obj2) {
                    this.h = obj2;
                    return;
                }
                if (obj3 instanceof CameraSession) {
                    worldAngle = ((CameraSession) obj3).getWorldAngle();
                } else {
                    worldAngle = obj3 instanceof Camera2Session ? ((Camera2Session) obj3).getWorldAngle() : 0;
                }
                Matrix.setIdentityM(this.D.f29990r0, 0);
                if (worldAngle != 0) {
                    Matrix.rotateM(this.D.f29990r0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                    return;
                }
                return;
            }
            EGL10 egl10 = this.f26929b;
            EGLDisplay eGLDisplay = this.f26930c;
            EGLSurface eGLSurface = this.f26931e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f26929b.eglGetError()));
                    return;
                }
                return;
            }
            SurfaceTexture surfaceTexture = this.f26933n[0];
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.D.f29993t0);
                this.f26933n[0].setOnFrameAvailableListener(null);
                this.f26933n[0].release();
                k50 k50Var3 = this.D;
                int[] iArr = k50Var3.Q;
                int[] iArr2 = k50Var3.P;
                iArr[0] = iArr2[0];
                k50Var3.R = 0.0f;
                iArr2[0] = 0;
                k50Var3.f29997w0 = k50Var3.f29995v0.duplicate();
                k50 k50Var4 = this.D;
                k50Var4.f30002z0 = k50Var4.f29975e0[0];
            }
            this.A = Integer.valueOf(this.A.intValue() + 1);
            this.D.B = false;
            GLES20.glGenTextures(1, this.D.P, 0);
            GLES20.glBindTexture(36197, this.D.P[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.f26933n[0] = new SurfaceTexture(this.D.P[0]);
            this.f26933n[0].setOnFrameAvailableListener(new iz(this, 1));
            AndroidUtilities.runOnUIThread(new km(this.D, i12, this.f26933n[0], i13));
            c();
            k50 k50Var5 = this.D;
            float f16 = (1.0f / k50Var5.f29999x0) / 2.0f;
            float f17 = (1.0f / k50Var5.f30001y0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            k50Var5.f29995v0 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(32));
            this.D.f29995v0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
            return;
        }
        int i14 = message.arg1;
        int i15 = message.arg2;
        boolean z12 = (i15 & 1) != 0;
        boolean z13 = (i15 & 2) != 0;
        if (this.f26932f) {
            if (!this.d.equals(this.f26929b.eglGetCurrentContext()) || !this.f26931e.equals(this.f26929b.eglGetCurrentSurface(12377))) {
                EGL10 egl11 = this.f26929b;
                EGLDisplay eGLDisplay2 = this.f26930c;
                EGLSurface eGLSurface2 = this.f26931e;
                if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z12) {
                this.f26933n[0].updateTexImage();
            }
            if (z13) {
                this.f26933n[1].updateTexImage();
            }
            if (this.f26938y) {
                z10 = false;
            } else {
                k50 k50Var6 = this.D;
                if (k50Var6.U0 == null) {
                    k50Var6.U0 = new j50(k50Var6);
                }
                k50 k50Var7 = this.D;
                if (k50Var7.U0.B0) {
                    if (!k50Var7.B) {
                        this.D.B = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) {

                            public final b50 f26633b;

                            {
                                this.f26633b = this;
                            }

                            @Override
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.f26633b.D.f29980i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        k50 k50Var8 = this.f26633b.D;
                                        if (k50Var8.f29979h0 != null) {
                                            Bitmap bitmap = k50Var8.V0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                k50Var8.V0 = null;
                                            }
                                            k50Var8.V0 = k50Var8.f29979h0.getBitmap();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    z10 = false;
                } else {
                    z10 = true;
                }
                k50 k50Var8 = this.D;
                j50 j50Var2 = k50Var8.U0;
                x40 x40Var = k50Var8.T;
                android.opengl.EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (j50Var2.B0 && j50Var2.P != null && j50Var2.P.getLooper() != null && j50Var2.P.getLooper().getThread() != null && j50Var2.P.getLooper().getThread().isAlive()) {
                    j50Var2.f29623w = eGLContextEglGetCurrentContext;
                    j50Var2.P.sendMessage(j50Var2.P.obtainMessage(0, 1, 0));
                }
                j50Var2.B0 = true;
                int i16 = MessagesController.getInstance(j50Var2.D0.f29967a).roundVideoSize;
                int i17 = MessagesController.getInstance(j50Var2.D0.f29967a).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new g50(j50Var2, i11));
                j50Var2.f29594a = x40Var;
                j50Var2.d = i16;
                j50Var2.f29601e = i16;
                j50Var2.f29603f = i17;
                j50Var2.f29623w = eGLContextEglGetCurrentContext;
                synchronized (j50Var2.Q) {
                    try {
                        if (!j50Var2.S) {
                            j50Var2.S = true;
                            Thread thread = new Thread(j50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!j50Var2.R) {
                                try {
                                    j50Var2.Q.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            j50Var2.f29624w0.clear();
                            j50Var2.f29628y0 = 0;
                            DispatchQueue dispatchQueue = j50Var2.f29626x0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                j50Var2.f29626x0.recycle();
                            }
                            j50Var2.f29626x0 = new DispatchQueue("keyframes_thumb_queue");
                            j50Var2.P.sendMessage(j50Var2.P.obtainMessage(0));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object obj4 = this.h;
                if (obj4 instanceof CameraSession) {
                    currentOrientation = ((CameraSession) obj4).getCurrentOrientation();
                } else {
                    currentOrientation = obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                }
                if (currentOrientation == 90 || currentOrientation == 270) {
                    k50 k50Var9 = this.D;
                    float f22 = k50Var9.f29999x0;
                    k50Var9.f29999x0 = k50Var9.f30001y0;
                    k50Var9.f30001y0 = f22;
                }
                this.f26938y = true;
                this.D.r();
            }
            k50 k50Var10 = this.D;
            if (k50Var10.U0 != null && ((k50Var10.W0 == 0 && z12) || (this.D.W0 == 1 && z13))) {
                k50 k50Var11 = this.D;
                j50 j50Var3 = k50Var11.U0;
                SurfaceTexture surfaceTexture2 = this.f26933n[k50Var11.W0];
                k50 k50Var12 = this.D;
                if (k50Var12.f29983l0) {
                    i14 = k50Var12.W0;
                }
                j50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.f26933n[this.D.W0].getTransformMatrix(this.D.f29992s0);
            GLES20.glUseProgram(this.f26934r);
            GLES20.glActiveTexture(33984);
            k50 k50Var13 = this.D;
            GLES20.glBindTexture(36197, k50Var13.P[k50Var13.W0]);
            GLES20.glVertexAttribPointer(this.f26936w, 3, 5126, false, 12, (Buffer) this.D.f29994u0);
            GLES20.glEnableVertexAttribArray(this.f26936w);
            GLES20.glVertexAttribPointer(this.f26937x, 2, 5126, false, 8, (Buffer) this.D.f29995v0);
            GLES20.glEnableVertexAttribArray(this.f26937x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.D.f29992s0, 0);
            GLES20.glUniformMatrix4fv(this.f26935s, 1, false, this.D.f29990r0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f26936w);
            GLES20.glDisableVertexAttribArray(this.f26937x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f26929b.eglSwapBuffers(this.f26930c, this.f26931e);
            if (z10) {
                AndroidUtilities.runOnUIThread(new Runnable(this) {

                    public final b50 f26633b;

                    {
                        this.f26633b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.f26633b.D.f29980i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                k50 k50Var14 = this.f26633b.D;
                                if (k50Var14.f29979h0 != null) {
                                    Bitmap bitmap = k50Var14.V0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        k50Var14.V0 = null;
                                    }
                                    k50Var14.V0 = k50Var14.f29979h0.getBitmap();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z10, boolean z11) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(0, this.A.intValue(), (z10 ? 1 : 0) + (z11 ? 2 : 0)), 0);
        }
    }

    @Override
    public final void run() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f26929b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26930c = eGLDisplayEglGetDisplay;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.f26929b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26929b.eglChooseConfig(this.f26930c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContextEglCreateContext = this.f26929b.eglCreateContext(this.f26930c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f26928a;
                    if (surfaceTexture != null) {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.f26929b.eglCreateWindowSurface(this.f26930c, eGLConfig, surfaceTexture, null);
                        this.f26931e = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.f26929b.eglMakeCurrent(this.f26930c, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.d)) {
                            c();
                            k50 k50Var = this.D;
                            float f10 = k50Var.f29999x0;
                            int[] iArr2 = k50Var.P;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / k50Var.f30001y0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            int i10 = 6;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (k50Var.U0 == null) {
                                k50Var.U0 = new j50(k50Var);
                            }
                            FloatBuffer floatBufferF = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(48));
                            k50Var.f29994u0 = floatBufferF;
                            floatBufferF.put(fArr).position(0);
                            FloatBuffer floatBufferF2 = org.telegram.messenger.rl.f(ByteBuffer.allocateDirect(32));
                            k50Var.f29995v0 = floatBufferF2;
                            floatBufferF2.put(fArr2).position(0);
                            Matrix.setIdentityM(k50Var.f29992s0, 0);
                            int iA = k50.a(k50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int iA2 = k50.a(k50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (iA == 0 || iA2 == 0) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int iGlCreateProgram = GLES20.glCreateProgram();
                                this.f26934r = iGlCreateProgram;
                                GLES20.glAttachShader(iGlCreateProgram, iA);
                                GLES20.glAttachShader(this.f26934r, iA2);
                                GLES20.glLinkProgram(this.f26934r);
                                int[] iArr3 = new int[1];
                                GLES20.glGetProgramiv(this.f26934r, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera failed link shader");
                                    }
                                    GLES20.glDeleteProgram(this.f26934r);
                                    this.f26934r = 0;
                                } else {
                                    this.f26936w = GLES20.glGetAttribLocation(this.f26934r, "aPosition");
                                    this.f26937x = GLES20.glGetAttribLocation(this.f26934r, "aTextureCoord");
                                    this.f26935s = GLES20.glGetUniformLocation(this.f26934r, "uMVPMatrix");
                                    this.v = GLES20.glGetUniformLocation(this.f26934r, "uSTMatrix");
                                }
                                Matrix.setIdentityM(k50Var.f29990r0, 0);
                                GLES20.glGenTextures(2, iArr2, 0);
                                for (final int i11 = 0; i11 < 2; i11++) {
                                    GLES20.glBindTexture(36197, iArr2[i11]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i11]);
                                    SurfaceTexture[] surfaceTextureArr = this.f26933n;
                                    surfaceTextureArr[i11] = surfaceTexture2;
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                                        @Override
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            b50 b50Var = this.f35147a;
                                            int i12 = i11;
                                            b50Var.D.N = true;
                                            b50Var.requestRender(i12 == 0, i12 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new km(k50Var, i11, surfaceTextureArr[i11], i10));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
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
        } else {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.rl.r(this.f26929b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f26932f = z10;
        super.run();
    }
}
