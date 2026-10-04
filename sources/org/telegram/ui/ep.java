package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep implements org.telegram.ui.Components.ml0 {
    public final gp f36068a;

    public ep(gp gpVar) {
        this.f36068a = gpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        gp gpVar = this.f36068a;
        hp hpVar = gpVar.f36701h3;
        if ((view instanceof pa) && (tL_username = ((pa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = hpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, hpVar.f37159y.getTop() - AndroidUtilities.dp(128.0f));
                }
                hpVar.f37130a.requestFocus();
                AndroidUtilities.showKeyboard(hpVar.f37130a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getContext(), 0, hpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20372a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20372a.T = LocaleController.getString(i12);
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
