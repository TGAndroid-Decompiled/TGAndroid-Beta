package org.telegram.ui.Components;

import java.util.HashMap;
public final class y1 implements Runnable {
    public final int f40541a;
    public final org.telegram.messenger.c20 f40542b;
    public final HashMap f40543c;

    public y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.f40541a = i7;
        this.f40542b = c20Var;
        this.f40543c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40541a) {
            case 0:
                this.f40542b.a(this.f40543c);
                return;
            default:
                this.f40542b.a(this.f40543c);
                return;
        }
    }
}
