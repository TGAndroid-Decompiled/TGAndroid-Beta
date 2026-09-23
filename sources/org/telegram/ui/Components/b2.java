package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22561a;
    public final Utilities.Callback f22562b;
    public final HashMap f22563c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22561a = i10;
        this.f22562b = callback;
        this.f22563c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22561a) {
            case 0:
                this.f22562b.run(this.f22563c);
                return;
            default:
                this.f22562b.run(this.f22563c);
                return;
        }
    }
}
