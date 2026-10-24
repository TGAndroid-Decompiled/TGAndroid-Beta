package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class y71 extends TextureView implements TextureView.SurfaceTextureListener {
    public j81 f32833a;
    public c00 f32834b;
    public final hl0 f32835c;
    public int d;
    public int e;
    public ei.z7 f32836f;
    public x71 h;
    public int f32837n;
    public int f32838r;
    public ha f32839s;

    public y71(Context context, j81 j81Var) {
        super(context);
        this.f32835c = new Object();
        this.f32833a = j81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hl0 hl0Var = this.f32835c;
        hl0Var.f27075a = f7;
        hl0Var.f27076b = f10;
        hl0Var.f27077c = f11;
        hl0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        na naVar;
        c00 c00Var = this.f32834b;
        if (c00Var == null || (naVar = c00Var.I) == null) {
            return null;
        }
        synchronized (naVar.f28844n) {
            try {
                if (!naVar.f28847q) {
                    return null;
                }
                return naVar.f28846p;
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
        if (this.f32834b == null && surfaceTexture != null && this.f32833a != null) {
            c00 c00Var = new c00(surfaceTexture, new rv(this, 29), this.f32836f, this.f32839s, i10, i11);
            this.f32834b = c00Var;
            c00Var.i(this.f32837n, this.f32838r);
            c00 c00Var2 = this.f32834b;
            ha haVar = this.f32839s;
            na naVar = c00Var2.I;
            if (naVar != null) {
                ha haVar2 = naVar.f28850t;
                if (haVar2 != null && haVar2.f26983m != null) {
                    haVar2.f26983m = null;
                }
                naVar.f28850t = haVar;
                if (haVar != null && haVar.f26983m != naVar) {
                    haVar.f26983m = naVar;
                    haVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                c00 c00Var3 = this.f32834b;
                c00Var3.getClass();
                c00Var3.postRunnable(new yz(c00Var3, i13, i12, 0));
            }
            this.f32834b.d(true, true, false);
            x71 x71Var = this.h;
            if (x71Var != null) {
                x71Var.b(this.f32834b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c00 c00Var = this.f32834b;
        if (c00Var != null) {
            c00Var.postRunnable(new zz(c00Var, 0));
            this.f32834b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c00 c00Var = this.f32834b;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            this.f32834b.d(false, true, false);
            this.f32834b.postRunnable(new w71(this, 0));
        }
    }

    public void setDelegate(x71 x71Var) {
        this.h = x71Var;
        c00 c00Var = this.f32834b;
        if (c00Var != null) {
            if (x71Var == null) {
                c00Var.f(null);
            } else {
                x71Var.b(c00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f32836f = z7Var;
        c00 c00Var = this.f32834b;
        if (c00Var != null) {
            c00Var.postRunnable(new wt(9, c00Var, z7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.f32834b;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            na naVar = c00Var.I;
            if (naVar != null) {
                Matrix matrix2 = naVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                naVar.c(matrix2);
                c00Var.d(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
