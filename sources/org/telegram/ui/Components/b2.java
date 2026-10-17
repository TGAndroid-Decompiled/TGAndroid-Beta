package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24770a;
    public final Utilities.Callback f24771b;
    public final HashMap f24772c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24770a = i10;
        this.f24771b = callback;
        this.f24772c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24770a) {
            case 0:
                this.f24771b.run(this.f24772c);
                return;
            default:
                this.f24771b.run(this.f24772c);
                return;
        }
    }
}
