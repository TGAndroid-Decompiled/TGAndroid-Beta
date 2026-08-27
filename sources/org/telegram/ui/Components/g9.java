package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class g9 implements Runnable {

    public final int f28550a = 0;

    public final m9 f28551b;

    public final Runnable[] f28552c;
    public final m50 d;

    public final int f28553e;

    public final h7.w5[] f28554f;

    public g9(m9 m9Var, m50 m50Var, Runnable[] runnableArr, int i10, h7.w5[] w5VarArr) {
        this.f28551b = m9Var;
        this.d = m50Var;
        this.f28552c = runnableArr;
        this.f28553e = i10;
        this.f28554f = w5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f28550a) {
            case 0:
                m9 m9Var = this.f28551b;
                m50 m50Var = this.d;
                Runnable[] runnableArr = this.f28552c;
                int i10 = this.f28553e;
                h7.w5[] w5VarArr = this.f28554f;
                try {
                    GradientDrawable.Orientation orientation = m9Var.getOrientation();
                    int[] iArr = m9Var.f30623a;
                    int i11 = m50Var.f30565a;
                    int i12 = m50Var.f30566b;
                    Rect rectE = m9.e(orientation, i11, i12);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(bitmapCreateBitmap, iArr, rectE.left, rectE.top, rectE.right, rectE.bottom);
                    AndroidUtilities.runOnUIThread(new gf.k0(m9Var, runnableArr, bitmapCreateBitmap, m50Var, i10, w5VarArr));
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.runOnUIThread(new g9(m9Var, runnableArr, m50Var, i10, w5VarArr));
                    throw th;
                }
            default:
                m9.a(this.f28551b, this.f28552c, null, this.d, this.f28553e, this.f28554f);
                return;
        }
    }

    public g9(m9 m9Var, Runnable[] runnableArr, m50 m50Var, int i10, h7.w5[] w5VarArr) {
        this.f28551b = m9Var;
        this.f28552c = runnableArr;
        this.d = m50Var;
        this.f28553e = i10;
        this.f28554f = w5VarArr;
    }
}
