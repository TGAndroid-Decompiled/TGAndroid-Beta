package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class g01 implements kq {
    public final uy f33775a;
    public final h01 f33776b;

    public g01(h01 h01Var, uy uyVar) {
        this.f33776b = h01Var;
        this.f33775a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        h01 h01Var = this.f33776b;
        h01Var.f34039b.N1 = true;
        this.f33775a.removeSelfFromStack();
        NotificationCenter notificationCenter = h01Var.f34039b.getNotificationCenter();
        ProfileActivity profileActivity = h01Var.f34039b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        h01Var.f34039b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
