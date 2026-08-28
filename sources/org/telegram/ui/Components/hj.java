package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hj implements nj {
    public final int f29100a;
    public final TLRPC.User f29101b;

    public hj(int i9, TLRPC.User user) {
        this.f29100a = i9;
        this.f29101b = user;
    }

    @Override
    public final String run() {
        ne.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29100a) {
            case 0:
                c10 = ne.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29101b.phone;
                break;
            default:
                c10 = ne.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29101b.phone;
                break;
        }
        return org.telegram.messenger.ll.g(sb2, str, c10);
    }
}
