package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f29473a = 0;
    public final v9 f29474b;
    public final Runnable[] f29475c;
    public final u60 d;
    public final int e;
    public final w7.w5[] f29476f;

    public p9(v9 v9Var, u60 u60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.f29474b = v9Var;
        this.d = u60Var;
        this.f29475c = runnableArr;
        this.e = i10;
        this.f29476f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29473a) {
            case 0:
                v9 v9Var = this.f29474b;
                u60 u60Var = this.d;
                Runnable[] runnableArr = this.f29475c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f29476f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f31386a;
                    int i11 = u60Var.f31090a;
                    int i12 = u60Var.f31091b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.wb(v9Var, runnableArr, createBitmap, u60Var, i10, w5VarArr, 9));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, u60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f29474b, this.f29475c, null, this.d, this.e, this.f29476f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, u60 u60Var, int i10, w7.w5[] w5VarArr) {
        this.f29474b = v9Var;
        this.f29475c = runnableArr;
        this.d = u60Var;
        this.e = i10;
        this.f29476f = w5VarArr;
    }
}
