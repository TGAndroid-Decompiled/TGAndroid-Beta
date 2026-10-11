package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30457a = 0;
    public final x9 f30458b;
    public final Runnable[] f30459c;
    public final a70 d;
    public final int f30460e;
    public final w7.i0[] f30461f;

    public r9(x9 x9Var, a70 a70Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f30458b = x9Var;
        this.d = a70Var;
        this.f30459c = runnableArr;
        this.f30460e = i10;
        this.f30461f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30457a) {
            case 0:
                x9 x9Var = this.f30458b;
                a70 a70Var = this.d;
                Runnable[] runnableArr = this.f30459c;
                int i10 = this.f30460e;
                w7.i0[] i0VarArr = this.f30461f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32906a;
                    int i11 = a70Var.f24524a;
                    int i12 = a70Var.f24525b;
                    Rect e7 = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.db(x9Var, runnableArr, createBitmap, a70Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, a70Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                x9.a(this.f30458b, this.f30459c, null, this.d, this.f30460e, this.f30461f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, a70 a70Var, int i10, w7.i0[] i0VarArr) {
        this.f30458b = x9Var;
        this.f30459c = runnableArr;
        this.d = a70Var;
        this.f30460e = i10;
        this.f30461f = i0VarArr;
    }
}
