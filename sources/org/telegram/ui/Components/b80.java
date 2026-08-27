package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class b80 implements View.OnClickListener {

    public final int f27045a;

    public final i80 f27046b;

    public b80(i80 i80Var, int i10) {
        this.f27045a = i10;
        this.f27046b = i80Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27045a) {
            case 0:
                this.f27046b.f29275r.g();
                break;
            case 1:
                i80 i80Var = this.f27046b;
                org.telegram.ui.ActionBar.n1 n1Var = i80Var.f29276s;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                i80Var.f29275r.b();
                break;
            case 2:
                i80 i80Var2 = this.f27046b;
                String str = i80Var2.f29270b;
                boolean z10 = str != null && str.endsWith("?direct");
                Context context = i80Var2.getContext();
                String string = LocaleController.getString(R.string.InviteByQRCode);
                String str2 = i80Var2.f29270b;
                String string2 = i80Var2.F;
                if (string2 == null) {
                    string2 = LocaleController.getString(i80Var2.D ? z10 ? R.string.QRCodeLinkHelpChannelDirect : R.string.QRCodeLinkHelpChannel : R.string.QRCodeLinkHelpGroup);
                }
                f80 f80Var = new f80(i80Var2, context, string, str2, string2);
                i80Var2.A = f80Var;
                f80Var.m(R.raw.qr_code_logo);
                i80Var2.A.show();
                org.telegram.ui.ActionBar.n1 n1Var2 = i80Var2.f29276s;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                }
                break;
            default:
                i80 i80Var3 = this.f27046b;
                org.telegram.ui.ActionBar.n1 n1Var3 = i80Var3.f29276s;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                org.telegram.ui.ActionBar.n2 n2Var = i80Var3.f29271c;
                if (n2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a80(i80Var3, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) alertDialog$Builder.f22702a.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    }
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
