package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24848a;
    public final Utilities.Callback f24849b;
    public final HashMap f24850c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24848a = i10;
        this.f24849b = callback;
        this.f24850c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24848a) {
            case 0:
                this.f24849b.run(this.f24850c);
                return;
            default:
                this.f24849b.run(this.f24850c);
                return;
        }
    }
}
