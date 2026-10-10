package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.lp0;
public final class j4 implements View.OnLayoutChangeListener {
    public final int f21220a;
    public final Object f21221b;
    public final Object f21222c;
    public final Object d;

    public j4(lp0 lp0Var, lp0 lp0Var2, lp0 lp0Var3) {
        this.f21220a = 1;
        this.f21221b = lp0Var;
        this.f21222c = lp0Var2;
        this.d = lp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f21220a) {
            case 0:
                Rect rect = (Rect) this.f21221b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f21222c;
                rect2.set(i14, i15, i16, i17);
                w4 w4Var = (w4) this.d;
                u4 u4Var = w4Var.f21676b;
                if (u4Var.f() && !rect.equals(rect2)) {
                    w4Var.h = true;
                    if (u4Var.f()) {
                        w4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((lp0) this.f21221b).setProgress(org.telegram.ui.i5.f38571c);
                ((lp0) this.f21222c).setProgress(org.telegram.ui.i5.d);
                ((lp0) this.d).setProgress(org.telegram.ui.i5.f38572e);
                return;
        }
    }

    public j4(w4 w4Var) {
        this.f21220a = 0;
        this.d = w4Var;
        this.f21221b = new Rect();
        this.f21222c = new Rect();
    }
}
