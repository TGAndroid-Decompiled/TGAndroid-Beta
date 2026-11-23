package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 implements Runnable {
    public final int f51391a;
    public final de0 f51392b;

    public qa0(de0 de0Var, int i7) {
        this.f51391a = i7;
        this.f51392b = de0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51391a;
        de0 de0Var = this.f51392b;
        switch (i7) {
            case 0:
                de0Var.f47055d0 = false;
                return;
            case 1:
                de0Var.f47083y0 = false;
                de0Var.P1(true, true);
                return;
            default:
                if (de0Var.getParentActivity() != null && !de0Var.getParentActivity().isFinishing() && de0Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131745875, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131745753, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new ta0(de0Var, 1));
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
