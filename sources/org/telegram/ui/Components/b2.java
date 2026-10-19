package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24775a;
    public final Utilities.Callback f24776b;
    public final HashMap f24777c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24775a = i10;
        this.f24776b = callback;
        this.f24777c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24775a) {
            case 0:
                this.f24776b.run(this.f24777c);
                return;
            default:
                this.f24776b.run(this.f24777c);
                return;
        }
    }
}
