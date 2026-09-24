package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;
public final class yk implements q0.a {
    public final int f30626a;
    public final hl f30627b;

    public yk(hl hlVar, int i10) {
        this.f30626a = i10;
        this.f30627b = hlVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30626a) {
            case 0:
                hl.K(this.f30627b, (IMapsProvider.IMap) obj);
                return;
            default:
                hl.R(this.f30627b, (Location) obj);
                return;
        }
    }
}
