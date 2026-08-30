package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ea implements org.telegram.ui.Components.il0 {
    public final pa f33942a;

    public ea(pa paVar) {
        this.f33942a = paVar;
    }

    @Override
    public final void f(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z4 = view instanceof ma;
        pa paVar = this.f33942a;
        if (z4) {
            ma maVar = (ma) view;
            TLRPC.TL_username tL_username = maVar.v;
            if (tL_username != null && !maVar.f36249r) {
                if (tL_username.editable && paVar.f37259x == 0) {
                    paVar.f37252b.x0(0);
                    paVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(paVar.getParentActivity(), 0, paVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f19503a.O = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f19503a.Q = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new gg.a0(this, tL_username, i10, view, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(20));
                alertDialog$Builder.o();
            }
        } else if (view instanceof ja) {
            paVar.e0(true);
        }
    }
}
