package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class dj implements jj {

    public final int f27782a;

    public final TLRPC.User f27783b;

    public dj(int i10, TLRPC.User user) {
        this.f27782a = i10;
        this.f27783b = user;
    }

    @Override
    public final String run() {
        oe.b bVarC;
        StringBuilder sb2;
        String str;
        switch (this.f27782a) {
            case 0:
                bVarC = oe.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27783b.phone;
                break;
            default:
                bVarC = oe.b.c();
                sb2 = new StringBuilder("+");
                str = this.f27783b.phone;
                break;
        }
        return org.telegram.messenger.y1.k(sb2, str, bVarC);
    }
}
