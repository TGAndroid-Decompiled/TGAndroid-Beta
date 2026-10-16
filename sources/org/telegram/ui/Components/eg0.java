package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class eg0 implements TextureView.SurfaceTextureListener {
    public final boolean f24384a;
    public final la f24385b;
    public final jg0 f24386c;

    public eg0(jg0 jg0Var, boolean z10, la laVar) {
        this.f24386c = jg0Var;
        this.f24384a = z10;
        this.f24385b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jg0 jg0Var = this.f24386c;
        TextureView textureView = jg0Var.f26006i0;
        if (jg0Var.f26009l0 == null && surfaceTexture != null) {
            h00 h00Var = new h00(surfaceTexture, jg0Var.C0, jg0Var.H0, jg0Var.f26023w0, this.f24384a, this.f24385b, i10, i11);
            jg0Var.f26009l0 = h00Var;
            if (!this.f24384a) {
                h00Var.i(jg0Var.J0, jg0Var.K0);
                h00 h00Var2 = jg0Var.f26009l0;
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
            jg0Var.f26009l0.f(jg0Var);
            h00 h00Var3 = jg0Var.f26009l0;
            h00Var3.getClass();
            h00Var3.postRunnable(new d00(h00Var3, i10, i11, 1));
            jg0Var.f26009l0.d(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jg0 jg0Var = this.f24386c;
        h00 h00Var = jg0Var.f26009l0;
        if (h00Var != null) {
            h00Var.postRunnable(new e00(h00Var, 0));
            jg0Var.f26009l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jg0 jg0Var = this.f24386c;
        h00 h00Var = jg0Var.f26009l0;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            jg0Var.f26009l0.d(false, true, false);
            jg0Var.f26009l0.postRunnable(new yc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
