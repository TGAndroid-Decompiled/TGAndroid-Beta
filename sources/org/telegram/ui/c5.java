package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c5 extends x4 {
    @Override
    public final void a() {
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).e3((TLRPC.User) this.f43436c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f43436c).f19942id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f43438g;
            if (z10) {
                if (z10) {
                    this.f43438g = false;
                    this.f43435b.n(this.f43434a, this.e);
                }
                this.f43437f.accept(userFull);
            }
        }
    }
}
