package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class t71 extends TextureView implements TextureView.SurfaceTextureListener {
    public d81 f30989a;
    public yz f30990b;
    public final uk0 f30991c;
    public int d;
    public int f30992e;
    public ci.j8 f30993f;
    public s71 h;
    public int f30994n;
    public int f30995r;
    public ka f30996s;

    public t71(Context context, d81 d81Var) {
        super(context);
        this.f30991c = new Object();
        this.f30989a = d81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f30991c;
        uk0Var.f31394a = f7;
        uk0Var.f31395b = f10;
        uk0Var.f31396c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        qa qaVar;
        yz yzVar = this.f30990b;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.f29988n) {
            try {
                if (!qaVar.f29991q) {
                    return null;
                }
                return qaVar.f29990p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30992e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30990b == null && surfaceTexture != null && this.f30989a != null) {
            yz yzVar = new yz(surfaceTexture, new pv(this, 28), this.f30993f, this.f30996s, i10, i11);
            this.f30990b = yzVar;
            yzVar.i(this.f30994n, this.f30995r);
            yz yzVar2 = this.f30990b;
            ka kaVar = this.f30996s;
            qa qaVar = yzVar2.I;
            if (qaVar != null) {
                ka kaVar2 = qaVar.f29994t;
                if (kaVar2 != null && kaVar2.f28060m != null) {
                    kaVar2.f28060m = null;
                }
                qaVar.f29994t = kaVar;
                if (kaVar != null && kaVar.f28060m != qaVar) {
                    kaVar.f28060m = qaVar;
                    kaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30992e) != 0) {
                yz yzVar3 = this.f30990b;
                yzVar3.getClass();
                yzVar3.postRunnable(new uz(yzVar3, i13, i12, 0));
            }
            this.f30990b.e(true, true, false);
            s71 s71Var = this.h;
            if (s71Var != null) {
                s71Var.c(this.f30990b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yz yzVar = this.f30990b;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            this.f30990b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yz yzVar = this.f30990b;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            this.f30990b.e(false, true, false);
            this.f30990b.postRunnable(new f71(this, 1));
        }
    }

    public void setDelegate(s71 s71Var) {
        this.h = s71Var;
        yz yzVar = this.f30990b;
        if (yzVar != null) {
            if (s71Var == null) {
                yzVar.f(null);
            } else {
                s71Var.c(yzVar);
            }
        }
    }

    public void setHDRInfo(ci.j8 j8Var) {
        this.f30993f = j8Var;
        yz yzVar = this.f30990b;
        if (yzVar != null) {
            yzVar.postRunnable(new yw(6, yzVar, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.f30990b;
        if (yzVar != null) {
            int width = getWidth();
            int height = getHeight();
            qa qaVar = yzVar.I;
            if (qaVar != null) {
                Matrix matrix2 = qaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                qaVar.c(matrix2);
                yzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
