package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xi implements cj {
    public final int f40310a;
    public final TLRPC.User f40311b;

    public xi(int i7, TLRPC.User user) {
        this.f40310a = i7;
        this.f40311b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f40310a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40311b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40311b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c10);
    }
}
