package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class uj implements zj {
    public final int f31389a;
    public final TLRPC.User f31390b;

    public uj(int i10, TLRPC.User user) {
        this.f31389a = i10;
        this.f31390b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31389a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31390b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31390b.phone;
                break;
        }
        return org.telegram.messenger.bi.g(sb2, str, c10);
    }
}
