package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c90 implements View.OnClickListener {
    public final int f25274a;
    public final j90 f25275b;

    public c90(j90 j90Var, int i10) {
        this.f25274a = i10;
        this.f25275b = j90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f25274a) {
            case 0:
                this.f25275b.f27689r.h();
                return;
            case 1:
                j90 j90Var = this.f25275b;
                org.telegram.ui.ActionBar.n1 n1Var = j90Var.f27690s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                j90Var.f27689r.b();
                return;
            case 2:
                j90 j90Var2 = this.f25275b;
                String str = j90Var2.f27684b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = j90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = j90Var2.f27684b;
                String str3 = j90Var2.J;
                if (str3 == null) {
                    if (j90Var2.H) {
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
                g90 g90Var = new g90(j90Var2, context, string, str2, str3);
                j90Var2.E = g90Var;
                g90Var.m(R.raw.qr_code_logo);
                j90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = j90Var2.f27690s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                j90 j90Var3 = this.f25275b;
                org.telegram.ui.ActionBar.n1 n1Var3 = j90Var3.f27690s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = j90Var3.f27685c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new b90(j90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20367a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
