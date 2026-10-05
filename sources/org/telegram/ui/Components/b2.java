package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24806a;
    public final Utilities.Callback f24807b;
    public final HashMap f24808c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24806a = i10;
        this.f24807b = callback;
        this.f24808c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24806a) {
            case 0:
                this.f24807b.run(this.f24808c);
                return;
            default:
                this.f24807b.run(this.f24808c);
                return;
        }
    }
}
