package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k90 implements View.OnClickListener {
    public final int f27957a;
    public final r90 f27958b;

    public k90(r90 r90Var, int i10) {
        this.f27957a = i10;
        this.f27958b = r90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f27957a) {
            case 0:
                this.f27958b.f30128r.j();
                return;
            case 1:
                r90 r90Var = this.f27958b;
                org.telegram.ui.ActionBar.m1 m1Var = r90Var.f30129s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                r90Var.f30128r.a();
                return;
            case 2:
                r90 r90Var2 = this.f27958b;
                String str = r90Var2.f30124b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = r90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = r90Var2.f30124b;
                String str3 = r90Var2.J;
                if (str3 == null) {
                    if (r90Var2.H) {
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
                o90 o90Var = new o90(r90Var2, context, string, str2, str3);
                r90Var2.E = o90Var;
                o90Var.m(R.raw.qr_code_logo);
                r90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = r90Var2.f30129s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                r90 r90Var3 = this.f27958b;
                org.telegram.ui.ActionBar.m1 m1Var3 = r90Var3.f30129s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = r90Var3.f30125c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new i90(r90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20678a.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
