package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pz0 implements hq {
    public final py f40311a;
    public final qz0 f40312b;

    public pz0(qz0 qz0Var, py pyVar) {
        this.f40312b = qz0Var;
        this.f40311a = pyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        qz0 qz0Var = this.f40312b;
        qz0Var.f40724b.K1 = true;
        this.f40311a.removeSelfFromStack();
        NotificationCenter notificationCenter = qz0Var.f40724b.getNotificationCenter();
        ProfileActivity profileActivity = qz0Var.f40724b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        qz0Var.f40724b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
