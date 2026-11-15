package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).g3((TLRPC.User) this.f53410c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f53410c).f28200id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f53413g;
            if (z10) {
                if (z10) {
                    this.f53413g = false;
                    this.f53409b.n(this.f53408a, this.f53411e);
                }
                this.f53412f.accept(userFull);
            }
        }
    }
}
