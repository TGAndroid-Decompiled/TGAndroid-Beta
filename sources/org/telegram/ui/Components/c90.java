package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c90 implements View.OnClickListener {
    public final int f23217a;
    public final j90 f23218b;

    public c90(j90 j90Var, int i10) {
        this.f23217a = i10;
        this.f23218b = j90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f23217a) {
            case 0:
                this.f23218b.f25375r.j();
                return;
            case 1:
                j90 j90Var = this.f23218b;
                org.telegram.ui.ActionBar.m1 m1Var = j90Var.f25376s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                j90Var.f25375r.c();
                return;
            case 2:
                j90 j90Var2 = this.f23218b;
                String str = j90Var2.f25371b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = j90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = j90Var2.f25371b;
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
                org.telegram.ui.ActionBar.m1 m1Var2 = j90Var2.f25376s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                j90 j90Var3 = this.f23218b;
                org.telegram.ui.ActionBar.m1 m1Var3 = j90Var3.f25376s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = j90Var3.f25372c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new b90(j90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18678a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
