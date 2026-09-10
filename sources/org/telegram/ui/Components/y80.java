package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y80 implements View.OnClickListener {
    public final int f29271a;
    public final f90 f29272b;

    public y80(f90 f90Var, int i10) {
        this.f29271a = i10;
        this.f29272b = f90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f29271a) {
            case 0:
                this.f29272b.f22952r.i();
                return;
            case 1:
                f90 f90Var = this.f29272b;
                org.telegram.ui.ActionBar.p1 p1Var = f90Var.f22953s;
                if (p1Var != null) {
                    p1Var.d(true);
                }
                f90Var.f22952r.c();
                return;
            case 2:
                f90 f90Var2 = this.f29272b;
                String str = f90Var2.f22948b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = f90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = f90Var2.f22948b;
                String str3 = f90Var2.J;
                if (str3 == null) {
                    if (f90Var2.H) {
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
                c90 c90Var = new c90(f90Var2, context, string, str2, str3);
                f90Var2.E = c90Var;
                c90Var.m(R.raw.qr_code_logo);
                f90Var2.E.show();
                org.telegram.ui.ActionBar.p1 p1Var2 = f90Var2.f22953s;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                    return;
                }
                return;
            default:
                f90 f90Var3 = this.f29272b;
                org.telegram.ui.ActionBar.p1 p1Var3 = f90Var3.f22953s;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = f90Var3.f22949c;
                if (p2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x80(f90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f17528a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
