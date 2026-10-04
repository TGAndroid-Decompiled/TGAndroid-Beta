package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f29570a = 0;
    public final v9 f29571b;
    public final Runnable[] f29572c;
    public final m60 d;
    public final int f29573e;
    public final w7.w5[] f29574f;

    public p9(v9 v9Var, m60 m60Var, Runnable[] runnableArr, int i10, w7.w5[] w5VarArr) {
        this.f29571b = v9Var;
        this.d = m60Var;
        this.f29572c = runnableArr;
        this.f29573e = i10;
        this.f29574f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29570a) {
            case 0:
                v9 v9Var = this.f29571b;
                m60 m60Var = this.d;
                Runnable[] runnableArr = this.f29572c;
                int i10 = this.f29573e;
                w7.w5[] w5VarArr = this.f29574f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f31602a;
                    int i11 = m60Var.f28534a;
                    int i12 = m60Var.f28535b;
                    Rect e7 = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, m60Var, i10, w5VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, m60Var, i10, w5VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f29571b, this.f29572c, null, this.d, this.f29573e, this.f29574f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, m60 m60Var, int i10, w7.w5[] w5VarArr) {
        this.f29571b = v9Var;
        this.f29572c = runnableArr;
        this.d = m60Var;
        this.f29573e = i10;
        this.f29574f = w5VarArr;
    }
}
