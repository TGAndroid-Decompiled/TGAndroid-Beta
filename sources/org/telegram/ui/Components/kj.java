package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kj implements qj {
    public final int f28422a;
    public final TLRPC.User f28423b;

    public kj(int i10, TLRPC.User user) {
        this.f28422a = i10;
        this.f28423b = user;
    }

    @Override
    public final String run() {
        se.b c3;
        StringBuilder sb;
        String str;
        switch (this.f28422a) {
            case 0:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f28423b.phone;
                break;
            default:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f28423b.phone;
                break;
        }
        return org.telegram.messenger.y3.j(sb, str, c3);
    }
}
