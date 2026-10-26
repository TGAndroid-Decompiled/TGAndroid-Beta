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
public final class n70 extends DispatchQueue {
    public static final int f41766y = 0;
    public final SurfaceTexture f41767a;
    public EGL10 f41768b;
    public EGLDisplay f41769c;
    public EGLConfig d;
    public EGLContext e;
    public EGLSurface f41770f;
    public boolean h;
    public final int[] f41771n;
    public float f41772r;
    public long f41773s;
    public final org.telegram.ui.Components.voip.c1 v;
    public final y5 f41774w;
    public final p70 f41775x;

    public n70(p70 p70Var, SurfaceTexture surfaceTexture) {
        super("EGLThread");
        this.f41775x = p70Var;
        this.f41771n = new int[24];
        this.v = new org.telegram.ui.Components.voip.c1(9);
        this.f41774w = new y5(this, 8);
        this.f41767a = surfaceTexture;
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        Drawable drawable = this.f41775x.getParentActivity().getResources().getDrawable(i10);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f41771n;
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
            if (i12 != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(5);
                paint.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                createBitmap.recycle();
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public final void c(GenericProvider genericProvider, int i10, boolean z10) {
        int[] iArr = this.f41771n;
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

    public final void d() {
        int[] iArr = this.f41771n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void f() {
        int[] iArr = this.f41771n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f41770f != null) {
            EGL10 egl10 = this.f41768b;
            EGLDisplay eGLDisplay = this.f41769c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f41768b.eglDestroySurface(this.f41769c, this.f41770f);
            this.f41770f = null;
        }
        EGLContext eGLContext = this.e;
        if (eGLContext != null) {
            this.f41768b.eglDestroyContext(this.f41769c, eGLContext);
            this.e = null;
        }
        EGLDisplay eGLDisplay2 = this.f41769c;
        if (eGLDisplay2 != null) {
            this.f41768b.eglTerminate(eGLDisplay2);
            this.f41769c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f41768b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f41769c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f41768b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            p70 p70Var = this.f41775x;
            if (!this.f41768b.eglChooseConfig(this.f41769c, EmuDetector.with(p70Var.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f41768b.eglCreateContext(this.f41769c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f41767a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f41768b.eglCreateWindowSurface(this.f41769c, this.d, surfaceTexture, null);
                        this.f41770f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f41768b.eglMakeCurrent(this.f41769c, eglCreateWindowSurface, eglCreateWindowSurface, this.e)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f41771n;
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
                                b(R.drawable.intro_powerful_mask, 17, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false), false);
                                b(R.drawable.intro_powerful_star, 18, 0, false);
                                b(R.drawable.intro_private_door, 19, 0, false);
                                b(R.drawable.intro_private_screw, 20, 0, false);
                                b(R.drawable.intro_tg_plane, 21, 0, false);
                                c(new org.telegram.ui.Components.voip.c1(10), 22, false);
                                c(this.v, 23, false);
                                f();
                                d();
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                p70Var.J = System.currentTimeMillis() - 1000;
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.vh.t(this.f41768b, new StringBuilder("createWindowSurface failed "));
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
        }
        this.h = z10;
        super.run();
    }
}
