package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class m01 implements qq {
    public final yy f38132a;
    public final n01 f38133b;

    public m01(n01 n01Var, yy yyVar) {
        this.f38133b = n01Var;
        this.f38132a = yyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        n01 n01Var = this.f38133b;
        n01Var.f38393b.N1 = true;
        this.f38132a.removeSelfFromStack();
        NotificationCenter notificationCenter = n01Var.f38393b.getNotificationCenter();
        ProfileActivity profileActivity = n01Var.f38393b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        n01Var.f38393b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
