package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class k71 extends TextureView implements TextureView.SurfaceTextureListener {
    public u71 f25645a;
    public xz f25646b;
    public final uk0 f25647c;
    public int d;
    public int e;
    public ci.j8 f25648f;
    public j71 h;
    public int f25649n;
    public int f25650r;
    public ja f25651s;

    public k71(Context context, u71 u71Var) {
        super(context);
        this.f25647c = new Object();
        this.f25645a = u71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f25647c;
        uk0Var.f28894a = f7;
        uk0Var.f28895b = f10;
        uk0Var.f28896c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        xz xzVar = this.f25646b;
        if (xzVar == null || (paVar = xzVar.I) == null) {
            return null;
        }
        synchronized (paVar.f27336n) {
            try {
                if (!paVar.f27339q) {
                    return null;
                }
                return paVar.f27338p;
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
        if (this.f25646b == null && surfaceTexture != null && this.f25645a != null) {
            xz xzVar = new xz(surfaceTexture, new nv(this, 29), this.f25648f, this.f25651s, i10, i11);
            this.f25646b = xzVar;
            xzVar.i(this.f25649n, this.f25650r);
            xz xzVar2 = this.f25646b;
            ja jaVar = this.f25651s;
            pa paVar = xzVar2.I;
            if (paVar != null) {
                ja jaVar2 = paVar.f27342t;
                if (jaVar2 != null && jaVar2.f25435m != null) {
                    jaVar2.f25435m = null;
                }
                paVar.f27342t = jaVar;
                if (jaVar != null && jaVar.f25435m != paVar) {
                    jaVar.f25435m = paVar;
                    jaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                xz xzVar3 = this.f25646b;
                xzVar3.getClass();
                xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
            }
            this.f25646b.e(true, true, false);
            j71 j71Var = this.h;
            if (j71Var != null) {
                j71Var.c(this.f25646b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.f25646b;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            this.f25646b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.f25646b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.f25646b.e(false, true, false);
            this.f25646b.postRunnable(new w61(this, 1));
        }
    }

    public void setDelegate(j71 j71Var) {
        this.h = j71Var;
        xz xzVar = this.f25646b;
        if (xzVar != null) {
            if (j71Var == null) {
                xzVar.f(null);
            } else {
                j71Var.c(xzVar);
            }
        }
    }

    public void setHDRInfo(ci.j8 j8Var) {
        this.f25648f = j8Var;
        xz xzVar = this.f25646b;
        if (xzVar != null) {
            xzVar.postRunnable(new jy(4, xzVar, j8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f25646b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = xzVar.I;
            if (paVar != null) {
                Matrix matrix2 = paVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
