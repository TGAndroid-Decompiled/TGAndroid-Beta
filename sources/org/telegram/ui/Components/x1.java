package org.telegram.ui.Components;

import java.util.HashMap;
public final class x1 implements Runnable {
    public final int f40129a;
    public final org.telegram.messenger.c20 f40130b;
    public final HashMap f40131c;

    public x1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40129a = i7;
        this.f40130b = c20Var;
        this.f40131c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40129a) {
            case 0:
                this.f40130b.a(this.f40131c);
                return;
            default:
                this.f40130b.a(this.f40131c);
                return;
        }
    }
}
