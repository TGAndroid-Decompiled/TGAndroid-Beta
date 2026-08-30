package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class go implements Utilities.Callback {
    public final o70 f25202a;
    public final int f25203b;
    public final long f25204c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final org.telegram.ui.ActionBar.f6 f25205f;

    public go(o70 o70Var, int i10, long j10, long j11, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25202a = o70Var;
        this.f25203b = i10;
        this.f25204c = j10;
        this.d = j11;
        this.e = xnVar;
        this.f25205f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25202a.u();
        int intValue = num.intValue();
        int i10 = this.f25203b;
        long j10 = this.f25204c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25205f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (qc.a(p2Var)) {
                qc.z(p2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (qc.a(p2Var)) {
            qc.z(p2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
