package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pv0 implements hp {
    public final ww f48928a;
    public final qv0 f48929b;

    public pv0(qv0 qv0Var, ww wwVar) {
        this.f48929b = qv0Var;
        this.f48928a = wwVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f48929b.f49300b;
        profileActivity.M1 = true;
        this.f48928a.removeSelfFromStack();
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.qs.f25059t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
