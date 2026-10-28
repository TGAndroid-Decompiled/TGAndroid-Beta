package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f31912a;
    public final TLRPC.User f31913b;

    public qj(int i10, TLRPC.User user) {
        this.f31912a = i10;
        this.f31913b = user;
    }

    @Override
    public final String run() {
        kf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31912a) {
            case 0:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31913b.phone;
                break;
            default:
                c10 = kf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31913b.phone;
                break;
        }
        return org.telegram.messenger.wh.g(sb2, str, c10);
    }
}
