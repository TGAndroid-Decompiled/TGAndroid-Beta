package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dp implements org.telegram.ui.Components.ml0 {
    public final fp f33012a;

    public dp(fp fpVar) {
        this.f33012a = fpVar;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_username tL_username;
        int i11;
        int i12;
        int i13;
        fp fpVar = this.f33012a;
        gp gpVar = fpVar.f33603a3;
        if ((view instanceof qa) && (tL_username = ((qa) view).v) != null) {
            if (tL_username.editable) {
                View view2 = gpVar.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, gpVar.f34013y.getTop() - AndroidUtilities.dp(128.0f));
                }
                gpVar.f33985a.requestFocus();
                AndroidUtilities.showKeyboard(gpVar.f33985a);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getContext(), 0, gpVar.getResourceProvider());
            if (tL_username.active) {
                i11 = R.string.UsernameDeactivateLink;
            } else {
                i11 = R.string.UsernameActivateLink;
            }
            alertDialog$Builder.f18655a.R = LocaleController.getString(i11);
            if (tL_username.active) {
                i12 = R.string.UsernameDeactivateLinkChannelMessage;
            } else {
                i12 = R.string.UsernameActivateLinkChannelMessage;
            }
            alertDialog$Builder.f18655a.T = LocaleController.getString(i12);
            if (tL_username.active) {
                i13 = R.string.Hide;
            } else {
                i13 = R.string.Show;
            }
            alertDialog$Builder.k(LocaleController.getString(i13), new d7(this, tL_username, view, 8));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n4(8));
            alertDialog$Builder.o();
        }
    }
}
