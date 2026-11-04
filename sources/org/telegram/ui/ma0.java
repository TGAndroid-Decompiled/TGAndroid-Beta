package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ma0 implements Runnable {
    public final int f47628a;
    public final xd0 f47629b;

    public ma0(xd0 xd0Var, int i3) {
        this.f47628a = i3;
        this.f47629b = xd0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f47628a;
        xd0 xd0Var = this.f47629b;
        switch (i3) {
            case 0:
                xd0Var.f51952d0 = false;
                return;
            case 1:
                xd0Var.f51978x0 = false;
                xd0Var.G1(true, true);
                return;
            default:
                if (xd0Var.getParentActivity() != null && !xd0Var.getParentActivity().isFinishing() && xd0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131745959, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new pa0(xd0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
