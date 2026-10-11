package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24780a;
    public final Utilities.Callback f24781b;
    public final HashMap f24782c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24780a = i10;
        this.f24781b = callback;
        this.f24782c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24780a) {
            case 0:
                this.f24781b.run(this.f24782c);
                return;
            default:
                this.f24781b.run(this.f24782c);
                return;
        }
    }
}
