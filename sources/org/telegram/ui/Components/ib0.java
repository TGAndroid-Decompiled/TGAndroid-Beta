package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ib0 implements e2.h {
    public final int f23982a;
    public final ViewGroup f23983b;

    public ib0(ViewGroup viewGroup, int i10) {
        this.f23982a = i10;
        this.f23983b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23982a) {
            case 0:
                yb0 yb0Var = (yb0) this.f23983b;
                yb0Var.f29297n.y(yb0Var.f29296f.T((View) obj));
                return;
            default:
                r61 r61Var = (r61) this.f23983b;
                r61Var.Y2.Q(r61Var.T((View) obj), r61Var.f26606c3);
                return;
        }
    }
}
