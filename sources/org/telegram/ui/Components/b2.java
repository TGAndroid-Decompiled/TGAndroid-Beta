package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24536a;
    public final Utilities.Callback f24537b;
    public final HashMap f24538c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24536a = i10;
        this.f24537b = callback;
        this.f24538c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24536a) {
            case 0:
                this.f24537b.run(this.f24538c);
                return;
            default:
                this.f24537b.run(this.f24538c);
                return;
        }
    }
}
