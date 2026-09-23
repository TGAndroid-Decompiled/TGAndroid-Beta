package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class yk implements q0.a {
    public final int f30304a;
    public final hl f30305b;

    public yk(hl hlVar, int i10) {
        this.f30304a = i10;
        this.f30305b = hlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30304a) {
            case 0:
                hl.K(this.f30305b, (IMapsProvider.IMap) obj);
                return;
            default:
                hl.R(this.f30305b, (Location) obj);
                return;
        }
    }
}
