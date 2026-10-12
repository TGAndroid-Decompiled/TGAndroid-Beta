package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class b2 implements Runnable {
    public final int f23673a;
    public final Utilities.Callback f23674b;
    public final HashMap f23675c;

    public b2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f23673a = i10;
        this.f23674b = callback;
        this.f23675c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f23673a) {
            case 0:
                this.f23674b.run(this.f23675c);
                return;
            default:
                this.f23674b.run(this.f23675c);
                return;
        }
    }
}
