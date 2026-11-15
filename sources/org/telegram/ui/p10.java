package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class p10 implements Runnable {
    public final c40 f50108a;

    public p10(c40 c40Var) {
        this.f50108a = c40Var;
    }

    @Override
    public final void run() {
        int i7;
        c40 c40Var = this.f50108a;
        org.telegram.ui.ActionBar.j5 j5Var = c40Var.P1;
        j30 j30Var = c40Var.Q1;
        if (j30Var != null && !c40Var.J) {
            org.telegram.messenger.r3 r3Var = c40Var.V2;
            if (r3Var != null) {
                i7 = r3Var.f26208b.schedule_date;
            } else {
                i7 = c40Var.f45932j4;
            }
            if (i7 != 0) {
                int currentTime = i7 - ConnectionsManager.getInstance(c40Var.f45951o1.f22778a).getCurrentTime();
                if (currentTime >= 86400) {
                    j30Var.l(org.telegram.messenger.hd.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    j30Var.l(org.telegram.messenger.g0.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && j5Var.getTag() == null) {
                        j5Var.setTag(1);
                        j5Var.l(org.telegram.messenger.hd.M0(2131743441, null), false);
                    }
                }
                c40Var.R1.l(org.telegram.messenger.hd.W(3, i7, true), false);
                org.telegram.messenger.g0.i3(c40Var.f45987v4, 1000L);
            }
        }
    }
}
