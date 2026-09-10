package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class uj implements zj {
    public final int f27684a;
    public final TLRPC.User f27685b;

    public uj(int i10, TLRPC.User user) {
        this.f27684a = i10;
        this.f27685b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f27684a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27685b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27685b.phone;
                break;
        }
        return org.telegram.messenger.a2.j(sb2, str, c10);
    }
}
