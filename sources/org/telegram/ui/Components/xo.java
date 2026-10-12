package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class xo implements Utilities.Callback {
    public final m80 f31289a;
    public final int f31290b;
    public final long f31291c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final org.telegram.ui.ActionBar.c6 f31292f;

    public xo(m80 m80Var, int i10, long j10, long j11, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f31289a = m80Var;
        this.f31290b = i10;
        this.f31291c = j10;
        this.d = j11;
        this.e = foVar;
        this.f31292f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f31289a.u();
        int intValue = num.intValue();
        int i10 = this.f31290b;
        long j10 = this.f31291c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31292f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (zc.a(m2Var)) {
                zc.z(m2Var, 4, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (zc.a(m2Var)) {
            zc.z(m2Var, 5, num.intValue(), c6Var).j();
        }
    }
}
