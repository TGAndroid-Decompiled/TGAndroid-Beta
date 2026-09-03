package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class jf0 implements TextureView.SurfaceTextureListener {
    public final boolean f25954a;
    public final ba f25955b;
    public final of0 f25956c;

    public jf0(of0 of0Var, boolean z4, ba baVar) {
        this.f25956c = of0Var;
        this.f25954a = z4;
        this.f25955b = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        of0 of0Var = this.f25956c;
        TextureView textureView = of0Var.f27532f0;
        if (of0Var.f27535i0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, of0Var.f27557z0, of0Var.E0, of0Var.f27548t0, this.f25954a, this.f25955b, i10, i11);
            of0Var.f27535i0 = vzVar;
            if (!this.f25954a) {
                vzVar.i(of0Var.G0, of0Var.H0);
                vz vzVar2 = of0Var.f27535i0;
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
            of0Var.f27535i0.f(of0Var);
            vz vzVar3 = of0Var.f27535i0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            of0Var.f27535i0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        of0 of0Var = this.f25956c;
        vz vzVar = of0Var.f27535i0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            of0Var.f27535i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        of0 of0Var = this.f25956c;
        vz vzVar = of0Var.f27535i0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            of0Var.f27535i0.e(false, true, false);
            of0Var.f27535i0.postRunnable(new dc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
