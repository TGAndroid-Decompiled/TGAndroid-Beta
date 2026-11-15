package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ov0 implements jp {
    public final yw f50068a;
    public final pv0 f50069b;

    public ov0(pv0 pv0Var, yw ywVar) {
        this.f50069b = pv0Var;
        this.f50068a = ywVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f50069b.f50383b;
        profileActivity.N1 = true;
        this.f50068a.removeSelfFromStack();
        org.telegram.messenger.ns notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ns.f25572t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
