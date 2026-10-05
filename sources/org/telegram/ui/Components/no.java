package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class no implements Utilities.Callback {
    public final b80 f29121a;
    public final int f29122b;
    public final long f29123c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f29124e;
    public final org.telegram.ui.ActionBar.d6 f29125f;

    public no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f29121a = b80Var;
        this.f29122b = i10;
        this.f29123c = j3;
        this.d = j10;
        this.f29124e = ynVar;
        this.f29125f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f29121a.u();
        int intValue = num.intValue();
        int i10 = this.f29122b;
        long j3 = this.f29123c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29124e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29125f;
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
