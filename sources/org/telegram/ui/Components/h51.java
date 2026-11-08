package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class h51 extends TextureView implements TextureView.SurfaceTextureListener {
    public t51 f34115a;
    public sy f34116b;
    public final ki0 f34117c;
    public int d;
    public int f34118e;
    public fi.d7 f34119f;
    public g51 h;
    public int f34120n;
    public int f34121r;
    public y9 f34122s;

    public h51(Context context, t51 t51Var) {
        super(context);
        this.f34117c = new Object();
        this.f34115a = t51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.f34117c;
        ki0Var.f35339a = f10;
        ki0Var.f35340b = f11;
        ki0Var.f35341c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        sy syVar = this.f34116b;
        if (syVar == null || (daVar = syVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32848n) {
            try {
                if (!daVar.f32851q) {
                    return null;
                }
                return daVar.f32850p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f34118e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f34116b == null && surfaceTexture != null && this.f34115a != null) {
            sy syVar = new sy(surfaceTexture, new bx(this, 26), this.f34119f, this.f34122s, i7, i10);
            this.f34116b = syVar;
            syVar.h(this.f34120n, this.f34121r);
            sy syVar2 = this.f34116b;
            y9 y9Var = this.f34122s;
            da daVar = syVar2.I;
            if (daVar != null) {
                y9 y9Var2 = daVar.f32854t;
                if (y9Var2 != null && y9Var2.f40635m != null) {
                    y9Var2.f40635m = null;
                }
                daVar.f32854t = y9Var;
                if (y9Var != null && y9Var.f40635m != daVar) {
                    y9Var.f40635m = daVar;
                    y9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f34118e) != 0) {
                sy syVar3 = this.f34116b;
                syVar3.getClass();
                syVar3.postRunnable(new oy(syVar3, i12, i11, 0));
            }
            this.f34116b.c(true, true, false);
            g51 g51Var = this.h;
            if (g51Var != null) {
                g51Var.a(this.f34116b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sy syVar = this.f34116b;
        if (syVar != null) {
            syVar.postRunnable(new py(syVar, 0));
            this.f34116b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sy syVar = this.f34116b;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            this.f34116b.c(false, true, false);
            this.f34116b.postRunnable(new ir0(this, 28));
        }
    }

    public void setDelegate(g51 g51Var) {
        this.h = g51Var;
        sy syVar = this.f34116b;
        if (syVar != null) {
            if (g51Var == null) {
                syVar.d(null);
            } else {
                g51Var.a(syVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f34119f = d7Var;
        sy syVar = this.f34116b;
        if (syVar != null) {
            syVar.postRunnable(new fq(16, syVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        sy syVar = this.f34116b;
        if (syVar != null) {
            int width = getWidth();
            int height = getHeight();
            da daVar = syVar.I;
            if (daVar != null) {
                Matrix matrix2 = daVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                daVar.c(matrix2);
                syVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
