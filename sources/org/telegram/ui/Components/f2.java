package org.telegram.ui.Components;

import java.util.HashMap;
public final class f2 implements Runnable {
    public final int f34900a;
    public final org.telegram.messenger.x10 f34901b;
    public final HashMap f34902c;

    public f2(org.telegram.messenger.x10 x10Var, HashMap hashMap, int i7) {
        this.f34900a = i7;
        this.f34901b = x10Var;
        this.f34902c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f34900a) {
            case 0:
                this.f34901b.a(this.f34902c);
                return;
            default:
                this.f34901b.a(this.f34902c);
                return;
        }
    }
}
