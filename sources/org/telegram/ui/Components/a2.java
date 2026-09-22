package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22519a;
    public final Utilities.Callback f22520b;
    public final HashMap f22521c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22519a = i10;
        this.f22520b = callback;
        this.f22521c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22519a) {
            case 0:
                this.f22520b.run(this.f22521c);
                return;
            default:
                this.f22520b.run(this.f22521c);
                return;
        }
    }
}
