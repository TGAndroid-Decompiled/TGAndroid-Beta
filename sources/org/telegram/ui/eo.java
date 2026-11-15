package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class eo implements org.telegram.ui.Components.gj0 {
    public final go f46872a;

    public eo(go goVar) {
        this.f46872a = goVar;
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.TL_username tL_username;
        int i10;
        int i11;
        int i12;
        go goVar = this.f46872a;
        ho hoVar = goVar.f47487i3;
        if ((view instanceof ia) && (tL_username = ((ia) view).f47995w) != null) {
            if (tL_username.editable) {
                if (hoVar.fragmentView instanceof ScrollView) {
                    hoVar.f47748a.smoothScrollTo(0, hoVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
                }
                hoVar.f47750b.requestFocus();
                org.telegram.messenger.g0.J3(hoVar.f47750b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, goVar.getContext(), hoVar.getResourceProvider());
            if (tL_username.active) {
                i10 = 2131743664;
            } else {
                i10 = 2131743671;
            }
            String M0 = org.telegram.messenger.hd.M0(i10, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (tL_username.active) {
                i11 = 2131743663;
            } else {
                i11 = 2131743670;
            }
            t1Var.U = org.telegram.messenger.hd.M0(i11, null);
            if (tL_username.active) {
                i12 = 2131749325;
            } else {
                i12 = 2131745353;
            }
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(i12, null), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(27));
            alertDialog$Builder.p();
        }
    }
}
