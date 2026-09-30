package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class rf0 implements TextureView.SurfaceTextureListener {
    public final boolean f27979a;
    public final ka f27980b;
    public final wf0 f27981c;

    public rf0(wf0 wf0Var, boolean z10, ka kaVar) {
        this.f27981c = wf0Var;
        this.f27979a = z10;
        this.f27980b = kaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        wf0 wf0Var = this.f27981c;
        TextureView textureView = wf0Var.f29914i0;
        if (wf0Var.f29917l0 == null && surfaceTexture != null) {
            yz yzVar = new yz(surfaceTexture, wf0Var.C0, wf0Var.H0, wf0Var.f29931w0, this.f27979a, this.f27980b, i10, i11);
            wf0Var.f29917l0 = yzVar;
            if (!this.f27979a) {
                yzVar.i(wf0Var.J0, wf0Var.K0);
                yz yzVar2 = wf0Var.f29917l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                qa qaVar = yzVar2.I;
                if (qaVar != null) {
                    Matrix matrix = qaVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    qaVar.c(matrix);
                    yzVar2.e(false, false, false);
                }
            }
            wf0Var.f29917l0.f(wf0Var);
            yz yzVar3 = wf0Var.f29917l0;
            yzVar3.getClass();
            yzVar3.postRunnable(new uz(yzVar3, i10, i11, 1));
            wf0Var.f29917l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wf0 wf0Var = this.f27981c;
        yz yzVar = wf0Var.f29917l0;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            wf0Var.f29917l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        wf0 wf0Var = this.f27981c;
        yz yzVar = wf0Var.f29917l0;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            wf0Var.f29917l0.e(false, true, false);
            wf0Var.f29917l0.postRunnable(new lc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
