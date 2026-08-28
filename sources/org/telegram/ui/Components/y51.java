package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y51 extends TextureView implements TextureView.SurfaceTextureListener {
    public k61 f34861a;
    public hz f34862b;
    public final wj0 f34863c;
    public int d;
    public int f34864e;
    public kh.z7 f34865f;
    public x51 h;
    public int f34866n;
    public int f34867r;
    public ba f34868s;

    public y51(Context context, k61 k61Var) {
        super(context);
        this.f34863c = new Object();
        this.f34861a = k61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        wj0 wj0Var = this.f34863c;
        wj0Var.f34233a = f10;
        wj0Var.f34234b = f11;
        wj0Var.f34235c = f12;
        wj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        hz hzVar = this.f34862b;
        if (hzVar == null || (haVar = hzVar.E) == null) {
            return null;
        }
        synchronized (haVar.f29015n) {
            try {
                if (!haVar.f29018q) {
                    return null;
                }
                return haVar.f29017p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getVideoHeight() {
        return this.f34864e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        int i11;
        if (this.f34862b == null && surfaceTexture != null && this.f34861a != null) {
            hz hzVar = new hz(surfaceTexture, new wu(this, 28), this.f34865f, this.f34868s, i9, i10);
            this.f34862b = hzVar;
            hzVar.i(this.f34866n, this.f34867r);
            hz hzVar2 = this.f34862b;
            ba baVar = this.f34868s;
            ha haVar = hzVar2.E;
            if (haVar != null) {
                ba baVar2 = haVar.f29021t;
                if (baVar2 != null && baVar2.f27130m != null) {
                    baVar2.f27130m = null;
                }
                haVar.f29021t = baVar;
                if (baVar != null && baVar.f27130m != haVar) {
                    baVar.f27130m = haVar;
                    baVar.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f34864e) != 0) {
                hz hzVar3 = this.f34862b;
                hzVar3.getClass();
                hzVar3.postRunnable(new dz(hzVar3, i12, i11, 0));
            }
            this.f34862b.e(true, true, false);
            x51 x51Var = this.h;
            if (x51Var != null) {
                x51Var.c(this.f34862b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hz hzVar = this.f34862b;
        if (hzVar != null) {
            hzVar.postRunnable(new ez(hzVar, 0));
            this.f34862b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        hz hzVar = this.f34862b;
        if (hzVar != null) {
            hzVar.postRunnable(new dz(hzVar, i9, i10, 1));
            this.f34862b.e(false, true, false);
            this.f34862b.postRunnable(new tp0(this, 29));
        }
    }

    public void setDelegate(x51 x51Var) {
        this.h = x51Var;
        hz hzVar = this.f34862b;
        if (hzVar != null) {
            if (x51Var == null) {
                hzVar.f(null);
            } else {
                x51Var.c(hzVar);
            }
        }
    }

    public void setHDRInfo(kh.z7 z7Var) {
        this.f34865f = z7Var;
        hz hzVar = this.f34862b;
        if (hzVar != null) {
            hzVar.postRunnable(new zq(14, hzVar, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        hz hzVar = this.f34862b;
        if (hzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = hzVar.E;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                hzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
