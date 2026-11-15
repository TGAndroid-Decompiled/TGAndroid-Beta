package org.telegram.ui.Components;

import java.util.HashMap;
public final class w1 implements Runnable {
    public final int f41215a;
    public final org.telegram.messenger.z10 f41216b;
    public final HashMap f41217c;

    public w1(org.telegram.messenger.z10 z10Var, HashMap hashMap, int i7) {
        this.f41215a = i7;
        this.f41216b = z10Var;
        this.f41217c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f41215a) {
            case 0:
                this.f41216b.a(this.f41217c);
                return;
            default:
                this.f41216b.a(this.f41217c);
                return;
        }
    }
}
