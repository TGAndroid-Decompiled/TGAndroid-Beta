package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mj implements rj {
    public final int f37518a;
    public final TLRPC.User f37519b;

    public mj(int i7, TLRPC.User user) {
        this.f37518a = i7;
        this.f37519b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f37518a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f37519b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f37519b.phone;
                break;
        }
        return org.telegram.messenger.n10.h(sb2, str, c10);
    }
}
