package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ap implements Utilities.Callback {
    public final p80 f24638a;
    public final int f24639b;
    public final long f24640c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f24641e;
    public final org.telegram.ui.ActionBar.d6 f24642f;

    public ap(p80 p80Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24638a = p80Var;
        this.f24639b = i10;
        this.f24640c = j3;
        this.d = j10;
        this.f24641e = znVar;
        this.f24642f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24638a.u();
        int intValue = num.intValue();
        int i10 = this.f24639b;
        long j3 = this.f24640c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24641e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24642f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (ad.a(m2Var)) {
                ad.z(m2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (ad.a(m2Var)) {
            ad.z(m2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
