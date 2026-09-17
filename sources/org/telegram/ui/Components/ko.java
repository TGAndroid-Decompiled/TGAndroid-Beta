package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ko implements Utilities.Callback {
    public final n70 f25660a;
    public final int f25661b;
    public final long f25662c;
    public final long d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final org.telegram.ui.ActionBar.f6 f25663f;

    public ko(n70 n70Var, int i10, long j3, long j10, org.telegram.ui.bo boVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25660a = n70Var;
        this.f25661b = i10;
        this.f25662c = j3;
        this.d = j10;
        this.e = boVar;
        this.f25663f = f6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f25660a.u();
        int intValue = num.intValue();
        int i10 = this.f25661b;
        long j3 = this.f25662c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25663f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (vc.a(o2Var)) {
                vc.z(o2Var, 4, num.intValue(), f6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (vc.a(o2Var)) {
            vc.z(o2Var, 5, num.intValue(), f6Var).j();
        }
    }
}
