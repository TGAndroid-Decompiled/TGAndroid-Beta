package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ll0 implements View.OnClickListener {
    public final int f39272a;
    public final an0 f39273b;

    public ll0(an0 an0Var, int i10) {
        this.f39272a = i10;
        this.f39273b = an0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39272a) {
            case 0:
                an0 an0Var = this.f39273b;
                an0Var.S0 = 2;
                an0Var.C1();
                return;
            case 1:
                this.f39273b.c1();
                return;
            case 2:
                an0 an0Var2 = this.f39273b;
                an0Var2.S0 = 3;
                an0Var2.C1();
                return;
            case 3:
                an0 an0Var3 = this.f39273b;
                an0Var3.S0 = 1;
                an0Var3.C1();
                return;
            case 4:
                an0 an0Var4 = this.f39273b;
                an0Var4.S0 = 4;
                an0Var4.C1();
                return;
            case 5:
                an0 an0Var5 = this.f39273b;
                if (an0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    an0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                w9 w9Var = new w9(0);
                w9Var.M = new xl0(an0Var5);
                an0Var5.presentFragment(w9Var);
                return;
            case 6:
                an0 an0Var6 = this.f39273b;
                an0Var6.f35714f = true;
                an0Var6.L.callOnClick();
                an0Var6.f35714f = false;
                return;
            case 7:
                an0 an0Var7 = this.f39273b;
                an0Var7.S0 = 0;
                an0Var7.C1();
                return;
            case 8:
                an0 an0Var8 = this.f39273b;
                an0Var8.S0 = 4;
                an0Var8.C1();
                return;
            case 9:
                this.f39273b.c1();
                return;
            case 10:
                an0.b0(this.f39273b);
                return;
            case 11:
                an0.c0(this.f39273b);
                return;
            case 12:
                this.f39273b.B1();
                return;
            case 13:
                an0 an0Var9 = this.f39273b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var9.getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nl0(an0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                an0Var9.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                    return;
                }
                return;
            case 14:
                this.f39273b.B1();
                return;
            case 15:
                an0.V(this.f39273b);
                return;
            default:
                an0 an0Var10 = this.f39273b;
                an0Var10.f35714f = true;
                an0Var10.L.callOnClick();
                an0Var10.f35714f = false;
                return;
        }
    }
}
