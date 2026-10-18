package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kz0 implements aq {
    public final ey f38651a;
    public final lz0 f38652b;

    public kz0(lz0 lz0Var, ey eyVar) {
        this.f38652b = lz0Var;
        this.f38651a = eyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        lz0 lz0Var = this.f38652b;
        lz0Var.f38946b.O1 = true;
        this.f38651a.removeSelfFromStack();
        NotificationCenter notificationCenter = lz0Var.f38946b.getNotificationCenter();
        ProfileActivity profileActivity = lz0Var.f38946b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        lz0Var.f38946b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
