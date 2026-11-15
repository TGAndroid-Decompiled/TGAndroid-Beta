package org.telegram.ui.Components;

import java.util.HashMap;
public final class w1 implements Runnable {
    public final int f41212a;
    public final org.telegram.messenger.z10 f41213b;
    public final HashMap f41214c;

    public w1(org.telegram.messenger.z10 z10Var, HashMap hashMap, int i7) {
        this.f41212a = i7;
        this.f41213b = z10Var;
        this.f41214c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f41212a) {
            case 0:
                this.f41213b.a(this.f41214c);
                return;
            default:
                this.f41213b.a(this.f41214c);
                return;
        }
    }
}
