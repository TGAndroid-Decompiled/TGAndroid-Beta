package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24808a;
    public final Utilities.Callback f24809b;
    public final HashMap f24810c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24808a = i10;
        this.f24809b = callback;
        this.f24810c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24808a) {
            case 0:
                this.f24809b.run(this.f24810c);
                return;
            default:
                this.f24809b.run(this.f24810c);
                return;
        }
    }
}
