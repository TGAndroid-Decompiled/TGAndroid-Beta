package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f26058a = 0;
    public final v9 f26059b;
    public final Runnable[] f26060c;
    public final h60 d;
    public final int e;
    public final w7.x5[] f26061f;

    public p9(v9 v9Var, h60 h60Var, Runnable[] runnableArr, int i10, w7.x5[] x5VarArr) {
        this.f26059b = v9Var;
        this.d = h60Var;
        this.f26060c = runnableArr;
        this.e = i10;
        this.f26061f = x5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26058a) {
            case 0:
                v9 v9Var = this.f26059b;
                h60 h60Var = this.d;
                Runnable[] runnableArr = this.f26060c;
                int i10 = this.e;
                w7.x5[] x5VarArr = this.f26061f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f27895a;
                    int i11 = h60Var.f23527a;
                    int i12 = h60Var.f23528b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0(v9Var, runnableArr, createBitmap, h60Var, i10, x5VarArr, 6));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, h60Var, i10, x5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f26059b, this.f26060c, null, this.d, this.e, this.f26061f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, h60 h60Var, int i10, w7.x5[] x5VarArr) {
        this.f26059b = v9Var;
        this.f26060c = runnableArr;
        this.d = h60Var;
        this.e = i10;
        this.f26061f = x5VarArr;
    }
}
