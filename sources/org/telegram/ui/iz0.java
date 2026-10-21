package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements yp {
    public final cy f38135a;
    public final jz0 f38136b;

    public iz0(jz0 jz0Var, cy cyVar) {
        this.f38136b = jz0Var;
        this.f38135a = cyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        jz0 jz0Var = this.f38136b;
        jz0Var.f38380b.O1 = true;
        this.f38135a.removeSelfFromStack();
        NotificationCenter notificationCenter = jz0Var.f38380b.getNotificationCenter();
        ProfileActivity profileActivity = jz0Var.f38380b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        jz0Var.f38380b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
