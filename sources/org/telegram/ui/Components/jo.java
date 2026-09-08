package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class jo implements Utilities.Callback {
    public final n70 f27572a;
    public final int f27573b;
    public final long f27574c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f27575e;
    public final org.telegram.ui.ActionBar.f6 f27576f;

    public jo(n70 n70Var, int i10, long j3, long j10, org.telegram.ui.co coVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27572a = n70Var;
        this.f27573b = i10;
        this.f27574c = j3;
        this.d = j10;
        this.f27575e = coVar;
        this.f27576f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f27572a.u();
        int intValue = num.intValue();
        int i10 = this.f27573b;
        long j3 = this.f27574c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f27575e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27576f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (yc.a(n2Var)) {
                yc.z(n2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (yc.a(n2Var)) {
            yc.z(n2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
