package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tj implements yj {
    public final int f28611a;
    public final TLRPC.User f28612b;

    public tj(int i10, TLRPC.User user) {
        this.f28611a = i10;
        this.f28612b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28611a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28612b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28612b.phone;
                break;
        }
        return org.telegram.messenger.qk.h(sb2, str, c10);
    }
}
