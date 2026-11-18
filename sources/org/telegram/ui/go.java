package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class go implements org.telegram.ui.Components.oj0 {
    public final io f48073a;

    public go(io ioVar) {
        this.f48073a = ioVar;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        io ioVar = this.f48073a;
        jo joVar = ioVar.f48772i3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f48673w) != null) {
            if (tL_username.editable) {
                if (joVar.fragmentView instanceof ScrollView) {
                    joVar.f48995a.smoothScrollTo(0, joVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                joVar.f48997b.requestFocus();
                org.telegram.messenger.g0.I3(joVar.f48997b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), joVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743427;
            } else {
                i10 = 2131743434;
            }
            String M0 = org.telegram.messenger.gd.M0(i10, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            if (tL_username.active) {
                i11 = 2131743426;
            } else {
                i11 = 2131743433;
            }
            u1Var.U = org.telegram.messenger.gd.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749133;
            } else {
                i12 = 2131745158;
            }
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(i12, null), new z6(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(28));
            alertDialog$Builder.p();
        }
    }
}
