package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
public final class no implements Utilities.Callback {
    public final b80 f26756a;
    public final int f26757b;
    public final long f26758c;
    public final long d;
    public final org.telegram.ui.ActionBar.m2 e;
    public final org.telegram.ui.ActionBar.d6 f26759f;

    public no(b80 b80Var, int i10, long j3, long j10, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26756a = b80Var;
        this.f26757b = i10;
        this.f26758c = j3;
        this.d = j10;
        this.e = wnVar;
        this.f26759f = d6Var;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f26756a.u();
        int intValue = num.intValue();
        int i10 = this.f26757b;
        long j3 = this.f26758c;
        long j10 = this.d;
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26759f;
        if (intValue == 0) {
            if (MessagesController.getInstance(i10).isDialogMuted(j3, j10)) {
                NotificationsController.getInstance(i10).muteDialog(j3, j10, false);
            }
            if (yc.a(m2Var)) {
                yc.z(m2Var, 4, num.intValue(), d6Var).j();
                return;
            }
            return;
        }
        NotificationsController.getInstance(i10).muteUntil(j3, j10, num.intValue());
        if (yc.a(m2Var)) {
            yc.z(m2Var, 5, num.intValue(), d6Var).j();
        }
    }
}
