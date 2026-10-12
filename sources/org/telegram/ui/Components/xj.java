package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xj implements ck {
    public final int f32775a;
    public final TLRPC.User f32776b;

    public xj(int i10, TLRPC.User user) {
        this.f32775a = i10;
        this.f32776b = user;
    }

    @Override
    public final String run() {
        hf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f32775a) {
            case 0:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f32776b.phone;
                break;
            default:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f32776b.phone;
                break;
        }
        return org.telegram.messenger.am.g(sb2, str, c10);
    }
}
