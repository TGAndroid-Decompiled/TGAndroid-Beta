package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class v61 extends TextureView implements TextureView.SurfaceTextureListener {
    public h71 f28639a;
    public vz f28640b;
    public final ik0 f28641c;
    public int d;
    public int e;
    public ci.n8 f28642f;
    public u61 h;
    public int f28643n;
    public int f28644r;
    public ha f28645s;

    public v61(Context context, h71 h71Var) {
        super(context);
        this.f28641c = new Object();
        this.f28639a = h71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        ik0 ik0Var = this.f28641c;
        ik0Var.f24953a = f7;
        ik0Var.f24954b = f10;
        ik0Var.f24955c = f11;
        ik0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        na naVar;
        vz vzVar = this.f28640b;
        if (vzVar == null || (naVar = vzVar.I) == null) {
            return null;
        }
        synchronized (naVar.f26419n) {
            try {
                if (!naVar.f26422q) {
                    return null;
                }
                return naVar.f26421p;
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
        if (this.f28640b == null && surfaceTexture != null && this.f28639a != null) {
            vz vzVar = new vz(surfaceTexture, new lv(this, 28), this.f28642f, this.f28645s, i10, i11);
            this.f28640b = vzVar;
            vzVar.i(this.f28643n, this.f28644r);
            vz vzVar2 = this.f28640b;
            ha haVar = this.f28645s;
            na naVar = vzVar2.I;
            if (naVar != null) {
                ha haVar2 = naVar.f26425t;
                if (haVar2 != null && haVar2.f24618m != null) {
                    haVar2.f24618m = null;
                }
                naVar.f26425t = haVar;
                if (haVar != null && haVar.f24618m != naVar) {
                    haVar.f24618m = naVar;
                    haVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f28640b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f28640b.e(true, true, false);
            u61 u61Var = this.h;
            if (u61Var != null) {
                u61Var.b(this.f28640b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f28640b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f28640b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f28640b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f28640b.e(false, true, false);
            this.f28640b.postRunnable(new kq0(this, 29));
        }
    }

    public void setDelegate(u61 u61Var) {
        this.h = u61Var;
        vz vzVar = this.f28640b;
        if (vzVar != null) {
            if (u61Var == null) {
                vzVar.f(null);
            } else {
                u61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f28642f = n8Var;
        vz vzVar = this.f28640b;
        if (vzVar != null) {
            vzVar.postRunnable(new ny(2, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f28640b;
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
