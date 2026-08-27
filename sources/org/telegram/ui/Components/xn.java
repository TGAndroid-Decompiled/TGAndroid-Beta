package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;

public final class xn implements Utilities.Callback {

    public final b70 f34653a;

    public final int f34654b;

    public final long f34655c;
    public final long d;

    public final org.telegram.ui.ActionBar.n2 f34656e;

    public final org.telegram.ui.ActionBar.c6 f34657f;

    public xn(b70 b70Var, int i10, long j10, long j11, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34653a = b70Var;
        this.f34654b = i10;
        this.f34655c = j10;
        this.d = j11;
        this.f34656e = rnVar;
        this.f34657f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f34653a.u();
        int iIntValue = num.intValue();
        int i10 = this.f34654b;
        long j10 = this.f34655c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f34656e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34657f;
        if (iIntValue != 0) {
            NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
            if (mc.a(n2Var)) {
                mc.z(n2Var, 5, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
            NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
        }
        if (mc.a(n2Var)) {
            mc.z(n2Var, 4, num.intValue(), c6Var).j();
        }
    }
}
