package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22851a;
    public final Utilities.Callback f22852b;
    public final HashMap f22853c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22851a = i10;
        this.f22852b = callback;
        this.f22853c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22851a) {
            case 0:
                this.f22852b.run(this.f22853c);
                return;
            default:
                this.f22852b.run(this.f22853c);
                return;
        }
    }
}
