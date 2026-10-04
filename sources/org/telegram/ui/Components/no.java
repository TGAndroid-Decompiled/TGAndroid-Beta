package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class no implements Utilities.Callback {
    public final b80 f29027a;
    public final int f29028b;
    public final long f29029c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f29030e;
    public final org.telegram.ui.ActionBar.d6 f29031f;

    public no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29027a = b80Var;
        this.f29028b = i10;
        this.f29029c = j3;
        this.d = j10;
        this.f29030e = ynVar;
        this.f29031f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f29027a.u();
        int intValue = num.intValue();
        int i10 = this.f29028b;
        long j3 = this.f29029c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29030e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29031f;
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
