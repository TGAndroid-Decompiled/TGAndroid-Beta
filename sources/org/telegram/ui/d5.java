package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).n3((TLRPC.User) this.f54019c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f54019c).f28554id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f54022g;
            if (z10) {
                if (z10) {
                    this.f54022g = false;
                    this.f54018b.n(this.f54017a, this.f54020e);
                }
                this.f54021f.accept(userFull);
            }
        }
    }
}
