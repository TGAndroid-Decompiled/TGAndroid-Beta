package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fm0 implements View.OnClickListener {
    public final int f35862a;
    public final un0 f35863b;

    public fm0(un0 un0Var, int i10) {
        this.f35862a = i10;
        this.f35863b = un0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35862a) {
            case 0:
                un0 un0Var = this.f35863b;
                un0Var.S0 = 2;
                un0Var.C1();
                return;
            case 1:
                this.f35863b.c1();
                return;
            case 2:
                un0 un0Var2 = this.f35863b;
                un0Var2.S0 = 3;
                un0Var2.C1();
                return;
            case 3:
                un0 un0Var3 = this.f35863b;
                un0Var3.S0 = 1;
                un0Var3.C1();
                return;
            case 4:
                un0 un0Var4 = this.f35863b;
                un0Var4.S0 = 4;
                un0Var4.C1();
                return;
            case 5:
                un0 un0Var5 = this.f35863b;
                if (un0Var5.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    un0Var5.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
                    return;
                }
                z9 z9Var = new z9(0);
                z9Var.M = new qm0(un0Var5);
                un0Var5.presentFragment(z9Var);
                return;
            case 6:
                un0 un0Var6 = this.f35863b;
                un0Var6.f40732f = true;
                un0Var6.L.callOnClick();
                un0Var6.f40732f = false;
                return;
            case 7:
                un0 un0Var7 = this.f35863b;
                un0Var7.S0 = 0;
                un0Var7.C1();
                return;
            case 8:
                un0 un0Var8 = this.f35863b;
                un0Var8.S0 = 4;
                un0Var8.C1();
                return;
            case 9:
                this.f35863b.c1();
                return;
            case 10:
                un0.b0(this.f35863b);
                return;
            case 11:
                un0.c0(this.f35863b);
                return;
            case 12:
                this.f35863b.B1();
                return;
            case 13:
                un0 un0Var9 = this.f35863b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var9.getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.TelegramPassportDeleteTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.TelegramPassportDeleteAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hm0(un0Var9, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                un0Var9.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                    return;
                }
                return;
            case 14:
                this.f35863b.B1();
                return;
            case 15:
                un0.V(this.f35863b);
                return;
            default:
                un0 un0Var10 = this.f35863b;
                un0Var10.f40732f = true;
                un0Var10.L.callOnClick();
                un0Var10.f40732f = false;
                return;
        }
    }
}
