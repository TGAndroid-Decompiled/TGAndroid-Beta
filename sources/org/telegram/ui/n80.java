package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n80 implements kp {
    public final bx f50259a;
    public final int f50260b;

    public n80(bx bxVar, int i7) {
        this.f50259a = bxVar;
        this.f50260b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f50259a.removeSelfFromStack();
        org.telegram.messenger.ks.f(this.f50260b).k(org.telegram.messenger.ks.f25289t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
