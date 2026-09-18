package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class i01 implements mq {
    public final wy f34409a;
    public final j01 f34410b;

    public i01(j01 j01Var, wy wyVar) {
        this.f34410b = j01Var;
        this.f34409a = wyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        j01 j01Var = this.f34410b;
        j01Var.f34748b.N1 = true;
        this.f34409a.removeSelfFromStack();
        NotificationCenter notificationCenter = j01Var.f34748b.getNotificationCenter();
        ProfileActivity profileActivity = j01Var.f34748b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        j01Var.f34748b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
