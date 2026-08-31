package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i9 implements Runnable {
    public final int f27701a = 0;
    public final o9 f27702b;
    public final Runnable[] f27703c;
    public final b60 d;
    public final int f27704e;
    public final k7.z5[] f27705f;

    public i9(o9 o9Var, b60 b60Var, Runnable[] runnableArr, int i10, k7.z5[] z5VarArr) {
        this.f27702b = o9Var;
        this.d = b60Var;
        this.f27703c = runnableArr;
        this.f27704e = i10;
        this.f27705f = z5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27701a) {
            case 0:
                o9 o9Var = this.f27702b;
                b60 b60Var = this.d;
                Runnable[] runnableArr = this.f27703c;
                int i10 = this.f27704e;
                k7.z5[] z5VarArr = this.f27705f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.f29714a;
                    int i11 = b60Var.f25503a;
                    int i12 = b60Var.f25504b;
                    Rect e6 = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e6.left, e6.top, e6.right, e6.bottom);
                    AndroidUtilities.runOnUIThread(new lf.j0(o9Var, runnableArr, createBitmap, b60Var, i10, z5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, b60Var, i10, z5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.f27702b, this.f27703c, null, this.d, this.f27704e, this.f27705f);
                return;
        }
    }

    public i9(o9 o9Var, Runnable[] runnableArr, b60 b60Var, int i10, k7.z5[] z5VarArr) {
        this.f27702b = o9Var;
        this.f27703c = runnableArr;
        this.d = b60Var;
        this.f27704e = i10;
        this.f27705f = z5VarArr;
    }
}
