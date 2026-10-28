package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class hl implements q0.a {
    public final int f29011a;
    public final sl f29012b;

    public hl(sl slVar, int i10) {
        this.f29011a = i10;
        this.f29012b = slVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29011a) {
            case 0:
                sl.N(this.f29012b, (IMapsProvider.IMap) obj);
                return;
            default:
                sl.T(this.f29012b, (Location) obj);
                return;
        }
    }
}
