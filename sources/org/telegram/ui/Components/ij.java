package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ij implements oj {
    public final int f25727a;
    public final TLRPC.User f25728b;

    public ij(int i10, TLRPC.User user) {
        this.f25727a = i10;
        this.f25728b = user;
    }

    @Override
    public final String run() {
        se.b c3;
        StringBuilder sb;
        String str;
        switch (this.f25727a) {
            case 0:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f25728b.phone;
                break;
            default:
                c3 = se.b.c();
                sb = new StringBuilder("+");
                str = this.f25728b.phone;
                break;
        }
        return org.telegram.messenger.y3.j(sb, str, c3);
    }
}
