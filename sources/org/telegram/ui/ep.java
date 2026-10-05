package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep implements org.telegram.ui.Components.ml0 {
    public final gp f36089a;

    public ep(gp gpVar) {
        this.f36089a = gpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        gp gpVar = this.f36089a;
        hp hpVar = gpVar.f36725h3;
        if ((view instanceof pa) && (tL_username = ((pa) view).v) != null) {
            if (tL_username.editable) {
                if (hpVar.fragmentView instanceof ScrollView) {
                    hpVar.f37130a.smoothScrollTo(0, hpVar.E.getTop() - AndroidUtilities.dp(128.0f));
                }
                hpVar.f37132b.requestFocus();
                AndroidUtilities.showKeyboard(hpVar.f37132b);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getContext(), 0, hpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20377a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20377a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new c7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4(9));
            alertDialog$Builder.o();
        }
    }
}
