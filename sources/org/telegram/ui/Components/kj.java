package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class kj implements qj {
    public final int f28400a;
    public final TLRPC.User f28401b;

    public kj(int i10, TLRPC.User user) {
        this.f28400a = i10;
        this.f28401b = user;
    }

    @Override
    public final String run() {
        se.b c3;
        StringBuilder sb;
        String str;
        switch (this.f28400a) {
            case 0:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f28401b.phone;
                break;
            default:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f28401b.phone;
                break;
        }
        return org.telegram.messenger.y3.j(sb, str, c3);
    }
}
