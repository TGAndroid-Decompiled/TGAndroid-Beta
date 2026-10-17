package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class p71 extends TextureView implements TextureView.SurfaceTextureListener {
    public a81 f29219a;
    public e00 f29220b;
    public final el0 f29221c;
    public int d;
    public int e;
    public ei.z7 f29222f;
    public o71 h;
    public int f29223n;
    public int f29224r;
    public ja f29225s;

    public p71(Context context, a81 a81Var) {
        super(context);
        this.f29221c = new Object();
        this.f29219a = a81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        el0 el0Var = this.f29221c;
        el0Var.f25956a = f7;
        el0Var.f25957b = f10;
        el0Var.f25958c = f11;
        el0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f29220b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29255n) {
            try {
                if (!paVar.f29258q) {
                    return null;
                }
                return paVar.f29257p;
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
        if (this.f29220b == null && surfaceTexture != null && this.f29219a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29222f, this.f29225s, i10, i11);
            this.f29220b = e00Var;
            e00Var.i(this.f29223n, this.f29224r);
            e00 e00Var2 = this.f29220b;
            ja jaVar = this.f29225s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29261t;
                if (jaVar2 != null && jaVar2.f27485m != null) {
                    jaVar2.f27485m = null;
                }
                paVar.f29261t = jaVar;
                if (jaVar != null && jaVar.f27485m != paVar) {
                    jaVar.f27485m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29220b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29220b.d(true, true, false);
            o71 o71Var = this.h;
            if (o71Var != null) {
                o71Var.c(this.f29220b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29220b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29220b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29220b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29220b.d(false, true, false);
            this.f29220b.postRunnable(new fr0(this, 29));
        }
    }

    public void setDelegate(o71 o71Var) {
        this.h = o71Var;
        e00 e00Var = this.f29220b;
        if (e00Var != null) {
            if (o71Var == null) {
                e00Var.f(null);
            } else {
                o71Var.c(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f29222f = z7Var;
        e00 e00Var = this.f29220b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29220b;
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
