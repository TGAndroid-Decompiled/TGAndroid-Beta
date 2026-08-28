package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class zn implements Utilities.Callback {
    public final x60 f35338a;
    public final int f35339b;
    public final long f35340c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 f35341e;
    public final org.telegram.ui.ActionBar.b6 f35342f;

    public zn(x60 x60Var, int i9, long j10, long j11, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f35338a = x60Var;
        this.f35339b = i9;
        this.f35340c = j10;
        this.d = j11;
        this.f35341e = qnVar;
        this.f35342f = b6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f35338a.u();
        int intValue = num.intValue();
        int i9 = this.f35339b;
        long j10 = this.f35340c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.f35341e;
        org.telegram.ui.ActionBar.b6 b6Var = this.f35342f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i9).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i9).muteDialog(j10, j11, false);
            }
            if (oc.a(o2Var)) {
                oc.z(o2Var, 4, num.intValue(), b6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i9).muteUntil(j10, j11, num.intValue());
        if (oc.a(o2Var)) {
            oc.z(o2Var, 5, num.intValue(), b6Var).j();
        }
    }
}
