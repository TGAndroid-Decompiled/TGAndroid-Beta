package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class yk implements q0.a {
    public final int f30637a;
    public final hl f30638b;

    public yk(hl hlVar, int i10) {
        this.f30637a = i10;
        this.f30638b = hlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30637a) {
            case 0:
                hl.K(this.f30638b, (IMapsProvider.IMap) obj);
                return;
            default:
                hl.R(this.f30638b, (Location) obj);
                return;
        }
    }
}
