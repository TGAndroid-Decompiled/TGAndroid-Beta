package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f27288a = 0;
    public final v9 f27289b;
    public final Runnable[] f27290c;
    public final j60 d;
    public final int e;
    public final w7.j0[] f27291f;

    public p9(v9 v9Var, j60 j60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27289b = v9Var;
        this.d = j60Var;
        this.f27290c = runnableArr;
        this.e = i10;
        this.f27291f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27288a) {
            case 0:
                v9 v9Var = this.f27289b;
                j60 j60Var = this.d;
                Runnable[] runnableArr = this.f27290c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27291f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f29107a;
                    int i11 = j60Var.f25286a;
                    int i12 = j60Var.f25287b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, j60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, j60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f27289b, this.f27290c, null, this.d, this.e, this.f27291f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, j60 j60Var, int i10, w7.j0[] j0VarArr) {
        this.f27289b = v9Var;
        this.f27290c = runnableArr;
        this.d = j60Var;
        this.e = i10;
        this.f27291f = j0VarArr;
    }
}
