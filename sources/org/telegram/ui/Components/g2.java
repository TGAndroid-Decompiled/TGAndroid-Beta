package org.telegram.ui.Components;

import java.util.HashMap;
public final class g2 implements Runnable {
    public final int f35392a;
    public final org.telegram.messenger.y10 f35393b;
    public final HashMap f35394c;

    public g2(org.telegram.messenger.y10 y10Var, HashMap hashMap, int i7) {
        this.f35392a = i7;
        this.f35393b = y10Var;
        this.f35394c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f35392a) {
            case 0:
                this.f35393b.a(this.f35394c);
                return;
            default:
                this.f35393b.a(this.f35394c);
                return;
        }
    }
}
