package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class jg0 implements TextureView.SurfaceTextureListener {
    public final boolean f27490a;
    public final la f27491b;
    public final og0 f27492c;

    public jg0(og0 og0Var, boolean z10, la laVar) {
        this.f27492c = og0Var;
        this.f27490a = z10;
        this.f27491b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        og0 og0Var = this.f27492c;
        TextureView textureView = og0Var.f29192i0;
        if (og0Var.f29195l0 == null && surfaceTexture != null) {
            o00 o00Var = new o00(surfaceTexture, og0Var.C0, og0Var.H0, og0Var.f29209w0, this.f27490a, this.f27491b, i10, i11);
            og0Var.f29195l0 = o00Var;
            if (!this.f27490a) {
                o00Var.i(og0Var.J0, og0Var.K0);
                o00 o00Var2 = og0Var.f29195l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ra raVar = o00Var2.I;
                if (raVar != null) {
                    Matrix matrix = raVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    raVar.c(matrix);
                    o00Var2.e(false, false, false);
                }
            }
            og0Var.f29195l0.f(og0Var);
            o00 o00Var3 = og0Var.f29195l0;
            o00Var3.getClass();
            o00Var3.postRunnable(new k00(o00Var3, i10, i11, 1));
            og0Var.f29195l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        og0 og0Var = this.f27492c;
        o00 o00Var = og0Var.f29195l0;
        if (o00Var != null) {
            o00Var.postRunnable(new l00(o00Var, 0));
            og0Var.f29195l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        og0 og0Var = this.f27492c;
        o00 o00Var = og0Var.f29195l0;
        if (o00Var != null) {
            o00Var.postRunnable(new k00(o00Var, i10, i11, 1));
            og0Var.f29195l0.e(false, true, false);
            og0Var.f29195l0.postRunnable(new cd0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
