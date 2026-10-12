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
public final class d80 extends DispatchQueue {
    public static final int f36676y = 0;
    public final SurfaceTexture f36677a;
    public EGL10 f36678b;
    public EGLDisplay f36679c;
    public EGLConfig d;
    public EGLContext f36680e;
    public EGLSurface f36681f;
    public boolean h;
    public final int[] f36682n;
    public float f36683r;
    public long f36684s;
    public final c80 v;
    public final z5 f36685w;
    public final f80 f36686x;

    public d80(f80 f80Var, SurfaceTexture surfaceTexture) {
        super("EGLThread");
        this.f36686x = f80Var;
        this.f36682n = new int[24];
        this.v = new c80(0);
        this.f36685w = new z5(this, 7);
        this.f36677a = surfaceTexture;
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        Drawable drawable = this.f36686x.getParentActivity().getResources().getDrawable(i10);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f36682n;
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
        int[] iArr = this.f36682n;
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
        if (this.f36681f != null) {
            EGL10 egl10 = this.f36678b;
            EGLDisplay eGLDisplay = this.f36679c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f36678b.eglDestroySurface(this.f36679c, this.f36681f);
            this.f36681f = null;
        }
        EGLContext eGLContext = this.f36680e;
        if (eGLContext != null) {
            this.f36678b.eglDestroyContext(this.f36679c, eGLContext);
            this.f36680e = null;
        }
        EGLDisplay eGLDisplay2 = this.f36679c;
        if (eGLDisplay2 != null) {
            this.f36678b.eglTerminate(eGLDisplay2);
            this.f36679c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f36678b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f36679c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.am.v(this.f36678b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f36678b.eglInitialize(eglGetDisplay, new int[2])) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.am.v(this.f36678b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            f80 f80Var = this.f36686x;
            if (!this.f36678b.eglChooseConfig(this.f36679c, EmuDetector.with(f80Var.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.am.v(this.f36678b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f36678b.eglCreateContext(this.f36679c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f36680e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.am.v(this.f36678b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f36677a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f36678b.eglCreateWindowSurface(this.f36679c, this.d, surfaceTexture, null);
                        this.f36681f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f36678b.eglMakeCurrent(this.f36679c, eglCreateWindowSurface, eglCreateWindowSurface, this.f36680e)) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.am.v(this.f36678b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f36682n;
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
                                b(R.drawable.intro_powerful_mask, 17, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), false);
                                b(R.drawable.intro_powerful_star, 18, 0, false);
                                b(R.drawable.intro_private_door, 19, 0, false);
                                b(R.drawable.intro_private_screw, 20, 0, false);
                                b(R.drawable.intro_tg_plane, 21, 0, false);
                                c(new c80(1), 22, false);
                                c(this.v, 23, false);
                                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                                Intro.setPowerfulTextures(iArr2[17], iArr2[18], iArr2[16], iArr2[15]);
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                f80Var.J = System.currentTimeMillis() - 1000;
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.am.v(this.f36678b, new StringBuilder("createWindowSurface failed "));
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
