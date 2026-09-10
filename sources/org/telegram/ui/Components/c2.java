package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class c2 implements Runnable {
    public final int f21970a;
    public final Utilities.Callback f21971b;
    public final HashMap f21972c;

    public c2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f21970a = i10;
        this.f21971b = callback;
        this.f21972c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f21970a) {
            case 0:
                this.f21971b.run(this.f21972c);
                return;
            default:
                this.f21971b.run(this.f21972c);
                return;
        }
    }
}
