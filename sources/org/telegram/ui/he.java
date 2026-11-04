package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class he implements Runnable {
    public final int f45907a = 0;
    public final wm f45908b;
    public final org.telegram.messenger.hp f45909c;
    public final CharSequence d;
    public final boolean f45910e;

    public he(wm wmVar, CharSequence charSequence, org.telegram.messenger.hp hpVar, boolean z10) {
        this.f45908b = wmVar;
        this.d = charSequence;
        this.f45909c = hpVar;
        this.f45910e = z10;
    }

    @Override
    public final void run() {
        switch (this.f45907a) {
            case 0:
                wm.N0(this.f45908b, this.d, this.f45909c, this.f45910e);
                return;
            default:
                wm wmVar = this.f45908b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                String M02 = org.telegram.messenger.bd.M0(2131747839, null);
                org.telegram.messenger.hp hpVar = this.f45909c;
                alertDialog$Builder.k(M02, new ga.b(wmVar, hpVar, this.d, this.f45910e, 3));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.U = org.telegram.messenger.bd.M0(2131745695, null);
                wmVar.showDialog(s1Var);
                hpVar.H2 = 0;
                org.telegram.messenger.hp.e1().edit().putInt("secretWebpage2", hpVar.H2).commit();
                return;
        }
    }

    public he(wm wmVar, org.telegram.messenger.hp hpVar, CharSequence charSequence, boolean z10) {
        this.f45908b = wmVar;
        this.f45909c = hpVar;
        this.d = charSequence;
        this.f45910e = z10;
    }
}
