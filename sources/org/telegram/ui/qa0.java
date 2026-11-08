package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 implements Runnable {
    public final int f49177a;
    public final ce0 f49178b;

    public qa0(ce0 ce0Var, int i7) {
        this.f49177a = i7;
        this.f49178b = ce0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f49177a;
        ce0 ce0Var = this.f49178b;
        switch (i7) {
            case 0:
                ce0Var.f44766c0 = false;
                return;
            case 1:
                ce0Var.f44791w0 = false;
                ce0Var.P1(true, true);
                return;
            default:
                if (ce0Var.getParentActivity() != null && !ce0Var.getParentActivity().isFinishing() && ce0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131746074, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131745952, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new ta0(ce0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
