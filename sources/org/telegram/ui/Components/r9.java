package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30092a = 0;
    public final x9 f30093b;
    public final Runnable[] f30094c;
    public final d70 d;
    public final int f30095e;
    public final w7.h0[] f30096f;

    public r9(x9 x9Var, d70 d70Var, Runnable[] runnableArr, int i10, w7.h0[] h0VarArr) {
        this.f30093b = x9Var;
        this.d = d70Var;
        this.f30094c = runnableArr;
        this.f30095e = i10;
        this.f30096f = h0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30092a) {
            case 0:
                x9 x9Var = this.f30093b;
                d70 d70Var = this.d;
                Runnable[] runnableArr = this.f30094c;
                int i10 = this.f30095e;
                w7.h0[] h0VarArr = this.f30096f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32681a;
                    int i11 = d70Var.f25258a;
                    int i12 = d70Var.f25259b;
                    Rect e7 = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.db(x9Var, runnableArr, createBitmap, d70Var, i10, h0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, d70Var, i10, h0VarArr));
                    throw th2;
                }
            default:
                x9.a(this.f30093b, this.f30094c, null, this.d, this.f30095e, this.f30096f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, d70 d70Var, int i10, w7.h0[] h0VarArr) {
        this.f30093b = x9Var;
        this.f30094c = runnableArr;
        this.d = d70Var;
        this.f30095e = i10;
        this.f30096f = h0VarArr;
    }
}
