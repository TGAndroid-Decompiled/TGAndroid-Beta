package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class pf0 implements TextureView.SurfaceTextureListener {
    public final boolean f27346a;
    public final ja f27347b;
    public final uf0 f27348c;

    public pf0(uf0 uf0Var, boolean z10, ja jaVar) {
        this.f27348c = uf0Var;
        this.f27346a = z10;
        this.f27347b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.f27348c;
        TextureView textureView = uf0Var.f28782i0;
        if (uf0Var.f28785l0 == null && surfaceTexture != null) {
            xz xzVar = new xz(surfaceTexture, uf0Var.C0, uf0Var.H0, uf0Var.f28799w0, this.f27346a, this.f27347b, i10, i11);
            uf0Var.f28785l0 = xzVar;
            if (!this.f27346a) {
                xzVar.i(uf0Var.J0, uf0Var.K0);
                xz xzVar2 = uf0Var.f28785l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = xzVar2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    xzVar2.e(false, false, false);
                }
            }
            uf0Var.f28785l0.f(uf0Var);
            xz xzVar3 = uf0Var.f28785l0;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
            uf0Var.f28785l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uf0 uf0Var = this.f27348c;
        xz xzVar = uf0Var.f28785l0;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            uf0Var.f28785l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.f27348c;
        xz xzVar = uf0Var.f28785l0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            uf0Var.f28785l0.e(false, true, false);
            uf0Var.f28785l0.postRunnable(new jc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
