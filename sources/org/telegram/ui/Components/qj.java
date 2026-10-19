package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f29654a;
    public final TLRPC.User f29655b;

    public qj(int i10, TLRPC.User user) {
        this.f29654a = i10;
        this.f29655b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29654a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29655b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29655b.phone;
                break;
        }
        return org.telegram.messenger.lk.g(sb2, str, c10);
    }
}
