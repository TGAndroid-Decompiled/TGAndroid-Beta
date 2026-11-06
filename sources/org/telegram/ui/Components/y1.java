package org.telegram.ui.Components;

import java.util.HashMap;
public final class y1 implements Runnable {
    public final int f40505a;
    public final org.telegram.messenger.c20 f40506b;
    public final HashMap f40507c;

    public y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40505a = i7;
        this.f40506b = c20Var;
        this.f40507c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40505a) {
            case 0:
                this.f40506b.a(this.f40507c);
                return;
            default:
                this.f40506b.a(this.f40507c);
                return;
        }
    }
}
