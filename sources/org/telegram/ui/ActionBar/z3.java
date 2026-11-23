package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.an0;
public final class z3 implements View.OnLayoutChangeListener {
    public final int f30376a;
    public final Object f30377b;
    public final Object f30378c;
    public final Object d;

    public z3(an0 an0Var, an0 an0Var2, an0 an0Var3) {
        this.f30376a = 1;
        this.f30377b = an0Var;
        this.f30378c = an0Var2;
        this.d = an0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f30376a) {
            case 0:
                Rect rect = (Rect) this.f30377b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f30378c;
                rect2.set(i13, i14, i15, i16);
                l4 l4Var = (l4) this.d;
                j4 j4Var = l4Var.f29271b;
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
                ((an0) this.f30377b).setProgress(org.telegram.ui.h5.n1);
                ((an0) this.f30378c).setProgress(org.telegram.ui.h5.f48428o1);
                ((an0) this.d).setProgress(org.telegram.ui.h5.f48429p1);
                return;
        }
    }

    public z3(l4 l4Var) {
        this.f30376a = 0;
        this.d = l4Var;
        this.f30377b = new Rect();
        this.f30378c = new Rect();
    }
}
