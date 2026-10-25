package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class wo implements Utilities.Callback {
    public final k80 f34507a;
    public final int f34508b;
    public final long f34509c;
    public final long d;
    public final org.telegram.ui.ActionBar.r2 e;
    public final org.telegram.ui.ActionBar.u6 f34510f;

    public wo(k80 k80Var, int i10, long j10, long j11, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f34507a = k80Var;
        this.f34508b = i10;
        this.f34509c = j10;
        this.d = j11;
        this.e = unVar;
        this.f34510f = u6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f34507a.u();
        int intValue = num.intValue();
        int i10 = this.f34508b;
        long j10 = this.f34509c;
        long j11 = this.d;
        org.telegram.ui.ActionBar.r2 r2Var = this.e;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34510f;
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
