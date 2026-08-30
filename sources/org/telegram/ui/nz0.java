package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class nz0 implements gq {
    public final oy f36753a;
    public final oz0 f36754b;

    public nz0(oz0 oz0Var, oy oyVar) {
        this.f36754b = oz0Var;
        this.f36753a = oyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        oz0 oz0Var = this.f36754b;
        oz0Var.f37135b.K1 = true;
        this.f36753a.removeSelfFromStack();
        NotificationCenter notificationCenter = oz0Var.f37135b.getNotificationCenter();
        ProfileActivity profileActivity = oz0Var.f37135b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        oz0Var.f37135b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
