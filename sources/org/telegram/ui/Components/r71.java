package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class r71 extends TextureView implements TextureView.SurfaceTextureListener {
    public c81 f29859a;
    public e00 f29860b;
    public final fl0 f29861c;
    public int d;
    public int e;
    public ei.z7 f29862f;
    public q71 h;
    public int f29863n;
    public int f29864r;
    public ja f29865s;

    public r71(Context context, c81 c81Var) {
        super(context);
        this.f29861c = new Object();
        this.f29859a = c81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        fl0 fl0Var = this.f29861c;
        fl0Var.f26272a = f7;
        fl0Var.f26273b = f10;
        fl0Var.f26274c = f11;
        fl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f29860b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29280n) {
            try {
                if (!paVar.f29283q) {
                    return null;
                }
                return paVar.f29282p;
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
        if (this.f29860b == null && surfaceTexture != null && this.f29859a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29862f, this.f29865s, i10, i11);
            this.f29860b = e00Var;
            e00Var.i(this.f29863n, this.f29864r);
            e00 e00Var2 = this.f29860b;
            ja jaVar = this.f29865s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29286t;
                if (jaVar2 != null && jaVar2.f27482m != null) {
                    jaVar2.f27482m = null;
                }
                paVar.f29286t = jaVar;
                if (jaVar != null && jaVar.f27482m != paVar) {
                    jaVar.f27482m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29860b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29860b.d(true, true, false);
            q71 q71Var = this.h;
            if (q71Var != null) {
                q71Var.c(this.f29860b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29860b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29860b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29860b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29860b.d(false, true, false);
            this.f29860b.postRunnable(new hr0(this, 29));
        }
    }

    public void setDelegate(q71 q71Var) {
        this.h = q71Var;
        e00 e00Var = this.f29860b;
        if (e00Var != null) {
            if (q71Var == null) {
                e00Var.f(null);
            } else {
                q71Var.c(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f29862f = z7Var;
        e00 e00Var = this.f29860b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29860b;
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
