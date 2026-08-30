package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ap implements org.telegram.ui.Components.il0 {
    public final cp f32684a;

    public ap(cp cpVar) {
        this.f32684a = cpVar;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        cp cpVar = this.f32684a;
        dp dpVar = cpVar.X2;
        if ((view instanceof ma) && (tL_username = ((ma) view).v) != null) {
            if (tL_username.editable) {
                View view2 = dpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, dpVar.f33771y.getTop() - AndroidUtilities.dp(128.0f));
                }
                dpVar.f33746a.requestFocus();
                AndroidUtilities.showKeyboard(dpVar.f33746a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getContext(), 0, dpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f19503a.O = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f19503a.Q = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new d7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(23));
            alertDialog$Builder.o();
        }
    }
}
