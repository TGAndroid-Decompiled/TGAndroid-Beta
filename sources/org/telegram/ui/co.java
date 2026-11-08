package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class co implements org.telegram.ui.Components.bj0 {
    public final fo f44868a;

    public co(fo foVar) {
        this.f44868a = foVar;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        fo foVar = this.f44868a;
        go goVar = foVar.f45659h3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f46622w) != null) {
            if (tL_username.editable) {
                if (goVar.fragmentView instanceof ScrollView) {
                    goVar.f46047a.smoothScrollTo(0, goVar.D.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                goVar.f46049b.requestFocus();
                org.telegram.messenger.g0.K3(goVar.f46049b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, foVar.getContext(), goVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743667;
            } else {
                i10 = 2131743674;
            }
            String M0 = org.telegram.messenger.id.M0(i10, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            if (tL_username.active) {
                i11 = 2131743666;
            } else {
                i11 = 2131743673;
            }
            u1Var.T = org.telegram.messenger.id.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749326;
            } else {
                i12 = 2131745356;
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(i12, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(23));
            alertDialog$Builder.p();
        }
    }
}
