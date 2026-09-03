package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ga implements org.telegram.ui.Components.hl0 {
    public final ra f34369a;

    public ga(ra raVar) {
        this.f34369a = raVar;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z4 = view instanceof oa;
        ra raVar = this.f34369a;
        if (z4) {
            oa oaVar = (oa) view;
            TLRPC.TL_username tL_username = oaVar.v;
            if (tL_username != null && !oaVar.f36703r) {
                if (tL_username.editable && raVar.f37783x == 0) {
                    raVar.f37776b.x0(0);
                    raVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f19478a.O = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f19478a.Q = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new gg.a0(this, tL_username, i10, view, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(20));
                alertDialog$Builder.o();
            }
        } else if (view instanceof la) {
            raVar.e0(true);
        }
    }
}
