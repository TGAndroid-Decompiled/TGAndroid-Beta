package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22839a;
    public final Utilities.Callback f22840b;
    public final HashMap f22841c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22839a = i10;
        this.f22840b = callback;
        this.f22841c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22839a) {
            case 0:
                this.f22840b.run(this.f22841c);
                return;
            default:
                this.f22840b.run(this.f22841c);
                return;
        }
    }
}
