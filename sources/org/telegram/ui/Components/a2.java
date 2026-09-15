package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22282a;
    public final Utilities.Callback f22283b;
    public final HashMap f22284c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22282a = i10;
        this.f22283b = callback;
        this.f22284c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22282a) {
            case 0:
                this.f22283b.run(this.f22284c);
                return;
            default:
                this.f22283b.run(this.f22284c);
                return;
        }
    }
}
