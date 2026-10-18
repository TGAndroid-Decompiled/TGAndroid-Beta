package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24777a;
    public final Utilities.Callback f24778b;
    public final HashMap f24779c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24777a = i10;
        this.f24778b = callback;
        this.f24779c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24777a) {
            case 0:
                this.f24778b.run(this.f24779c);
                return;
            default:
                this.f24778b.run(this.f24779c);
                return;
        }
    }
}
