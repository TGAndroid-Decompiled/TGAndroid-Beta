package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y61 extends TextureView implements TextureView.SurfaceTextureListener {
    public k71 f33383a;
    public xz f33384b;
    public final tk0 f33385c;
    public int d;
    public int f33386e;
    public qh.r6 f33387f;
    public x61 h;
    public int f33388n;
    public int f33389r;
    public ba f33390s;

    public y61(Context context, k71 k71Var) {
        super(context);
        this.f33385c = new Object();
        this.f33383a = k71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        tk0 tk0Var = this.f33385c;
        tk0Var.f31355a = f10;
        tk0Var.f31356b = f11;
        tk0Var.f31357c = f12;
        tk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        xz xzVar = this.f33384b;
        if (xzVar == null || (haVar = xzVar.F) == null) {
            return null;
        }
        synchronized (haVar.f27438n) {
            try {
                if (!haVar.f27441q) {
                    return null;
                }
                return haVar.f27440p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f33386e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f33384b == null && surfaceTexture != null && this.f33383a != null) {
            xz xzVar = new xz(surfaceTexture, new hv(this, 28), this.f33387f, this.f33390s, i10, i11);
            this.f33384b = xzVar;
            xzVar.i(this.f33388n, this.f33389r);
            xz xzVar2 = this.f33384b;
            ba baVar = this.f33390s;
            ha haVar = xzVar2.F;
            if (haVar != null) {
                ba baVar2 = haVar.f27444t;
                if (baVar2 != null && baVar2.f25550m != null) {
                    baVar2.f25550m = null;
                }
                haVar.f27444t = baVar;
                if (baVar != null && baVar.f25550m != haVar) {
                    baVar.f25550m = haVar;
                    baVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f33386e) != 0) {
                xz xzVar3 = this.f33384b;
                xzVar3.getClass();
                xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
            }
            this.f33384b.e(true, true, false);
            x61 x61Var = this.h;
            if (x61Var != null) {
                x61Var.b(this.f33384b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.f33384b;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            this.f33384b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.f33384b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.f33384b.e(false, true, false);
            this.f33384b.postRunnable(new oq0(this, 29));
        }
    }

    public void setDelegate(x61 x61Var) {
        this.h = x61Var;
        xz xzVar = this.f33384b;
        if (xzVar != null) {
            if (x61Var == null) {
                xzVar.f(null);
            } else {
                x61Var.b(xzVar);
            }
        }
    }

    public void setHDRInfo(qh.r6 r6Var) {
        this.f33387f = r6Var;
        xz xzVar = this.f33384b;
        if (xzVar != null) {
            xzVar.postRunnable(new gm(19, xzVar, r6Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f33384b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
