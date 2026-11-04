package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hv0 implements fp {
    public final uw f45994a;
    public final iv0 f45995b;

    public hv0(iv0 iv0Var, uw uwVar) {
        this.f45995b = iv0Var;
        this.f45994a = uwVar;
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f45995b.f46427b;
        profileActivity.N1 = true;
        this.f45994a.removeSelfFromStack();
        org.telegram.messenger.hs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.hs.f23305t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
