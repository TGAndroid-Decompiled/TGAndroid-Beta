package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xi implements cj {
    public final int f40367a;
    public final TLRPC.User f40368b;

    public xi(int i3, TLRPC.User user) {
        this.f40367a = i3;
        this.f40368b = user;
    }

    @Override
    public final String run() {
        mf.b c2;
        StringBuilder sb2;
        String str;
        switch (this.f40367a) {
            case 0:
                c2 = mf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40368b.phone;
                break;
            default:
                c2 = mf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f40368b.phone;
                break;
        }
        return org.telegram.messenger.k5.i(sb2, str, c2);
    }
}
