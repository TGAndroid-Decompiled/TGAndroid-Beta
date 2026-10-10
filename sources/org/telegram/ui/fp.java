package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fp implements org.telegram.ui.Components.fm0 {
    public final hp f37699a;

    public fp(hp hpVar) {
        this.f37699a = hpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        hp hpVar = this.f37699a;
        ip ipVar = hpVar.Y2;
        if ((view instanceof oa) && (tL_username = ((oa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = ipVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, ipVar.f38781y.getTop() - AndroidUtilities.dp(128.0f));
                }
                ipVar.f38752a.requestFocus();
                AndroidUtilities.showKeyboard(ipVar.f38752a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getContext(), 0, ipVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20378a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20378a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new a7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(29));
            alertDialog$Builder.o();
        }
    }
}
