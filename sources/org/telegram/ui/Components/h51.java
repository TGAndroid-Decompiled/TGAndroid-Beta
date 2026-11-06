package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class h51 extends TextureView implements TextureView.SurfaceTextureListener {
    public t51 f34178a;
    public ry f34179b;
    public final ki0 f34180c;
    public int d;
    public int f34181e;
    public fi.d7 f34182f;
    public g51 h;
    public int f34183n;
    public int f34184r;
    public y9 f34185s;

    public h51(Context context, t51 t51Var) {
        super(context);
        this.f34180c = new Object();
        this.f34178a = t51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.f34180c;
        ki0Var.f35313a = f10;
        ki0Var.f35314b = f11;
        ki0Var.f35315c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        ry ryVar = this.f34179b;
        if (ryVar == null || (daVar = ryVar.I) == null) {
            return null;
        }
        synchronized (daVar.f32840n) {
            try {
                if (!daVar.f32843q) {
                    return null;
                }
                return daVar.f32842p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f34181e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f34179b == null && surfaceTexture != null && this.f34178a != null) {
            ry ryVar = new ry(surfaceTexture, new ax(this, 26), this.f34182f, this.f34185s, i7, i10);
            this.f34179b = ryVar;
            ryVar.h(this.f34183n, this.f34184r);
            ry ryVar2 = this.f34179b;
            y9 y9Var = this.f34185s;
            da daVar = ryVar2.I;
            if (daVar != null) {
                y9 y9Var2 = daVar.f32846t;
                if (y9Var2 != null && y9Var2.f40609m != null) {
                    y9Var2.f40609m = null;
                }
                daVar.f32846t = y9Var;
                if (y9Var != null && y9Var.f40609m != daVar) {
                    y9Var.f40609m = daVar;
                    y9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f34181e) != 0) {
                ry ryVar3 = this.f34179b;
                ryVar3.getClass();
                ryVar3.postRunnable(new ny(ryVar3, i12, i11, 0));
            }
            this.f34179b.c(true, true, false);
            g51 g51Var = this.h;
            if (g51Var != null) {
                g51Var.a(this.f34179b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ry ryVar = this.f34179b;
        if (ryVar != null) {
            ryVar.postRunnable(new oy(ryVar, 0));
            this.f34179b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ry ryVar = this.f34179b;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            this.f34179b.c(false, true, false);
            this.f34179b.postRunnable(new ir0(this, 28));
        }
    }

    public void setDelegate(g51 g51Var) {
        this.h = g51Var;
        ry ryVar = this.f34179b;
        if (ryVar != null) {
            if (g51Var == null) {
                ryVar.d(null);
            } else {
                g51Var.a(ryVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f34182f = d7Var;
        ry ryVar = this.f34179b;
        if (ryVar != null) {
            ryVar.postRunnable(new fq(16, ryVar, d7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ry ryVar = this.f34179b;
        if (ryVar != null) {
            int width = getWidth();
            int height = getHeight();
            da daVar = ryVar.I;
            if (daVar != null) {
                Matrix matrix2 = daVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                daVar.c(matrix2);
                ryVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
