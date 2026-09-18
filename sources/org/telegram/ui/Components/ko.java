package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ko implements Utilities.Callback {
    public final w70 f25758a;
    public final int f25759b;
    public final long f25760c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.e6 f25761f;

    public ko(w70 w70Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25758a = w70Var;
        this.f25759b = i10;
        this.f25760c = j3;
        this.d = j10;
        this.e = znVar;
        this.f25761f = e6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25758a.u();
        int intValue = num.intValue();
        int i10 = this.f25759b;
        long j3 = this.f25760c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25761f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (xc.a(n2Var)) {
                xc.z(n2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (xc.a(n2Var)) {
            xc.z(n2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
