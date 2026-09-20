package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rj implements wj {
    public final int f27909a;
    public final TLRPC.User f27910b;

    public rj(int i10, TLRPC.User user) {
        this.f27909a = i10;
        this.f27910b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f27909a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27910b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27910b.phone;
                break;
        }
        return org.telegram.messenger.rk.h(sb2, str, c10);
    }
}
