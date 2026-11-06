package org.telegram.ui;

import android.view.View;
import android.widget.Toast;
public final class b31 implements View.OnClickListener {
    public final int f44171a;
    public final m31 f44172b;

    public b31(m31 m31Var, int i7) {
        this.f44171a = i7;
        this.f44172b = m31Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f44171a;
        m31 m31Var = this.f44172b;
        switch (i7) {
            case 0:
                vf.c.t(m31Var.getParentActivity(), m31Var.getMessagesController().L5);
                m31Var.getMessagesController().k4(0L, "PREMIUM_GRACE");
                return;
            case 1:
                m31Var.getClass();
                m31Var.presentFragment(new g(3));
                return;
            case 2:
                m31Var.getMessagesController().k4(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                m31Var.getClass();
                m31Var.presentFragment(new ya1(8, null));
                return;
            case 4:
                m31Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                m31.a0(m31Var);
                return;
            default:
                int i10 = m31Var.Q + 1;
                m31Var.Q = i10;
                if (i10 < 2) {
                    boolean z9 = org.telegram.messenger.r2.f25199a;
                    try {
                        Toast.makeText(m31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131751626, null), 0).show();
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                m31Var.presentFragment(new org.telegram.ui.Components.n41());
                return;
        }
    }
}
