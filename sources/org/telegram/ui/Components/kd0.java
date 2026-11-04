package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class kd0 implements TextureView.SurfaceTextureListener {
    public final boolean f35371a;
    public final x9 f35372b;
    public final nd0 f35373c;

    public kd0(nd0 nd0Var, boolean z10, x9 x9Var) {
        this.f35373c = nd0Var;
        this.f35371a = z10;
        this.f35372b = x9Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        nd0 nd0Var = this.f35373c;
        TextureView textureView = nd0Var.f36471j0;
        if (nd0Var.m0 == null && surfaceTexture != null) {
            py pyVar = new py(surfaceTexture, nd0Var.D0, nd0Var.I0, nd0Var.f36489x0, this.f35371a, this.f35372b, i3, i10);
            nd0Var.m0 = pyVar;
            if (!this.f35371a) {
                pyVar.h(nd0Var.K0, nd0Var.L0);
                py pyVar2 = nd0Var.m0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ca caVar = pyVar2.J;
                if (caVar != null) {
                    Matrix matrix = caVar.v;
                    transform.invert(matrix);
                    float f10 = width;
                    float f11 = height;
                    matrix.preScale(f10, f11);
                    matrix.postScale(1.0f / f10, 1.0f / f11);
                    caVar.c(matrix);
                    pyVar2.c(false, false, false);
                }
            }
            nd0Var.m0.e(nd0Var);
            py pyVar3 = nd0Var.m0;
            pyVar3.getClass();
            pyVar3.postRunnable(new ly(pyVar3, i3, i10, 1));
            nd0Var.m0.c(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        nd0 nd0Var = this.f35373c;
        py pyVar = nd0Var.m0;
        if (pyVar != null) {
            pyVar.postRunnable(new my(pyVar, 0));
            nd0Var.m0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        nd0 nd0Var = this.f35373c;
        py pyVar = nd0Var.m0;
        if (pyVar != null) {
            pyVar.postRunnable(new ly(pyVar, i3, i10, 1));
            nd0Var.m0.c(false, true, false);
            nd0Var.m0.postRunnable(new jb0(this, 3));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
