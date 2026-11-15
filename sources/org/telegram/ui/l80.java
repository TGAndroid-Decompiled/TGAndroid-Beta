package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class l80 implements jp {
    public final yw f48893a;
    public final int f48894b;

    public l80(yw ywVar, int i7) {
        this.f48893a = ywVar;
        this.f48894b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f48893a.removeSelfFromStack();
        org.telegram.messenger.ns.f(this.f48894b).k(org.telegram.messenger.ns.f25572t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
