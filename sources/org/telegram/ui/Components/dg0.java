package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class dg0 implements TextureView.SurfaceTextureListener {
    public final boolean f24395a;
    public final la f24396b;
    public final ig0 f24397c;

    public dg0(ig0 ig0Var, boolean z10, la laVar) {
        this.f24397c = ig0Var;
        this.f24395a = z10;
        this.f24396b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ig0 ig0Var = this.f24397c;
        TextureView textureView = ig0Var.f25955i0;
        if (ig0Var.f25958l0 == null && surfaceTexture != null) {
            h00 h00Var = new h00(surfaceTexture, ig0Var.C0, ig0Var.H0, ig0Var.f25972w0, this.f24395a, this.f24396b, i10, i11);
            ig0Var.f25958l0 = h00Var;
            if (!this.f24395a) {
                h00Var.i(ig0Var.J0, ig0Var.K0);
                h00 h00Var2 = ig0Var.f25958l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ra raVar = h00Var2.I;
                if (raVar != null) {
                    Matrix matrix = raVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    raVar.c(matrix);
                    h00Var2.d(false, false, false);
                }
            }
            ig0Var.f25958l0.f(ig0Var);
            h00 h00Var3 = ig0Var.f25958l0;
            h00Var3.getClass();
            h00Var3.postRunnable(new d00(h00Var3, i10, i11, 1));
            ig0Var.f25958l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ig0 ig0Var = this.f24397c;
        h00 h00Var = ig0Var.f25958l0;
        if (h00Var != null) {
            h00Var.postRunnable(new e00(h00Var, 0));
            ig0Var.f25958l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ig0 ig0Var = this.f24397c;
        h00 h00Var = ig0Var.f25958l0;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            ig0Var.f25958l0.d(false, true, false);
            ig0Var.f25958l0.postRunnable(new yc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
