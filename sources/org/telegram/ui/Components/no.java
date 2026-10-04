package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class no implements Utilities.Callback {
    public final b80 f29026a;
    public final int f29027b;
    public final long f29028c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f29029e;
    public final org.telegram.ui.ActionBar.d6 f29030f;

    public no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29026a = b80Var;
        this.f29027b = i10;
        this.f29028c = j3;
        this.d = j10;
        this.f29029e = ynVar;
        this.f29030f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f29026a.u();
        int intValue = num.intValue();
        int i10 = this.f29027b;
        long j3 = this.f29028c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29029e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29030f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (yc.a(n2Var)) {
                yc.z(n2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (yc.a(n2Var)) {
            yc.z(n2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
