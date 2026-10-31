package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class k61 extends TextureView implements TextureView.SurfaceTextureListener {
    public u61 f27646a;
    public gz f27647b;
    public final oj0 f27648c;
    public int d;
    public int e;
    public vh.m5 f27649f;
    public j61 h;
    public int f27650n;
    public int f27651r;
    public s9 f27652s;

    public k61(Context context, u61 u61Var) {
        super(context);
        this.f27648c = new Object();
        this.f27646a = u61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        oj0 oj0Var = this.f27648c;
        oj0Var.f29084a = f7;
        oj0Var.f29085b = f10;
        oj0Var.f29086c = f11;
        oj0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        x9 x9Var;
        gz gzVar = this.f27647b;
        if (gzVar == null || (x9Var = gzVar.I) == null) {
            return null;
        }
        synchronized (x9Var.f32439n) {
            try {
                if (!x9Var.f32442q) {
                    return null;
                }
                return x9Var.f32441p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f27647b == null && surfaceTexture != null && this.f27646a != null) {
            gz gzVar = new gz(surfaceTexture, new px(this, 26), this.f27649f, this.f27652s, i10, i11);
            this.f27647b = gzVar;
            gzVar.h(this.f27650n, this.f27651r);
            gz gzVar2 = this.f27647b;
            s9 s9Var = this.f27652s;
            x9 x9Var = gzVar2.I;
            if (x9Var != null) {
                s9 s9Var2 = x9Var.f32445t;
                if (s9Var2 != null && s9Var2.f30202m != null) {
                    s9Var2.f30202m = null;
                }
                x9Var.f32445t = s9Var;
                if (s9Var != null && s9Var.f30202m != x9Var) {
                    s9Var.f30202m = x9Var;
                    s9Var.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                gz gzVar3 = this.f27647b;
                gzVar3.getClass();
                gzVar3.postRunnable(new cz(gzVar3, i13, i12, 0));
            }
            this.f27647b.c(true, true, false);
            j61 j61Var = this.h;
            if (j61Var != null) {
                j61Var.b(this.f27647b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gz gzVar = this.f27647b;
        if (gzVar != null) {
            gzVar.postRunnable(new dz(gzVar, 0));
            this.f27647b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        gz gzVar = this.f27647b;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            this.f27647b.c(false, true, false);
            this.f27647b.postRunnable(new j51(this, 2));
        }
    }

    public void setDelegate(j61 j61Var) {
        this.h = j61Var;
        gz gzVar = this.f27647b;
        if (gzVar != null) {
            if (j61Var == null) {
                gzVar.d(null);
            } else {
                j61Var.b(gzVar);
            }
        }
    }

    public void setHDRInfo(vh.m5 m5Var) {
        this.f27649f = m5Var;
        gz gzVar = this.f27647b;
        if (gzVar != null) {
            gzVar.postRunnable(new at(10, gzVar, m5Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        gz gzVar = this.f27647b;
        if (gzVar != null) {
            int width = getWidth();
            int height = getHeight();
            x9 x9Var = gzVar.I;
            if (x9Var != null) {
                Matrix matrix2 = x9Var.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                x9Var.c(matrix2);
                gzVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
