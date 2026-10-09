package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30390a = 0;
    public final x9 f30391b;
    public final Runnable[] f30392c;
    public final a70 d;
    public final int f30393e;
    public final w7.i0[] f30394f;

    public r9(x9 x9Var, a70 a70Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f30391b = x9Var;
        this.d = a70Var;
        this.f30392c = runnableArr;
        this.f30393e = i10;
        this.f30394f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30390a) {
            case 0:
                x9 x9Var = this.f30391b;
                a70 a70Var = this.d;
                Runnable[] runnableArr = this.f30392c;
                int i10 = this.f30393e;
                w7.i0[] i0VarArr = this.f30394f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32774a;
                    int i11 = a70Var.f24617a;
                    int i12 = a70Var.f24618b;
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
                x9.a(this.f30391b, this.f30392c, null, this.d, this.f30393e, this.f30394f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, a70 a70Var, int i10, w7.i0[] i0VarArr) {
        this.f30391b = x9Var;
        this.f30392c = runnableArr;
        this.d = a70Var;
        this.f30393e = i10;
        this.f30394f = i0VarArr;
    }
}
