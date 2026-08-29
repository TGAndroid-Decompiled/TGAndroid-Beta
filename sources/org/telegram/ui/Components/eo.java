package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class eo implements Utilities.Callback {
    public final j70 f28127a;
    public final int f28128b;
    public final long f28129c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 f28130e;
    public final org.telegram.ui.ActionBar.c6 f28131f;

    public eo(j70 j70Var, int i10, long j10, long j11, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f28127a = j70Var;
        this.f28128b = i10;
        this.f28129c = j10;
        this.d = j11;
        this.f28130e = tnVar;
        this.f28131f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f28127a.u();
        int intValue = num.intValue();
        int i10 = this.f28128b;
        long j10 = this.f28129c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28130e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28131f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (tc.a(o2Var)) {
                tc.z(o2Var, 4, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (tc.a(o2Var)) {
            tc.z(o2Var, 5, num.intValue(), c6Var).j();
        }
    }
}
