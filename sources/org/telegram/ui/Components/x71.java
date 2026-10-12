package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class x71 extends TextureView implements TextureView.SurfaceTextureListener {
    public h81 f31188a;
    public h00 f31189b;
    public final il0 f31190c;
    public int d;
    public int e;
    public di.j8 f31191f;
    public w71 h;
    public int f31192n;
    public int f31193r;
    public la f31194s;

    public x71(Context context, h81 h81Var) {
        super(context);
        this.f31190c = new Object();
        this.f31188a = h81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        il0 il0Var = this.f31190c;
        il0Var.f25990a = f7;
        il0Var.f25991b = f10;
        il0Var.f25992c = f11;
        il0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        h00 h00Var = this.f31189b;
        if (h00Var == null || (raVar = h00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f28791n) {
            try {
                if (!raVar.f28794q) {
                    return null;
                }
                return raVar.f28793p;
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
        if (this.f31189b == null && surfaceTexture != null && this.f31188a != null) {
            h00 h00Var = new h00(surfaceTexture, new xv(this, 29), this.f31191f, this.f31194s, i10, i11);
            this.f31189b = h00Var;
            h00Var.i(this.f31192n, this.f31193r);
            h00 h00Var2 = this.f31189b;
            la laVar = this.f31194s;
            ra raVar = h00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f28797t;
                if (laVar2 != null && laVar2.f27010m != null) {
                    laVar2.f27010m = null;
                }
                raVar.f28797t = laVar;
                if (laVar != null && laVar.f27010m != raVar) {
                    laVar.f27010m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                h00 h00Var3 = this.f31189b;
                h00Var3.getClass();
                h00Var3.postRunnable(new d00(h00Var3, i13, i12, 0));
            }
            this.f31189b.d(true, true, false);
            w71 w71Var = this.h;
            if (w71Var != null) {
                w71Var.c(this.f31189b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h00 h00Var = this.f31189b;
        if (h00Var != null) {
            h00Var.postRunnable(new e00(h00Var, 0));
            this.f31189b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h00 h00Var = this.f31189b;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            this.f31189b.d(false, true, false);
            this.f31189b.postRunnable(new v71(this, 0));
        }
    }

    public void setDelegate(w71 w71Var) {
        this.h = w71Var;
        h00 h00Var = this.f31189b;
        if (h00Var != null) {
            if (w71Var == null) {
                h00Var.f(null);
            } else {
                w71Var.c(h00Var);
            }
        }
    }

    public void setHDRInfo(di.j8 j8Var) {
        this.f31191f = j8Var;
        h00 h00Var = this.f31189b;
        if (h00Var != null) {
            h00Var.postRunnable(new sk(25, h00Var, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        h00 h00Var = this.f31189b;
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
