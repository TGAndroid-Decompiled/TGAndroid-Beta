package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class c31 implements View.OnClickListener {
    public final int f46698a;
    public final n31 f46699b;

    public c31(n31 n31Var, int i7) {
        this.f46698a = i7;
        this.f46699b = n31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46698a;
        n31 n31Var = this.f46699b;
        switch (i7) {
            case 0:
                vf.c.t(n31Var.getParentActivity(), n31Var.getMessagesController().O5);
                n31Var.getMessagesController().s4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                n31Var.getClass();
                n31Var.presentFragment(new g(3));
                return;
            case 2:
                n31Var.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                n31Var.getClass();
                n31Var.presentFragment(new za1(8, null));
                return;
            case 4:
                n31Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                n31.a0(n31Var);
                return;
            default:
                int i10 = n31Var.R + 1;
                n31Var.R = i10;
                if (i10 < 2) {
                    boolean z10 = org.telegram.messenger.s2.f26829a;
                    try {
                        Toast.makeText(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131751613, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                n31Var.presentFragment(new org.telegram.ui.Components.d51());
                return;
        }
    }
}
