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
import org.telegram.messenger.Intro;
public final class n50 extends org.telegram.messenger.q5 {
    public static final int E = 0;
    public final SurfaceTexture f47882a;
    public EGL10 f47883b;
    public EGLDisplay f47884c;
    public EGLConfig d;
    public EGLContext f47885e;
    public EGLSurface f47886f;
    public boolean h;
    public final int[] f47887n;
    public float f47888r;
    public long f47889s;
    public final org.telegram.ui.Components.lf0 f47890w;
    public final o4 f47891x;
    public final o50 f47892y;

    public n50(o50 o50Var, SurfaceTexture surfaceTexture) {
        super("EGLThread", true);
        this.f47892y = o50Var;
        this.f47887n = new int[24];
        this.f47890w = new org.telegram.ui.Components.lf0(26);
        this.f47891x = new o4(this, 9);
        this.f47882a = surfaceTexture;
    }

    public final void a(int i3, int i10, int i11, boolean z10) {
        Drawable drawable = this.f47892y.getParentActivity().getResources().getDrawable(i3);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.f47887n;
            if (z10) {
                GLES20.glDeleteTextures(1, iArr, i10);
                GLES20.glGenTextures(1, iArr, i10);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i11 != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(5);
                paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                GLUtils.texImage2D(3553, 0, createBitmap, 0);
                createBitmap.recycle();
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public final void b(org.telegram.messenger.e9 e9Var, int i3, boolean z10) {
        int[] iArr = this.f47887n;
        if (z10) {
            GLES20.glDeleteTextures(1, iArr, i3);
            GLES20.glGenTextures(1, iArr, i3);
        }
        Bitmap bitmap = (Bitmap) e9Var.k(null);
        GLES20.glBindTexture(3553, iArr[i3]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void c() {
        int[] iArr = this.f47887n;
        Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
    }

    public final void e() {
        int[] iArr = this.f47887n;
        Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
    }

    public final void finish() {
        if (this.f47886f != null) {
            EGL10 egl10 = this.f47883b;
            EGLDisplay eGLDisplay = this.f47884c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f47883b.eglDestroySurface(this.f47884c, this.f47886f);
            this.f47886f = null;
        }
        EGLContext eGLContext = this.f47885e;
        if (eGLContext != null) {
            this.f47883b.eglDestroyContext(this.f47884c, eGLContext);
            this.f47885e = null;
        }
        EGLDisplay eGLDisplay2 = this.f47884c;
        if (eGLDisplay2 != null) {
            this.f47883b.eglTerminate(eGLDisplay2);
            this.f47884c = null;
        }
    }

    @Override
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f47883b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f47884c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (!this.f47883b.eglInitialize(eglGetDisplay, new int[2])) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            o50 o50Var = this.f47892y;
            if (!this.f47883b.eglChooseConfig(this.f47884c, org.telegram.messenger.n6.h(o50Var.getParentActivity()).f() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.f47883b.eglCreateContext(this.f47884c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f47885e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.f25040a) {
                        org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.f47882a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.f47883b.eglCreateWindowSurface(this.f47884c, this.d, surfaceTexture, null);
                        this.f47886f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                            if (!this.f47883b.eglMakeCurrent(this.f47884c, eglCreateWindowSurface, eglCreateWindowSurface, this.f47885e)) {
                                if (org.telegram.messenger.r2.f25040a) {
                                    org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            } else {
                                int[] iArr2 = this.f47887n;
                                GLES20.glGenTextures(23, iArr2, 0);
                                a(2131231519, 0, 0, false);
                                a(2131231518, 1, 0, false);
                                a(2131231520, 2, 0, false);
                                a(2131231521, 3, 0, false);
                                a(2131231523, 4, 0, false);
                                a(2131231522, 5, 0, false);
                                a(2131231525, 6, 0, false);
                                a(2131231524, 7, 0, false);
                                a(2131231526, 8, 0, false);
                                a(2131231527, 9, 0, false);
                                a(2131231529, 10, 0, false);
                                a(2131231528, 11, 0, false);
                                a(2131231530, 12, 0, false);
                                a(2131231531, 13, 0, false);
                                a(2131231532, 14, 0, false);
                                a(2131231534, 15, 0, false);
                                a(2131231533, 16, 0, false);
                                a(2131231535, 17, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), false);
                                a(2131231536, 18, 0, false);
                                a(2131231537, 19, 0, false);
                                a(2131231538, 20, 0, false);
                                a(2131231539, 21, 0, false);
                                b(new org.telegram.ui.Components.lf0(27), 22, false);
                                b(this.f47890w, 23, false);
                                e();
                                c();
                                Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                                Intro.setFreeTextures(iArr2[14], iArr2[13]);
                                Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                                Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                                Intro.onSurfaceCreated();
                                o50Var.K = System.currentTimeMillis() - 1000;
                                z10 = true;
                            }
                        } else {
                            if (org.telegram.messenger.r2.f25040a) {
                                org.telegram.messenger.camera.q.t(this.f47883b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.d("eglConfig not initialized");
                }
                finish();
            }
        }
        this.h = z10;
        super.run();
    }
}
