package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class l61 extends TextureView implements TextureView.SurfaceTextureListener {
    public v61 f28062a;
    public gz f28063b;
    public final pj0 f28064c;
    public int d;
    public int e;
    public vh.m5 f28065f;
    public k61 h;
    public int f28066n;
    public int f28067r;
    public s9 f28068s;

    public l61(Context context, v61 v61Var) {
        super(context);
        this.f28064c = new Object();
        this.f28062a = v61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        pj0 pj0Var = this.f28064c;
        pj0Var.f29439a = f7;
        pj0Var.f29440b = f10;
        pj0Var.f29441c = f11;
        pj0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        x9 x9Var;
        gz gzVar = this.f28063b;
        if (gzVar == null || (x9Var = gzVar.I) == null) {
            return null;
        }
        synchronized (x9Var.f32518n) {
            try {
                if (!x9Var.f32521q) {
                    return null;
                }
                return x9Var.f32520p;
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
        if (this.f28063b == null && surfaceTexture != null && this.f28062a != null) {
            gz gzVar = new gz(surfaceTexture, new px(this, 26), this.f28065f, this.f28068s, i10, i11);
            this.f28063b = gzVar;
            gzVar.h(this.f28066n, this.f28067r);
            gz gzVar2 = this.f28063b;
            s9 s9Var = this.f28068s;
            x9 x9Var = gzVar2.I;
            if (x9Var != null) {
                s9 s9Var2 = x9Var.f32524t;
                if (s9Var2 != null && s9Var2.f30248m != null) {
                    s9Var2.f30248m = null;
                }
                x9Var.f32524t = s9Var;
                if (s9Var != null && s9Var.f30248m != x9Var) {
                    s9Var.f30248m = x9Var;
                    s9Var.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                gz gzVar3 = this.f28063b;
                gzVar3.getClass();
                gzVar3.postRunnable(new cz(gzVar3, i13, i12, 0));
            }
            this.f28063b.c(true, true, false);
            k61 k61Var = this.h;
            if (k61Var != null) {
                k61Var.b(this.f28063b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gz gzVar = this.f28063b;
        if (gzVar != null) {
            gzVar.postRunnable(new dz(gzVar, 0));
            this.f28063b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        gz gzVar = this.f28063b;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            this.f28063b.c(false, true, false);
            this.f28063b.postRunnable(new k51(this, 2));
        }
    }

    public void setDelegate(k61 k61Var) {
        this.h = k61Var;
        gz gzVar = this.f28063b;
        if (gzVar != null) {
            if (k61Var == null) {
                gzVar.d(null);
            } else {
                k61Var.b(gzVar);
            }
        }
    }

    public void setHDRInfo(vh.m5 m5Var) {
        this.f28065f = m5Var;
        gz gzVar = this.f28063b;
        if (gzVar != null) {
            gzVar.postRunnable(new at(10, gzVar, m5Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        gz gzVar = this.f28063b;
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
