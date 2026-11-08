package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class l80 implements hp {
    public final ww f47467a;
    public final int f47468b;

    public l80(ww wwVar, int i7) {
        this.f47467a = wwVar;
        this.f47468b = i7;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f47467a.removeSelfFromStack();
        org.telegram.messenger.qs.f(this.f47468b).k(org.telegram.messenger.qs.f25076t, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
