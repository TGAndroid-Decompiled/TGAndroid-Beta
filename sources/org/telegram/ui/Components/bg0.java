package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class bg0 implements TextureView.SurfaceTextureListener {
    public final boolean f24997a;
    public final ha f24998b;
    public final gg0 f24999c;

    public bg0(gg0 gg0Var, boolean z10, ha haVar) {
        this.f24999c = gg0Var;
        this.f24997a = z10;
        this.f24998b = haVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        gg0 gg0Var = this.f24999c;
        TextureView textureView = gg0Var.f26667i0;
        if (gg0Var.f26670l0 == null && surfaceTexture != null) {
            c00 c00Var = new c00(surfaceTexture, gg0Var.C0, gg0Var.H0, gg0Var.f26684w0, this.f24997a, this.f24998b, i10, i11);
            gg0Var.f26670l0 = c00Var;
            if (!this.f24997a) {
                c00Var.i(gg0Var.J0, gg0Var.K0);
                c00 c00Var2 = gg0Var.f26670l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                na naVar = c00Var2.I;
                if (naVar != null) {
                    Matrix matrix = naVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    naVar.c(matrix);
                    c00Var2.d(false, false, false);
                }
            }
            gg0Var.f26670l0.f(gg0Var);
            c00 c00Var3 = gg0Var.f26670l0;
            c00Var3.getClass();
            c00Var3.postRunnable(new yz(c00Var3, i10, i11, 1));
            gg0Var.f26670l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gg0 gg0Var = this.f24999c;
        c00 c00Var = gg0Var.f26670l0;
        if (c00Var != null) {
            c00Var.postRunnable(new zz(c00Var, 0));
            gg0Var.f26670l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        gg0 gg0Var = this.f24999c;
        c00 c00Var = gg0Var.f26670l0;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            gg0Var.f26670l0.d(false, true, false);
            gg0Var.f26670l0.postRunnable(new wb0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
