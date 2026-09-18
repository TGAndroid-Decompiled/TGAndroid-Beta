package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22294a;
    public final Utilities.Callback f22295b;
    public final HashMap f22296c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22294a = i10;
        this.f22295b = callback;
        this.f22296c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22294a) {
            case 0:
                this.f22295b.run(this.f22296c);
                return;
            default:
                this.f22295b.run(this.f22296c);
                return;
        }
    }
}
