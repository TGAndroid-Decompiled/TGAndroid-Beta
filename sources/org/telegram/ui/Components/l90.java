package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l90 implements View.OnClickListener {
    public final int f30198a;
    public final s90 f30199b;

    public l90(s90 s90Var, int i10) {
        this.f30198a = i10;
        this.f30199b = s90Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f30198a) {
            case 0:
                this.f30199b.f32525r.e();
                return;
            case 1:
                s90 s90Var = this.f30199b;
                org.telegram.ui.ActionBar.o1 o1Var = s90Var.f32526s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                s90Var.f32525r.a();
                return;
            case 2:
                s90 s90Var2 = this.f30199b;
                String str = s90Var2.f32521b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = s90Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = s90Var2.f32521b;
                String str3 = s90Var2.J;
                if (str3 == null) {
                    if (s90Var2.H) {
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
                p90 p90Var = new p90(s90Var2, context, string, str2, str3);
                s90Var2.E = p90Var;
                p90Var.m(R.raw.qr_code_logo);
                s90Var2.E.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = s90Var2.f32526s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            default:
                s90 s90Var3 = this.f30199b;
                org.telegram.ui.ActionBar.o1 o1Var3 = s90Var3.f32526s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.r2 r2Var = s90Var3.f32522c;
                if (r2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity());
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new k90(s90Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f22369a.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
