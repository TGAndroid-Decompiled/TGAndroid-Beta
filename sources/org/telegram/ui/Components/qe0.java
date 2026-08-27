package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class qe0 implements TextureView.SurfaceTextureListener {

    public final boolean f31898a;

    public final z9 f31899b;

    public final ve0 f31900c;

    public qe0(ve0 ve0Var, boolean z10, z9 z9Var) {
        this.f31900c = ve0Var;
        this.f31898a = z10;
        this.f31899b = z9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ve0 ve0Var = this.f31900c;
        TextureView textureView = ve0Var.f33386e0;
        if (ve0Var.f33390h0 != null || surfaceTexture == null) {
            return;
        }
        jz jzVar = new jz(surfaceTexture, ve0Var.f33412y0, ve0Var.D0, ve0Var.f33403s0, this.f31898a, this.f31899b, i10, i11);
        ve0Var.f33390h0 = jzVar;
        if (!this.f31898a) {
            jzVar.i(ve0Var.F0, ve0Var.G0);
            jz jzVar2 = ve0Var.f33390h0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            fa faVar = jzVar2.E;
            if (faVar != null) {
                Matrix matrix = faVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                faVar.c(matrix);
                jzVar2.e(false, false, false);
            }
        }
        ve0Var.f33390h0.f(ve0Var);
        jz jzVar3 = ve0Var.f33390h0;
        jzVar3.getClass();
        jzVar3.postRunnable(new fz(jzVar3, i10, i11, 1));
        ve0Var.f33390h0.e(true, true, false);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ve0 ve0Var = this.f31900c;
        jz jzVar = ve0Var.f33390h0;
        if (jzVar == null) {
            return true;
        }
        jzVar.postRunnable(new gz(jzVar, 0));
        ve0Var.f33390h0 = null;
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ve0 ve0Var = this.f31900c;
        jz jzVar = ve0Var.f33390h0;
        if (jzVar != null) {
            jzVar.postRunnable(new fz(jzVar, i10, i11, 1));
            ve0Var.f33390h0.e(false, true, false);
            ve0Var.f33390h0.postRunnable(new mb0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
