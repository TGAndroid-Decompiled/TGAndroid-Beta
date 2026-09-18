package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class hb0 implements e2.h {
    public final int f24629a;
    public final ViewGroup f24630b;

    public hb0(ViewGroup viewGroup, int i10) {
        this.f24629a = i10;
        this.f24630b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24629a) {
            case 0:
                yb0 yb0Var = (yb0) this.f24630b;
                yb0Var.f30539n.y(yb0Var.f30538f.U((View) obj));
                return;
            default:
                t61 t61Var = (t61) this.f24630b;
                t61Var.Y2.Q(t61Var.U((View) obj), t61Var.f28336c3);
                return;
        }
    }
}
