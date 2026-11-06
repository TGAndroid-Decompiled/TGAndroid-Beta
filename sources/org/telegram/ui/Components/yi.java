package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yi implements dj {
    public final int f40648a;
    public final TLRPC.User f40649b;

    public yi(int i7, TLRPC.User user) {
        this.f40648a = i7;
        this.f40649b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f40648a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40649b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40649b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c10);
    }
}
