package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class xf0 implements TextureView.SurfaceTextureListener {
    public final boolean f32384a;
    public final ja f32385b;
    public final cg0 f32386c;

    public xf0(cg0 cg0Var, boolean z10, ja jaVar) {
        this.f32386c = cg0Var;
        this.f32384a = z10;
        this.f32385b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        cg0 cg0Var = this.f32386c;
        TextureView textureView = cg0Var.f25194i0;
        if (cg0Var.f25197l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, cg0Var.C0, cg0Var.H0, cg0Var.f25211w0, this.f32384a, this.f32385b, i10, i11);
            cg0Var.f25197l0 = e00Var;
            if (!this.f32384a) {
                e00Var.i(cg0Var.J0, cg0Var.K0);
                e00 e00Var2 = cg0Var.f25197l0;
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
            cg0Var.f25197l0.f(cg0Var);
            e00 e00Var3 = cg0Var.f25197l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            cg0Var.f25197l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cg0 cg0Var = this.f32386c;
        e00 e00Var = cg0Var.f25197l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            cg0Var.f25197l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        cg0 cg0Var = this.f32386c;
        e00 e00Var = cg0Var.f25197l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            cg0Var.f25197l0.d(false, true, false);
            cg0Var.f25197l0.postRunnable(new rc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
