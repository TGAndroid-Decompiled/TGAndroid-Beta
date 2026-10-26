package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f31938a;
    public final TLRPC.User f31939b;

    public qj(int i10, TLRPC.User user) {
        this.f31938a = i10;
        this.f31939b = user;
    }

    @Override
    public final String run() {
        kf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31938a) {
            case 0:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31939b.phone;
                break;
            default:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31939b.phone;
                break;
        }
        return org.telegram.messenger.vh.g(sb2, str, c10);
    }
}
