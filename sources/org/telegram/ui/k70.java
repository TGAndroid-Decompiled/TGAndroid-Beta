package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Intro;
import org.telegram.messenger.R;

public final class k70 extends DispatchQueue {

    public static final int f39633y = 0;

    public final SurfaceTexture f39634a;

    public EGL10 f39635b;

    public EGLDisplay f39636c;
    public EGLConfig d;

    public EGLContext f39637e;

    public EGLSurface f39638f;
    public boolean h;

    public final int[] f39639n;

    public float f39640r;

    public long f39641s;
    public final j70 v;

    public final w5 f39642w;

    public final l70 f39643x;

    public k70(l70 l70Var, SurfaceTexture surfaceTexture) {
        super("EGLThread");
        this.f39643x = l70Var;
        this.f39639n = new int[24];
        this.v = new j70(0);
        this.f39642w = new w5(this, 7);
        this.f39634a = surfaceTexture;
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        Drawable drawable = this.f39643x.getParentActivity().getResources().getDrawable(i10);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f39639n;
            if (z10) {
                GLES20.glDeleteTextures(1, iArr, i11);
                GLES20.glGenTextures(1, iArr, i11);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i11]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i12 == 0) {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(5);
            paint.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
            bitmapCreateBitmap.recycle();
        }
    }

    public final void c(GenericProvider genericProvider, int i10, boolean z10) {
        int[] iArr = this.f39639n;
        if (z10) {
            GLES20.glDeleteTextures(1, iArr, i10);
            GLES20.glGenTextures(1, iArr, i10);
        }
        Bitmap bitmap = (Bitmap) genericProvider.provide(null);
        GLES20.glBindTexture(3553, iArr[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void finish() {
        if (this.f39638f != null) {
            EGL10 egl10 = this.f39635b;
            EGLDisplay eGLDisplay = this.f39636c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f39635b.eglDestroySurface(this.f39636c, this.f39638f);
            this.f39638f = null;
        }
        EGLContext eGLContext = this.f39637e;
        if (eGLContext != null) {
            this.f39635b.eglDestroyContext(this.f39636c, eGLContext);
            this.f39637e = null;
        }
        EGLDisplay eGLDisplay2 = this.f39636c;
        if (eGLDisplay2 != null) {
            this.f39635b.eglTerminate(eGLDisplay2);
            this.f39636c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f39635b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f39636c = eGLDisplayEglGetDisplay;
        boolean z10 = false;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (this.f39635b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            l70 l70Var = this.f39643x;
            if (!this.f39635b.eglChooseConfig(this.f39636c, EmuDetector.with(l70Var.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eGLContextEglCreateContext = this.f39635b.eglCreateContext(this.f39636c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f39637e = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f39634a;
                    if (surfaceTexture != null) {
                        EGLSurface eGLSurfaceEglCreateWindowSurface = this.f39635b.eglCreateWindowSurface(this.f39636c, this.d, surfaceTexture, null);
                        this.f39638f = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.f39635b.eglMakeCurrent(this.f39636c, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f39637e)) {
                            int[] iArr2 = this.f39639n;
                            GLES20.glGenTextures(23, iArr2, 0);
                            b(R.drawable.intro_fast_arrow_shadow, 0, 0, false);
                            b(R.drawable.intro_fast_arrow, 1, 0, false);
                            b(R.drawable.intro_fast_body, 2, 0, false);
                            b(R.drawable.intro_fast_spiral, 3, 0, false);
                            b(R.drawable.intro_ic_bubble_dot, 4, 0, false);
                            b(R.drawable.intro_ic_bubble, 5, 0, false);
                            b(R.drawable.intro_ic_cam_lens, 6, 0, false);
                            b(R.drawable.intro_ic_cam, 7, 0, false);
                            b(R.drawable.intro_ic_pencil, 8, 0, false);
                            b(R.drawable.intro_ic_pin, 9, 0, false);
                            b(R.drawable.intro_ic_smile_eye, 10, 0, false);
                            b(R.drawable.intro_ic_smile, 11, 0, false);
                            b(R.drawable.intro_ic_videocam, 12, 0, false);
                            b(R.drawable.intro_knot_down, 13, 0, false);
                            b(R.drawable.intro_knot_up, 14, 0, false);
                            b(R.drawable.intro_powerful_infinity_white, 15, 0, false);
                            b(R.drawable.intro_powerful_infinity, 16, 0, false);
                            b(R.drawable.intro_powerful_mask, 17, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), false);
                            b(R.drawable.intro_powerful_star, 18, 0, false);
                            b(R.drawable.intro_private_door, 19, 0, false);
                            b(R.drawable.intro_private_screw, 20, 0, false);
                            b(R.drawable.intro_tg_plane, 21, 0, false);
                            c(new j70(1), 22, false);
                            c(this.v, 23, false);
                            Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                            Intro.setPowerfulTextures(iArr2[17], iArr2[18], iArr2[16], iArr2[15]);
                            Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                            Intro.setFreeTextures(iArr2[14], iArr2[13]);
                            Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                            Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                            Intro.onSurfaceCreated();
                            l70Var.F = System.currentTimeMillis() - 1000;
                            z10 = true;
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.rl.r(this.f39635b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        }
        this.h = z10;
        super.run();
    }
}
