package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22840a;
    public final Utilities.Callback f22841b;
    public final HashMap f22842c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22840a = i10;
        this.f22841b = callback;
        this.f22842c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22840a) {
            case 0:
                this.f22841b.run(this.f22842c);
                return;
            default:
                this.f22841b.run(this.f22842c);
                return;
        }
    }
}
