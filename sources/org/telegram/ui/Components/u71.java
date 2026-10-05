package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class u71 extends TextureView implements TextureView.SurfaceTextureListener {
    public e81 f31369a;
    public yz f31370b;
    public final uk0 f31371c;
    public int d;
    public int f31372e;
    public ci.j8 f31373f;
    public t71 h;
    public int f31374n;
    public int f31375r;
    public ka f31376s;

    public u71(Context context, e81 e81Var) {
        super(context);
        this.f31371c = new Object();
        this.f31369a = e81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f31371c;
        uk0Var.f31448a = f7;
        uk0Var.f31449b = f10;
        uk0Var.f31450c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        qa qaVar;
        yz yzVar = this.f31370b;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.f30010n) {
            try {
                if (!qaVar.f30013q) {
                    return null;
                }
                return qaVar.f30012p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f31372e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f31370b == null && surfaceTexture != null && this.f31369a != null) {
            yz yzVar = new yz(surfaceTexture, new pv(this, 28), this.f31373f, this.f31376s, i10, i11);
            this.f31370b = yzVar;
            yzVar.i(this.f31374n, this.f31375r);
            yz yzVar2 = this.f31370b;
            ka kaVar = this.f31376s;
            qa qaVar = yzVar2.I;
            if (qaVar != null) {
                ka kaVar2 = qaVar.f30016t;
                if (kaVar2 != null && kaVar2.f28146m != null) {
                    kaVar2.f28146m = null;
                }
                qaVar.f30016t = kaVar;
                if (kaVar != null && kaVar.f28146m != qaVar) {
                    kaVar.f28146m = qaVar;
                    kaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f31372e) != 0) {
                yz yzVar3 = this.f31370b;
                yzVar3.getClass();
                yzVar3.postRunnable(new uz(yzVar3, i13, i12, 0));
            }
            this.f31370b.e(true, true, false);
            t71 t71Var = this.h;
            if (t71Var != null) {
                t71Var.c(this.f31370b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yz yzVar = this.f31370b;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            this.f31370b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yz yzVar = this.f31370b;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            this.f31370b.e(false, true, false);
            this.f31370b.postRunnable(new q61(this, 2));
        }
    }

    public void setDelegate(t71 t71Var) {
        this.h = t71Var;
        yz yzVar = this.f31370b;
        if (yzVar != null) {
            if (t71Var == null) {
                yzVar.f(null);
            } else {
                t71Var.c(yzVar);
            }
        }
    }

    public void setHDRInfo(ci.j8 j8Var) {
        this.f31373f = j8Var;
        yz yzVar = this.f31370b;
        if (yzVar != null) {
            yzVar.postRunnable(new yw(6, yzVar, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.f31370b;
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
