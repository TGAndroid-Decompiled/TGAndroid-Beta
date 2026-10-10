package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class hg0 implements TextureView.SurfaceTextureListener {
    public final boolean f27004a;
    public final ma f27005b;
    public final mg0 f27006c;

    public hg0(mg0 mg0Var, boolean z10, ma maVar) {
        this.f27006c = mg0Var;
        this.f27004a = z10;
        this.f27005b = maVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        mg0 mg0Var = this.f27006c;
        TextureView textureView = mg0Var.f28793i0;
        if (mg0Var.f28796l0 == null && surfaceTexture != null) {
            m00 m00Var = new m00(surfaceTexture, mg0Var.C0, mg0Var.H0, mg0Var.f28810w0, this.f27004a, this.f27005b, i10, i11);
            mg0Var.f28796l0 = m00Var;
            if (!this.f27004a) {
                m00Var.i(mg0Var.J0, mg0Var.K0);
                m00 m00Var2 = mg0Var.f28796l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                sa saVar = m00Var2.I;
                if (saVar != null) {
                    Matrix matrix = saVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    saVar.c(matrix);
                    m00Var2.e(false, false, false);
                }
            }
            mg0Var.f28796l0.f(mg0Var);
            m00 m00Var3 = mg0Var.f28796l0;
            m00Var3.getClass();
            m00Var3.postRunnable(new i00(m00Var3, i10, i11, 1));
            mg0Var.f28796l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mg0 mg0Var = this.f27006c;
        m00 m00Var = mg0Var.f28796l0;
        if (m00Var != null) {
            m00Var.postRunnable(new j00(m00Var, 0));
            mg0Var.f28796l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        mg0 mg0Var = this.f27006c;
        m00 m00Var = mg0Var.f28796l0;
        if (m00Var != null) {
            m00Var.postRunnable(new i00(m00Var, i10, i11, 1));
            mg0Var.f28796l0.e(false, true, false);
            mg0Var.f28796l0.postRunnable(new cd0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
