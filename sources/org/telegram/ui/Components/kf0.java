package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class kf0 implements TextureView.SurfaceTextureListener {
    public final boolean f28404a;
    public final ba f28405b;
    public final pf0 f28406c;

    public kf0(pf0 pf0Var, boolean z4, ba baVar) {
        this.f28406c = pf0Var;
        this.f28404a = z4;
        this.f28405b = baVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        pf0 pf0Var = this.f28406c;
        TextureView textureView = pf0Var.f30057f0;
        if (pf0Var.f30060i0 == null && surfaceTexture != null) {
            xz xzVar = new xz(surfaceTexture, pf0Var.f30082z0, pf0Var.E0, pf0Var.f30073t0, this.f28404a, this.f28405b, i10, i11);
            pf0Var.f30060i0 = xzVar;
            if (!this.f28404a) {
                xzVar.i(pf0Var.G0, pf0Var.H0);
                xz xzVar2 = pf0Var.f30060i0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ha haVar = xzVar2.F;
                if (haVar != null) {
                    Matrix matrix = haVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    haVar.c(matrix);
                    xzVar2.e(false, false, false);
                }
            }
            pf0Var.f30060i0.f(pf0Var);
            xz xzVar3 = pf0Var.f30060i0;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
            pf0Var.f30060i0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pf0 pf0Var = this.f28406c;
        xz xzVar = pf0Var.f30060i0;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            pf0Var.f30060i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        pf0 pf0Var = this.f28406c;
        xz xzVar = pf0Var.f30060i0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            pf0Var.f30060i0.e(false, true, false);
            pf0Var.f30060i0.postRunnable(new ec0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
