package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q80 implements View.OnClickListener {
    public final int f28084a;
    public final x80 f28085b;

    public q80(x80 x80Var, int i10) {
        this.f28084a = i10;
        this.f28085b = x80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        int i10;
        switch (this.f28084a) {
            case 0:
                this.f28085b.f30608r.e();
                return;
            case 1:
                x80 x80Var = this.f28085b;
                org.telegram.ui.ActionBar.p1 p1Var = x80Var.f30609s;
                if (p1Var != null) {
                    p1Var.d(true);
                }
                x80Var.f30608r.a();
                return;
            case 2:
                x80 x80Var2 = this.f28085b;
                String str = x80Var2.f30604b;
                if (str != null && str.endsWith("?direct")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Context context = x80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = x80Var2.f30604b;
                String str3 = x80Var2.G;
                if (str3 == null) {
                    if (x80Var2.E) {
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
                u80 u80Var = new u80(x80Var2, context, string, str2, str3);
                x80Var2.B = u80Var;
                u80Var.m(R.raw.qr_code_logo);
                x80Var2.B.show();
                org.telegram.ui.ActionBar.p1 p1Var2 = x80Var2.f30609s;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    return;
                }
                return;
            default:
                x80 x80Var3 = this.f28085b;
                org.telegram.ui.ActionBar.p1 p1Var3 = x80Var3.f30609s;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = x80Var3.f30605c;
                if (p2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p80(x80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f19503a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
