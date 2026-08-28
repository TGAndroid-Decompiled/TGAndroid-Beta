package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ha0 implements d5.d {
    public final int f29023a;
    public final ViewGroup f29024b;

    public ha0(ViewGroup viewGroup, int i9) {
        this.f29023a = i9;
        this.f29024b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29023a) {
            case 0:
                wa0 wa0Var = (wa0) this.f29024b;
                wa0Var.f34173n.y(wa0Var.f34172f.T((View) obj));
                return;
            default:
                i51 i51Var = (i51) this.f29024b;
                i51Var.U2.Q(i51Var.T((View) obj), i51Var.Y2);
                return;
        }
    }
}
