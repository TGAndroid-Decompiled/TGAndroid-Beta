package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xi implements cj {
    public final int f32569a;
    public final TLRPC.User f32570b;

    public xi(int i10, TLRPC.User user) {
        this.f32569a = i10;
        this.f32570b = user;
    }

    @Override
    public final String run() {
        af.b c10;
        StringBuilder sb2;
        String str;
        switch (this.f32569a) {
            case 0:
                c10 = af.b.c();
                sb2 = new StringBuilder("+");
                str = this.f32570b.phone;
                break;
            default:
                c10 = af.b.c();
                sb2 = new StringBuilder("+");
                str = this.f32570b.phone;
                break;
        }
        return org.telegram.messenger.m5.h(sb2, str, c10);
    }
}
