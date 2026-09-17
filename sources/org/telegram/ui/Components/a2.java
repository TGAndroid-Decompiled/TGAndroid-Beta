package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22291a;
    public final Utilities.Callback f22292b;
    public final HashMap f22293c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22291a = i10;
        this.f22292b = callback;
        this.f22293c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22291a) {
            case 0:
                this.f22292b.run(this.f22293c);
                return;
            default:
                this.f22292b.run(this.f22293c);
                return;
        }
    }
}
