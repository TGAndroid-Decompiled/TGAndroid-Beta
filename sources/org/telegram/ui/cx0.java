package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cx0 implements fq {
    public final ay f36565a;
    public final dx0 f36566b;

    public cx0(dx0 dx0Var, ay ayVar) {
        this.f36566b = dx0Var;
        this.f36565a = ayVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f36566b.f36859b;
        profileActivity.M1 = true;
        this.f36565a.removeSelfFromStack();
        org.telegram.messenger.zs notificationCenter = profileActivity.getNotificationCenter();
        int i11 = org.telegram.messenger.zs.f19690t;
        notificationCenter.n(profileActivity, i11);
        profileActivity.getNotificationCenter().k(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
