package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.bn0;
public final class z3 implements View.OnLayoutChangeListener {
    public final int f30319a;
    public final Object f30320b;
    public final Object f30321c;
    public final Object d;

    public z3(bn0 bn0Var, bn0 bn0Var2, bn0 bn0Var3) {
        this.f30319a = 1;
        this.f30320b = bn0Var;
        this.f30321c = bn0Var2;
        this.d = bn0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f30319a) {
            case 0:
                Rect rect = (Rect) this.f30320b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f30321c;
                rect2.set(i13, i14, i15, i16);
                l4 l4Var = (l4) this.d;
                j4 j4Var = l4Var.f29220b;
                if (j4Var.f() && !rect.equals(rect2)) {
                    l4Var.h = true;
                    if (j4Var.f()) {
                        l4Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((bn0) this.f30320b).setProgress(org.telegram.ui.h5.n1);
                ((bn0) this.f30321c).setProgress(org.telegram.ui.h5.f48231o1);
                ((bn0) this.d).setProgress(org.telegram.ui.h5.f48232p1);
                return;
        }
    }

    public z3(l4 l4Var) {
        this.f30319a = 0;
        this.d = l4Var;
        this.f30320b = new Rect();
        this.f30321c = new Rect();
    }
}
