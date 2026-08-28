package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x70 implements View.OnClickListener {
    public final int f34596a;
    public final e80 f34597b;

    public x70(e80 e80Var, int i9) {
        this.f34596a = i9;
        this.f34597b = e80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i9;
        switch (this.f34596a) {
            case 0:
                this.f34597b.f27973r.j();
                return;
            case 1:
                e80 e80Var = this.f34597b;
                org.telegram.ui.ActionBar.o1 o1Var = e80Var.f27974s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                e80Var.f27973r.b();
                return;
            case 2:
                e80 e80Var2 = this.f34597b;
                String str = e80Var2.f27968b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = e80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = e80Var2.f27968b;
                String str3 = e80Var2.F;
                if (str3 == null) {
                    if (e80Var2.D) {
                        if (z10) {
                            i9 = R.string.QRCodeLinkHelpChannelDirect;
                        } else {
                            i9 = R.string.QRCodeLinkHelpChannel;
                        }
                    } else {
                        i9 = R.string.QRCodeLinkHelpGroup;
                    }
                    str3 = LocaleController.getString(i9);
                }
                b80 b80Var = new b80(e80Var2, context, string, str2, str3);
                e80Var2.A = b80Var;
                b80Var.m(R.raw.qr_code_logo);
                e80Var2.A.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = e80Var2.f27974s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            default:
                e80 e80Var3 = this.f34597b;
                org.telegram.ui.ActionBar.o1 o1Var3 = e80Var3.f27974s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = e80Var3.f27969c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new w70(e80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f22702a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
