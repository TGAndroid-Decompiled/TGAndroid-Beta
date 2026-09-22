package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class u61 extends TextureView implements TextureView.SurfaceTextureListener {
    public g71 f28296a;
    public vz f28297b;
    public final hk0 f28298c;
    public int d;
    public int e;
    public ci.n8 f28299f;
    public t61 h;
    public int f28300n;
    public int f28301r;
    public ha f28302s;

    public u61(Context context, g71 g71Var) {
        super(context);
        this.f28298c = new Object();
        this.f28296a = g71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hk0 hk0Var = this.f28298c;
        hk0Var.f24712a = f7;
        hk0Var.f24713b = f10;
        hk0Var.f24714c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        na naVar;
        vz vzVar = this.f28297b;
        if (vzVar == null || (naVar = vzVar.I) == null) {
            return null;
        }
        synchronized (naVar.f26413n) {
            try {
                if (!naVar.f26416q) {
                    return null;
                }
                return naVar.f26415p;
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
        if (this.f28297b == null && surfaceTexture != null && this.f28296a != null) {
            vz vzVar = new vz(surfaceTexture, new lv(this, 28), this.f28299f, this.f28302s, i10, i11);
            this.f28297b = vzVar;
            vzVar.i(this.f28300n, this.f28301r);
            vz vzVar2 = this.f28297b;
            ha haVar = this.f28302s;
            na naVar = vzVar2.I;
            if (naVar != null) {
                ha haVar2 = naVar.f26419t;
                if (haVar2 != null && haVar2.f24654m != null) {
                    haVar2.f24654m = null;
                }
                naVar.f26419t = haVar;
                if (haVar != null && haVar.f24654m != naVar) {
                    haVar.f24654m = naVar;
                    haVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f28297b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f28297b.e(true, true, false);
            t61 t61Var = this.h;
            if (t61Var != null) {
                t61Var.b(this.f28297b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f28297b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f28297b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f28297b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f28297b.e(false, true, false);
            this.f28297b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(t61 t61Var) {
        this.h = t61Var;
        vz vzVar = this.f28297b;
        if (vzVar != null) {
            if (t61Var == null) {
                vzVar.f(null);
            } else {
                t61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f28299f = n8Var;
        vz vzVar = this.f28297b;
        if (vzVar != null) {
            vzVar.postRunnable(new ny(2, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f28297b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            na naVar = vzVar.I;
            if (naVar != null) {
                Matrix matrix2 = naVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                naVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
