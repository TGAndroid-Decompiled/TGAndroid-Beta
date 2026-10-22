package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24782a;
    public final Utilities.Callback f24783b;
    public final HashMap f24784c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24782a = i10;
        this.f24783b = callback;
        this.f24784c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24782a) {
            case 0:
                this.f24783b.run(this.f24784c);
                return;
            default:
                this.f24783b.run(this.f24784c);
                return;
        }
    }
}
