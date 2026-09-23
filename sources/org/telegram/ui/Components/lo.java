package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class lo implements Utilities.Callback {
    public final o70 f25923a;
    public final int f25924b;
    public final long f25925c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.d6 f25926f;

    public lo(o70 o70Var, int i10, long j3, long j10, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25923a = o70Var;
        this.f25924b = i10;
        this.f25925c = j3;
        this.d = j10;
        this.e = xnVar;
        this.f25926f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25923a.u();
        int intValue = num.intValue();
        int i10 = this.f25924b;
        long j3 = this.f25925c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25926f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (xc.a(n2Var)) {
                xc.z(n2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (xc.a(n2Var)) {
            xc.z(n2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
