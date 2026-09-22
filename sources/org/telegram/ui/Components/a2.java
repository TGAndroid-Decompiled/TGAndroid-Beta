package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22279a;
    public final Utilities.Callback f22280b;
    public final HashMap f22281c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22279a = i10;
        this.f22280b = callback;
        this.f22281c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22279a) {
            case 0:
                this.f22280b.run(this.f22281c);
                return;
            default:
                this.f22280b.run(this.f22281c);
                return;
        }
    }
}
