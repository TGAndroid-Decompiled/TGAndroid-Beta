package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ze0 implements TextureView.SurfaceTextureListener {
    public final boolean f35330a;
    public final ga f35331b;
    public final ef0 f35332c;

    public ze0(ef0 ef0Var, boolean z10, ga gaVar) {
        this.f35332c = ef0Var;
        this.f35330a = z10;
        this.f35331b = gaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ef0 ef0Var = this.f35332c;
        TextureView textureView = ef0Var.f28030e0;
        if (ef0Var.f28034h0 == null && surfaceTexture != null) {
            qz qzVar = new qz(surfaceTexture, ef0Var.f28056y0, ef0Var.D0, ef0Var.f28047s0, this.f35330a, this.f35331b, i10, i11);
            ef0Var.f28034h0 = qzVar;
            if (!this.f35330a) {
                qzVar.i(ef0Var.F0, ef0Var.G0);
                qz qzVar2 = ef0Var.f28034h0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ma maVar = qzVar2.E;
                if (maVar != null) {
                    Matrix matrix = maVar.v;
                    transform.invert(matrix);
                    float f9 = width;
                    float f10 = height;
                    matrix.preScale(f9, f10);
                    matrix.postScale(1.0f / f9, 1.0f / f10);
                    maVar.c(matrix);
                    qzVar2.e(false, false, false);
                }
            }
            ef0Var.f28034h0.f(ef0Var);
            qz qzVar3 = ef0Var.f28034h0;
            qzVar3.getClass();
            qzVar3.postRunnable(new mz(qzVar3, i10, i11, 1));
            ef0Var.f28034h0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ef0 ef0Var = this.f35332c;
        qz qzVar = ef0Var.f28034h0;
        if (qzVar != null) {
            qzVar.postRunnable(new nz(qzVar, 0));
            ef0Var.f28034h0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ef0 ef0Var = this.f35332c;
        qz qzVar = ef0Var.f28034h0;
        if (qzVar != null) {
            qzVar.postRunnable(new mz(qzVar, i10, i11, 1));
            ef0Var.f28034h0.e(false, true, false);
            ef0Var.f28034h0.postRunnable(new xb0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
