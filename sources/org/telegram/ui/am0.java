package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class am0 implements View.OnClickListener {
    public final int f35902a;
    public final pn0 f35903b;

    public am0(pn0 pn0Var, int i10) {
        this.f35902a = i10;
        this.f35903b = pn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35902a) {
            case 0:
                pn0 pn0Var = this.f35903b;
                pn0Var.S0 = 2;
                pn0Var.C1();
                return;
            case 1:
                this.f35903b.c1();
                return;
            case 2:
                pn0 pn0Var2 = this.f35903b;
                pn0Var2.S0 = 3;
                pn0Var2.C1();
                return;
            case 3:
                pn0 pn0Var3 = this.f35903b;
                pn0Var3.S0 = 1;
                pn0Var3.C1();
                return;
            case 4:
                pn0 pn0Var4 = this.f35903b;
                pn0Var4.S0 = 4;
                pn0Var4.C1();
                return;
            case 5:
                pn0 pn0Var5 = this.f35903b;
                if (pn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    pn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                y9 y9Var = new y9(0);
                y9Var.M = new mm0(pn0Var5);
                pn0Var5.presentFragment(y9Var);
                return;
            case 6:
                pn0 pn0Var6 = this.f35903b;
                pn0Var6.f41013f = true;
                pn0Var6.L.callOnClick();
                pn0Var6.f41013f = false;
                return;
            case 7:
                pn0 pn0Var7 = this.f35903b;
                pn0Var7.S0 = 0;
                pn0Var7.C1();
                return;
            case 8:
                pn0 pn0Var8 = this.f35903b;
                pn0Var8.S0 = 4;
                pn0Var8.C1();
                return;
            case 9:
                this.f35903b.c1();
                return;
            case 10:
                pn0.b0(this.f35903b);
                return;
            case 11:
                pn0.c0(this.f35903b);
                return;
            case 12:
                this.f35903b.B1();
                return;
            case 13:
                pn0 pn0Var9 = this.f35903b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var9.getParentActivity());
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cm0(pn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                pn0Var9.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                    return;
                }
                return;
            case 14:
                this.f35903b.B1();
                return;
            case 15:
                pn0.V(this.f35903b);
                return;
            default:
                pn0 pn0Var10 = this.f35903b;
                pn0Var10.f41013f = true;
                pn0Var10.L.callOnClick();
                pn0Var10.f41013f = false;
                return;
        }
    }
}
