package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).g3((TLRPC.User) this.f52051c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f52051c).f27101id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.f52054g;
            if (z9) {
                if (z9) {
                    this.f52054g = false;
                    this.f52050b.n(this.f52049a, this.f52052e);
                }
                this.f52053f.accept(userFull);
            }
        }
    }
}
