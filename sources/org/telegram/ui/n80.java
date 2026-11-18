package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n80 implements kp {
    public final cx f50126a;
    public final int f50127b;

    public n80(cx cxVar, int i7) {
        this.f50126a = cxVar;
        this.f50127b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f50126a.removeSelfFromStack();
        org.telegram.messenger.ks.f(this.f50127b).k(org.telegram.messenger.ks.f25192t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
