package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class t71 extends TextureView implements TextureView.SurfaceTextureListener {
    public d81 f30982a;
    public yz f30983b;
    public final uk0 f30984c;
    public int d;
    public int f30985e;
    public ci.j8 f30986f;
    public s71 h;
    public int f30987n;
    public int f30988r;
    public ka f30989s;

    public t71(Context context, d81 d81Var) {
        super(context);
        this.f30984c = new Object();
        this.f30982a = d81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f30984c;
        uk0Var.f31387a = f7;
        uk0Var.f31388b = f10;
        uk0Var.f31389c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        qa qaVar;
        yz yzVar = this.f30983b;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.f29982n) {
            try {
                if (!qaVar.f29985q) {
                    return null;
                }
                return qaVar.f29984p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f30985e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f30983b == null && surfaceTexture != null && this.f30982a != null) {
            yz yzVar = new yz(surfaceTexture, new pv(this, 28), this.f30986f, this.f30989s, i10, i11);
            this.f30983b = yzVar;
            yzVar.i(this.f30987n, this.f30988r);
            yz yzVar2 = this.f30983b;
            ka kaVar = this.f30989s;
            qa qaVar = yzVar2.I;
            if (qaVar != null) {
                ka kaVar2 = qaVar.f29988t;
                if (kaVar2 != null && kaVar2.f28054m != null) {
                    kaVar2.f28054m = null;
                }
                qaVar.f29988t = kaVar;
                if (kaVar != null && kaVar.f28054m != qaVar) {
                    kaVar.f28054m = qaVar;
                    kaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f30985e) != 0) {
                yz yzVar3 = this.f30983b;
                yzVar3.getClass();
                yzVar3.postRunnable(new uz(yzVar3, i13, i12, 0));
            }
            this.f30983b.e(true, true, false);
            s71 s71Var = this.h;
            if (s71Var != null) {
                s71Var.c(this.f30983b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yz yzVar = this.f30983b;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            this.f30983b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yz yzVar = this.f30983b;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            this.f30983b.e(false, true, false);
            this.f30983b.postRunnable(new f71(this, 1));
        }
    }

    public void setDelegate(s71 s71Var) {
        this.h = s71Var;
        yz yzVar = this.f30983b;
        if (yzVar != null) {
            if (s71Var == null) {
                yzVar.f(null);
            } else {
                s71Var.c(yzVar);
            }
        }
    }

    public void setHDRInfo(ci.j8 j8Var) {
        this.f30986f = j8Var;
        yz yzVar = this.f30983b;
        if (yzVar != null) {
            yzVar.postRunnable(new yw(6, yzVar, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.f30983b;
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
