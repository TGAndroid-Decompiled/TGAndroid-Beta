package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class pd0 implements TextureView.SurfaceTextureListener {
    public final boolean f36905a;
    public final y9 f36906b;
    public final sd0 f36907c;

    public pd0(sd0 sd0Var, boolean z9, y9 y9Var) {
        this.f36907c = sd0Var;
        this.f36905a = z9;
        this.f36906b = y9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.f36907c;
        TextureView textureView = sd0Var.f38018i0;
        if (sd0Var.f38021l0 == null && surfaceTexture != null) {
            sy syVar = new sy(surfaceTexture, sd0Var.C0, sd0Var.H0, sd0Var.f38035w0, this.f36905a, this.f36906b, i7, i10);
            sd0Var.f38021l0 = syVar;
            if (!this.f36905a) {
                syVar.h(sd0Var.J0, sd0Var.K0);
                sy syVar2 = sd0Var.f38021l0;
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
            sd0Var.f38021l0.d(sd0Var);
            sy syVar3 = sd0Var.f38021l0;
            syVar3.getClass();
            syVar3.postRunnable(new oy(syVar3, i7, i10, 1));
            sd0Var.f38021l0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sd0 sd0Var = this.f36907c;
        sy syVar = sd0Var.f38021l0;
        if (syVar != null) {
            syVar.postRunnable(new py(syVar, 0));
            sd0Var.f38021l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.f36907c;
        sy syVar = sd0Var.f38021l0;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            sd0Var.f38021l0.c(false, true, false);
            sd0Var.f38021l0.postRunnable(new ob0(this, 3));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
