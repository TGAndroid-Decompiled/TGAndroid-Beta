package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class u61 extends TextureView implements TextureView.SurfaceTextureListener {
    public g71 f30820a;
    public vz f30821b;
    public final hk0 f30822c;
    public int d;
    public int f30823e;
    public di.n8 f30824f;
    public t61 h;
    public int f30825n;
    public int f30826r;
    public ja f30827s;

    public u61(Context context, g71 g71Var) {
        super(context);
        this.f30822c = new Object();
        this.f30820a = g71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hk0 hk0Var = this.f30822c;
        hk0Var.f26743a = f7;
        hk0Var.f26744b = f10;
        hk0Var.f26745c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        vz vzVar = this.f30821b;
        if (vzVar == null || (paVar = vzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f29335n) {
            try {
                if (!paVar.f29338q) {
                    return null;
                }
                return paVar.f29337p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30823e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30821b == null && surfaceTexture != null && this.f30820a != null) {
            vz vzVar = new vz(surfaceTexture, new kv(this, 28), this.f30824f, this.f30827s, i10, i11);
            this.f30821b = vzVar;
            vzVar.i(this.f30825n, this.f30826r);
            vz vzVar2 = this.f30821b;
            ja jaVar = this.f30827s;
            pa paVar = vzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29341t;
                if (jaVar2 != null && jaVar2.f27417m != null) {
                    jaVar2.f27417m = null;
                }
                paVar.f29341t = jaVar;
                if (jaVar != null && jaVar.f27417m != paVar) {
                    jaVar.f27417m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30823e) != 0) {
                vz vzVar3 = this.f30821b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f30821b.e(true, true, false);
            t61 t61Var = this.h;
            if (t61Var != null) {
                t61Var.c(this.f30821b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f30821b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f30821b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f30821b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f30821b.e(false, true, false);
            this.f30821b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(t61 t61Var) {
        this.h = t61Var;
        vz vzVar = this.f30821b;
        if (vzVar != null) {
            if (t61Var == null) {
                vzVar.f(null);
            } else {
                t61Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(di.n8 n8Var) {
        this.f30824f = n8Var;
        vz vzVar = this.f30821b;
        if (vzVar != null) {
            vzVar.postRunnable(new zu(8, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f30821b;
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
