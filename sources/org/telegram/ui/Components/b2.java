package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24757a;
    public final Utilities.Callback f24758b;
    public final HashMap f24759c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24757a = i10;
        this.f24758b = callback;
        this.f24759c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24757a) {
            case 0:
                this.f24758b.run(this.f24759c);
                return;
            default:
                this.f24758b.run(this.f24759c);
                return;
        }
    }
}
