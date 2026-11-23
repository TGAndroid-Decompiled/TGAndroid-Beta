package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class x51 extends TextureView implements TextureView.SurfaceTextureListener {
    public h61 f41849a;
    public bz f41850b;
    public final aj0 f41851c;
    public int d;
    public int f41852e;
    public hi.w7 f41853f;
    public w51 h;
    public int f41854n;
    public int f41855r;
    public ba f41856s;

    public x51(Context context, h61 h61Var) {
        super(context);
        this.f41851c = new Object();
        this.f41849a = h61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        aj0 aj0Var = this.f41851c;
        aj0Var.f33482a = f10;
        aj0Var.f33483b = f11;
        aj0Var.f33484c = f12;
        aj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ga gaVar;
        bz bzVar = this.f41850b;
        if (bzVar == null || (gaVar = bzVar.J) == null) {
            return null;
        }
        synchronized (gaVar.f35386n) {
            try {
                if (!gaVar.f35389q) {
                    return null;
                }
                return gaVar.f35388p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f41852e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f41850b == null && surfaceTexture != null && this.f41849a != null) {
            bz bzVar = new bz(surfaceTexture, new hy(this, 25), this.f41853f, this.f41856s, i7, i10);
            this.f41850b = bzVar;
            bzVar.h(this.f41854n, this.f41855r);
            bz bzVar2 = this.f41850b;
            ba baVar = this.f41856s;
            ga gaVar = bzVar2.J;
            if (gaVar != null) {
                ba baVar2 = gaVar.f35392t;
                if (baVar2 != null && baVar2.f33717m != null) {
                    baVar2.f33717m = null;
                }
                gaVar.f35392t = baVar;
                if (baVar != null && baVar.f33717m != gaVar) {
                    baVar.f33717m = gaVar;
                    baVar.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f41852e) != 0) {
                bz bzVar3 = this.f41850b;
                bzVar3.getClass();
                bzVar3.postRunnable(new xy(bzVar3, i12, i11, 0));
            }
            this.f41850b.c(true, true, false);
            w51 w51Var = this.h;
            if (w51Var != null) {
                w51Var.a(this.f41850b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bz bzVar = this.f41850b;
        if (bzVar != null) {
            bzVar.postRunnable(new yy(bzVar, 0));
            this.f41850b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        bz bzVar = this.f41850b;
        if (bzVar != null) {
            bzVar.postRunnable(new xy(bzVar, i7, i10, 1));
            this.f41850b.c(false, true, false);
            this.f41850b.postRunnable(new v51(this, 0));
        }
    }

    public void setDelegate(w51 w51Var) {
        this.h = w51Var;
        bz bzVar = this.f41850b;
        if (bzVar != null) {
            if (w51Var == null) {
                bzVar.d(null);
            } else {
                w51Var.a(bzVar);
            }
        }
    }

    public void setHDRInfo(hi.w7 w7Var) {
        this.f41853f = w7Var;
        bz bzVar = this.f41850b;
        if (bzVar != null) {
            bzVar.postRunnable(new bt(10, bzVar, w7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        bz bzVar = this.f41850b;
        if (bzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ga gaVar = bzVar.J;
            if (gaVar != null) {
                Matrix matrix2 = gaVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                gaVar.c(matrix2);
                bzVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
