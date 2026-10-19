package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class q71 extends TextureView implements TextureView.SurfaceTextureListener {
    public b81 f29537a;
    public e00 f29538b;
    public final el0 f29539c;
    public int d;
    public int e;
    public ei.z7 f29540f;
    public p71 h;
    public int f29541n;
    public int f29542r;
    public ja f29543s;

    public q71(Context context, b81 b81Var) {
        super(context);
        this.f29539c = new Object();
        this.f29537a = b81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        el0 el0Var = this.f29539c;
        el0Var.f25945a = f7;
        el0Var.f25946b = f10;
        el0Var.f25947c = f11;
        el0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f29538b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29225n) {
            try {
                if (!paVar.f29228q) {
                    return null;
                }
                return paVar.f29227p;
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
        if (this.f29538b == null && surfaceTexture != null && this.f29537a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29540f, this.f29543s, i10, i11);
            this.f29538b = e00Var;
            e00Var.i(this.f29541n, this.f29542r);
            e00 e00Var2 = this.f29538b;
            ja jaVar = this.f29543s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29231t;
                if (jaVar2 != null && jaVar2.f27486m != null) {
                    jaVar2.f27486m = null;
                }
                paVar.f29231t = jaVar;
                if (jaVar != null && jaVar.f27486m != paVar) {
                    jaVar.f27486m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29538b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29538b.d(true, true, false);
            p71 p71Var = this.h;
            if (p71Var != null) {
                p71Var.c(this.f29538b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29538b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29538b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29538b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29538b.d(false, true, false);
            this.f29538b.postRunnable(new gr0(this, 29));
        }
    }

    public void setDelegate(p71 p71Var) {
        this.h = p71Var;
        e00 e00Var = this.f29538b;
        if (e00Var != null) {
            if (p71Var == null) {
                e00Var.f(null);
            } else {
                p71Var.c(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f29540f = z7Var;
        e00 e00Var = this.f29538b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29538b;
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
