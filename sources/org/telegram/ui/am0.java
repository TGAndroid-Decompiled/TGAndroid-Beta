package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class am0 implements View.OnClickListener {
    public final int f34478a;
    public final pn0 f34479b;

    public am0(pn0 pn0Var, int i10) {
        this.f34478a = i10;
        this.f34479b = pn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34478a) {
            case 0:
                pn0 pn0Var = this.f34479b;
                pn0Var.S0 = 2;
                pn0Var.D1();
                return;
            case 1:
                this.f34479b.d1();
                return;
            case 2:
                pn0 pn0Var2 = this.f34479b;
                pn0Var2.S0 = 3;
                pn0Var2.D1();
                return;
            case 3:
                pn0 pn0Var3 = this.f34479b;
                pn0Var3.S0 = 1;
                pn0Var3.D1();
                return;
            case 4:
                pn0 pn0Var4 = this.f34479b;
                pn0Var4.S0 = 4;
                pn0Var4.D1();
                return;
            case 5:
                pn0.e0(this.f34479b);
                return;
            case 6:
                pn0 pn0Var5 = this.f34479b;
                pn0Var5.f39562f = true;
                pn0Var5.L.callOnClick();
                pn0Var5.f39562f = false;
                return;
            case 7:
                pn0 pn0Var6 = this.f34479b;
                pn0Var6.S0 = 0;
                pn0Var6.D1();
                return;
            case 8:
                pn0 pn0Var7 = this.f34479b;
                pn0Var7.S0 = 4;
                pn0Var7.D1();
                return;
            case 9:
                this.f34479b.d1();
                return;
            case 10:
                pn0.b0(this.f34479b);
                return;
            case 11:
                pn0.c0(this.f34479b);
                return;
            case 12:
                this.f34479b.C1();
                return;
            case 13:
                pn0 pn0Var8 = this.f34479b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var8.getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cm0(pn0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                pn0Var8.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
                    return;
                }
                return;
            case 14:
                this.f34479b.C1();
                return;
            case 15:
                pn0.V(this.f34479b);
                return;
            default:
                pn0 pn0Var9 = this.f34479b;
                pn0Var9.f39562f = true;
                pn0Var9.L.callOnClick();
                pn0Var9.f39562f = false;
                return;
        }
    }
}
