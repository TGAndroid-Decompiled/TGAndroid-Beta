package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i71 extends TextureView implements TextureView.SurfaceTextureListener {
    public s71 f24961a;
    public wz f24962b;
    public final sk0 f24963c;
    public int d;
    public int e;
    public ci.k8 f24964f;
    public h71 h;
    public int f24965n;
    public int f24966r;
    public ja f24967s;

    public i71(Context context, s71 s71Var) {
        super(context);
        this.f24963c = new Object();
        this.f24961a = s71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        sk0 sk0Var = this.f24963c;
        sk0Var.f28266a = f7;
        sk0Var.f28267b = f10;
        sk0Var.f28268c = f11;
        sk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        wz wzVar = this.f24962b;
        if (wzVar == null || (paVar = wzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27306n) {
            try {
                if (!paVar.f27309q) {
                    return null;
                }
                return paVar.f27308p;
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
        if (this.f24962b == null && surfaceTexture != null && this.f24961a != null) {
            wz wzVar = new wz(surfaceTexture, new mv(this, 29), this.f24964f, this.f24967s, i10, i11);
            this.f24962b = wzVar;
            wzVar.i(this.f24965n, this.f24966r);
            wz wzVar2 = this.f24962b;
            ja jaVar = this.f24967s;
            pa paVar = wzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27312t;
                if (jaVar2 != null && jaVar2.f25375m != null) {
                    jaVar2.f25375m = null;
                }
                paVar.f27312t = jaVar;
                if (jaVar != null && jaVar.f25375m != paVar) {
                    jaVar.f25375m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                wz wzVar3 = this.f24962b;
                wzVar3.getClass();
                wzVar3.postRunnable(new sz(wzVar3, i13, i12, 0));
            }
            this.f24962b.e(true, true, false);
            h71 h71Var = this.h;
            if (h71Var != null) {
                h71Var.c(this.f24962b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wz wzVar = this.f24962b;
        if (wzVar != null) {
            wzVar.postRunnable(new tz(wzVar, 0));
            this.f24962b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        wz wzVar = this.f24962b;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            this.f24962b.e(false, true, false);
            this.f24962b.postRunnable(new g71(this, 0));
        }
    }

    public void setDelegate(h71 h71Var) {
        this.h = h71Var;
        wz wzVar = this.f24962b;
        if (wzVar != null) {
            if (h71Var == null) {
                wzVar.f(null);
            } else {
                h71Var.c(wzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f24964f = k8Var;
        wz wzVar = this.f24962b;
        if (wzVar != null) {
            wzVar.postRunnable(new vw(7, wzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wz wzVar = this.f24962b;
        if (wzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = wzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                wzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
