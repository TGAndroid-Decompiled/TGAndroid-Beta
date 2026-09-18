package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n9 implements Runnable {
    public final int f26402a = 0;
    public final t9 f26403b;
    public final Runnable[] f26404c;
    public final y50 d;
    public final int e;
    public final w7.i0[] f26405f;

    public n9(t9 t9Var, y50 y50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f26403b = t9Var;
        this.d = y50Var;
        this.f26404c = runnableArr;
        this.e = i10;
        this.f26405f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26402a) {
            case 0:
                t9 t9Var = this.f26403b;
                y50 y50Var = this.d;
                Runnable[] runnableArr = this.f26404c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f26405f;
                try {
                    GradientDrawable.Orientation orientation = t9Var.getOrientation();
                    int[] iArr = t9Var.f28039a;
                    int i11 = y50Var.f30127a;
                    int i12 = y50Var.f30128b;
                    Rect e = t9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(t9Var, runnableArr, createBitmap, y50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new n9(t9Var, runnableArr, y50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                t9.a(this.f26403b, this.f26404c, null, this.d, this.e, this.f26405f);
                return;
        }
    }

    public n9(t9 t9Var, Runnable[] runnableArr, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        this.f26403b = t9Var;
        this.f26404c = runnableArr;
        this.d = y50Var;
        this.e = i10;
        this.f26405f = i0VarArr;
    }
}
