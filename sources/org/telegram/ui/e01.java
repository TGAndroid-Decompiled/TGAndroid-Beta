package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class e01 implements kq {
    public final sy f37201a;
    public final f01 f37202b;

    public e01(f01 f01Var, sy syVar) {
        this.f37202b = f01Var;
        this.f37201a = syVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        f01 f01Var = this.f37202b;
        f01Var.f37533b.N1 = true;
        this.f37201a.removeSelfFromStack();
        NotificationCenter notificationCenter = f01Var.f37533b.getNotificationCenter();
        ProfileActivity profileActivity = f01Var.f37533b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        f01Var.f37533b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
