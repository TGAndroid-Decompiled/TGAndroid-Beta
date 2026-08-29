package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m9 implements Runnable {
    public final int f30601a = 0;
    public final s9 f30602b;
    public final Runnable[] f30603c;
    public final u50 d;
    public final int f30604e;
    public final i7.c6[] f30605f;

    public m9(s9 s9Var, u50 u50Var, Runnable[] runnableArr, int i10, i7.c6[] c6VarArr) {
        this.f30602b = s9Var;
        this.d = u50Var;
        this.f30603c = runnableArr;
        this.f30604e = i10;
        this.f30605f = c6VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30601a) {
            case 0:
                s9 s9Var = this.f30602b;
                u50 u50Var = this.d;
                Runnable[] runnableArr = this.f30603c;
                int i10 = this.f30604e;
                i7.c6[] c6VarArr = this.f30605f;
                try {
                    GradientDrawable.Orientation orientation = s9Var.getOrientation();
                    int[] iArr = s9Var.f32587a;
                    int i11 = u50Var.f33142a;
                    int i12 = u50Var.f33143b;
                    Rect e10 = s9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    AndroidUtilities.runOnUIThread(new jf.j0(s9Var, runnableArr, createBitmap, u50Var, i10, c6VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new m9(s9Var, runnableArr, u50Var, i10, c6VarArr));
                    throw th2;
                }
            default:
                s9.a(this.f30602b, this.f30603c, null, this.d, this.f30604e, this.f30605f);
                return;
        }
    }

    public m9(s9 s9Var, Runnable[] runnableArr, u50 u50Var, int i10, i7.c6[] c6VarArr) {
        this.f30602b = s9Var;
        this.f30603c = runnableArr;
        this.d = u50Var;
        this.f30604e = i10;
        this.f30605f = c6VarArr;
    }
}
