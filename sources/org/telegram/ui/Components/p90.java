package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p90 implements View.OnClickListener {
    public final int f28254a;
    public final w90 f28255b;

    public p90(w90 w90Var, int i10) {
        this.f28254a = i10;
        this.f28255b = w90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f28254a) {
            case 0:
                this.f28255b.f30831r.h();
                return;
            case 1:
                w90 w90Var = this.f28255b;
                org.telegram.ui.ActionBar.m1 m1Var = w90Var.f30832s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                w90Var.f30831r.c();
                return;
            case 2:
                w90 w90Var2 = this.f28255b;
                String str = w90Var2.f30827b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = w90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = w90Var2.f30827b;
                String str3 = w90Var2.J;
                if (str3 == null) {
                    if (w90Var2.H) {
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
                t90 t90Var = new t90(w90Var2, context, string, str2, str3);
                w90Var2.E = t90Var;
                t90Var.n(R.raw.qr_code_logo);
                w90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = w90Var2.f30832s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                w90 w90Var3 = this.f28255b;
                org.telegram.ui.ActionBar.m1 m1Var3 = w90Var3.f30832s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = w90Var3.f30828c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o90(w90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f19548a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
