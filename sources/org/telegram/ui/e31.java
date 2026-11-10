package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class e31 implements View.OnClickListener {
    public final int f45115a;
    public final o31 f45116b;

    public e31(o31 o31Var, int i7) {
        this.f45115a = i7;
        this.f45116b = o31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f45115a;
        o31 o31Var = this.f45116b;
        switch (i7) {
            case 0:
                vf.c.t(o31Var.getParentActivity(), o31Var.getMessagesController().L5);
                o31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                o31Var.getClass();
                o31Var.presentFragment(new g(3));
                return;
            case 2:
                o31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                o31Var.getClass();
                o31Var.presentFragment(new cb1(8, null));
                return;
            case 4:
                o31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                o31.a0(o31Var);
                return;
            default:
                int i10 = o31Var.Q + 1;
                o31Var.Q = i10;
                if (i10 < 2) {
                    boolean z9 = org.telegram.messenger.r2.f25216a;
                    try {
                        Toast.makeText(o31Var.getParentActivity(), org.telegram.messenger.id.M0(2131751625, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                o31Var.presentFragment(new org.telegram.ui.Components.o41());
                return;
        }
    }
}
