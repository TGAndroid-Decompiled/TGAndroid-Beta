package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class r71 extends TextureView implements TextureView.SurfaceTextureListener {
    public c81 f29863a;
    public e00 f29864b;
    public final fl0 f29865c;
    public int d;
    public int e;
    public ei.z7 f29866f;
    public q71 h;
    public int f29867n;
    public int f29868r;
    public ja f29869s;

    public r71(Context context, c81 c81Var) {
        super(context);
        this.f29865c = new Object();
        this.f29863a = c81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        fl0 fl0Var = this.f29865c;
        fl0Var.f26275a = f7;
        fl0Var.f26276b = f10;
        fl0Var.f26277c = f11;
        fl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        e00 e00Var = this.f29864b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.f29284n) {
            try {
                if (!paVar.f29287q) {
                    return null;
                }
                return paVar.f29286p;
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
        if (this.f29864b == null && surfaceTexture != null && this.f29863a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29866f, this.f29869s, i10, i11);
            this.f29864b = e00Var;
            e00Var.i(this.f29867n, this.f29868r);
            e00 e00Var2 = this.f29864b;
            ja jaVar = this.f29869s;
            pa paVar = e00Var2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f29290t;
                if (jaVar2 != null && jaVar2.f27485m != null) {
                    jaVar2.f27485m = null;
                }
                paVar.f29290t = jaVar;
                if (jaVar != null && jaVar.f27485m != paVar) {
                    jaVar.f27485m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29864b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29864b.d(true, true, false);
            q71 q71Var = this.h;
            if (q71Var != null) {
                q71Var.c(this.f29864b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29864b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29864b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29864b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29864b.d(false, true, false);
            this.f29864b.postRunnable(new hr0(this, 29));
        }
    }

    public void setDelegate(q71 q71Var) {
        this.h = q71Var;
        e00 e00Var = this.f29864b;
        if (e00Var != null) {
            if (q71Var == null) {
                e00Var.f(null);
            } else {
                q71Var.c(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f29866f = z7Var;
        e00 e00Var = this.f29864b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29864b;
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
