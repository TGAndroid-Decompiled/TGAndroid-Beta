package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class f81 extends TextureView implements TextureView.SurfaceTextureListener {
    public q81 f25965a;
    public o00 f25966b;
    public final sl0 f25967c;
    public int d;
    public int f25968e;
    public ci.k8 f25969f;
    public e81 h;
    public int f25970n;
    public int f25971r;
    public la f25972s;

    public f81(Context context, q81 q81Var) {
        super(context);
        this.f25967c = new Object();
        this.f25965a = q81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        sl0 sl0Var = this.f25967c;
        sl0Var.f30589a = f7;
        sl0Var.f30590b = f10;
        sl0Var.f30591c = f11;
        sl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        o00 o00Var = this.f25966b;
        if (o00Var == null || (raVar = o00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f30127n) {
            try {
                if (!raVar.f30130q) {
                    return null;
                }
                return raVar.f30129p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f25968e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f25966b == null && surfaceTexture != null && this.f25965a != null) {
            o00 o00Var = new o00(surfaceTexture, new ew(this, 29), this.f25969f, this.f25972s, i10, i11);
            this.f25966b = o00Var;
            o00Var.i(this.f25970n, this.f25971r);
            o00 o00Var2 = this.f25966b;
            la laVar = this.f25972s;
            ra raVar = o00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f30133t;
                if (laVar2 != null && laVar2.f28127m != null) {
                    laVar2.f28127m = null;
                }
                raVar.f30133t = laVar;
                if (laVar != null && laVar.f28127m != raVar) {
                    laVar.f28127m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f25968e) != 0) {
                o00 o00Var3 = this.f25966b;
                o00Var3.getClass();
                o00Var3.postRunnable(new k00(o00Var3, i13, i12, 0));
            }
            this.f25966b.e(true, true, false);
            e81 e81Var = this.h;
            if (e81Var != null) {
                e81Var.b(this.f25966b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o00 o00Var = this.f25966b;
        if (o00Var != null) {
            o00Var.postRunnable(new l00(o00Var, 0));
            this.f25966b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        o00 o00Var = this.f25966b;
        if (o00Var != null) {
            o00Var.postRunnable(new k00(o00Var, i10, i11, 1));
            this.f25966b.e(false, true, false);
            this.f25966b.postRunnable(new d81(this, 0));
        }
    }

    public void setDelegate(e81 e81Var) {
        this.h = e81Var;
        o00 o00Var = this.f25966b;
        if (o00Var != null) {
            if (e81Var == null) {
                o00Var.f(null);
            } else {
                e81Var.b(o00Var);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f25969f = k8Var;
        o00 o00Var = this.f25966b;
        if (o00Var != null) {
            o00Var.postRunnable(new jt(12, o00Var, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        o00 o00Var = this.f25966b;
        if (o00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = o00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                o00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
