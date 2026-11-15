package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).g3((TLRPC.User) this.f53406c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f53406c).f28200id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f53409g;
            if (z10) {
                if (z10) {
                    this.f53409g = false;
                    this.f53405b.n(this.f53404a, this.f53407e);
                }
                this.f53408f.accept(userFull);
            }
        }
    }
}
