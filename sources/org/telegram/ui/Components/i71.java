package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i71 extends TextureView implements TextureView.SurfaceTextureListener {
    public t71 f24902a;
    public vz f24903b;
    public final rk0 f24904c;
    public int d;
    public int e;
    public ci.n8 f24905f;
    public h71 h;
    public int f24906n;
    public int f24907r;
    public ia f24908s;

    public i71(Context context, t71 t71Var) {
        super(context);
        this.f24904c = new Object();
        this.f24902a = t71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        rk0 rk0Var = this.f24904c;
        rk0Var.f27913a = f7;
        rk0Var.f27914b = f10;
        rk0Var.f27915c = f11;
        rk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        vz vzVar = this.f24903b;
        if (vzVar == null || (oaVar = vzVar.I) == null) {
            return null;
        }
        synchronized (oaVar.f26877n) {
            try {
                if (!oaVar.f26880q) {
                    return null;
                }
                return oaVar.f26879p;
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
        if (this.f24903b == null && surfaceTexture != null && this.f24902a != null) {
            vz vzVar = new vz(surfaceTexture, new mv(this, 29), this.f24905f, this.f24908s, i10, i11);
            this.f24903b = vzVar;
            vzVar.i(this.f24906n, this.f24907r);
            vz vzVar2 = this.f24903b;
            ia iaVar = this.f24908s;
            oa oaVar = vzVar2.I;
            if (oaVar != null) {
                ia iaVar2 = oaVar.f26883t;
                if (iaVar2 != null && iaVar2.f24979m != null) {
                    iaVar2.f24979m = null;
                }
                oaVar.f26883t = iaVar;
                if (iaVar != null && iaVar.f24979m != oaVar) {
                    iaVar.f24979m = oaVar;
                    iaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f24903b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f24903b.e(true, true, false);
            h71 h71Var = this.h;
            if (h71Var != null) {
                h71Var.c(this.f24903b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f24903b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f24903b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f24903b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f24903b.e(false, true, false);
            this.f24903b.postRunnable(new wq0(this, 29));
        }
    }

    public void setDelegate(h71 h71Var) {
        this.h = h71Var;
        vz vzVar = this.f24903b;
        if (vzVar != null) {
            if (h71Var == null) {
                vzVar.f(null);
            } else {
                h71Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f24905f = n8Var;
        vz vzVar = this.f24903b;
        if (vzVar != null) {
            vzVar.postRunnable(new bv(8, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f24903b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = vzVar.I;
            if (oaVar != null) {
                Matrix matrix2 = oaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
