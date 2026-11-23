package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class d31 implements View.OnClickListener {
    public final int f46831a;
    public final o31 f46832b;

    public d31(o31 o31Var, int i7) {
        this.f46831a = i7;
        this.f46832b = o31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f46831a;
        o31 o31Var = this.f46832b;
        switch (i7) {
            case 0:
                vf.c.t(o31Var.getParentActivity(), o31Var.getMessagesController().O5);
                o31Var.getMessagesController().s4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                o31Var.getClass();
                o31Var.presentFragment(new g(3));
                return;
            case 2:
                o31Var.getMessagesController().s4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                o31Var.getClass();
                o31Var.presentFragment(new bb1(8, null));
                return;
            case 4:
                o31Var.getMessagesController().s4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                o31.a0(o31Var);
                return;
            default:
                int i10 = o31Var.R + 1;
                o31Var.R = i10;
                if (i10 < 2) {
                    boolean z10 = org.telegram.messenger.s2.f26694a;
                    try {
                        Toast.makeText(o31Var.getParentActivity(), org.telegram.messenger.hd.N0(2131751613, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                o31Var.presentFragment(new org.telegram.ui.Components.e51());
                return;
        }
    }
}
