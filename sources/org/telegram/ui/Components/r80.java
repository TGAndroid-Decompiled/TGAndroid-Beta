package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r80 implements View.OnClickListener {
    public final int f30691a;
    public final y80 f30692b;

    public r80(y80 y80Var, int i10) {
        this.f30691a = i10;
        this.f30692b = y80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10;
        switch (this.f30691a) {
            case 0:
                this.f30692b.f33430r.e();
                return;
            case 1:
                y80 y80Var = this.f30692b;
                org.telegram.ui.ActionBar.p1 p1Var = y80Var.f33431s;
                if (p1Var != null) {
                    p1Var.d(true);
                }
                y80Var.f33430r.a();
                return;
            case 2:
                y80 y80Var2 = this.f30692b;
                String str = y80Var2.f33425b;
                if (str != null && str.endsWith("?direct")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Context context = y80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = y80Var2.f33425b;
                String str3 = y80Var2.G;
                if (str3 == null) {
                    if (y80Var2.E) {
                        if (z4) {
                            i10 = R.string.QRCodeLinkHelpChannelDirect;
                        } else {
                            i10 = R.string.QRCodeLinkHelpChannel;
                        }
                    } else {
                        i10 = R.string.QRCodeLinkHelpGroup;
                    }
                    str3 = LocaleController.getString(i10);
                }
                v80 v80Var = new v80(y80Var2, context, string, str2, str3);
                y80Var2.B = v80Var;
                v80Var.m(R.raw.qr_code_logo);
                y80Var2.B.show();
                org.telegram.ui.ActionBar.p1 p1Var2 = y80Var2.f33431s;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    return;
                }
                return;
            default:
                y80 y80Var3 = this.f30692b;
                org.telegram.ui.ActionBar.p1 p1Var3 = y80Var3.f33431s;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = y80Var3.f33426c;
                if (p2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new q80(y80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f21168a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
