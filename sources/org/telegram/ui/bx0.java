package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bx0 implements fq {
    public final zx f36129a;
    public final cx0 f36130b;

    public bx0(cx0 cx0Var, zx zxVar) {
        this.f36130b = cx0Var;
        this.f36129a = zxVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f36130b.f36436b;
        profileActivity.M1 = true;
        this.f36129a.removeSelfFromStack();
        org.telegram.messenger.at notificationCenter = profileActivity.getNotificationCenter();
        int i11 = org.telegram.messenger.at.f14786t;
        notificationCenter.n(profileActivity, i11);
        profileActivity.getNotificationCenter().k(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
