package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ae0 implements TextureView.SurfaceTextureListener {
    public final boolean f33337a;
    public final ca f33338b;
    public final de0 f33339c;

    public ae0(de0 de0Var, boolean z10, ca caVar) {
        this.f33339c = de0Var;
        this.f33337a = z10;
        this.f33338b = caVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.f33339c;
        TextureView textureView = de0Var.f34398j0;
        if (de0Var.m0 == null && surfaceTexture != null) {
            cz czVar = new cz(surfaceTexture, de0Var.D0, de0Var.I0, de0Var.f34416x0, this.f33337a, this.f33338b, i7, i10);
            de0Var.m0 = czVar;
            if (!this.f33337a) {
                czVar.h(de0Var.K0, de0Var.L0);
                cz czVar2 = de0Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ha haVar = czVar2.J;
                if (haVar != null) {
                    Matrix matrix = haVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    haVar.c(matrix);
                    czVar2.c(false, false, false);
                }
            }
            de0Var.m0.d(de0Var);
            cz czVar3 = de0Var.m0;
            czVar3.getClass();
            czVar3.postRunnable(new yy(czVar3, i7, i10, 1));
            de0Var.m0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        de0 de0Var = this.f33339c;
        cz czVar = de0Var.m0;
        if (czVar != null) {
            czVar.postRunnable(new zy(czVar, 0));
            de0Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.f33339c;
        cz czVar = de0Var.m0;
        if (czVar != null) {
            czVar.postRunnable(new yy(czVar, i7, i10, 1));
            de0Var.m0.c(false, true, false);
            de0Var.m0.postRunnable(new gb0(this, 5));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
