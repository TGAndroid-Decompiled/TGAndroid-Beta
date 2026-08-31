package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class io implements Utilities.Callback {
    public final q70 f27869a;
    public final int f27870b;
    public final long f27871c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 f27872e;
    public final org.telegram.ui.ActionBar.g6 f27873f;

    public io(q70 q70Var, int i10, long j10, long j11, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f27869a = q70Var;
        this.f27870b = i10;
        this.f27871c = j10;
        this.d = j11;
        this.f27872e = xnVar;
        this.f27873f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f27869a.u();
        int intValue = num.intValue();
        int i10 = this.f27870b;
        long j10 = this.f27871c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.f27872e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f27873f;
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
