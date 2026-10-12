package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30093a = 0;
    public final x9 f30094b;
    public final Runnable[] f30095c;
    public final d70 d;
    public final int f30096e;
    public final w7.h0[] f30097f;

    public r9(x9 x9Var, d70 d70Var, Runnable[] runnableArr, int i10, w7.h0[] h0VarArr) {
        this.f30094b = x9Var;
        this.d = d70Var;
        this.f30095c = runnableArr;
        this.f30096e = i10;
        this.f30097f = h0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30093a) {
            case 0:
                x9 x9Var = this.f30094b;
                d70 d70Var = this.d;
                Runnable[] runnableArr = this.f30095c;
                int i10 = this.f30096e;
                w7.h0[] h0VarArr = this.f30097f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32680a;
                    int i11 = d70Var.f25250a;
                    int i12 = d70Var.f25251b;
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
                x9.a(this.f30094b, this.f30095c, null, this.d, this.f30096e, this.f30097f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, d70 d70Var, int i10, w7.h0[] h0VarArr) {
        this.f30094b = x9Var;
        this.f30095c = runnableArr;
        this.d = d70Var;
        this.f30096e = i10;
        this.f30097f = h0VarArr;
    }
}
