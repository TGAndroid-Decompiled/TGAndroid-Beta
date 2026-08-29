package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements aq {
    public final fy f37244a;
    public final dz0 f37245b;

    public cz0(dz0 dz0Var, fy fyVar) {
        this.f37245b = dz0Var;
        this.f37244a = fyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        dz0 dz0Var = this.f37245b;
        dz0Var.f37655b.J1 = true;
        this.f37244a.removeSelfFromStack();
        NotificationCenter notificationCenter = dz0Var.f37655b.getNotificationCenter();
        ProfileActivity profileActivity = dz0Var.f37655b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        dz0Var.f37655b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
