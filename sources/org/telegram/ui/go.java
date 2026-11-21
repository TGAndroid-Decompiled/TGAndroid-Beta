package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class go implements org.telegram.ui.Components.qj0 {
    public final io f48150a;

    public go(io ioVar) {
        this.f48150a = ioVar;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        io ioVar = this.f48150a;
        jo joVar = ioVar.f48794i3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f48703w) != null) {
            if (tL_username.editable) {
                if (joVar.fragmentView instanceof ScrollView) {
                    joVar.f49028a.smoothScrollTo(0, joVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                joVar.f49030b.requestFocus();
                org.telegram.messenger.g0.I3(joVar.f49030b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), joVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743421;
            } else {
                i10 = 2131743428;
            }
            String N0 = org.telegram.messenger.gd.N0(i10, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            if (tL_username.active) {
                i11 = 2131743420;
            } else {
                i11 = 2131743427;
            }
            t1Var.U = org.telegram.messenger.gd.N0(i11, null);
            if (tL_username.active) {
                i12 = 2131749132;
            } else {
                i12 = 2131745157;
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(i12, null), new z6(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(28));
            alertDialog$Builder.p();
        }
    }
}
