package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class hl implements q0.a {
    public final int f26972a;
    public final rl f26973b;

    public hl(rl rlVar, int i10) {
        this.f26972a = i10;
        this.f26973b = rlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f26972a) {
            case 0:
                rl.N(this.f26973b, (IMapsProvider.IMap) obj);
                return;
            default:
                rl.T(this.f26973b, (Location) obj);
                return;
        }
    }
}
