package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class c51 extends TextureView implements TextureView.SurfaceTextureListener {
    public n51 f32420a;
    public ry f32421b;
    public final ki0 f32422c;
    public int d;
    public int f32423e;
    public fi.d7 f32424f;
    public b51 h;
    public int f32425n;
    public int f32426r;
    public y9 f32427s;

    public c51(Context context, n51 n51Var) {
        super(context);
        this.f32422c = new Object();
        this.f32420a = n51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.f32422c;
        ki0Var.f35319a = f10;
        ki0Var.f35320b = f11;
        ki0Var.f35321c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        ry ryVar = this.f32421b;
        if (ryVar == null || (daVar = ryVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32798n) {
            try {
                if (!daVar.f32801q) {
                    return null;
                }
                return daVar.f32800p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f32423e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f32421b == null && surfaceTexture != null && this.f32420a != null) {
            ry ryVar = new ry(surfaceTexture, new ax(this, 26), this.f32424f, this.f32427s, i7, i10);
            this.f32421b = ryVar;
            ryVar.h(this.f32425n, this.f32426r);
            ry ryVar2 = this.f32421b;
            y9 y9Var = this.f32427s;
            da daVar = ryVar2.I;
            if (daVar != null) {
                y9 y9Var2 = daVar.f32804t;
                if (y9Var2 != null && y9Var2.f40578m != null) {
                    y9Var2.f40578m = null;
                }
                daVar.f32804t = y9Var;
                if (y9Var != null && y9Var.f40578m != daVar) {
                    y9Var.f40578m = daVar;
                    y9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f32423e) != 0) {
                ry ryVar3 = this.f32421b;
                ryVar3.getClass();
                ryVar3.postRunnable(new ny(ryVar3, i12, i11, 0));
            }
            this.f32421b.c(true, true, false);
            b51 b51Var = this.h;
            if (b51Var != null) {
                b51Var.a(this.f32421b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ry ryVar = this.f32421b;
        if (ryVar != null) {
            ryVar.postRunnable(new oy(ryVar, 0));
            this.f32421b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ry ryVar = this.f32421b;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            this.f32421b.c(false, true, false);
            this.f32421b.postRunnable(new ir0(this, 27));
        }
    }

    public void setDelegate(b51 b51Var) {
        this.h = b51Var;
        ry ryVar = this.f32421b;
        if (ryVar != null) {
            if (b51Var == null) {
                ryVar.d(null);
            } else {
                b51Var.a(ryVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f32424f = d7Var;
        ry ryVar = this.f32421b;
        if (ryVar != null) {
            ryVar.postRunnable(new fq(16, ryVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ry ryVar = this.f32421b;
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
