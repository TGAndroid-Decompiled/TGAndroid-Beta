package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class j71 extends TextureView implements TextureView.SurfaceTextureListener {
    public u71 f25193a;
    public vz f25194b;
    public final sk0 f25195c;
    public int d;
    public int e;
    public ci.n8 f25196f;
    public i71 h;
    public int f25197n;
    public int f25198r;
    public ja f25199s;

    public j71(Context context, u71 u71Var) {
        super(context);
        this.f25195c = new Object();
        this.f25193a = u71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        sk0 sk0Var = this.f25195c;
        sk0Var.f28186a = f7;
        sk0Var.f28187b = f10;
        sk0Var.f28188c = f11;
        sk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        vz vzVar = this.f25194b;
        if (vzVar == null || (paVar = vzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27174n) {
            try {
                if (!paVar.f27177q) {
                    return null;
                }
                return paVar.f27176p;
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
        if (this.f25194b == null && surfaceTexture != null && this.f25193a != null) {
            vz vzVar = new vz(surfaceTexture, new lv(this, 28), this.f25196f, this.f25199s, i10, i11);
            this.f25194b = vzVar;
            vzVar.i(this.f25197n, this.f25198r);
            vz vzVar2 = this.f25194b;
            ja jaVar = this.f25199s;
            pa paVar = vzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27180t;
                if (jaVar2 != null && jaVar2.f25280m != null) {
                    jaVar2.f25280m = null;
                }
                paVar.f27180t = jaVar;
                if (jaVar != null && jaVar.f25280m != paVar) {
                    jaVar.f25280m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f25194b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f25194b.e(true, true, false);
            i71 i71Var = this.h;
            if (i71Var != null) {
                i71Var.c(this.f25194b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f25194b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f25194b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f25194b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f25194b.e(false, true, false);
            this.f25194b.postRunnable(new xq0(this, 29));
        }
    }

    public void setDelegate(i71 i71Var) {
        this.h = i71Var;
        vz vzVar = this.f25194b;
        if (vzVar != null) {
            if (i71Var == null) {
                vzVar.f(null);
            } else {
                i71Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f25196f = n8Var;
        vz vzVar = this.f25194b;
        if (vzVar != null) {
            vzVar.postRunnable(new uw(6, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f25194b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = vzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
