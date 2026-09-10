package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class h71 extends TextureView implements TextureView.SurfaceTextureListener {
    public t71 f23537a;
    public c00 f23538b;
    public final rk0 f23539c;
    public int d;
    public int e;
    public bi.q9 f23540f;
    public g71 h;
    public int f23541n;
    public int f23542r;
    public ia f23543s;

    public h71(Context context, t71 t71Var) {
        super(context);
        this.f23539c = new Object();
        this.f23537a = t71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        rk0 rk0Var = this.f23539c;
        rk0Var.f26681a = f7;
        rk0Var.f26682b = f10;
        rk0Var.f26683c = f11;
        rk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        c00 c00Var = this.f23538b;
        if (c00Var == null || (oaVar = c00Var.I) == null) {
            return null;
        }
        synchronized (oaVar.f25746n) {
            try {
                if (!oaVar.f25749q) {
                    return null;
                }
                return oaVar.f25748p;
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
        if (this.f23538b == null && surfaceTexture != null && this.f23537a != null) {
            c00 c00Var = new c00(surfaceTexture, new pv(this, 28), this.f23540f, this.f23543s, i10, i11);
            this.f23538b = c00Var;
            c00Var.i(this.f23541n, this.f23542r);
            c00 c00Var2 = this.f23538b;
            ia iaVar = this.f23543s;
            oa oaVar = c00Var2.I;
            if (oaVar != null) {
                ia iaVar2 = oaVar.f25752t;
                if (iaVar2 != null && iaVar2.f23972m != null) {
                    iaVar2.f23972m = null;
                }
                oaVar.f25752t = iaVar;
                if (iaVar != null && iaVar.f23972m != oaVar) {
                    iaVar.f23972m = oaVar;
                    iaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                c00 c00Var3 = this.f23538b;
                c00Var3.getClass();
                c00Var3.postRunnable(new yz(c00Var3, i13, i12, 0));
            }
            this.f23538b.e(true, true, false);
            g71 g71Var = this.h;
            if (g71Var != null) {
                g71Var.c(this.f23538b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c00 c00Var = this.f23538b;
        if (c00Var != null) {
            c00Var.postRunnable(new zz(c00Var, 0));
            this.f23538b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c00 c00Var = this.f23538b;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            this.f23538b.e(false, true, false);
            this.f23538b.postRunnable(new uq0(this, 29));
        }
    }

    public void setDelegate(g71 g71Var) {
        this.h = g71Var;
        c00 c00Var = this.f23538b;
        if (c00Var != null) {
            if (g71Var == null) {
                c00Var.f(null);
            } else {
                g71Var.c(c00Var);
            }
        }
    }

    public void setHDRInfo(bi.q9 q9Var) {
        this.f23540f = q9Var;
        c00 c00Var = this.f23538b;
        if (c00Var != null) {
            c00Var.postRunnable(new hy(5, c00Var, q9Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.f23538b;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = c00Var.I;
            if (oaVar != null) {
                Matrix matrix2 = oaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix2);
                c00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
