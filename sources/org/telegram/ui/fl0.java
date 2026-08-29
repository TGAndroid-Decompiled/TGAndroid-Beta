package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fl0 implements View.OnClickListener {
    public final int f38208a;
    public final vm0 f38209b;

    public fl0(vm0 vm0Var, int i10) {
        this.f38208a = i10;
        this.f38209b = vm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38208a) {
            case 0:
                vm0 vm0Var = this.f38209b;
                vm0Var.O0 = 2;
                vm0Var.D1();
                return;
            case 1:
                this.f38209b.d1();
                return;
            case 2:
                vm0 vm0Var2 = this.f38209b;
                vm0Var2.O0 = 3;
                vm0Var2.D1();
                return;
            case 3:
                vm0 vm0Var3 = this.f38209b;
                vm0Var3.O0 = 1;
                vm0Var3.D1();
                return;
            case 4:
                vm0 vm0Var4 = this.f38209b;
                vm0Var4.O0 = 4;
                vm0Var4.D1();
                return;
            case 5:
                vm0.e0(this.f38209b);
                return;
            case 6:
                vm0 vm0Var5 = this.f38209b;
                vm0Var5.f43636f = true;
                vm0Var5.H.callOnClick();
                vm0Var5.f43636f = false;
                return;
            case 7:
                vm0 vm0Var6 = this.f38209b;
                vm0Var6.O0 = 0;
                vm0Var6.D1();
                return;
            case 8:
                vm0 vm0Var7 = this.f38209b;
                vm0Var7.O0 = 4;
                vm0Var7.D1();
                return;
            case 9:
                this.f38209b.d1();
                return;
            case 10:
                vm0.b0(this.f38209b);
                return;
            case 11:
                vm0.c0(this.f38209b);
                return;
            case 12:
                this.f38209b.C1();
                return;
            case 13:
                vm0 vm0Var8 = this.f38209b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var8.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hl0(vm0Var8, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                vm0Var8.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    return;
                }
                return;
            case 14:
                this.f38209b.C1();
                return;
            case 15:
                vm0.V(this.f38209b);
                return;
            default:
                vm0 vm0Var9 = this.f38209b;
                vm0Var9.f43636f = true;
                vm0Var9.H.callOnClick();
                vm0Var9.f43636f = false;
                return;
        }
    }
}
