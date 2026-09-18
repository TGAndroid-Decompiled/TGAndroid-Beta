package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ya0 implements e2.h {
    public final int f30163a;
    public final ViewGroup f30164b;

    public ya0(ViewGroup viewGroup, int i10) {
        this.f30163a = i10;
        this.f30164b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30163a) {
            case 0:
                pb0 pb0Var = (pb0) this.f30164b;
                pb0Var.f26993n.y(pb0Var.f26992f.U((View) obj));
                return;
            default:
                f61 f61Var = (f61) this.f30164b;
                f61Var.Y2.Q(f61Var.U((View) obj), f61Var.f23800c3);
                return;
        }
    }
}
