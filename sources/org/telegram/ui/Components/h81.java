package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class h81 extends TextureView implements TextureView.SurfaceTextureListener {
    public s81 f28859a;
    public e00 f28860b;
    public final hl0 f28861c;
    public int d;
    public int e;
    public fi.v7 f28862f;
    public g81 h;
    public int f28863n;
    public int f28864r;
    public la f28865s;

    public h81(Context context, s81 s81Var) {
        super(context);
        this.f28861c = new Object();
        this.f28859a = s81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hl0 hl0Var = this.f28861c;
        hl0Var.f29007a = f7;
        hl0Var.f29008b = f10;
        hl0Var.f29009c = f11;
        hl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        e00 e00Var = this.f28860b;
        if (e00Var == null || (raVar = e00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f32194n) {
            try {
                if (!raVar.f32197q) {
                    return null;
                }
                return raVar.f32196p;
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
        if (this.f28860b == null && surfaceTexture != null && this.f28859a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f28862f, this.f28865s, i10, i11);
            this.f28860b = e00Var;
            e00Var.i(this.f28863n, this.f28864r);
            e00 e00Var2 = this.f28860b;
            la laVar = this.f28865s;
            ra raVar = e00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f32200t;
                if (laVar2 != null && laVar2.f30144m != null) {
                    laVar2.f30144m = null;
                }
                raVar.f32200t = laVar;
                if (laVar != null && laVar.f30144m != raVar) {
                    laVar.f30144m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f28860b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f28860b.d(true, true, false);
            g81 g81Var = this.h;
            if (g81Var != null) {
                g81Var.d(this.f28860b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f28860b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f28860b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f28860b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f28860b.d(false, true, false);
            this.f28860b.postRunnable(new s51(this, 5));
        }
    }

    public void setDelegate(g81 g81Var) {
        this.h = g81Var;
        e00 e00Var = this.f28860b;
        if (e00Var != null) {
            if (g81Var == null) {
                e00Var.f(null);
            } else {
                g81Var.d(e00Var);
            }
        }
    }

    public void setHDRInfo(fi.v7 v7Var) {
        this.f28862f = v7Var;
        e00 e00Var = this.f28860b;
        if (e00Var != null) {
            e00Var.postRunnable(new so(19, e00Var, v7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f28860b;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = e00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                e00Var.d(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
