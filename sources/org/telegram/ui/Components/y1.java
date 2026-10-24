package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class y1 implements Runnable {
    public final int f32777a;
    public final Utilities.Callback f32778b;
    public final HashMap f32779c;

    public y1(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f32777a = i10;
        this.f32778b = callback;
        this.f32779c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f32777a) {
            case 0:
                this.f32778b.run(this.f32779c);
                return;
            default:
                this.f32778b.run(this.f32779c);
                return;
        }
    }
}
