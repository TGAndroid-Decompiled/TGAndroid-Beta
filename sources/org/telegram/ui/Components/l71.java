package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class l71 extends TextureView implements TextureView.SurfaceTextureListener {
    public v71 f25930a;
    public yz f25931b;
    public final vk0 f25932c;
    public int d;
    public int e;
    public ci.k8 f25933f;
    public k71 h;
    public int f25934n;
    public int f25935r;
    public ka f25936s;

    public l71(Context context, v71 v71Var) {
        super(context);
        this.f25932c = new Object();
        this.f25930a = v71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        vk0 vk0Var = this.f25932c;
        vk0Var.f29132a = f7;
        vk0Var.f29133b = f10;
        vk0Var.f29134c = f11;
        vk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        qa qaVar;
        yz yzVar = this.f25931b;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.f27618n) {
            try {
                if (!qaVar.f27621q) {
                    return null;
                }
                return qaVar.f27620p;
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
        if (this.f25931b == null && surfaceTexture != null && this.f25930a != null) {
            yz yzVar = new yz(surfaceTexture, new ov(this, 28), this.f25933f, this.f25936s, i10, i11);
            this.f25931b = yzVar;
            yzVar.i(this.f25934n, this.f25935r);
            yz yzVar2 = this.f25931b;
            ka kaVar = this.f25936s;
            qa qaVar = yzVar2.I;
            if (qaVar != null) {
                ka kaVar2 = qaVar.f27624t;
                if (kaVar2 != null && kaVar2.f25728m != null) {
                    kaVar2.f25728m = null;
                }
                qaVar.f27624t = kaVar;
                if (kaVar != null && kaVar.f25728m != qaVar) {
                    kaVar.f25728m = qaVar;
                    kaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                yz yzVar3 = this.f25931b;
                yzVar3.getClass();
                yzVar3.postRunnable(new uz(yzVar3, i13, i12, 0));
            }
            this.f25931b.e(true, true, false);
            k71 k71Var = this.h;
            if (k71Var != null) {
                k71Var.c(this.f25931b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yz yzVar = this.f25931b;
        if (yzVar != null) {
            yzVar.postRunnable(new vz(yzVar, 0));
            this.f25931b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yz yzVar = this.f25931b;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            this.f25931b.e(false, true, false);
            this.f25931b.postRunnable(new j71(this, 0));
        }
    }

    public void setDelegate(k71 k71Var) {
        this.h = k71Var;
        yz yzVar = this.f25931b;
        if (yzVar != null) {
            if (k71Var == null) {
                yzVar.f(null);
            } else {
                k71Var.c(yzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f25933f = k8Var;
        yz yzVar = this.f25931b;
        if (yzVar != null) {
            yzVar.postRunnable(new xw(7, yzVar, k8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.f25931b;
        if (yzVar != null) {
            int width = getWidth();
            int height = getHeight();
            qa qaVar = yzVar.I;
            if (qaVar != null) {
                Matrix matrix2 = qaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                qaVar.c(matrix2);
                yzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
