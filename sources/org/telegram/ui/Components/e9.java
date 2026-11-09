package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class e9 implements Runnable {
    public final int f33340a = 0;
    public final k9 f33341b;
    public final Runnable[] f33342c;
    public final v40 d;
    public final int f33343e;
    public final c8.ea[] f33344f;

    public e9(k9 k9Var, v40 v40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.f33341b = k9Var;
        this.d = v40Var;
        this.f33342c = runnableArr;
        this.f33343e = i7;
        this.f33344f = eaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f33340a) {
            case 0:
                k9 k9Var = this.f33341b;
                v40 v40Var = this.d;
                Runnable[] runnableArr = this.f33342c;
                int i7 = this.f33343e;
                c8.ea[] eaVarArr = this.f33344f;
                try {
                    GradientDrawable.Orientation orientation = k9Var.getOrientation();
                    int[] iArr = k9Var.f35277a;
                    int i10 = v40Var.f38914a;
                    int i11 = v40Var.f38915b;
                    Rect e10 = k9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(k9Var, runnableArr, createBitmap, v40Var, i7, eaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new e9(k9Var, runnableArr, v40Var, i7, eaVarArr));
                    throw th2;
                }
            default:
                k9.a(this.f33341b, this.f33342c, null, this.d, this.f33343e, this.f33344f);
                return;
        }
    }

    public e9(k9 k9Var, Runnable[] runnableArr, v40 v40Var, int i7, c8.ea[] eaVarArr) {
        this.f33341b = k9Var;
        this.f33342c = runnableArr;
        this.d = v40Var;
        this.f33343e = i7;
        this.f33344f = eaVarArr;
    }
}
