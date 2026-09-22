package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class pf0 implements TextureView.SurfaceTextureListener {
    public final boolean f27344a;
    public final ia f27345b;
    public final uf0 f27346c;

    public pf0(uf0 uf0Var, boolean z10, ia iaVar) {
        this.f27346c = uf0Var;
        this.f27344a = z10;
        this.f27345b = iaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.f27346c;
        TextureView textureView = uf0Var.f28735i0;
        if (uf0Var.f28738l0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, uf0Var.C0, uf0Var.H0, uf0Var.f28752w0, this.f27344a, this.f27345b, i10, i11);
            uf0Var.f28738l0 = vzVar;
            if (!this.f27344a) {
                vzVar.i(uf0Var.J0, uf0Var.K0);
                vz vzVar2 = uf0Var.f28738l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                oa oaVar = vzVar2.I;
                if (oaVar != null) {
                    Matrix matrix = oaVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    oaVar.c(matrix);
                    vzVar2.e(false, false, false);
                }
            }
            uf0Var.f28738l0.f(uf0Var);
            vz vzVar3 = uf0Var.f28738l0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            uf0Var.f28738l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uf0 uf0Var = this.f27346c;
        vz vzVar = uf0Var.f28738l0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            uf0Var.f28738l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.f27346c;
        vz vzVar = uf0Var.f28738l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            uf0Var.f28738l0.e(false, true, false);
            uf0Var.f28738l0.postRunnable(new jc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
