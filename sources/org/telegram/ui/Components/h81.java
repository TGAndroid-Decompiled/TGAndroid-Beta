package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class h81 extends TextureView implements TextureView.SurfaceTextureListener {
    public s81 f28861a;
    public e00 f28862b;
    public final hl0 f28863c;
    public int d;
    public int e;
    public fi.v7 f28864f;
    public g81 h;
    public int f28865n;
    public int f28866r;
    public la f28867s;

    public h81(Context context, s81 s81Var) {
        super(context);
        this.f28863c = new Object();
        this.f28861a = s81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hl0 hl0Var = this.f28863c;
        hl0Var.f29009a = f7;
        hl0Var.f29010b = f10;
        hl0Var.f29011c = f11;
        hl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        e00 e00Var = this.f28862b;
        if (e00Var == null || (raVar = e00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f32196n) {
            try {
                if (!raVar.f32199q) {
                    return null;
                }
                return raVar.f32198p;
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
        if (this.f28862b == null && surfaceTexture != null && this.f28861a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f28864f, this.f28867s, i10, i11);
            this.f28862b = e00Var;
            e00Var.i(this.f28865n, this.f28866r);
            e00 e00Var2 = this.f28862b;
            la laVar = this.f28867s;
            ra raVar = e00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f32202t;
                if (laVar2 != null && laVar2.f30146m != null) {
                    laVar2.f30146m = null;
                }
                raVar.f32202t = laVar;
                if (laVar != null && laVar.f30146m != raVar) {
                    laVar.f30146m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f28862b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f28862b.d(true, true, false);
            g81 g81Var = this.h;
            if (g81Var != null) {
                g81Var.d(this.f28862b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f28862b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f28862b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f28862b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f28862b.d(false, true, false);
            this.f28862b.postRunnable(new s51(this, 5));
        }
    }

    public void setDelegate(g81 g81Var) {
        this.h = g81Var;
        e00 e00Var = this.f28862b;
        if (e00Var != null) {
            if (g81Var == null) {
                e00Var.f(null);
            } else {
                g81Var.d(e00Var);
            }
        }
    }

    public void setHDRInfo(fi.v7 v7Var) {
        this.f28864f = v7Var;
        e00 e00Var = this.f28862b;
        if (e00Var != null) {
            e00Var.postRunnable(new so(19, e00Var, v7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f28862b;
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
