package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class k71 extends TextureView implements TextureView.SurfaceTextureListener {
    public u71 f25617a;
    public xz f25618b;
    public final uk0 f25619c;
    public int d;
    public int e;
    public ci.k8 f25620f;
    public j71 h;
    public int f25621n;
    public int f25622r;
    public ja f25623s;

    public k71(Context context, u71 u71Var) {
        super(context);
        this.f25619c = new Object();
        this.f25617a = u71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f25619c;
        uk0Var.f28826a = f7;
        uk0Var.f28827b = f10;
        uk0Var.f28828c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        xz xzVar = this.f25618b;
        if (xzVar == null || (paVar = xzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27314n) {
            try {
                if (!paVar.f27317q) {
                    return null;
                }
                return paVar.f27316p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f25618b == null && surfaceTexture != null && this.f25617a != null) {
            xz xzVar = new xz(surfaceTexture, new ov(this, 29), this.f25620f, this.f25623s, i10, i11);
            this.f25618b = xzVar;
            xzVar.i(this.f25621n, this.f25622r);
            xz xzVar2 = this.f25618b;
            ja jaVar = this.f25623s;
            pa paVar = xzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27320t;
                if (jaVar2 != null && jaVar2.f25400m != null) {
                    jaVar2.f25400m = null;
                }
                paVar.f27320t = jaVar;
                if (jaVar != null && jaVar.f25400m != paVar) {
                    jaVar.f25400m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                xz xzVar3 = this.f25618b;
                xzVar3.getClass();
                xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
            }
            this.f25618b.e(true, true, false);
            j71 j71Var = this.h;
            if (j71Var != null) {
                j71Var.c(this.f25618b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.f25618b;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            this.f25618b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.f25618b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.f25618b.e(false, true, false);
            this.f25618b.postRunnable(new i71(this, 0));
        }
    }

    public void setDelegate(j71 j71Var) {
        this.h = j71Var;
        xz xzVar = this.f25618b;
        if (xzVar != null) {
            if (j71Var == null) {
                xzVar.f(null);
            } else {
                j71Var.c(xzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f25620f = k8Var;
        xz xzVar = this.f25618b;
        if (xzVar != null) {
            xzVar.postRunnable(new dv(8, xzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f25618b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = xzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
