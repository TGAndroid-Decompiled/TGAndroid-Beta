package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f24541a;
    public final Utilities.Callback f24542b;
    public final HashMap f24543c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f24541a = i10;
        this.f24542b = callback;
        this.f24543c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f24541a) {
            case 0:
                this.f24542b.run(this.f24543c);
                return;
            default:
                this.f24542b.run(this.f24543c);
                return;
        }
    }
}
