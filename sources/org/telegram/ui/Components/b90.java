package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b90 implements View.OnClickListener {
    public final int f22899a;
    public final i90 f22900b;

    public b90(i90 i90Var, int i10) {
        this.f22899a = i10;
        this.f22900b = i90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f22899a) {
            case 0:
                this.f22900b.f25042r.j();
                return;
            case 1:
                i90 i90Var = this.f22900b;
                org.telegram.ui.ActionBar.m1 m1Var = i90Var.f25043s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                i90Var.f25042r.c();
                return;
            case 2:
                i90 i90Var2 = this.f22900b;
                String str = i90Var2.f25038b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = i90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = i90Var2.f25038b;
                String str3 = i90Var2.J;
                if (str3 == null) {
                    if (i90Var2.H) {
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
                f90 f90Var = new f90(i90Var2, context, string, str2, str3);
                i90Var2.E = f90Var;
                f90Var.m(R.raw.qr_code_logo);
                i90Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = i90Var2.f25043s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                i90 i90Var3 = this.f22900b;
                org.telegram.ui.ActionBar.m1 m1Var3 = i90Var3.f25043s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = i90Var3.f25039c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a90(i90Var3, 1));
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
