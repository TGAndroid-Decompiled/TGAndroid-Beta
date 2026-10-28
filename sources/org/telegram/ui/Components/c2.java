package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class c2 implements Runnable {
    public final int f27030a;
    public final Utilities.Callback f27031b;
    public final HashMap f27032c;

    public c2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f27030a = i10;
        this.f27031b = callback;
        this.f27032c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f27030a) {
            case 0:
                this.f27031b.run(this.f27032c);
                return;
            default:
                this.f27031b.run(this.f27032c);
                return;
        }
    }
}
