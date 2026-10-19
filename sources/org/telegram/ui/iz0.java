package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class iz0 implements yp {
    public final cy f38128a;
    public final jz0 f38129b;

    public iz0(jz0 jz0Var, cy cyVar) {
        this.f38129b = jz0Var;
        this.f38128a = cyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        jz0 jz0Var = this.f38129b;
        jz0Var.f38373b.O1 = true;
        this.f38128a.removeSelfFromStack();
        NotificationCenter notificationCenter = jz0Var.f38373b.getNotificationCenter();
        ProfileActivity profileActivity = jz0Var.f38373b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        jz0Var.f38373b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
