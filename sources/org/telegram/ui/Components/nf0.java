package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class nf0 implements TextureView.SurfaceTextureListener {
    public final boolean f26678a;
    public final ja f26679b;
    public final sf0 f26680c;

    public nf0(sf0 sf0Var, boolean z10, ja jaVar) {
        this.f26680c = sf0Var;
        this.f26678a = z10;
        this.f26679b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.f26680c;
        TextureView textureView = sf0Var.f28143i0;
        if (sf0Var.f28146l0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, sf0Var.C0, sf0Var.H0, sf0Var.f28160w0, this.f26678a, this.f26679b, i10, i11);
            sf0Var.f28146l0 = vzVar;
            if (!this.f26678a) {
                vzVar.i(sf0Var.J0, sf0Var.K0);
                vz vzVar2 = sf0Var.f28146l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = vzVar2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    vzVar2.e(false, false, false);
                }
            }
            sf0Var.f28146l0.f(sf0Var);
            vz vzVar3 = sf0Var.f28146l0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            sf0Var.f28146l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sf0 sf0Var = this.f26680c;
        vz vzVar = sf0Var.f28146l0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            sf0Var.f28146l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.f26680c;
        vz vzVar = sf0Var.f28146l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            sf0Var.f28146l0.e(false, true, false);
            sf0Var.f28146l0.postRunnable(new kc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
