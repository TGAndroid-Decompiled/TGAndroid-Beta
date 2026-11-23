package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv0 implements kp {
    public final bx f51150a;
    public final qv0 f51151b;

    public pv0(qv0 qv0Var, bx bxVar) {
        this.f51151b = qv0Var;
        this.f51150a = bxVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f51151b.f51546b;
        profileActivity.N1 = true;
        this.f51150a.removeSelfFromStack();
        org.telegram.messenger.ks notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ks.f25289t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
