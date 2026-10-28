package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class wo implements Utilities.Callback {
    public final l80 f34551a;
    public final int f34552b;
    public final long f34553c;
    public final long d;
    public final org.telegram.ui.ActionBar.r2 e;
    public final org.telegram.ui.ActionBar.u6 f34554f;

    public wo(l80 l80Var, int i10, long j10, long j11, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f34551a = l80Var;
        this.f34552b = i10;
        this.f34553c = j10;
        this.d = j11;
        this.e = wnVar;
        this.f34554f = u6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f34551a.u();
        int intValue = num.intValue();
        int i10 = this.f34552b;
        long j10 = this.f34553c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.r2 r2Var = this.e;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34554f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j10, j11)) {
                NotificationsController.getInstance(i10).muteDialog(j10, j11, false);
            }
            if (wc.a(r2Var)) {
                wc.z(r2Var, 4, num.intValue(), u6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j10, j11, num.intValue());
        if (wc.a(r2Var)) {
            wc.z(r2Var, 5, num.intValue(), u6Var).j();
        }
    }
}
