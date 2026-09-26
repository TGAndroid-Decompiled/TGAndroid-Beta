package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22866a;
    public final Utilities.Callback f22867b;
    public final HashMap f22868c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22866a = i10;
        this.f22867b = callback;
        this.f22868c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22866a) {
            case 0:
                this.f22867b.run(this.f22868c);
                return;
            default:
                this.f22867b.run(this.f22868c);
                return;
        }
    }
}
