package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o80 implements View.OnClickListener {
    public final int f29028a;
    public final w80 f29029b;

    public o80(w80 w80Var, int i10) {
        this.f29028a = i10;
        this.f29029b = w80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f29028a) {
            case 0:
                this.f29029b.f32232r.d();
                return;
            case 1:
                w80 w80Var = this.f29029b;
                org.telegram.ui.ActionBar.n1 n1Var = w80Var.f32233s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                w80Var.f32232r.b();
                return;
            case 2:
                w80 w80Var2 = this.f29029b;
                String str = w80Var2.f32227b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = w80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = w80Var2.f32227b;
                String str3 = w80Var2.J;
                if (str3 == null) {
                    if (w80Var2.H) {
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
                t80 t80Var = new t80(w80Var2, context, string, str2, str3);
                w80Var2.E = t80Var;
                t80Var.m(R.raw.qr_code_logo);
                w80Var2.E.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = w80Var2.f32233s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                    return;
                }
                return;
            default:
                w80 w80Var3 = this.f29029b;
                org.telegram.ui.ActionBar.n1 n1Var3 = w80Var3.f32233s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = w80Var3.f32228c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new n80(w80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f20225a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
