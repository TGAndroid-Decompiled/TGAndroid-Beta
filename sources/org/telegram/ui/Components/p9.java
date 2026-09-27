package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f27309a = 0;
    public final v9 f27310b;
    public final Runnable[] f27311c;
    public final l60 d;
    public final int e;
    public final w7.j0[] f27312f;

    public p9(v9 v9Var, l60 l60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27310b = v9Var;
        this.d = l60Var;
        this.f27311c = runnableArr;
        this.e = i10;
        this.f27312f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27309a) {
            case 0:
                v9 v9Var = this.f27310b;
                l60 l60Var = this.d;
                Runnable[] runnableArr = this.f27311c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27312f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f29080a;
                    int i11 = l60Var.f25955a;
                    int i12 = l60Var.f25956b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, l60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, l60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f27310b, this.f27311c, null, this.d, this.e, this.f27312f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, l60 l60Var, int i10, w7.j0[] j0VarArr) {
        this.f27310b = v9Var;
        this.f27311c = runnableArr;
        this.d = l60Var;
        this.e = i10;
        this.f27312f = j0VarArr;
    }
}
