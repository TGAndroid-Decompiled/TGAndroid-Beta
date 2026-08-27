package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class il0 implements View.OnClickListener {

    public final int f39128a;

    public final xm0 f39129b;

    public il0(xm0 xm0Var, int i10) {
        this.f39128a = i10;
        this.f39129b = xm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39128a) {
            case 0:
                xm0 xm0Var = this.f39129b;
                xm0Var.O0 = 2;
                xm0Var.D1();
                break;
            case 1:
                this.f39129b.d1();
                break;
            case 2:
                xm0 xm0Var2 = this.f39129b;
                xm0Var2.O0 = 3;
                xm0Var2.D1();
                break;
            case 3:
                xm0 xm0Var3 = this.f39129b;
                xm0Var3.O0 = 1;
                xm0Var3.D1();
                break;
            case 4:
                xm0 xm0Var4 = this.f39129b;
                xm0Var4.O0 = 4;
                xm0Var4.D1();
                break;
            case 5:
                xm0.e0(this.f39129b);
                break;
            case 6:
                xm0 xm0Var5 = this.f39129b;
                xm0Var5.f44493f = true;
                xm0Var5.H.callOnClick();
                xm0Var5.f44493f = false;
                break;
            case 7:
                xm0 xm0Var6 = this.f39129b;
                xm0Var6.O0 = 0;
                xm0Var6.D1();
                break;
            case 8:
                xm0 xm0Var7 = this.f39129b;
                xm0Var7.O0 = 4;
                xm0Var7.D1();
                break;
            case 9:
                this.f39129b.d1();
                break;
            case 10:
                xm0.b0(this.f39129b);
                break;
            case 11:
                xm0.c0(this.f39129b);
                break;
            case 12:
                this.f39129b.C1();
                break;
            case 13:
                xm0 xm0Var8 = this.f39129b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var8.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(xm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                xm0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
                break;
            case 14:
                this.f39129b.C1();
                break;
            case 15:
                xm0.V(this.f39129b);
                break;
            default:
                xm0 xm0Var9 = this.f39129b;
                xm0Var9.f44493f = true;
                xm0Var9.H.callOnClick();
                xm0Var9.f44493f = false;
                break;
        }
    }
}
