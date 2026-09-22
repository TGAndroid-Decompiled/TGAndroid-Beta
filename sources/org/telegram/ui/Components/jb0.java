package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class jb0 implements e2.h {
    public final int f25348a;
    public final ViewGroup f25349b;

    public jb0(ViewGroup viewGroup, int i10) {
        this.f25348a = i10;
        this.f25349b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25348a) {
            case 0:
                ac0 ac0Var = (ac0) this.f25349b;
                ac0Var.f22627n.y(ac0Var.f22626f.U((View) obj));
                return;
            default:
                u61 u61Var = (u61) this.f25349b;
                u61Var.Y2.Q(u61Var.U((View) obj), u61Var.f28684c3);
                return;
        }
    }
}
