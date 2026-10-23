package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24783a;
    public final Utilities.Callback f24784b;
    public final HashMap f24785c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24783a = i10;
        this.f24784b = callback;
        this.f24785c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24783a) {
            case 0:
                this.f24784b.run(this.f24785c);
                return;
            default:
                this.f24784b.run(this.f24785c);
                return;
        }
    }
}
