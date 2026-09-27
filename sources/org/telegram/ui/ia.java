package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ia implements org.telegram.ui.Components.ml0 {
    public final ta f34408a;

    public ia(ta taVar) {
        this.f34408a = taVar;
    }

    @Override
    public final void d(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof qa;
        ta taVar = this.f34408a;
        if (z10) {
            qa qaVar = (qa) view;
            TLRPC.TL_username tL_username = qaVar.v;
            if (tL_username != null && !qaVar.f36664r) {
                if (tL_username.editable && taVar.f37743x == 0) {
                    taVar.f37736b.y0(0);
                    taVar.e0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(taVar.getParentActivity(), 0, taVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f18655a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f18655a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new ga(this, tL_username, i10, view, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n4(5));
                alertDialog$Builder.o();
            }
        } else if (view instanceof na) {
            taVar.e0(true);
        }
    }
}
