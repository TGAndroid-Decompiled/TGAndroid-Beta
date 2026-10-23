package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mz0 implements aq {
    public final ey f39731a;
    public final nz0 f39732b;

    public mz0(nz0 nz0Var, ey eyVar) {
        this.f39732b = nz0Var;
        this.f39731a = eyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        nz0 nz0Var = this.f39732b;
        nz0Var.f40016b.O1 = true;
        this.f39731a.removeSelfFromStack();
        NotificationCenter notificationCenter = nz0Var.f40016b.getNotificationCenter();
        ProfileActivity profileActivity = nz0Var.f40016b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        nz0Var.f40016b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
