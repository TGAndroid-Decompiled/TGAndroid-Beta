package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ip implements org.telegram.ui.Components.km0 {
    public final kp f38958a;

    public ip(kp kpVar) {
        this.f38958a = kpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        kp kpVar = this.f38958a;
        lp lpVar = kpVar.Y2;
        if ((view instanceof ra) && (tL_username = ((ra) view).v) != null) {
            if (tL_username.editable) {
                View view2 = lpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, lpVar.f39829y.getTop() - AndroidUtilities.dp(128.0f));
                }
                lpVar.f39800a.requestFocus();
                AndroidUtilities.showKeyboard(lpVar.f39800a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getContext(), 0, lpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f20142a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f20142a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new d7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.r0(29));
            alertDialog$Builder.o();
        }
    }
}
