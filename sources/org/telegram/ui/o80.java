package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements kp {
    public final cx f50492a;
    public final int f50493b;

    public o80(cx cxVar, int i7) {
        this.f50492a = cxVar;
        this.f50493b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f50492a.removeSelfFromStack();
        org.telegram.messenger.ks.f(this.f50493b).k(org.telegram.messenger.ks.f25190t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
