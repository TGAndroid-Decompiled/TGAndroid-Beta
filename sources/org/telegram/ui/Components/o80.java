package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o80 implements View.OnClickListener {
    public final int f26673a;
    public final v80 f26674b;

    public o80(v80 v80Var, int i10) {
        this.f26673a = i10;
        this.f26674b = v80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f26673a) {
            case 0:
                this.f26674b.f28652r.i();
                return;
            case 1:
                v80 v80Var = this.f26674b;
                org.telegram.ui.ActionBar.o1 o1Var = v80Var.f28653s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                v80Var.f28652r.a();
                return;
            case 2:
                v80 v80Var2 = this.f26674b;
                String str = v80Var2.f28648b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = v80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = v80Var2.f28648b;
                String str3 = v80Var2.J;
                if (str3 == null) {
                    if (v80Var2.H) {
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
                s80 s80Var = new s80(v80Var2, context, string, str2, str3);
                v80Var2.E = s80Var;
                s80Var.m(R.raw.qr_code_logo);
                v80Var2.E.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = v80Var2.f28653s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            default:
                v80 v80Var3 = this.f26674b;
                org.telegram.ui.ActionBar.o1 o1Var3 = v80Var3.f28653s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = v80Var3.f28649c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new n80(v80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18446a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
