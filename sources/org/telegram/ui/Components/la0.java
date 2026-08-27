package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

public final class la0 implements d5.d {

    public final int f30330a;

    public final ViewGroup f30331b;

    public la0(ViewGroup viewGroup, int i10) {
        this.f30330a = i10;
        this.f30331b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30330a) {
            case 0:
                ab0 ab0Var = (ab0) this.f30331b;
                ab0Var.f26717n.y(ab0Var.f26716f.T((View) obj));
                break;
            default:
                k51 k51Var = (k51) this.f30331b;
                k51Var.U2.Q(k51Var.T((View) obj), k51Var.Y2);
                break;
        }
    }
}
