package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rj implements wj {
    public final int f27634a;
    public final TLRPC.User f27635b;

    public rj(int i10, TLRPC.User user) {
        this.f27634a = i10;
        this.f27635b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f27634a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27635b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27635b.phone;
                break;
        }
        return org.telegram.messenger.vl.h(sb2, str, c10);
    }
}
