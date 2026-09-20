package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class mf0 implements TextureView.SurfaceTextureListener {
    public final boolean f26396a;
    public final ia f26397b;
    public final rf0 f26398c;

    public mf0(rf0 rf0Var, boolean z10, ia iaVar) {
        this.f26398c = rf0Var;
        this.f26396a = z10;
        this.f26397b = iaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        rf0 rf0Var = this.f26398c;
        TextureView textureView = rf0Var.f27868i0;
        if (rf0Var.f27871l0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, rf0Var.C0, rf0Var.H0, rf0Var.f27885w0, this.f26396a, this.f26397b, i10, i11);
            rf0Var.f27871l0 = vzVar;
            if (!this.f26396a) {
                vzVar.i(rf0Var.J0, rf0Var.K0);
                vz vzVar2 = rf0Var.f27871l0;
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
            rf0Var.f27871l0.f(rf0Var);
            vz vzVar3 = rf0Var.f27871l0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            rf0Var.f27871l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        rf0 rf0Var = this.f26398c;
        vz vzVar = rf0Var.f27871l0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            rf0Var.f27871l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        rf0 rf0Var = this.f26398c;
        vz vzVar = rf0Var.f27871l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            rf0Var.f27871l0.e(false, true, false);
            rf0Var.f27871l0.postRunnable(new jc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
