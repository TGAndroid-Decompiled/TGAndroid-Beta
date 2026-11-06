package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class je implements Runnable {
    public final int f46916a = 0;
    public final an f46917b;
    public final org.telegram.messenger.qp f46918c;
    public final CharSequence d;
    public final boolean f46919e;

    public je(an anVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        this.f46917b = anVar;
        this.d = charSequence;
        this.f46918c = qpVar;
        this.f46919e = z9;
    }

    @Override
    public final void run() {
        switch (this.f46916a) {
            case 0:
                an.N0(this.f46917b, this.d, this.f46918c, this.f46919e);
                return;
            default:
                an anVar = this.f46917b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f43998xa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                String M02 = org.telegram.messenger.hd.M0(2131747830, null);
                org.telegram.messenger.qp qpVar = this.f46918c;
                alertDialog$Builder.k(M02, new a3.g(anVar, qpVar, this.d, this.f46919e, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                u1Var.T = org.telegram.messenger.hd.M0(2131745686, null);
                anVar.showDialog(u1Var);
                qpVar.G2 = 0;
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", qpVar.G2).commit();
                return;
        }
    }

    public je(an anVar, org.telegram.messenger.qp qpVar, CharSequence charSequence, boolean z9) {
        this.f46917b = anVar;
        this.f46918c = qpVar;
        this.d = charSequence;
        this.f46919e = z9;
    }
}
