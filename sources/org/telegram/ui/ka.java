package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ka implements org.telegram.ui.Components.am0 {
    public final va f37613a;

    public ka(va vaVar) {
        this.f37613a = vaVar;
    }

    @Override
    public final void a(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof sa;
        va vaVar = this.f37613a;
        if (z10) {
            sa saVar = (sa) view;
            TLRPC.TL_username tL_username = saVar.v;
            if (tL_username != null && !saVar.f40017r) {
                if (tL_username.editable && vaVar.f40943x == 0) {
                    vaVar.f40936b.x0(0);
                    vaVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vaVar.getParentActivity(), 0, vaVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f19548a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f19548a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new ia(this, tL_username, i10, view, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.w0(21));
                alertDialog$Builder.o();
            }
        } else if (view instanceof pa) {
            vaVar.e0(true);
        }
    }
}
