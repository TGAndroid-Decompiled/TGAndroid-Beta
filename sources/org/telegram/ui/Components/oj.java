package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oj implements tj {
    public final int f38211a;
    public final TLRPC.User f38212b;

    public oj(int i7, TLRPC.User user) {
        this.f38211a = i7;
        this.f38212b = user;
    }

    @Override
    public final String run() {
        pf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f38211a) {
            case 0:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f38212b.phone;
                break;
            default:
                c10 = pf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f38212b.phone;
                break;
        }
        return org.telegram.messenger.o10.h(sb2, str, c10);
    }
}
