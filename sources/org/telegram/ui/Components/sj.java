package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sj implements xj {
    public final int f27939a;
    public final TLRPC.User f27940b;

    public sj(int i10, TLRPC.User user) {
        this.f27939a = i10;
        this.f27940b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f27939a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27940b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27940b.phone;
                break;
        }
        return org.telegram.messenger.ul.h(sb2, str, c10);
    }
}
