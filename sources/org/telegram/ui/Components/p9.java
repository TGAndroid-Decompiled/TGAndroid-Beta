package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f26971a = 0;
    public final v9 f26972b;
    public final Runnable[] f26973c;
    public final z50 d;
    public final int e;
    public final w7.i0[] f26974f;

    public p9(v9 v9Var, z50 z50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f26972b = v9Var;
        this.d = z50Var;
        this.f26973c = runnableArr;
        this.e = i10;
        this.f26974f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26971a) {
            case 0:
                v9 v9Var = this.f26972b;
                z50 z50Var = this.d;
                Runnable[] runnableArr = this.f26973c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f26974f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f28692a;
                    int i11 = z50Var.f30531a;
                    int i12 = z50Var.f30532b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, z50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, z50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f26972b, this.f26973c, null, this.d, this.e, this.f26974f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, z50 z50Var, int i10, w7.i0[] i0VarArr) {
        this.f26972b = v9Var;
        this.f26973c = runnableArr;
        this.d = z50Var;
        this.e = i10;
        this.f26974f = i0VarArr;
    }
}
