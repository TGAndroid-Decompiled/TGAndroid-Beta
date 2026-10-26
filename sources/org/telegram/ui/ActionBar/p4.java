package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.lp0;
public final class p4 implements View.OnLayoutChangeListener {
    public final int f22953a;
    public final Object f22954b;
    public final Object f22955c;
    public final Object d;

    public p4(lp0 lp0Var, lp0 lp0Var2, lp0 lp0Var3) {
        this.f22953a = 1;
        this.f22954b = lp0Var;
        this.f22955c = lp0Var2;
        this.d = lp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f22953a) {
            case 0:
                Rect rect = (Rect) this.f22954b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f22955c;
                rect2.set(i14, i15, i16, i17);
                c5 c5Var = (c5) this.d;
                a5 a5Var = c5Var.f22506b;
                if (a5Var.f() && !rect.equals(rect2)) {
                    c5Var.h = true;
                    if (a5Var.f()) {
                        c5Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((lp0) this.f22954b).setProgress(org.telegram.ui.l5.f41139c);
                ((lp0) this.f22955c).setProgress(org.telegram.ui.l5.d);
                ((lp0) this.d).setProgress(org.telegram.ui.l5.e);
                return;
        }
    }

    public p4(c5 c5Var) {
        this.f22953a = 0;
        this.d = c5Var;
        this.f22954b = new Rect();
        this.f22955c = new Rect();
    }
}
