package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f22876a;
    public final Utilities.Callback f22877b;
    public final HashMap f22878c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22876a = i10;
        this.f22877b = callback;
        this.f22878c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22876a) {
            case 0:
                this.f22877b.run(this.f22878c);
                return;
            default:
                this.f22877b.run(this.f22878c);
                return;
        }
    }
}
