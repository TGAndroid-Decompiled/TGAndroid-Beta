package org.telegram.ui.Components;

import java.util.HashMap;
public final class x1 implements Runnable {
    public final int f40189a;
    public final org.telegram.messenger.u10 f40190b;
    public final HashMap f40191c;

    public x1(org.telegram.messenger.u10 u10Var, HashMap hashMap, int i3) {
        this.f40189a = i3;
        this.f40190b = u10Var;
        this.f40191c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f40189a) {
            case 0:
                this.f40190b.a(this.f40191c);
                return;
            default:
                this.f40190b.a(this.f40191c);
                return;
        }
    }
}
