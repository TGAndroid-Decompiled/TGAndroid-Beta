package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).g3((TLRPC.User) this.f51851c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f51851c).f27105id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.f51854g;
            if (z9) {
                if (z9) {
                    this.f51854g = false;
                    this.f51850b.n(this.f51849a, this.f51852e);
                }
                this.f51853f.accept(userFull);
            }
        }
    }
}
