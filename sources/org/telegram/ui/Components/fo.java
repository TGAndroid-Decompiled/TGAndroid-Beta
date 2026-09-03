package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class fo implements Utilities.Callback {
    public final p70 f24920a;
    public final int f24921b;
    public final long f24922c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final org.telegram.ui.ActionBar.f6 f24923f;

    public fo(p70 p70Var, int i10, long j10, long j11, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24920a = p70Var;
        this.f24921b = i10;
        this.f24922c = j10;
        this.d = j11;
        this.e = znVar;
        this.f24923f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24920a.u();
        int intValue = num.intValue();
        int i10 = this.f24921b;
        long j10 = this.f24922c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24923f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (qc.a(p2Var)) {
                qc.z(p2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (qc.a(p2Var)) {
            qc.z(p2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
