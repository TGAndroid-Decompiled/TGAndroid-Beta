package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oj implements tj {
    public final int f38242a;
    public final TLRPC.User f38243b;

    public oj(int i7, TLRPC.User user) {
        this.f38242a = i7;
        this.f38243b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f38242a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f38243b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f38243b.phone;
                break;
        }
        return org.telegram.messenger.o10.h(sb2, str, c10);
    }
}
