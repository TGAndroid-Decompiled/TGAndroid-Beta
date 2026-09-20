package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w80 implements View.OnClickListener {
    public final int f29978a;
    public final d90 f29979b;

    public w80(d90 d90Var, int i10) {
        this.f29978a = i10;
        this.f29979b = d90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f29978a) {
            case 0:
                this.f29979b.f23537r.h();
                return;
            case 1:
                d90 d90Var = this.f29979b;
                org.telegram.ui.ActionBar.n1 n1Var = d90Var.f23538s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                d90Var.f23537r.c();
                return;
            case 2:
                d90 d90Var2 = this.f29979b;
                String str = d90Var2.f23533b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = d90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = d90Var2.f23533b;
                String str3 = d90Var2.J;
                if (str3 == null) {
                    if (d90Var2.H) {
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
                a90 a90Var = new a90(d90Var2, context, string, str2, str3);
                d90Var2.E = a90Var;
                a90Var.m(R.raw.qr_code_logo);
                d90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = d90Var2.f23538s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                d90 d90Var3 = this.f29979b;
                org.telegram.ui.ActionBar.n1 n1Var3 = d90Var3.f23538s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = d90Var3.f23534c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new v80(d90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18654a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19333q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
