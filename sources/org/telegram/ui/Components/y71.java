package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y71 extends TextureView implements TextureView.SurfaceTextureListener {
    public i81 f31175a;
    public h00 f31176b;
    public final il0 f31177c;
    public int d;
    public int e;
    public di.j8 f31178f;
    public x71 h;
    public int f31179n;
    public int f31180r;
    public la f31181s;

    public y71(Context context, i81 i81Var) {
        super(context);
        this.f31177c = new Object();
        this.f31175a = i81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        il0 il0Var = this.f31177c;
        il0Var.f25653a = f7;
        il0Var.f25654b = f10;
        il0Var.f25655c = f11;
        il0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        h00 h00Var = this.f31176b;
        if (h00Var == null || (raVar = h00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f28481n) {
            try {
                if (!raVar.f28484q) {
                    return null;
                }
                return raVar.f28483p;
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
        if (this.f31176b == null && surfaceTexture != null && this.f31175a != null) {
            h00 h00Var = new h00(surfaceTexture, new xv(this, 29), this.f31178f, this.f31181s, i10, i11);
            this.f31176b = h00Var;
            h00Var.i(this.f31179n, this.f31180r);
            h00 h00Var2 = this.f31176b;
            la laVar = this.f31181s;
            ra raVar = h00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f28487t;
                if (laVar2 != null && laVar2.f26710m != null) {
                    laVar2.f26710m = null;
                }
                raVar.f28487t = laVar;
                if (laVar != null && laVar.f26710m != raVar) {
                    laVar.f26710m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                h00 h00Var3 = this.f31176b;
                h00Var3.getClass();
                h00Var3.postRunnable(new d00(h00Var3, i13, i12, 0));
            }
            this.f31176b.d(true, true, false);
            x71 x71Var = this.h;
            if (x71Var != null) {
                x71Var.c(this.f31176b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h00 h00Var = this.f31176b;
        if (h00Var != null) {
            h00Var.postRunnable(new e00(h00Var, 0));
            this.f31176b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h00 h00Var = this.f31176b;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            this.f31176b.d(false, true, false);
            this.f31176b.postRunnable(new w71(this, 0));
        }
    }

    public void setDelegate(x71 x71Var) {
        this.h = x71Var;
        h00 h00Var = this.f31176b;
        if (h00Var != null) {
            if (x71Var == null) {
                h00Var.f(null);
            } else {
                x71Var.c(h00Var);
            }
        }
    }

    public void setHDRInfo(di.j8 j8Var) {
        this.f31178f = j8Var;
        h00 h00Var = this.f31176b;
        if (h00Var != null) {
            h00Var.postRunnable(new vm(20, h00Var, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        h00 h00Var = this.f31176b;
        if (h00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = h00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                h00Var.d(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
