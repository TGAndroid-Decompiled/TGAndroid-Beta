package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.an0;
public final class z3 implements View.OnLayoutChangeListener {
    public final int f30285a;
    public final Object f30286b;
    public final Object f30287c;
    public final Object d;

    public z3(an0 an0Var, an0 an0Var2, an0 an0Var3) {
        this.f30285a = 1;
        this.f30286b = an0Var;
        this.f30287c = an0Var2;
        this.d = an0Var3;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f30285a) {
            case 0:
                Rect rect = (Rect) this.f30286b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.f30287c;
                rect2.set(i13, i14, i15, i16);
                l4 l4Var = (l4) this.d;
                j4 j4Var = l4Var.f29186b;
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
                ((an0) this.f30286b).setProgress(org.telegram.ui.h5.n1);
                ((an0) this.f30287c).setProgress(org.telegram.ui.h5.f48195o1);
                ((an0) this.d).setProgress(org.telegram.ui.h5.f48196p1);
                return;
        }
    }

    public z3(l4 l4Var) {
        this.f30285a = 0;
        this.d = l4Var;
        this.f30286b = new Rect();
        this.f30287c = new Rect();
    }
}
