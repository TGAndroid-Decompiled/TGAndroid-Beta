package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class il0 implements View.OnClickListener {
    public final int f38016a;
    public final vm0 f38017b;

    public il0(vm0 vm0Var, int i10) {
        this.f38016a = i10;
        this.f38017b = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38016a) {
            case 0:
                vm0 vm0Var = this.f38017b;
                vm0Var.S0 = 2;
                vm0Var.C1();
                return;
            case 1:
                this.f38017b.c1();
                return;
            case 2:
                vm0 vm0Var2 = this.f38017b;
                vm0Var2.S0 = 3;
                vm0Var2.C1();
                return;
            case 3:
                vm0 vm0Var3 = this.f38017b;
                vm0Var3.S0 = 1;
                vm0Var3.C1();
                return;
            case 4:
                vm0 vm0Var4 = this.f38017b;
                vm0Var4.S0 = 4;
                vm0Var4.C1();
                return;
            case 5:
                vm0 vm0Var5 = this.f38017b;
                if (vm0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    vm0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                w9 w9Var = new w9(0);
                w9Var.M = new tl0(vm0Var5);
                vm0Var5.presentFragment(w9Var);
                return;
            case 6:
                vm0 vm0Var6 = this.f38017b;
                vm0Var6.f42287f = true;
                vm0Var6.L.callOnClick();
                vm0Var6.f42287f = false;
                return;
            case 7:
                vm0 vm0Var7 = this.f38017b;
                vm0Var7.S0 = 0;
                vm0Var7.C1();
                return;
            case 8:
                vm0 vm0Var8 = this.f38017b;
                vm0Var8.S0 = 4;
                vm0Var8.C1();
                return;
            case 9:
                this.f38017b.c1();
                return;
            case 10:
                vm0.b0(this.f38017b);
                return;
            case 11:
                vm0.c0(this.f38017b);
                return;
            case 12:
                this.f38017b.B1();
                return;
            case 13:
                vm0 vm0Var9 = this.f38017b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var9.getParentActivity());
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(vm0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                vm0Var9.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                    return;
                }
                return;
            case 14:
                this.f38017b.B1();
                return;
            case 15:
                vm0.V(this.f38017b);
                return;
            default:
                vm0 vm0Var10 = this.f38017b;
                vm0Var10.f42287f = true;
                vm0Var10.L.callOnClick();
                vm0Var10.f42287f = false;
                return;
        }
    }
}
