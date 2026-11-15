package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class b9 implements Runnable {
    public final int f33227a = 0;
    public final h9 f33228b;
    public final Runnable[] f33229c;
    public final x40 d;
    public final int f33230e;
    public final c8.ga[] f33231f;

    public b9(h9 h9Var, x40 x40Var, Runnable[] runnableArr, int i7, c8.ga[] gaVarArr) {
        this.f33228b = h9Var;
        this.d = x40Var;
        this.f33229c = runnableArr;
        this.f33230e = i7;
        this.f33231f = gaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f33227a) {
            case 0:
                h9 h9Var = this.f33228b;
                x40 x40Var = this.d;
                Runnable[] runnableArr = this.f33229c;
                int i7 = this.f33230e;
                c8.ga[] gaVarArr = this.f33231f;
                try {
                    GradientDrawable.Orientation orientation = h9Var.getOrientation();
                    int[] iArr = h9Var.f35195a;
                    int i10 = x40Var.f41563a;
                    int i11 = x40Var.f41564b;
                    Rect e10 = h9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(h9Var, runnableArr, createBitmap, x40Var, i7, gaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new b9(h9Var, runnableArr, x40Var, i7, gaVarArr));
                    throw th2;
                }
            default:
                h9.a(this.f33228b, this.f33229c, null, this.d, this.f33230e, this.f33231f);
                return;
        }
    }

    public b9(h9 h9Var, Runnable[] runnableArr, x40 x40Var, int i7, c8.ga[] gaVarArr) {
        this.f33228b = h9Var;
        this.f33229c = runnableArr;
        this.d = x40Var;
        this.f33230e = i7;
        this.f33231f = gaVarArr;
    }
}
