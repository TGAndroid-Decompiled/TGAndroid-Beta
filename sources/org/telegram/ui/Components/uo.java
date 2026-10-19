package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class uo implements Utilities.Callback {
    public final i80 f31032a;
    public final int f31033b;
    public final long f31034c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.d6 f31035f;

    public uo(i80 i80Var, int i10, long j10, long j11, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f31032a = i80Var;
        this.f31033b = i10;
        this.f31034c = j10;
        this.d = j11;
        this.e = qnVar;
        this.f31035f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f31032a.u();
        int intValue = num.intValue();
        int i10 = this.f31033b;
        long j10 = this.f31034c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31035f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (xc.a(n2Var)) {
                xc.z(n2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (xc.a(n2Var)) {
            xc.z(n2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
