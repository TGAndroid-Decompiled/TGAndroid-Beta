package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.mp0;
public final class p4 implements View.OnLayoutChangeListener {
    public final int f22954a;
    public final Object f22955b;
    public final Object f22956c;
    public final Object d;

    public p4(mp0 mp0Var, mp0 mp0Var2, mp0 mp0Var3) {
        this.f22954a = 1;
        this.f22955b = mp0Var;
        this.f22956c = mp0Var2;
        this.d = mp0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f22954a) {
            case 0:
                Rect rect = (Rect) this.f22955b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.f22956c;
                rect2.set(i14, i15, i16, i17);
                c5 c5Var = (c5) this.d;
                a5 a5Var = c5Var.f22507b;
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
                ((mp0) this.f22955b).setProgress(org.telegram.ui.l5.f40977c);
                ((mp0) this.f22956c).setProgress(org.telegram.ui.l5.d);
                ((mp0) this.d).setProgress(org.telegram.ui.l5.e);
                return;
        }
    }

    public p4(c5 c5Var) {
        this.f22954a = 0;
        this.d = c5Var;
        this.f22955b = new Rect();
        this.f22956c = new Rect();
    }
}
