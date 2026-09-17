package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class u61 extends TextureView implements TextureView.SurfaceTextureListener {
    public g71 f30848a;
    public vz f30849b;
    public final hk0 f30850c;
    public int d;
    public int f30851e;
    public di.n8 f30852f;
    public t61 h;
    public int f30853n;
    public int f30854r;
    public ja f30855s;

    public u61(Context context, g71 g71Var) {
        super(context);
        this.f30850c = new Object();
        this.f30848a = g71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hk0 hk0Var = this.f30850c;
        hk0Var.f26771a = f7;
        hk0Var.f26772b = f10;
        hk0Var.f26773c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        vz vzVar = this.f30849b;
        if (vzVar == null || (paVar = vzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f29363n) {
            try {
                if (!paVar.f29366q) {
                    return null;
                }
                return paVar.f29365p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30851e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30849b == null && surfaceTexture != null && this.f30848a != null) {
            vz vzVar = new vz(surfaceTexture, new kv(this, 28), this.f30852f, this.f30855s, i10, i11);
            this.f30849b = vzVar;
            vzVar.i(this.f30853n, this.f30854r);
            vz vzVar2 = this.f30849b;
            ja jaVar = this.f30855s;
            pa paVar = vzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29369t;
                if (jaVar2 != null && jaVar2.f27445m != null) {
                    jaVar2.f27445m = null;
                }
                paVar.f29369t = jaVar;
                if (jaVar != null && jaVar.f27445m != paVar) {
                    jaVar.f27445m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30851e) != 0) {
                vz vzVar3 = this.f30849b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f30849b.e(true, true, false);
            t61 t61Var = this.h;
            if (t61Var != null) {
                t61Var.c(this.f30849b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f30849b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f30849b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f30849b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f30849b.e(false, true, false);
            this.f30849b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(t61 t61Var) {
        this.h = t61Var;
        vz vzVar = this.f30849b;
        if (vzVar != null) {
            if (t61Var == null) {
                vzVar.f(null);
            } else {
                t61Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(di.n8 n8Var) {
        this.f30852f = n8Var;
        vz vzVar = this.f30849b;
        if (vzVar != null) {
            vzVar.postRunnable(new zu(8, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f30849b;
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
