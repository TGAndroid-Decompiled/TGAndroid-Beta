package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i51 extends TextureView implements TextureView.SurfaceTextureListener {
    public t51 f34533a;
    public ry f34534b;
    public final ki0 f34535c;
    public int d;
    public int f34536e;
    public fi.d7 f34537f;
    public h51 h;
    public int f34538n;
    public int f34539r;
    public x9 f34540s;

    public i51(Context context, t51 t51Var) {
        super(context);
        this.f34535c = new Object();
        this.f34533a = t51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.f34535c;
        ki0Var.f35353a = f10;
        ki0Var.f35354b = f11;
        ki0Var.f35355c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        ry ryVar = this.f34534b;
        if (ryVar == null || (caVar = ryVar.I) == null) {
            return null;
        }
        synchronized (caVar.f32511n) {
            try {
                if (!caVar.f32514q) {
                    return null;
                }
                return caVar.f32513p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f34536e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f34534b == null && surfaceTexture != null && this.f34533a != null) {
            ry ryVar = new ry(surfaceTexture, new ax(this, 26), this.f34537f, this.f34540s, i7, i10);
            this.f34534b = ryVar;
            ryVar.h(this.f34538n, this.f34539r);
            ry ryVar2 = this.f34534b;
            x9 x9Var = this.f34540s;
            ca caVar = ryVar2.I;
            if (caVar != null) {
                x9 x9Var2 = caVar.f32517t;
                if (x9Var2 != null && x9Var2.f40268m != null) {
                    x9Var2.f40268m = null;
                }
                caVar.f32517t = x9Var;
                if (x9Var != null && x9Var.f40268m != caVar) {
                    x9Var.f40268m = caVar;
                    x9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f34536e) != 0) {
                ry ryVar3 = this.f34534b;
                ryVar3.getClass();
                ryVar3.postRunnable(new ny(ryVar3, i12, i11, 0));
            }
            this.f34534b.c(true, true, false);
            h51 h51Var = this.h;
            if (h51Var != null) {
                h51Var.a(this.f34534b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ry ryVar = this.f34534b;
        if (ryVar != null) {
            ryVar.postRunnable(new oy(ryVar, 0));
            this.f34534b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ry ryVar = this.f34534b;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            this.f34534b.c(false, true, false);
            this.f34534b.postRunnable(new jr0(this, 28));
        }
    }

    public void setDelegate(h51 h51Var) {
        this.h = h51Var;
        ry ryVar = this.f34534b;
        if (ryVar != null) {
            if (h51Var == null) {
                ryVar.d(null);
            } else {
                h51Var.a(ryVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f34537f = d7Var;
        ry ryVar = this.f34534b;
        if (ryVar != null) {
            ryVar.postRunnable(new ro(17, ryVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ry ryVar = this.f34534b;
        if (ryVar != null) {
            int width = getWidth();
            int height = getHeight();
            ca caVar = ryVar.I;
            if (caVar != null) {
                Matrix matrix2 = caVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                caVar.c(matrix2);
                ryVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
