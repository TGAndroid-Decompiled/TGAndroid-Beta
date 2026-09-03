package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class cb0 implements h5.d {
    public final int f25884a;
    public final ViewGroup f25885b;

    public cb0(ViewGroup viewGroup, int i10) {
        this.f25884a = i10;
        this.f25885b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25884a) {
            case 0:
                sb0 sb0Var = (sb0) this.f25885b;
                sb0Var.f31032n.y(sb0Var.f31031f.T((View) obj));
                return;
            default:
                h61 h61Var = (h61) this.f25885b;
                h61Var.V2.Q(h61Var.T((View) obj), h61Var.Z2);
                return;
        }
    }
}
