package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ha implements org.telegram.ui.Components.al0 {
    public final sa f34219a;

    public ha(sa saVar) {
        this.f34219a = saVar;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof pa;
        sa saVar = this.f34219a;
        if (z10) {
            pa paVar = (pa) view;
            TLRPC.TL_username tL_username = paVar.v;
            if (tL_username != null && !paVar.f36575r) {
                if (tL_username.editable && saVar.f37437x == 0) {
                    saVar.f37430b.y0(0);
                    saVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(saVar.getParentActivity(), 0, saVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f18446a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f18446a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new fa(this, tL_username, i10, view, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(19));
                alertDialog$Builder.o();
            }
        } else if (view instanceof ma) {
            saVar.e0(true);
        }
    }
}
