package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements yp {
    public final dy f37362a;
    public final dz0 f37363b;

    public cz0(dz0 dz0Var, dy dyVar) {
        this.f37363b = dz0Var;
        this.f37362a = dyVar;
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        dz0 dz0Var = this.f37363b;
        dz0Var.f37761b.J1 = true;
        this.f37362a.removeSelfFromStack();
        NotificationCenter notificationCenter = dz0Var.f37761b.getNotificationCenter();
        ProfileActivity profileActivity = dz0Var.f37761b;
        int i10 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i10);
        dz0Var.f37761b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
