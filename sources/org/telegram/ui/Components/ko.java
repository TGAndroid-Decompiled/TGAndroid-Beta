package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ko implements Utilities.Callback {
    public final y70 f25775a;
    public final int f25776b;
    public final long f25777c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.f6 f25778f;

    public ko(y70 y70Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25775a = y70Var;
        this.f25776b = i10;
        this.f25777c = j3;
        this.d = j10;
        this.e = znVar;
        this.f25778f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25775a.u();
        int intValue = num.intValue();
        int i10 = this.f25776b;
        long j3 = this.f25777c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25778f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (xc.a(n2Var)) {
                xc.z(n2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (xc.a(n2Var)) {
            xc.z(n2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
