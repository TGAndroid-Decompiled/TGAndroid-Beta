package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class i81 extends TextureView implements TextureView.SurfaceTextureListener {
    public t81 f29237a;
    public e00 f29238b;
    public final il0 f29239c;
    public int d;
    public int e;
    public fi.v7 f29240f;
    public h81 h;
    public int f29241n;
    public int f29242r;
    public la f29243s;

    public i81(Context context, t81 t81Var) {
        super(context);
        this.f29239c = new Object();
        this.f29237a = t81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        il0 il0Var = this.f29239c;
        il0Var.f29381a = f7;
        il0Var.f29382b = f10;
        il0Var.f29383c = f11;
        il0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        e00 e00Var = this.f29238b;
        if (e00Var == null || (raVar = e00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f32199n) {
            try {
                if (!raVar.f32202q) {
                    return null;
                }
                return raVar.f32201p;
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
        if (this.f29238b == null && surfaceTexture != null && this.f29237a != null) {
            e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f29240f, this.f29243s, i10, i11);
            this.f29238b = e00Var;
            e00Var.i(this.f29241n, this.f29242r);
            e00 e00Var2 = this.f29238b;
            la laVar = this.f29243s;
            ra raVar = e00Var2.I;
            if (raVar != null) {
                la laVar2 = raVar.f32205t;
                if (laVar2 != null && laVar2.f30210m != null) {
                    laVar2.f30210m = null;
                }
                raVar.f32205t = laVar;
                if (laVar != null && laVar.f30210m != raVar) {
                    laVar.f30210m = raVar;
                    laVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                e00 e00Var3 = this.f29238b;
                e00Var3.getClass();
                e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
            }
            this.f29238b.d(true, true, false);
            h81 h81Var = this.h;
            if (h81Var != null) {
                h81Var.d(this.f29238b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.f29238b;
        if (e00Var != null) {
            e00Var.postRunnable(new b00(e00Var, 0));
            this.f29238b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.f29238b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.f29238b.d(false, true, false);
            this.f29238b.postRunnable(new t51(this, 5));
        }
    }

    public void setDelegate(h81 h81Var) {
        this.h = h81Var;
        e00 e00Var = this.f29238b;
        if (e00Var != null) {
            if (h81Var == null) {
                e00Var.f(null);
            } else {
                h81Var.d(e00Var);
            }
        }
    }

    public void setHDRInfo(fi.v7 v7Var) {
        this.f29240f = v7Var;
        e00 e00Var = this.f29238b;
        if (e00Var != null) {
            e00Var.postRunnable(new so(19, e00Var, v7Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.f29238b;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = e00Var.I;
            if (raVar != null) {
                Matrix matrix2 = raVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix2);
                e00Var.d(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
