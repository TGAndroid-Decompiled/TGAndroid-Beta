package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tj implements yj {
    public final int f28568a;
    public final TLRPC.User f28569b;

    public tj(int i10, TLRPC.User user) {
        this.f28568a = i10;
        this.f28569b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28568a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28569b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28569b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
