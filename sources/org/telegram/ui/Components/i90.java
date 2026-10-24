package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class i90 implements View.OnClickListener {
    public final int f27372a;
    public final p90 f27373b;

    public i90(p90 p90Var, int i10) {
        this.f27372a = i10;
        this.f27373b = p90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f27372a) {
            case 0:
                this.f27373b.f29521r.j();
                return;
            case 1:
                p90 p90Var = this.f27373b;
                org.telegram.ui.ActionBar.m1 m1Var = p90Var.f29522s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                p90Var.f29521r.a();
                return;
            case 2:
                p90 p90Var2 = this.f27373b;
                String str = p90Var2.f29517b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = p90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = p90Var2.f29517b;
                String str3 = p90Var2.J;
                if (str3 == null) {
                    if (p90Var2.H) {
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
                m90 m90Var = new m90(p90Var2, context, string, str2, str3);
                p90Var2.E = m90Var;
                m90Var.m(R.raw.qr_code_logo);
                p90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = p90Var2.f29522s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                p90 p90Var3 = this.f27373b;
                org.telegram.ui.ActionBar.m1 m1Var3 = p90Var3.f29522s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = p90Var3.f29518c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new g90(p90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20679a.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
