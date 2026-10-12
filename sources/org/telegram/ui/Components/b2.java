package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24548a;
    public final Utilities.Callback f24549b;
    public final HashMap f24550c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24548a = i10;
        this.f24549b = callback;
        this.f24550c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24548a) {
            case 0:
                this.f24549b.run(this.f24550c);
                return;
            default:
                this.f24549b.run(this.f24550c);
                return;
        }
    }
}
