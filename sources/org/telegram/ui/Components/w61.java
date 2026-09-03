package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class w61 extends TextureView implements TextureView.SurfaceTextureListener {
    public i71 f30155a;
    public vz f30156b;
    public final rk0 f30157c;
    public int d;
    public int e;
    public ph.s6 f30158f;
    public v61 h;
    public int f30159n;
    public int f30160r;
    public ba f30161s;

    public w61(Context context, i71 i71Var) {
        super(context);
        this.f30157c = new Object();
        this.f30155a = i71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        rk0 rk0Var = this.f30157c;
        rk0Var.f28483a = f10;
        rk0Var.f28484b = f11;
        rk0Var.f28485c = f12;
        rk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        vz vzVar = this.f30156b;
        if (vzVar == null || (haVar = vzVar.F) == null) {
            return null;
        }
        synchronized (haVar.f25362n) {
            try {
                if (!haVar.f25365q) {
                    return null;
                }
                return haVar.f25364p;
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
        if (this.f30156b == null && surfaceTexture != null && this.f30155a != null) {
            vz vzVar = new vz(surfaceTexture, new ev(this, 28), this.f30158f, this.f30161s, i10, i11);
            this.f30156b = vzVar;
            vzVar.i(this.f30159n, this.f30160r);
            vz vzVar2 = this.f30156b;
            ba baVar = this.f30161s;
            ha haVar = vzVar2.F;
            if (haVar != null) {
                ba baVar2 = haVar.f25368t;
                if (baVar2 != null && baVar2.f23602m != null) {
                    baVar2.f23602m = null;
                }
                haVar.f25368t = baVar;
                if (baVar != null && baVar.f23602m != haVar) {
                    baVar.f23602m = haVar;
                    baVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f30156b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f30156b.e(true, true, false);
            v61 v61Var = this.h;
            if (v61Var != null) {
                v61Var.b(this.f30156b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f30156b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f30156b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f30156b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f30156b.e(false, true, false);
            this.f30156b.postRunnable(new nq0(this, 29));
        }
    }

    public void setDelegate(v61 v61Var) {
        this.h = v61Var;
        vz vzVar = this.f30156b;
        if (vzVar != null) {
            if (v61Var == null) {
                vzVar.f(null);
            } else {
                v61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ph.s6 s6Var) {
        this.f30158f = s6Var;
        vz vzVar = this.f30156b;
        if (vzVar != null) {
            vzVar.postRunnable(new em(19, vzVar, s6Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f30156b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = vzVar.F;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
