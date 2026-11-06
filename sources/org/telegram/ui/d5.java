package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).g3((TLRPC.User) this.f52070c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f52070c).f27102id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.f52073g;
            if (z9) {
                if (z9) {
                    this.f52073g = false;
                    this.f52069b.n(this.f52068a, this.f52071e);
                }
                this.f52072f.accept(userFull);
            }
        }
    }
}
