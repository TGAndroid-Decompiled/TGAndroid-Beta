package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements yp {
    public final cy f38138a;
    public final jz0 f38139b;

    public iz0(jz0 jz0Var, cy cyVar) {
        this.f38139b = jz0Var;
        this.f38138a = cyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        jz0 jz0Var = this.f38139b;
        jz0Var.f38383b.O1 = true;
        this.f38138a.removeSelfFromStack();
        NotificationCenter notificationCenter = jz0Var.f38383b.getNotificationCenter();
        ProfileActivity profileActivity = jz0Var.f38383b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        jz0Var.f38383b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
