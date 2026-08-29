package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k80 implements View.OnClickListener {
    public final int f29965a;
    public final r80 f29966b;

    public k80(r80 r80Var, int i10) {
        this.f29965a = i10;
        this.f29966b = r80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        switch (this.f29965a) {
            case 0:
                this.f29966b.f32237r.j();
                return;
            case 1:
                r80 r80Var = this.f29966b;
                org.telegram.ui.ActionBar.o1 o1Var = r80Var.f32238s;
                if (o1Var != null) {
                    o1Var.d(true);
                }
                r80Var.f32237r.a();
                return;
            case 2:
                r80 r80Var2 = this.f29966b;
                String str = r80Var2.f32232b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = r80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = r80Var2.f32232b;
                String str3 = r80Var2.F;
                if (str3 == null) {
                    if (r80Var2.D) {
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
                o80 o80Var = new o80(r80Var2, context, string, str2, str3);
                r80Var2.A = o80Var;
                o80Var.m(R.raw.qr_code_logo);
                r80Var2.A.show();
                org.telegram.ui.ActionBar.o1 o1Var2 = r80Var2.f32238s;
                if (o1Var2 != null) {
                    o1Var2.d(true);
                    return;
                }
                return;
            default:
                r80 r80Var3 = this.f29966b;
                org.telegram.ui.ActionBar.o1 o1Var3 = r80Var3.f32238s;
                if (o1Var3 != null) {
                    o1Var3.d(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = r80Var3.f32233c;
                if (o2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new j80(r80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f22714a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
        }
    }
}
