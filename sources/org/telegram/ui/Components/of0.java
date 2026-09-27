package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class of0 implements TextureView.SurfaceTextureListener {
    public final boolean f27085a;
    public final ja f27086b;
    public final tf0 f27087c;

    public of0(tf0 tf0Var, boolean z10, ja jaVar) {
        this.f27087c = tf0Var;
        this.f27085a = z10;
        this.f27086b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.f27087c;
        TextureView textureView = tf0Var.f28568i0;
        if (tf0Var.f28571l0 == null && surfaceTexture != null) {
            xz xzVar = new xz(surfaceTexture, tf0Var.C0, tf0Var.H0, tf0Var.f28585w0, this.f27085a, this.f27086b, i10, i11);
            tf0Var.f28571l0 = xzVar;
            if (!this.f27085a) {
                xzVar.i(tf0Var.J0, tf0Var.K0);
                xz xzVar2 = tf0Var.f28571l0;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                pa paVar = xzVar2.I;
                if (paVar != null) {
                    Matrix matrix = paVar.v;
                    transform.invert(matrix);
                    float f7 = width;
                    float f10 = height;
                    matrix.preScale(f7, f10);
                    matrix.postScale(1.0f / f7, 1.0f / f10);
                    paVar.c(matrix);
                    xzVar2.e(false, false, false);
                }
            }
            tf0Var.f28571l0.f(tf0Var);
            xz xzVar3 = tf0Var.f28571l0;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
            tf0Var.f28571l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tf0 tf0Var = this.f27087c;
        xz xzVar = tf0Var.f28571l0;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            tf0Var.f28571l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.f27087c;
        xz xzVar = tf0Var.f28571l0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            tf0Var.f28571l0.e(false, true, false);
            tf0Var.f28571l0.postRunnable(new jc0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
