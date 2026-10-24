package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n9 implements Runnable {
    public final int f28830a = 0;
    public final t9 f28831b;
    public final Runnable[] f28832c;
    public final s60 d;
    public final int e;
    public final w7.w5[] f28833f;

    public n9(t9 t9Var, s60 s60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.f28831b = t9Var;
        this.d = s60Var;
        this.f28832c = runnableArr;
        this.e = i10;
        this.f28833f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f28830a) {
            case 0:
                t9 t9Var = this.f28831b;
                s60 s60Var = this.d;
                Runnable[] runnableArr = this.f28832c;
                int i10 = this.e;
                w7.w5[] w5VarArr = this.f28833f;
                try {
                    GradientDrawable.Orientation orientation = t9Var.getOrientation();
                    int[] iArr = t9Var.f30758a;
                    int i11 = s60Var.f30454a;
                    int i12 = s60Var.f30455b;
                    Rect e = t9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.wb(t9Var, runnableArr, createBitmap, s60Var, i10, w5VarArr, 9));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new n9(t9Var, runnableArr, s60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                t9.a(this.f28831b, this.f28832c, null, this.d, this.e, this.f28833f);
                return;
        }
    }

    public n9(t9 t9Var, Runnable[] runnableArr, s60 s60Var, int i10, w7.w5[] w5VarArr) {
        this.f28831b = t9Var;
        this.f28832c = runnableArr;
        this.d = s60Var;
        this.e = i10;
        this.f28833f = w5VarArr;
    }
}
