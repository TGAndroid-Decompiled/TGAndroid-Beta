package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class j71 extends TextureView implements TextureView.SurfaceTextureListener {
    public t71 f25278a;
    public xz f25279b;
    public final tk0 f25280c;
    public int d;
    public int e;
    public ci.k8 f25281f;
    public i71 h;
    public int f25282n;
    public int f25283r;
    public ja f25284s;

    public j71(Context context, t71 t71Var) {
        super(context);
        this.f25280c = new Object();
        this.f25278a = t71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        tk0 tk0Var = this.f25280c;
        tk0Var.f28551a = f7;
        tk0Var.f28552b = f10;
        tk0Var.f28553c = f11;
        tk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        xz xzVar = this.f25279b;
        if (xzVar == null || (paVar = xzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27313n) {
            try {
                if (!paVar.f27316q) {
                    return null;
                }
                return paVar.f27315p;
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
        if (this.f25279b == null && surfaceTexture != null && this.f25278a != null) {
            xz xzVar = new xz(surfaceTexture, new nv(this, 29), this.f25281f, this.f25284s, i10, i11);
            this.f25279b = xzVar;
            xzVar.i(this.f25282n, this.f25283r);
            xz xzVar2 = this.f25279b;
            ja jaVar = this.f25284s;
            pa paVar = xzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27319t;
                if (jaVar2 != null && jaVar2.f25365m != null) {
                    jaVar2.f25365m = null;
                }
                paVar.f27319t = jaVar;
                if (jaVar != null && jaVar.f25365m != paVar) {
                    jaVar.f25365m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                xz xzVar3 = this.f25279b;
                xzVar3.getClass();
                xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
            }
            this.f25279b.e(true, true, false);
            i71 i71Var = this.h;
            if (i71Var != null) {
                i71Var.c(this.f25279b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.f25279b;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            this.f25279b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.f25279b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.f25279b.e(false, true, false);
            this.f25279b.postRunnable(new h71(this, 0));
        }
    }

    public void setDelegate(i71 i71Var) {
        this.h = i71Var;
        xz xzVar = this.f25279b;
        if (xzVar != null) {
            if (i71Var == null) {
                xzVar.f(null);
            } else {
                i71Var.c(xzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f25281f = k8Var;
        xz xzVar = this.f25279b;
        if (xzVar != null) {
            xzVar.postRunnable(new ww(7, xzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f25279b;
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
