package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class nj implements sj {
    public final int f37837a;
    public final TLRPC.User f37838b;

    public nj(int i7, TLRPC.User user) {
        this.f37837a = i7;
        this.f37838b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f37837a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f37838b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f37838b.phone;
                break;
        }
        return org.telegram.messenger.m10.h(sb2, str, c10);
    }
}
