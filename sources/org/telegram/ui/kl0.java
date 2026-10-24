package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kl0 implements View.OnClickListener {
    public final int f38937a;
    public final zm0 f38938b;

    public kl0(zm0 zm0Var, int i10) {
        this.f38937a = i10;
        this.f38938b = zm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38937a) {
            case 0:
                zm0 zm0Var = this.f38938b;
                zm0Var.S0 = 2;
                zm0Var.C1();
                return;
            case 1:
                this.f38938b.c1();
                return;
            case 2:
                zm0 zm0Var2 = this.f38938b;
                zm0Var2.S0 = 3;
                zm0Var2.C1();
                return;
            case 3:
                zm0 zm0Var3 = this.f38938b;
                zm0Var3.S0 = 1;
                zm0Var3.C1();
                return;
            case 4:
                zm0 zm0Var4 = this.f38938b;
                zm0Var4.S0 = 4;
                zm0Var4.C1();
                return;
            case 5:
                zm0 zm0Var5 = this.f38938b;
                if (zm0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    zm0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                w9 w9Var = new w9(0);
                w9Var.M = new wl0(zm0Var5);
                zm0Var5.presentFragment(w9Var);
                return;
            case 6:
                zm0 zm0Var6 = this.f38938b;
                zm0Var6.f44137f = true;
                zm0Var6.L.callOnClick();
                zm0Var6.f44137f = false;
                return;
            case 7:
                zm0 zm0Var7 = this.f38938b;
                zm0Var7.S0 = 0;
                zm0Var7.C1();
                return;
            case 8:
                zm0 zm0Var8 = this.f38938b;
                zm0Var8.S0 = 4;
                zm0Var8.C1();
                return;
            case 9:
                this.f38938b.c1();
                return;
            case 10:
                zm0.b0(this.f38938b);
                return;
            case 11:
                zm0.c0(this.f38938b);
                return;
            case 12:
                this.f38938b.B1();
                return;
            case 13:
                zm0 zm0Var9 = this.f38938b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zm0Var9.getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ml0(zm0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                zm0Var9.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                    return;
                }
                return;
            case 14:
                this.f38938b.B1();
                return;
            case 15:
                zm0.V(this.f38938b);
                return;
            default:
                zm0 zm0Var10 = this.f38938b;
                zm0Var10.f44137f = true;
                zm0Var10.L.callOnClick();
                zm0Var10.f44137f = false;
                return;
        }
    }
}
