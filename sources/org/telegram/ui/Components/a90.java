package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a90 implements View.OnClickListener {
    public final int f22574a;
    public final h90 f22575b;

    public a90(h90 h90Var, int i10) {
        this.f22574a = i10;
        this.f22575b = h90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f22574a) {
            case 0:
                this.f22575b.f24731r.j();
                return;
            case 1:
                h90 h90Var = this.f22575b;
                org.telegram.ui.ActionBar.m1 m1Var = h90Var.f24732s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                h90Var.f24731r.c();
                return;
            case 2:
                h90 h90Var2 = this.f22575b;
                String str = h90Var2.f24727b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = h90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = h90Var2.f24727b;
                String str3 = h90Var2.J;
                if (str3 == null) {
                    if (h90Var2.H) {
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
                e90 e90Var = new e90(h90Var2, context, string, str2, str3);
                h90Var2.E = e90Var;
                e90Var.m(R.raw.qr_code_logo);
                h90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = h90Var2.f24732s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                h90 h90Var3 = this.f22575b;
                org.telegram.ui.ActionBar.m1 m1Var3 = h90Var3.f24732s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = h90Var3.f24728c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new z80(h90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18661a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
