package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i9 implements Runnable {
    public final int f25649a = 0;
    public final o9 f25650b;
    public final Runnable[] f25651c;
    public final a60 d;
    public final int e;
    public final k7.y5[] f25652f;

    public i9(o9 o9Var, a60 a60Var, Runnable[] runnableArr, int i10, k7.y5[] y5VarArr) {
        this.f25650b = o9Var;
        this.d = a60Var;
        this.f25651c = runnableArr;
        this.e = i10;
        this.f25652f = y5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25649a) {
            case 0:
                o9 o9Var = this.f25650b;
                a60 a60Var = this.d;
                Runnable[] runnableArr = this.f25651c;
                int i10 = this.e;
                k7.y5[] y5VarArr = this.f25652f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.f27496a;
                    int i11 = a60Var.f23326a;
                    int i12 = a60Var.f23327b;
                    Rect e = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new kf.j0(o9Var, runnableArr, createBitmap, a60Var, i10, y5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, a60Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.f25650b, this.f25651c, null, this.d, this.e, this.f25652f);
                return;
        }
    }

    public i9(o9 o9Var, Runnable[] runnableArr, a60 a60Var, int i10, k7.y5[] y5VarArr) {
        this.f25650b = o9Var;
        this.f25651c = runnableArr;
        this.d = a60Var;
        this.e = i10;
        this.f25652f = y5VarArr;
    }
}
