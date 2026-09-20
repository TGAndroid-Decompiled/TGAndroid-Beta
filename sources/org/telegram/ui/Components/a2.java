package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22504a;
    public final Utilities.Callback f22505b;
    public final HashMap f22506c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22504a = i10;
        this.f22505b = callback;
        this.f22506c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22504a) {
            case 0:
                this.f22505b.run(this.f22506c);
                return;
            default:
                this.f22505b.run(this.f22506c);
                return;
        }
    }
}
