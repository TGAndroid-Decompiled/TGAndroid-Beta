package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ag0 implements TextureView.SurfaceTextureListener {
    public final boolean f26550a;
    public final la f26551b;
    public final fg0 f26552c;

    public ag0(fg0 fg0Var, boolean z10, la laVar) {
        this.f26552c = fg0Var;
        this.f26550a = z10;
        this.f26551b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        fg0 fg0Var = this.f26552c;
        TextureView textureView = fg0Var.f28133i0;
        if (fg0Var.f28136l0 == null && surfaceTexture != null) {
            e00 e00Var = new e00(surfaceTexture, fg0Var.C0, fg0Var.H0, fg0Var.f28150w0, this.f26550a, this.f26551b, i10, i11);
            fg0Var.f28136l0 = e00Var;
            if (!this.f26550a) {
                e00Var.i(fg0Var.J0, fg0Var.K0);
                e00 e00Var2 = fg0Var.f28136l0;
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
            fg0Var.f28136l0.f(fg0Var);
            e00 e00Var3 = fg0Var.f28136l0;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
            fg0Var.f28136l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        fg0 fg0Var = this.f26552c;
        e00 e00Var = fg0Var.f28136l0;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            fg0Var.f28136l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        fg0 fg0Var = this.f26552c;
        e00 e00Var = fg0Var.f28136l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            fg0Var.f28136l0.d(false, true, false);
            fg0Var.f28136l0.postRunnable(new xa0(this, 8));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
