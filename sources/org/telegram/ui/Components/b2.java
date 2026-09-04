package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24513a;
    public final Utilities.Callback f24514b;
    public final HashMap f24515c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24513a = i10;
        this.f24514b = callback;
        this.f24515c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24513a) {
            case 0:
                this.f24514b.run(this.f24515c);
                return;
            default:
                this.f24514b.run(this.f24515c);
                return;
        }
    }
}
