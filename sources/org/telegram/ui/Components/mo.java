package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class mo implements Utilities.Callback {
    public final a80 f26490a;
    public final int f26491b;
    public final long f26492c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final org.telegram.ui.ActionBar.e6 f26493f;

    public mo(a80 a80Var, int i10, long j3, long j10, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f26490a = a80Var;
        this.f26491b = i10;
        this.f26492c = j3;
        this.d = j10;
        this.e = xnVar;
        this.f26493f = e6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f26490a.u();
        int intValue = num.intValue();
        int i10 = this.f26491b;
        long j3 = this.f26492c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f26493f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (xc.a(o2Var)) {
                xc.z(o2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (xc.a(o2Var)) {
            xc.z(o2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
