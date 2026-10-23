package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class z71 extends TextureView implements TextureView.SurfaceTextureListener {
    public j81 f33157a;
    public e00 f33158b;
    public final il0 f33159c;
    public int d;
    public int e;
    public ei.z7 f33160f;
    public y71 h;
    public int f33161n;
    public int f33162r;
    public ja f33163s;

    public z71(Context context, j81 j81Var) {
        super(context);
        this.f33159c = new Object();
        this.f33157a = j81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        il0 il0Var = this.f33159c;
        il0Var.f27364a = f7;
        il0Var.f27365b = f10;
        il0Var.f27366c = f11;
        il0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f33158b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29488n) {
            try {
                if (!paVar.f29491q) {
                    return null;
                }
                return paVar.f29490p;
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
        if (this.f33158b == null && surfaceTexture != null && this.f33157a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f33160f, this.f33163s, i10, i11);
            this.f33158b = e00Var;
            e00Var.i(this.f33161n, this.f33162r);
            e00 e00Var2 = this.f33158b;
            ja jaVar = this.f33163s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29494t;
                if (jaVar2 != null && jaVar2.f27643m != null) {
                    jaVar2.f27643m = null;
                }
                paVar.f29494t = jaVar;
                if (jaVar != null && jaVar.f27643m != paVar) {
                    jaVar.f27643m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f33158b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f33158b.d(true, true, false);
            y71 y71Var = this.h;
            if (y71Var != null) {
                y71Var.b(this.f33158b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f33158b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f33158b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f33158b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f33158b.d(false, true, false);
            this.f33158b.postRunnable(new x71(this, 0));
        }
    }

    public void setDelegate(y71 y71Var) {
        this.h = y71Var;
        e00 e00Var = this.f33158b;
        if (e00Var != null) {
            if (y71Var == null) {
                e00Var.f(null);
            } else {
                y71Var.b(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f33160f = z7Var;
        e00 e00Var = this.f33158b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f33158b;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = e00Var.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                e00Var.d(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
