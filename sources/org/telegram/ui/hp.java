package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hp implements org.telegram.ui.Components.zk0 {
    public final jp f34339a;

    public hp(jp jpVar) {
        this.f34339a = jpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        jp jpVar = this.f34339a;
        kp kpVar = jpVar.f34960a3;
        if ((view instanceof na) && (tL_username = ((na) view).v) != null) {
            if (tL_username.editable) {
                View view2 = kpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, kpVar.f35231y.getTop() - AndroidUtilities.dp(128.0f));
                }
                kpVar.f35203a.requestFocus();
                AndroidUtilities.showKeyboard(kpVar.f35203a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jpVar.getContext(), 0, kpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f18435a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f18435a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new b7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(21));
            alertDialog$Builder.o();
        }
    }
}
