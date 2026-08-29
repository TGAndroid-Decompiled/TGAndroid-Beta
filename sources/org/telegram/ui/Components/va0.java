package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class va0 implements f5.d {
    public final int f33509a;
    public final ViewGroup f33510b;

    public va0(ViewGroup viewGroup, int i10) {
        this.f33509a = i10;
        this.f33510b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33509a) {
            case 0:
                lb0 lb0Var = (lb0) this.f33510b;
                lb0Var.f30278n.y(lb0Var.f30277f.T((View) obj));
                return;
            default:
                u51 u51Var = (u51) this.f33510b;
                u51Var.U2.Q(u51Var.T((View) obj), u51Var.Y2);
                return;
        }
    }
}
