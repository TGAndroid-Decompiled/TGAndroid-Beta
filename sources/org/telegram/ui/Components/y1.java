package org.telegram.ui.Components;

import java.util.HashMap;
public final class y1 implements Runnable {
    public final int f40486a;
    public final org.telegram.messenger.c20 f40487b;
    public final HashMap f40488c;

    public y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40486a = i7;
        this.f40487b = c20Var;
        this.f40488c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40486a) {
            case 0:
                this.f40487b.a(this.f40488c);
                return;
            default:
                this.f40487b.a(this.f40488c);
                return;
        }
    }
}
