package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp implements org.telegram.ui.Components.hl0 {
    public final ep f33206a;

    public cp(ep epVar) {
        this.f33206a = epVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        ep epVar = this.f33206a;
        fp fpVar = epVar.X2;
        if ((view instanceof oa) && (tL_username = ((oa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = fpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, fpVar.f34202y.getTop() - AndroidUtilities.dp(128.0f));
                }
                fpVar.f34177a.requestFocus();
                AndroidUtilities.showKeyboard(fpVar.f34177a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getContext(), 0, fpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f19478a.O = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new f7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(23));
            alertDialog$Builder.o();
        }
    }
}
