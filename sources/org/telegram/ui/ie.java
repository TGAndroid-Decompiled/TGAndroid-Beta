package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ie implements Runnable {
    public final int f48709a = 0;
    public final bn f48710b;
    public final org.telegram.messenger.mp f48711c;
    public final CharSequence d;
    public final boolean f48712e;

    public ie(bn bnVar, CharSequence charSequence, org.telegram.messenger.mp mpVar, boolean z10) {
        this.f48710b = bnVar;
        this.d = charSequence;
        this.f48711c = mpVar;
        this.f48712e = z10;
    }

    @Override
    public final void run() {
        switch (this.f48709a) {
            case 0:
                bn.P0(this.f48710b, this.d, this.f48711c, this.f48712e);
                return;
            default:
                bn bnVar = this.f48710b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                String M02 = org.telegram.messenger.gd.M0(2131747638, null);
                org.telegram.messenger.mp mpVar = this.f48711c;
                alertDialog$Builder.k(M02, new a3.g(bnVar, mpVar, this.d, this.f48712e, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                u1Var.U = org.telegram.messenger.gd.M0(2131745490, null);
                bnVar.showDialog(u1Var);
                mpVar.J2 = 0;
                org.telegram.messenger.mp.g1().edit().putInt("secretWebpage2", mpVar.J2).commit();
                return;
        }
    }

    public ie(bn bnVar, org.telegram.messenger.mp mpVar, CharSequence charSequence, boolean z10) {
        this.f48710b = bnVar;
        this.f48711c = mpVar;
        this.d = charSequence;
        this.f48712e = z10;
    }
}
