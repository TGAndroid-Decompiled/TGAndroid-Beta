package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class uj implements zj {
    public final int f28870a;
    public final TLRPC.User f28871b;

    public uj(int i10, TLRPC.User user) {
        this.f28870a = i10;
        this.f28871b = user;
    }

    @Override
    public final String run() {
        gf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f28870a) {
            case 0:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28871b.phone;
                break;
            default:
                c10 = gf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f28871b.phone;
                break;
        }
        return org.telegram.messenger.ok.h(sb2, str, c10);
    }
}
