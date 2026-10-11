package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q90 implements View.OnClickListener {
    public final int f30202a;
    public final x90 f30203b;

    public q90(x90 x90Var, int i10) {
        this.f30202a = i10;
        this.f30203b = x90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30202a) {
            case 0:
                this.f30203b.f32918r.i();
                return;
            case 1:
                x90 x90Var = this.f30203b;
                org.telegram.ui.ActionBar.m1 m1Var = x90Var.f32919s;
                if (m1Var != null) {
                    m1Var.d(true);
                }
                x90Var.f32918r.a();
                return;
            case 2:
                x90 x90Var2 = this.f30203b;
                String str = x90Var2.f32913b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = x90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = x90Var2.f32913b;
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
                org.telegram.ui.ActionBar.m1 m1Var2 = x90Var2.f32919s;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                    return;
                }
                return;
            default:
                x90 x90Var3 = this.f30203b;
                org.telegram.ui.ActionBar.m1 m1Var3 = x90Var3.f32919s;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = x90Var3.f32914c;
                if (m2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new p90(x90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20404a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
