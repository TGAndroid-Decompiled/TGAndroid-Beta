package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24850a;
    public final Utilities.Callback f24851b;
    public final HashMap f24852c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24850a = i10;
        this.f24851b = callback;
        this.f24852c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24850a) {
            case 0:
                this.f24851b.run(this.f24852c);
                return;
            default:
                this.f24851b.run(this.f24852c);
                return;
        }
    }
}
