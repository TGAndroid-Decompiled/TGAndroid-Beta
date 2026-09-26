package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i71 extends TextureView implements TextureView.SurfaceTextureListener {
    public s71 f24960a;
    public wz f24961b;
    public final sk0 f24962c;
    public int d;
    public int e;
    public ci.k8 f24963f;
    public h71 h;
    public int f24964n;
    public int f24965r;
    public ja f24966s;

    public i71(Context context, s71 s71Var) {
        super(context);
        this.f24962c = new Object();
        this.f24960a = s71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        sk0 sk0Var = this.f24962c;
        sk0Var.f28265a = f7;
        sk0Var.f28266b = f10;
        sk0Var.f28267c = f11;
        sk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        wz wzVar = this.f24961b;
        if (wzVar == null || (paVar = wzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27305n) {
            try {
                if (!paVar.f27308q) {
                    return null;
                }
                return paVar.f27307p;
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
        if (this.f24961b == null && surfaceTexture != null && this.f24960a != null) {
            wz wzVar = new wz(surfaceTexture, new mv(this, 29), this.f24963f, this.f24966s, i10, i11);
            this.f24961b = wzVar;
            wzVar.i(this.f24964n, this.f24965r);
            wz wzVar2 = this.f24961b;
            ja jaVar = this.f24966s;
            pa paVar = wzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27311t;
                if (jaVar2 != null && jaVar2.f25374m != null) {
                    jaVar2.f25374m = null;
                }
                paVar.f27311t = jaVar;
                if (jaVar != null && jaVar.f25374m != paVar) {
                    jaVar.f25374m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                wz wzVar3 = this.f24961b;
                wzVar3.getClass();
                wzVar3.postRunnable(new sz(wzVar3, i13, i12, 0));
            }
            this.f24961b.e(true, true, false);
            h71 h71Var = this.h;
            if (h71Var != null) {
                h71Var.c(this.f24961b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wz wzVar = this.f24961b;
        if (wzVar != null) {
            wzVar.postRunnable(new tz(wzVar, 0));
            this.f24961b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        wz wzVar = this.f24961b;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            this.f24961b.e(false, true, false);
            this.f24961b.postRunnable(new g71(this, 0));
        }
    }

    public void setDelegate(h71 h71Var) {
        this.h = h71Var;
        wz wzVar = this.f24961b;
        if (wzVar != null) {
            if (h71Var == null) {
                wzVar.f(null);
            } else {
                h71Var.c(wzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f24963f = k8Var;
        wz wzVar = this.f24961b;
        if (wzVar != null) {
            wzVar.postRunnable(new vw(7, wzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wz wzVar = this.f24961b;
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
