package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class k51 extends TextureView implements TextureView.SurfaceTextureListener {
    public u51 f36289a;
    public wy f36290b;
    public final pi0 f36291c;
    public int d;
    public int f36292e;
    public hi.c7 f36293f;
    public j51 h;
    public int f36294n;
    public int f36295r;
    public u9 f36296s;

    public k51(Context context, u51 u51Var) {
        super(context);
        this.f36291c = new Object();
        this.f36289a = u51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        pi0 pi0Var = this.f36291c;
        pi0Var.f38312a = f10;
        pi0Var.f38313b = f11;
        pi0Var.f38314c = f12;
        pi0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        z9 z9Var;
        wy wyVar = this.f36290b;
        if (wyVar == null || (z9Var = wyVar.J) == null) {
            return null;
        }
        synchronized (z9Var.f42319n) {
            try {
                if (!z9Var.f42322q) {
                    return null;
                }
                return z9Var.f42321p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f36292e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.f36290b == null && surfaceTexture != null && this.f36289a != null) {
            wy wyVar = new wy(surfaceTexture, new gx(this, 26), this.f36293f, this.f36296s, i7, i10);
            this.f36290b = wyVar;
            wyVar.h(this.f36294n, this.f36295r);
            wy wyVar2 = this.f36290b;
            u9 u9Var = this.f36296s;
            z9 z9Var = wyVar2.J;
            if (z9Var != null) {
                u9 u9Var2 = z9Var.f42325t;
                if (u9Var2 != null && u9Var2.f39977m != null) {
                    u9Var2.f39977m = null;
                }
                z9Var.f42325t = u9Var;
                if (u9Var != null && u9Var.f39977m != z9Var) {
                    u9Var.f39977m = z9Var;
                    u9Var.d();
                }
            }
            int i12 = this.d;
            if (i12 != 0 && (i11 = this.f36292e) != 0) {
                wy wyVar3 = this.f36290b;
                wyVar3.getClass();
                wyVar3.postRunnable(new sy(wyVar3, i12, i11, 0));
            }
            this.f36290b.c(true, true, false);
            j51 j51Var = this.h;
            if (j51Var != null) {
                j51Var.b(this.f36290b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wy wyVar = this.f36290b;
        if (wyVar != null) {
            wyVar.postRunnable(new ty(wyVar, 0));
            this.f36290b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        wy wyVar = this.f36290b;
        if (wyVar != null) {
            wyVar.postRunnable(new sy(wyVar, i7, i10, 1));
            this.f36290b.c(false, true, false);
            this.f36290b.postRunnable(new w41(this, 1));
        }
    }

    public void setDelegate(j51 j51Var) {
        this.h = j51Var;
        wy wyVar = this.f36290b;
        if (wyVar != null) {
            if (j51Var == null) {
                wyVar.d(null);
            } else {
                j51Var.b(wyVar);
            }
        }
    }

    public void setHDRInfo(hi.c7 c7Var) {
        this.f36293f = c7Var;
        wy wyVar = this.f36290b;
        if (wyVar != null) {
            wyVar.postRunnable(new vs(10, wyVar, c7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wy wyVar = this.f36290b;
        if (wyVar != null) {
            int width = getWidth();
            int height = getHeight();
            z9 z9Var = wyVar.J;
            if (z9Var != null) {
                Matrix matrix2 = z9Var.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                z9Var.c(matrix2);
                wyVar.c(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
