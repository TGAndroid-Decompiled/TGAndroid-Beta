package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class c2 implements Runnable {
    public final int f27034a;
    public final Utilities.Callback f27035b;
    public final HashMap f27036c;

    public c2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f27034a = i10;
        this.f27035b = callback;
        this.f27036c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f27034a) {
            case 0:
                this.f27035b.run(this.f27036c);
                return;
            default:
                this.f27035b.run(this.f27036c);
                return;
        }
    }
}
