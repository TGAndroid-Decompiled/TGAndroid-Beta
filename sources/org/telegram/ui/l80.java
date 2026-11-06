package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class l80 implements hp {
    public final ww f47469a;
    public final int f47470b;

    public l80(ww wwVar, int i7) {
        this.f47469a = wwVar;
        this.f47470b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f47469a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.f47470b).k(org.telegram.messenger.qs.f25067t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
