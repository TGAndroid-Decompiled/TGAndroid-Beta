package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ab0 implements h5.d {
    public final int f23339a;
    public final ViewGroup f23340b;

    public ab0(ViewGroup viewGroup, int i10) {
        this.f23339a = i10;
        this.f23340b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23339a) {
            case 0:
                qb0 qb0Var = (qb0) this.f23340b;
                qb0Var.f28106n.y(qb0Var.f28105f.T((View) obj));
                return;
            default:
                g61 g61Var = (g61) this.f23340b;
                g61Var.V2.Q(g61Var.T((View) obj), g61Var.Z2);
                return;
        }
    }
}
