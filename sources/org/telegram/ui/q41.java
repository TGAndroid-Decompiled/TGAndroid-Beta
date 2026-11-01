package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class q41 implements View.OnClickListener {
    public final int f40687a;
    public final c51 f40688b;

    public q41(c51 c51Var, int i10) {
        this.f40687a = i10;
        this.f40688b = c51Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40687a;
        c51 c51Var = this.f40688b;
        switch (i10) {
            case 0:
                gf.f.r(c51Var.getParentActivity(), c51Var.getMessagesController().M5);
                c51Var.getMessagesController().h4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                c51Var.getClass();
                c51Var.presentFragment(new f(3));
                return;
            case 2:
                c51Var.getMessagesController().h4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                c51Var.getClass();
                c51Var.presentFragment(new rc1(8, null));
                return;
            case 4:
                c51Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                c51.a0(c51Var);
                return;
            default:
                int i11 = c51Var.Q + 1;
                c51Var.Q = i11;
                if (i11 < 2) {
                    boolean z10 = org.telegram.messenger.v2.f18578a;
                    try {
                        Toast.makeText(c51Var.getParentActivity(), org.telegram.messenger.dd.L0(2131751626, null), 0).show();
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                c51Var.presentFragment(new org.telegram.ui.Components.s51());
                return;
        }
    }
}
