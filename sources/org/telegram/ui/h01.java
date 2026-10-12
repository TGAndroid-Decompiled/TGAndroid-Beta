package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class h01 implements nq {
    public final vy f38209a;
    public final i01 f38210b;

    public h01(i01 i01Var, vy vyVar) {
        this.f38210b = i01Var;
        this.f38209a = vyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        i01 i01Var = this.f38210b;
        i01Var.f38577b.N1 = true;
        this.f38209a.removeSelfFromStack();
        NotificationCenter notificationCenter = i01Var.f38577b.getNotificationCenter();
        ProfileActivity profileActivity = i01Var.f38577b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        i01Var.f38577b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
