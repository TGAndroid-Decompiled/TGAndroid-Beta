package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class am0 implements View.OnClickListener {
    public final int f31932a;
    public final qn0 f31933b;

    public am0(qn0 qn0Var, int i10) {
        this.f31932a = i10;
        this.f31933b = qn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31932a) {
            case 0:
                qn0 qn0Var = this.f31933b;
                qn0Var.S0 = 2;
                qn0Var.D1();
                return;
            case 1:
                this.f31933b.d1();
                return;
            case 2:
                qn0 qn0Var2 = this.f31933b;
                qn0Var2.S0 = 3;
                qn0Var2.D1();
                return;
            case 3:
                qn0 qn0Var3 = this.f31933b;
                qn0Var3.S0 = 1;
                qn0Var3.D1();
                return;
            case 4:
                qn0 qn0Var4 = this.f31933b;
                qn0Var4.S0 = 4;
                qn0Var4.D1();
                return;
            case 5:
                qn0.e0(this.f31933b);
                return;
            case 6:
                qn0 qn0Var5 = this.f31933b;
                qn0Var5.f36960f = true;
                qn0Var5.L.callOnClick();
                qn0Var5.f36960f = false;
                return;
            case 7:
                qn0 qn0Var6 = this.f31933b;
                qn0Var6.S0 = 0;
                qn0Var6.D1();
                return;
            case 8:
                qn0 qn0Var7 = this.f31933b;
                qn0Var7.S0 = 4;
                qn0Var7.D1();
                return;
            case 9:
                this.f31933b.d1();
                return;
            case 10:
                qn0.b0(this.f31933b);
                return;
            case 11:
                qn0.c0(this.f31933b);
                return;
            case 12:
                this.f31933b.C1();
                return;
            case 13:
                qn0 qn0Var8 = this.f31933b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qn0Var8.getParentActivity());
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cm0(qn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                qn0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                    return;
                }
                return;
            case 14:
                this.f31933b.C1();
                return;
            case 15:
                qn0.V(this.f31933b);
                return;
            default:
                qn0 qn0Var9 = this.f31933b;
                qn0Var9.f36960f = true;
                qn0Var9.L.callOnClick();
                qn0Var9.f36960f = false;
                return;
        }
    }
}
