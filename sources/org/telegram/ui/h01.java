package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class h01 implements nq {
    public final uy f36875a;
    public final i01 f36876b;

    public h01(i01 i01Var, uy uyVar) {
        this.f36876b = i01Var;
        this.f36875a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        i01 i01Var = this.f36876b;
        i01Var.f37176b.N1 = true;
        this.f36875a.removeSelfFromStack();
        NotificationCenter notificationCenter = i01Var.f37176b.getNotificationCenter();
        ProfileActivity profileActivity = i01Var.f37176b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        i01Var.f37176b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
