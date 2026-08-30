package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ol0 implements View.OnClickListener {
    public final int f36934a;
    public final dn0 f36935b;

    public ol0(dn0 dn0Var, int i10) {
        this.f36934a = i10;
        this.f36935b = dn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36934a) {
            case 0:
                dn0 dn0Var = this.f36935b;
                dn0Var.P0 = 2;
                dn0Var.D1();
                return;
            case 1:
                this.f36935b.d1();
                return;
            case 2:
                dn0 dn0Var2 = this.f36935b;
                dn0Var2.P0 = 3;
                dn0Var2.D1();
                return;
            case 3:
                dn0 dn0Var3 = this.f36935b;
                dn0Var3.P0 = 1;
                dn0Var3.D1();
                return;
            case 4:
                dn0 dn0Var4 = this.f36935b;
                dn0Var4.P0 = 4;
                dn0Var4.D1();
                return;
            case 5:
                dn0.e0(this.f36935b);
                return;
            case 6:
                dn0 dn0Var5 = this.f36935b;
                dn0Var5.f33695f = true;
                dn0Var5.I.callOnClick();
                dn0Var5.f33695f = false;
                return;
            case 7:
                dn0 dn0Var6 = this.f36935b;
                dn0Var6.P0 = 0;
                dn0Var6.D1();
                return;
            case 8:
                dn0 dn0Var7 = this.f36935b;
                dn0Var7.P0 = 4;
                dn0Var7.D1();
                return;
            case 9:
                this.f36935b.d1();
                return;
            case 10:
                dn0.b0(this.f36935b);
                return;
            case 11:
                dn0.c0(this.f36935b);
                return;
            case 12:
                this.f36935b.C1();
                return;
            case 13:
                dn0 dn0Var8 = this.f36935b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dn0Var8.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ql0(dn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                dn0Var8.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                    return;
                }
                return;
            case 14:
                this.f36935b.C1();
                return;
            case 15:
                dn0.V(this.f36935b);
                return;
            default:
                dn0 dn0Var9 = this.f36935b;
                dn0Var9.f33695f = true;
                dn0Var9.I.callOnClick();
                dn0Var9.f33695f = false;
                return;
        }
    }
}
