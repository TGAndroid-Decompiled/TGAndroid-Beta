package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f27135a = 0;
    public final v9 f27136b;
    public final Runnable[] f27137c;
    public final h60 d;
    public final int e;
    public final w7.j0[] f27138f;

    public p9(v9 v9Var, h60 h60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27136b = v9Var;
        this.d = h60Var;
        this.f27137c = runnableArr;
        this.e = i10;
        this.f27138f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27135a) {
            case 0:
                v9 v9Var = this.f27136b;
                h60 h60Var = this.d;
                Runnable[] runnableArr = this.f27137c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27138f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f28963a;
                    int i11 = h60Var.f24565a;
                    int i12 = h60Var.f24566b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, h60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, h60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f27136b, this.f27137c, null, this.d, this.e, this.f27138f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, h60 h60Var, int i10, w7.j0[] j0VarArr) {
        this.f27136b = v9Var;
        this.f27137c = runnableArr;
        this.d = h60Var;
        this.e = i10;
        this.f27138f = j0VarArr;
    }
}
