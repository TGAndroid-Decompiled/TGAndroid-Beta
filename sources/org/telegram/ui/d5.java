package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).n3((TLRPC.User) this.f54034c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f54034c).f28580id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f54037g;
            if (z10) {
                if (z10) {
                    this.f54037g = false;
                    this.f54033b.n(this.f54032a, this.f54035e);
                }
                this.f54036f.accept(userFull);
            }
        }
    }
}
