package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kl0 implements View.OnClickListener {
    public final int f38583a;
    public final xm0 f38584b;

    public kl0(xm0 xm0Var, int i10) {
        this.f38583a = i10;
        this.f38584b = xm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38583a) {
            case 0:
                xm0 xm0Var = this.f38584b;
                xm0Var.S0 = 2;
                xm0Var.C1();
                return;
            case 1:
                this.f38584b.c1();
                return;
            case 2:
                xm0 xm0Var2 = this.f38584b;
                xm0Var2.S0 = 3;
                xm0Var2.C1();
                return;
            case 3:
                xm0 xm0Var3 = this.f38584b;
                xm0Var3.S0 = 1;
                xm0Var3.C1();
                return;
            case 4:
                xm0 xm0Var4 = this.f38584b;
                xm0Var4.S0 = 4;
                xm0Var4.C1();
                return;
            case 5:
                xm0 xm0Var5 = this.f38584b;
                if (xm0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    xm0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                y9 y9Var = new y9(0);
                y9Var.N = new vl0(xm0Var5);
                xm0Var5.presentFragment(y9Var);
                return;
            case 6:
                xm0 xm0Var6 = this.f38584b;
                xm0Var6.f43196f = true;
                xm0Var6.L.callOnClick();
                xm0Var6.f43196f = false;
                return;
            case 7:
                xm0 xm0Var7 = this.f38584b;
                xm0Var7.S0 = 0;
                xm0Var7.C1();
                return;
            case 8:
                xm0 xm0Var8 = this.f38584b;
                xm0Var8.S0 = 4;
                xm0Var8.C1();
                return;
            case 9:
                this.f38584b.c1();
                return;
            case 10:
                xm0.b0(this.f38584b);
                return;
            case 11:
                xm0.c0(this.f38584b);
                return;
            case 12:
                this.f38584b.B1();
                return;
            case 13:
                xm0 xm0Var9 = this.f38584b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var9.getParentActivity());
                alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ml0(xm0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                xm0Var9.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                    return;
                }
                return;
            case 14:
                this.f38584b.B1();
                return;
            case 15:
                xm0.V(this.f38584b);
                return;
            default:
                xm0 xm0Var10 = this.f38584b;
                xm0Var10.f43196f = true;
                xm0Var10.L.callOnClick();
                xm0Var10.f43196f = false;
                return;
        }
    }
}
