package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ae0 implements TextureView.SurfaceTextureListener {
    public final boolean f33465a;
    public final ba f33466b;
    public final de0 f33467c;

    public ae0(de0 de0Var, boolean z10, ba baVar) {
        this.f33467c = de0Var;
        this.f33465a = z10;
        this.f33466b = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.f33467c;
        TextureView textureView = de0Var.f34294j0;
        if (de0Var.m0 == null && surfaceTexture != null) {
            bz bzVar = new bz(surfaceTexture, de0Var.D0, de0Var.I0, de0Var.f34312x0, this.f33465a, this.f33466b, i7, i10);
            de0Var.m0 = bzVar;
            if (!this.f33465a) {
                bzVar.h(de0Var.K0, de0Var.L0);
                bz bzVar2 = de0Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ga gaVar = bzVar2.J;
                if (gaVar != null) {
                    Matrix matrix = gaVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    gaVar.c(matrix);
                    bzVar2.c(false, false, false);
                }
            }
            de0Var.m0.d(de0Var);
            bz bzVar3 = de0Var.m0;
            bzVar3.getClass();
            bzVar3.postRunnable(new xy(bzVar3, i7, i10, 1));
            de0Var.m0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        de0 de0Var = this.f33467c;
        bz bzVar = de0Var.m0;
        if (bzVar != null) {
            bzVar.postRunnable(new yy(bzVar, 0));
            de0Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.f33467c;
        bz bzVar = de0Var.m0;
        if (bzVar != null) {
            bzVar.postRunnable(new xy(bzVar, i7, i10, 1));
            de0Var.m0.c(false, true, false);
            de0Var.m0.postRunnable(new eb0(this, 5));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
