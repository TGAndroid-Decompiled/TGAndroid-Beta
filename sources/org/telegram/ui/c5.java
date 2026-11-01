package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c5 extends x4 {
    @Override
    public final void a() {
        org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).e3((TLRPC.User) this.f43224c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f43224c).f19943id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f43226g;
            if (z10) {
                if (z10) {
                    this.f43226g = false;
                    this.f43223b.n(this.f43222a, this.e);
                }
                this.f43225f.accept(userFull);
            }
        }
    }
}
