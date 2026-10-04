package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class no implements Utilities.Callback {
    public final b80 f29032a;
    public final int f29033b;
    public final long f29034c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f29035e;
    public final org.telegram.ui.ActionBar.d6 f29036f;

    public no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29032a = b80Var;
        this.f29033b = i10;
        this.f29034c = j3;
        this.d = j10;
        this.f29035e = ynVar;
        this.f29036f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f29032a.u();
        int intValue = num.intValue();
        int i10 = this.f29033b;
        long j3 = this.f29034c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29035e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29036f;
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
