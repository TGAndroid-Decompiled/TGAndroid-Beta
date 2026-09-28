package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tj implements yj {
    public final int f28569a;
    public final TLRPC.User f28570b;

    public tj(int i10, TLRPC.User user) {
        this.f28569a = i10;
        this.f28570b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28569a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28570b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28570b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
