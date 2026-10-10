package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class a81 extends TextureView implements TextureView.SurfaceTextureListener {
    public l81 f24508a;
    public m00 f24509b;
    public final nl0 f24510c;
    public int d;
    public int f24511e;
    public ci.k8 f24512f;
    public z71 h;
    public int f24513n;
    public int f24514r;
    public ma f24515s;

    public a81(Context context, l81 l81Var) {
        super(context);
        this.f24510c = new Object();
        this.f24508a = l81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        nl0 nl0Var = this.f24510c;
        nl0Var.f29146a = f7;
        nl0Var.f29147b = f10;
        nl0Var.f29148c = f11;
        nl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        sa saVar;
        m00 m00Var = this.f24509b;
        if (m00Var == null || (saVar = m00Var.I) == null) {
            return null;
        }
        synchronized (saVar.f30735n) {
            try {
                if (!saVar.f30738q) {
                    return null;
                }
                return saVar.f30737p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f24511e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f24509b == null && surfaceTexture != null && this.f24508a != null) {
            m00 m00Var = new m00(surfaceTexture, new cw(this, 29), this.f24512f, this.f24515s, i10, i11);
            this.f24509b = m00Var;
            m00Var.i(this.f24513n, this.f24514r);
            m00 m00Var2 = this.f24509b;
            ma maVar = this.f24515s;
            sa saVar = m00Var2.I;
            if (saVar != null) {
                ma maVar2 = saVar.f30741t;
                if (maVar2 != null && maVar2.f28747m != null) {
                    maVar2.f28747m = null;
                }
                saVar.f30741t = maVar;
                if (maVar != null && maVar.f28747m != saVar) {
                    maVar.f28747m = saVar;
                    maVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f24511e) != 0) {
                m00 m00Var3 = this.f24509b;
                m00Var3.getClass();
                m00Var3.postRunnable(new i00(m00Var3, i13, i12, 0));
            }
            this.f24509b.e(true, true, false);
            z71 z71Var = this.h;
            if (z71Var != null) {
                z71Var.b(this.f24509b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m00 m00Var = this.f24509b;
        if (m00Var != null) {
            m00Var.postRunnable(new j00(m00Var, 0));
            this.f24509b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        m00 m00Var = this.f24509b;
        if (m00Var != null) {
            m00Var.postRunnable(new i00(m00Var, i10, i11, 1));
            this.f24509b.e(false, true, false);
            this.f24509b.postRunnable(new pr0(this, 29));
        }
    }

    public void setDelegate(z71 z71Var) {
        this.h = z71Var;
        m00 m00Var = this.f24509b;
        if (m00Var != null) {
            if (z71Var == null) {
                m00Var.f(null);
            } else {
                z71Var.b(m00Var);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f24512f = k8Var;
        m00 m00Var = this.f24509b;
        if (m00Var != null) {
            m00Var.postRunnable(new as(14, m00Var, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        m00 m00Var = this.f24509b;
        if (m00Var != null) {
            int width = getWidth();
            int height = getHeight();
            sa saVar = m00Var.I;
            if (saVar != null) {
                Matrix matrix2 = saVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                saVar.c(matrix2);
                m00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
