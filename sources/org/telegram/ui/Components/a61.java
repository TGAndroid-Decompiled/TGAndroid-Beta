package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class a61 extends TextureView implements TextureView.SurfaceTextureListener {

    public m61 f26643a;

    public jz f26644b;

    public final yj0 f26645c;
    public int d;

    public int f26646e;

    public lh.y7 f26647f;
    public z51 h;

    public int f26648n;

    public int f26649r;

    public z9 f26650s;

    public a61(Context context, m61 m61Var) {
        super(context);
        this.f26645c = new yj0();
        this.f26643a = m61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        yj0 yj0Var = this.f26645c;
        yj0Var.f34911a = f10;
        yj0Var.f34912b = f11;
        yj0Var.f34913c = f12;
        yj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        fa faVar;
        jz jzVar = this.f26644b;
        if (jzVar == null || (faVar = jzVar.E) == null) {
            return null;
        }
        synchronized (faVar.f28329n) {
            try {
                if (faVar.f28332q) {
                    return faVar.f28331p;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getVideoHeight() {
        return this.f26646e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f26644b != null || surfaceTexture == null || this.f26643a == null) {
            return;
        }
        jz jzVar = new jz(surfaceTexture, new vu(this, 28), this.f26647f, this.f26650s, i10, i11);
        this.f26644b = jzVar;
        jzVar.i(this.f26648n, this.f26649r);
        jz jzVar2 = this.f26644b;
        z9 z9Var = this.f26650s;
        fa faVar = jzVar2.E;
        if (faVar != null) {
            z9 z9Var2 = faVar.f28335t;
            if (z9Var2 != null && z9Var2.f35212m != null) {
                z9Var2.f35212m = null;
            }
            faVar.f28335t = z9Var;
            if (z9Var != null && z9Var.f35212m != faVar) {
                z9Var.f35212m = faVar;
                z9Var.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.f26646e) != 0) {
            jz jzVar3 = this.f26644b;
            jzVar3.getClass();
            jzVar3.postRunnable(new fz(jzVar3, i13, i12, 0));
        }
        this.f26644b.e(true, true, false);
        z51 z51Var = this.h;
        if (z51Var != null) {
            z51Var.c(this.f26644b);
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jz jzVar = this.f26644b;
        if (jzVar == null) {
            return true;
        }
        jzVar.postRunnable(new gz(jzVar, 0));
        this.f26644b = null;
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jz jzVar = this.f26644b;
        if (jzVar != null) {
            jzVar.postRunnable(new fz(jzVar, i10, i11, 1));
            this.f26644b.e(false, true, false);
            this.f26644b.postRunnable(new up0(this, 29));
        }
    }

    public void setDelegate(z51 z51Var) {
        this.h = z51Var;
        jz jzVar = this.f26644b;
        if (jzVar != null) {
            if (z51Var == null) {
                jzVar.f(null);
            } else {
                z51Var.c(jzVar);
            }
        }
    }

    public void setHDRInfo(lh.y7 y7Var) {
        this.f26647f = y7Var;
        jz jzVar = this.f26644b;
        if (jzVar != null) {
            jzVar.postRunnable(new xq(14, jzVar, y7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        jz jzVar = this.f26644b;
        if (jzVar != null) {
            int width = getWidth();
            int height = getHeight();
            fa faVar = jzVar.E;
            if (faVar == null) {
                return;
            }
            Matrix matrix2 = faVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            faVar.c(matrix2);
            jzVar.e(false, false, false);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
