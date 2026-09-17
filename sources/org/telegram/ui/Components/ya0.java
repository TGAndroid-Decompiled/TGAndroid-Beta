package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ya0 implements e2.h {
    public final int f30160a;
    public final ViewGroup f30161b;

    public ya0(ViewGroup viewGroup, int i10) {
        this.f30160a = i10;
        this.f30161b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30160a) {
            case 0:
                pb0 pb0Var = (pb0) this.f30161b;
                pb0Var.f26990n.y(pb0Var.f26989f.U((View) obj));
                return;
            default:
                f61 f61Var = (f61) this.f30161b;
                f61Var.Y2.Q(f61Var.U((View) obj), f61Var.f23797c3);
                return;
        }
    }
}
