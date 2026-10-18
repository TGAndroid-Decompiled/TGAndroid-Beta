package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class qj implements vj {
    public final int f29703a;
    public final TLRPC.User f29704b;

    public qj(int i10, TLRPC.User user) {
        this.f29703a = i10;
        this.f29704b = user;
    }

    @Override
    public final String run() {
        jf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f29703a) {
            case 0:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29704b.phone;
                break;
            default:
                c10 = jf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f29704b.phone;
                break;
        }
        return org.telegram.messenger.kk.g(sb2, str, c10);
    }
}
