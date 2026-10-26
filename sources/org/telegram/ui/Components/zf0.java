package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class zf0 implements TextureView.SurfaceTextureListener {
    public final boolean f35320a;
    public final la f35321b;
    public final eg0 f35322c;

    public zf0(eg0 eg0Var, boolean z10, la laVar) {
        this.f35322c = eg0Var;
        this.f35320a = z10;
        this.f35321b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        eg0 eg0Var = this.f35322c;
        TextureView textureView = eg0Var.f27840i0;
        if (eg0Var.f27843l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, eg0Var.C0, eg0Var.H0, eg0Var.f27857w0, this.f35320a, this.f35321b, i10, i11);
            eg0Var.f27843l0 = e00Var;
            if (!this.f35320a) {
                e00Var.i(eg0Var.J0, eg0Var.K0);
                e00 e00Var2 = eg0Var.f27843l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ra raVar = e00Var2.I;
                if (raVar != null) {
                    Matrix matrix = raVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    raVar.c(matrix);
                    e00Var2.d(false, false, false);
                }
            }
            eg0Var.f27843l0.f(eg0Var);
            e00 e00Var3 = eg0Var.f27843l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            eg0Var.f27843l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        eg0 eg0Var = this.f35322c;
        e00 e00Var = eg0Var.f27843l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            eg0Var.f27843l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        eg0 eg0Var = this.f35322c;
        e00 e00Var = eg0Var.f27843l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            eg0Var.f27843l0.d(false, true, false);
            eg0Var.f27843l0.postRunnable(new wa0(this, 8));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
