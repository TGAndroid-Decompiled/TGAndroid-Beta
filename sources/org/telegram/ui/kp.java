package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kp implements org.telegram.ui.Components.am0 {
    public final mp f37702a;

    public kp(mp mpVar) {
        this.f37702a = mpVar;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        mp mpVar = this.f37702a;
        np npVar = mpVar.Y2;
        if ((view instanceof sa) && (tL_username = ((sa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = npVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, npVar.f38780y.getTop() - AndroidUtilities.dp(128.0f));
                }
                npVar.f38752a.requestFocus();
                AndroidUtilities.showKeyboard(npVar.f38752a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getContext(), 0, npVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f19548a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f19548a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new f7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.w0(24));
            alertDialog$Builder.o();
        }
    }
}
