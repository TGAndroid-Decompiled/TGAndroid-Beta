package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class cb0 implements h5.d {
    public final int f25907a;
    public final ViewGroup f25908b;

    public cb0(ViewGroup viewGroup, int i10) {
        this.f25907a = i10;
        this.f25908b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25907a) {
            case 0:
                sb0 sb0Var = (sb0) this.f25908b;
                sb0Var.f31032n.y(sb0Var.f31031f.T((View) obj));
                return;
            default:
                i61 i61Var = (i61) this.f25908b;
                i61Var.V2.Q(i61Var.T((View) obj), i61Var.Z2);
                return;
        }
    }
}
