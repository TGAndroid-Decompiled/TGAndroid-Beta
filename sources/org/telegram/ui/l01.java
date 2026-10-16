package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class l01 implements qq {
    public final yy f37567a;
    public final m01 f37568b;

    public l01(m01 m01Var, yy yyVar) {
        this.f37568b = m01Var;
        this.f37567a = yyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        m01 m01Var = this.f37568b;
        m01Var.f37880b.N1 = true;
        this.f37567a.removeSelfFromStack();
        NotificationCenter notificationCenter = m01Var.f37880b.getNotificationCenter();
        ProfileActivity profileActivity = m01Var.f37880b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        m01Var.f37880b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
