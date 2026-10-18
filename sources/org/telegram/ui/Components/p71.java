package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class p71 extends TextureView implements TextureView.SurfaceTextureListener {
    public a81 f29226a;
    public e00 f29227b;
    public final el0 f29228c;
    public int d;
    public int e;
    public ei.z7 f29229f;
    public o71 h;
    public int f29230n;
    public int f29231r;
    public ja f29232s;

    public p71(Context context, a81 a81Var) {
        super(context);
        this.f29228c = new Object();
        this.f29226a = a81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        el0 el0Var = this.f29228c;
        el0Var.f25963a = f7;
        el0Var.f25964b = f10;
        el0Var.f25965c = f11;
        el0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f29227b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29262n) {
            try {
                if (!paVar.f29265q) {
                    return null;
                }
                return paVar.f29264p;
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
        if (this.f29227b == null && surfaceTexture != null && this.f29226a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29229f, this.f29232s, i10, i11);
            this.f29227b = e00Var;
            e00Var.i(this.f29230n, this.f29231r);
            e00 e00Var2 = this.f29227b;
            ja jaVar = this.f29232s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29268t;
                if (jaVar2 != null && jaVar2.f27492m != null) {
                    jaVar2.f27492m = null;
                }
                paVar.f29268t = jaVar;
                if (jaVar != null && jaVar.f27492m != paVar) {
                    jaVar.f27492m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29227b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29227b.d(true, true, false);
            o71 o71Var = this.h;
            if (o71Var != null) {
                o71Var.c(this.f29227b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29227b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29227b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29227b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29227b.d(false, true, false);
            this.f29227b.postRunnable(new fr0(this, 29));
        }
    }

    public void setDelegate(o71 o71Var) {
        this.h = o71Var;
        e00 e00Var = this.f29227b;
        if (e00Var != null) {
            if (o71Var == null) {
                e00Var.f(null);
            } else {
                o71Var.c(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f29229f = z7Var;
        e00 e00Var = this.f29227b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29227b;
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
