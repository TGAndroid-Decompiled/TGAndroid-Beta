package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rj implements wj {
    public final int f27907a;
    public final TLRPC.User f27908b;

    public rj(int i10, TLRPC.User user) {
        this.f27907a = i10;
        this.f27908b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f27907a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27908b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27908b.phone;
                break;
        }
        return org.telegram.messenger.wh.g(sb2, str, c10);
    }
}
