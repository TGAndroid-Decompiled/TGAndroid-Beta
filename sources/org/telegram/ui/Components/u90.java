package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u90 implements View.OnClickListener {
    public final int f31109a;
    public final ba0 f31110b;

    public u90(ba0 ba0Var, int i10) {
        this.f31109a = i10;
        this.f31110b = ba0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f31109a) {
            case 0:
                this.f31110b.f24598r.i();
                return;
            case 1:
                ba0 ba0Var = this.f31110b;
                org.telegram.ui.ActionBar.m1 m1Var = ba0Var.f24599s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                ba0Var.f24598r.a();
                return;
            case 2:
                ba0 ba0Var2 = this.f31110b;
                String str = ba0Var2.f24593b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = ba0Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = ba0Var2.f24593b;
                String str3 = ba0Var2.J;
                if (str3 == null) {
                    if (ba0Var2.H) {
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
                y90 y90Var = new y90(ba0Var2, context, string, str2, str3);
                ba0Var2.E = y90Var;
                y90Var.o(R.raw.qr_code_logo);
                ba0Var2.E.show();
                org.telegram.ui.ActionBar.m1 m1Var2 = ba0Var2.f24599s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                ba0 ba0Var3 = this.f31110b;
                org.telegram.ui.ActionBar.m1 m1Var3 = ba0Var3.f24599s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = ba0Var3.f24594c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new t90(ba0Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20141a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
