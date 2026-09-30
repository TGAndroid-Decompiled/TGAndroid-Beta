package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22827a;
    public final Utilities.Callback f22828b;
    public final HashMap f22829c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22827a = i10;
        this.f22828b = callback;
        this.f22829c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22827a) {
            case 0:
                this.f22828b.run(this.f22829c);
                return;
            default:
                this.f22828b.run(this.f22829c);
                return;
        }
    }
}
