package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class u61 extends TextureView implements TextureView.SurfaceTextureListener {
    public g71 f30821a;
    public vz f30822b;
    public final hk0 f30823c;
    public int d;
    public int f30824e;
    public di.n8 f30825f;
    public t61 h;
    public int f30826n;
    public int f30827r;
    public ja f30828s;

    public u61(Context context, g71 g71Var) {
        super(context);
        this.f30823c = new Object();
        this.f30821a = g71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hk0 hk0Var = this.f30823c;
        hk0Var.f26744a = f7;
        hk0Var.f26745b = f10;
        hk0Var.f26746c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        vz vzVar = this.f30822b;
        if (vzVar == null || (paVar = vzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f29336n) {
            try {
                if (!paVar.f29339q) {
                    return null;
                }
                return paVar.f29338p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30824e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30822b == null && surfaceTexture != null && this.f30821a != null) {
            vz vzVar = new vz(surfaceTexture, new kv(this, 28), this.f30825f, this.f30828s, i10, i11);
            this.f30822b = vzVar;
            vzVar.i(this.f30826n, this.f30827r);
            vz vzVar2 = this.f30822b;
            ja jaVar = this.f30828s;
            pa paVar = vzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29342t;
                if (jaVar2 != null && jaVar2.f27418m != null) {
                    jaVar2.f27418m = null;
                }
                paVar.f29342t = jaVar;
                if (jaVar != null && jaVar.f27418m != paVar) {
                    jaVar.f27418m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30824e) != 0) {
                vz vzVar3 = this.f30822b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f30822b.e(true, true, false);
            t61 t61Var = this.h;
            if (t61Var != null) {
                t61Var.c(this.f30822b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f30822b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f30822b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f30822b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f30822b.e(false, true, false);
            this.f30822b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(t61 t61Var) {
        this.h = t61Var;
        vz vzVar = this.f30822b;
        if (vzVar != null) {
            if (t61Var == null) {
                vzVar.f(null);
            } else {
                t61Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(di.n8 n8Var) {
        this.f30825f = n8Var;
        vz vzVar = this.f30822b;
        if (vzVar != null) {
            vzVar.postRunnable(new zu(8, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f30822b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = vzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
