package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class if0 implements TextureView.SurfaceTextureListener {
    public final boolean f25701a;
    public final ba f25702b;
    public final nf0 f25703c;

    public if0(nf0 nf0Var, boolean z4, ba baVar) {
        this.f25703c = nf0Var;
        this.f25701a = z4;
        this.f25702b = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        nf0 nf0Var = this.f25703c;
        TextureView textureView = nf0Var.f27245f0;
        if (nf0Var.f27248i0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, nf0Var.f27270z0, nf0Var.E0, nf0Var.f27261t0, this.f25701a, this.f25702b, i10, i11);
            nf0Var.f27248i0 = vzVar;
            if (!this.f25701a) {
                vzVar.i(nf0Var.G0, nf0Var.H0);
                vz vzVar2 = nf0Var.f27248i0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ha haVar = vzVar2.F;
                if (haVar != null) {
                    Matrix matrix = haVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    haVar.c(matrix);
                    vzVar2.e(false, false, false);
                }
            }
            nf0Var.f27248i0.f(nf0Var);
            vz vzVar3 = nf0Var.f27248i0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            nf0Var.f27248i0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        nf0 nf0Var = this.f25703c;
        vz vzVar = nf0Var.f27248i0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            nf0Var.f27248i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        nf0 nf0Var = this.f25703c;
        vz vzVar = nf0Var.f27248i0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            nf0Var.f27248i0.e(false, true, false);
            nf0Var.f27248i0.postRunnable(new cc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
