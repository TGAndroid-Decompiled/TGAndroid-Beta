package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class bb0 implements h5.d {
    public final int f23611a;
    public final ViewGroup f23612b;

    public bb0(ViewGroup viewGroup, int i10) {
        this.f23611a = i10;
        this.f23612b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23611a) {
            case 0:
                rb0 rb0Var = (rb0) this.f23612b;
                rb0Var.f28444n.y(rb0Var.f28443f.T((View) obj));
                return;
            default:
                g61 g61Var = (g61) this.f23612b;
                g61Var.V2.Q(g61Var.T((View) obj), g61Var.Z2);
                return;
        }
    }
}
