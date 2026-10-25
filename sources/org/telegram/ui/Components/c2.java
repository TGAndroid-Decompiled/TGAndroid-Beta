package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class c2 implements Runnable {
    public final int f27032a;
    public final Utilities.Callback f27033b;
    public final HashMap f27034c;

    public c2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f27032a = i10;
        this.f27033b = callback;
        this.f27034c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f27032a) {
            case 0:
                this.f27033b.run(this.f27034c);
                return;
            default:
                this.f27033b.run(this.f27034c);
                return;
        }
    }
}
