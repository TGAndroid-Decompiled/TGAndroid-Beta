package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class b81 extends TextureView implements TextureView.SurfaceTextureListener {
    public l81 f24934a;
    public m00 f24935b;
    public final nl0 f24936c;
    public int d;
    public int f24937e;
    public ci.k8 f24938f;
    public a81 h;
    public int f24939n;
    public int f24940r;
    public la f24941s;

    public b81(Context context, l81 l81Var) {
        super(context);
        this.f24936c = new Object();
        this.f24934a = l81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        nl0 nl0Var = this.f24936c;
        nl0Var.f29188a = f7;
        nl0Var.f29189b = f10;
        nl0Var.f29190c = f11;
        nl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        m00 m00Var = this.f24935b;
        if (m00Var == null || (raVar = m00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f30476n) {
            try {
                if (!raVar.f30479q) {
                    return null;
                }
                return raVar.f30478p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f24937e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f24935b == null && surfaceTexture != null && this.f24934a != null) {
            m00 m00Var = new m00(surfaceTexture, new cw(this, 29), this.f24938f, this.f24941s, i10, i11);
            this.f24935b = m00Var;
            m00Var.i(this.f24939n, this.f24940r);
            m00 m00Var2 = this.f24935b;
            la laVar = this.f24941s;
            ra raVar = m00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f30482t;
                if (laVar2 != null && laVar2.f28327m != null) {
                    laVar2.f28327m = null;
                }
                raVar.f30482t = laVar;
                if (laVar != null && laVar.f28327m != raVar) {
                    laVar.f28327m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f24937e) != 0) {
                m00 m00Var3 = this.f24935b;
                m00Var3.getClass();
                m00Var3.postRunnable(new i00(m00Var3, i13, i12, 0));
            }
            this.f24935b.e(true, true, false);
            a81 a81Var = this.h;
            if (a81Var != null) {
                a81Var.b(this.f24935b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m00 m00Var = this.f24935b;
        if (m00Var != null) {
            m00Var.postRunnable(new j00(m00Var, 0));
            this.f24935b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        m00 m00Var = this.f24935b;
        if (m00Var != null) {
            m00Var.postRunnable(new i00(m00Var, i10, i11, 1));
            this.f24935b.e(false, true, false);
            this.f24935b.postRunnable(new z71(this, 0));
        }
    }

    public void setDelegate(a81 a81Var) {
        this.h = a81Var;
        m00 m00Var = this.f24935b;
        if (m00Var != null) {
            if (a81Var == null) {
                m00Var.f(null);
            } else {
                a81Var.b(m00Var);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f24938f = k8Var;
        m00 m00Var = this.f24935b;
        if (m00Var != null) {
            m00Var.postRunnable(new bs(13, m00Var, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        m00 m00Var = this.f24935b;
        if (m00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = m00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                m00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
