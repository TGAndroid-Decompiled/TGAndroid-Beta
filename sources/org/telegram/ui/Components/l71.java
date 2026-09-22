package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
public final class l71 extends TextureView implements TextureView.SurfaceTextureListener {
    public v71 f26010a;
    public vz f26011b;
    public final uk0 f26012c;
    public int d;
    public int e;
    public ci.n8 f26013f;
    public k71 h;
    public int f26014n;
    public int f26015r;
    public ia f26016s;

    public l71(Context context, v71 v71Var) {
        super(context);
        this.f26012c = new Object();
        this.f26010a = v71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.f26012c;
        uk0Var.f28794a = f7;
        uk0Var.f28795b = f10;
        uk0Var.f28796c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        vz vzVar = this.f26011b;
        if (vzVar == null || (oaVar = vzVar.I) == null) {
            return null;
        }
        synchronized (oaVar.f27042n) {
            try {
                if (!oaVar.f27045q) {
                    return null;
                }
                return oaVar.f27044p;
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
        if (this.f26011b == null && surfaceTexture != null && this.f26010a != null) {
            vz vzVar = new vz(surfaceTexture, new mv(this, 29), this.f26013f, this.f26016s, i10, i11);
            this.f26011b = vzVar;
            vzVar.i(this.f26014n, this.f26015r);
            vz vzVar2 = this.f26011b;
            ia iaVar = this.f26016s;
            oa oaVar = vzVar2.I;
            if (oaVar != null) {
                ia iaVar2 = oaVar.f27048t;
                if (iaVar2 != null && iaVar2.f25068m != null) {
                    iaVar2.f25068m = null;
                }
                oaVar.f27048t = iaVar;
                if (iaVar != null && iaVar.f25068m != oaVar) {
                    iaVar.f25068m = oaVar;
                    iaVar.d();
                }
            }
            int i13 = this.d;
            if (i13 != 0 && (i12 = this.e) != 0) {
                vz vzVar3 = this.f26011b;
                vzVar3.getClass();
                vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
            }
            this.f26011b.e(true, true, false);
            k71 k71Var = this.h;
            if (k71Var != null) {
                k71Var.b(this.f26011b);
            }
        }
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.f26011b;
        if (vzVar != null) {
            vzVar.postRunnable(new sz(vzVar, 0));
            this.f26011b = null;
            return true;
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.f26011b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.f26011b.e(false, true, false);
            this.f26011b.postRunnable(new j71(this, 0));
        }
    }

    public void setDelegate(k71 k71Var) {
        this.h = k71Var;
        vz vzVar = this.f26011b;
        if (vzVar != null) {
            if (k71Var == null) {
                vzVar.f(null);
            } else {
                k71Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f26013f = n8Var;
        vz vzVar = this.f26011b;
        if (vzVar != null) {
            vzVar.postRunnable(new bv(8, vzVar, n8Var));
        }
    }

    @Override
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.f26011b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = vzVar.I;
            if (oaVar != null) {
                Matrix matrix2 = oaVar.v;
                matrix.invert(matrix2);
                float f7 = width;
                float f10 = height;
                matrix2.preScale(f7, f10);
                matrix2.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix2);
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
