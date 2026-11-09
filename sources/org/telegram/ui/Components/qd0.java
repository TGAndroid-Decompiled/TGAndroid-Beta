package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class qd0 implements TextureView.SurfaceTextureListener {
    public final boolean f37293a;
    public final y9 f37294b;
    public final td0 f37295c;

    public qd0(td0 td0Var, boolean z9, y9 y9Var) {
        this.f37295c = td0Var;
        this.f37293a = z9;
        this.f37294b = y9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.f37295c;
        TextureView textureView = td0Var.f38367i0;
        if (td0Var.f38370l0 == null && surfaceTexture != null) {
            sy syVar = new sy(surfaceTexture, td0Var.C0, td0Var.H0, td0Var.f38384w0, this.f37293a, this.f37294b, i7, i10);
            td0Var.f38370l0 = syVar;
            if (!this.f37293a) {
                syVar.h(td0Var.J0, td0Var.K0);
                sy syVar2 = td0Var.f38370l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                da daVar = syVar2.I;
                if (daVar != null) {
                    Matrix matrix = daVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    daVar.c(matrix);
                    syVar2.c(false, false, false);
                }
            }
            td0Var.f38370l0.d(td0Var);
            sy syVar3 = td0Var.f38370l0;
            syVar3.getClass();
            syVar3.postRunnable(new oy(syVar3, i7, i10, 1));
            td0Var.f38370l0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        td0 td0Var = this.f37295c;
        sy syVar = td0Var.f38370l0;
        if (syVar != null) {
            syVar.postRunnable(new py(syVar, 0));
            td0Var.f38370l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.f37295c;
        sy syVar = td0Var.f38370l0;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            td0Var.f38370l0.c(false, true, false);
            td0Var.f38370l0.postRunnable(new pb0(this, 3));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
