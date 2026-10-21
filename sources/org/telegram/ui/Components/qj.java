package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f29613a;
    public final TLRPC.User f29614b;

    public qj(int i10, TLRPC.User user) {
        this.f29613a = i10;
        this.f29614b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29613a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29614b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29614b.phone;
                break;
        }
        return org.telegram.messenger.mk.g(sb2, str, c10);
    }
}
