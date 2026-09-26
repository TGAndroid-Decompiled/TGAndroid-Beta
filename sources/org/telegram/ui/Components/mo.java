package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class mo implements Utilities.Callback {
    public final z70 f26458a;
    public final int f26459b;
    public final long f26460c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final org.telegram.ui.ActionBar.d6 f26461f;

    public mo(z70 z70Var, int i10, long j3, long j10, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26458a = z70Var;
        this.f26459b = i10;
        this.f26460c = j3;
        this.d = j10;
        this.e = wnVar;
        this.f26461f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f26458a.u();
        int intValue = num.intValue();
        int i10 = this.f26459b;
        long j3 = this.f26460c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26461f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (xc.a(m2Var)) {
                xc.z(m2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (xc.a(m2Var)) {
            xc.z(m2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
