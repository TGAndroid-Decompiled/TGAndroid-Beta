package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class gg0 implements TextureView.SurfaceTextureListener {
    public final boolean f26743a;
    public final la f26744b;
    public final lg0 f26745c;

    public gg0(lg0 lg0Var, boolean z10, la laVar) {
        this.f26745c = lg0Var;
        this.f26743a = z10;
        this.f26744b = laVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        lg0 lg0Var = this.f26745c;
        TextureView textureView = lg0Var.f28392i0;
        if (lg0Var.f28395l0 == null && surfaceTexture != null) {
            m00 m00Var = new m00(surfaceTexture, lg0Var.C0, lg0Var.H0, lg0Var.f28409w0, this.f26743a, this.f26744b, i10, i11);
            lg0Var.f28395l0 = m00Var;
            if (!this.f26743a) {
                m00Var.i(lg0Var.J0, lg0Var.K0);
                m00 m00Var2 = lg0Var.f28395l0;
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
            lg0Var.f28395l0.f(lg0Var);
            m00 m00Var3 = lg0Var.f28395l0;
            m00Var3.getClass();
            m00Var3.postRunnable(new i00(m00Var3, i10, i11, 1));
            lg0Var.f28395l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        lg0 lg0Var = this.f26745c;
        m00 m00Var = lg0Var.f28395l0;
        if (m00Var != null) {
            m00Var.postRunnable(new j00(m00Var, 0));
            lg0Var.f28395l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        lg0 lg0Var = this.f26745c;
        m00 m00Var = lg0Var.f28395l0;
        if (m00Var != null) {
            m00Var.postRunnable(new i00(m00Var, i10, i11, 1));
            lg0Var.f28395l0.e(false, true, false);
            lg0Var.f28395l0.postRunnable(new yc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
