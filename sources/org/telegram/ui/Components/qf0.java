package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class qf0 implements TextureView.SurfaceTextureListener {
    public final boolean f27682a;
    public final ja f27683b;
    public final vf0 f27684c;

    public qf0(vf0 vf0Var, boolean z10, ja jaVar) {
        this.f27684c = vf0Var;
        this.f27682a = z10;
        this.f27683b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f27684c;
        TextureView textureView = vf0Var.f29067i0;
        if (vf0Var.f29070l0 == null && surfaceTexture != null) {
            xz xzVar = new xz(surfaceTexture, vf0Var.C0, vf0Var.H0, vf0Var.f29084w0, this.f27682a, this.f27683b, i10, i11);
            vf0Var.f29070l0 = xzVar;
            if (!this.f27682a) {
                xzVar.i(vf0Var.J0, vf0Var.K0);
                xz xzVar2 = vf0Var.f29070l0;
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
            vf0Var.f29070l0.f(vf0Var);
            xz xzVar3 = vf0Var.f29070l0;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
            vf0Var.f29070l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vf0 vf0Var = this.f27684c;
        xz xzVar = vf0Var.f29070l0;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            vf0Var.f29070l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f27684c;
        xz xzVar = vf0Var.f29070l0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            vf0Var.f29070l0.e(false, true, false);
            vf0Var.f29070l0.postRunnable(new kc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
