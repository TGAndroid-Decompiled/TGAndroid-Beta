package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class b51 extends TextureView implements TextureView.SurfaceTextureListener {
    public m51 f32087a;
    public py f32088b;
    public final ni0 f32089c;
    public int d;
    public int f32090e;
    public gi.e7 f32091f;
    public a51 h;
    public int f32092n;
    public int f32093r;
    public x9 f32094s;

    public b51(Context context, m51 m51Var) {
        super(context);
        this.f32089c = new Object();
        this.f32087a = m51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ni0 ni0Var = this.f32089c;
        ni0Var.f36563a = f10;
        ni0Var.f36564b = f11;
        ni0Var.f36565c = f12;
        ni0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        py pyVar = this.f32088b;
        if (pyVar == null || (caVar = pyVar.J) == null) {
            return null;
        }
        synchronized (caVar.f32632n) {
            try {
                if (!caVar.f32635q) {
                    return null;
                }
                return caVar.f32634p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f32090e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        int i11;
        if (this.f32088b == null && surfaceTexture != null && this.f32087a != null) {
            py pyVar = new py(surfaceTexture, new zw(this, 26), this.f32091f, this.f32094s, i3, i10);
            this.f32088b = pyVar;
            pyVar.h(this.f32092n, this.f32093r);
            py pyVar2 = this.f32088b;
            x9 x9Var = this.f32094s;
            ca caVar = pyVar2.J;
            if (caVar != null) {
                x9 x9Var2 = caVar.f32638t;
                if (x9Var2 != null && x9Var2.f40281m != null) {
                    x9Var2.f40281m = null;
                }
                caVar.f32638t = x9Var;
                if (x9Var != null && x9Var.f40281m != caVar) {
                    x9Var.f40281m = caVar;
                    x9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f32090e) != 0) {
                py pyVar3 = this.f32088b;
                pyVar3.getClass();
                pyVar3.postRunnable(new ly(pyVar3, i12, i11, 0));
            }
            this.f32088b.c(true, true, false);
            a51 a51Var = this.h;
            if (a51Var != null) {
                a51Var.a(this.f32088b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        py pyVar = this.f32088b;
        if (pyVar != null) {
            pyVar.postRunnable(new my(pyVar, 0));
            this.f32088b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        py pyVar = this.f32088b;
        if (pyVar != null) {
            pyVar.postRunnable(new ly(pyVar, i3, i10, 1));
            this.f32088b.c(false, true, false);
            this.f32088b.postRunnable(new sp0(this, 29));
        }
    }

    public void setDelegate(a51 a51Var) {
        this.h = a51Var;
        py pyVar = this.f32088b;
        if (pyVar != null) {
            if (a51Var == null) {
                pyVar.e(null);
            } else {
                a51Var.a(pyVar);
            }
        }
    }

    public void setHDRInfo(gi.e7 e7Var) {
        this.f32091f = e7Var;
        py pyVar = this.f32088b;
        if (pyVar != null) {
            pyVar.postRunnable(new cl(21, pyVar, e7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        py pyVar = this.f32088b;
        if (pyVar != null) {
            int width = getWidth();
            int height = getHeight();
            ca caVar = pyVar.J;
            if (caVar != null) {
                Matrix matrix2 = caVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                caVar.c(matrix2);
                pyVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
