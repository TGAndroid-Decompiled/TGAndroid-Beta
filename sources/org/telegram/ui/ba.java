package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ba implements org.telegram.ui.Components.fj0 {
    public final ka f44006a;

    public ba(ka kaVar) {
        this.f44006a = kaVar;
    }

    @Override
    public final void f(int i3, View view) {
        int i10;
        int i11;
        int i12;
        boolean z10 = view instanceof ha;
        ka kaVar = this.f44006a;
        if (z10) {
            ha haVar = (ha) view;
            TLRPC.TL_username tL_username = haVar.f45877w;
            if (tL_username != null && !haVar.f45875r) {
                if (tL_username.editable && kaVar.f46848y == 0) {
                    kaVar.f46839b.y0(0);
                    kaVar.j0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kaVar.getParentActivity(), kaVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = 2131743674;
                } else {
                    i10 = 2131743681;
                }
                String M0 = org.telegram.messenger.bd.M0(i10, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (tL_username.active) {
                    i11 = 2131743672;
                } else {
                    i11 = 2131743679;
                }
                s1Var.U = org.telegram.messenger.bd.M0(i11, null);
                if (tL_username.active) {
                    i12 = 2131749333;
                } else {
                    i12 = 2131745363;
                }
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(i12, null), new cg.e0(this, tL_username, i3, view, 1));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(15));
                alertDialog$Builder.p();
            }
        } else if (view instanceof fa) {
            kaVar.j0(true);
        }
    }
}
