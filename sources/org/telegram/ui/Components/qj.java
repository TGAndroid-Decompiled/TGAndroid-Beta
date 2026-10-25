package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f31936a;
    public final TLRPC.User f31937b;

    public qj(int i10, TLRPC.User user) {
        this.f31936a = i10;
        this.f31937b = user;
    }

    @Override
    public final String run() {
        kf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31936a) {
            case 0:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31937b.phone;
                break;
            default:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31937b.phone;
                break;
        }
        return org.telegram.messenger.vh.g(sb2, str, c10);
    }
}
