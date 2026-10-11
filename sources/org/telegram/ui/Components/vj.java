package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vj implements ak {
    public final int f31823a;
    public final TLRPC.User f31824b;

    public vj(int i10, TLRPC.User user) {
        this.f31823a = i10;
        this.f31824b = user;
    }

    @Override
    public final String run() {
        hf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31823a) {
            case 0:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31824b.phone;
                break;
            default:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31824b.phone;
                break;
        }
        return org.telegram.messenger.ai.g(sb2, str, c10);
    }
}
