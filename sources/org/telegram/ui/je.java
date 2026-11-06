package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class je implements Runnable {
    public final int f46939a = 0;
    public final an f46940b;
    public final org.telegram.messenger.qp f46941c;
    public final CharSequence d;
    public final boolean f46942e;

    public je(an anVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        this.f46940b = anVar;
        this.d = charSequence;
        this.f46941c = qpVar;
        this.f46942e = z9;
    }

    @Override
    public final void run() {
        switch (this.f46939a) {
            case 0:
                an.N0(this.f46940b, this.d, this.f46941c, this.f46942e);
                return;
            default:
                an anVar = this.f46940b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44022xa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                String M02 = org.telegram.messenger.hd.M0(2131747830, null);
                org.telegram.messenger.qp qpVar = this.f46941c;
                alertDialog$Builder.k(M02, new a3.g(anVar, qpVar, this.d, this.f46942e, 4));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                u1Var.T = org.telegram.messenger.hd.M0(2131745686, null);
                anVar.showDialog(u1Var);
                qpVar.G2 = 0;
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", qpVar.G2).commit();
                return;
        }
    }

    public je(an anVar, org.telegram.messenger.qp qpVar, CharSequence charSequence, boolean z9) {
        this.f46940b = anVar;
        this.f46941c = qpVar;
        this.d = charSequence;
        this.f46942e = z9;
    }
}
