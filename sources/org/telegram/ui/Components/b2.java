package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24756a;
    public final Utilities.Callback f24757b;
    public final HashMap f24758c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24756a = i10;
        this.f24757b = callback;
        this.f24758c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24756a) {
            case 0:
                this.f24757b.run(this.f24758c);
                return;
            default:
                this.f24757b.run(this.f24758c);
                return;
        }
    }
}
