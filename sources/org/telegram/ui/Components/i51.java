package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i51 extends TextureView implements TextureView.SurfaceTextureListener {
    public u51 f34576a;
    public sy f34577b;
    public final li0 f34578c;
    public int d;
    public int f34579e;
    public fi.d7 f34580f;
    public h51 h;
    public int f34581n;
    public int f34582r;
    public y9 f34583s;

    public i51(Context context, u51 u51Var) {
        super(context);
        this.f34578c = new Object();
        this.f34576a = u51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        li0 li0Var = this.f34578c;
        li0Var.f35751a = f10;
        li0Var.f35752b = f11;
        li0Var.f35753c = f12;
        li0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        sy syVar = this.f34577b;
        if (syVar == null || (daVar = syVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32907n) {
            try {
                if (!daVar.f32910q) {
                    return null;
                }
                return daVar.f32909p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f34579e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f34577b == null && surfaceTexture != null && this.f34576a != null) {
            sy syVar = new sy(surfaceTexture, new bx(this, 26), this.f34580f, this.f34583s, i7, i10);
            this.f34577b = syVar;
            syVar.h(this.f34581n, this.f34582r);
            sy syVar2 = this.f34577b;
            y9 y9Var = this.f34583s;
            da daVar = syVar2.I;
            if (daVar != null) {
                y9 y9Var2 = daVar.f32913t;
                if (y9Var2 != null && y9Var2.f40681m != null) {
                    y9Var2.f40681m = null;
                }
                daVar.f32913t = y9Var;
                if (y9Var != null && y9Var.f40681m != daVar) {
                    y9Var.f40681m = daVar;
                    y9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f34579e) != 0) {
                sy syVar3 = this.f34577b;
                syVar3.getClass();
                syVar3.postRunnable(new oy(syVar3, i12, i11, 0));
            }
            this.f34577b.c(true, true, false);
            h51 h51Var = this.h;
            if (h51Var != null) {
                h51Var.a(this.f34577b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sy syVar = this.f34577b;
        if (syVar != null) {
            syVar.postRunnable(new py(syVar, 0));
            this.f34577b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sy syVar = this.f34577b;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            this.f34577b.c(false, true, false);
            this.f34577b.postRunnable(new kr0(this, 28));
        }
    }

    public void setDelegate(h51 h51Var) {
        this.h = h51Var;
        sy syVar = this.f34577b;
        if (syVar != null) {
            if (h51Var == null) {
                syVar.d(null);
            } else {
                h51Var.a(syVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f34580f = d7Var;
        sy syVar = this.f34577b;
        if (syVar != null) {
            syVar.postRunnable(new fq(16, syVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        sy syVar = this.f34577b;
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
