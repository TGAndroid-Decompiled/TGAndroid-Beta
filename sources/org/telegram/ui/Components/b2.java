package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22779a;
    public final Utilities.Callback f22780b;
    public final HashMap f22781c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22779a = i10;
        this.f22780b = callback;
        this.f22781c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22779a) {
            case 0:
                this.f22780b.run(this.f22781c);
                return;
            default:
                this.f22780b.run(this.f22781c);
                return;
        }
    }
}
