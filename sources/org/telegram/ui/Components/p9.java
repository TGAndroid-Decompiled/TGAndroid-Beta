package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f29264a = 0;
    public final v9 f29265b;
    public final Runnable[] f29266c;
    public final t60 d;
    public final int e;
    public final w7.w5[] f29267f;

    public p9(v9 v9Var, t60 t60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.f29265b = v9Var;
        this.d = t60Var;
        this.f29266c = runnableArr;
        this.e = i10;
        this.f29267f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29264a) {
            case 0:
                v9 v9Var = this.f29265b;
                t60 t60Var = this.d;
                Runnable[] runnableArr = this.f29266c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f29267f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f31200a;
                    int i11 = t60Var.f30448a;
                    int i12 = t60Var.f30449b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.vb(v9Var, runnableArr, createBitmap, t60Var, i10, w5VarArr, 9));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, t60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f29265b, this.f29266c, null, this.d, this.e, this.f29267f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, t60 t60Var, int i10, w7.w5[] w5VarArr) {
        this.f29265b = v9Var;
        this.f29266c = runnableArr;
        this.d = t60Var;
        this.e = i10;
        this.f29267f = w5VarArr;
    }
}
