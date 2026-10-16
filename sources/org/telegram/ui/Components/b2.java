package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f23362a;
    public final Utilities.Callback f23363b;
    public final HashMap f23364c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f23362a = i10;
        this.f23363b = callback;
        this.f23364c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f23362a) {
            case 0:
                this.f23363b.run(this.f23364c);
                return;
            default:
                this.f23363b.run(this.f23364c);
                return;
        }
    }
}
