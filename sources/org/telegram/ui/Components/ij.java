package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ij implements oj {
    public final int f25730a;
    public final TLRPC.User f25731b;

    public ij(int i10, TLRPC.User user) {
        this.f25730a = i10;
        this.f25731b = user;
    }

    @Override
    public final String run() {
        se.b c3;
        StringBuilder sb;
        String str;
        switch (this.f25730a) {
            case 0:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f25731b.phone;
                break;
            default:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f25731b.phone;
                break;
        }
        return org.telegram.messenger.y3.j(sb, str, c3);
    }
}
