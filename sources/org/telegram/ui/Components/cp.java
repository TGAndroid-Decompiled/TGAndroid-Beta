package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class cp implements Utilities.Callback {
    public final s80 f24992a;
    public final int f24993b;
    public final long f24994c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 f24995e;
    public final org.telegram.ui.ActionBar.c6 f24996f;

    public cp(s80 s80Var, int i10, long j3, long j10, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f24992a = s80Var;
        this.f24993b = i10;
        this.f24994c = j3;
        this.d = j10;
        this.f24995e = eoVar;
        this.f24996f = c6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f24992a.u();
        int intValue = num.intValue();
        int i10 = this.f24993b;
        long j3 = this.f24994c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24995e;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24996f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (zc.a(m2Var)) {
                zc.z(m2Var, 4, num.intValue(), c6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (zc.a(m2Var)) {
            zc.z(m2Var, 5, num.intValue(), c6Var).j();
        }
    }
}
