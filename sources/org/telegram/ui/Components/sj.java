package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sj implements xj {
    public final int f28262a;
    public final TLRPC.User f28263b;

    public sj(int i10, TLRPC.User user) {
        this.f28262a = i10;
        this.f28263b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28262a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28263b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28263b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
