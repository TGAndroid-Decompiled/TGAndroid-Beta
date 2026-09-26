package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class yk implements q0.a {
    public final int f30636a;
    public final hl f30637b;

    public yk(hl hlVar, int i10) {
        this.f30636a = i10;
        this.f30637b = hlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30636a) {
            case 0:
                hl.K(this.f30637b, (IMapsProvider.IMap) obj);
                return;
            default:
                hl.R(this.f30637b, (Location) obj);
                return;
        }
    }
}
