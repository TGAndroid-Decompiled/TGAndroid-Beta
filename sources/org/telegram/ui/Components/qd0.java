package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class qd0 implements TextureView.SurfaceTextureListener {
    public final boolean f38638a;
    public final u9 f38639b;
    public final td0 f38640c;

    public qd0(td0 td0Var, boolean z10, u9 u9Var) {
        this.f38640c = td0Var;
        this.f38638a = z10;
        this.f38639b = u9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.f38640c;
        TextureView textureView = td0Var.f39657j0;
        if (td0Var.m0 == null && surfaceTexture != null) {
            wy wyVar = new wy(surfaceTexture, td0Var.D0, td0Var.I0, td0Var.f39675x0, this.f38638a, this.f38639b, i7, i10);
            td0Var.m0 = wyVar;
            if (!this.f38638a) {
                wyVar.h(td0Var.K0, td0Var.L0);
                wy wyVar2 = td0Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                z9 z9Var = wyVar2.J;
                if (z9Var != null) {
                    Matrix matrix = z9Var.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    z9Var.c(matrix);
                    wyVar2.c(false, false, false);
                }
            }
            td0Var.m0.d(td0Var);
            wy wyVar3 = td0Var.m0;
            wyVar3.getClass();
            wyVar3.postRunnable(new sy(wyVar3, i7, i10, 1));
            td0Var.m0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        td0 td0Var = this.f38640c;
        wy wyVar = td0Var.m0;
        if (wyVar != null) {
            wyVar.postRunnable(new ty(wyVar, 0));
            td0Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.f38640c;
        wy wyVar = td0Var.m0;
        if (wyVar != null) {
            wyVar.postRunnable(new sy(wyVar, i7, i10, 1));
            td0Var.m0.c(false, true, false);
            td0Var.m0.postRunnable(new wa0(this, 5));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
