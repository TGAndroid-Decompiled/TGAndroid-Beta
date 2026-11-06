package org.telegram.ui.Components;

import java.util.HashMap;
public final class y1 implements Runnable {
    public final int f40460a;
    public final org.telegram.messenger.c20 f40461b;
    public final HashMap f40462c;

    public y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40460a = i7;
        this.f40461b = c20Var;
        this.f40462c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40460a) {
            case 0:
                this.f40461b.a(this.f40462c);
                return;
            default:
                this.f40461b.a(this.f40462c);
                return;
        }
    }
}
