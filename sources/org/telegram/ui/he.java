package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class he implements Runnable {
    public final int f47678a = 0;
    public final an f47679b;
    public final org.telegram.messenger.np f47680c;
    public final CharSequence d;
    public final boolean f47681e;

    public he(an anVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        this.f47679b = anVar;
        this.d = charSequence;
        this.f47680c = npVar;
        this.f47681e = z10;
    }

    @Override
    public final void run() {
        switch (this.f47678a) {
            case 0:
                an.P0(this.f47679b, this.d, this.f47680c, this.f47681e);
                return;
            default:
                an anVar = this.f47679b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                String M02 = org.telegram.messenger.hd.M0(2131747831, null);
                org.telegram.messenger.np npVar = this.f47680c;
                alertDialog$Builder.k(M02, new a3.g(anVar, npVar, this.d, this.f47681e, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                t1Var.U = org.telegram.messenger.hd.M0(2131745685, null);
                anVar.showDialog(t1Var);
                npVar.H2 = 0;
                org.telegram.messenger.np.e1().edit().putInt("secretWebpage2", npVar.H2).commit();
                return;
        }
    }

    public he(an anVar, org.telegram.messenger.np npVar, CharSequence charSequence, boolean z10) {
        this.f47679b = anVar;
        this.f47680c = npVar;
        this.d = charSequence;
        this.f47681e = z10;
    }
}
