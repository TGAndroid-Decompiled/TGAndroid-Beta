package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d5 extends y4 {
    @Override
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).n3((TLRPC.User) this.f53987c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f53987c).f28552id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f53990g;
            if (z10) {
                if (z10) {
                    this.f53990g = false;
                    this.f53986b.n(this.f53985a, this.f53988e);
                }
                this.f53989f.accept(userFull);
            }
        }
    }
}
