package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements kp {
    public final cx f50517a;
    public final int f50518b;

    public o80(cx cxVar, int i7) {
        this.f50517a = cxVar;
        this.f50518b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f50517a.removeSelfFromStack();
        org.telegram.messenger.ks.f(this.f50518b).k(org.telegram.messenger.ks.f25218t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
