package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class yf0 implements TextureView.SurfaceTextureListener {
    public final boolean f32646a;
    public final ja f32647b;
    public final dg0 f32648c;

    public yf0(dg0 dg0Var, boolean z10, ja jaVar) {
        this.f32648c = dg0Var;
        this.f32646a = z10;
        this.f32647b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        dg0 dg0Var = this.f32648c;
        TextureView textureView = dg0Var.f25479i0;
        if (dg0Var.f25482l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, dg0Var.C0, dg0Var.H0, dg0Var.f25496w0, this.f32646a, this.f32647b, i10, i11);
            dg0Var.f25482l0 = e00Var;
            if (!this.f32646a) {
                e00Var.i(dg0Var.J0, dg0Var.K0);
                e00 e00Var2 = dg0Var.f25482l0;
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
            dg0Var.f25482l0.f(dg0Var);
            e00 e00Var3 = dg0Var.f25482l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            dg0Var.f25482l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        dg0 dg0Var = this.f32648c;
        e00 e00Var = dg0Var.f25482l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            dg0Var.f25482l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        dg0 dg0Var = this.f32648c;
        e00 e00Var = dg0Var.f25482l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            dg0Var.f25482l0.d(false, true, false);
            dg0Var.f25482l0.postRunnable(new rc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
