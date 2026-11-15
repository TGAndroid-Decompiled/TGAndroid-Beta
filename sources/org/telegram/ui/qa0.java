package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 implements Runnable {
    public final int f50542a;
    public final ce0 f50543b;

    public qa0(ce0 ce0Var, int i7) {
        this.f50542a = i7;
        this.f50543b = ce0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50542a;
        ce0 ce0Var = this.f50543b;
        switch (i7) {
            case 0:
                ce0Var.f46091d0 = false;
                return;
            case 1:
                ce0Var.f46119y0 = false;
                ce0Var.P1(true, true);
                return;
            default:
                if (ce0Var.getParentActivity() != null && !ce0Var.getParentActivity().isFinishing() && ce0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131745949, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
