package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class cp implements Utilities.Callback {
    public final s80 f24977a;
    public final int f24978b;
    public final long f24979c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f24980e;
    public final org.telegram.ui.ActionBar.c6 f24981f;

    public cp(s80 s80Var, int i10, long j3, long j10, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f24977a = s80Var;
        this.f24978b = i10;
        this.f24979c = j3;
        this.d = j10;
        this.f24980e = eoVar;
        this.f24981f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24977a.u();
        int intValue = num.intValue();
        int i10 = this.f24978b;
        long j3 = this.f24979c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24980e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24981f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (zc.a(m2Var)) {
                zc.z(m2Var, 4, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (zc.a(m2Var)) {
            zc.z(m2Var, 5, num.intValue(), c6Var).j();
        }
    }
}
