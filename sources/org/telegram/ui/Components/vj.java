package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class vj implements ak {
    public final int f31895a;
    public final TLRPC.User f31896b;

    public vj(int i10, TLRPC.User user) {
        this.f31895a = i10;
        this.f31896b = user;
    }

    @Override
    public final String run() {
        hf.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f31895a) {
            case 0:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31896b.phone;
                break;
            default:
                c10 = hf.b.c();
                sb2 = new StringBuilder("+");
                str = this.f31896b.phone;
                break;
        }
        return org.telegram.messenger.ai.g(sb2, str, c10);
    }
}
