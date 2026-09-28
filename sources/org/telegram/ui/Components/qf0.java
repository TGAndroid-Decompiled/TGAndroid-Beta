package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class qf0 implements TextureView.SurfaceTextureListener {
    public final boolean f27683a;
    public final ja f27684b;
    public final vf0 f27685c;

    public qf0(vf0 vf0Var, boolean z10, ja jaVar) {
        this.f27685c = vf0Var;
        this.f27683a = z10;
        this.f27684b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f27685c;
        TextureView textureView = vf0Var.f29068i0;
        if (vf0Var.f29071l0 == null && surfaceTexture != null) {
            xz xzVar = new xz(surfaceTexture, vf0Var.C0, vf0Var.H0, vf0Var.f29085w0, this.f27683a, this.f27684b, i10, i11);
            vf0Var.f29071l0 = xzVar;
            if (!this.f27683a) {
                xzVar.i(vf0Var.J0, vf0Var.K0);
                xz xzVar2 = vf0Var.f29071l0;
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
            vf0Var.f29071l0.f(vf0Var);
            xz xzVar3 = vf0Var.f29071l0;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
            vf0Var.f29071l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vf0 vf0Var = this.f27685c;
        xz xzVar = vf0Var.f29071l0;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            vf0Var.f29071l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f27685c;
        xz xzVar = vf0Var.f29071l0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            vf0Var.f29071l0.e(false, true, false);
            vf0Var.f29071l0.postRunnable(new kc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
