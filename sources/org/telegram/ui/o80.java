package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements kp {
    public final cx f50521a;
    public final int f50522b;

    public o80(cx cxVar, int i7) {
        this.f50521a = cxVar;
        this.f50522b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f50521a.removeSelfFromStack();
        org.telegram.messenger.ls.f(this.f50522b).k(org.telegram.messenger.ls.f25384t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
