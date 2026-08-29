package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class l61 extends TextureView implements TextureView.SurfaceTextureListener {
    public x61 f30234a;
    public qz f30235b;
    public final hk0 f30236c;
    public int d;
    public int f30237e;
    public nh.n7 f30238f;
    public k61 h;
    public int f30239n;
    public int f30240r;
    public ga f30241s;

    public l61(Context context, x61 x61Var) {
        super(context);
        this.f30236c = new Object();
        this.f30234a = x61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f9, float f10, float f11, float f12) {
        hk0 hk0Var = this.f30236c;
        hk0Var.f29195a = f9;
        hk0Var.f29196b = f10;
        hk0Var.f29197c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ma maVar;
        qz qzVar = this.f30235b;
        if (qzVar == null || (maVar = qzVar.E) == null) {
            return null;
        }
        synchronized (maVar.f30620n) {
            try {
                if (!maVar.f30623q) {
                    return null;
                }
                return maVar.f30622p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30237e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30235b == null && surfaceTexture != null && this.f30234a != null) {
            qz qzVar = new qz(surfaceTexture, new cv(this, 28), this.f30238f, this.f30241s, i10, i11);
            this.f30235b = qzVar;
            qzVar.i(this.f30239n, this.f30240r);
            qz qzVar2 = this.f30235b;
            ga gaVar = this.f30241s;
            ma maVar = qzVar2.E;
            if (maVar != null) {
                ga gaVar2 = maVar.f30626t;
                if (gaVar2 != null && gaVar2.f28858m != null) {
                    gaVar2.f28858m = null;
                }
                maVar.f30626t = gaVar;
                if (gaVar != null && gaVar.f28858m != maVar) {
                    gaVar.f28858m = maVar;
                    gaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30237e) != 0) {
                qz qzVar3 = this.f30235b;
                qzVar3.getClass();
                qzVar3.postRunnable(new mz(qzVar3, i13, i12, 0));
            }
            this.f30235b.e(true, true, false);
            k61 k61Var = this.h;
            if (k61Var != null) {
                k61Var.b(this.f30235b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qz qzVar = this.f30235b;
        if (qzVar != null) {
            qzVar.postRunnable(new nz(qzVar, 0));
            this.f30235b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        qz qzVar = this.f30235b;
        if (qzVar != null) {
            qzVar.postRunnable(new mz(qzVar, i10, i11, 1));
            this.f30235b.e(false, true, false);
            this.f30235b.postRunnable(new fq0(this, 29));
        }
    }

    public void setDelegate(k61 k61Var) {
        this.h = k61Var;
        qz qzVar = this.f30235b;
        if (qzVar != null) {
            if (k61Var == null) {
                qzVar.f(null);
            } else {
                k61Var.b(qzVar);
            }
        }
    }

    public void setHDRInfo(nh.n7 n7Var) {
        this.f30238f = n7Var;
        qz qzVar = this.f30235b;
        if (qzVar != null) {
            qzVar.postRunnable(new gt(11, qzVar, n7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        qz qzVar = this.f30235b;
        if (qzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ma maVar = qzVar.E;
            if (maVar != null) {
                Matrix matrix2 = maVar.v;
                matrix.invert(matrix2);
                float f9 = width;
                float f10 = height;
                matrix2.preScale(f9, f10);
                matrix2.postScale(1.0f / f9, 1.0f / f10);
                maVar.c(matrix2);
                qzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
