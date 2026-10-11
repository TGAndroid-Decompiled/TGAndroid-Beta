package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class hg0 implements TextureView.SurfaceTextureListener {
    public final boolean f26987a;
    public final la f26988b;
    public final mg0 f26989c;

    public hg0(mg0 mg0Var, boolean z10, la laVar) {
        this.f26989c = mg0Var;
        this.f26987a = z10;
        this.f26988b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        mg0 mg0Var = this.f26989c;
        TextureView textureView = mg0Var.f28682i0;
        if (mg0Var.f28685l0 == null && surfaceTexture != null) {
            m00 m00Var = new m00(surfaceTexture, mg0Var.C0, mg0Var.H0, mg0Var.f28699w0, this.f26987a, this.f26988b, i10, i11);
            mg0Var.f28685l0 = m00Var;
            if (!this.f26987a) {
                m00Var.i(mg0Var.J0, mg0Var.K0);
                m00 m00Var2 = mg0Var.f28685l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                ra raVar = m00Var2.I;
                if (raVar != null) {
                    Matrix matrix = raVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    raVar.c(matrix);
                    m00Var2.e(false, false, false);
                }
            }
            mg0Var.f28685l0.f(mg0Var);
            m00 m00Var3 = mg0Var.f28685l0;
            m00Var3.getClass();
            m00Var3.postRunnable(new i00(m00Var3, i10, i11, 1));
            mg0Var.f28685l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mg0 mg0Var = this.f26989c;
        m00 m00Var = mg0Var.f28685l0;
        if (m00Var != null) {
            m00Var.postRunnable(new j00(m00Var, 0));
            mg0Var.f28685l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        mg0 mg0Var = this.f26989c;
        m00 m00Var = mg0Var.f28685l0;
        if (m00Var != null) {
            m00Var.postRunnable(new i00(m00Var, i10, i11, 1));
            mg0Var.f28685l0.e(false, true, false);
            mg0Var.f28685l0.postRunnable(new cd0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
