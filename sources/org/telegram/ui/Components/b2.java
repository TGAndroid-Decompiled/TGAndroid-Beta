package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24540a;
    public final Utilities.Callback f24541b;
    public final HashMap f24542c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24540a = i10;
        this.f24541b = callback;
        this.f24542c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24540a) {
            case 0:
                this.f24541b.run(this.f24542c);
                return;
            default:
                this.f24541b.run(this.f24542c);
                return;
        }
    }
}
