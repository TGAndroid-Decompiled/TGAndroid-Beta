package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kj implements qj {
    public final int f30081a;
    public final TLRPC.User f30082b;

    public kj(int i10, TLRPC.User user) {
        this.f30081a = i10;
        this.f30082b = user;
    }

    @Override
    public final String run() {
        qe.b c3;
        StringBuilder sb2;
        String str;
        switch (this.f30081a) {
            case 0:
                c3 = qe.b.c();
                sb2 = new StringBuilder("+");
                str = this.f30082b.phone;
                break;
            default:
                c3 = qe.b.c();
                sb2 = new StringBuilder("+");
                str = this.f30082b.phone;
                break;
        }
        return org.telegram.messenger.x3.k(sb2, str, c3);
    }
}
