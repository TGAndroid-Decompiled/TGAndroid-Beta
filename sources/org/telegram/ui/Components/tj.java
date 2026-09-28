package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class tj implements yj {
    public final int f28570a;
    public final TLRPC.User f28571b;

    public tj(int i10, TLRPC.User user) {
        this.f28570a = i10;
        this.f28571b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28570a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28571b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28571b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
