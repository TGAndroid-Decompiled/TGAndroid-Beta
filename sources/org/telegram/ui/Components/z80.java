package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z80 implements View.OnClickListener {
    public final int f30804a;
    public final g90 f30805b;

    public z80(g90 g90Var, int i10) {
        this.f30804a = i10;
        this.f30805b = g90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30804a) {
            case 0:
                this.f30805b.f24393r.j();
                return;
            case 1:
                g90 g90Var = this.f30805b;
                org.telegram.ui.ActionBar.m1 m1Var = g90Var.f24394s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                g90Var.f24393r.c();
                return;
            case 2:
                g90 g90Var2 = this.f30805b;
                String str = g90Var2.f24389b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = g90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = g90Var2.f24389b;
                String str3 = g90Var2.J;
                if (str3 == null) {
                    if (g90Var2.H) {
                        if (z10) {
                            i10 = R.string.QRCodeLinkHelpChannelDirect;
                        } else {
                            i10 = R.string.QRCodeLinkHelpChannel;
                        }
                    } else {
                        i10 = R.string.QRCodeLinkHelpGroup;
                    }
                    str3 = LocaleController.getString(i10);
                }
                d90 d90Var = new d90(g90Var2, context, string, str2, str3);
                g90Var2.E = d90Var;
                d90Var.m(R.raw.qr_code_logo);
                g90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = g90Var2.f24394s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                g90 g90Var3 = this.f30805b;
                org.telegram.ui.ActionBar.m1 m1Var3 = g90Var3.f24394s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = g90Var3.f24390c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new y80(g90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18647a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
