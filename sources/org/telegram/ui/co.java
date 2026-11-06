package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class co implements org.telegram.ui.Components.bj0 {
    public final fo f44863a;

    public co(fo foVar) {
        this.f44863a = foVar;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        fo foVar = this.f44863a;
        go goVar = foVar.f45682h3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f46624w) != null) {
            if (tL_username.editable) {
                if (goVar.fragmentView instanceof ScrollView) {
                    goVar.f46045a.smoothScrollTo(0, goVar.D.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                goVar.f46047b.requestFocus();
                org.telegram.messenger.g0.K3(goVar.f46047b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, foVar.getContext(), goVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743665;
            } else {
                i10 = 2131743672;
            }
            String M0 = org.telegram.messenger.hd.M0(i10, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            if (tL_username.active) {
                i11 = 2131743664;
            } else {
                i11 = 2131743671;
            }
            u1Var.T = org.telegram.messenger.hd.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749324;
            } else {
                i12 = 2131745354;
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(i12, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.ch(23));
            alertDialog$Builder.p();
        }
    }
}
