package org.telegram.ui.Components;

import java.util.HashMap;
public final class g2 implements Runnable {
    public final int f35373a;
    public final org.telegram.messenger.x10 f35374b;
    public final HashMap f35375c;

    public g2(org.telegram.messenger.x10 x10Var, HashMap hashMap, int i7) {
        this.f35373a = i7;
        this.f35374b = x10Var;
        this.f35375c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f35373a) {
            case 0:
                this.f35374b.a(this.f35375c);
                return;
            default:
                this.f35374b.a(this.f35375c);
                return;
        }
    }
}
