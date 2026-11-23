package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class be0 implements TextureView.SurfaceTextureListener {
    public final boolean f33812a;
    public final ca f33813b;
    public final ee0 f33814c;

    public be0(ee0 ee0Var, boolean z10, ca caVar) {
        this.f33814c = ee0Var;
        this.f33812a = z10;
        this.f33813b = caVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        ee0 ee0Var = this.f33814c;
        TextureView textureView = ee0Var.f34747j0;
        if (ee0Var.m0 == null && surfaceTexture != null) {
            ez ezVar = new ez(surfaceTexture, ee0Var.D0, ee0Var.I0, ee0Var.f34765x0, this.f33812a, this.f33813b, i7, i10);
            ee0Var.m0 = ezVar;
            if (!this.f33812a) {
                ezVar.h(ee0Var.K0, ee0Var.L0);
                ez ezVar2 = ee0Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ha haVar = ezVar2.J;
                if (haVar != null) {
                    Matrix matrix = haVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    haVar.c(matrix);
                    ezVar2.c(false, false, false);
                }
            }
            ee0Var.m0.d(ee0Var);
            ez ezVar3 = ee0Var.m0;
            ezVar3.getClass();
            ezVar3.postRunnable(new az(ezVar3, i7, i10, 1));
            ee0Var.m0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ee0 ee0Var = this.f33814c;
        ez ezVar = ee0Var.m0;
        if (ezVar != null) {
            ezVar.postRunnable(new bz(ezVar, 0));
            ee0Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ee0 ee0Var = this.f33814c;
        ez ezVar = ee0Var.m0;
        if (ezVar != null) {
            ezVar.postRunnable(new az(ezVar, i7, i10, 1));
            ee0Var.m0.c(false, true, false);
            ee0Var.m0.postRunnable(new hb0(this, 5));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
