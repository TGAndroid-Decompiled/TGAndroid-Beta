package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class za0 implements e2.h {
    public final int f33142a;
    public final ViewGroup f33143b;

    public za0(ViewGroup viewGroup, int i10) {
        this.f33142a = i10;
        this.f33143b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33142a) {
            case 0:
                qb0 qb0Var = (qb0) this.f33143b;
                qb0Var.f29692n.y(qb0Var.f29691f.T((View) obj));
                return;
            default:
                d61 d61Var = (d61) this.f33143b;
                d61Var.Y2.Q(d61Var.T((View) obj), d61Var.f25308c3);
                return;
        }
    }
}
