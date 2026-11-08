package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).g3((TLRPC.User) this.f52063c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f52063c).f27105id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.f52066g;
            if (z9) {
                if (z9) {
                    this.f52066g = false;
                    this.f52062b.n(this.f52061a, this.f52064e);
                }
                this.f52065f.accept(userFull);
            }
        }
    }
}
