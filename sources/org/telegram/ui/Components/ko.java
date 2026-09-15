package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ko implements Utilities.Callback {
    public final n70 f25634a;
    public final int f25635b;
    public final long f25636c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 e;
    public final org.telegram.ui.ActionBar.e6 f25637f;

    public ko(n70 n70Var, int i10, long j3, long j10, org.telegram.ui.bo boVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25634a = n70Var;
        this.f25635b = i10;
        this.f25636c = j3;
        this.d = j10;
        this.e = boVar;
        this.f25637f = e6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25634a.u();
        int intValue = num.intValue();
        int i10 = this.f25635b;
        long j3 = this.f25636c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25637f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (vc.a(n2Var)) {
                vc.z(n2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (vc.a(n2Var)) {
            vc.z(n2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
