package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n80 implements jp {
    public final yw f48126a;
    public final int f48127b;

    public n80(yw ywVar, int i7) {
        this.f48126a = ywVar;
        this.f48127b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f48126a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.f48127b).k(org.telegram.messenger.qs.f25076t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
