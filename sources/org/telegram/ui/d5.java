package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).n3((TLRPC.User) this.f54038c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f54038c).f28583id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f54041g;
            if (z10) {
                if (z10) {
                    this.f54041g = false;
                    this.f54037b.n(this.f54036a, this.f54039e);
                }
                this.f54040f.accept(userFull);
            }
        }
    }
}
