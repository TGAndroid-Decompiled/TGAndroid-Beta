package org.telegram.ui.Components;

import java.util.HashMap;
public final class y1 implements Runnable {
    public final int f40531a;
    public final org.telegram.messenger.c20 f40532b;
    public final HashMap f40533c;

    public y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40531a = i7;
        this.f40532b = c20Var;
        this.f40533c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40531a) {
            case 0:
                this.f40532b.a(this.f40533c);
                return;
            default:
                this.f40532b.a(this.f40533c);
                return;
        }
    }
}
