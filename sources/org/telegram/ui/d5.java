package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).n3((TLRPC.User) this.f54012c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f54012c).f28547id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f54015g;
            if (z10) {
                if (z10) {
                    this.f54015g = false;
                    this.f54011b.n(this.f54010a, this.f54013e);
                }
                this.f54014f.accept(userFull);
            }
        }
    }
}
