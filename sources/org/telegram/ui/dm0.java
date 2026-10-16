package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dm0 implements View.OnClickListener {
    public final int f35081a;
    public final sn0 f35082b;

    public dm0(sn0 sn0Var, int i10) {
        this.f35081a = i10;
        this.f35082b = sn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35081a) {
            case 0:
                sn0 sn0Var = this.f35082b;
                sn0Var.S0 = 2;
                sn0Var.C1();
                return;
            case 1:
                this.f35082b.c1();
                return;
            case 2:
                sn0 sn0Var2 = this.f35082b;
                sn0Var2.S0 = 3;
                sn0Var2.C1();
                return;
            case 3:
                sn0 sn0Var3 = this.f35082b;
                sn0Var3.S0 = 1;
                sn0Var3.C1();
                return;
            case 4:
                sn0 sn0Var4 = this.f35082b;
                sn0Var4.S0 = 4;
                sn0Var4.C1();
                return;
            case 5:
                sn0 sn0Var5 = this.f35082b;
                if (sn0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    sn0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                z9 z9Var = new z9(0);
                z9Var.M = new pm0(sn0Var5);
                sn0Var5.presentFragment(z9Var);
                return;
            case 6:
                sn0 sn0Var6 = this.f35082b;
                sn0Var6.f39867f = true;
                sn0Var6.L.callOnClick();
                sn0Var6.f39867f = false;
                return;
            case 7:
                sn0 sn0Var7 = this.f35082b;
                sn0Var7.S0 = 0;
                sn0Var7.C1();
                return;
            case 8:
                sn0 sn0Var8 = this.f35082b;
                sn0Var8.S0 = 4;
                sn0Var8.C1();
                return;
            case 9:
                this.f35082b.c1();
                return;
            case 10:
                sn0.b0(this.f35082b);
                return;
            case 11:
                sn0.c0(this.f35082b);
                return;
            case 12:
                this.f35082b.B1();
                return;
            case 13:
                sn0 sn0Var9 = this.f35082b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var9.getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fm0(sn0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                sn0Var9.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                    return;
                }
                return;
            case 14:
                this.f35082b.B1();
                return;
            case 15:
                sn0.V(this.f35082b);
                return;
            default:
                sn0 sn0Var10 = this.f35082b;
                sn0Var10.f39867f = true;
                sn0Var10.L.callOnClick();
                sn0Var10.f39867f = false;
                return;
        }
    }
}
