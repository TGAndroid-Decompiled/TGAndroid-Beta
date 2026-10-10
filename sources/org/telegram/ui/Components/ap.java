package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ap implements Utilities.Callback {
    public final q80 f24597a;
    public final int f24598b;
    public final long f24599c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f24600e;
    public final org.telegram.ui.ActionBar.e6 f24601f;

    public ap(q80 q80Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f24597a = q80Var;
        this.f24598b = i10;
        this.f24599c = j3;
        this.d = j10;
        this.f24600e = znVar;
        this.f24601f = e6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24597a.u();
        int intValue = num.intValue();
        int i10 = this.f24598b;
        long j3 = this.f24599c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f24600e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24601f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (ad.a(n2Var)) {
                ad.z(n2Var, 4, num.intValue(), e6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (ad.a(n2Var)) {
            ad.z(n2Var, 5, num.intValue(), e6Var).j();
        }
    }
}
