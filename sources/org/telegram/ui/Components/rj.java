package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class rj implements wj {
    public final int f30032a;
    public final TLRPC.User f30033b;

    public rj(int i10, TLRPC.User user) {
        this.f30032a = i10;
        this.f30033b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f30032a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f30033b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f30033b.phone;
                break;
        }
        return org.telegram.messenger.w1.j(sb2, str, c10);
    }
}
