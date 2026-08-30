package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class w61 extends TextureView implements TextureView.SurfaceTextureListener {
    public i71 f30248a;
    public vz f30249b;
    public final sk0 f30250c;
    public int d;
    public int e;
    public ph.t6 f30251f;
    public v61 h;
    public int f30252n;
    public int f30253r;
    public ba f30254s;

    public w61(Context context, i71 i71Var) {
        super(context);
        this.f30250c = new Object();
        this.f30248a = i71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        sk0 sk0Var = this.f30250c;
        sk0Var.f28722a = f10;
        sk0Var.f28723b = f11;
        sk0Var.f28724c = f12;
        sk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        vz vzVar = this.f30249b;
        if (vzVar == null || (haVar = vzVar.F) == null) {
            return null;
        }
        synchronized (haVar.f25377n) {
            try {
                if (!haVar.f25380q) {
                    return null;
                }
                return haVar.f25379p;
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
        if (this.f30249b == null && surfaceTexture != null && this.f30248a != null) {
            vz vzVar = new vz(surfaceTexture, new fv(this, 28), this.f30251f, this.f30254s, i10, i11);
            this.f30249b = vzVar;
            vzVar.i(this.f30252n, this.f30253r);
            vz vzVar2 = this.f30249b;
            ba baVar = this.f30254s;
            ha haVar = vzVar2.F;
            if (haVar != null) {
                ba baVar2 = haVar.f25383t;
                if (baVar2 != null && baVar2.f23616m != null) {
                    baVar2.f23616m = null;
                }
                haVar.f25383t = baVar;
                if (baVar != null && baVar.f23616m != haVar) {
                    baVar.f23616m = haVar;
                    baVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f30249b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f30249b.e(true, true, false);
            v61 v61Var = this.h;
            if (v61Var != null) {
                v61Var.b(this.f30249b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f30249b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f30249b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f30249b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f30249b.e(false, true, false);
            this.f30249b.postRunnable(new nq0(this, 29));
        }
    }

    public void setDelegate(v61 v61Var) {
        this.h = v61Var;
        vz vzVar = this.f30249b;
        if (vzVar != null) {
            if (v61Var == null) {
                vzVar.f(null);
            } else {
                v61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ph.t6 t6Var) {
        this.f30251f = t6Var;
        vz vzVar = this.f30249b;
        if (vzVar != null) {
            vzVar.postRunnable(new il(20, vzVar, t6Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f30249b;
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
