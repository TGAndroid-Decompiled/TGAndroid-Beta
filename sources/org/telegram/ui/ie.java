package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ie implements Runnable {
    public final int f48740a = 0;
    public final bn f48741b;
    public final org.telegram.messenger.mp f48742c;
    public final CharSequence d;
    public final boolean f48743e;

    public ie(bn bnVar, CharSequence charSequence, org.telegram.messenger.mp mpVar, boolean z10) {
        this.f48741b = bnVar;
        this.d = charSequence;
        this.f48742c = mpVar;
        this.f48743e = z10;
    }

    @Override
    public final void run() {
        switch (this.f48740a) {
            case 0:
                bn.P0(this.f48741b, this.d, this.f48742c, this.f48743e);
                return;
            default:
                bn bnVar = this.f48741b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String N0 = org.telegram.messenger.gd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                String N02 = org.telegram.messenger.gd.N0(2131747637, null);
                org.telegram.messenger.mp mpVar = this.f48742c;
                alertDialog$Builder.k(N02, new a3.g(bnVar, mpVar, this.d, this.f48743e, 5));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.U = org.telegram.messenger.gd.N0(2131745489, null);
                bnVar.showDialog(t1Var);
                mpVar.J2 = 0;
                org.telegram.messenger.mp.g1().edit().putInt("secretWebpage2", mpVar.J2).commit();
                return;
        }
    }

    public ie(bn bnVar, org.telegram.messenger.mp mpVar, CharSequence charSequence, boolean z10) {
        this.f48741b = bnVar;
        this.f48742c = mpVar;
        this.d = charSequence;
        this.f48743e = z10;
    }
}
