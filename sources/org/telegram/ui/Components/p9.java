package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f27248a = 0;
    public final v9 f27249b;
    public final Runnable[] f27250c;
    public final k60 d;
    public final int e;
    public final w7.j0[] f27251f;

    public p9(v9 v9Var, k60 k60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27249b = v9Var;
        this.d = k60Var;
        this.f27250c = runnableArr;
        this.e = i10;
        this.f27251f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27248a) {
            case 0:
                v9 v9Var = this.f27249b;
                k60 k60Var = this.d;
                Runnable[] runnableArr = this.f27250c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27251f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f29045a;
                    int i11 = k60Var.f25640a;
                    int i12 = k60Var.f25641b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, k60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, k60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f27249b, this.f27250c, null, this.d, this.e, this.f27251f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, k60 k60Var, int i10, w7.j0[] j0VarArr) {
        this.f27249b = v9Var;
        this.f27250c = runnableArr;
        this.d = k60Var;
        this.e = i10;
        this.f27251f = j0VarArr;
    }
}
