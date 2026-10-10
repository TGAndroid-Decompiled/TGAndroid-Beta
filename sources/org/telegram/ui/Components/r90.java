package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r90 implements View.OnClickListener {
    public final int f30432a;
    public final y90 f30433b;

    public r90(y90 y90Var, int i10) {
        this.f30432a = i10;
        this.f30433b = y90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30432a) {
            case 0:
                this.f30433b.f33152r.i();
                return;
            case 1:
                y90 y90Var = this.f30433b;
                org.telegram.ui.ActionBar.n1 n1Var = y90Var.f33153s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                y90Var.f33152r.a();
                return;
            case 2:
                y90 y90Var2 = this.f30433b;
                String str = y90Var2.f33147b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = y90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = y90Var2.f33147b;
                String str3 = y90Var2.J;
                if (str3 == null) {
                    if (y90Var2.H) {
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
                v90 v90Var = new v90(y90Var2, context, string, str2, str3);
                y90Var2.E = v90Var;
                v90Var.o(R.raw.qr_code_logo);
                y90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = y90Var2.f33153s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                y90 y90Var3 = this.f30433b;
                org.telegram.ui.ActionBar.n1 n1Var3 = y90Var3.f33153s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = y90Var3.f33148c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new q90(y90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20378a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
