package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class ef0 implements TextureView.SurfaceTextureListener {
    public final boolean f23653a;
    public final ja f23654b;
    public final jf0 f23655c;

    public ef0(jf0 jf0Var, boolean z10, ja jaVar) {
        this.f23655c = jf0Var;
        this.f23653a = z10;
        this.f23654b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f23655c;
        TextureView textureView = jf0Var.f25279i0;
        if (jf0Var.f25282l0 == null && surfaceTexture != null) {
            wz wzVar = new wz(surfaceTexture, jf0Var.C0, jf0Var.H0, jf0Var.f25296w0, this.f23653a, this.f23654b, i10, i11);
            jf0Var.f25282l0 = wzVar;
            if (!this.f23653a) {
                wzVar.i(jf0Var.J0, jf0Var.K0);
                wz wzVar2 = jf0Var.f25282l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = wzVar2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    wzVar2.e(false, false, false);
                }
            }
            jf0Var.f25282l0.f(jf0Var);
            wz wzVar3 = jf0Var.f25282l0;
            wzVar3.getClass();
            wzVar3.postRunnable(new sz(wzVar3, i10, i11, 1));
            jf0Var.f25282l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jf0 jf0Var = this.f23655c;
        wz wzVar = jf0Var.f25282l0;
        if (wzVar != null) {
            wzVar.postRunnable(new tz(wzVar, 0));
            jf0Var.f25282l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.f23655c;
        wz wzVar = jf0Var.f25282l0;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            jf0Var.f25282l0.e(false, true, false);
            jf0Var.f25282l0.postRunnable(new ac0(this, 6));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
