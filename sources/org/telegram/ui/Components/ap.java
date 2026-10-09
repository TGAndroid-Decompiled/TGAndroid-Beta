package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class ap implements Utilities.Callback {
    public final p80 f24725a;
    public final int f24726b;
    public final long f24727c;
    public final long d;
    public final org.telegram.ui.ActionBar.n2 f24728e;
    public final org.telegram.ui.ActionBar.e6 f24729f;

    public ap(p80 p80Var, int i10, long j3, long j10, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f24725a = p80Var;
        this.f24726b = i10;
        this.f24727c = j3;
        this.d = j10;
        this.f24728e = znVar;
        this.f24729f = e6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24725a.u();
        int intValue = num.intValue();
        int i10 = this.f24726b;
        long j3 = this.f24727c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 n2Var = this.f24728e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f24729f;
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
