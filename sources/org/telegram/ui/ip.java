package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ip implements org.telegram.ui.Components.zk0 {
    public final kp f37446a;

    public ip(kp kpVar) {
        this.f37446a = kpVar;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        kp kpVar = this.f37446a;
        lp lpVar = kpVar.f38127a3;
        if ((view instanceof na) && (tL_username = ((na) view).v) != null) {
            if (tL_username.editable) {
                View view2 = lpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, lpVar.f38479y.getTop() - AndroidUtilities.dp(128.0f));
                }
                lpVar.f38450a.requestFocus();
                AndroidUtilities.showKeyboard(lpVar.f38450a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getContext(), 0, lpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20225a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20225a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new b7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.t0(19));
            alertDialog$Builder.o();
        }
    }
}
