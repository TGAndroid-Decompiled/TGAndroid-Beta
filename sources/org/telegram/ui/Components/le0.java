package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class le0 implements TextureView.SurfaceTextureListener {
    public final boolean f30424a;
    public final ba f30425b;
    public final qe0 f30426c;

    public le0(qe0 qe0Var, boolean z10, ba baVar) {
        this.f30426c = qe0Var;
        this.f30424a = z10;
        this.f30425b = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        qe0 qe0Var = this.f30426c;
        TextureView textureView = qe0Var.f31898e0;
        if (qe0Var.f31902h0 == null && surfaceTexture != null) {
            hz hzVar = new hz(surfaceTexture, qe0Var.f31924y0, qe0Var.D0, qe0Var.f31915s0, this.f30424a, this.f30425b, i9, i10);
            qe0Var.f31902h0 = hzVar;
            if (!this.f30424a) {
                hzVar.i(qe0Var.F0, qe0Var.G0);
                hz hzVar2 = qe0Var.f31902h0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ha haVar = hzVar2.E;
                if (haVar != null) {
                    Matrix matrix = haVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    haVar.c(matrix);
                    hzVar2.e(false, false, false);
                }
            }
            qe0Var.f31902h0.f(qe0Var);
            hz hzVar3 = qe0Var.f31902h0;
            hzVar3.getClass();
            hzVar3.postRunnable(new dz(hzVar3, i9, i10, 1));
            qe0Var.f31902h0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qe0 qe0Var = this.f30426c;
        hz hzVar = qe0Var.f31902h0;
        if (hzVar != null) {
            hzVar.postRunnable(new ez(hzVar, 0));
            qe0Var.f31902h0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        qe0 qe0Var = this.f30426c;
        hz hzVar = qe0Var.f31902h0;
        if (hzVar != null) {
            hzVar.postRunnable(new dz(hzVar, i9, i10, 1));
            qe0Var.f31902h0.e(false, true, false);
            qe0Var.f31902h0.postRunnable(new ib0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
