package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class f01 implements kq {
    public final ty f37410a;
    public final g01 f37411b;

    public f01(g01 g01Var, ty tyVar) {
        this.f37411b = g01Var;
        this.f37410a = tyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        g01 g01Var = this.f37411b;
        g01Var.f37738b.N1 = true;
        this.f37410a.removeSelfFromStack();
        NotificationCenter notificationCenter = g01Var.f37738b.getNotificationCenter();
        ProfileActivity profileActivity = g01Var.f37738b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        g01Var.f37738b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
