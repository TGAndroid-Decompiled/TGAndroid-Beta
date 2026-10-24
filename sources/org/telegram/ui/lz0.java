package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lz0 implements aq {
    public final ey f39415a;
    public final mz0 f39416b;

    public lz0(mz0 mz0Var, ey eyVar) {
        this.f39416b = mz0Var;
        this.f39415a = eyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        mz0 mz0Var = this.f39416b;
        mz0Var.f39679b.O1 = true;
        this.f39415a.removeSelfFromStack();
        NotificationCenter notificationCenter = mz0Var.f39679b.getNotificationCenter();
        ProfileActivity profileActivity = mz0Var.f39679b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        mz0Var.f39679b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
