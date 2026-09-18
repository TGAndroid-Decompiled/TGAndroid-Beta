package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x80 implements View.OnClickListener {
    public final int f30278a;
    public final e90 f30279b;

    public x80(e90 e90Var, int i10) {
        this.f30278a = i10;
        this.f30279b = e90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30278a) {
            case 0:
                this.f30279b.f23828r.j();
                return;
            case 1:
                e90 e90Var = this.f30279b;
                org.telegram.ui.ActionBar.n1 n1Var = e90Var.f23829s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                e90Var.f23828r.c();
                return;
            case 2:
                e90 e90Var2 = this.f30279b;
                String str = e90Var2.f23824b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = e90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = e90Var2.f23824b;
                String str3 = e90Var2.J;
                if (str3 == null) {
                    if (e90Var2.H) {
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
                b90 b90Var = new b90(e90Var2, context, string, str2, str3);
                e90Var2.E = b90Var;
                b90Var.m(R.raw.qr_code_logo);
                e90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = e90Var2.f23829s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                e90 e90Var3 = this.f30279b;
                org.telegram.ui.ActionBar.n1 n1Var3 = e90Var3.f23829s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = e90Var3.f23825c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new w80(e90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18622a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
