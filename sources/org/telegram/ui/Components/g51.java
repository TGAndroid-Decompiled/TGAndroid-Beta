package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class g51 extends TextureView implements TextureView.SurfaceTextureListener {
    public s51 f33797a;
    public ry f33798b;
    public final ki0 f33799c;
    public int d;
    public int f33800e;
    public fi.d7 f33801f;
    public f51 h;
    public int f33802n;
    public int f33803r;
    public y9 f33804s;

    public g51(Context context, s51 s51Var) {
        super(context);
        this.f33799c = new Object();
        this.f33797a = s51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.f33799c;
        ki0Var.f35322a = f10;
        ki0Var.f35323b = f11;
        ki0Var.f35324c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        ry ryVar = this.f33798b;
        if (ryVar == null || (daVar = ryVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32811n) {
            try {
                if (!daVar.f32814q) {
                    return null;
                }
                return daVar.f32813p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f33800e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f33798b == null && surfaceTexture != null && this.f33797a != null) {
            ry ryVar = new ry(surfaceTexture, new ax(this, 26), this.f33801f, this.f33804s, i7, i10);
            this.f33798b = ryVar;
            ryVar.h(this.f33802n, this.f33803r);
            ry ryVar2 = this.f33798b;
            y9 y9Var = this.f33804s;
            da daVar = ryVar2.I;
            if (daVar != null) {
                y9 y9Var2 = daVar.f32817t;
                if (y9Var2 != null && y9Var2.f40597m != null) {
                    y9Var2.f40597m = null;
                }
                daVar.f32817t = y9Var;
                if (y9Var != null && y9Var.f40597m != daVar) {
                    y9Var.f40597m = daVar;
                    y9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f33800e) != 0) {
                ry ryVar3 = this.f33798b;
                ryVar3.getClass();
                ryVar3.postRunnable(new ny(ryVar3, i12, i11, 0));
            }
            this.f33798b.c(true, true, false);
            f51 f51Var = this.h;
            if (f51Var != null) {
                f51Var.a(this.f33798b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ry ryVar = this.f33798b;
        if (ryVar != null) {
            ryVar.postRunnable(new oy(ryVar, 0));
            this.f33798b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ry ryVar = this.f33798b;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            this.f33798b.c(false, true, false);
            this.f33798b.postRunnable(new ir0(this, 28));
        }
    }

    public void setDelegate(f51 f51Var) {
        this.h = f51Var;
        ry ryVar = this.f33798b;
        if (ryVar != null) {
            if (f51Var == null) {
                ryVar.d(null);
            } else {
                f51Var.a(ryVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f33801f = d7Var;
        ry ryVar = this.f33798b;
        if (ryVar != null) {
            ryVar.postRunnable(new fq(16, ryVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ry ryVar = this.f33798b;
        if (ryVar != null) {
            int width = getWidth();
            int height = getHeight();
            da daVar = ryVar.I;
            if (daVar != null) {
                Matrix matrix2 = daVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                daVar.c(matrix2);
                ryVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
