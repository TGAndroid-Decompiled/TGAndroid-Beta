package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ef0 implements TextureView.SurfaceTextureListener {
    public final boolean f23633a;
    public final ha f23634b;
    public final jf0 f23635c;

    public ef0(jf0 jf0Var, boolean z10, ha haVar) {
        this.f23635c = jf0Var;
        this.f23633a = z10;
        this.f23634b = haVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f23635c;
        TextureView textureView = jf0Var.f25322i0;
        if (jf0Var.f25325l0 == null && surfaceTexture != null) {
            vz vzVar = new vz(surfaceTexture, jf0Var.C0, jf0Var.H0, jf0Var.f25339w0, this.f23633a, this.f23634b, i10, i11);
            jf0Var.f25325l0 = vzVar;
            if (!this.f23633a) {
                vzVar.i(jf0Var.J0, jf0Var.K0);
                vz vzVar2 = jf0Var.f25325l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                na naVar = vzVar2.I;
                if (naVar != null) {
                    Matrix matrix = naVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    naVar.c(matrix);
                    vzVar2.e(false, false, false);
                }
            }
            jf0Var.f25325l0.f(jf0Var);
            vz vzVar3 = jf0Var.f25325l0;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
            jf0Var.f25325l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jf0 jf0Var = this.f23635c;
        vz vzVar = jf0Var.f25325l0;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            jf0Var.f25325l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f23635c;
        vz vzVar = jf0Var.f25325l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            jf0Var.f25325l0.e(false, true, false);
            jf0Var.f25325l0.postRunnable(new bc0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
