package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f29696a;
    public final TLRPC.User f29697b;

    public qj(int i10, TLRPC.User user) {
        this.f29696a = i10;
        this.f29697b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29696a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29697b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29697b.phone;
                break;
        }
        return org.telegram.messenger.lk.g(sb2, str, c10);
    }
}
