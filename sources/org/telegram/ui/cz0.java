package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class cz0 implements aq {

    public final gy f37211a;

    public final dz0 f37212b;

    public cz0(dz0 dz0Var, gy gyVar) {
        this.f37212b = dz0Var;
        this.f37211a = gyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        dz0 dz0Var = this.f37212b;
        dz0Var.f37574b.J1 = true;
        this.f37211a.removeSelfFromStack();
        NotificationCenter notificationCenter = dz0Var.f37574b.getNotificationCenter();
        ProfileActivity profileActivity = dz0Var.f37574b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        dz0Var.f37574b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
