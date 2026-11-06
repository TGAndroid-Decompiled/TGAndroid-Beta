package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 implements Runnable {
    public final int f49151a;
    public final ce0 f49152b;

    public qa0(ce0 ce0Var, int i7) {
        this.f49151a = i7;
        this.f49152b = ce0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f49151a;
        ce0 ce0Var = this.f49152b;
        switch (i7) {
            case 0:
                ce0Var.f44741c0 = false;
                return;
            case 1:
                ce0Var.f44766w0 = false;
                ce0Var.P1(true, true);
                return;
            default:
                if (ce0Var.getParentActivity() != null && !ce0Var.getParentActivity().isFinishing() && ce0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131745950, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
