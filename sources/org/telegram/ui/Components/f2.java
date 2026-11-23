package org.telegram.ui.Components;

import java.util.HashMap;
public final class f2 implements Runnable {
    public final int f34973a;
    public final org.telegram.messenger.w10 f34974b;
    public final HashMap f34975c;

    public f2(org.telegram.messenger.w10 w10Var, HashMap hashMap, int i7) {
        this.f34973a = i7;
        this.f34974b = w10Var;
        this.f34975c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f34973a) {
            case 0:
                this.f34974b.a(this.f34975c);
                return;
            default:
                this.f34974b.a(this.f34975c);
                return;
        }
    }
}
