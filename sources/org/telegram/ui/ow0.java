package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ow0 extends org.telegram.ui.Components.hm0 {
    public final Context f39895c;
    public final pw0 d;

    public ow0(pw0 pw0Var, Context context) {
        this.d = pw0Var;
        this.f39895c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return !((rw0) this.d.f40252n.d.get(b1Var.b())).f40822a.current;
    }

    @Override
    public final int h() {
        return this.d.f40252n.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        sg.q1 q1Var = (sg.q1) b1Var.f45938a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f40252n;
        rw0 rw0Var = (rw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.a(rw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        q1Var.c(z11, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        nw0 nw0Var = new nw0(this, this.f39895c);
        nw0Var.setCirclePaintProvider(new fr0(6, this, nw0Var));
        return new s4.b1(nw0Var);
    }
}
