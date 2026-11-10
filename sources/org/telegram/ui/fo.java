package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fo implements org.telegram.ui.Components.bj0 {
    public final ho f45814a;

    public fo(ho hoVar) {
        this.f45814a = hoVar;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        ho hoVar = this.f45814a;
        io ioVar = hoVar.f46402h3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f46595w) != null) {
            if (tL_username.editable) {
                if (ioVar.fragmentView instanceof ScrollView) {
                    ioVar.f46681a.smoothScrollTo(0, ioVar.D.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                ioVar.f46683b.requestFocus();
                org.telegram.messenger.g0.K3(ioVar.f46683b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hoVar.getContext(), ioVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743664;
            } else {
                i10 = 2131743671;
            }
            String M0 = org.telegram.messenger.id.M0(i10, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            if (tL_username.active) {
                i11 = 2131743663;
            } else {
                i11 = 2131743670;
            }
            u1Var.T = org.telegram.messenger.id.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749325;
            } else {
                i12 = 2131745353;
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(i12, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(23));
            alertDialog$Builder.p();
        }
    }
}
