package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class h01 implements nq {
    public final uy f36848a;
    public final i01 f36849b;

    public h01(i01 i01Var, uy uyVar) {
        this.f36849b = i01Var;
        this.f36848a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        i01 i01Var = this.f36849b;
        i01Var.f37149b.N1 = true;
        this.f36848a.removeSelfFromStack();
        NotificationCenter notificationCenter = i01Var.f37149b.getNotificationCenter();
        ProfileActivity profileActivity = i01Var.f37149b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        i01Var.f37149b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
