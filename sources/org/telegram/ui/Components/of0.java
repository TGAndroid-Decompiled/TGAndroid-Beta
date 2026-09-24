package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class of0 implements TextureView.SurfaceTextureListener {
    public final boolean f27037a;
    public final ja f27038b;
    public final tf0 f27039c;

    public of0(tf0 tf0Var, boolean z10, ja jaVar) {
        this.f27039c = tf0Var;
        this.f27037a = z10;
        this.f27038b = jaVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.f27039c;
        TextureView textureView = tf0Var.f28487i0;
        if (tf0Var.f28490l0 == null && surfaceTexture != null) {
            wz wzVar = new wz(surfaceTexture, tf0Var.C0, tf0Var.H0, tf0Var.f28504w0, this.f27037a, this.f27038b, i10, i11);
            tf0Var.f28490l0 = wzVar;
            if (!this.f27037a) {
                wzVar.i(tf0Var.J0, tf0Var.K0);
                wz wzVar2 = tf0Var.f28490l0;
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
            tf0Var.f28490l0.f(tf0Var);
            wz wzVar3 = tf0Var.f28490l0;
            wzVar3.getClass();
            wzVar3.postRunnable(new sz(wzVar3, i10, i11, 1));
            tf0Var.f28490l0.e(true, true, false);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tf0 tf0Var = this.f27039c;
        wz wzVar = tf0Var.f28490l0;
        if (wzVar != null) {
            wzVar.postRunnable(new tz(wzVar, 0));
            tf0Var.f28490l0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.f27039c;
        wz wzVar = tf0Var.f28490l0;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            tf0Var.f28490l0.e(false, true, false);
            tf0Var.f28490l0.postRunnable(new ic0(this, 7));
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
