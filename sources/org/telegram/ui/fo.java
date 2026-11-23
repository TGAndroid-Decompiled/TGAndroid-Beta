package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fo implements org.telegram.ui.Components.qj0 {
    public final ho f47938a;

    public fo(ho hoVar) {
        this.f47938a = hoVar;
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        ho hoVar = this.f47938a;
        io ioVar = hoVar.f48602i3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f48762w) != null) {
            if (tL_username.editable) {
                if (ioVar.fragmentView instanceof ScrollView) {
                    ioVar.f48861a.smoothScrollTo(0, ioVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                ioVar.f48863b.requestFocus();
                org.telegram.messenger.g0.I3(ioVar.f48863b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), ioVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743417;
            } else {
                i10 = 2131743424;
            }
            String N0 = org.telegram.messenger.gd.N0(i10, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (tL_username.active) {
                i11 = 2131743416;
            } else {
                i11 = 2131743423;
            }
            t1Var.U = org.telegram.messenger.gd.N0(i11, null);
            if (tL_username.active) {
                i12 = 2131749132;
            } else {
                i12 = 2131745157;
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(i12, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(28));
            alertDialog$Builder.p();
        }
    }
}
