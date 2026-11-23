package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ie implements Runnable {
    public final int f48724a = 0;
    public final bn f48725b;
    public final org.telegram.messenger.np f48726c;
    public final CharSequence d;
    public final boolean f48727e;

    public ie(bn bnVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        this.f48725b = bnVar;
        this.d = charSequence;
        this.f48726c = npVar;
        this.f48727e = z10;
    }

    @Override
    public final void run() {
        switch (this.f48724a) {
            case 0:
                bn.P0(this.f48725b, this.d, this.f48726c, this.f48727e);
                return;
            default:
                bn bnVar = this.f48725b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                String N02 = org.telegram.messenger.hd.N0(2131747637, null);
                org.telegram.messenger.np npVar = this.f48726c;
                alertDialog$Builder.k(N02, new a3.g(bnVar, npVar, this.d, this.f48727e, 5));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                t1Var.U = org.telegram.messenger.hd.N0(2131745489, null);
                bnVar.showDialog(t1Var);
                npVar.J2 = 0;
                org.telegram.messenger.np.g1().edit().putInt("secretWebpage2", npVar.J2).commit();
                return;
        }
    }

    public ie(bn bnVar, org.telegram.messenger.np npVar, CharSequence charSequence, boolean z10) {
        this.f48725b = bnVar;
        this.f48726c = npVar;
        this.d = charSequence;
        this.f48727e = z10;
    }
}
