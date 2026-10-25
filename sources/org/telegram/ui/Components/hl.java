package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class hl implements q0.a {
    public final int f29005a;
    public final sl f29006b;

    public hl(sl slVar, int i10) {
        this.f29005a = i10;
        this.f29006b = slVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29005a) {
            case 0:
                sl.N(this.f29006b, (IMapsProvider.IMap) obj);
                return;
            default:
                sl.T(this.f29006b, (Location) obj);
                return;
        }
    }
}
