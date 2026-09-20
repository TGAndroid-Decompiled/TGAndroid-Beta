package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ko implements Utilities.Callback {
    public final v70 f25838a;
    public final int f25839b;
    public final long f25840c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.f6 f25841f;

    public ko(v70 v70Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25838a = v70Var;
        this.f25839b = i10;
        this.f25840c = j3;
        this.d = j10;
        this.e = znVar;
        this.f25841f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25838a.u();
        int intValue = num.intValue();
        int i10 = this.f25839b;
        long j3 = this.f25840c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25841f;
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
