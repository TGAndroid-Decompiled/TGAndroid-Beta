package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class m01 implements oq {
    public final wy f34816a;
    public final n01 f34817b;

    public m01(n01 n01Var, wy wyVar) {
        this.f34817b = n01Var;
        this.f34816a = wyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        n01 n01Var = this.f34817b;
        n01Var.f35089b.N1 = true;
        this.f34816a.removeSelfFromStack();
        NotificationCenter notificationCenter = n01Var.f35089b.getNotificationCenter();
        ProfileActivity profileActivity = n01Var.f35089b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        n01Var.f35089b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
