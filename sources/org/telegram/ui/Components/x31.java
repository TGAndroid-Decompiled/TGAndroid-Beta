package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class x31 {

    public final g41 f34462a;

    public final j41 f34463b;

    public x31(j41 j41Var, g41 g41Var) {
        this.f34463b = j41Var;
        this.f34462a = g41Var;
    }

    public final int a() {
        return this.f34463b.f29587s.v;
    }

    public final void b(boolean z10) {
        f2.q0 adapter;
        i41 i41Var;
        j41 j41Var = this.f34463b;
        z31 z31Var = j41Var.f29585n;
        if (z10) {
            f2.q0 adapter2 = z31Var.getAdapter();
            pf.l1 l1Var = j41Var.v;
            if (adapter2 != l1Var) {
                z31Var.setAdapter(l1Var);
            } else {
                if (!z10) {
                    return;
                }
                adapter = z31Var.getAdapter();
                i41Var = j41Var.f29587s;
                if (adapter != i41Var) {
                    return;
                } else {
                    z31Var.setAdapter(i41Var);
                }
            }
        } else {
            if (!z10) {
                return;
            }
            adapter = z31Var.getAdapter();
            i41Var = j41Var.f29587s;
            if (adapter != i41Var) {
                return;
            } else {
                z31Var.setAdapter(i41Var);
            }
        }
        if (z31Var.getAdapter().h() > 0) {
            j41Var.f29586r.i1(0, AndroidUtilities.dp(58.0f) + (-z31Var.getPaddingTop()) + j41Var.A, false);
        }
    }
}
