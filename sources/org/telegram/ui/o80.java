package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o80 implements jp {
    public final zw f48465a;
    public final int f48466b;

    public o80(zw zwVar, int i7) {
        this.f48465a = zwVar;
        this.f48466b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f48465a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.f48466b).k(org.telegram.messenger.qs.f25080t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
