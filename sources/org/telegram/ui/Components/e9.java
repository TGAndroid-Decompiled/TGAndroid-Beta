package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class e9 implements Runnable {
    public final int f33193a = 0;
    public final k9 f33194b;
    public final Runnable[] f33195c;
    public final u40 d;
    public final int f33196e;
    public final c8.ea[] f33197f;

    public e9(k9 k9Var, u40 u40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.f33194b = k9Var;
        this.d = u40Var;
        this.f33195c = runnableArr;
        this.f33196e = i7;
        this.f33197f = eaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f33193a) {
            case 0:
                k9 k9Var = this.f33194b;
                u40 u40Var = this.d;
                Runnable[] runnableArr = this.f33195c;
                int i7 = this.f33196e;
                c8.ea[] eaVarArr = this.f33197f;
                try {
                    GradientDrawable.Orientation orientation = k9Var.getOrientation();
                    int[] iArr = k9Var.f35230a;
                    int i10 = u40Var.f38497a;
                    int i11 = u40Var.f38498b;
                    Rect e10 = k9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new bg.l0(k9Var, runnableArr, createBitmap, u40Var, i7, eaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new e9(k9Var, runnableArr, u40Var, i7, eaVarArr));
                    throw th2;
                }
            default:
                k9.a(this.f33194b, this.f33195c, null, this.d, this.f33196e, this.f33197f);
                return;
        }
    }

    public e9(k9 k9Var, Runnable[] runnableArr, u40 u40Var, int i7, c8.ea[] eaVarArr) {
        this.f33194b = k9Var;
        this.f33195c = runnableArr;
        this.d = u40Var;
        this.f33196e = i7;
        this.f33197f = eaVarArr;
    }
}
