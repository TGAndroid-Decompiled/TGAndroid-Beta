package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class xf0 implements TextureView.SurfaceTextureListener {
    public final boolean f32380a;
    public final ja f32381b;
    public final cg0 f32382c;

    public xf0(cg0 cg0Var, boolean z10, ja jaVar) {
        this.f32382c = cg0Var;
        this.f32380a = z10;
        this.f32381b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        cg0 cg0Var = this.f32382c;
        TextureView textureView = cg0Var.f25216i0;
        if (cg0Var.f25219l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, cg0Var.C0, cg0Var.H0, cg0Var.f25233w0, this.f32380a, this.f32381b, i10, i11);
            cg0Var.f25219l0 = e00Var;
            if (!this.f32380a) {
                e00Var.i(cg0Var.J0, cg0Var.K0);
                e00 e00Var2 = cg0Var.f25219l0;
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
            cg0Var.f25219l0.f(cg0Var);
            e00 e00Var3 = cg0Var.f25219l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            cg0Var.f25219l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cg0 cg0Var = this.f32382c;
        e00 e00Var = cg0Var.f25219l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            cg0Var.f25219l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        cg0 cg0Var = this.f32382c;
        e00 e00Var = cg0Var.f25219l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            cg0Var.f25219l0.d(false, true, false);
            cg0Var.f25219l0.postRunnable(new rc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
