package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class le0 implements TextureView.SurfaceTextureListener {
    public final boolean f28097a;
    public final s9 f28098b;
    public final oe0 f28099c;

    public le0(oe0 oe0Var, boolean z10, s9 s9Var) {
        this.f28099c = oe0Var;
        this.f28097a = z10;
        this.f28098b = s9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.f28099c;
        TextureView textureView = oe0Var.f29048i0;
        if (oe0Var.f29051l0 == null && surfaceTexture != null) {
            gz gzVar = new gz(surfaceTexture, oe0Var.C0, oe0Var.H0, oe0Var.f29065w0, this.f28097a, this.f28098b, i10, i11);
            oe0Var.f29051l0 = gzVar;
            if (!this.f28097a) {
                gzVar.h(oe0Var.J0, oe0Var.K0);
                gz gzVar2 = oe0Var.f29051l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                x9 x9Var = gzVar2.I;
                if (x9Var != null) {
                    Matrix matrix = x9Var.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    x9Var.c(matrix);
                    gzVar2.c(false, false, false);
                }
            }
            oe0Var.f29051l0.d(oe0Var);
            gz gzVar3 = oe0Var.f29051l0;
            gzVar3.getClass();
            gzVar3.postRunnable(new cz(gzVar3, i10, i11, 1));
            oe0Var.f29051l0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        oe0 oe0Var = this.f28099c;
        gz gzVar = oe0Var.f29051l0;
        if (gzVar != null) {
            gzVar.postRunnable(new dz(gzVar, 0));
            oe0Var.f29051l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.f28099c;
        gz gzVar = oe0Var.f29051l0;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            oe0Var.f29051l0.c(false, true, false);
            oe0Var.f29051l0.postRunnable(new eb0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
