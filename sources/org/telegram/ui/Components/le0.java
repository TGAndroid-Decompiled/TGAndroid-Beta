package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class le0 implements TextureView.SurfaceTextureListener {
    public final boolean f28141a;
    public final s9 f28142b;
    public final oe0 f28143c;

    public le0(oe0 oe0Var, boolean z10, s9 s9Var) {
        this.f28143c = oe0Var;
        this.f28141a = z10;
        this.f28142b = s9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.f28143c;
        TextureView textureView = oe0Var.f29109i0;
        if (oe0Var.f29112l0 == null && surfaceTexture != null) {
            gz gzVar = new gz(surfaceTexture, oe0Var.C0, oe0Var.H0, oe0Var.f29126w0, this.f28141a, this.f28142b, i10, i11);
            oe0Var.f29112l0 = gzVar;
            if (!this.f28141a) {
                gzVar.h(oe0Var.J0, oe0Var.K0);
                gz gzVar2 = oe0Var.f29112l0;
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
            oe0Var.f29112l0.d(oe0Var);
            gz gzVar3 = oe0Var.f29112l0;
            gzVar3.getClass();
            gzVar3.postRunnable(new cz(gzVar3, i10, i11, 1));
            oe0Var.f29112l0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        oe0 oe0Var = this.f28143c;
        gz gzVar = oe0Var.f29112l0;
        if (gzVar != null) {
            gzVar.postRunnable(new dz(gzVar, 0));
            oe0Var.f29112l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.f28143c;
        gz gzVar = oe0Var.f29112l0;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            oe0Var.f29112l0.c(false, true, false);
            oe0Var.f29112l0.postRunnable(new eb0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
