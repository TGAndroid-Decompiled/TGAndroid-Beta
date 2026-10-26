package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class hl implements q0.a {
    public final int f29007a;
    public final sl f29008b;

    public hl(sl slVar, int i10) {
        this.f29007a = i10;
        this.f29008b = slVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29007a) {
            case 0:
                sl.N(this.f29008b, (IMapsProvider.IMap) obj);
                return;
            default:
                sl.T(this.f29008b, (Location) obj);
                return;
        }
    }
}
