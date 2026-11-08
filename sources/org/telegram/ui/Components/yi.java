package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yi implements dj {
    public final int f40674a;
    public final TLRPC.User f40675b;

    public yi(int i7, TLRPC.User user) {
        this.f40674a = i7;
        this.f40675b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f40674a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40675b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40675b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c10);
    }
}
