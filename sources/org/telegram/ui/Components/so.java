package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class so implements Utilities.Callback {
    public final h80 f30598a;
    public final int f30599b;
    public final long f30600c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final org.telegram.ui.ActionBar.g6 f30601f;

    public so(h80 h80Var, int i10, long j10, long j11, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f30598a = h80Var;
        this.f30599b = i10;
        this.f30600c = j10;
        this.d = j11;
        this.e = snVar;
        this.f30601f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f30598a.u();
        int intValue = num.intValue();
        int i10 = this.f30599b;
        long j10 = this.f30600c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f30601f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (vc.a(o2Var)) {
                vc.z(o2Var, 4, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (vc.a(o2Var)) {
            vc.z(o2Var, 5, num.intValue(), g6Var).j();
        }
    }
}
