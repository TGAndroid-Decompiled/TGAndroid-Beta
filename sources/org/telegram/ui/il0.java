package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class il0 implements View.OnClickListener {
    public final int f39208a;
    public final wm0 f39209b;

    public il0(wm0 wm0Var, int i9) {
        this.f39208a = i9;
        this.f39209b = wm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39208a) {
            case 0:
                wm0 wm0Var = this.f39209b;
                wm0Var.O0 = 2;
                wm0Var.D1();
                return;
            case 1:
                this.f39209b.d1();
                return;
            case 2:
                wm0 wm0Var2 = this.f39209b;
                wm0Var2.O0 = 3;
                wm0Var2.D1();
                return;
            case 3:
                wm0 wm0Var3 = this.f39209b;
                wm0Var3.O0 = 1;
                wm0Var3.D1();
                return;
            case 4:
                wm0 wm0Var4 = this.f39209b;
                wm0Var4.O0 = 4;
                wm0Var4.D1();
                return;
            case 5:
                wm0.d0(this.f39209b);
                return;
            case 6:
                wm0 wm0Var5 = this.f39209b;
                wm0Var5.f44162f = true;
                wm0Var5.H.callOnClick();
                wm0Var5.f44162f = false;
                return;
            case 7:
                wm0 wm0Var6 = this.f39209b;
                wm0Var6.O0 = 0;
                wm0Var6.D1();
                return;
            case 8:
                wm0 wm0Var7 = this.f39209b;
                wm0Var7.O0 = 4;
                wm0Var7.D1();
                return;
            case 9:
                this.f39209b.d1();
                return;
            case 10:
                wm0.a0(this.f39209b);
                return;
            case 11:
                wm0.b0(this.f39209b);
                return;
            case 12:
                this.f39209b.C1();
                return;
            case 13:
                wm0 wm0Var8 = this.f39209b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var8.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(wm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                wm0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    return;
                }
                return;
            case 14:
                this.f39209b.C1();
                return;
            case 15:
                wm0.U(this.f39209b);
                return;
            default:
                wm0 wm0Var9 = this.f39209b;
                wm0Var9.f44162f = true;
                wm0Var9.H.callOnClick();
                wm0Var9.f44162f = false;
                return;
        }
    }
}
