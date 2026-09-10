package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class po implements Utilities.Callback {
    public final w70 f26217a;
    public final int f26218b;
    public final long f26219c;
    public final long d;
    public final org.telegram.ui.ActionBar.p2 e;
    public final org.telegram.ui.ActionBar.f6 f26220f;

    public po(w70 w70Var, int i10, long j3, long j10, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26217a = w70Var;
        this.f26218b = i10;
        this.f26219c = j3;
        this.d = j10;
        this.e = eoVar;
        this.f26220f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f26217a.u();
        int intValue = num.intValue();
        int i10 = this.f26218b;
        long j3 = this.f26219c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26220f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (wc.a(p2Var)) {
                wc.z(p2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (wc.a(p2Var)) {
            wc.z(p2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
