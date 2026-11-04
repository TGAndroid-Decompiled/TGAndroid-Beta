package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i80 implements fp {
    public final uw f46192a;
    public final int f46193b;

    public i80(uw uwVar, int i3) {
        this.f46192a = uwVar;
        this.f46193b = i3;
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f46192a.removeSelfFromStack();
        org.telegram.messenger.hs.f(this.f46193b).k(org.telegram.messenger.hs.f23305t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
