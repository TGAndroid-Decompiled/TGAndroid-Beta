package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class v51 extends TextureView implements TextureView.SurfaceTextureListener {
    public f61 f40500a;
    public cz f40501b;
    public final yi0 f40502c;
    public int d;
    public int f40503e;
    public hi.c7 f40504f;
    public u51 h;
    public int f40505n;
    public int f40506r;
    public ca f40507s;

    public v51(Context context, f61 f61Var) {
        super(context);
        this.f40502c = new Object();
        this.f40500a = f61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        yi0 yi0Var = this.f40502c;
        yi0Var.f42503a = f10;
        yi0Var.f42504b = f11;
        yi0Var.f42505c = f12;
        yi0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        cz czVar = this.f40501b;
        if (czVar == null || (haVar = czVar.J) == null) {
            return null;
        }
        synchronized (haVar.f35837n) {
            try {
                if (!haVar.f35840q) {
                    return null;
                }
                return haVar.f35839p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f40503e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f40501b == null && surfaceTexture != null && this.f40500a != null) {
            cz czVar = new cz(surfaceTexture, new iy(this, 25), this.f40504f, this.f40507s, i7, i10);
            this.f40501b = czVar;
            czVar.h(this.f40505n, this.f40506r);
            cz czVar2 = this.f40501b;
            ca caVar = this.f40507s;
            ha haVar = czVar2.J;
            if (haVar != null) {
                ca caVar2 = haVar.f35843t;
                if (caVar2 != null && caVar2.f33951m != null) {
                    caVar2.f33951m = null;
                }
                haVar.f35843t = caVar;
                if (caVar != null && caVar.f33951m != haVar) {
                    caVar.f33951m = haVar;
                    caVar.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f40503e) != 0) {
                cz czVar3 = this.f40501b;
                czVar3.getClass();
                czVar3.postRunnable(new yy(czVar3, i12, i11, 0));
            }
            this.f40501b.c(true, true, false);
            u51 u51Var = this.h;
            if (u51Var != null) {
                u51Var.a(this.f40501b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cz czVar = this.f40501b;
        if (czVar != null) {
            czVar.postRunnable(new zy(czVar, 0));
            this.f40501b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        cz czVar = this.f40501b;
        if (czVar != null) {
            czVar.postRunnable(new yy(czVar, i7, i10, 1));
            this.f40501b.c(false, true, false);
            this.f40501b.postRunnable(new t51(this, 0));
        }
    }

    public void setDelegate(u51 u51Var) {
        this.h = u51Var;
        cz czVar = this.f40501b;
        if (czVar != null) {
            if (u51Var == null) {
                czVar.d(null);
            } else {
                u51Var.a(czVar);
            }
        }
    }

    public void setHDRInfo(hi.c7 c7Var) {
        this.f40504f = c7Var;
        cz czVar = this.f40501b;
        if (czVar != null) {
            czVar.postRunnable(new dw(6, czVar, c7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        cz czVar = this.f40501b;
        if (czVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = czVar.J;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                czVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
