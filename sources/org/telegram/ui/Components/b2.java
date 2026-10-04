package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24761a;
    public final Utilities.Callback f24762b;
    public final HashMap f24763c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24761a = i10;
        this.f24762b = callback;
        this.f24763c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24761a) {
            case 0:
                this.f24762b.run(this.f24763c);
                return;
            default:
                this.f24762b.run(this.f24763c);
                return;
        }
    }
}
