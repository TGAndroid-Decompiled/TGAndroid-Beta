package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f29616a;
    public final TLRPC.User f29617b;

    public qj(int i10, TLRPC.User user) {
        this.f29616a = i10;
        this.f29617b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29616a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29617b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29617b.phone;
                break;
        }
        return org.telegram.messenger.ok.g(sb2, str, c10);
    }
}
