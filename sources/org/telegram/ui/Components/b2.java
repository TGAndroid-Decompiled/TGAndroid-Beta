package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24514a;
    public final Utilities.Callback f24515b;
    public final HashMap f24516c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24514a = i10;
        this.f24515b = callback;
        this.f24516c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24514a) {
            case 0:
                this.f24515b.run(this.f24516c);
                return;
            default:
                this.f24515b.run(this.f24516c);
                return;
        }
    }
}
