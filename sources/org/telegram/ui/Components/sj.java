package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sj implements xj {
    public final int f28846a;
    public final TLRPC.User f28847b;

    public sj(int i10, TLRPC.User user) {
        this.f28846a = i10;
        this.f28847b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28846a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28847b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28847b.phone;
                break;
        }
        return org.telegram.messenger.sk.g(sb2, str, c10);
    }
}
