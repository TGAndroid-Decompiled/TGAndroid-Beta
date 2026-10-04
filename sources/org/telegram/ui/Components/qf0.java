package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class qf0 implements TextureView.SurfaceTextureListener {
    public final boolean f30016a;
    public final ka f30017b;
    public final vf0 f30018c;

    public qf0(vf0 vf0Var, boolean z10, ka kaVar) {
        this.f30018c = vf0Var;
        this.f30016a = z10;
        this.f30017b = kaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f30018c;
        TextureView textureView = vf0Var.f31655i0;
        if (vf0Var.f31658l0 == null && surfaceTexture != null) {
            yz yzVar = new yz(surfaceTexture, vf0Var.C0, vf0Var.H0, vf0Var.f31672w0, this.f30016a, this.f30017b, i10, i11);
            vf0Var.f31658l0 = yzVar;
            if (!this.f30016a) {
                yzVar.i(vf0Var.J0, vf0Var.K0);
                yz yzVar2 = vf0Var.f31658l0;
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
            vf0Var.f31658l0.f(vf0Var);
            yz yzVar3 = vf0Var.f31658l0;
            yzVar3.getClass();
            yzVar3.postRunnable(new uz(yzVar3, i10, i11, 1));
            vf0Var.f31658l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vf0 vf0Var = this.f30018c;
        yz yzVar = vf0Var.f31658l0;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            vf0Var.f31658l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.f30018c;
        yz yzVar = vf0Var.f31658l0;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            vf0Var.f31658l0.e(false, true, false);
            vf0Var.f31658l0.postRunnable(new lc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
