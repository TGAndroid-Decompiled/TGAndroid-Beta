package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ia implements org.telegram.ui.Components.zl0 {
    public final ta f40195a;

    public ia(ta taVar) {
        this.f40195a = taVar;
    }

    @Override
    public final void c(int i10, View view) {
        int i11;
        int i12;
        int i13;
        boolean z10 = view instanceof qa;
        ta taVar = this.f40195a;
        if (z10) {
            qa qaVar = (qa) view;
            TLRPC.TL_username tL_username = qaVar.v;
            if (tL_username != null && !qaVar.f42786r) {
                if (tL_username.editable && taVar.f43712x == 0) {
                    taVar.f43705b.y0(0);
                    taVar.f0(true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(taVar.getParentActivity(), 0, taVar.getResourceProvider());
                if (tL_username.active) {
                    i11 = R.string.UsernameDeactivateLink;
                } else {
                    i11 = R.string.UsernameActivateLink;
                }
                alertDialog$Builder.f22366a.R = LocaleController.getString(i11);
                if (tL_username.active) {
                    i12 = R.string.UsernameDeactivateLinkProfileMessage;
                } else {
                    i12 = R.string.UsernameActivateLinkProfileMessage;
                }
                alertDialog$Builder.f22366a.T = LocaleController.getString(i12);
                if (tL_username.active) {
                    i13 = R.string.Hide;
                } else {
                    i13 = R.string.Show;
                }
                alertDialog$Builder.k(LocaleController.getString(i13), new ag.k0(this, tL_username, i10, view, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.x0(27));
                alertDialog$Builder.p();
            }
        } else if (view instanceof na) {
            taVar.f0(true);
        }
    }
}
