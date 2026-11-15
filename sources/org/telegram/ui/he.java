package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class he implements Runnable {
    public final int f47688a = 0;
    public final an f47689b;
    public final org.telegram.messenger.np f47690c;
    public final CharSequence d;
    public final boolean f47691e;

    public he(an anVar, CharSequence charSequence, org.telegram.messenger.np npVar, boolean z10) {
        this.f47689b = anVar;
        this.d = charSequence;
        this.f47690c = npVar;
        this.f47691e = z10;
    }

    @Override
    public final void run() {
        switch (this.f47688a) {
            case 0:
                an.P0(this.f47689b, this.d, this.f47690c, this.f47691e);
                return;
            default:
                an anVar = this.f47689b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                String M02 = org.telegram.messenger.hd.M0(2131747831, null);
                org.telegram.messenger.np npVar = this.f47690c;
                alertDialog$Builder.k(M02, new a3.g(anVar, npVar, this.d, this.f47691e, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                t1Var.U = org.telegram.messenger.hd.M0(2131745685, null);
                anVar.showDialog(t1Var);
                npVar.H2 = 0;
                org.telegram.messenger.np.e1().edit().putInt("secretWebpage2", npVar.H2).commit();
                return;
        }
    }

    public he(an anVar, org.telegram.messenger.np npVar, CharSequence charSequence, boolean z10) {
        this.f47689b = anVar;
        this.f47690c = npVar;
        this.d = charSequence;
        this.f47691e = z10;
    }
}
