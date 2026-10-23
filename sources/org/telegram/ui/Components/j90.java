package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j90 implements View.OnClickListener {
    public final int f27474a;
    public final q90 f27475b;

    public j90(q90 q90Var, int i10) {
        this.f27474a = i10;
        this.f27475b = q90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f27474a) {
            case 0:
                this.f27475b.f29505r.i();
                return;
            case 1:
                q90 q90Var = this.f27475b;
                org.telegram.ui.ActionBar.m1 m1Var = q90Var.f29506s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                q90Var.f29505r.c();
                return;
            case 2:
                q90 q90Var2 = this.f27475b;
                String str = q90Var2.f29501b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = q90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = q90Var2.f29501b;
                String str3 = q90Var2.J;
                if (str3 == null) {
                    if (q90Var2.H) {
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
                n90 n90Var = new n90(q90Var2, context, string, str2, str3);
                q90Var2.E = n90Var;
                n90Var.n(R.raw.qr_code_logo);
                q90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = q90Var2.f29506s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                q90 q90Var3 = this.f27475b;
                org.telegram.ui.ActionBar.m1 m1Var3 = q90Var3.f29506s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = q90Var3.f29502c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new h90(q90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20609a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
