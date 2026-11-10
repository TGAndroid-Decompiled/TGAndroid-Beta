package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class d9 implements Runnable {
    public final int f32925a = 0;
    public final j9 f32926b;
    public final Runnable[] f32927c;
    public final u40 d;
    public final int f32928e;
    public final c8.ea[] f32929f;

    public d9(j9 j9Var, u40 u40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.f32926b = j9Var;
        this.d = u40Var;
        this.f32927c = runnableArr;
        this.f32928e = i7;
        this.f32929f = eaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f32925a) {
            case 0:
                j9 j9Var = this.f32926b;
                u40 u40Var = this.d;
                Runnable[] runnableArr = this.f32927c;
                int i7 = this.f32928e;
                c8.ea[] eaVarArr = this.f32929f;
                try {
                    GradientDrawable.Orientation orientation = j9Var.getOrientation();
                    int[] iArr = j9Var.f34868a;
                    int i10 = u40Var.f38508a;
                    int i11 = u40Var.f38509b;
                    Rect e10 = j9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(j9Var, runnableArr, createBitmap, u40Var, i7, eaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new d9(j9Var, runnableArr, u40Var, i7, eaVarArr));
                    throw th2;
                }
            default:
                j9.a(this.f32926b, this.f32927c, null, this.d, this.f32928e, this.f32929f);
                return;
        }
    }

    public d9(j9 j9Var, Runnable[] runnableArr, u40 u40Var, int i7, c8.ea[] eaVarArr) {
        this.f32926b = j9Var;
        this.f32927c = runnableArr;
        this.d = u40Var;
        this.f32928e = i7;
        this.f32929f = eaVarArr;
    }
}
