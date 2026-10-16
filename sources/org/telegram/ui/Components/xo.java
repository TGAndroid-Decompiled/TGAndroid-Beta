package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class xo implements Utilities.Callback {
    public final l80 f30975a;
    public final int f30976b;
    public final long f30977c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final org.telegram.ui.ActionBar.c6 f30978f;

    public xo(l80 l80Var, int i10, long j10, long j11, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30975a = l80Var;
        this.f30976b = i10;
        this.f30977c = j10;
        this.d = j11;
        this.e = foVar;
        this.f30978f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f30975a.u();
        int intValue = num.intValue();
        int i10 = this.f30976b;
        long j10 = this.f30977c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30978f;
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
