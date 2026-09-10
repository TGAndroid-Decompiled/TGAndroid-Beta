package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class nf0 implements TextureView.SurfaceTextureListener {
    public final boolean f25505a;
    public final ia f25506b;
    public final sf0 f25507c;

    public nf0(sf0 sf0Var, boolean z10, ia iaVar) {
        this.f25507c = sf0Var;
        this.f25505a = z10;
        this.f25506b = iaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.f25507c;
        TextureView textureView = sf0Var.f27023i0;
        if (sf0Var.f27026l0 == null && surfaceTexture != null) {
            c00 c00Var = new c00(surfaceTexture, sf0Var.C0, sf0Var.H0, sf0Var.f27040w0, this.f25505a, this.f25506b, i10, i11);
            sf0Var.f27026l0 = c00Var;
            if (!this.f25505a) {
                c00Var.i(sf0Var.J0, sf0Var.K0);
                c00 c00Var2 = sf0Var.f27026l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                oa oaVar = c00Var2.I;
                if (oaVar != null) {
                    Matrix matrix = oaVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    oaVar.c(matrix);
                    c00Var2.e(false, false, false);
                }
            }
            sf0Var.f27026l0.f(sf0Var);
            c00 c00Var3 = sf0Var.f27026l0;
            c00Var3.getClass();
            c00Var3.postRunnable(new yz(c00Var3, i10, i11, 1));
            sf0Var.f27026l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sf0 sf0Var = this.f25507c;
        c00 c00Var = sf0Var.f27026l0;
        if (c00Var != null) {
            c00Var.postRunnable(new zz(c00Var, 0));
            sf0Var.f27026l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.f25507c;
        c00 c00Var = sf0Var.f27026l0;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            sf0Var.f27026l0.e(false, true, false);
            sf0Var.f27026l0.postRunnable(new kc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
