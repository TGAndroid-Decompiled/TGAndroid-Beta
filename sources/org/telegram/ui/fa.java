package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fa implements org.telegram.ui.Components.ll0 {
    public final qa f33588a;

    public fa(qa qaVar) {
        this.f33588a = qaVar;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof na;
        qa qaVar = this.f33588a;
        if (z10) {
            na naVar = (na) view;
            TLRPC.TL_username tL_username = naVar.v;
            if (tL_username != null && !naVar.f35783r) {
                if (tL_username.editable && qaVar.f36837x == 0) {
                    qaVar.f36830b.x0(0);
                    qaVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qaVar.getParentActivity(), 0, qaVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f18661a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f18661a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new da(this, tL_username, i10, view, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new u6(4));
                alertDialog$Builder.o();
            }
        } else if (view instanceof ka) {
            qaVar.e0(true);
        }
    }
}
