package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q90 implements View.OnClickListener {
    public final int f30115a;
    public final x90 f30116b;

    public q90(x90 x90Var, int i10) {
        this.f30115a = i10;
        this.f30116b = x90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30115a) {
            case 0:
                this.f30116b.f32786r.i();
                return;
            case 1:
                x90 x90Var = this.f30116b;
                org.telegram.ui.ActionBar.n1 n1Var = x90Var.f32787s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                x90Var.f32786r.a();
                return;
            case 2:
                x90 x90Var2 = this.f30116b;
                String str = x90Var2.f32781b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = x90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = x90Var2.f32781b;
                String str3 = x90Var2.J;
                if (str3 == null) {
                    if (x90Var2.H) {
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
                u90 u90Var = new u90(x90Var2, context, string, str2, str3);
                x90Var2.E = u90Var;
                u90Var.o(R.raw.qr_code_logo);
                x90Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = x90Var2.f32787s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                x90 x90Var3 = this.f30116b;
                org.telegram.ui.ActionBar.n1 n1Var3 = x90Var3.f32787s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = x90Var3.f32782c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p90(x90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20374a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
