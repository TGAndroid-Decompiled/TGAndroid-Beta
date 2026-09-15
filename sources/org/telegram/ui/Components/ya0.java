package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class ya0 implements e2.h {
    public final int f30203a;
    public final ViewGroup f30204b;

    public ya0(ViewGroup viewGroup, int i10) {
        this.f30203a = i10;
        this.f30204b = viewGroup;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30203a) {
            case 0:
                pb0 pb0Var = (pb0) this.f30204b;
                pb0Var.f27003n.y(pb0Var.f27002f.T((View) obj));
                return;
            default:
                e61 e61Var = (e61) this.f30204b;
                e61Var.Y2.Q(e61Var.T((View) obj), e61Var.f23560c3);
                return;
        }
    }
}
