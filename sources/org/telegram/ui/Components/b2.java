package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22843a;
    public final Utilities.Callback f22844b;
    public final HashMap f22845c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22843a = i10;
        this.f22844b = callback;
        this.f22845c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22843a) {
            case 0:
                this.f22844b.run(this.f22845c);
                return;
            default:
                this.f22844b.run(this.f22845c);
                return;
        }
    }
}
