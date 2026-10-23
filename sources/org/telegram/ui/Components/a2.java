package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f24604a;
    public final Utilities.Callback f24605b;
    public final HashMap f24606c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24604a = i10;
        this.f24605b = callback;
        this.f24606c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24604a) {
            case 0:
                this.f24605b.run(this.f24606c);
                return;
            default:
                this.f24605b.run(this.f24606c);
                return;
        }
    }
}
