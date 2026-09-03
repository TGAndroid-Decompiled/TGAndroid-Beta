package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class io implements Utilities.Callback {
    public final q70 f27872a;
    public final int f27873b;
    public final long f27874c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 f27875e;
    public final org.telegram.ui.ActionBar.g6 f27876f;

    public io(q70 q70Var, int i10, long j10, long j11, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f27872a = q70Var;
        this.f27873b = i10;
        this.f27874c = j10;
        this.d = j11;
        this.f27875e = xnVar;
        this.f27876f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f27872a.u();
        int intValue = num.intValue();
        int i10 = this.f27873b;
        long j10 = this.f27874c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.f27875e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f27876f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (qc.a(p2Var)) {
                qc.z(p2Var, 4, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (qc.a(p2Var)) {
            qc.z(p2Var, 5, num.intValue(), g6Var).j();
        }
    }
}
