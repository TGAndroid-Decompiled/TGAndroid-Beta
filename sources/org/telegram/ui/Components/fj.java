package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class fj implements kj {
    public final int f34615a;
    public final TLRPC.User f34616b;

    public fj(int i7, TLRPC.User user) {
        this.f34615a = i7;
        this.f34616b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f34615a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f34616b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f34616b.phone;
                break;
        }
        return org.telegram.messenger.k5.h(sb2, str, c10);
    }
}
