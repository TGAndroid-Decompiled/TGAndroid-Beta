package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class h01 implements mq {
    public final uy f34009a;
    public final i01 f34010b;

    public h01(i01 i01Var, uy uyVar) {
        this.f34010b = i01Var;
        this.f34009a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        i01 i01Var = this.f34010b;
        i01Var.f34387b.N1 = true;
        this.f34009a.removeSelfFromStack();
        NotificationCenter notificationCenter = i01Var.f34387b.getNotificationCenter();
        ProfileActivity profileActivity = i01Var.f34387b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        i01Var.f34387b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
