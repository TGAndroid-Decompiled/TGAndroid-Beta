package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class x61 extends TextureView implements TextureView.SurfaceTextureListener {
    public j71 f32957a;
    public xz f32958b;
    public final sk0 f32959c;
    public int d;
    public int f32960e;
    public qh.q6 f32961f;
    public w61 h;
    public int f32962n;
    public int f32963r;
    public ba f32964s;

    public x61(Context context, j71 j71Var) {
        super(context);
        this.f32959c = new Object();
        this.f32957a = j71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        sk0 sk0Var = this.f32959c;
        sk0Var.f31078a = f10;
        sk0Var.f31079b = f11;
        sk0Var.f31080c = f12;
        sk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        xz xzVar = this.f32958b;
        if (xzVar == null || (haVar = xzVar.F) == null) {
            return null;
        }
        synchronized (haVar.f27455n) {
            try {
                if (!haVar.f27458q) {
                    return null;
                }
                return haVar.f27457p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.f32960e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.f32958b == null && surfaceTexture != null && this.f32957a != null) {
            xz xzVar = new xz(surfaceTexture, new hv(this, 28), this.f32961f, this.f32964s, i10, i11);
            this.f32958b = xzVar;
            xzVar.i(this.f32962n, this.f32963r);
            xz xzVar2 = this.f32958b;
            ba baVar = this.f32964s;
            ha haVar = xzVar2.F;
            if (haVar != null) {
                ba baVar2 = haVar.f27461t;
                if (baVar2 != null && baVar2.f25561m != null) {
                    baVar2.f25561m = null;
                }
                haVar.f27461t = baVar;
                if (baVar != null && baVar.f25561m != haVar) {
                    baVar.f25561m = haVar;
                    baVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.f32960e) != 0) {
                xz xzVar3 = this.f32958b;
                xzVar3.getClass();
                xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
            }
            this.f32958b.e(true, true, false);
            w61 w61Var = this.h;
            if (w61Var != null) {
                w61Var.b(this.f32958b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.f32958b;
        if (xzVar != null) {
            xzVar.postRunnable(new uz(xzVar, 0));
            this.f32958b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.f32958b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.f32958b.e(false, true, false);
            this.f32958b.postRunnable(new nq0(this, 29));
        }
    }

    public void setDelegate(w61 w61Var) {
        this.h = w61Var;
        xz xzVar = this.f32958b;
        if (xzVar != null) {
            if (w61Var == null) {
                xzVar.f(null);
            } else {
                w61Var.b(xzVar);
            }
        }
    }

    public void setHDRInfo(qh.q6 q6Var) {
        this.f32961f = q6Var;
        xz xzVar = this.f32958b;
        if (xzVar != null) {
            xzVar.postRunnable(new eo(18, xzVar, q6Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.f32958b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
            if (haVar != null) {
                Matrix matrix2 = haVar.v;
                matrix.invert(matrix2);
                float f10 = width;
                float f11 = height;
                matrix2.preScale(f10, f11);
                matrix2.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix2);
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
