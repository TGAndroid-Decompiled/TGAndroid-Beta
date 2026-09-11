package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ef0 implements TextureView.SurfaceTextureListener {
    public final boolean f25670a;
    public final ja f25671b;
    public final jf0 f25672c;

    public ef0(jf0 jf0Var, boolean z10, ja jaVar) {
        this.f25672c = jf0Var;
        this.f25670a = z10;
        this.f25671b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f25672c;
        TextureView textureView = jf0Var.f27480i0;
        if (jf0Var.f27483l0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, jf0Var.C0, jf0Var.H0, jf0Var.f27497w0, this.f25670a, this.f25671b, i10, i11);
            jf0Var.f27483l0 = vzVar;
            if (!this.f25670a) {
                vzVar.i(jf0Var.J0, jf0Var.K0);
                vz vzVar2 = jf0Var.f27483l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = vzVar2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    vzVar2.e(false, false, false);
                }
            }
            jf0Var.f27483l0.f(jf0Var);
            vz vzVar3 = jf0Var.f27483l0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            jf0Var.f27483l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jf0 jf0Var = this.f25672c;
        vz vzVar = jf0Var.f27483l0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            jf0Var.f27483l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f25672c;
        vz vzVar = jf0Var.f27483l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            jf0Var.f27483l0.e(false, true, false);
            jf0Var.f27483l0.postRunnable(new cc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
