package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class pd0 implements TextureView.SurfaceTextureListener {
    public final boolean f36863a;
    public final y9 f36864b;
    public final sd0 f36865c;

    public pd0(sd0 sd0Var, boolean z9, y9 y9Var) {
        this.f36865c = sd0Var;
        this.f36863a = z9;
        this.f36864b = y9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.f36865c;
        TextureView textureView = sd0Var.f37998i0;
        if (sd0Var.f38001l0 == null && surfaceTexture != null) {
            ry ryVar = new ry(surfaceTexture, sd0Var.C0, sd0Var.H0, sd0Var.f38015w0, this.f36863a, this.f36864b, i7, i10);
            sd0Var.f38001l0 = ryVar;
            if (!this.f36863a) {
                ryVar.h(sd0Var.J0, sd0Var.K0);
                ry ryVar2 = sd0Var.f38001l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                da daVar = ryVar2.I;
                if (daVar != null) {
                    Matrix matrix = daVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    daVar.c(matrix);
                    ryVar2.c(false, false, false);
                }
            }
            sd0Var.f38001l0.d(sd0Var);
            ry ryVar3 = sd0Var.f38001l0;
            ryVar3.getClass();
            ryVar3.postRunnable(new ny(ryVar3, i7, i10, 1));
            sd0Var.f38001l0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sd0 sd0Var = this.f36865c;
        ry ryVar = sd0Var.f38001l0;
        if (ryVar != null) {
            ryVar.postRunnable(new oy(ryVar, 0));
            sd0Var.f38001l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.f36865c;
        ry ryVar = sd0Var.f38001l0;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            sd0Var.f38001l0.c(false, true, false);
            sd0Var.f38001l0.postRunnable(new ob0(this, 3));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
