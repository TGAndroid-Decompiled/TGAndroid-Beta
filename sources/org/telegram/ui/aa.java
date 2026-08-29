package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aa implements org.telegram.ui.Components.zk0 {
    public final la f36466a;

    public aa(la laVar) {
        this.f36466a = laVar;
    }

    @Override
    public final void c(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof ia;
        la laVar = this.f36466a;
        if (z10) {
            ia iaVar = (ia) view;
            TLRPC.TL_username tL_username = iaVar.v;
            if (tL_username != null && !iaVar.f39177r) {
                if (tL_username.editable && laVar.f40148x == 0) {
                    laVar.f40140b.x0(0);
                    laVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(laVar.getParentActivity(), 0, laVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f22714a.N = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f22714a.P = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new eg.b0(this, tL_username, i10, view, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(15));
                alertDialog$Builder.o();
            }
        } else if (view instanceof fa) {
            laVar.e0(true);
        }
    }
}
