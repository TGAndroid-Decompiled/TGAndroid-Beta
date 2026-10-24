package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oj implements tj {
    public final int f29304a;
    public final TLRPC.User f29305b;

    public oj(int i10, TLRPC.User user) {
        this.f29304a = i10;
        this.f29305b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29304a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29305b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29305b.phone;
                break;
        }
        return org.telegram.messenger.tl.h(sb2, str, c10);
    }
}
