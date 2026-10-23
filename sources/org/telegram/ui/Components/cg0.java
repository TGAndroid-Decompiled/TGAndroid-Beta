package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class cg0 implements TextureView.SurfaceTextureListener {
    public final boolean f25329a;
    public final ja f25330b;
    public final hg0 f25331c;

    public cg0(hg0 hg0Var, boolean z10, ja jaVar) {
        this.f25331c = hg0Var;
        this.f25329a = z10;
        this.f25330b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        hg0 hg0Var = this.f25331c;
        TextureView textureView = hg0Var.f26929i0;
        if (hg0Var.f26932l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, hg0Var.C0, hg0Var.H0, hg0Var.f26946w0, this.f25329a, this.f25330b, i10, i11);
            hg0Var.f26932l0 = e00Var;
            if (!this.f25329a) {
                e00Var.i(hg0Var.J0, hg0Var.K0);
                e00 e00Var2 = hg0Var.f26932l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = e00Var2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    e00Var2.d(false, false, false);
                }
            }
            hg0Var.f26932l0.f(hg0Var);
            e00 e00Var3 = hg0Var.f26932l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            hg0Var.f26932l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hg0 hg0Var = this.f25331c;
        e00 e00Var = hg0Var.f26932l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            hg0Var.f26932l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        hg0 hg0Var = this.f25331c;
        e00 e00Var = hg0Var.f26932l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            hg0Var.f26932l0.d(false, true, false);
            hg0Var.f26932l0.postRunnable(new yb0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
