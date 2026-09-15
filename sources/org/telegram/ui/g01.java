package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class g01 implements mq {
    public final uy f33723a;
    public final h01 f33724b;

    public g01(h01 h01Var, uy uyVar) {
        this.f33724b = h01Var;
        this.f33723a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        h01 h01Var = this.f33724b;
        h01Var.f34081b.N1 = true;
        this.f33723a.removeSelfFromStack();
        NotificationCenter notificationCenter = h01Var.f34081b.getNotificationCenter();
        ProfileActivity profileActivity = h01Var.f34081b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        h01Var.f34081b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
