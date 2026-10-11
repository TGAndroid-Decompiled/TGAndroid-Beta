package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class e01 implements kq {
    public final sy f37167a;
    public final f01 f37168b;

    public e01(f01 f01Var, sy syVar) {
        this.f37168b = f01Var;
        this.f37167a = syVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        f01 f01Var = this.f37168b;
        f01Var.f37499b.N1 = true;
        this.f37167a.removeSelfFromStack();
        NotificationCenter notificationCenter = f01Var.f37499b.getNotificationCenter();
        ProfileActivity profileActivity = f01Var.f37499b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        f01Var.f37499b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
