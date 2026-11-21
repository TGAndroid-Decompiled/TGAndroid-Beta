package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y51 extends TextureView implements TextureView.SurfaceTextureListener {
    public i61 f42329a;
    public ez f42330b;
    public final aj0 f42331c;
    public int d;
    public int f42332e;
    public hi.b7 f42333f;
    public x51 h;
    public int f42334n;
    public int f42335r;
    public ca f42336s;

    public y51(Context context, i61 i61Var) {
        super(context);
        this.f42331c = new Object();
        this.f42329a = i61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        aj0 aj0Var = this.f42331c;
        aj0Var.f33522a = f10;
        aj0Var.f33523b = f11;
        aj0Var.f33524c = f12;
        aj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        ez ezVar = this.f42330b;
        if (ezVar == null || (haVar = ezVar.J) == null) {
            return null;
        }
        synchronized (haVar.f35857n) {
            try {
                if (!haVar.f35860q) {
                    return null;
                }
                return haVar.f35859p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f42332e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f42330b == null && surfaceTexture != null && this.f42329a != null) {
            ez ezVar = new ez(surfaceTexture, new ky(this, 25), this.f42333f, this.f42336s, i7, i10);
            this.f42330b = ezVar;
            ezVar.h(this.f42334n, this.f42335r);
            ez ezVar2 = this.f42330b;
            ca caVar = this.f42336s;
            ha haVar = ezVar2.J;
            if (haVar != null) {
                ca caVar2 = haVar.f35863t;
                if (caVar2 != null && caVar2.f34141m != null) {
                    caVar2.f34141m = null;
                }
                haVar.f35863t = caVar;
                if (caVar != null && caVar.f34141m != haVar) {
                    caVar.f34141m = haVar;
                    caVar.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f42332e) != 0) {
                ez ezVar3 = this.f42330b;
                ezVar3.getClass();
                ezVar3.postRunnable(new az(ezVar3, i12, i11, 0));
            }
            this.f42330b.c(true, true, false);
            x51 x51Var = this.h;
            if (x51Var != null) {
                x51Var.a(this.f42330b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ez ezVar = this.f42330b;
        if (ezVar != null) {
            ezVar.postRunnable(new bz(ezVar, 0));
            this.f42330b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ez ezVar = this.f42330b;
        if (ezVar != null) {
            ezVar.postRunnable(new az(ezVar, i7, i10, 1));
            this.f42330b.c(false, true, false);
            this.f42330b.postRunnable(new w51(this, 0));
        }
    }

    public void setDelegate(x51 x51Var) {
        this.h = x51Var;
        ez ezVar = this.f42330b;
        if (ezVar != null) {
            if (x51Var == null) {
                ezVar.d(null);
            } else {
                x51Var.a(ezVar);
            }
        }
    }

    public void setHDRInfo(hi.b7 b7Var) {
        this.f42333f = b7Var;
        ez ezVar = this.f42330b;
        if (ezVar != null) {
            ezVar.postRunnable(new ou(8, ezVar, b7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ez ezVar = this.f42330b;
        if (ezVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = ezVar.J;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                ezVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
