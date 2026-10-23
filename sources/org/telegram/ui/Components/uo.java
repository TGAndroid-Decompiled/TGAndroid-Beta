package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class uo implements Utilities.Callback {
    public final j80 f31190a;
    public final int f31191b;
    public final long f31192c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final org.telegram.ui.ActionBar.g6 f31193f;

    public uo(j80 j80Var, int i10, long j10, long j11, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31190a = j80Var;
        this.f31191b = i10;
        this.f31192c = j10;
        this.d = j11;
        this.e = snVar;
        this.f31193f = g6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f31190a.u();
        int intValue = num.intValue();
        int i10 = this.f31191b;
        long j10 = this.f31192c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31193f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (xc.a(o2Var)) {
                xc.z(o2Var, 4, num.intValue(), g6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (xc.a(o2Var)) {
            xc.z(o2Var, 5, num.intValue(), g6Var).j();
        }
    }
}
