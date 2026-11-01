package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o90 implements fq {
    public final zx f40106a;
    public final int f40107b;

    public o90(zx zxVar, int i10) {
        this.f40106a = zxVar;
        this.f40107b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f40106a.removeSelfFromStack();
        org.telegram.messenger.at.f(this.f40107b).k(org.telegram.messenger.at.f14786t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
