package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ql0 implements View.OnClickListener {
    public final int f40569a;
    public final fn0 f40570b;

    public ql0(fn0 fn0Var, int i10) {
        this.f40569a = i10;
        this.f40570b = fn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40569a) {
            case 0:
                fn0 fn0Var = this.f40570b;
                fn0Var.P0 = 2;
                fn0Var.D1();
                return;
            case 1:
                this.f40570b.d1();
                return;
            case 2:
                fn0 fn0Var2 = this.f40570b;
                fn0Var2.P0 = 3;
                fn0Var2.D1();
                return;
            case 3:
                fn0 fn0Var3 = this.f40570b;
                fn0Var3.P0 = 1;
                fn0Var3.D1();
                return;
            case 4:
                fn0 fn0Var4 = this.f40570b;
                fn0Var4.P0 = 4;
                fn0Var4.D1();
                return;
            case 5:
                fn0.e0(this.f40570b);
                return;
            case 6:
                fn0 fn0Var5 = this.f40570b;
                fn0Var5.f36931f = true;
                fn0Var5.I.callOnClick();
                fn0Var5.f36931f = false;
                return;
            case 7:
                fn0 fn0Var6 = this.f40570b;
                fn0Var6.P0 = 0;
                fn0Var6.D1();
                return;
            case 8:
                fn0 fn0Var7 = this.f40570b;
                fn0Var7.P0 = 4;
                fn0Var7.D1();
                return;
            case 9:
                this.f40570b.d1();
                return;
            case 10:
                fn0.b0(this.f40570b);
                return;
            case 11:
                fn0.c0(this.f40570b);
                return;
            case 12:
                this.f40570b.C1();
                return;
            case 13:
                fn0 fn0Var8 = this.f40570b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var8.getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sl0(fn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                fn0Var8.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                    return;
                }
                return;
            case 14:
                this.f40570b.C1();
                return;
            case 15:
                fn0.V(this.f40570b);
                return;
            default:
                fn0 fn0Var9 = this.f40570b;
                fn0Var9.f36931f = true;
                fn0Var9.I.callOnClick();
                fn0Var9.f36931f = false;
                return;
        }
    }
}
