package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).g3((TLRPC.User) this.f51887c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f51887c).f27109id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.f51890g;
            if (z9) {
                if (z9) {
                    this.f51890g = false;
                    this.f51886b.n(this.f51885a, this.f51888e);
                }
                this.f51889f.accept(userFull);
            }
        }
    }
}
