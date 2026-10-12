package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ja implements org.telegram.ui.Components.km0 {
    public final ua f39167a;

    public ja(ua uaVar) {
        this.f39167a = uaVar;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof ra;
        ua uaVar = this.f39167a;
        if (z10) {
            ra raVar = (ra) view;
            TLRPC.TL_username tL_username = raVar.v;
            if (tL_username != null && !raVar.f41584r) {
                if (tL_username.editable && uaVar.f42441x == 0) {
                    uaVar.f42433b.x0(0);
                    uaVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uaVar.getParentActivity(), 0, uaVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f20142a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f20142a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new ha(this, tL_username, i10, view, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.r0(26));
                alertDialog$Builder.o();
            }
        } else if (view instanceof oa) {
            uaVar.e0(true);
        }
    }
}
