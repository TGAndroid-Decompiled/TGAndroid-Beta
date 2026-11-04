package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f5 extends a5 {
    @Override
    public final void a() {
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).g3((TLRPC.User) this.f43598c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f43598c).f27150id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f43601g;
            if (z10) {
                if (z10) {
                    this.f43601g = false;
                    this.f43597b.n(this.f43596a, this.f43599e);
                }
                this.f43600f.accept(userFull);
            }
        }
    }
}
