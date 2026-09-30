package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class p9 implements Runnable {
    public final int f27293a = 0;
    public final v9 f27294b;
    public final Runnable[] f27295c;
    public final m60 d;
    public final int e;
    public final w7.j0[] f27296f;

    public p9(v9 v9Var, m60 m60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27294b = v9Var;
        this.d = m60Var;
        this.f27295c = runnableArr;
        this.e = i10;
        this.f27296f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27293a) {
            case 0:
                v9 v9Var = this.f27294b;
                m60 m60Var = this.d;
                Runnable[] runnableArr = this.f27295c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27296f;
                try {
                    GradientDrawable.Orientation orientation = v9Var.getOrientation();
                    int[] iArr = v9Var.f29089a;
                    int i11 = m60Var.f26219a;
                    int i12 = m60Var.f26220b;
                    Rect e = v9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(v9Var, runnableArr, createBitmap, m60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new p9(v9Var, runnableArr, m60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                v9.a(this.f27294b, this.f27295c, null, this.d, this.e, this.f27296f);
                return;
        }
    }

    public p9(v9 v9Var, Runnable[] runnableArr, m60 m60Var, int i10, w7.j0[] j0VarArr) {
        this.f27294b = v9Var;
        this.f27295c = runnableArr;
        this.d = m60Var;
        this.e = i10;
        this.f27296f = j0VarArr;
    }
}
