package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class je implements Runnable {
    public final int f46989a = 0;
    public final cn f46990b;
    public final org.telegram.messenger.qp f46991c;
    public final CharSequence d;
    public final boolean f46992e;

    public je(cn cnVar, CharSequence charSequence, org.telegram.messenger.qp qpVar, boolean z9) {
        this.f46990b = cnVar;
        this.d = charSequence;
        this.f46991c = qpVar;
        this.f46992e = z9;
    }

    @Override
    public final void run() {
        switch (this.f46989a) {
            case 0:
                cn.P0(this.f46990b, this.d, this.f46991c, this.f46992e);
                return;
            default:
                cn cnVar = this.f46990b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44750za);
                String M0 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                String M02 = org.telegram.messenger.id.M0(2131747831, null);
                org.telegram.messenger.qp qpVar = this.f46991c;
                alertDialog$Builder.k(M02, new a3.g(cnVar, qpVar, this.d, this.f46992e, 4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                u1Var.T = org.telegram.messenger.id.M0(2131745685, null);
                cnVar.showDialog(u1Var);
                qpVar.G2 = 0;
                org.telegram.messenger.qp.e1().edit().putInt("secretWebpage2", qpVar.G2).commit();
                return;
        }
    }

    public je(cn cnVar, org.telegram.messenger.qp qpVar, CharSequence charSequence, boolean z9) {
        this.f46990b = cnVar;
        this.f46991c = qpVar;
        this.d = charSequence;
        this.f46992e = z9;
    }
}
