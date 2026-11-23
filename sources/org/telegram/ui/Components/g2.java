package org.telegram.ui.Components;

import java.util.HashMap;
public final class g2 implements Runnable {
    public final int f35354a;
    public final org.telegram.messenger.y10 f35355b;
    public final HashMap f35356c;

    public g2(org.telegram.messenger.y10 y10Var, HashMap hashMap, int i7) {
        this.f35354a = i7;
        this.f35355b = y10Var;
        this.f35356c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f35354a) {
            case 0:
                this.f35355b.a(this.f35356c);
                return;
            default:
                this.f35355b.a(this.f35356c);
                return;
        }
    }
}
