package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class d31 implements View.OnClickListener {
    public final int f44813a;
    public final n31 f44814b;

    public d31(n31 n31Var, int i7) {
        this.f44813a = i7;
        this.f44814b = n31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f44813a;
        n31 n31Var = this.f44814b;
        switch (i7) {
            case 0:
                vf.c.t(n31Var.getParentActivity(), n31Var.getMessagesController().L5);
                n31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                n31Var.getClass();
                n31Var.presentFragment(new g(3));
                return;
            case 2:
                n31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                n31Var.getClass();
                n31Var.presentFragment(new bb1(8, null));
                return;
            case 4:
                n31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                n31.a0(n31Var);
                return;
            default:
                int i10 = n31Var.Q + 1;
                n31Var.Q = i10;
                if (i10 < 2) {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                    try {
                        Toast.makeText(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131751625, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                n31Var.presentFragment(new org.telegram.ui.Components.o41());
                return;
        }
    }
}
