package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f29210a = 0;
    public final v9 f29211b;
    public final Runnable[] f29212c;
    public final t60 d;
    public final int e;
    public final w7.w5[] f29213f;

    public p9(v9 v9Var, t60 t60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.f29211b = v9Var;
        this.d = t60Var;
        this.f29212c = runnableArr;
        this.e = i10;
        this.f29213f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29210a) {
            case 0:
                v9 v9Var = this.f29211b;
                t60 t60Var = this.d;
                Runnable[] runnableArr = this.f29212c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f29213f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f31202a;
                    int i11 = t60Var.f30434a;
                    int i12 = t60Var.f30435b;
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
                v9.a(this.f29211b, this.f29212c, null, this.d, this.e, this.f29213f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, t60 t60Var, int i10, w7.w5[] w5VarArr) {
        this.f29211b = v9Var;
        this.f29212c = runnableArr;
        this.d = t60Var;
        this.e = i10;
        this.f29213f = w5VarArr;
    }
}
