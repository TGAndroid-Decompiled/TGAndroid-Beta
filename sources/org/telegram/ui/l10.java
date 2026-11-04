package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class l10 implements Runnable {
    public final x30 f47074a;

    public l10(x30 x30Var) {
        this.f47074a = x30Var;
    }

    @Override
    public final void run() {
        int i3;
        x30 x30Var = this.f47074a;
        org.telegram.ui.ActionBar.k5 k5Var = x30Var.M1;
        e30 e30Var = x30Var.N1;
        if (e30Var != null && !x30Var.J) {
            org.telegram.messenger.r3 r3Var = x30Var.S2;
            if (r3Var != null) {
                i3 = r3Var.f25049b.schedule_date;
            } else {
                i3 = x30Var.f51725c4;
            }
            if (i3 != 0) {
                int currentTime = i3 - ConnectionsManager.getInstance(x30Var.f51759l1.f21919a).getCurrentTime();
                if (currentTime >= 86400) {
                    e30Var.l(org.telegram.messenger.bd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    e30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && k5Var.getTag() == null) {
                        k5Var.setTag(1);
                        k5Var.l(org.telegram.messenger.bd.M0(2131743451, null), false);
                    }
                }
                x30Var.O1.l(org.telegram.messenger.bd.W(3, i3, true), false);
                org.telegram.messenger.g0.i3(x30Var.f51775o4, 1000L);
            }
        }
    }
}
