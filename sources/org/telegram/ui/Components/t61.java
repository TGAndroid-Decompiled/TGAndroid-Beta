package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class t61 extends TextureView implements TextureView.SurfaceTextureListener {
    public f71 f28101a;
    public wz f28102b;
    public final ik0 f28103c;
    public int d;
    public int e;
    public ci.k8 f28104f;
    public s61 h;
    public int f28105n;
    public int f28106r;
    public ja f28107s;

    public t61(Context context, f71 f71Var) {
        super(context);
        this.f28103c = new Object();
        this.f28101a = f71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        ik0 ik0Var = this.f28103c;
        ik0Var.f24988a = f7;
        ik0Var.f24989b = f10;
        ik0Var.f24990c = f11;
        ik0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        wz wzVar = this.f28102b;
        if (wzVar == null || (paVar = wzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f26985n) {
            try {
                if (!paVar.f26988q) {
                    return null;
                }
                return paVar.f26987p;
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
        if (this.f28102b == null && surfaceTexture != null && this.f28101a != null) {
            wz wzVar = new wz(surfaceTexture, new mv(this, 28), this.f28104f, this.f28107s, i10, i11);
            this.f28102b = wzVar;
            wzVar.i(this.f28105n, this.f28106r);
            wz wzVar2 = this.f28102b;
            ja jaVar = this.f28107s;
            pa paVar = wzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f26991t;
                if (jaVar2 != null && jaVar2.f25237m != null) {
                    jaVar2.f25237m = null;
                }
                paVar.f26991t = jaVar;
                if (jaVar != null && jaVar.f25237m != paVar) {
                    jaVar.f25237m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                wz wzVar3 = this.f28102b;
                wzVar3.getClass();
                wzVar3.postRunnable(new sz(wzVar3, i13, i12, 0));
            }
            this.f28102b.e(true, true, false);
            s61 s61Var = this.h;
            if (s61Var != null) {
                s61Var.b(this.f28102b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wz wzVar = this.f28102b;
        if (wzVar != null) {
            wzVar.postRunnable(new tz(wzVar, 0));
            this.f28102b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        wz wzVar = this.f28102b;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            this.f28102b.e(false, true, false);
            this.f28102b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(s61 s61Var) {
        this.h = s61Var;
        wz wzVar = this.f28102b;
        if (wzVar != null) {
            if (s61Var == null) {
                wzVar.f(null);
            } else {
                s61Var.b(wzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f28104f = k8Var;
        wz wzVar = this.f28102b;
        if (wzVar != null) {
            wzVar.postRunnable(new oy(2, wzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wz wzVar = this.f28102b;
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
