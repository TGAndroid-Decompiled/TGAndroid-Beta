package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class z71 extends TextureView implements TextureView.SurfaceTextureListener {
    public k81 f33490a;
    public l00 f33491b;
    public final ml0 f33492c;
    public int d;
    public int f33493e;
    public ci.k8 f33494f;
    public y71 h;
    public int f33495n;
    public int f33496r;
    public ma f33497s;

    public z71(Context context, k81 k81Var) {
        super(context);
        this.f33492c = new Object();
        this.f33490a = k81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        ml0 ml0Var = this.f33492c;
        ml0Var.f28854a = f7;
        ml0Var.f28855b = f10;
        ml0Var.f28856c = f11;
        ml0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        sa saVar;
        l00 l00Var = this.f33491b;
        if (l00Var == null || (saVar = l00Var.I) == null) {
            return null;
        }
        synchronized (saVar.f30751n) {
            try {
                if (!saVar.f30754q) {
                    return null;
                }
                return saVar.f30753p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f33493e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f33491b == null && surfaceTexture != null && this.f33490a != null) {
            l00 l00Var = new l00(surfaceTexture, new bw(this, 29), this.f33494f, this.f33497s, i10, i11);
            this.f33491b = l00Var;
            l00Var.i(this.f33495n, this.f33496r);
            l00 l00Var2 = this.f33491b;
            ma maVar = this.f33497s;
            sa saVar = l00Var2.I;
            if (saVar != null) {
                ma maVar2 = saVar.f30757t;
                if (maVar2 != null && maVar2.f28797m != null) {
                    maVar2.f28797m = null;
                }
                saVar.f30757t = maVar;
                if (maVar != null && maVar.f28797m != saVar) {
                    maVar.f28797m = saVar;
                    maVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f33493e) != 0) {
                l00 l00Var3 = this.f33491b;
                l00Var3.getClass();
                l00Var3.postRunnable(new h00(l00Var3, i13, i12, 0));
            }
            this.f33491b.e(true, true, false);
            y71 y71Var = this.h;
            if (y71Var != null) {
                y71Var.b(this.f33491b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l00 l00Var = this.f33491b;
        if (l00Var != null) {
            l00Var.postRunnable(new i00(l00Var, 0));
            this.f33491b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        l00 l00Var = this.f33491b;
        if (l00Var != null) {
            l00Var.postRunnable(new h00(l00Var, i10, i11, 1));
            this.f33491b.e(false, true, false);
            this.f33491b.postRunnable(new or0(this, 29));
        }
    }

    public void setDelegate(y71 y71Var) {
        this.h = y71Var;
        l00 l00Var = this.f33491b;
        if (l00Var != null) {
            if (y71Var == null) {
                l00Var.f(null);
            } else {
                y71Var.b(l00Var);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f33494f = k8Var;
        l00 l00Var = this.f33491b;
        if (l00Var != null) {
            l00Var.postRunnable(new zr(14, l00Var, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        l00 l00Var = this.f33491b;
        if (l00Var != null) {
            int width = getWidth();
            int height = getHeight();
            sa saVar = l00Var.I;
            if (saVar != null) {
                Matrix matrix2 = saVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                saVar.c(matrix2);
                l00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
