package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class e9 implements Runnable {
    public final int f33178a = 0;
    public final k9 f33179b;
    public final Runnable[] f33180c;
    public final u40 d;
    public final int f33181e;
    public final c8.ea[] f33182f;

    public e9(k9 k9Var, u40 u40Var, Runnable[] runnableArr, int i7, c8.ea[] eaVarArr) {
        this.f33179b = k9Var;
        this.d = u40Var;
        this.f33180c = runnableArr;
        this.f33181e = i7;
        this.f33182f = eaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f33178a) {
            case 0:
                k9 k9Var = this.f33179b;
                u40 u40Var = this.d;
                Runnable[] runnableArr = this.f33180c;
                int i7 = this.f33181e;
                c8.ea[] eaVarArr = this.f33182f;
                try {
                    GradientDrawable.Orientation orientation = k9Var.getOrientation();
                    int[] iArr = k9Var.f35236a;
                    int i10 = u40Var.f38519a;
                    int i11 = u40Var.f38520b;
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
                k9.a(this.f33179b, this.f33180c, null, this.d, this.f33181e, this.f33182f);
                return;
        }
    }

    public e9(k9 k9Var, Runnable[] runnableArr, u40 u40Var, int i7, c8.ea[] eaVarArr) {
        this.f33179b = k9Var;
        this.f33180c = runnableArr;
        this.d = u40Var;
        this.f33181e = i7;
        this.f33182f = eaVarArr;
    }
}
