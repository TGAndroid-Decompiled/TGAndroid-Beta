package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 implements Runnable {
    public final int f51185a;
    public final de0 f51186b;

    public qa0(de0 de0Var, int i7) {
        this.f51185a = i7;
        this.f51186b = de0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51185a;
        de0 de0Var = this.f51186b;
        switch (i7) {
            case 0:
                de0Var.f46939d0 = false;
                return;
            case 1:
                de0Var.f46967y0 = false;
                de0Var.P1(true, true);
                return;
            default:
                if (de0Var.getParentActivity() != null && !de0Var.getParentActivity().isFinishing() && de0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745754, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), new ta0(de0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
