package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class sj implements xj {
    public final int f29144a;
    public final TLRPC.User f29145b;

    public sj(int i10, TLRPC.User user) {
        this.f29144a = i10;
        this.f29145b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29144a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29145b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29145b.phone;
                break;
        }
        return org.telegram.messenger.yh.g(sb2, str, c10);
    }
}
