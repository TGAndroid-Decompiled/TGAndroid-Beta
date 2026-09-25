package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22852a;
    public final Utilities.Callback f22853b;
    public final HashMap f22854c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22852a = i10;
        this.f22853b = callback;
        this.f22854c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22852a) {
            case 0:
                this.f22853b.run(this.f22854c);
                return;
            default:
                this.f22853b.run(this.f22854c);
                return;
        }
    }
}
