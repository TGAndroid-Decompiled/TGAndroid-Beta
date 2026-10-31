package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class p90 implements fq {
    public final ay f40540a;
    public final int f40541b;

    public p90(ay ayVar, int i10) {
        this.f40540a = ayVar;
        this.f40541b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f40540a.removeSelfFromStack();
        org.telegram.messenger.zs.f(this.f40541b).k(org.telegram.messenger.zs.f19690t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
