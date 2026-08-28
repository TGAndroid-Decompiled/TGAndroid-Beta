package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ba implements org.telegram.ui.Components.mk0 {
    public final ma f36798a;

    public ba(ma maVar) {
        this.f36798a = maVar;
    }

    @Override
    public final void a(int i9, View view) {
        int i10;
        int i11;
        int i12;
        boolean z10 = view instanceof ja;
        ma maVar = this.f36798a;
        if (z10) {
            ja jaVar = (ja) view;
            TLRPC.TL_username tL_username = jaVar.v;
            if (tL_username != null && !jaVar.f39420r) {
                if (tL_username.editable && maVar.f40370x == 0) {
                    maVar.f40362b.x0(0);
                    maVar.d0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(maVar.getParentActivity(), 0, maVar.getResourceProvider());
                if (tL_username.active) {
                    i10 = R.string.UsernameDeactivateLink;
                } else {
                    i10 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f22702a.N = LocaleController.getString(i10);
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i11 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f22702a.P = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.Hide;
                } else {
                    i12 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i12), new bg.d0(this, tL_username, i9, view, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mg.b(21));
                alertDialog$Builder.o();
            }
        } else if (view instanceof ga) {
            maVar.d0(true);
        }
    }
}
