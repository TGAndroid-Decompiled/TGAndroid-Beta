package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24779a;
    public final Utilities.Callback f24780b;
    public final HashMap f24781c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24779a = i10;
        this.f24780b = callback;
        this.f24781c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24779a) {
            case 0:
                this.f24780b.run(this.f24781c);
                return;
            default:
                this.f24780b.run(this.f24781c);
                return;
        }
    }
}
