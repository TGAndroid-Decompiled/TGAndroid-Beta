package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b90 implements View.OnClickListener {
    public final int f22936a;
    public final i90 f22937b;

    public b90(i90 i90Var, int i10) {
        this.f22936a = i10;
        this.f22937b = i90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f22936a) {
            case 0:
                this.f22937b.f25060r.i();
                return;
            case 1:
                i90 i90Var = this.f22937b;
                org.telegram.ui.ActionBar.o1 o1Var = i90Var.f25061s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                i90Var.f25060r.c();
                return;
            case 2:
                i90 i90Var2 = this.f22937b;
                String str = i90Var2.f25056b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = i90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = i90Var2.f25056b;
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
                org.telegram.ui.ActionBar.o1 o1Var2 = i90Var2.f25061s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            default:
                i90 i90Var3 = this.f22937b;
                org.telegram.ui.ActionBar.o1 o1Var3 = i90Var3.f25061s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = i90Var3.f25057c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a90(i90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f18655a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
